package com.uspring.sdsmesplus.controller;

import javax.servlet.http.HttpServletResponse;

import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.vo.DeviceVerifyItemVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceVerifyItemServer;
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
	private DeviceVerifyItemServer deviceVerifyItemServer;

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加设备防错要求", notes = "添加设备防错要求", response = Result.class)
	public Result insertDeviceVerify(HttpServletResponse response,
			@RequestBody SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemServer.insertDeviceVerifyItem(deviceVerifyItem);
		return new Result("添加成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改设备防错要求", notes = "修改设备防错要求", response = Result.class)
	public Result updateDeviceVerify(HttpServletResponse response,
			@RequestBody SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemServer.updateDeviceVerifyItem(deviceVerifyItem);
		return new Result("修改成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item/{dviId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除设备防错要求", notes = "删除设备防错要求", response = Result.class)
	public Result deleteDeviceVerify(HttpServletResponse response, @PathVariable("dviId") Integer dviId) {
		deviceVerifyItemServer.deleteDeviceVerifyItem(dviId);
		return new Result("删除成功", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	@ApiOperation(value = "查询设备防错要求", notes = "查询设备防错要求", response = Result.class)
	public Result queryDeviceVerify(HttpServletResponse response,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "fcId", required = false) Integer fcId) {
		PageInfo<DeviceVerifyItemVO> deviceVerifyLogPOs = deviceVerifyItemServer.queryDeviceVerifyItem(lineId,
				page_size, page_num, shopId, fcId);
		return new Result("查询成功", deviceVerifyLogPOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	@ApiOperation(value = "查询申江连接轴是否跳过某台设备", notes = "查询申江连接轴是否跳过某台设备", response = Result.class)
	public Result queryPordProcessCheck(Integer lineId, String prodCode, Integer page_size, Integer page_num) {
		PageInfo<ProdProcessCheckPO> prodProcessCheckPOPageInfo = this.deviceVerifyItemServer.queryPordProcessCheckService(lineId, prodCode, page_size, page_num);
		return new Result("查询成功", prodProcessCheckPOPageInfo, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/check/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加申江连接轴是否跳过某台设备", notes = "添加申江连接轴是否跳过某台设备", response = Result.class)
	public Result insertPordProcessCheck(@RequestBody ProdProcessCheckPO prodProcessCheckPO) {
		return new Result("添加成功", this.deviceVerifyItemServer.insertPordProcessCheckService(prodProcessCheckPO), StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/check/update", method = RequestMethod.PUT)
	@ApiOperation(value = "修改申江连接轴是否跳过某台设备", notes = "修改申江连接轴是否跳过某台设备", response = Result.class)
	public Result updatePordProcessCheck(@RequestBody ProdProcessCheckPO prodProcessCheckPO) {
		return new Result("修改成功", this.deviceVerifyItemServer.updatePordProcessCheckService(prodProcessCheckPO), StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/check/delete/{ppId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除申江连接轴是否跳过某台设备", notes = "删除申江连接轴是否跳过某台设备", response = Result.class)
	public Result deletePordProcessCheck(@PathVariable("ppId") Integer ppId) {
		return new Result("删除成功", this.deviceVerifyItemServer.deletePordProcessCheckService(ppId), StatusCode.SUCCESS);
	}
}
