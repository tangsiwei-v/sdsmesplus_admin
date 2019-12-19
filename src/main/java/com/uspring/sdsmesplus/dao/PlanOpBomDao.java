package com.uspring.sdsmesplus.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.PlanOpBomPODao;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;


/** * @author  作者 E-mail:
 * @date 创建时间：2019年7月20日 下午1:34:40 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public interface PlanOpBomDao extends PlanOpBomPODao{
	/** 
	* @Title: findPlanVOByOrderCode 
	* @Description: 根据订单号查找订单
	* @param orderCode 订单ID
	* @return  订单实体类
	*/
	List<PlanOpBomPO> selectBomByOrdercode(@Param("order_code") String order_code);
	
	List<PlanOpBomPO> selectBomByMtCode(@Param("mtCodes") List<String> mtCodes);
}
