package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.DeviceVerifyItemDao;
import com.uspring.sdsmesplus.dao.SysAuthorityDao;
import com.uspring.sdsmesplus.dao.generate.SysAuthorityPODao;
import com.uspring.sdsmesplus.dao.generate.SysRoleAuthPODao;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPOExample;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPOExample.Criteria;
import com.uspring.sdsmesplus.entity.vo.AuthorityVO;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;
import com.uspring.sdsmesplus.service.AuthorityService;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月6日 上午11:33:10
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	private SysAuthorityDao sysAuthorityDao;


	@Override
	public PageInfo<SysAuthorityPO> queryAuth(Integer roleId, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		
		List<SysAuthorityPO> sysAuthorityPOs = null;
		if(roleId == null) {
			sysAuthorityPOs = sysAuthorityDao.queryAllauth();
		}else {
			sysAuthorityPOs=sysAuthorityDao.queryAuth(roleId);
		}
		
		PageInfo<SysAuthorityPO> pageInfo = new PageInfo<SysAuthorityPO>(sysAuthorityPOs);
		return pageInfo;
	}

	@Override
	public void delAuth(Integer authId, String authCode) {
		if (authId != null) {
			sysAuthorityDao.deleteByPrimaryKey(authId);
		} else {

			SysAuthorityPOExample auExm = new SysAuthorityPOExample();
			Criteria createCriteria = auExm.createCriteria();

			if (authCode != "" && null != authCode) {
				createCriteria.andAuthCodeEqualTo(authCode);
				sysAuthorityDao.deleteByExample(auExm);
			}
		}
	}

	@Override
	public void putAuth(List<SysAuthorityPO> authorityPOs) {
		for (SysAuthorityPO sysAuthorityPO : authorityPOs) {
			sysAuthorityDao.updateByPrimaryKey(sysAuthorityPO);
		}

	}

	@Override
	public void addAuth(SysAuthorityPO authorityPO) {
		sysAuthorityDao.insertSelective(authorityPO);

	}

	@Override
	public List<AuthorityVO> queryTreeAuth() {
		List<AuthorityVO> treeAuths = sysAuthorityDao.queryTreeAuth();
       return treeAuths;
	}
	
}
