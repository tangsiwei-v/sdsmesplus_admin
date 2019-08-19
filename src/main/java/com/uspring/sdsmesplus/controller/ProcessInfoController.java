package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.mpmlink.ProcessStep;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: ProcessInfoController
 * @Description:工艺相关API接口
 * @author: shangyanbing shangyanbing@uspring.cn
 * @date: 2019年8月9日 下午3:11:36
 */

@Controller
@RequestMapping("/api/process_info")
public class ProcessInfoController extends BaseController {
	@Autowired
	private MpmlinkService mpmlinkService;

	@ResponseBody
	@RequestMapping(value = "/{prod_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品的BOM信息", notes = "查询产品的BOM信息", response = Result.class)
	public Result queryDevice(HttpServletResponse response, @PathVariable("prod_code") String prod_code,
			@RequestParam(value = "line_id", required = true) Integer line_id) throws Exception {
		List<ProcessStep> processInfo = mpmlinkService.queryProcessSteps(prod_code,line_id);
		return new Result("查询成功", processInfo.get(0), StatusCode.SUCCESS);
	}
}
