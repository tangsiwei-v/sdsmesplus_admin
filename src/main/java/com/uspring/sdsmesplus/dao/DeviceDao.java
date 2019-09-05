package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.DevicePODao;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;

/** 
 * @ClassName: DeviceDao 
 * @Description:基于Device数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月26日 下午12:48:50  
 */
public interface DeviceDao extends DevicePODao{
	
	/** 
	* @Title: queryDevice
	* @Description: 根据lineId,devId,dev_code查找设备表
	* @param lineId 产线ID, devId 设备ID, dev_code 设备编码 
	* page_num, page_size
	* @return 设备实体类
	*/
	List<DeviceVO> queryDevice(@Param("lineId") Integer lineId, @Param("devId") Integer devId, @Param("dev_code") String dev_code, Integer page_size, Integer page_num);
}
