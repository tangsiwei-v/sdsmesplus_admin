package com.uspring.sdsmesplus.controller;


import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.vo.BoxInfoVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.PackBoxService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: PackBoxController
 * @Description: 装箱相关接口
 * @author chengtengfei chengtengfei@uspring.cn
 * @date 2019年6月20日 下午15:00:41 cleaninfo
 *
 *
 */
@Controller
@RequestMapping("/api/package")
public class PackBoxController extends BaseController {

	@Autowired
	private PackBoxService packBoxService;

	// 主数据查询
	@ResponseBody
	@RequestMapping(value = "/standard/{prod_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品装箱主数据", response = Result.class)
	public Result searchBoxInfo(HttpServletResponse response, @PathVariable("prod_code") String prod_code,
			@RequestParam(value = "customer_code", required = true) String customer_code, String recevier_code,
			@RequestParam(value = "fc_id", required = false) Integer fc_id) {
		BoxInfoPO queryboxLog = packBoxService.queryboxLog(prod_code, customer_code,recevier_code, fc_id);
		return new Result("sucess", queryboxLog, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加装箱数主数据", notes = "添加装箱数主数据", response = Result.class)
	public Result insertBoxInfo(HttpServletResponse response, @RequestBody BoxInfoPO boxInfo) {
		packBoxService.insertBoxInfo(boxInfo);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改装箱数主数据", notes = "修改装箱数主数据", response = Result.class)
	public Result updateBoxInfo(HttpServletResponse response, @RequestBody BoxInfoPO boxInfo) {
		packBoxService.updateBoxInfo(boxInfo);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item/{bifId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除装箱数主数据", notes = "删除装箱数主数据", response = Result.class)
	public Result deleteBoxInfo(HttpServletResponse response, @PathVariable("bifId") Integer bifId) {
		packBoxService.deleteBoxInfo(bifId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}

	// 装箱数主数据查询
	@ResponseBody
	@RequestMapping(value = "/standard", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品装箱主数据", response = Result.class)
	public Result standard(HttpServletResponse response,
			@RequestParam(value = "prod_code", required = false) String prod_code,
			@RequestParam(value = "customer_code", required = false) String customer_code,
			@RequestParam(value = "fcId", required = false) Integer fcId,
		    @RequestParam(value = "recevier_code", required = false) String recevier_code,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<BoxInfoVO> queryboxLog = packBoxService.standard(prod_code, customer_code,recevier_code,fcId, page_size, page_num);
		return new Result("sucess", queryboxLog, StatusCode.SUCCESS);
	}

}
