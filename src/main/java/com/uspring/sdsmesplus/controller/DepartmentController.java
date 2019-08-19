package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.SysFactoryService;
import com.uspring.sdsmesplus.service.SysLineProdmodelService;
import com.uspring.sdsmesplus.service.SysLineService;
import com.uspring.sdsmesplus.service.SysVsmServer;
import com.uspring.sdsmesplus.service.WorkShopServer;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DepartmentController
 * @Description: 工厂相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月25日 下午3:15:40
 * 
 */

@Controller
@RequestMapping("/api/department")
public class DepartmentController extends BaseController {

	@Autowired
	private SysFactoryService sysFactoryService;
	
	@Autowired
	private SysLineProdmodelService sysLineProdmodelService;
	
	@Autowired
	private SysLineService sysLineService;
	
	@Autowired
	private SysVsmServer sysVsmServer;
	
	@Autowired
	private WorkShopServer workShopServer;

	@ResponseBody
	@RequestMapping(value = "/workline/fulltree", method = RequestMethod.GET)
	@ApiOperation(value = "查询工厂、车间、工段、产线", notes = "查询工厂、车间、工段、产线", response = Result.class)
	public Result queryFactory(HttpServletResponse response,
			@RequestParam(value = "fc_id", required = false) Integer fc_id,
			@RequestParam(value = "fc_code", required = false) String fc_code) {
		List<FactoryVO> queryFactory = sysFactoryService.queryFactory(fc_id, fc_code);
		return new Result("查询成功", queryFactory, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workline/tree_novsm", method = RequestMethod.GET)
	@ApiOperation(value = "查询工厂、车间、产线", notes = "查询工厂、车间、产线", response = Result.class)
	public Result querytreenovsm(HttpServletResponse response,
			@RequestParam(value = "fc_id", required = false) Integer fc_id,
			@RequestParam(value = "fc_code", required = false) String fc_code) {
		List<FactoryVO> queryFactory = sysFactoryService.querytreenovsm(fc_id, fc_code);
		return new Result("查询成功", queryFactory, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workline/prodmodel/{line_id}", method = RequestMethod.GET)
	@ApiOperation(value = "产线生产模式查询", notes = "产线设备多条件查询", response = Result.class)
	public Result queryprodmodel(HttpServletResponse response, @PathVariable("line_id") Integer line_id) {
		SysLineProdmodelPO lineProdModel = sysLineProdmodelService.prodmodel(line_id);
		return new Result("查询成功", lineProdModel, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line", method = RequestMethod.GET)
	@ApiOperation(value = "查询产线主数据", notes = "查询产线主数据", response = Result.class)
	public Result queryLine(HttpServletResponse response,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "vsmId", required = false) Integer vsmId,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysLinePO> lines  = sysLineService.queryLine(shopId, vsmId, lineId, page_size, page_num);
		return new Result("查询成功", lines, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/vsm", method = RequestMethod.GET)
	@ApiOperation(value = "查询工段主数据", notes = "查询工段主数据", response = Result.class)
	public Result queryVsm(HttpServletResponse response,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "vsmId", required = false) Integer vsmId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysVsmPO> vsms  = sysVsmServer.queryVsm(shopId, vsmId, page_size, page_num);
		return new Result("查询成功", vsms, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/workshop", method = RequestMethod.GET)
	@ApiOperation(value = "查询车间主数据", notes = "查询车间主数据", response = Result.class)
	public Result queryWorkShop(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysWorkshopPO> workshops  = workShopServer.queryWorkShop(fcId, shopId, page_size, page_num);
		return new Result("查询成功", workshops, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/factory", method = RequestMethod.GET)
	@ApiOperation(value = "查询工厂主数据", notes = "查询工厂主数据", response = Result.class)
	public Result queryFactorys(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysFactoryPO> factorys  = sysFactoryService.queryFactorys(fcId, page_size, page_num);
		return new Result("查询成功", factorys, StatusCode.SUCCESS);
	}
}
