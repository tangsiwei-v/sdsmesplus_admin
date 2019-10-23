package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.vo.AuthorityVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.AuthorityService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/api/authority")
public class AuthorityController extends BaseController {

	@Autowired
	private AuthorityService authorityService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询角色权限", notes = "查询角色权限", response = Result.class)
	public Result queryAuth(HttpServletResponse response,
			@RequestParam(value = "roleId", required = false) Integer roleId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysAuthorityPO> authorityPOs = authorityService.queryAuth(roleId, page_size, page_num);
		return new Result("查询成功", authorityPOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除角色权限", notes = "删除角色权限", response = Result.class)
	public Result delAuth(HttpServletResponse response,
			@RequestParam(value = "auth_id", required = false) Integer authId,
			@RequestParam(value = "auth_code", required = false) String authCode) {
		authorityService.delAuth(authId, authCode);
		return new Result("删除成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改权限", notes = "修改权限", response = Result.class)
	public Result putAuth(HttpServletResponse response, @RequestBody List<SysAuthorityPO> authorityPOs) {
		authorityService.putAuth(authorityPOs);
		return new Result("修改成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加权限", notes = "添加权限", response = Result.class)
	public Result addAuth(HttpServletResponse response, @RequestBody SysAuthorityPO authorityPO) {
		authorityService.addAuth(authorityPO);
		return new Result("添加权限成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/queryAuthTree", method = RequestMethod.GET)
	@ApiOperation(value = "查询角色权限", notes = "查询角色权限", response = Result.class)
	public Result queryAuthTree(HttpServletResponse response) {
		List<AuthorityVO> authorityPOs = authorityService.queryTreeAuth();
		return new Result("查询成功", authorityPOs, StatusCode.SUCCESS);
	}

}
