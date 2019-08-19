package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.DeviceVerifyLogDao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.SysDeviceVerifyItemPODao;
import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPOExample;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.service.DeviceVerifyLogService;
import com.uspring.sdsmesplus.service.ShiftService;

@Service
public class DeviceVerifyLogServiceImpl implements DeviceVerifyLogService {

	@Autowired
	private DeviceVerifyLogDao deviceVerifyLogDao;
    @Autowired
    private SysFactoryPODao sysFactoryPODao;
    @Autowired
	private ShiftService shiftService;
    @Autowired
	private PlanOrderPODao planOrderPODao;
    @Autowired
    private SysDeviceVerifyItemPODao sysDeviceVerifyItemPODao;
    
	@Override
	public List<DeviceVerifyLogPO> queryDeviceVerifyLog(Integer line_id) {
		SysDeviceVerifyItemPOExample sysDeviceVerifyItemPOExample = new SysDeviceVerifyItemPOExample();
		sysDeviceVerifyItemPOExample.createCriteria().andLineIdEqualTo(line_id);
		List<SysDeviceVerifyItemPO> sysDeviceVerifyItemPOs = sysDeviceVerifyItemPODao.selectByExample(sysDeviceVerifyItemPOExample);
		
		List<DeviceVerifyLogPO> deviceVerifyLogPOs= new ArrayList<DeviceVerifyLogPO>();
		for (SysDeviceVerifyItemPO sysDeviceVerifyItemPO : sysDeviceVerifyItemPOs) {
			DeviceVerifyLogPO deviceVerifyLogPO = new DeviceVerifyLogPO();
			deviceVerifyLogPO.setLineId(line_id);
			deviceVerifyLogPO.setDvDevice(sysDeviceVerifyItemPO.getDevCode());
			deviceVerifyLogPO.setDvItem(sysDeviceVerifyItemPO.getDviItem());
			deviceVerifyLogPO.setDvRequirement(sysDeviceVerifyItemPO.getDviReq());
			deviceVerifyLogPO.setCreateTime(new Date());
			deviceVerifyLogPOs.add(deviceVerifyLogPO);
		}
		return deviceVerifyLogPOs;
	}

	@Override
	public void insertDeviceVerifyLog(List<DeviceVerifyLogPO> deviceVerifyLog, Integer line_id) {
		for (DeviceVerifyLogPO deviceVerifyLogPO : deviceVerifyLog) {
			deviceVerifyLogPO.setCreateTime(new Date());
			deviceVerifyLogPO.setLineId(line_id);
			deviceVerifyLogDao.insertSelective(deviceVerifyLogPO);
		}
	}

	@Override
	public boolean findDeviceVerifyLog(String order_code) {
		
		PlanOrderPOExample order = new PlanOrderPOExample();
		order.createCriteria().andPoCodeEqualTo(order_code);
		List<PlanOrderPO> planOrder = planOrderPODao.selectByExample(order);
		String fcCode = planOrder.get(0).getFcCode();
		
		SysFactoryPOExample factory = new SysFactoryPOExample();
		factory.createCriteria().andFcCodeEqualTo(fcCode);
		List<SysFactoryPO> sysFactory = sysFactoryPODao.selectByExample(factory);
		Integer fcId = sysFactory.get(0).getFcId();
		
		Date time=new Date();
		Date shiftStartTimeOfTime = shiftService.getShiftStartTimeOfTime(time, fcId);
		Date shiftEndTimeOfTime = shiftService.getShiftEndTimeOfTime(time, fcId);
	    List<DeviceVerifyLogPO> compare = deviceVerifyLogDao.compare(shiftStartTimeOfTime, shiftEndTimeOfTime, planOrder.get(0).getLineId());
		if(compare.size() > 0)
			return false;
		return true;		
	}

}
