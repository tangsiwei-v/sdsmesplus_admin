package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineStoragebinDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.SysLineStoragebinPODao;
import com.uspring.sdsmesplus.dao.generate.SysStoragebinPODao;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPOExample;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.WorkOrderStatus;
import com.uspring.sdsmesplus.dao.generate.BoxInfoPODao;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mpmlink.dao.ProcessPlanDao;
import com.uspring.sdsmesplus.service.OrderService;
import com.uspring.sdsmesplus.wms.WMSService;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 订单实现类
 * @author chengtenfgei chentengfei@uspring.cn
 * @date 2019年6月18日 下午 13:16:04
 * 
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private PlanOrderDao planDao;
	@Autowired
	PlanOrderPODao planOrderPODao;
	@Autowired
	private SysLineStoragebinPODao sysStoragebinPODao;
	
	@Autowired
	private WMSService wmsService;
	@Autowired
	private BoxInfoPODao BoxInfoPODao;
	

	// 冻结工单
	@Override
	public void updateOrderStadus(String order_code) throws Exception {
		int type = 1;// 冻结工单
		updateStadus(order_code, type);
	}

	// 解冻工单
	@Override
	public void updateOrderUnFreeze(String order_code) throws Exception {
		int type = 2;// 解冻工单
		updateStadus(order_code, type);
	}

	// 开始工单
	@Override
	public void updateOrderStar(String order_code) throws Exception {
		PlanOrderVO planOrder = planDao.findPlanVOByOrderCode(order_code);
		Integer lineId = planOrder.getLineId();
		SysLineStoragebinPOExample ex = new SysLineStoragebinPOExample();
		ex.createCriteria().andLineIdEqualTo(lineId);
		
		List<SysLineStoragebinPO> linStorBins= sysStoragebinPODao.selectByExample(ex);
		if(linStorBins.size()!=4) {
			throw new ServiceException("产线库位主数据配置出错");
		}
		BoxInfoPOExample boxInfoex = new BoxInfoPOExample();
		boxInfoex.createCriteria().andProdCodeEqualTo(planOrder.getProdCode()).andCustomerCodeEqualTo(planOrder.getCustomerCode());		
		List<BoxInfoPO> boxs = BoxInfoPODao.selectByExample(boxInfoex);
		if(boxs.size()<1) {
			throw new ServiceException("装箱主数据配置出错");
		}
		int type = 3;// 开始工单
		updateStadus(order_code, type);
	}

	@Override
	public PageInfo<PlanOrderVO> selectOrder(Map<String, Object> map) {
		// 默认分页
		int pageNum = 1, pageSize = 1000;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}

			// 时间判断
			if (map.containsKey("start_time")) {
				String star = (String) map.get("start_time");
				map.put("starDate", star);
			}
			if (map.containsKey("end_time")) {
				String end = (String) map.get("end_time");
				map.put("endDate", end);
			}
			// 切割传入status
			if (map.containsKey("status")) {
				String stri = map.get("status").toString().replace("\"", "");
				List<String> status = new ArrayList<String>();
				String[] b = stri.substring(1, stri.length() - 1).split(",", 0);
				for (int i = 0; i < b.length; i++) {
					status.add(b[i]);
				}
				map.put("statusList", status);
			}
		}
		PageHelper.startPage(pageNum, pageSize);

		List<PlanOrderVO> list = planDao.queryPlanVO(map);
		PageInfo<PlanOrderVO> pageInfo = new PageInfo<PlanOrderVO>(list);
		return pageInfo;
	}

	void updateStadus(String order_code, int type) throws Exception {
		PlanOrderVO findPlanVOByOrderCode2 = planDao.findPlanVOByOrderCode(order_code);
		PlanOrderVO findPlanVOByOrderCode = findPlanVOByOrderCode2;
		PlanOrderPO planPo = findPlanVOByOrderCode;
		String code = planPo.getPoStatus();
		switch (type) {
		case 1:
			if (code.equals(WorkOrderStatus.Frozen.getCode())
					|| code.equals(WorkOrderStatus.Executing.getCode()))
				throw new ServiceException("冻结失败");
			planPo.setPoStatus(WorkOrderStatus.Frozen.getCode());
			break;
		case 2:
			if (!code.equals(WorkOrderStatus.Frozen.getCode()))
				throw new ServiceException("解冻失败");
			planPo.setPoStatus(WorkOrderStatus.Assigned.getCode());
			break;
		case 3:
			if (code.equals(WorkOrderStatus.Frozen.getCode()))
				throw new ServiceException("开始工单失败");
			planPo.setPoStatus(WorkOrderStatus.Executing.getCode());
			break;
		case 4:
			if (!code.equals(WorkOrderStatus.Executing.getCode()))
				throw new ServiceException("关闭工单失败");
			PlanOrderVO planVo =  planDao.findPlanVOByOrderCode(order_code);
			wmsService.closePlanOrder(planVo);
			planPo.setPoStatus(WorkOrderStatus.Completed.getCode());
			break;
		}
		planPo.setUpdateTime(new Date());
		planOrderPODao.updateByPrimaryKeySelective(planPo);
	}

	// 结束工单
	@Override
	public void updateOrderclose(String order_code) throws Exception {
		int type = 4;// 结束工单
		updateStadus(order_code, type);
	}
}
