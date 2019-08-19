package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;

/**   
 * @ClassName: WorkShopServer
 * @Description:基于WorkShop数据库操作类
 * @author: shangyanbing shangyanbing@uspring.cn   
 * @date: 2019年8月7日 上午10:39:40 
 */

public interface WorkShopServer {
	/** 
	* @Title: queryWorkShop
	* @Description: 根据fcId,shopId查找车间主数据
	* @param fcId 工厂ID, shopId 车间ID,
	* page_size page_num
	* @return  车间实体类
	*/
	PageInfo<SysWorkshopPO> queryWorkShop(Integer fcId, Integer shopId, Integer page_size, Integer page_num);
	
}
