/**
 * @Title: UserServiceImpl.java 
 * @Package com.uspring.template.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年3月28日 上午11:00:04 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.github.pagehelper.PageHelper;
import com.uspring.sdsmesplus.common.Encrypt;
import com.uspring.sdsmesplus.dao.UserDao;
import com.uspring.sdsmesplus.dao.generate.EmployeePODao;
import com.uspring.sdsmesplus.entity.po.EmployeePO;
import com.uspring.sdsmesplus.entity.po.EmployeePOExample;
import com.uspring.sdsmesplus.entity.po.UserPO;
import com.uspring.sdsmesplus.entity.po.UserPOExample;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.UserService;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: 用户服务实现类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年3月28日 上午11:00:04 
 *  
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EmployeePODao employeeDao;
	
	@Override
	public boolean addUser(UserPO user) {
		//默认密码123456
		user.setUserPasswd(Encrypt.md5("123456"));
		user.setUserId(null);
		userDao.insertSelective(user);
		return true;
	}

	@Override
	public boolean deleteUser(Integer userId) {
		userDao.deleteByPrimaryKey(userId);
		return true;
	}

	@Override
	public boolean updateUser(UserPO user) {
		UserPO oldUser = userDao.selectByPrimaryKey(user.getUserId());
		if(oldUser == null)
			return false;
		//密码不修改
		user.setUserPasswd(oldUser.getUserPasswd());
		userDao.updateByPrimaryKeySelective(user);
		return true;
	}

	@Override
	public boolean updatePassword(String oldPassword, String newPassword) {
		UserPO user = (UserPO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(!Encrypt.md5(oldPassword).equals(user.getUserPasswd()))
			return false;
		user.setUserPasswd(Encrypt.md5(newPassword));
		userDao.updateByPrimaryKey(user);
		return true;
	}

	@Override
	public boolean resetPassword(Integer userId) {
		UserPO user = userDao.selectByPrimaryKey(userId);
		user.setUserPasswd(Encrypt.md5("123456"));
		userDao.updateByPrimaryKey(user);
		return true;
	}

	@Override
	public boolean checkAccountExist(String account) {
		UserPOExample userExample = new UserPOExample();
		userExample.createCriteria().andUserAccountEqualTo(account);
		List<UserPO> userList = userDao.selectByExample(userExample);
		return userList != null && userList.size() >0;
	}

	@Override
	public UserVO queryUserById(Integer userId) {
		return userDao.findUserVOById(userId);
	}
	
	@Override
	public List<UserPO> queryAllUsers(int page, int pageSize, String keyWords) {
		UserPOExample userExample = new UserPOExample();
		UserPOExample.Criteria userCriteria = userExample.createCriteria();
		if(keyWords != null && !"".equals(keyWords))
			userCriteria.andUserAccountLike("%"+keyWords+"%");
		if(page > 0 && pageSize > 0)
			PageHelper.startPage(page, pageSize);
		return userDao.selectByExample(userExample);
	}

	@Override
	public UserVO userLogin(String userName, String password) {
		
		UserVO user = userDao.findUserVOByLogin(userName, Encrypt.md5(password));
		
		if(user == null || user.getUserId() == null)
			throw new ServiceException(StatusCode.WRONGPASS);
		else if(!user.getIsActive()){
			throw new ServiceException(StatusCode.USERDISABLE);
		}
		
		try {
			user.setToken(createToken(user));
		} catch (Exception e) {
			throw new ServiceException(StatusCode.RUNERROR);
		}
		
		//返回信息
		return user;
	}
	
	@Override
	public UserVO cardLogin(String cardId) {
		//查询员工信息
		EmployeePOExample example = new EmployeePOExample();
		example.createCriteria().andCardidEqualTo(cardId);
		List<EmployeePO> employees = employeeDao.selectByExample(example);
		if(employees == null || employees.size() == 0){
			throw new ServiceException("卡号不存在");
		}
		
		EmployeePO employee = employees.get(0);
		
		//关联用户信息
		UserVO userVO = userDao.findUserVOByAccount(employee.getBadge());
		if(userVO == null){
			//设置默认用户信息
			userVO = new UserVO();
			userVO.setEmpNumber(employee.getBadge());
			userVO.setUserAccount(employee.getBadge());
			userVO.setUserName(employee.getName());
			userVO.setUserEmail(employee.getCompEmail());
		}
		
		//设置TOKEN
		try {
			userVO.setToken(createToken(userVO));
		} catch (Exception e) {
			throw new ServiceException(StatusCode.RUNERROR);
		}
		
		return userVO;
	}
	
	private String createToken(UserPO user) throws IllegalArgumentException, UnsupportedEncodingException {
		String token;
		//计算token
		Calendar calend = Calendar.getInstance();
		calend.setTime(new Date());
		//默认登录超时时间2小时
		calend.add(Calendar.HOUR_OF_DAY, 12);
	
		Algorithm algorithmHS = null;
		algorithmHS = Algorithm.HMAC256("backtemplate");
		token = JWT.create()
				.withIssuer("front")
				.withClaim("userId", user.getUserId())
		        .withClaim("account", user.getUserAccount())
		        .withExpiresAt(calend.getTime())
		        .sign(algorithmHS);
		return token;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
