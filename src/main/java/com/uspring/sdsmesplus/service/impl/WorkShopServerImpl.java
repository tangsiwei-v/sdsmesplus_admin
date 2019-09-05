package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.WorkShopDao;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
import com.uspring.sdsmesplus.entity.vo.WorkshopVO;
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
	private WorkShopDao workshopDao;
	
	//查找车间主数据
	public PageInfo<WorkshopVO> queryWorkShop(Integer fcId, Integer shopId, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<WorkshopVO> workshops = workshopDao.queryWorkShop(fcId, shopId, page_size, page_num);
		PageInfo<WorkshopVO> pageInfo = new PageInfo<WorkshopVO>(workshops);
		return pageInfo;
	}

	//添加车间主数据
	public void insertWorkshop(SysWorkshopPO workshop) {
		workshopDao.insertSelective(workshop);
	}

	//修改车间主数据
	public void updateWorkshop(SysWorkshopPO workshop) {
		workshopDao.updateByPrimaryKey(workshop);
	}

	//删除车间主数据
	public void deleteWorkshop(Integer shopId) {
		workshopDao.deleteByPrimaryKey(shopId);
	}

}
