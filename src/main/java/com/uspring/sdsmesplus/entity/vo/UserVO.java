/**
 * @Title: UserVO.java 
 * @Package com.uspring.natiefu.mes.entity.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年8月31日 下午2:24:46 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.UserPO;

/** 
 * @ClassName: UserVO 
 * @Description: 用户视图对象
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年8月31日 下午2:24:46 
 *  
 */
public class UserVO extends UserPO{
	
	//用户拥有的权限
	private List<String> authorities;
	
	//用户拥有的角色
	private List<UserRoleVO> roles;
	
	private String token;


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<String> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}

	public List<UserRoleVO> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRoleVO> roles) {
		this.roles = roles;
	}
}
