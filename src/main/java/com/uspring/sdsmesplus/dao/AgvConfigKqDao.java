package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.AgvConfigKqPODao;
import com.uspring.sdsmesplus.entity.vo.AgvConfigKqVO;
/** 
 * @ClassName: AgvConfigKqDao 
 * @Description: 基于AgvConfigKq数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月22日 下午1:08:17  
 */
public interface AgvConfigKqDao extends AgvConfigKqPODao{
	
	/** 
	* @Title: queryAgvConfig
	* @Description: 根据fcId,lineId查找AGV主数据
	* @param fcId 工厂ID, lineId 产线ID
	* page_size page_num
	* @return AGV实体类
	*/
	List<AgvConfigKqVO>queryAgvConfig(@Param("fcId") Integer fcId, @Param("lineId") Integer lineId, Integer page_size, Integer page_num);
}
