package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysDeviceVerifyItemPODao;
import com.uspring.sdsmesplus.entity.vo.DeviceVerifyItemVO;

/** 
 * @ClassName: DeviceVerifyItemDao 
 * @Description: 基于DeviceVerifyItem数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 上午9:35:10  
 */
public interface DeviceVerifyItemDao extends SysDeviceVerifyItemPODao{
	/** 
	* @Title: queryDeviceVerifyItem 
	* @Description: 根据lineId,查询设备防错要求
	* @param lineId 产线ID
	*  page_size page_num
	* @return 设备防错实体类
	*/
	List<DeviceVerifyItemVO> queryDeviceVerifyItem(@Param("lineId") Integer lineId, Integer page_size, Integer page_num,@Param("shopId") Integer shopId,@Param("fcId") Integer fcId);
	
}
