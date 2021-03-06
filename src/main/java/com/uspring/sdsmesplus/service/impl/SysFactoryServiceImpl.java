package com.uspring.sdsmesplus.service.impl;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.SysFactoryDao;
import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.dao.generate.SysUserRolePODao;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.entity.po.UserPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample.Criteria;
import com.uspring.sdsmesplus.entity.po.SysUserRolePO;
import com.uspring.sdsmesplus.entity.po.SysUserRolePOExample;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;
import com.uspring.sdsmesplus.service.SysFactoryService;

@Service
public class SysFactoryServiceImpl implements SysFactoryService{
	
	@Autowired
	private SysFactoryDao sysFactoryDao;
	@Autowired
	private SysFactoryPODao sysFactoryPODao;
	@Autowired
	private SysUserRolePODao userRoleDao;
	
	@Override
	public List<FactoryVO> queryFactory(Integer fc_id, String fc_code) {
		// TODO Auto-generated method stub
		return sysFactoryDao.queryFactory(fc_id, fc_code);
	}

	@Override
	public List<FactoryVO> querytreenovsm(Integer fc_id, String fc_code) {
		// TODO Auto-generated method stub
		//根据权限查询工厂
		UserPO user = (UserPO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		String fcIds = null;
		if(!user.getUserAccount().equals("sdsadmin")){
			SysUserRolePOExample userRoleExample = new SysUserRolePOExample();
			userRoleExample.createCriteria().andUserIdEqualTo(user.getUserId());
			
			List<SysUserRolePO> userRoleList = this.userRoleDao.selectByExample(userRoleExample);
			
			List<Integer> factoryIdList = new ArrayList<Integer>();
			for(SysUserRolePO userRole:userRoleList){
				factoryIdList.add(userRole.getFactoryId());
			    if(fcIds == null){
			    	fcIds = userRole.getFactoryId()+"";
			    }else{
			    	fcIds += ","+userRole.getFactoryId();
			    }
			}
		}
		return sysFactoryDao.querytreenovsm(fc_id, fc_code, fcIds);
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
	public void insertFactory(SysFactoryPO factory) throws ServerException {
		if(factory == null)
			throw new ServerException("工厂数据不能为空");
		if(factory.getFcCode()==null || factory.getFcCode().equals("")) 
			throw new ServerException("工厂简码不能为空");
		if(factory.getFcName()==null || factory.getFcName().equals("")) 
			throw new ServerException("工厂名称不能为空");
		if(factory.getFcAddress()==null || factory.getFcAddress().equals("")) 
			throw new ServerException("工厂地址不能为空");
		if(factory.getFcDomain()==null || factory.getFcDomain().equals("")) 
			throw new ServerException("工厂域不能为空");
		if(factory.getFcSdsId()==null || factory.getFcSdsId().equals("")) 
			throw new ServerException("纳铁福工厂ID不能为空");
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

	//查询工厂主数据
	public List<SysFactoryPO> selectFactorys() {
		UserPO user = (UserPO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		List<SysFactoryPO> factorys = new ArrayList<SysFactoryPO>();
		if(user.getUserAccount().equals("sdsadmin")){
			factorys = sysFactoryPODao.selectByExample(null);
		}else{
			SysUserRolePOExample userRoleExample = new SysUserRolePOExample();
			userRoleExample.createCriteria().andUserIdEqualTo(user.getUserId());
			
			List<SysUserRolePO> userRoleList = this.userRoleDao.selectByExample(userRoleExample);
			
			List<Integer> factoryIdList = new ArrayList<Integer>();
			for(SysUserRolePO userRole:userRoleList){
				factoryIdList.add(userRole.getFactoryId());
			}
			
			SysFactoryPOExample factoryExample = new SysFactoryPOExample();
			factoryExample.createCriteria().andFcIdIn(factoryIdList);
			
			factorys = sysFactoryPODao.selectByExample(factoryExample);
		}

		return factorys;
	}

}
