package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.NonconformTroubleCodePODao;

/** 
 * @ClassName: NonconformTroubleCodeDao 
 * @Description: 基于NonconformTroubleCodeDao数据库操作类
 * @author Majianqing
 * @date 2019年12月17日 下午1:12:57
 *  
 */

public interface NonconformTroubleCodeDao extends NonconformTroubleCodePODao{
	
	/**
	 * 
	 * @param fcId 工厂编号
	 * @return
	 */
	List<Map<String,Object>> getNonconformTrouCode(@Param("fcId")Integer fcId, @Param("shopId")Integer shopId, @Param("vsmId")Integer vsmId);

}
