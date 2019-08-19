//package com.uspring.sdsmesplus.service;
//
//
//import javax.xml.rpc.ServiceException;
//
//import org.springframework.scheduling.annotation.Scheduled;
//
//import com.uspring.sdsmesplus.wms.entity.HuType;
//
///** * @author  作者 E-mail:chengtengfei 
// * @date 创建时间：2019年8月6日 下午15:15:46 
// * @version 1.0 * @parameter  
// * @since  拉料接口
// * @return  
//*/
//public interface FeedMaterialService {
//	/** 
//	* @Title: creatHuCode
//	* @Description: 根据huType查找设备表
//	* @param fcCode 产线工厂Id
//	* @return  HUcode  想条形码号
//	 * @throws ServiceException 	 
//	*/
//	String beforeCall(HuType huType, String fcCode) throws ServiceException;
//	
////	@Scheduled(cron = "0 0/30 * * * ?") // 间隔5秒执行
////	public void testShadel(){
////		System.out.println("定时任务执行成功");
////	}
//}
