package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.vo.DevProdStatus;
import com.uspring.sdsmesplus.entity.vo.OrderProdStatus;

/** 
 * @ClassName: ProdDeviceStockService 
 * @Description: 基于ProdDeviceStock数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月11日 下午3:15:43 
 *  
 */

public interface ProdDeviceStockService {
	/** 
	* @Title: device
	* @Description: 根据dev_code查找产线生产模式
	* @param dev_code 设备编号
	* @return  DevProdStatus对象
	*/
	DevProdStatus device(String dev_code);

	/**
	 * 查询某个工单当前的加工情况
	 * @param OrderCode
	 * @return
	 */
	OrderProdStatus queryOrderStatus(String OrderCode);

}
