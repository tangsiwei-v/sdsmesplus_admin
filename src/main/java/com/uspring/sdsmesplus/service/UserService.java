/**
 * @Title: UserService.java 
 * @Package com.uspring.template.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年3月28日 上午10:37:32 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.UserPO;
import com.uspring.sdsmesplus.entity.vo.UserVO;


/** 
 * @ClassName: UserService 
 * @Description: 用户服务接口,需继承UserDetailsService，以便满足Spring Security
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年3月28日 上午10:37:32 
 *  
 */
public interface UserService extends UserDetailsService{
	
	public abstract boolean addUser(UserPO user);
	
	public abstract boolean deleteUser(Integer userId);
	
	public abstract boolean updateUser(UserPO user);
	
	public abstract boolean updatePassword(String oldPassword, String newPassword);
	
	public abstract boolean resetPassword(Integer userId);
	
	public abstract boolean checkAccountExist(String account);
	
	public abstract UserVO queryUserById(Integer userId);
	
	public abstract List<UserPO> queryAllUsers(int page, int pageSize, String keyWords);
	
	public abstract UserVO userLogin(String userName , String password) ;
	
	/** 
	* @Title: cardLogin 
	* @Description: 卡号登录
	* @param cardId 卡号
	* @return  用户对象
	*/
	public UserVO cardLogin(String cardId);

	//修改用户角色权限
	public abstract void putUser(UserVO user);
	//增加用户角色权限
	public abstract void addUserVO(UserVO userVO);
	//删除用户角色权限
	public abstract void delUserVO(Integer userId);
	//查询用户角色权限
	public abstract PageInfo<UserVO> queryUserVO(Map<String, Object> map);
}
