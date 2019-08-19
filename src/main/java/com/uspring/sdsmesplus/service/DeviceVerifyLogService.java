package com.uspring.sdsmesplus.service;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPO;

/** 
 * @ClassName: DeviceVerifyLogService 
 * @Description: 基于DeviceVerifyLog数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月18日 下午3:25:10 
 *  
 */

public interface DeviceVerifyLogService {
	/** 
	* @Title: queryDeviceVerifyLog
	* @Description: 根据lineId查找某条产线的设备防错要求
	* @param line_id 产线ID
	* @return  设备防错实体类
	*/
	List<DeviceVerifyLogPO> queryDeviceVerifyLog(Integer line_id);
	
	/** 
	* @param line_id 
	 * @Title: insertDeviceVerifyLog 
	* @Description: 根据产线ID，设备防错要求
	* @param lineId 产线ID
	* @return  设备防错实体类
	*/
	void insertDeviceVerifyLog(List<DeviceVerifyLogPO> deviceVerify, Integer line_id);
	
	/** 
	* @Title: findDeviceVerifyLog 
	* @Description: 根据日期，授权时间判断是否做过设备防错
	* @param orderCode 工单编号，shiftDate日期，authTime授权时间
	* @return  设备防错实体类
	*/
	boolean findDeviceVerifyLog(String order_code);

}
