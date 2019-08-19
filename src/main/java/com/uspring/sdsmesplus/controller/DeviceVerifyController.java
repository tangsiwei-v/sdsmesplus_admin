package com.uspring.sdsmesplus.controller;

import java.util.List;

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
import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPO;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceVerifyItemServer;
import com.uspring.sdsmesplus.service.DeviceVerifyLogService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceVerifyController
 * @Description: 设备相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月26日 下午2:15:45
 * 
 */

@Controller
@RequestMapping("/api/device_verify")
public class DeviceVerifyController extends BaseController {
	@Autowired
	private DeviceVerifyLogService deviceVerifyLogService;

	@Autowired
	private DeviceVerifyItemServer deviceVerifyItemServer;

	@ResponseBody
	@RequestMapping(value = "/{line_id}", method = RequestMethod.GET)
	@ApiOperation(value = "查询产线的设备防错要求", notes = "查询产线的设备防错要求", response = Result.class)
	public Result queryDeviceVerifyLog(HttpServletResponse response, @PathVariable("line_id") Integer line_id) {
		List<DeviceVerifyLogPO> deviceVerifyLog = deviceVerifyLogService.queryDeviceVerifyLog(line_id);
		return new Result("查询成功", deviceVerifyLog, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{line_id}", method = RequestMethod.POST)
	@ApiOperation(value = "新增设备防错记录", notes = "新增设备防错验证结果", response = Result.class)
	public Result insertDeviceVerifyLog(HttpServletResponse response, @PathVariable("line_id") Integer line_id,
			@RequestBody List<DeviceVerifyLogPO> deviceVerify) {
		deviceVerifyLogService.insertDeviceVerifyLog(deviceVerify, line_id);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/isneeded", method = RequestMethod.POST)
	@ApiOperation(value = "设备防错", notes = "检查是否做过设备防错", response = Result.class)
	public Result findDeviceVerifyLog(HttpServletResponse response, @PathVariable("order_code") String order_code) {
		boolean findDeviceVerifyLog = deviceVerifyLogService.findDeviceVerifyLog(order_code);
		return new Result("success", findDeviceVerifyLog, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加设备防错要求", notes = "添加设备防错要求", response = Result.class)
	public Result insertDeviceVerify(HttpServletResponse response,
			@RequestBody SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemServer.insertDeviceVerify(deviceVerifyItem);
		return new Result("添加成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改设备防错要求", notes = "修改设备防错要求", response = Result.class)
	public Result updateDeviceVerify(HttpServletResponse response,
			@RequestBody SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemServer.updateDeviceVerify(deviceVerifyItem);
		return new Result("修改成功", "", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/item/{dviId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除设备防错要求", notes = "删除设备防错要求", response = Result.class)
	public Result deleteDeviceVerify(HttpServletResponse response, @PathVariable("dviId") Integer dviId) {
		deviceVerifyItemServer.deleteDeviceVerify(dviId);
		return new Result("删除成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	@ApiOperation(value = "查询设备防错要求", notes = "查询设备防错要求", response = Result.class)
	public Result queryDeviceVerify(HttpServletResponse response,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysDeviceVerifyItemPO> deviceVerifyLogPOs = deviceVerifyItemServer.queryDeviceVerifyLog(lineId,
				page_size, page_num);
		return new Result("查询成功", deviceVerifyLogPOs, StatusCode.SUCCESS);
	}
}
