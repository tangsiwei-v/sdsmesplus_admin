package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysDeviceVerifyItemPODao;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPOExample;
import com.uspring.sdsmesplus.service.DeviceVerifyItemServer;

/**   
 * @ClassName: DeviceVerifyItemServerImpl
 * @Version 1.0
 * @author: shangyanbing shangyanbing@uspring.cn   
 * @date: 2019年8月7日 上午11:49:31 
 */

@Service
public class DeviceVerifyItemServerImpl implements DeviceVerifyItemServer{
	@Autowired
	private SysDeviceVerifyItemPODao sysDeviceVerifyItemPODao;
	
	//添加设备防错要求
	public void insertDeviceVerify(SysDeviceVerifyItemPO deviceVerifyItem) {
		sysDeviceVerifyItemPODao.insertSelective(deviceVerifyItem);
	}
	
	//修改设备防错要求
	public void updateDeviceVerify(SysDeviceVerifyItemPO deviceVerifyItem) {
		sysDeviceVerifyItemPODao.updateByPrimaryKey(deviceVerifyItem);
	}
	
	//删除设备防错要求
	public void deleteDeviceVerify(Integer dviId) {
		sysDeviceVerifyItemPODao.deleteByPrimaryKey(dviId);
	}		
	
	//查询设备防错要求
	public PageInfo<SysDeviceVerifyItemPO> queryDeviceVerifyLog(Integer lineId, Integer page_size, Integer page_num) {
		SysDeviceVerifyItemPOExample deviceVerifyItemPOExample = new SysDeviceVerifyItemPOExample();
		com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPOExample.Criteria createCriteria = deviceVerifyItemPOExample.createCriteria();
		if(lineId != null) {
			createCriteria.andLineIdEqualTo(lineId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SysDeviceVerifyItemPO> sysDeviceVerifyItems = sysDeviceVerifyItemPODao.selectByExample(deviceVerifyItemPOExample);
		PageInfo<SysDeviceVerifyItemPO> pageInfo = new PageInfo<SysDeviceVerifyItemPO>(sysDeviceVerifyItems);
		return pageInfo;
	}
	
}
