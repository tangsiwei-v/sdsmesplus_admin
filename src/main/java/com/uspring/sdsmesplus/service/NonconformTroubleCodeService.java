/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.Map;

import com.uspring.sdsmesplus.entity.po.NonconformTroubleCodePO;

/** 
 * @ClassName: NonconformTroubleCode 
 * @Description: 缺陷模式
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface NonconformTroubleCodeService {
	/**
	 * @Title: getNonconformTrouCode
	 * @Description: 获取缺陷模式
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	Map<String,Object> getNonconformTrouCode(Integer fcId,Integer pageNum,Integer pageSize);
	
	/**
	 * @Title: insertNonconformTrouCode
	 * @Description: 新增缺陷模式
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	void insertNonconformTrouCode(NonconformTroubleCodePO nonconformPo);
	
	/**
	 * @Title: updateNonconformTrouCode
	 * @Description: 修改缺陷模式
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	void updateNonconformTrouCode(NonconformTroubleCodePO nonconformPo);
	
	/**
	 * @Title: deleteNonconformTrouCode
	 * @Description: 删除缺陷模式
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	void deleteNonconformTrouCode(Integer trcId);
	
	
}
