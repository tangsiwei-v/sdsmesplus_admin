package com.uspring.sdsmesplus.service;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPO;

/** 
 * @ClassName: SkillVerifyService 
 * @Description: 基于ProdSkillVerifyLog数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月19日 下午4:12:10 
 *  
 */


public interface SkillVerifyService {
	/** 
	* @Title: querySkillVerify
	* @Description: 根据工单号查询产品简码和产线
	* @param order_code 工单号
	* @return  人员防错实体类
	 * @throws Exception 
	*/
	List<ProdSkillVerifyLogPO> querySkillVerify(String order_code) throws Exception;
	/** 
	* @param line_id 
	 * @Title: insertSkillVerifyLog 
	* @Description: 插入数据库人员防错记录表
	* @return  人员防错实体类
	*/
	void insertSkillVerifyLog(List<ProdSkillVerifyLogPO> skillVerifyLog, Integer line_id);
	/** 
	* @Title: findSkillVerifyLog 
	* @Description: 根据日期，授权时间判断是否做过设备防错
	* @param orderCode 工单编号，shiftDate日期，authTime授权时间
	* @return 人员防错实体类
	*/
	boolean findSkillVerifyLog(String order_code);
	
}
