package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;

/** 
 * @ClassName: SysLineProdmodelService 
 * @Description: 基于SysLineProdmodel数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月11日 下午15:21:16 
 *  
 */

public interface SysLineProdmodelService {
	
	/** 
	* @Title: prodmodel
	* @Description: 根据line_id查询产线生产模式
	* @param line_id 产线ID
	* @return 工厂实体类
	*/
	SysLineProdmodelPO prodmodel(Integer line_id);	
	
}
