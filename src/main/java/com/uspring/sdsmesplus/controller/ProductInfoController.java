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
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.PrinterTmplService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: ProductinfoController
 * @Description: 产品条码规则接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年7月10日 下午3:26:09
 * 
 */

@Controller
@RequestMapping("/api/product_info")
public class ProductInfoController extends BaseController {
	
	@Autowired
	private PrinterTmplService printerTmplService;
	
	@ResponseBody
	@RequestMapping(value = "/printer_tmpl", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品条码模板规则", notes = "查询产品条码模板规则", response = Result.class)
	public Result printerTmpl(HttpServletResponse response,
			@RequestParam(value = "prod_code", required = false) String prod_code,
			@RequestParam(value = "customer_code", required = false) String customer_code,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysPrinterTmplPO> printerTmpls =  printerTmplService.printerTmpl(prod_code,customer_code,fcId,page_size,page_num);
		return new Result("success", printerTmpls, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加产品条码模板规则", notes = "添加产品条码模板规则", response = Result.class)
	public Result insertPrinterTmpl(HttpServletResponse response, @RequestBody SysPrinterTmplPO printerTmpl) {
		printerTmplService.insertPrinterTmpl(printerTmpl);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/printer_tmpl/tmpl_file", method = RequestMethod.PUT)
	@ApiOperation(value = "条码模板上传", notes = "修改条码模板", response = Result.class)
	public Result updatePrinterTmpl(HttpServletResponse response,
			@RequestParam(value = "prod_code", required = true) String prod_code,
			@RequestParam(value = "customer_code", required = true) String customer_code,
			@RequestParam(value = "file", required = true) MultipartFile file) throws Exception {
		printerTmplService.updatePrinterTmpl(prod_code,customer_code,file);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/item/{ptmplId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除条码模板上传", notes = "删除条码模板上传", response = Result.class)
	public Result deletePrinterTmpl(HttpServletResponse response, @PathVariable("ptmplId") Integer ptmplId) {
		printerTmplService.deletePrinterTmpl(ptmplId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
