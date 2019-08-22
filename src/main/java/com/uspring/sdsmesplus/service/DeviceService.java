package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.DevicePO;

/** 
 * @ClassName: DeviceService 
 * @Description: 基于Device数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月24日 下午2:55:10 
 *  
 */
public interface DeviceService {
	/** 
	* @Title: queryDevice
	* @Description: 根据lineId查找设备表
	* @param lineId 产线ID, devId, dev_code
	* page_num, page_size
	* @return 设备实体类
	*/
	PageInfo<DevicePO> queryDevice(Integer lineId, Integer devId, String dev_code, Integer page_size, Integer page_num);

	/**
	 * @Title: insertDevice
	 * @Description: 添加设备主数据
	 * @param devicePO 设备实体类
	 */
	void insertDevice(DevicePO devicePO);

	/**
	 * @Title: updateDevice
	 * @Description: 修改设备主数据
	 * @param devicePO 设备实体类
	 */
	void updateDevice(DevicePO devicePO);

	/**
	 * @Title: deleteDevice
	 * @Description: 删除设备主数据
	 * @param devId 设备ID
	 */
	void deleteDevice(Integer devId);

}
