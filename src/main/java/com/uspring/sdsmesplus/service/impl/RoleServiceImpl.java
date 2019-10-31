package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.RoleDao;
import com.uspring.sdsmesplus.dao.generate.SysRoleAuthPODao;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPOExample;
import com.uspring.sdsmesplus.entity.vo.RoleVO;
import com.uspring.sdsmesplus.service.RoleService;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月6日 下午2:12:42
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private SysRoleAuthPODao sysRoleAuthPODao;

	@Override
	public PageInfo<RoleVO> queryRole(String user_account, String role_level, Integer page_size, Integer page_num) {
		
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);

		if (user_account != null && !user_account.equals(""))
			roleDao.queryRole(user_account, role_level);

		List<RoleVO> roleVOs = roleDao.queryRole(user_account, role_level);
		
		PageInfo<RoleVO> pageInfo = new PageInfo<RoleVO>(roleVOs);
		return pageInfo;
	}

	@Override
	@Transactional(isolation = Isolation.REPEATABLE_READ)
	public void delRole(Integer role_id) {
		roleDao.deleteByPrimaryKey(role_id);

		SysRoleAuthPOExample rolAuEx = new SysRoleAuthPOExample();
		rolAuEx.createCriteria().andRoleIdEqualTo(role_id);
		sysRoleAuthPODao.deleteByExample(rolAuEx);
	}

	@Override
	@Transactional(isolation = Isolation.REPEATABLE_READ)
	public void putRole(List<RoleVO> roleVOs) {
		for (RoleVO roleVO : roleVOs) {
			roleDao.updateByPrimaryKeySelective(roleVO);
			SysRoleAuthPOExample rolAuEx = new SysRoleAuthPOExample();
			rolAuEx.createCriteria().andRoleIdEqualTo(roleVO.getRoleId());
			sysRoleAuthPODao.deleteByExample(rolAuEx);
			List<SysAuthorityPO> sysAuthorityPOs = roleVO.getSysAuthorityPOs();
			for (SysAuthorityPO sysAuthorityPO : sysAuthorityPOs) {
				SysRoleAuthPO roleAuth = new SysRoleAuthPO();
				roleAuth.setAuthId(sysAuthorityPO.getAuthId());
				roleAuth.setRoleId(roleVO.getRoleId());
				sysRoleAuthPODao.insertSelective(roleAuth);
			}
		}
	}

	@Override
	@Transactional(isolation = Isolation.REPEATABLE_READ)
	public void addRole(RoleVO roleVO) {
		roleDao.addRole(roleVO);
		List<SysAuthorityPO> sysAuthorityPOs = roleVO.getSysAuthorityPOs();
		for (SysAuthorityPO sysAuthorityPO : sysAuthorityPOs) {
			SysRoleAuthPO roleAuth = new SysRoleAuthPO();
			roleAuth.setAuthId(sysAuthorityPO.getAuthId());
			roleAuth.setRoleId(roleVO.getRoleId());
			sysRoleAuthPODao.insertSelective(roleAuth);
		}
	}

}
