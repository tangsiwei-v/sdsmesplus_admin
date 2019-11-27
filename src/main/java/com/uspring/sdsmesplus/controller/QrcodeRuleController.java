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
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceService;
import com.uspring.sdsmesplus.service.SysQrcodeRulesService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceController
 * @Description: 产品轴管二维码
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/qrcode_rules")
public class QrcodeRuleController extends BaseController {
	@Autowired
	private SysQrcodeRulesService qrcodeService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品轴管二维码规则", notes = "查询产品轴管二维码", response = Result.class)
	public Result queryDevice(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "prodCode", required = false) String prodCode,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		
		return new Result("查询成功", this.qrcodeService.getQrcodeRules(fcId, pageNum, pageSize, prodCode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加轴管二维码规则", notes = "添加轴管二维码规则", response = Result.class)
	public Result insertDevice(HttpServletResponse response, @RequestBody SysQrcodeRulePO qrCodePo) {
		this.qrcodeService.insertQrcodeRules(qrCodePo);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改轴管二维码规则", notes = "修改轴管二维码规则", response = Result.class)
	public Result updateDevice(HttpServletResponse response, @RequestBody SysQrcodeRulePO qrCodePo) {
		this.qrcodeService.updateQrcodeRules(qrCodePo);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{qrId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除轴管二维码规则", notes = "删除轴管二维码规则", response = Result.class)
	public Result deleteDevice(HttpServletResponse response, @PathVariable("qrId") Integer qrId) {
		this.qrcodeService.deleteQrcodeRules(qrId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
