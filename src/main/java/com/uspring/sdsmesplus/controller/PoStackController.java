package com.uspring.sdsmesplus.controller;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.vo.OrderStockBomVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.PoStackService;
import com.uspring.sdsmesplus.wms.entity.Package;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

/**
 * @Version 1.0
 * @Description: 工单
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/6/21 13:57
 */
@Controller
@RequestMapping("/api/po_stack")
public class PoStackController extends BaseController{

	@Autowired
	private PoStackService poStackService;

	@ResponseBody
	@RequestMapping(value = "/{order_code}", method = RequestMethod.POST)
	@ApiOperation(value = "工单投料", response = Result.class)
	public Result workSheetFeeding(HttpServletResponse response, @PathVariable("order_code") String orderCode,
			@RequestBody List<Package> packags) throws Exception {
		Boolean result = poStackService.workSheetFeeding(orderCode, packags);
		return new Result("success", result, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/clean", method = RequestMethod.POST)
	@ApiOperation(value = "工单清线", response = Result.class)
	public Result retreat(HttpServletResponse response, @PathVariable("order_code") String orderCode) throws Exception {
		List<ProdCleanLogPO> prodBoxLogPOs = poStackService.clean(orderCode);
		return new Result("success", prodBoxLogPOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/clean/{box_barcode}", method = RequestMethod.POST)
	@ApiOperation(value = "物料退料", response = Result.class)
	public Result cleanstock(HttpServletResponse response, @PathVariable("order_code") String orderCode,
			@PathVariable("box_barcode") String boxCode) throws Exception {
		ProdCleanLogPO prodCleanPO = poStackService.cleanstock(orderCode, boxCode);
		return new Result("success", prodCleanPO, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/reprint", method = RequestMethod.POST)
	@ApiOperation(value = "清线合格证补打", response = Result.class)
	public Result reprinter(HttpServletResponse response, @PathVariable("order_code") String orderCode,
			@RequestBody ProdCleanLogPO prodCleanLogPO) throws Exception {
		poStackService.reprinter(orderCode, prodCleanLogPO);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}", method = RequestMethod.GET)
	@ApiOperation(value = "工单线上物料查询", response = Result.class)
	public Result findLineStock(HttpServletResponse response, @PathVariable("order_code") String orderCode,
			@RequestParam(value = "is_cleaned", required = false) Boolean iscleaned,
			@RequestParam(value = "is_open", required = false) Boolean isopen) throws Exception {
		List<ProdOrderStockPO> prodBoxLogPOs = poStackService.findLineStock(orderCode,iscleaned,isopen);
		return new Result("success", prodBoxLogPOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/statistic/{order_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询某一个工单的线上物料库存", response = Result.class)
	public Result findOrderMatStock(HttpServletResponse response, @PathVariable("order_code") String orderCode)
			throws Exception {
		List<OrderStockBomVO> orderStockBomVOs = poStackService.findOrderMatStock(orderCode);
		return new Result("success", orderStockBomVOs, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/clean_confirm/{box_barcode}", method = RequestMethod.POST)
	@ApiOperation(value = "清线合格证扫描确认", response = Result.class)
	public Result clean_confirm(HttpServletResponse response, @PathVariable("box_barcode") String box_barcode)
			throws Exception {
		poStackService.clean_confirm(box_barcode);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/cleanlog", method = RequestMethod.GET)
	@ApiOperation(value = "查询清线记录", response = Result.class)
	public Result cleanlog(HttpServletResponse response,
			@RequestParam(value = "order_code", required = false) String order_code,
			@RequestParam(value = "is_confirmed", required = false) Boolean is_confirmed,
			@RequestParam(value = "start_time", required = false) String start_time,
			@RequestParam(value = "end_time", required = false) String end_time,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) throws Exception {
		PageInfo<ProdCleanLogPO> cleanlog = poStackService.cleanlog(order_code, is_confirmed, start_time, end_time,
				page_size, page_num);
		return new Result("success", cleanlog, StatusCode.SUCCESS);
	}

}
