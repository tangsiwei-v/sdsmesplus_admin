package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.common.UUIDUtil;
import com.uspring.sdsmesplus.dao.SafelunchOrderDao;
import com.uspring.sdsmesplus.dao.generate.SafelunchOrderPODao;
import com.uspring.sdsmesplus.dao.generate.SafelunchProductLogPODao;
import com.uspring.sdsmesplus.dao.generate.SafelunchWorkLinePODao;
import com.uspring.sdsmesplus.wms.entity.Package;
import com.uspring.sdsmesplus.entity.po.SafelunchOrderPO;
import com.uspring.sdsmesplus.entity.po.SafelunchOrderPOExample;
import com.uspring.sdsmesplus.entity.po.SafelunchProductLogPO;
import com.uspring.sdsmesplus.entity.po.SafelunchProductLogPOExample;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePOExample;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePOExample.Criteria;
import com.uspring.sdsmesplus.entity.vo.SafeLunchOrderVO;
import com.uspring.sdsmesplus.enums.SafeLunchResult;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mq.PrinterService;
import com.uspring.sdsmesplus.service.PackBoxService;
import com.uspring.sdsmesplus.service.SafelunchService;
import com.uspring.sdsmesplus.wms.WMSService;

@Service
public class SafelunchServiceImpl implements SafelunchService {
	@Autowired
	private SafelunchOrderDao safelunchOrderDao;
	@Autowired
	private SafelunchOrderPODao safelunchOrderPODao;
	@Autowired
	private SafelunchProductLogPODao safelunchProductLogPODao;
	@Autowired
	private PrinterService printerService;
	@Autowired
	private WMSService wMSService;
	@Autowired
	private PackBoxService packBoxService;
	@Autowired
	private SafelunchWorkLinePODao safelunchWorkLinePODao;

	// 结果暂存
	public void save(SafeLunchOrderVO safeLunchOrderVO) {
		// 根据工单号查询该箱在safelunch工单表中是否有未提交的工单；有则覆盖记录（包括每个总成的检查记录）
		List<SafelunchOrderPO> list = new ArrayList<SafelunchOrderPO>();
		if (null != safeLunchOrderVO.getSafelunchOrder()) {
			SafelunchOrderPOExample safelunchOrderPOExample = new SafelunchOrderPOExample();
			safelunchOrderPOExample.createCriteria().andSafelunchOrderEqualTo(safeLunchOrderVO.getSafelunchOrder());
			list = safelunchOrderPODao.selectByExample(safelunchOrderPOExample);
		}

		if (list.size() > 0) {
			SafelunchOrderPO safelunchOrderPOs = list.get(0);
			safelunchOrderPODao.updateByPrimaryKeySelective(safeLunchOrderVO);
			// VO中List的保存
			SafelunchProductLogPOExample safelunchProductLogPOExample = new SafelunchProductLogPOExample();
			safelunchProductLogPOExample.createCriteria()
					.andSafelunchOrderEqualTo(safelunchOrderPOs.getSafelunchOrder());
			safelunchProductLogPODao.deleteByExample(safelunchProductLogPOExample);

			List<SafelunchProductLogPO> safelunchProductLogPOs = safeLunchOrderVO.getSafelunchProductLogPOs();
			for (SafelunchProductLogPO safelunchProductLogPO : safelunchProductLogPOs) {
				safelunchProductLogPO.setResId(null);
				safelunchProductLogPO.setSafelunchOrder(safeLunchOrderVO.getSafelunchOrder());
				safelunchProductLogPODao.insertSelective(safelunchProductLogPO);
			}
		} else {
			// 2、如果没有则插入该记录，包括工单记录和每个总成的检验记录，工单状态为未提交；
			// 设置工单号
			safeLunchOrderVO.setSafelunchOrder(UUIDUtil.getUUID());
			safeLunchOrderVO.setUpdateTime(new Date());
			// VO中List的保存
			List<SafelunchProductLogPO> safelunchProductLogPOs = safeLunchOrderVO.getSafelunchProductLogPOs();
			for (SafelunchProductLogPO safelunchProductLogPO : safelunchProductLogPOs) {
				safelunchProductLogPO.setSafelunchOrder(safeLunchOrderVO.getSafelunchOrder());
				safelunchProductLogPO.setUpdateTime(new Date());
				safelunchProductLogPO.setResId(null);
				safelunchProductLogPODao.insertSelective(safelunchProductLogPO);
			}
			safelunchOrderPODao.insertSelective(safeLunchOrderVO);
		}
	}

	// 结果提交
	public SafeLunchOrderVO commit(SafeLunchOrderVO safeLunchOrderVO) throws Exception {
		// 检查该工单记录是否全部检查通过,直接跳到第三步
		if (safeLunchOrderVO.getIsPass() != true) {
			// 如果存在不合格品,则调用WMS拆包接口，进行拆包，记录新箱合格证
			List<Package> queryMaterialBoxInfo = packBoxService.queryMaterialBoxInfo(safeLunchOrderVO.getBoxBarcode());
			Package insertPackage = queryMaterialBoxInfo.get(0);

			List<Package> list = wMSService.packageSplit(insertPackage, safeLunchOrderVO.getFailedCount());

			if (list.size() < 2)
				throw new ServiceException("未从wms获取任何数据");

			Package badpackage = list.get(0);
			Package goodpackage = list.get(1);
			
			// SafeLunch判断
			wMSService.safelunchJudge(badpackage, SafeLunchResult.FAIL);
			wMSService.safelunchJudge(goodpackage, SafeLunchResult.PASS);

			// 放入通过合格证号，不通过合格证号 set到vo中
			safeLunchOrderVO.setBoxPass(goodpackage.getBoxBarcode());
			safeLunchOrderVO.setBoxFailed(badpackage.getBoxBarcode());
			// TODO line_id 获取产线id
			printerService.printMatBoxBarcode(goodpackage, 0);
			printerService.printMatBoxBarcode(badpackage, 0);
		}

		// 执行结果暂存逻辑，工单状态设置为已提交，记录检验人和检验时间；
		safeLunchOrderVO.setIsCommit(true);
		save(safeLunchOrderVO);
		return safeLunchOrderVO;
	}

	// 箱合格证补打
	public void reprint(String old_box_barcode, String new_box_barcode, String box_type) {
		// 调用HU信息,打印
		List<Package> queryHuInfo = wMSService.queryHuInfo(new_box_barcode);
		if (queryHuInfo.size() > 0) {
			Package pkg = queryHuInfo.get(0);
			// TODO lind_id 产线id 发送打印消息
			printerService.printMatBoxBarcode(pkg, 0);
		} else {
			throw new ServiceException("暂无数据");
		}

	}

	// SafeLunch扫描确认
	public void confirm(String safelunch_order) {
		// 1、按safelunch工单号查询safelunch工单
		SafelunchOrderPOExample safeLunchOrderPO = new SafelunchOrderPOExample();
		safeLunchOrderPO.createCriteria().andSafelunchOrderEqualTo(safelunch_order);
		List<SafelunchOrderPO> list = safelunchOrderPODao.selectByExample(safeLunchOrderPO);
		// 2、修改工单“是否已扫描确认”字段为true，记录扫描确认时间
		if (list.size() > 0) {
			SafelunchOrderPO safelunchOrder = list.get(0);
			if (safelunchOrder.getBoxConfirmed() != true) {
				safelunchOrder.setBoxConfirmed(true);
				safelunchOrder.setUpdateTime(new Date());
				// 3、将修改存入数据库
				safelunchOrderPODao.updateByPrimaryKeySelective(safelunchOrder);
			} else {
				throw new ServiceException("已扫描确认");
			}
		} else {
			throw new ServiceException("暂无数据");
		}
	}

	// SafeLunch查询
	public PageInfo<SafeLunchOrderVO> queryOrder(Boolean isCommit, Integer saflineId, Boolean boxConfirmed, String boxBarcode,
			String start_time, String end_time, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SafeLunchOrderVO> list = safelunchOrderDao.queryOrder(isCommit, saflineId, boxConfirmed, boxBarcode, start_time,
				end_time, page_size, page_num);
		PageInfo<SafeLunchOrderVO> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	// SafeLunch产线主数据
	public PageInfo<SafelunchWorkLinePO> queryWorkLine(Integer fcId, Integer page_size, Integer page_num) {
		SafelunchWorkLinePOExample safelunchWorkLinePOExample = new SafelunchWorkLinePOExample();
		Criteria createCriteria = safelunchWorkLinePOExample.createCriteria();
		if(fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SafelunchWorkLinePO> safelunchWorkLines = safelunchWorkLinePODao.selectByExample(safelunchWorkLinePOExample);
		PageInfo<SafelunchWorkLinePO> pageInfo = new PageInfo<SafelunchWorkLinePO>(safelunchWorkLines);
		return pageInfo;
	}

	//添加SafeLunch产线主数据
	public void insertSafeLunch(SafelunchWorkLinePO safelunchWorkLinePO) {
		safelunchWorkLinePODao.insertSelective(safelunchWorkLinePO);
	}

	//修改SafeLunch产线主数据
	public void updateSafeLunch(SafelunchWorkLinePO safelunchWorkLinePO) {
		safelunchWorkLinePODao.updateByPrimaryKey(safelunchWorkLinePO);
	}

	//删除SafeLunch产线主数据
	public void deleteSafeLunch(Integer saflineId) {
		safelunchWorkLinePODao.deleteByPrimaryKey(saflineId);
	}

}
