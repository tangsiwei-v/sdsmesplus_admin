package com.uspring.sdsmesplus.controller;

import java.rmi.ServerException;
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
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;
import com.uspring.sdsmesplus.entity.vo.LineStoragebinVO;
import com.uspring.sdsmesplus.entity.vo.LineVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.entity.vo.VsmVO;
import com.uspring.sdsmesplus.entity.vo.WorkshopVO;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.LineStoragebinService;
import com.uspring.sdsmesplus.service.SysFactoryService;
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
	private SysLineService sysLineService;

	@Autowired
	private SysVsmServer sysVsmServer;

	@Autowired
	private WorkShopServer workShopServer;
	
	@Autowired
	private LineStoragebinService lineStoragebinService;

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
	@RequestMapping(value = "/line", method = RequestMethod.GET)
	@ApiOperation(value = "查询产线主数据", notes = "查询产线主数据", response = Result.class)
	public Result queryLine(HttpServletResponse response,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "vsmId", required = false) Integer vsmId,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<LineVO> lines = sysLineService.queryLine(shopId, vsmId, lineId, page_size, page_num);
		return new Result("查询成功", lines, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加产线主数据", notes = "添加产线主数据", response = Result.class)
	public Result insertLine(HttpServletResponse response, @RequestBody SysLinePO linePO) {
		sysLineService.insertLine(linePO);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改产线主数据", notes = "修改产线主数据", response = Result.class)
	public Result updateLine(HttpServletResponse response, @RequestBody SysLinePO linePO) {
		sysLineService.updateLine(linePO);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line/item/{lineId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除产线主数据", notes = "删除产线主数据", response = Result.class)
	public Result deleteLine(HttpServletResponse response, @PathVariable("lineId") Integer lineId) {
		sysLineService.deleteLine(lineId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/vsm", method = RequestMethod.GET)
	@ApiOperation(value = "查询工段主数据", notes = "查询工段主数据", response = Result.class)
	public Result queryVsm(HttpServletResponse response,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "vsmId", required = false) Integer vsmId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<VsmVO> vsms = sysVsmServer.queryVsm(shopId, vsmId, page_size, page_num);
		return new Result("查询成功", vsms, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/vsm/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加工段主数据", notes = "添加工段主数据", response = Result.class)
	public Result insertVsm(HttpServletResponse response, @RequestBody SysVsmPO vsm) {
		sysVsmServer.insertVsm(vsm);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/vsm/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改工段主数据", notes = "修改工段主数据", response = Result.class)
	public Result updateVsm(HttpServletResponse response, @RequestBody SysVsmPO vsm) {
		sysVsmServer.updateVsm(vsm);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/vsm/item/{vsmId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除工段主数据", notes = "删除工段主数据", response = Result.class)
	public Result deleteVsm(HttpServletResponse response, @PathVariable("vsmId") Integer vsmId) {
		sysVsmServer.deleteVsm(vsmId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workshop", method = RequestMethod.GET)
	@ApiOperation(value = "查询车间主数据", notes = "查询车间主数据", response = Result.class)
	public Result queryWorkShop(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<WorkshopVO> workshops = workShopServer.queryWorkShop(fcId, shopId, page_size, page_num);
		return new Result("查询成功", workshops, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workshop/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加车间主数据", notes = "添加车间主数据", response = Result.class)
	public Result insertWorkshop(HttpServletResponse response, @RequestBody SysWorkshopPO workshop) {
		workShopServer.insertWorkshop(workshop);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workshop/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改车间主数据", notes = "修改车间主数据", response = Result.class)
	public Result updateWorkshop(HttpServletResponse response, @RequestBody SysWorkshopPO workshop) {
		workShopServer.updateWorkshop(workshop);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/workshop/item/{shopId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除车间主数据", notes = "删除车间主数据", response = Result.class)
	public Result deleteWorkshop(HttpServletResponse response, @PathVariable("shopId") Integer shopId) {
		workShopServer.deleteWorkshop(shopId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/factory", method = RequestMethod.GET)
	@ApiOperation(value = "查询工厂主数据", notes = "查询工厂主数据", response = Result.class)
	public Result queryFactorys(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<SysFactoryPO> factorys = sysFactoryService.queryFactorys(fcId, page_size, page_num);
		return new Result("查询成功", factorys, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/factorys", method = RequestMethod.GET)
	@ApiOperation(value = "查询工厂主数据", notes = "查询工厂主数据", response = Result.class)
	public Result selectFactorys(HttpServletResponse response) {
		List<SysFactoryPO> factorys = sysFactoryService.selectFactorys();
		return new Result("查询成功", factorys, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/factory/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加工厂主数据", notes = "添加工厂主数据", response = Result.class)
	public Result insertFactory(HttpServletResponse response, @RequestBody SysFactoryPO factory)
			throws ServerException {
		sysFactoryService.insertFactory(factory);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/factory/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改工厂主数据", notes = "修改工厂主数据", response = Result.class)
	public Result updateFactory(HttpServletResponse response, @RequestBody SysFactoryPO factory) {
		sysFactoryService.updateFactory(factory);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/factory/item/{fcId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除工厂主数据", notes = "删除工厂主数据", response = Result.class)
	public Result deleteFactory(HttpServletResponse response, @PathVariable("fcId") Integer fcId) {
		sysFactoryService.deleteFactory(fcId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line_storagebins", method = RequestMethod.GET)
	@ApiOperation(value = "查询产线库位主数据", notes = "查询产线库位主数据", response = Result.class)
	public Result selectLineStoragebins(HttpServletResponse response,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<LineStoragebinVO> lineStoragebins = lineStoragebinService.selectLineStoragebins(lineId,page_size,page_num);
		return new Result("查询成功", lineStoragebins, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line_storagebins/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加产线库位主数据", notes = "添加产线库位主数据", response = Result.class)
	public Result insertLineStoragebins(HttpServletResponse response, @RequestBody SysLineStoragebinPO lineStoragebin)
			throws ServerException {
		lineStoragebinService.insertLineStoragebins(lineStoragebin);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line_storagebins/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改产线库位主数据", notes = "修改产线库位主数据", response = Result.class)
	public Result updateLineStoragebins(HttpServletResponse response, @RequestBody SysLineStoragebinPO lineStoragebin) {
		lineStoragebinService.updateLineStoragebins(lineStoragebin);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/line_storagebins/item/{linbinId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除产线库位主数据", notes = "删除产线库位主数据", response = Result.class)
	public Result deleteLineStoragebins(HttpServletResponse response, @PathVariable("linbinId") Integer linbinId) {
		lineStoragebinService.deleteLineStoragebins(linbinId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

}
