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
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.uspring.sdsmesplus.dao.generate.ShiftPODao;
import com.uspring.sdsmesplus.entity.po.ShiftPO;
import com.uspring.sdsmesplus.entity.vo.ShiftVO;

/** 
 * @ClassName: ShiftDao 
 * @Description: 班次Dao类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月29日 上午9:32:39 
 *  
 */
public interface ShiftDao extends ShiftPODao{

	public ShiftPO getShiftOfTime(@Param("factoryId") int factoryId, @Param("time") Date time);

	/** 
	* @Title: getShift 
	* @Description:根据工厂ID查询班次
	* @param fcId 工厂ID
	* @param page_num 
	* @param page_size 
	* @return  班次实体类
	*/
	public List<ShiftVO> getShift(@Param("fcId") Integer fcId, Integer page_size, Integer page_num);

}
