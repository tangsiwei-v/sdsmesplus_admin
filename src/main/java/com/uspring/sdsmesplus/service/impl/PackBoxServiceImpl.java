package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.BoxInfoDao;
import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.generate.BoxInfoPODao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBatchLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBoxLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdDeviceStockPODao;
import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample.Criteria;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPOExample;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.vo.BoxInfoVO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.WorkOrderStatus;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.PackBoxService;

@Service
public class PackBoxServiceImpl implements PackBoxService {
	@Autowired
	private PlanOrderPODao planOrderPODao;

	@Autowired
	private PlanOrderDao planOrderDao;

	@Autowired
	private BoxInfoPODao boxInfoPODao;

	@Autowired
	private ProdDeviceStockPODao prodDeviceStockPODao;

	@Autowired
	private ProdBoxLogPODao prodBoxLogPODao;

	@Autowired
	private PlanOpBomDao planOpBomDao;

	@Autowired
	private ProdBoxLogDao prodBoxLogDao;

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductDao;

	@Autowired
	ProdBatchLogPODao prodBatchLogPODao;

	@Autowired
	private BoxInfoDao boxInfoDao;

	// 请求箱合格证
	public ProdBoxLogPO requestBoxCode(String order_code, Integer boxQuan) throws Exception {
		// 查询工单
		PlanOrderPOExample orderExample = new PlanOrderPOExample();
		orderExample.createCriteria().andPoCodeEqualTo(order_code);
		PlanOrderPO order = planOrderPODao.selectByExample(orderExample).get(0);

		// 判断订单状态是否为执行状态
		//
		if (!(order.getPoStatus().equals("Executing")))
			throw new ServiceException("冻结工单不能装箱");

		// 判断数量是否少于等于满箱状态
		BoxInfoPOExample boxExample = new BoxInfoPOExample();
		boxExample.createCriteria().andProdCodeEqualTo(order.getProdCode())
				.andCustomerCodeEqualTo(order.getCustomerCode());
		BoxInfoPO boxInfoPo = boxInfoPODao.selectByExample(boxExample).get(0);
		int count = boxInfoPo.getBifCount();
		if (count < boxQuan)
			throw new ServiceException("装箱数量不能大于额定数量");

		// 1、请求箱体编号
		String boxCodeNew = "";
		try {
			//boxCodeNew = codePackageService.creatHuCode(HuType.CK, order.getFcCode());
		} catch (Exception e) {
			throw new ServiceException("箱合格证获取失败，请联系条码系统管理员");
		}

		// 2、创建箱体
		ProdBoxLogPO box = new ProdBoxLogPO();
		box.setPoCode(order.getPoCode());
		box.setIsFeeded(false);
		box.setBoxBarcode(boxCodeNew);
		box.setBoxQuan(boxQuan);
		box.setCreateTime(new Date());
		box.setCustomerCode(order.getPoCustMatcode());
		box.setProdCode(order.getProdCode());
		box.setLineId(order.getLineId());
		box.setIsWip(false);

		return box;
	}

	// 下线装箱
	@Override
	public void createMachBox(String order_code, ProdBoxLogPO boxLog, Boolean matSubstract) throws Exception {
		// 查询工单
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order_code", order_code);
		List<PlanOrderVO> planvos = planOrderDao.queryPlanVO(map);
		PlanOrderVO order = planvos.get(0);

		// 判断订单状态是否为执行状态
		if (!order.getPoStatus().equals(WorkOrderStatus.Executing.getCode()))
			throw new ServiceException("冻结工单不能装箱");
		}

	@Async
	@Override
	public void materialCallCheck(String orderCode) throws Exception {

		// 4.4扣减线边库存，如果线边库存信息过低触发物料拉动（针对非总成线）
		PlanOrderVO planOrder = planOrderDao.findPlanVOByOrderCode(orderCode);
		// 查询实际产量
		ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
		prodFinishedProductPOExample.createCriteria().andPoCodeEqualTo(orderCode);
		List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao
				.selectByExample(prodFinishedProductPOExample);
		int realProdCount = prodFinishedProductPOS.size();

		// 如果产品为0，则查询装箱记录总数
		if (realProdCount == 0) {
			realProdCount = prodBoxLogDao.quryProdCounts(orderCode);
		}

		// 查询工单BOM
		List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(orderCode);
	}

	// 根据多条件查询状态
	public PageInfo<BoxInfoPO> searchBoxInfo(Map<String, Object> map) throws Exception {
		// 默认分页
		int pageNum = 1, pageSize = 10;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date utilDate = null;
		PageHelper.startPage(pageNum, pageSize);
		BoxInfoPOExample boxInfoPOExample = new BoxInfoPOExample();
		Criteria a = boxInfoPOExample.createCriteria();
		if (map.containsKey("prod_code"))
			a.andProdCodeEqualTo(map.get("prod_code").toString());
		if (map.containsKey("start_time")) {
			utilDate = sdf.parse(map.get("start_time").toString());
			a.andCreateTimeLessThan(utilDate);
		}
		if (map.containsKey("end_time")) {
			sdf.parse(map.get("end_time").toString());
			a.andCreateTimeGreaterThan(utilDate);
		}
		List<BoxInfoPO> boxInPOs = boxInfoPODao.selectByExample(boxInfoPOExample);
		PageInfo<BoxInfoPO> pageInfo = new PageInfo<BoxInfoPO>(boxInPOs);
		return pageInfo;

	}

	// 装箱数据
	@Override
	public PageInfo<ProdBoxLogPO> searchBoxLog(Map<String, Object> map) throws Exception {
		// 默认分页
		int pageNum = 1, pageSize = 10;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date utilDate = null;

		ProdBoxLogPOExample prodBoxLogPOExample = new ProdBoxLogPOExample();
		com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample.Criteria a = prodBoxLogPOExample.createCriteria();
		if (map.containsKey("prod_code"))
			a.andProdCodeEqualTo(map.get("prod_code").toString());
		if (map.containsKey("order_code"))
			a.andPoCodeEqualTo(map.get("order_code").toString());
		if (map.containsKey("line_id"))
			a.andLineIdEqualTo(Integer.valueOf(map.get("line_id").toString()));

		if (map.containsKey("dev_code"))
			a.andOpDeviceEqualTo(map.get("dev_code").toString());

		if (map.containsKey("is_wip"))
			a.andIsWipEqualTo(Boolean.valueOf(map.get("is_wip").toString()));

		if (map.containsKey("start_time")) {
			utilDate = sdf.parse(map.get("start_time").toString());

			a.andCreateTimeLessThan(utilDate);
		}
		if (map.containsKey("end_time")) {
			sdf.parse(map.get("end_time").toString());
			a.andCreateTimeGreaterThan(utilDate);

		}
		PageHelper.startPage(pageNum, pageSize);
		prodBoxLogPOExample.setOrderByClause("create_time desc");
		List<ProdBoxLogPO> boxInPOs = prodBoxLogPODao.selectByExample(prodBoxLogPOExample);
		PageInfo<ProdBoxLogPO> pageInfo = new PageInfo<ProdBoxLogPO>(boxInPOs);
		return pageInfo;
	}

	// 过程装箱（过程码）
	@Override
	public void wipBoxInfo(String dev_code, ProdBoxLogPO boxLog) throws Exception {
		// 1、在数据库装箱记录表中存入装箱信息；
		boxLog.setIsWip(true);
		boxLog.setOpDevice(dev_code);
		prodBoxLogPODao.insertSelective(boxLog);

		// 2、扣减设备线上库存，设备库存表
		removeLineDecMaterial(boxLog, dev_code);

	}

	// 扣减设备线上物料
	private void removeLineDecMaterial(ProdBoxLogPO boxLog, String devCode) throws Exception {
		
	}

	// 箱合格证补打
	public void reprint(String order_code, ProdBoxLogPO boxLog) {

	}

	// 请求过程码
	public ProdBoxLogPO request(String dev_code, Integer boxQuan, String glevel, String furnace_no) throws Exception {
		// 1、查询设备线上库存，确认当前生产的工单；
		ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
		prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(dev_code).andIsCleanedEqualTo(false);
		List<ProdDeviceStockPO> prodDeviceStockPOs = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);
		if (prodDeviceStockPOs.size() == 0) {
			throw new ServiceException("当前设备无工单");
		}
		String poCode = prodDeviceStockPOs.get(0).getPoCode();

		// 2、检查设备线上库存是否满足扣料；
		judgeCount(poCode, boxQuan, dev_code);

		// 3、系统生产过程码编号，组装BoxLog对象；
		//String barcode = HuType.WIP.toString() + UUIDUtil.getUUID();// 过程码
		ProdBoxLogPO boxLog = new ProdBoxLogPO();

		//boxLog.setBoxBarcode(barcode);
		boxLog.setBoxQuan(Integer.valueOf(prodDeviceStockPOs.get(0).getBoxQuanLeft().toString()));
		boxLog.setCreateTime(new Date());
		boxLog.setIsFeeded(false);
		boxLog.setIsWip(true);
		boxLog.setPoCode(poCode);
		boxLog.setCreateTime(new Date());
		boxLog.setProdBatchCode(prodDeviceStockPOs.get(0).getMatBatchNo());
		boxLog.setProdFurnaceNo(prodDeviceStockPOs.get(0).getMatFurnaceNo());
		boxLog.setProdGlevel(prodDeviceStockPOs.get(0).getMatGlevel());
		boxLog.setProdName(prodDeviceStockPOs.get(0).getMatName());
		boxLog.setProdTuhao(prodDeviceStockPOs.get(0).getMatTuhao());

		// 5、向前台返回箱体信息。
		return boxLog;
	}

	// 2、检查设备线上库存是否满足扣料；
	private void judgeCount(String poCode, Integer boxQuan, String devCode) throws Exception {
		
	}

	@Override
	public BoxInfoPO queryboxLog(String prod_code, String customer_code, Integer fc_id) {

		BoxInfoPOExample boxinfo = new BoxInfoPOExample();
		Criteria createCriteria = boxinfo.createCriteria();
		createCriteria.andProdCodeEqualTo(prod_code).andCustomerCodeEqualTo(customer_code).andFcIdEqualTo(fc_id);
		List<BoxInfoPO> selectByExample = boxInfoPODao.selectByExample(boxinfo);
		return selectByExample.get(0);
	}

	// 添加装箱数主数据
	public void insertBoxInfo(BoxInfoPO boxInfo) {
		boxInfo.setBifId(null);
		List<BoxInfoPO> repeat = boxInfoDao.repeat(boxInfo.getFcId(), boxInfo.getProdCode(), boxInfo.getCustomerCode());
		if (repeat.size() > 0)
			throw new ServiceException("装箱主数据已存在！");
		boxInfoDao.insertSelective(boxInfo);
	}

	// 修改装箱数主数据
	public void updateBoxInfo(BoxInfoPO boxInfo) {
		boxInfoDao.updateByPrimaryKey(boxInfo);
	}

	// 查询额定装箱数主数据
	public PageInfo<BoxInfoVO> standard(String prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if (prod_code != null && !prod_code.equals("")) {
			prod_code = "%" + prod_code + "%";
		}
		PageHelper.startPage(page_num, page_size);
		List<BoxInfoVO> standard = boxInfoDao.standard(prod_code, customer_code, fcId, page_size, page_num);
		PageInfo<BoxInfoVO> pageInfo = new PageInfo<BoxInfoVO>(standard);
		return pageInfo;
	}

	// 删除装箱数主数据
	public void deleteBoxInfo(Integer bifId) {
		boxInfoDao.deleteByPrimaryKey(bifId);
	}

}
