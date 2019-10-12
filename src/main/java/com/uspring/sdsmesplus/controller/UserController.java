/**
 * @Title: UserController.java 
 * @Package com.uspring.template.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年3月28日 上午10:34:36 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.UserPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.UserService;

import io.swagger.annotations.ApiOperation;

/** 
 * @ClassName: UserController 
 * @Description: 用户相关API接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年3月28日 上午10:34:36 
 *  
 */

@Controller
@RequestMapping("/api/user")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value ="" , method = RequestMethod.POST)
	@ApiOperation(value="新增用户" , notes ="同时加入默认密码123456" ,  response = Result.class)
	public Result addUser(HttpServletResponse response , UserPO user) {
		userService.addUser(user);
		return new Result("添加用户成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/{userId}" , method = RequestMethod.DELETE)
	@ApiOperation(value="删除用户" , notes ="根据userId删除用户" ,  response = Result.class)
	public Result deleteUser(HttpServletResponse response ,@PathVariable Integer userId) {
		userService.deleteUser(userId);
		return new Result("删除用户成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/{userId}" , method = RequestMethod.PUT)
	@ApiOperation(value="修改用户" ,  response = Result.class)
	public Result updateUser(HttpServletResponse response , UserPO user, @PathVariable Integer userId) {
		user.setUserId(userId);
		userService.updateUser(user);
		return new Result("修改用户成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/user_repassword" , method = RequestMethod.PUT)
	@ApiOperation(value="用户修改密码" , notes ="用户自己修改密码， 要经过MD5校验 oldPassword " ,  response = Result.class)
	public Result updatePassword(HttpServletResponse response , String oldPassword ,String newPassword) {
		boolean result = userService.updatePassword(oldPassword , newPassword);
		if(result)
			return new Result("修改密码成功", result, StatusCode.SUCCESS);
		else
			return new Result("原密码错误", result, StatusCode.FAILED);
	}
	
	@ResponseBody
	@RequestMapping(value ="/user_repassword/{userId}" , method = RequestMethod.PUT)
	@ApiOperation(value="管理员重置登录密码" , notes ="管理员修改用户， 要经过MD5校验 oldPassword " ,  response = Result.class)
	public Result resetPassword(HttpServletResponse response ,@PathVariable Integer userId) {
		userService.resetPassword(userId);
		return new Result("重置密码成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/user_checkexist" , method = RequestMethod.GET)
	@ApiOperation(value="检查用户名是否存在" , notes ="新增用户时检查用户名是否存在" ,  response = Result.class)
	public Result resetPassword(HttpServletResponse response , String account) {
		boolean exist = userService.checkAccountExist(account);
		return new Result("查询成功", exist, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/{userId}" , method = RequestMethod.GET)
	@ApiOperation(value="查询特定用户当前信息 " , notes="查找其中的单个用户， 0表示获取当前用户信息",  response = Result.class)
	public Result getUserById(HttpServletResponse response , @PathVariable Integer userId) {
		UserPO user =  userService.queryUserById(userId);
		return new Result("查询成功", user, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/users" , method = RequestMethod.GET)
	@ApiOperation(value="查询所有用户" , notes="可选参数有分页，关键字",  response = Result.class)
	public Result getAllUser(HttpServletResponse response,  
			@RequestParam(required=false ,defaultValue = "-1") Integer page,
			@RequestParam(required=false) Integer pageSize, 
			@RequestParam(required=false , defaultValue ="") String keyWords) {
		List<UserPO> users = userService.queryAllUsers(page, pageSize, keyWords);
		return new Result("查询成功" , users , StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value ="/user_login" , method = RequestMethod.POST)
	@ApiOperation(value="用户登录" , notes ="同时写入相关session " ,  response = Result.class)
	public Result login(HttpServletResponse response , String account , String password) {
		UserVO user = userService.userLogin(account, password);
		return new Result("登录成功" , user , StatusCode.SUCCESS); 
	}
	
	@ResponseBody
	@RequestMapping(value ="/card_login" , method = RequestMethod.POST)
	@ApiOperation(value="卡号登录" , notes ="同时写入相关session " ,  response = Result.class)
	public Result cardLogin(String cardId) {
		UserVO user = userService.cardLogin(cardId);
		return new Result("登录成功" , user , StatusCode.SUCCESS); 
	}
	
	@ResponseBody
	@RequestMapping(value ="/queryUser" , method = RequestMethod.GET)
	@ApiOperation(value="查询用户角色权限" , notes="可选参数有分页，关键字",  response = Result.class)
	public Result getUser(HttpServletResponse response,  
			@RequestParam Map<String, Object> map) {
		PageInfo<UserVO> users = userService.queryUserVO(map);
		return new Result("查询成功" , users , StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/userVO", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除用户角色权限", notes = "删除用户角色权限", response = Result.class)
	public Result delUserVO(HttpServletResponse response,
			@RequestParam(value = "userId", required = true ) Integer userId) {
		userService.delUserVO(userId);
		return new Result("删除成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/userVO", method = RequestMethod.PUT)
	@ApiOperation(value = "修改用户角色权限", notes = "修改用户角色权限", response = Result.class)
	public Result putUser(HttpServletResponse response,
			@RequestBody UserVO user) {
		userService.putUser(user);
		return new Result("修改成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/userVO", method = RequestMethod.POST)
	@ApiOperation(value = "添加用户角色", notes = "添加用户角色", response = Result.class)
	public Result addUserVO(HttpServletResponse response,
			@RequestBody UserVO userVO) {
		userService.addUserVO(userVO);
		return new Result("添加角色权限成功", "", StatusCode.SUCCESS);
	}
	
}
