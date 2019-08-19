package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPO;
import com.uspring.sdsmesplus.entity.vo.NonconformProductVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.NonconformProductService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: NonconformProductController
 * @Description: 不合格品相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年7月30日 上午11:10:23
 * 
 */

@Controller
@RequestMapping("/api/nonconform_product")
public class NonconformProductController extends BaseController {
	@Autowired
	private NonconformProductService nonconformProductService;
	
	@ResponseBody
	@RequestMapping(value = "/record", method = RequestMethod.POST)
	@ApiOperation(value = "不合格品信息录入", notes = "不合格品信息录入", response = Result.class)
	public Result saveNonconformProduct(HttpServletResponse response, @RequestBody NonconformProductVO nonconformProductVO) {
		nonconformProductService.saveNonconformProduct(nonconformProductVO);
		return new Result("保存成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/material/compute", method = RequestMethod.POST)
	@ApiOperation(value = "查询不合格品零件信息", notes = "查询不合格品零件信息", response = Result.class)
	public Result compute(HttpServletResponse response, @RequestBody NonconformProductLogPO nonconformProductPO) throws Exception {
		List<NonconformProductMaterialPO> nonconformProductMaterials = nonconformProductService.compute(nonconformProductPO);
		return new Result("查询成功", nonconformProductMaterials , StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/record/confirm", method = RequestMethod.POST)
	@ApiOperation(value = "不合格品确认", notes = "不合格品确认", response = Result.class)
	public Result confirm(HttpServletResponse response, @RequestBody NonconformProductVO nonconformProductVO) {
		nonconformProductService.confirm(nonconformProductVO);
		return new Result("保存成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/record", method = RequestMethod.GET)
	@ApiOperation(value = "查询不合格品记录", notes = "查询不合格品记录", response = Result.class)
	public Result record(HttpServletResponse response, @RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "shiftId", required = false) Integer shiftId,
			@RequestParam(value = "status", required = false) String status,
			@RequestParam(value = "start_time", required = false) String start_time,
			@RequestParam(value = "end_time", required = false) String end_time,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<NonconformProductVO> nonconformProductVOs = nonconformProductService.record(fcId, shopId, lineId, shiftId,
				status, start_time, end_time, page_size, page_num);
		return new Result("查询成功", nonconformProductVOs, StatusCode.SUCCESS);
	}
}
