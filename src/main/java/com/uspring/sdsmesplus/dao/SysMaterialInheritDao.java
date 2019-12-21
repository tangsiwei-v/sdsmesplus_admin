package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysMaterialInheritPODao;

/** 
 * @ClassName: DeviceDao 
 * @Description:操作物料继承表
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月26日 下午12:48:50  
 */
public interface SysMaterialInheritDao extends SysMaterialInheritPODao{
	
	/** 
	* 获取物料继承数据
	* @Title: queryDevice
	* @return 
	*/
	List<Map<String,Object>> getMaterialInherit(@Param("fcId") Integer fcId,@Param("matCode") String matCode);
}
