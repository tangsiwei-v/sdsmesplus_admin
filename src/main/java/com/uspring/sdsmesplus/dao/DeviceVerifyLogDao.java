package com.uspring.sdsmesplus.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.DeviceVerifyLogPODao;
import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPO;

/** 
 * @ClassName: DeviceVerifyLogDao 
 * @Description: 基于DeviceVerifyLog数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月18日 下午1:25:10 
 *  
 */

public interface DeviceVerifyLogDao extends DeviceVerifyLogPODao{
	/** 
	* @Title: insertDeviceVerifyLog 
	* @Description: 根据产线ID，设备防错要求
	* @param lineId 产线ID
	* @return  设备防错实体类
	*/
	void insertDeviceVerifyLog(DeviceVerifyLogPO deviceVerifyLog);
	/** 
	* @Title: findDeviceVerifyLog 
	* @Description: 根据日期，授权时间判断是否做过设备防错
	* @param orderCode 工单编号，shiftDate日期，authTime授权时间
	* @return  设备防错实体类
	*/
	boolean findDeviceVerifyLog(String order_code);
	/** 
	* @Title: compare 
	* @Description: 根据开始时间，结束时间，产线ID查询是否做过设备防错
	* @param shiftStartTimeOfTime 开始时间，shiftEndTimeOfTime 结束时间，lineId产线ID
	* @return  设备防错实体类
	*/
	List<DeviceVerifyLogPO> compare(@Param("shiftStartTimeOfTime")Date shiftStartTimeOfTime,
			@Param("shiftEndTimeOfTime")Date shiftEndTimeOfTime,
			@Param("line_id")Integer line_id);
}
