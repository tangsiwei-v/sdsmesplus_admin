package com.uspring.sdsmesplus.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DictDataService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DictDataController
 * @Description: 字典相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月2日 下午4:06:34
 * 
 */

@Controller
@RequestMapping("/api/dict_data")
public class DictDataController {

	@Autowired
	private DictDataService dictDataService;

	@ResponseBody
	@RequestMapping(value = "/freeze_reason", method = RequestMethod.GET)
	@ApiOperation(value = "查询工单冻结原因", notes = "查询工单冻结原因", response = Result.class)
	public Result freezeReason(HttpServletResponse response) {
		List<DictDataPO> dictDatas = dictDataService.queryReason();
		return new Result("查询成功", dictDatas, StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典主数据", notes = "查询字典主数据", response = Result.class)
	public Result queryDictData(HttpServletResponse response,
			@RequestParam(value = "dt_code", required = false) String dt_code,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<DictDataPO> dictDatas = dictDataService.queryDictData(dt_code, page_size, page_num);
		return new Result("查询成功", dictDatas, StatusCode.SUCCESS);
	}
}
