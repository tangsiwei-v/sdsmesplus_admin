package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.SkillVerifyService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: SkillVerifyController
 * @Description: 人员设备相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年7月19日 下午4:02:13
 * 
 */

@Controller
@RequestMapping("/api/skill_verify")
public class SkillVerifyController extends BaseController {

	@Autowired
	private SkillVerifyService skillVerifyService;

	@ResponseBody
	@RequestMapping(value = "/{order_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询产线的设备防错要求", notes = "查询产线的设备防错要求", response = Result.class)
	public Result querySkillVerifyLog(HttpServletResponse response, @PathVariable("order_code") String order_code)
			throws Exception {
		List<ProdSkillVerifyLogPO> skillVerifyLogs = skillVerifyService.querySkillVerify(order_code);
		return new Result("查询成功", skillVerifyLogs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{line_id}", method = RequestMethod.POST)
	@ApiOperation(value = "人员技能验证结果提交", notes = "人员技能验证结果提交", response = Result.class)
	public Result insertSkillVerifyLog(HttpServletResponse response, @PathVariable("line_id") Integer line_id,
			@RequestBody List<ProdSkillVerifyLogPO> skillVerifyLog) {
		skillVerifyService.insertSkillVerifyLog(skillVerifyLog,line_id);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{order_code}/isneeded", method = RequestMethod.POST)
	@ApiOperation(value = "人员防错", notes = "检查是否做过人员防错", response = Result.class)
	public Result findSkillVerifyLog(HttpServletResponse response, @PathVariable("order_code") String order_code) {
		boolean findSkillVerifyLog = skillVerifyService.findSkillVerifyLog(order_code);
		return new Result("success", findSkillVerifyLog, StatusCode.SUCCESS);
	}
}
