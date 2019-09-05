package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysWorkshopPODao;
import com.uspring.sdsmesplus.entity.vo.WorkshopVO;

/** 
 * @ClassName: WorkShopDao 
 * @Description: 基于WorkShopDao数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月23日 下午5:33:31  
 */
public interface WorkShopDao extends SysWorkshopPODao{
	/** 
	* @Title: queryWorkShop
	* @Description: 根据fcId,shopId查找车间主数据
	* @param fcId 工厂ID, shopId 车间ID,
	* page_size page_num
	* @return  车间实体类
	*/
	List<WorkshopVO> queryWorkShop(@Param("fcId") Integer fcId, @Param("shopId") Integer shopId, Integer page_size, Integer page_num);

}
