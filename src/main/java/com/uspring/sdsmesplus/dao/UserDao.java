/**
 * @Title: UserVODAO.java 
 * @Package com.uspring.template.dao.base 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月12日 下午3:35:34 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.UserPODao;
import com.uspring.sdsmesplus.entity.vo.UserVO;

/** 
 * @ClassName: UserVODAO 
 * @Description: 自定义User数据库操作类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月12日 下午3:35:34 
 *  
 */
public interface UserDao extends UserPODao {

	/** 
	* @Title: findUserVOById 
	* @Description: 根据UserId查找用户
	* @param userId 用户ID
	* @return  用户实体类
	*/
	UserVO findUserVOById(int userId);
	
	/** 
	* @Title: findUserVOByAccount 
	* @Description: 根据账号查找用户
	* @param account 用户账号
	* @return  用户实体类
	*/
	UserVO findUserVOByAccount(String account);
	
	/** 
	* @Title: findUserVOByLogin 
	* @Description: 根据账号密码查找用户
	* @param account 账号
	* @param password 密码
	* @return  用户实体类
	*/
	UserVO findUserVOByLogin(@Param("account")String account, @Param("password")String password);
	
	/** 
	* @Title: queryUserVO 
	* @Description: 用户多条件查询
	* @param queryMap 查询条件MAP
	* @return  用户实体类列表
	*/
	List<UserVO> queryUserVO(Map<String, Object> queryMap);
}
