package com.uspring.sdsmesplus.service;


import javax.xml.rpc.ServiceException;

import com.uspring.sdsmesplus.wms.entity.HuType;

/** * @author  作者 E-mail:chengtengfei 
 * @date 创建时间：2019年8月2日 下午1:15:46 
 * @version 1.0 * @parameter  
 * @since     用来生成批次号等
 * @return  
*/
public interface CodePackageService {
	/** 
	* @Title: creatHuCode
	* @Description: 根据huType查找设备表
	* @param fcCode 产线工厂Id
	* @return  HUcode  想条形码号
	 * @throws ServiceException 	 
	*/
	String creatHuCode(HuType huType, String fcCode) throws ServiceException;
}
