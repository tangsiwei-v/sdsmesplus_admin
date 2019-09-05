package com.uspring.sdsmesplus.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
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

	// 请求箱合格证
	@ResponseBody
	@RequestMapping(value = "/{order_code}/request", method = RequestMethod.GET)
	@ApiOperation(value = "请求装箱合格证，并打印合格证", response = Result.class)
	public Result requestBoxCode(HttpServletResponse response, @PathVariable("order_code") String order_code,
			@RequestParam(value = "box_quan", required = true) Integer boxQuan,
			@RequestParam(value = "glevel", required = false) String glevel) throws Exception {
		ProdBoxLogPO boxlog = packBoxService.requestBoxCode(order_code, boxQuan);
		return new Result("sucess", boxlog, StatusCode.SUCCESS);
	}

	// 下线装箱
	@ResponseBody
	@RequestMapping(value = "/{order_code}", method = RequestMethod.POST)
	@ApiOperation(value = "当生产到一箱，或者手动触发装箱时，调用本接口", response = Result.class)
	public Result createMachBox(HttpServletResponse response, @PathVariable("order_code") String order_code,
			@RequestBody(required = true) ProdBoxLogPO boxLog,
			@RequestParam(value = "mat_substract", required = false, defaultValue = "1") Boolean matSubstract)
			throws Exception {
		packBoxService.createMachBox(order_code, boxLog, matSubstract);
		return new Result("sucess", "", StatusCode.SUCCESS);
	}

	// 箱合格证补打
	@ResponseBody
	@RequestMapping(value = "/{order_code}/reprint", method = RequestMethod.POST)
	@ApiOperation(value = "向打印机发送该箱的打印指令", response = Result.class)
	public Result reprint(HttpServletResponse response, @PathVariable("order_code") String order_code,
			@RequestBody(required = true) ProdBoxLogPO boxLog) throws Exception {
		packBoxService.reprint(order_code, boxLog);
		return new Result("sucess", "", StatusCode.SUCCESS);
	}

	// 主数据查询
	@ResponseBody
	@RequestMapping(value = "/standard/{prod_code}", method = RequestMethod.GET)
	@ApiOperation(value = "查询产品装箱主数据", response = Result.class)
	public Result searchBoxInfo(HttpServletResponse response, @PathVariable("prod_code") String prod_code,
			@RequestParam(value = "customer_code", required = true) String customer_code,
			@RequestParam(value = "fc_id", required = false) Integer fc_id) {
		BoxInfoPO queryboxLog = packBoxService.queryboxLog(prod_code, customer_code, fc_id);
		return new Result("sucess", queryboxLog, StatusCode.SUCCESS);
	}

	// 请求过程码
	@ResponseBody
	@RequestMapping(value = "/wip/{dev_code}/request", method = RequestMethod.GET)
	@ApiOperation(value = "请求过程码", response = Result.class)
	public Result request(HttpServletResponse response, @PathVariable("dev_code") String dev_code,
			@RequestParam(value = "box_quan", required = true) Integer boxQuan,
			@RequestParam(value = "glevel", required = false) String glevel,
			@RequestParam(value = "furnace_no", required = false) String furnace_no) throws Exception {
		ProdBoxLogPO boxLog = packBoxService.request(dev_code, boxQuan, glevel, furnace_no);
		return new Result("sucess", boxLog, StatusCode.SUCCESS);
	}

	// 装箱查询
	@ResponseBody
	@RequestMapping(value = "boxlog", method = RequestMethod.GET)
	@ApiOperation(value = "多条件装箱查询", response = Result.class)
	public Result searchBoxLog(HttpServletResponse response, @RequestParam Map<String, Object> map) throws Exception {
		PageInfo<ProdBoxLogPO> boxLog = packBoxService.searchBoxLog(map);
		return new Result("sucess", boxLog, StatusCode.SUCCESS);
	}

	// 过程装箱
	@ResponseBody
	@RequestMapping(value = "/wip/{dev_code}", method = RequestMethod.POST)
	@ApiOperation(value = "过程装箱", response = Result.class)
	public Result wipBoxInfo(HttpServletResponse response, @PathVariable("dev_code") String dev_code,
			@RequestBody(required = true) ProdBoxLogPO boxLog) throws Exception {
		packBoxService.wipBoxInfo(dev_code, boxLog);
		return new Result("sucess", "", StatusCode.SUCCESS);
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
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<BoxInfoVO> queryboxLog = packBoxService.standard(prod_code, customer_code, fcId, page_size, page_num);
		return new Result("sucess", queryboxLog, StatusCode.SUCCESS);
	}

}
