package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
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
	* @Description: 根据fcId,lineId查找AGV主数据
	* @param fcId 工厂ID, lineId 产线ID
	* page_size page_num
	* @return AGV实体类
	*/
	PageInfo<AgvConfigKqVO> queryAgvConfig(Integer fcId, Integer lineId, Integer page_size, Integer page_num);

}
