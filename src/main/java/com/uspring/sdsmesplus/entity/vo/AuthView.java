package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

/** * @author  作者 E-mail:
 * @date 创建时间：2019年10月16日 下午7:41:18 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public class AuthView {
	
private String authSystem;

private List<AuthCode> authViews;

public String getAuthSystem() {
	return authSystem;
}

public void setAuthSystem(String authSystem) {
	this.authSystem = authSystem;
}

public List<AuthCode> getAuthViews() {
	return authViews;
}

public void setAuthViews(List<AuthCode> authViews) {
	this.authViews = authViews;
}

@Override
public String toString() {
	return "AuthView [authSystem=" + authSystem + ", authViews=" + authViews + "]";
}



}
