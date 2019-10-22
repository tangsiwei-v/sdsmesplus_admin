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
import com.uspring.sdsmesplus.entity.vo.AgvConfigKqVO;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.AgvConfigKqServer;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: AgvConfigKqController
 * @Description: Agv相关API接口
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月22日 下午12:30:32
 */

@Controller
@RequestMapping("/api/agv")
public class AgvConfigKqController extends BaseController {

	@Autowired
	private AgvConfigKqServer ageConfigKqServer;

	@ResponseBody
	@RequestMapping(value = "queryAgvs", method = RequestMethod.GET)
	@ApiOperation(value = "查询Agv配置主数据", notes = "查询Agv配置主数据", response = Result.class)
	public Result queryAgvConfig(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "lineId", required = false) Integer lineId,
			@RequestParam(value = "page_size", required = false) Integer page_size,
			@RequestParam(value = "page_num", required = false) Integer page_num) {
		PageInfo<AgvConfigKqVO> queryFactory = ageConfigKqServer.queryAgvConfig(fcId, lineId, page_size, page_num);
		return new Result("查询成功", queryFactory, StatusCode.SUCCESS);
	}
}
