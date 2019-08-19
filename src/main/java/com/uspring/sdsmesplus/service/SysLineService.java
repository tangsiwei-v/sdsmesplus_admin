package com.uspring.sdsmesplus.service;

import java.rmi.ServerException;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysLinePO;

/** 
 * @ClassName: SysLineService 
 * @Description: 基于SysLine数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月22日 下午1:15:19 
 *  
 */

public interface SysLineService {
	/** 
	* @Title: queryLineId
	* @Description: 根据line_sds_id查找产线表
	* @param line_sds_id 纳铁福产线ID
	* @return  产线实体类
	 * @throws ServerException 
	*/
	SysLinePO queryLineId(String line_sap_code);
	
	/** 
	* @Title: queryLineCode
	* @Description: 根据line_sds_code查找产线表
	* @param line_sds_code 所属车间ID
	* @return  产线实体类
	*/
	SysLinePO queryLineCode(String line_sap_code);
	
	/** 
	* @Title: prodmodel
	* @Description: 根据shopId,vsmId,lineId查找产线主数据
	* @param shopId 车间ID, vsmId 工段ID, lineId 产线ID,
	* page_size page_num
	* @return  产线实体类
	*/
	PageInfo<SysLinePO> queryLine(Integer shopId, Integer vsmId, Integer lineId, Integer page_size, Integer page_num);

}
