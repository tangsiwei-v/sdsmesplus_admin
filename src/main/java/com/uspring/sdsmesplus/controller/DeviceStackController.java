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

import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceStackService;
import com.uspring.sdsmesplus.wms.entity.Package;

import io.swagger.annotations.ApiOperation;

/**
 * * @author 作者 E-mail:chengtengfei
 * 
 * @date 创建时间：2019年6月25日 下午5:27:50
 * @version 1.0 * @parameter
 * @since 设备物料投料查询
 * @return
 */
@RequestMapping("/api/device_stack")
@Controller
public class DeviceStackController {
	@Autowired
	private DeviceStackService deviceStackService;

	@ResponseBody
	@RequestMapping(value = "/{dev_code}", method = RequestMethod.POST)
	@ApiOperation(value = "将物料投入到某设备的线上库存", response = Result.class)
	public Result putEquipment(HttpServletResponse response, @PathVariable("dev_code") String devCode,
			@RequestBody Package packag) throws Exception {
		deviceStackService.putEquipment(devCode, packag);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{dev_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询某一个设备的线上物料库存", response = Result.class)
	public Result findEquipment(HttpServletResponse response, @PathVariable("dev_code") String devCode,
			@RequestParam(value = "is_cleaned", required = false) Boolean iscleaned,
			@RequestParam(value = "is_open", required = false) Boolean isopen)
			throws Exception {
		List<ProdDeviceStockPO>  prodBoxLogPOs = deviceStackService.findEquipment(devCode,iscleaned,isopen);
		return new Result("success", prodBoxLogPOs, StatusCode.SUCCESS);
	}
}
