package com.uspring.sdsmesplus.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.service.UserService;

/** 
 * @ClassName: AuthenticationTokenProcessingFilter 
 * @Description: Spring Security 自定义登录拦截器 
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年4月8日 下午9:45:04 
 *  
 */
@Component("authenticationTokenProcessingFilter")
public class AuthenticationTokenProcessingFilter extends GenericFilterBean {

	private final UserService userService;

	@Autowired
	public AuthenticationTokenProcessingFilter(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = this.getAsHttpRequest(request);
		String authToken = this.extractAuthTokenFromRequest(httpRequest);

		//token验证
		try
		{
			Algorithm algorithm = Algorithm.HMAC256("backtemplate");
			JWTVerifier verifier = JWT.require(algorithm)
			        .withIssuer("front")
			        .build(); 
			DecodedJWT jwt = verifier.verify(authToken);
			
			//加载用户
			int useId = jwt.getClaim("userId").asInt();
			UserVO user = userService.queryUserById(useId);
			List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
			list.add(new SimpleGrantedAuthority("ROLE_USER"));
			
			Authentication authentication = new UsernamePasswordAuthenticationToken(user, null, list);
			SecurityContextHolder.getContext().setAuthentication(authentication);
		}catch (Exception e){
		    //验证失败
			//throw new BadCredentialsException(e.getMessage());
			e.printStackTrace(System.out);
		} 
		chain.doFilter(request, response);
	}

	private HttpServletRequest getAsHttpRequest(ServletRequest request) {
		if (!(request instanceof HttpServletRequest)) {
			throw new RuntimeException("Excepting an HTTP request");
		}
		return (HttpServletRequest) request;
	}

	private String extractAuthTokenFromRequest(HttpServletRequest httpRequest) {
		String authToken = httpRequest.getHeader("X-Auth-Token");
		if (authToken == null) {
			authToken = httpRequest.getParameter("token");
		}
		return authToken;
	}

}
