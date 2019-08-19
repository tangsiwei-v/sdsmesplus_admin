package com.uspring.sdsmesplus.controller;

import javax.servlet.http.HttpServletResponse;

import com.uspring.sdsmesplus.entity.vo.OrderProdStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uspring.sdsmesplus.entity.vo.DevProdStatus;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.ProdDeviceStockService;
import io.swagger.annotations.ApiOperation;

/** 
 * @ClassName: ProdStatusController 
 * @Description: 获取生产统计接口
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月10日 下午3:26:09
 *  
 */

@Controller
@RequestMapping("/api/prod_status")
public class ProdStatusController extends BaseController{
	
	@Autowired
	private ProdDeviceStockService prodDeviceStockService;
	
	@ResponseBody
	@RequestMapping(value ="/device/{dev_code}" , method = RequestMethod.GET)
	@ApiOperation(value="查询设备加工状态" , notes ="查询设备加工状态" ,  response = Result.class)
	public Result queryShiftClasses(HttpServletResponse response , @PathVariable("dev_code") String dev_code) {
	    DevProdStatus device = prodDeviceStockService.device(dev_code);
		return new Result("success", device, StatusCode.SUCCESS);
	}


	@ResponseBody
	@RequestMapping(value ="/order/{order_code}" , method = RequestMethod.GET)
	@ApiOperation(value="查询某个工单当前的加工情况" , notes ="查询设备加工状态" ,  response = Result.class)
	public Result queryOrderStatus(HttpServletResponse response , @PathVariable("order_code") String orderCode) {
		OrderProdStatus orderProdStatus = prodDeviceStockService.queryOrderStatus(orderCode);
		return new Result("success", orderProdStatus, StatusCode.SUCCESS);
	}


}
