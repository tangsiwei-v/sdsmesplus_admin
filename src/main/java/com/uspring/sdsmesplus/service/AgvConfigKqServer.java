package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.AgvConfigKqPO;
import com.uspring.sdsmesplus.entity.vo.AgvConfigKqVO;

/** 
 * @ClassName: AgvConfigKqServer 
 * @Description: 基于agvConfigKq数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月22日 下午12:33:47  
 */
public interface AgvConfigKqServer {

	/** 
	* @Title: queryAgvConfig
	* @Description: 根据fcId,lineId查找AGV拉动配置
	* @param fcId 工厂ID, lineId 产线ID
	* page_size page_num
	* @return AGV实体类
	*/
	PageInfo<AgvConfigKqVO> queryAgvConfig(Integer fcId, Integer lineId, Integer page_size, Integer page_num);

	/**
	 * @Title: insertAgvConfig
	 * @Description: 添加AGV拉动配置表
	 * @param AgvConfigKqPO AGV拉动配置表
	 */
	void insertAgvConfig(AgvConfigKqPO agvConfigKq);

	/**
	 * @Title: updateAgvConfig
	 * @Description: 修改AGV拉动配置表
	 * @param AgvConfigKqPO AGV拉动配置表
	 */
	void updateAgvConfig(AgvConfigKqPO agvConfigKq);

	/**
	 * @Title: deleteAgvConfig
	 * @Description: 删除AGV拉动配置表
	 * @param AgvConfigKqPO AGV拉动配置表
	 */
	void deleteAgvConfig(Integer agvcfgId);

}
