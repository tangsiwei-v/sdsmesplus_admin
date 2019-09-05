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
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.entity.vo.SafeLunchOrderVO;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.SafelunchService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: SafelunchController
 * @Description: Safelunch相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年7月23日 上午10:16:53
 * 
 */

@Controller
@RequestMapping("/api/safelunch")
public class SafelunchController extends BaseController {
	@Autowired
	private SafelunchService safelunchService;

	@ResponseBody
	@RequestMapping(value = "/order/save", method = RequestMethod.POST)
	@ApiOperation(value = "结果暂存", notes = "结果暂存", response = Result.class)
	public Result save(HttpServletResponse response, @RequestBody SafeLunchOrderVO safeLunchOrder) {
		safeLunchOrder.setIsCommit(false);
		safelunchService.save(safeLunchOrder);
		return new Result("保存成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/box/reprint", method = RequestMethod.POST)
	@ApiOperation(value = "SafeLunch箱合格证补打", notes = "SafeLunch箱合格证补打", response = Result.class)
	public Result reprint(HttpServletResponse response,
			@RequestParam(value = "old_box_barcode", required = true) String old_box_barcode,
			@RequestParam(value = "new_box_barcode", required = true) String new_box_barcode,
			@RequestParam(value = "box_type", required = true) String box_type) {
		safelunchService.reprint(old_box_barcode, new_box_barcode, box_type);
		return new Result("补打成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/box/confirm/{safelunch_order}", method = RequestMethod.POST)
	@ApiOperation(value = "SafeLunch扫描确认", notes = "SafeLunch扫描确认", response = Result.class)
	public Result confirm(HttpServletResponse response, @PathVariable("safelunch_order") String safelunch_order) {
		safelunchService.confirm(safelunch_order);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	@ApiOperation(value = "查询SafeLunch记录", notes = "查询SafeLunch记录", response = Result.class)
	public Result queryOrder(HttpServletResponse response,
			@RequestParam(value = "isCommit", required = false) Boolean isCommit,
			@RequestParam(value = "saflineId", required = false) Integer saflineId,
			@RequestParam(value = "boxConfirmed", required = false) Boolean boxConfirmed,
			@RequestParam(value = "boxBarcode", required = false) String boxBarcode,
			@RequestParam(value = "start_time", required = false) String start_time,
			@RequestParam(value = "end_time", required = false) String end_time,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SafeLunchOrderVO> safeLunchOrders = safelunchService.queryOrder(isCommit, saflineId, boxConfirmed,
				boxBarcode, start_time, end_time, page_size, page_num);
		return new Result("success", safeLunchOrders, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workline", method = RequestMethod.GET)
	@ApiOperation(value = "查询SafeLunch产线主数据", notes = "查询SafeLunch产线主数据", response = Result.class)
	public Result querySafeLunch(HttpServletResponse response, @RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SafelunchWorkLinePO> safelunchWorkLines = safelunchService.queryWorkLine(fcId, page_size, page_num);
		return new Result("success", safelunchWorkLines, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/workline/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加SafeLunch产线主数据", notes = "添加SafeLunch产线主数据", response = Result.class)
	public Result insertSafeLunch(HttpServletResponse response, @RequestBody SafelunchWorkLinePO safelunchWorkLinePO) {
		safelunchService.insertSafeLunch(safelunchWorkLinePO);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workline/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改SafeLunch产线主数据", notes = "修改SafeLunch产线主数据", response = Result.class)
	public Result updateSafeLunch(HttpServletResponse response, @RequestBody SafelunchWorkLinePO safelunchWorkLinePO) {
		safelunchService.updateSafeLunch(safelunchWorkLinePO);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workline/item/{saflineId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除SafeLunch产线主数据", notes = "删除字SafeLunch产线主数据", response = Result.class)
	public Result deleteSafeLunch(HttpServletResponse response, @PathVariable("saflineId") Integer saflineId) {
		safelunchService.deleteSafeLunch(saflineId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
