/**
 * @Title: OrderController.java
 * @Package com.uspring.sdsmesplus.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author chengtengfei 
 * @date 2019年6月18日 上午11:40:41
 * @version V1.0
 */
package com.uspring.sdsmesplus.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
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
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "工单查询", response = Result.class)
	public Result selectOrder(HttpServletResponse response, @RequestParam Map<String, Object> map) throws Exception {
		PageInfo<PlanOrderPO> plans = orderService.selectOrder(map,0,response);
		return new Result("success", plans, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/export", method = RequestMethod.POST)
	@ApiOperation(value = "工单查询", response = Result.class)
	public Result exportOrder(HttpServletResponse response, @RequestParam Map<String, Object> map) throws Exception {
		PageInfo<PlanOrderPO> plans = orderService.selectOrder(map,1,response);
		return new Result("success", plans, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/non_print_tmpl", method = RequestMethod.GET)
	@ApiOperation(value = "查询某工厂无条码打印模板的工单", response = Result.class)
	public Result selectOrder(HttpServletResponse response, @RequestParam(value = "fc_id", required = false) Integer fcId) throws Exception {
		List<PlanOrderPO> plans = orderService.selectPrinterByFactory(fcId);
		return new Result("success", plans, StatusCode.SUCCESS);
	}
}
