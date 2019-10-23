package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysRolePODao;
import com.uspring.sdsmesplus.entity.vo.RoleVO;

public interface RoleDao extends SysRolePODao {

	List<RoleVO> queryRole(@Param("user_account") String user_account, @Param("role_level") String role_level);

	void deleteRole(@Param("role_id")  Integer role_id);

	void updateRole(RoleVO roleVO);

	void addRole(RoleVO roleVO);
	
}