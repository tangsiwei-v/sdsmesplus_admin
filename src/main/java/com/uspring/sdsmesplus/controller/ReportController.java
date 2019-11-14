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
	@ApiOperation(value = "查询产品总成信息", notes = "查询产品总成信息", response = Result.class)
	public Result getBarcodeList(HttpServletResponse response,Integer lineId,String boxCode,String barcode,String tuhao,String prodCode,String prodNumber,String poCode,String beginTime,String endTime,Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.getProductList(lineId, boxCode, barcode, tuhao, prodCode, prodNumber,poCode, beginTime, endTime, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/info", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品的基本信息", notes = "查询产品的基本信息", response = Result.class)
	public Result getBarcodeInfo(HttpServletResponse response,String barcode) {
		barcode = URLDecoder.decode(barcode);
		return new Result("查询成功", this.reportService.getProductInfo(barcode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/material", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品的物料信息", notes = "查询产品的物料信息", response = Result.class)
	public Result getBarcodeMaterial(HttpServletResponse response,Integer fpId) {
		return new Result("查询成功", this.reportService.costMaterial(fpId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/process", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品的工序", notes = "查询产品的工序", response = Result.class)
	public Result getBarcodeProcess(HttpServletResponse response,String rfid,Integer lineId) {
		return new Result("查询成功", this.reportService.getProcessInfo(rfid, lineId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/material", method = RequestMethod.GET)
	@ApiOperation(value = "查询物料使用", notes = "查询物料使用", response = Result.class)
	public Result getMaterialList(HttpServletResponse response,String fpBarcode,String boxCode,String materialCode,String batchNo,String furnaceNo,String prodCode,String materialBoxCode,
			String beginTime,String endTime,Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.useMaterialInfo(fpBarcode, boxCode, materialCode, batchNo, furnaceNo, prodCode, materialBoxCode, beginTime, endTime, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/inverseQuery", method = RequestMethod.GET)
	@ApiOperation(value = "三大件反查", notes = "查询物料使用", response = Result.class)
	public Result getInverseQuery(HttpServletResponse response,Integer type,String value,Integer fcId) {
		return new Result("查询成功", this.reportService.getInverseQuery(type, value, fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/orderStock", method = RequestMethod.GET)
	@ApiOperation(value = "线边库存查询", notes = "查询线边库存记录", response = Result.class)
	public Result getOrderStock(HttpServletResponse response,String poCode,String prodCode,String beginTime,String endTime,Integer pageNum,Integer pageSize,Integer lineId,String prodNumber,String matProdCode,String matProdNumber,String boxCode) {
		return new Result("查询成功", this.reportService.getOrderStock(poCode, prodCode, beginTime, endTime, pageNum, pageSize, lineId,prodNumber,matProdCode,matProdNumber,boxCode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/waste", method = RequestMethod.GET)
	@ApiOperation(value = "不合格品查询", notes = "不合格品查询", response = Result.class)
	public Result getProductWaste(HttpServletResponse response,Integer lineId,String prodCode,String prodNumber,String beginTime,String endTime,Integer pageNum,Integer pageSize,String matProdCode,String matProdNumber,String status,String poCode) {
		return new Result("查询成功", this.reportService.getWasteProd(lineId, prodCode, prodNumber, beginTime, endTime, pageNum, pageSize, matProdCode, matProdNumber, status, poCode), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/waste/material", method = RequestMethod.GET)
	@ApiOperation(value = "不合格品零件", notes = "不合格品零件", response = Result.class)
	public Result getProductWasteMaterial(HttpServletResponse response,Integer lineId,String nplBarcode,String beginTime,String endTime,String matProdCode,String matProdNumber,Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.getWasteProdMaterial(lineId, nplBarcode, beginTime, endTime, matProdCode, matProdNumber, pageNum, pageSize), StatusCode.SUCCESS);
	}
}
