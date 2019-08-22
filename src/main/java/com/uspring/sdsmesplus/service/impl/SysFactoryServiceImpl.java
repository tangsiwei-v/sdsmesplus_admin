package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.SysFactoryDao;
import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample.Criteria;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;
import com.uspring.sdsmesplus.service.SysFactoryService;

@Service
public class SysFactoryServiceImpl implements SysFactoryService{
	
	@Autowired
	private SysFactoryDao sysFactoryDao;
	
	@Autowired
	private SysFactoryPODao sysFactoryPODao;
	
	@Override
	public List<FactoryVO> queryFactory(Integer fc_id, String fc_code) {
		return sysFactoryDao.queryFactory(fc_id, fc_code);
	}

	@Override
	public List<FactoryVO> querytreenovsm(Integer fc_id, String fc_code) {
		return sysFactoryDao.querytreenovsm(fc_id, fc_code);
	}

	//查询工厂主数据
	public PageInfo<SysFactoryPO> queryFactorys(Integer fcId, Integer page_size, Integer page_num) {
		SysFactoryPOExample sysFactoryPOExample = new SysFactoryPOExample();
		Criteria createCriteria = sysFactoryPOExample.createCriteria();
		if(fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SysFactoryPO> sysFactoryPOs = sysFactoryPODao.selectByExample(sysFactoryPOExample);
		PageInfo<SysFactoryPO> pageInfo = new PageInfo<SysFactoryPO>(sysFactoryPOs);
		return pageInfo;
	}

	//添加工厂主数据
	public void insertFactory(SysFactoryPO factory) {
		sysFactoryPODao.insertSelective(factory);
	}

	//删除工厂主数据
	public void deleteFactory(Integer fcId) {
		sysFactoryPODao.deleteByPrimaryKey(fcId);
	}

	//修改工厂主数据
	public void updateFactory(SysFactoryPO factory) {
		sysFactoryPODao.updateByPrimaryKey(factory);
	}

}
