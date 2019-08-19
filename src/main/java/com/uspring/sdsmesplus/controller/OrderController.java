/**
 * @Title: OrderController.java
 * @Package com.uspring.sdsmesplus.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author chengtengfei 
 * @date 2019年6月18日 上午11:40:41
 * @version V1.0
 */
package com.uspring.sdsmesplus.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.OrderService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: OrderController
 * @Description: 订单相关接口
 * @author chengtengfei chengtengfei@uspring.cn
 * @date 2019年6月18日 上午11:40:41 cleaninfo
 *
 *
 */
@Controller
@RequestMapping("/api/order")
public class OrderController extends BaseController {

	@Autowired
	private OrderService orderService;

	@ResponseBody
	@RequestMapping(value = "/{order_code}/freeze", method = RequestMethod.POST)
	@ApiOperation(value = "工单冻结", response = Result.class)
	public Result updateOrderFreeze(HttpServletResponse response, @PathVariable("order_code") String order_code,
			@RequestParam(value = "freeze_id", required = true) Integer freezeId,
			@RequestParam(value = "freeze_reason", required = true) String reason) throws Exception {
		orderService.updateOrderStadus(order_code);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/unfreeze", method = RequestMethod.POST)
	@ApiOperation(value = "工单解冻", response = Result.class)
	public Result updateOrderUnFreeze(HttpServletResponse response, @PathVariable("order_code") String order_code)
			throws Exception {
		orderService.updateOrderUnFreeze(order_code);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{order_code}/start", method = RequestMethod.POST)
	@ApiOperation(value = "工单开启", response = Result.class)
	public Result updateOrderStar(HttpServletResponse response, @PathVariable("order_code") String order_code)
			throws Exception {
		orderService.updateOrderStar(order_code);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "工单查询", response = Result.class)
	public Result selectOrder(HttpServletResponse response, @RequestParam Map<String, Object> map) throws Exception {
		PageInfo<PlanOrderVO> plans = orderService.selectOrder(map);
		return new Result("success", plans, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{order_code}/close", method = RequestMethod.POST)
	@ApiOperation(value = "工单关闭", response = Result.class)
	public Result updateOrderclose(HttpServletResponse response, @PathVariable("order_code") String order_code)
			throws Exception {
		orderService.updateOrderclose(order_code);
		return new Result("success", "", StatusCode.SUCCESS);
	}

	

}
