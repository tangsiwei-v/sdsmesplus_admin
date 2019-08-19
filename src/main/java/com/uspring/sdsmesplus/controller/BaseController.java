/**
 * @Title: BaseController.java 
 * @Package com.uspring.template.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年4月3日 上午9:08:18 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.exception.ServiceException;

/** 
 * @ClassName: BaseController 
 * @Description: 所有Controller的基类，定义一些公共行为
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年4月3日 上午9:08:18 
 *  
 */
@Controller
public class BaseController {

	private final Logger logger = LoggerFactory.getLogger(BaseController.class);

	/**
	 * 统一异常处理函数
	 */
	@ExceptionHandler
	@ResponseBody
	public Result  handleAndReturnData(HttpServletRequest request, 
			HttpServletResponse response, Exception ex) {
		//打印输出
		ex.printStackTrace();
		logger.error("catch error", ex);
		
		//前台返回
		if(ex instanceof ServiceException){
			ServiceException sex = (ServiceException) ex;
			return new Result(sex.getMessage(), null, sex.getCode());
		}
		return new Result(exceptionTrace(ex), null, StatusCode.FAILED);
	}
	
	/**
	 * 打印异常堆栈
	 */
	private String exceptionTrace(Exception ex){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
            //将出错的栈信息输出到printWriter中
            ex.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
		return sw.toString();
	}
}
