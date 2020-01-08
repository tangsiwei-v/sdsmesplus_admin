package com.uspring.sdsmesplus.controller;

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
import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformTroubleCodePO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.vo.DeviceVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.DeviceService;
import com.uspring.sdsmesplus.service.NonconformTroubleCodeService;
import com.uspring.sdsmesplus.service.SysQrcodeRulesService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: NonconformCodeController
 * @Description: 不合格品缺陷模式
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/nonconform/troucode")
public class NonconformCodeController extends BaseController {
	@Autowired
	private NonconformTroubleCodeService nonconfromCodeSerice;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询缺陷模式", notes = "查询缺陷模式", response = Result.class)
	public Result queryDevice(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "shopId", required = false) Integer shopId,
			@RequestParam(value = "vsmId", required = false) Integer vsmId,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		
		return new Result("查询成功", this.nonconfromCodeSerice.getNonconformTrouCode(fcId, pageNum, pageSize,shopId, vsmId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加不合格品缺陷模式", notes = "添加不合格品缺陷模式", response = Result.class)
	public Result insertDevice(HttpServletResponse response, @RequestBody NonconformTroubleCodePO nonconformPo) {
		this.nonconfromCodeSerice.insertNonconformTrouCode(nonconformPo);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改不合格品缺陷模式", notes = "修改不合格品缺陷模式", response = Result.class)
	public Result updateDevice(HttpServletResponse response, @RequestBody NonconformTroubleCodePO nonconformPo) {
		this.nonconfromCodeSerice.updateNonconformTrouCode(nonconformPo);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{trcId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除不合格品缺陷模式", notes = "删除不合格品缺陷模式", response = Result.class)
	public Result deleteDevice(HttpServletResponse response, @PathVariable("trcId") Integer trcId) {
		this.nonconfromCodeSerice.deleteNonconformTrouCode(trcId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
