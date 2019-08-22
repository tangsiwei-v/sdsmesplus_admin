package com.uspring.sdsmesplus.controller;

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
import com.uspring.sdsmesplus.entity.po.ShiftPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.ShiftService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: WorkShiftController
 * @Description: 获取当前班次接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年7月8日 下午4:15:14
 * 
 */

@Controller
@RequestMapping("/api/work_shift")
public class WorkShiftController extends BaseController {
	@Autowired
	private ShiftService shiftService;

	@ResponseBody
	@RequestMapping(value = "/current_shift/{fcId}", method = RequestMethod.GET)
	@ApiOperation(value = "查询当前班次", notes = "查询当前班次", response = Result.class)
	public Result queryShiftClasses(HttpServletResponse response, @PathVariable("fcId") Integer fcId) {
		ShiftPO shiftClasses = shiftService.getShiftClasses(fcId);
		return new Result("success", shiftClasses, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询班次", notes = "查询班次", response = Result.class)
	public Result queryShift(HttpServletResponse response, @RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<ShiftPO> shiftClasses = shiftService.getShift(fcId, page_size, page_num);
		return new Result("success", shiftClasses, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加班次", notes = "添加班次", response = Result.class)
	public Result insertShift(HttpServletResponse response, @RequestBody ShiftPO shift) {
		shiftService.insertShift(shift);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改班次", notes = "修改班次", response = Result.class)
	public Result updateShift(HttpServletResponse response, @RequestBody ShiftPO shift) {
		shiftService.updateShift(shift);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item/{sfId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除班次", notes = "删除班次", response = Result.class)
	public Result deleteShift(HttpServletResponse response, @PathVariable("sfId") Integer sfId) {
		shiftService.deleteShift(sfId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

}
