/**
 * @Title: OrderServiceDao.java 
 * @Package com.uspring.template.dao.base 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月12日 下午3:35:34 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;

/** 
 * @ClassName: PlanOrderVODao 
 * @Description: 自定义Plan数据库操作类
 * @author chengtengfei chengtengfei@uspring.cn 
 * @date 2019年6月18日 下午1:34:34 
 *  
 */
public interface PlanOrderDao extends PlanOrderPODao {

	/** 
	* @Title: findPlanVOByOrderCode 
	* @Description: 根据订单号查找订单
	* @param orderCode 订单ID
	* @return  订单实体类
	*/
	PlanOrderVO findPlanVOByOrderCode(@Param("order_code") String orderCode);

	
	/** 
	* @Title: queryPlanVO 
	* @Description: 根据时间，状态，产线等获取订单
	* @return  订单实体类
	*/
	List<PlanOrderVO> queryPlanVO(Map<String,Object> map);
}
