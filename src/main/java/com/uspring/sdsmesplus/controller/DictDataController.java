package com.uspring.sdsmesplus.controller;

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
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictTypePO;
import com.uspring.sdsmesplus.entity.vo.DictDataVO;
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
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典主数据", notes = "查询字典主数据", response = Result.class)
	public Result queryDictData(HttpServletResponse response,
			@RequestParam(value = "dt_code", required = false) String dt_code,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<DictDataVO> dictDatas = dictDataService.queryDictData(dt_code, page_size, page_num);
		return new Result("查询成功", dictDatas, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.POST)
	@ApiOperation(value = "添加字典主数据", notes = "添加字典主数据", response = Result.class)
	public Result insertDictData(HttpServletResponse response, @RequestBody DictDataPO dictDataPO) {
		dictDataService.insertDictData(dictDataPO);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item", method = RequestMethod.PUT)
	@ApiOperation(value = "修改字典主数据", notes = "修改字典主数据", response = Result.class)
	public Result updateDictData(HttpServletResponse response, @RequestBody DictDataPO dictDataPO) {
		dictDataService.updateDictData(dictDataPO);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/item/{ddId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除字典主数据", notes = "删除字典主数据", response = Result.class)
	public Result deleteDictData(HttpServletResponse response, @PathVariable("ddId") Integer ddId) {
		dictDataService.deleteDictData(ddId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/dictionary_type", method = RequestMethod.GET)
	@ApiOperation(value = "查询字典类型", notes = "查询字典类型", response = Result.class)
	public Result queryDtCode(HttpServletResponse response) {
		List<DictTypePO> queryDtCode = dictDataService.queryDtCode();
		return new Result("查询成功", queryDtCode, StatusCode.SUCCESS);
	}
}
