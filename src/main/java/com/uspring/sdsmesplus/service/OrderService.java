package com.uspring.sdsmesplus.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;

/**
 * @ClassName: OrderService
 * @Description: 订单服务
 * @author chengtengfei chengtengfei@uspring.cn
 * @param <PlanOrderPO>
 * @date 2019年6月18日 下午 13:16:04
 *
 */
public interface OrderService {
	// 工单冻结
	public void updateOrderStadus(String order_code) throws Exception;

	// 工单解冻
	public void updateOrderUnFreeze(String order_code) throws Exception;

	// 工单开始执行
	public void updateOrderStar(String order_code) throws Exception;

	// 查询工单
	public PageInfo<PlanOrderVO> selectOrder(Map<String, Object> map);

	//工单关闭
	public void updateOrderclose(String order_code) throws Exception;

}
