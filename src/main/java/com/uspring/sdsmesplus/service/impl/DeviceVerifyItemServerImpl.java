package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.DeviceVerifyItemDao;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.vo.DeviceVerifyItemVO;
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
	private DeviceVerifyItemDao deviceVerifyItemDao;
	
	//添加设备防错要求
	public void insertDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemDao.insertSelective(deviceVerifyItem);
	}
	
	//修改设备防错要求
	public void updateDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemDao.updateByPrimaryKey(deviceVerifyItem);
	}
	
	//删除设备防错要求
	public void deleteDeviceVerifyItem(Integer dviId) {
		deviceVerifyItemDao.deleteByPrimaryKey(dviId);
	}		
	
	//查询设备防错要求
	public PageInfo<DeviceVerifyItemVO> queryDeviceVerifyItem(Integer lineId, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<DeviceVerifyItemVO> deviceVerifyItems = deviceVerifyItemDao.queryDeviceVerifyItem(lineId, page_size, page_num);
		PageInfo<DeviceVerifyItemVO> pageInfo = new PageInfo<DeviceVerifyItemVO>(deviceVerifyItems);
		return pageInfo;
	}
	
}
