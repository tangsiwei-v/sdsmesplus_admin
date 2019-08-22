package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
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

	/**
	 * @Title: insertWorkshop
	 * @Description: 添加车间主数据
	 * @param workshop 车间实体类
	 */
	void insertWorkshop(SysWorkshopPO workshop);

	/**
	 * @Title: updateWorkshop
	 * @Description: 修改车间主数据
	 * @param workshop 车间实体类
	 */
	void updateWorkshop(SysWorkshopPO workshop);

	/**
	 * @Title: deleteWorkshop
	 * @Description: 删除车间主数据
	 * @param shopId 车间ID
	 */
	void deleteWorkshop(Integer shopId);

}
