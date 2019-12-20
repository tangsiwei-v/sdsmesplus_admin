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

import com.uspring.sdsmesplus.entity.po.SysMaterialInheritPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.MaterialInheritService;
import com.uspring.sdsmesplus.service.PdfService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceController
 * @Description: 产品轴管二维码
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/material")
public class MaterialInheritController extends BaseController {
	@Autowired
	private MaterialInheritService materialInheritService;

	@ResponseBody
	@RequestMapping(value = "/inherit", method = RequestMethod.GET)
	@ApiOperation(value = "查询物料的继承关系", notes = "查询物料", response = Result.class)
	public Result queryPdf(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "matCode", required = false) String matCode,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		
		return new Result("查询成功", this.materialInheritService.getMaterialInherit(pageNum, pageSize, fcId, matCode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/inherit", method = RequestMethod.POST)
	@ApiOperation(value = "添加物料的继承关系", notes = "添加物料", response = Result.class)
	public Result insertPdf(HttpServletResponse response, @RequestBody SysMaterialInheritPO materialInheritPo) {
		this.materialInheritService.insertMaterialInherit(materialInheritPo);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/inherit", method = RequestMethod.PUT)
	@ApiOperation(value = "修改物料的继承关系", notes = "修改物料", response = Result.class)
	public Result updatePdf(HttpServletResponse response, @RequestBody SysMaterialInheritPO materialInheritPo) {
		this.materialInheritService.updateMaterialInherit(materialInheritPo);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/inherit/{mathId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除物料的继承关系", notes = "删除pdf", response = Result.class)
	public Result deletePdf(HttpServletResponse response, @PathVariable("mathId") Integer mathId) {
		this.materialInheritService.deleteMaterialInherit(mathId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/bom", method = RequestMethod.GET)
	@ApiOperation(value = "获取产品的bom信息", notes = "", response = Result.class)
	public Result getProdBom(HttpServletResponse response, String prodCode, Integer fcId) {
		return new Result("查询成功", this.materialInheritService.getProdBOM(prodCode, fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/prodCode/info", method = RequestMethod.GET)
	@ApiOperation(value = "获取产品的基本信息", notes = "", response = Result.class)
	public Result get(HttpServletResponse response, String prodCode) {
		return new Result("查询成功", this.materialInheritService.getMtInfo(prodCode), StatusCode.SUCCESS);
	}
	
	
}
