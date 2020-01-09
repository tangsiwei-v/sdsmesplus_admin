package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;

/**
 * @ClassName: OrderService
 * @Description: 订单服务
 * @author chengtengfei chengtengfei@uspring.cn
 * @param <PlanOrderPO>
 * @date 2019年6月18日 下午 13:16:04
 *
 */
public interface OrderService {

	// 查询工单
	public PageInfo<PlanOrderPO> selectOrder(Map<String, Object> map,Integer isExport, HttpServletResponse response);

	//查询没有配置打印程序的工单
	public List<PlanOrderPO> selectPrinterByFactory(Integer fcId);
	
	

}
