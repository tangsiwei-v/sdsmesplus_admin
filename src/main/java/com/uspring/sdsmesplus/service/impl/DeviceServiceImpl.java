package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.DevicePODao;
import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.po.DevicePOExample;
import com.uspring.sdsmesplus.entity.po.DevicePOExample.Criteria;
import com.uspring.sdsmesplus.service.DeviceService;
@Service
public class DeviceServiceImpl implements DeviceService{
	
	@Autowired
	private DevicePODao devicePODao;

	@Override
	public PageInfo<DevicePO> queryDevice(Integer lineId, Integer devId, String dev_code, Integer page_size,
			Integer page_num) {
		DevicePOExample devicePOExample = new DevicePOExample();
		Criteria createCriteria = devicePOExample.createCriteria();
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if(lineId != null) {
			createCriteria.andLineIdEqualTo(lineId);
		}
		if(devId != null) {
			createCriteria.andDevIdEqualTo(devId);
		}
		if(dev_code != null && !dev_code.equals("")) {
			createCriteria.andDevCodeEqualTo(dev_code);
		}
		PageHelper.startPage(page_num, page_size);
		List<DevicePO> devicePOs = devicePODao.selectByExample(devicePOExample);
		PageInfo<DevicePO> pageInfo = new PageInfo<DevicePO>(devicePOs);
		return pageInfo;
	}

	//添加设备主数据
	public void insertDevice(DevicePO devicePO) {
		devicePODao.insertSelective(devicePO);
	}

	//修改设备主数据
	public void updateDevice(DevicePO devicePO) {
		devicePODao.updateByPrimaryKey(devicePO);
	}

	//删除设备主数据
	public void deleteDevice(Integer devId) {
		devicePODao.deleteByPrimaryKey(devId);
	}

}
