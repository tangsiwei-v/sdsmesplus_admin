package com.uspring.sdsmesplus.controller;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uspring.sdsmesplus.common.DateUtils;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
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
	public Result getBoxList(HttpServletResponse response,Integer lineId,String boxCode,String tuhao,String prodCode,String prodNumber,String beginTime,String endTime,String poCode, Integer pageNum,Integer pageSize,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getBoxList(lineId, boxCode, tuhao, prodCode, prodNumber, beginTime, endTime,poCode, pageNum, pageSize, shopId, fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品总成信息", notes = "查询产品总成信息", response = Result.class)
	public Result getBarcodeList(HttpServletResponse response,Integer lineId,String boxCode,String barcode,String tuhao,String prodCode,String prodNumber,String poCode,String beginTime,String endTime,
			Integer pageNum,Integer pageSize,Integer shopId,Integer fcId,@RequestParam(defaultValue="0",value="isExprot",required=false) Integer ixExport) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getProductList(response, lineId, boxCode, barcode, tuhao, prodCode, prodNumber,poCode, beginTime, endTime, pageNum, pageSize, shopId, fcId, ixExport), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/barcode/export", method = RequestMethod.POST)
	@ApiOperation(value = "导出精确追溯数据", notes = "导出精确追溯数据", response = Result.class)
	public Result exportBarcodeList(HttpServletResponse response,Integer lineId,String boxCode,String barcode,String tuhao,String prodCode,String prodNumber,String poCode,String beginTime,String endTime,
			Integer pageNum,Integer pageSize,Integer shopId,Integer fcId,@RequestParam(defaultValue="0",value="isExprot",required=false) Integer ixExport) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getProductList(response, lineId, boxCode, barcode, tuhao, prodCode, prodNumber,poCode, beginTime, endTime, pageNum, pageSize, shopId, fcId, ixExport), StatusCode.SUCCESS);
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
		endTime = DateUtils.dealEndTime(endTime);
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
	public Result getOrderStock(HttpServletResponse response,String poCode,String prodCode,String beginTime,String endTime,Integer pageNum,Integer pageSize,Integer lineId,String prodNumber,String matProdCode,String matProdNumber,String boxCode,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getOrderStock(poCode, prodCode, beginTime, endTime, pageNum, pageSize, lineId,prodNumber,matProdCode,matProdNumber,boxCode,shopId,fcId), StatusCode.SUCCESS);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/stock_statist", method = RequestMethod.GET)
	@ApiOperation(value = "线上库存查询", notes = "统计线上库存信息", response = Result.class)
	public Result getOrderStockStatisc(Integer lineId, String poCode, String procCode, 
			String matProdCode, String matProdNumber, String boxCode, String groupBy, 
			String beginTime, String endTime, Integer pageNum, Integer pageSize, Integer isCleaned, Integer shopId, Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功"
				, this.reportService.statOrderStock(lineId, poCode, procCode, matProdCode, 
				matProdNumber, boxCode, groupBy, beginTime, endTime, pageNum, pageSize, isCleaned, shopId, fcId)
				, StatusCode.SUCCESS);
	}

	
	@ResponseBody
	@RequestMapping(value = "/waste", method = RequestMethod.GET)
	@ApiOperation(value = "不合格品查询", notes = "不合格品查询", response = Result.class)
	public Result getProductWaste(HttpServletResponse response,Integer lineId,String prodCode,String prodNumber,String beginTime,String endTime,Integer pageNum,Integer pageSize,String matProdCode,String matProdNumber,String status,String poCode,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getWasteProd(lineId, prodCode, prodNumber, beginTime, endTime, pageNum, pageSize, matProdCode, matProdNumber, status, poCode,shopId,fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/waste/material", method = RequestMethod.GET)
	@ApiOperation(value = "不合格品零件", notes = "不合格品零件", response = Result.class)
	public Result getProductWasteMaterial(HttpServletResponse response,Integer lineId,String nplBarcode,String beginTime,String endTime,String matProdCode,String matProdNumber,Integer pageNum,Integer pageSize,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getWasteProdMaterial(lineId, nplBarcode, beginTime, endTime, matProdCode, matProdNumber, pageNum, pageSize, shopId, fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/process/material", method = RequestMethod.GET)
	@ApiOperation(value = "工序物料记录", notes = "工序物料记录", response = Result.class)
	public Result getProcessMaterial(HttpServletResponse response,Integer lineId,String poCode,String prodCode,String prodNumber,String beginTime,String endTime,String matProdCode,String matProdNumber,Integer pageNum,Integer pageSize,String batchNo,String furnaceNo,String matBoxCode,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getMachMaterial(lineId, poCode, prodCode, prodNumber, batchNo, furnaceNo, beginTime, endTime, pageNum, pageSize, matProdCode, matProdNumber,matBoxCode,shopId,fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/safelunch", method = RequestMethod.GET)
	@ApiOperation(value = "查询safelunch记录", notes = "工序物料记录", response = Result.class)
	public Result getSafelunch(HttpServletResponse response,Integer lineId,String poCode,String prodCode,String prodNumber,String boxCode,String beginTime,String endTime,Integer pageNum,Integer pageSize,Integer safelineId,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getSafeLunch(lineId, poCode, prodCode, prodNumber, boxCode, beginTime, endTime, pageNum, pageSize, safelineId,shopId,fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/safelunch/detail", method = RequestMethod.GET)
	@ApiOperation(value = "查询safelunch详情", notes = "查询safelunch详情", response = Result.class)
	public Result getSafelunchDetail(HttpServletResponse response,Integer lineId,String poCode,String prodCode,String prodNumber,String boxCode,String beginTime,String endTime,String safeLunchOrder,Integer pageNum,Integer pageSize,Integer safelineId,String fpBarcode,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getSafeLunchDetail(lineId, poCode, prodCode, prodNumber, boxCode, beginTime, endTime, safeLunchOrder, pageNum, pageSize, safelineId, fpBarcode, shopId, fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/safelunch/line", method = RequestMethod.GET)
	@ApiOperation(value = "查询safelunch产线", notes = "查询safelunch产线", response = Result.class)
	public Result getSafelunchLine(HttpServletResponse response,Integer fcId) {
		return new Result("查询成功", this.reportService.getSafeLunchWorkLine(fcId), StatusCode.SUCCESS);
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/box/material", method = RequestMethod.GET)
	@ApiOperation(value = "箱物料使用查询", notes = "箱物料使用查询", response = Result.class)
	public Result getBoxMaterialUserInfo(HttpServletResponse response,Integer lineId,String prodCode,String matProdCode,String boxCode,String matBoxCode,Integer pageNum,Integer pageSize,String beginTime,String endTime,String furnaceNo,String batchNo) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.boxMaterialUseInfo(lineId, beginTime, endTime, prodCode, matProdCode, boxCode, matBoxCode, pageNum, pageSize, furnaceNo, batchNo), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/order/detail", method = RequestMethod.GET)
	@ApiOperation(value = "查询工单详细信息", notes = "查询工单详细信息", response = Result.class)
	public Result getOrderDetail(HttpServletResponse response,Integer lineId,String poCode,String prodCode,String prodNumber,String beginTime,String endTime,Integer pageNum,Integer pageSize,Integer shopId,Integer fcId) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getOrderDetail(lineId, shopId, fcId, prodCode, prodNumber, poCode, beginTime, endTime, pageNum, pageSize), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/order/detail/type", method = RequestMethod.GET)
	@ApiOperation(value = "查询工单某项的详细信息", notes = "查询工单某项的详细信息", response = Result.class)
	public Result getOrderDetailByType(HttpServletResponse response,Integer type,String poCode,Integer pageNum,Integer pageSize) {
		return new Result("查询成功", this.reportService.getOrderDetailInfoByType(poCode, type, pageNum, pageSize), StatusCode.SUCCESS);

	}
	
	@ResponseBody
	@RequestMapping(value = "/clean/detail", method = RequestMethod.GET)
	@ApiOperation(value = "查询清线记录", notes = "查询清线记录", response = Result.class)
	public Result getCleanInfo(HttpServletResponse response,Integer fcId, Integer shopId, Integer lineId, String poCode, String prodCode, String prodNumber, String matProdCode, String matProdNumber, String boxCode, String matBoxCode, String beginTime, String endTime, String type, Integer pageNum, Integer pageSize) {
		endTime = DateUtils.dealEndTime(endTime);
		return new Result("查询成功", this.reportService.getCleanInfo(fcId, shopId, lineId, poCode, prodCode, prodNumber, matProdCode, matProdNumber, boxCode, matBoxCode, beginTime, endTime, type, pageNum, pageSize), StatusCode.SUCCESS);
	}
}
