package com.uspring.sdsmesplus.controller;

import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.FinishedProductService;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Version 1.0
 * @Description: 成品管理
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/1 11:15
 */
@Controller
@RequestMapping("/api/finished_product")
public class FinishedProductController extends BaseController {

	@Autowired
	private FinishedProductService finishedProductService;

	@ResponseBody
	@RequestMapping(value = "/{fp_barcode}", method = RequestMethod.POST)
	@ApiOperation(value = "产品下线", response = Result.class)
	public Result productOut(HttpServletResponse response, @PathVariable("fp_barcode") String fp_barcode,
			 @RequestParam(value = "weightVerifyWithOutRfid",defaultValue = "true") boolean weightVerifyWithOutRfid, @RequestBody ProdFinishedProductPO prodFinishedProductPO)
			throws Exception {

		return new Result("success",
				finishedProductService.productOut(fp_barcode, weightVerifyWithOutRfid, prodFinishedProductPO),
				StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{fp_barcode}/replace/{fp_barcode_new}", method = RequestMethod.PUT)
	@ApiOperation(value = "总成替换", response = Result.class)
	public Result productReplace(HttpServletResponse response, @PathVariable("fp_barcode") String fp_barcode,
			@PathVariable("fp_barcode_new") String fp_barcode_new) throws Exception {

		return new Result("success", finishedProductService.productReplace(fp_barcode, fp_barcode_new),
				StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{fp_barcode}", method = RequestMethod.DELETE)
	@ApiOperation(value = "总成报废", response = Result.class)
	public Result productDelete(HttpServletResponse response, @PathVariable("fp_barcode") String fp_barcode)
			throws Exception {

		return new Result("success", finishedProductService.productDelete(fp_barcode), StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{fp_barcode}/change_status/{to_status}", method = RequestMethod.PUT)
	@ApiOperation(value = "总成状态修改", response = Result.class)
	public Result change_status(HttpServletResponse response, @PathVariable("fp_barcode") String fp_barcode,
			@PathVariable("to_status") String to_status) throws Exception {

		return new Result("success", finishedProductService.change_status(fp_barcode, to_status), StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/print", method = RequestMethod.GET)
	@ApiOperation(value = "总成补打", response = Result.class)
	public Result print(HttpServletResponse response,
			@RequestParam(value = "prod_code", required = true) String prod_code,
			@RequestParam(value = "customer_code", required = true) String customer_code,
			@RequestParam(value = "line_id", required = true) Integer line_id) {
		finishedProductService.print(prod_code, customer_code, line_id);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "总成查询", response = Result.class)
	public Result getProds(HttpServletResponse response, @RequestParam Map<String, Object> para) throws Exception {

		return new Result("success", finishedProductService.getProds(para), StatusCode.SUCCESS);
	}

}
