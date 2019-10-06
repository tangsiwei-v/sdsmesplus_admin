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
import com.uspring.sdsmesplus.entity.po.SysRolePO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.entity.vo.RoleVO;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.AuthorityService;
import com.uspring.sdsmesplus.service.RoleService;

import io.swagger.annotations.ApiOperation;


@Controller
@RequestMapping("/api/role")
public class RoleController extends BaseController {

	@Autowired
	private RoleService roleService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询角色权限", notes = "查询角色权限", response = Result.class)
	public Result queryRole(HttpServletResponse response,
			@RequestParam(value = "user_account", required = false) String user_account,
			@RequestParam(value = "role_level", required = false) String role_level,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<RoleVO> roleVOs = roleService.queryRole(user_account,role_level, page_size, page_num);
		return new Result("查询成功", roleVOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除角色权限", notes = "删除角色权限", response = Result.class)
	public Result delRole(HttpServletResponse response,
			@RequestParam(value = "role_id", required = false ) Integer role_id) {
		roleService.delRole(role_id);
		return new Result("删除成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改角色权限", notes = "修改角色权限", response = Result.class)
	public Result putRole(HttpServletResponse response,
			@RequestBody List<RoleVO> roleVOs) {
		roleService.putRole(roleVOs);
		return new Result("修改成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加角色", notes = "添加角色", response = Result.class)
	public Result addRole(HttpServletResponse response,
			@RequestBody RoleVO roleVO) {
		roleService.addRole(roleVO);
		return new Result("添加角色权限成功", "", StatusCode.SUCCESS);
	}
	
}
