/**
 * @Title: ShiftServiceImpl.java 
 * @Package com.uspring.sdsmesplus.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:45:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.common.DateUtils;
import com.uspring.sdsmesplus.dao.ShiftDao;
import com.uspring.sdsmesplus.dao.generate.ShiftPODao;
import com.uspring.sdsmesplus.entity.po.ShiftPO;
import com.uspring.sdsmesplus.entity.po.ShiftPOExample;
import com.uspring.sdsmesplus.entity.po.ShiftPOExample.Criteria;
import com.uspring.sdsmesplus.service.ShiftService;

/** 
 * @ClassName: ShiftServiceImpl 
 * @Description: 班次服务实现类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月27日 下午7:45:39 
 *  
 */
@Service
public class ShiftServiceImpl implements ShiftService{
	
	@Autowired
	private ShiftDao shiftDao;
	@Autowired
	private ShiftPODao shiftPODao;
	
	@Override
	public ShiftPO getShiftOfTime(Date time, int fcId) {
		return shiftDao.getShiftOfTime(fcId, time);
	}

	@Override
	public Date getShiftDateOfTime(Date time, int fcId) {
		ShiftPO shift = shiftDao.getShiftOfTime(fcId, time);
		Date day = new Date(time.getTime());
		Calendar cal = new GregorianCalendar();
        cal.setTime(day);
        //！不支持跨两天的场景
        cal.add(Calendar.DAY_OF_MONTH, shift.getSfSpanDay());
        return DateUtils.getDayStartTime(cal.getTime());
	}

	@Override
	public Date getShiftStartTime(Date shiftDate, ShiftPO shift) {
		Calendar cal = new GregorianCalendar();
        cal.setTime(shiftDate);
        cal.set(Calendar.HOUR_OF_DAY, shift.getSfStartHour());
        cal.set(Calendar.MINUTE, shift.getSfStartMinute());
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	@Override
	public Date getShiftEndTime(Date shiftDate, ShiftPO shift) {
		Calendar cal = new GregorianCalendar();
        cal.setTime(shiftDate);
        cal.add(Calendar.DAY_OF_MONTH, shift.getSfSpanDay());
        
        cal.set(Calendar.HOUR_OF_DAY, shift.getSfEndHour());
        cal.set(Calendar.MINUTE, shift.getSfEndMinute());
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	@Override
	public Date getShiftStartTimeOfTime(Date time, int fcId) {
		ShiftPO shift = getShiftOfTime(time, fcId);
		Date shiftDay = getShiftDateOfTime(time, fcId);
		return getShiftStartTime(shiftDay, shift);
	}

	@Override
	public Date getShiftEndTimeOfTime(Date time, int fcId) {
		ShiftPO shift = getShiftOfTime(time, fcId);
		Date shiftDay = getShiftDateOfTime(time, fcId);
		return getShiftEndTime(shiftDay, shift);
	}

	@Override
	public ShiftPO getShiftClasses(Integer fcId) {
		Date time = new Date();
		ShiftPO shiftOfTime = getShiftOfTime(time, fcId);
		return shiftOfTime;
	}

	//产线主数据
	public PageInfo<ShiftPO> getShift(Integer fcId, Integer page_size, Integer page_num) {
		ShiftPOExample shift = new ShiftPOExample();
		Criteria createCriteria = shift.createCriteria();
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if(fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}			
		List<ShiftPO> shiftPOs = shiftPODao.selectByExample(shift);
		PageInfo<ShiftPO> pageInfo = new PageInfo<ShiftPO>(shiftPOs);
		return pageInfo;
	}

	//添加班次
	public void insertShift(ShiftPO shift) {
		shiftPODao.insertSelective(shift);
	}

	//修改班次
	public void updateShift(ShiftPO shift) {
		shiftPODao.updateByPrimaryKey(shift);
	}

	//删除班次
	public void deleteShift(Integer sfId) {
		shiftPODao.deleteByPrimaryKey(sfId);
	}

}
