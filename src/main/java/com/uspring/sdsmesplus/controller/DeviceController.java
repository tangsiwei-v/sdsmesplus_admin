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
import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceController
 * @Description: 设备相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/device")
public class DeviceController extends BaseController {
	@Autowired
	private DeviceService deviceService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询设备主数据", notes = "查询设备主数据", response = Result.class)
	public Result queryDevice(HttpServletResponse response,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "devId", required = false) Integer devId,
			@RequestParam(value = "dev_code", required = false) String dev_code,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<DevicePO> queryDevice = deviceService.queryDevice(lineId, devId, dev_code, page_size, page_num);
		return new Result("查询成功", queryDevice, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加设备主数据", notes = "添加设备主数据", response = Result.class)
	public Result insertDevice(HttpServletResponse response, @RequestBody DevicePO devicePO) {
		deviceService.insertDevice(devicePO);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改设备主数据", notes = "修改设备主数据", response = Result.class)
	public Result updateDevice(HttpServletResponse response, @RequestBody DevicePO devicePO) {
		deviceService.updateDevice(devicePO);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item/{devId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除设备主数据", notes = "删除设备主数据", response = Result.class)
	public Result deleteDevice(HttpServletResponse response, @PathVariable("devId") Integer devId) {
		deviceService.deleteDevice(devId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
