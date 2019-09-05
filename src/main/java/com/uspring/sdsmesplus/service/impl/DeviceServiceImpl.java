package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.DeviceDao;
import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;
import com.uspring.sdsmesplus.service.DeviceService;
@Service
public class DeviceServiceImpl implements DeviceService{
	
	@Autowired
	private DeviceDao deviceDao;

	//设备主数据
	public PageInfo<DeviceVO> queryDevice(Integer lineId, Integer devId, String dev_code, Integer page_size,
			Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<DeviceVO> devicePOs = deviceDao.queryDevice(lineId, devId, dev_code, page_size, page_num);
		PageInfo<DeviceVO> pageInfo = new PageInfo<DeviceVO>(devicePOs);
		return pageInfo;
	}

	//添加设备主数据
	public void insertDevice(DevicePO devicePO) {
		deviceDao.insertSelective(devicePO);
	}

	//修改设备主数据
	public void updateDevice(DevicePO devicePO) {
		deviceDao.updateByPrimaryKey(devicePO);
	}

	//删除设备主数据
	public void deleteDevice(Integer devId) {
		deviceDao.deleteByPrimaryKey(devId);
	}

}
