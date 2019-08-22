package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysWorkshopPODao;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPOExample;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPOExample.Criteria;
import com.uspring.sdsmesplus.service.WorkShopServer;

/**   
 * @ClassName: WorkShopServerImpl
 * @Description:
 * @author: shangyanbing shangyanbing@uspring.cn   
 * @date: 2019年8月7日 上午10:45:05 
 */
@Service
public class WorkShopServerImpl implements WorkShopServer{
	
	@Autowired
	private SysWorkshopPODao sysWorkshopPODao;
	
	//查找车间主数据
	public PageInfo<SysWorkshopPO> queryWorkShop(Integer fcId, Integer shopId, Integer page_size, Integer page_num) {
		SysWorkshopPOExample sysWorkshopPOExample = new SysWorkshopPOExample();
		Criteria createCriteria = sysWorkshopPOExample.createCriteria();
		if(fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}
		if(shopId != null) {
			createCriteria.andShopIdEqualTo(shopId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SysWorkshopPO> sysWorkshopPOs = sysWorkshopPODao.selectByExample(sysWorkshopPOExample);
		PageInfo<SysWorkshopPO> pageInfo = new PageInfo<SysWorkshopPO>(sysWorkshopPOs);
		return pageInfo;
	}

	//添加车间主数据
	public void insertWorkshop(SysWorkshopPO workshop) {
		sysWorkshopPODao.insertSelective(workshop);
	}

	//修改车间主数据
	public void updateWorkshop(SysWorkshopPO workshop) {
		sysWorkshopPODao.updateByPrimaryKey(workshop);
	}

	//删除车间主数据
	public void deleteWorkshop(Integer shopId) {
		sysWorkshopPODao.deleteByPrimaryKey(shopId);
	}

}
