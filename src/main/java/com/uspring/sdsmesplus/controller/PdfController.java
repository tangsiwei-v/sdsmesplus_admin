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

import com.uspring.sdsmesplus.entity.po.SjqcPdfPO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.PdfService;

import io.swagger.annotations.ApiOperation;

/**
 * @ClassName: DeviceController
 * @Description: 产品轴管二维码
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年6月24日 下午4:25:34
 * 
 */

@Controller
@RequestMapping("/api/pdf")
public class PdfController extends BaseController {
	@Autowired
	private PdfService pdfService;

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ApiOperation(value = "查询申江pdf", notes = "查询申江pdf", response = Result.class)
	public Result queryPdf(HttpServletResponse response,
			@RequestParam(value = "fcId", required = false) Integer fcId,
			@RequestParam(value = "prodCode", required = false) String prodCode,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		
		return new Result("查询成功", this.pdfService.getPdfList(prodCode, pageNum, pageSize,fcId), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ApiOperation(value = "添加pdf", notes = "添加pdf", response = Result.class)
	public Result insertPdf(HttpServletResponse response, @RequestBody SjqcPdfPO pdfDo) {
		this.pdfService.insertPdf(pdfDo);
		return new Result("添加成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ApiOperation(value = "修改pdf", notes = "修改pdf", response = Result.class)
	public Result updatePdf(HttpServletResponse response, @RequestBody SjqcPdfPO pdfDo) {
		this.pdfService.updatePdf(pdfDo);
		return new Result("修改成功", "success", StatusCode.SUCCESS);
	}

	@ResponseBody
	@RequestMapping(value = "/{qcpId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "删除pdf", notes = "删除pdf", response = Result.class)
	public Result deletePdf(HttpServletResponse response, @PathVariable("qcpId") Integer qcpId) {
		this.pdfService.deletePdf(qcpId);
		return new Result("删除成功", "success", StatusCode.SUCCESS);
	}
}
