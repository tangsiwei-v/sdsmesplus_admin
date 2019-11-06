package com.uspring.sdsmesplus.controller;

import java.net.URLDecoder;
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
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictTypePO;
import com.uspring.sdsmesplus.entity.vo.DictDataVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DictDataService;
import com.uspring.sdsmesplus.service.ReportService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DictDataController
 * @Description: 字典相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月2日 下午4:06:34
 * 
 */

@Controller
@RequestMapping("/api/report")
public class ReportController {

	@Autowired
	private ReportService reportService;

	@ResponseBody
	@RequestMapping(value = "/box", method = RequestMethod.GET)
	@ApiOperation(value = "查询箱合格证信息", notes = "查询箱合格证信息", response = Result.class)
	public Result getBoxList(HttpServletResponse response,Integer lineId,String boxCode,String tuhao,String prodCode,String prodNumber,String beginTime,String endTime,String poCode, Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.getBoxList(lineId, boxCode, tuhao, prodCode, prodNumber, beginTime, endTime,poCode, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典类型", notes = "查询字典类型", response = Result.class)
	public Result getBarcodeList(HttpServletResponse response,Integer lineId,String boxCode,String barcode,String tuhao,String prodCode,String prodNumber,String beginTime,String endTime,Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.getProductList(lineId, boxCode, barcode, tuhao, prodCode, prodNumber, beginTime, endTime, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/info", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典类型", notes = "查询字典类型", response = Result.class)
	public Result getBarcodeInfo(HttpServletResponse response,String barcode) {
		barcode = URLDecoder.decode(barcode);
		return new Result("查询成功", this.reportService.getProductInfo(barcode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/material", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典类型", notes = "查询字典类型", response = Result.class)
	public Result getBarcodeMaterial(HttpServletResponse response,Integer fpId) {
		return new Result("查询成功", this.reportService.costMaterial(fpId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/process", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典类型", notes = "查询字典类型", response = Result.class)
	public Result getBarcodeProcess(HttpServletResponse response,String rfid,Integer lineId) {
		return new Result("查询成功", this.reportService.getProcessInfo(rfid, lineId), StatusCode.SUCCESS);
	}
}
