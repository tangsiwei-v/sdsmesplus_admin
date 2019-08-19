/**
 * @Title: ShiftDao.java 
 * @Package com.uspring.sdsmesplus.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 上午9:32:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ShiftPODao;
import com.uspring.sdsmesplus.entity.po.ShiftPO;

/** 
 * @ClassName: ShiftDao 
 * @Description: 班次Dao类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月29日 上午9:32:39 
 *  
 */
public interface ShiftDao extends ShiftPODao{

	public ShiftPO getShiftOfTime(@Param("factoryId") int factoryId, @Param("time") Date time);
}
