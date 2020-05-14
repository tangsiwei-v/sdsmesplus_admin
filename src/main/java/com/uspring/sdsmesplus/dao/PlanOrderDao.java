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
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;

/** 
 * @ClassName: PlanOrderVODao 
 * @Description: 自定义Plan数据库操作类
 * @author chengtengfei chengtengfei@uspring.cn 
 * @date 2019年6月18日 下午1:34:34 
 *  
 */
public interface PlanOrderDao extends PlanOrderPODao {
	
	/** 
	* @Title: queryPlanVO 
	* @Description: 根据时间，状态，产线等获取订单
	* @return  订单实体类
	*/
	List<PlanOrderPO> queryPlanVO(Map<String,Object> map);

	
	/** 
	* @Title: queryPrintVO 
	* @Description: 
	* @return  有客户号的有打印模板的工单
	*/
	List<PlanOrderPO> queryPrintVO(@Param("factory_code") String factoryCode);


	/** 
	* @Title: queryByFcCode 
	* @Description: 
	* @return  订单实体类
	*/
	List<PlanOrderPO> queryByFcCode(@Param("factory_code") String fcCode);
	
	/** 
	* @Title: queryNullVO 
	* @Description: 
	* @return  无客户号有打印模板的工单
	*/
	List<PlanOrderPO> queryNullVO(@Param("factory_code") String fcCode);

	/**
	 * @Title: getTodayPrintCount
	 * @Description:
	 * @return  当天打印数量和最后一个流水号
	 */
	 Map<String, String> getTodayPrintCount(@Param("line_id") Integer line_id, @Param("prod_code") String prod_code, @Param("customer_code") String customer_code);
}
