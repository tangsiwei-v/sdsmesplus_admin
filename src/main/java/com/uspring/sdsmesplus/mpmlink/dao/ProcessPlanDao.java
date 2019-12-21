/**
 * @Title: ProcessPlanDao.java 
 * @Package com.uspring.sdsmesplus.mpmlink.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月18日 下午5:29:02 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mpmlink.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/** 
 * @ClassName: ProcessPlanDao 
 * @Description: 工艺计划查询DAO接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月18日 下午5:29:02 
 *  
 */
public interface ProcessPlanDao {

	public HashMap<String, Object> queryBom(@Param("prodCode") String prodCode, @Param("lineCode") String lineCode);
	
	public List<Map<String,Object>> queryBomSimple(@Param("prodCode") String prodCode);
}
