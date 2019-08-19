package com.uspring.sdsmesplus.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.entity.vo.USFile;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.FileService;

import io.swagger.annotations.ApiOperation;

/** 
 * @ClassName: FileUploadController 
 * @Description: 文件上传接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年4月8日 下午10:35:22 
 *  
 */
@Controller
@RequestMapping(value = "/api/file")
public class FileUploadController {

	@Autowired
	private FileService fileService;

	@ResponseBody
	@RequestMapping(value = "/upload" , method = RequestMethod.POST)
	@ApiOperation(value = "上传图片" , notes = "图片" , response = Result.class)
	public Result doUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) {
		USFile usfile = fileService.upFile(file);
		return new Result("success", usfile, StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/upload_base64" , method = RequestMethod.POST)
	@ApiOperation(value = "base64上传图片" , notes = "依据base64编码上传图片" , response = Result.class)
	public Result doUploadBase64(@RequestParam("imgStrs") String imgStrs, HttpServletRequest request,
			HttpServletResponse response) {
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, String.class);  
		List<String> imgList;
		try {
			imgList = (List<String>)mapper.readValue(imgStrs, javaType);
		} catch (Exception e) {
			throw new ServiceException(StatusCode.PARAMERROR);
		}
		return new Result("success", fileService.upFile(imgList), StatusCode.SUCCESS);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{filename:.+}" , method = RequestMethod.GET)
	@ApiOperation(value = "访问图片" , notes = "图片" , response = Result.class)
	public String showPic(@PathVariable String filename, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {
		//String newName = new String(fileName.getBytes("ISO-8859-1"), "UTF8");
		// 上传的uuName
		return fileService.downFile(response , filename);
	}
    
}
