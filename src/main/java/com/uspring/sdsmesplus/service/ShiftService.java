/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.Date;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.ShiftPO;

/** 
 * @ClassName: ShiftService 
 * @Description: 班次服务接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface ShiftService {

	/** 
	* @Title: getShiftOfTime 
	* @Description: 获取某个时间的班次
	* @param time 时间点
	* @param fcId 工厂ID
	* @return  班次对象
	*/
	public ShiftPO getShiftOfTime(Date time, int fcId);
	
	/** 
	* @Title: getShiftDateOfTime 
	* @Description: 获取某个时间的班次日期
	* @param time 时间点
	* @param fcId 工厂ID
	* @return  班次对象
	*/
	public Date getShiftDateOfTime(Date time, int fcId);
	
	/** 
	* @Title: getShiftStartTime 
	* @Description: 获取某个班次的开始时间
	* @param shiftDate 班次日期
	* @param shift 班次对象
	* @return  开始时间
	*/
	public Date getShiftStartTime(Date shiftDate, ShiftPO shift);
	
	/** 
	* @Title: getShiftEndTime 
	* @Description: 获取某个班次的结束时间
	* @param shiftDate 班次日期
	* @param shift 班次对象
	* @return  结束时间
	*/
	public Date getShiftEndTime(Date shiftDate, ShiftPO shift);
	
	/** 
	* @Title: getShiftStartTimeOfTime 
	* @Description: 获取某个时间的班次开始时间
	* @param time 时间点
	* @param fcId 工厂ID
	* @return  开始时间
	*/
	public Date getShiftStartTimeOfTime(Date time, int fcId);
	
	/** 
	* @Title: getShiftEndTimeOfTime 
	* @Description: 获取某个时间的班次结束时间
	* @param time 时间点
	* @param fcId 工厂ID
	* @return  结束时间
	*/
	public Date getShiftEndTimeOfTime(Date time, int fcId);
	
	/** 
	* @Title: getShiftClasses 
	* @Description:根据工厂ID查询当前班次
	* @param fcId 工厂ID
	* @return  班次实体类
	*/
	public ShiftPO getShiftClasses(Integer fcId);
	
	/** 
	* @Title: getShift 
	* @Description:根据工厂ID查询班次
	* @param fcId 工厂ID
	* @param page_num 
	* @param page_size 
	* @return  班次实体类
	*/
	public PageInfo<ShiftPO> getShift(Integer fcId, Integer page_size, Integer page_num);

	/**
	 * @Title: insertShift
	 * @Description:添加班次 
	 * @param shift 班次实体类
	 */
	public void insertShift(ShiftPO shift);

	/**
	 * @Title: updateShift
	 * @Description:修改班次 
	 * @param shift 班次实体类
	 */
	public void updateShift(ShiftPO shift);

	/**
	 * @Title: deleteShift
	 * @Description:删除班次
	 * @param sfId 班次ID
	 */
	public void deleteShift(Integer sfId);
}
