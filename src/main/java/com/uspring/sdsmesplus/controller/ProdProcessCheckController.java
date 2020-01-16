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
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceService;
import com.uspring.sdsmesplus.service.ProdProcessCheckService;
import com.uspring.sdsmesplus.service.SysQrcodeRulesService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceController
 * @Description: 产品工序确认
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/prodProcessCheck")
public class ProdProcessCheckController extends BaseController {
	@Autowired
	private ProdProcessCheckService prodProcessCheckService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品工序确认", notes = "查询产品工序确认", response = Result.class)
	public Result queryDevice(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "opCode", required = false) String opCode,
			@RequestParam(value = "prodCode", required = false) String prodCode,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		
		return new Result("查询成功", this.prodProcessCheckService.getProdProcessCheck(fcId, shopId, lineId, opCode, prodCode, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加产品工序确认", notes = "添加产品工序确认", response = Result.class)
	public Result insertDevice(HttpServletResponse response, @RequestBody ProdProcessCheckPO prodProcessCheckPO) {
		this.prodProcessCheckService.insertProdProcessCheck(prodProcessCheckPO);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改产品工序确认", notes = "修改产品工序确认", response = Result.class)
	public Result updateDevice(HttpServletResponse response, @RequestBody ProdProcessCheckPO prodProcessCheckPO) {
		this.prodProcessCheckService.updateProdProcessCheck(prodProcessCheckPO);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{ppcId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除产品工序确认", notes = "删除产品工序确认", response = Result.class)
	public Result deleteDevice(HttpServletResponse response, @PathVariable("ppcId") Integer ppcId) {
		this.prodProcessCheckService.deleteProcessCheck(ppcId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
