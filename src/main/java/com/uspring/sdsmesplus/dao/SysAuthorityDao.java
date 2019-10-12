package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysAuthorityPODao;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;


public interface SysAuthorityDao extends SysAuthorityPODao{
	
	List<SysAuthorityPO> queryAuth(@Param("role_id") Integer roleId);

	List<SysAuthorityPO> queryAllauth();
}