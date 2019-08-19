package com.uspring.sdsmesplus.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/** 
 * @ClassName: UnauthorizedEntryPoint 
 * @Description: 权限验证失败处理类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年4月8日 下午9:47:41 
 *  
 */
@Component("unauthorizedEntryPoint")
public class UnauthorizedEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
				"Unauthroized: Authentication token was either missing or invalid.");

	}

}
