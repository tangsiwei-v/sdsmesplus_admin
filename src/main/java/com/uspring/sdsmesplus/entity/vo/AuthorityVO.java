package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

public class AuthorityVO {

	
    private String authSystem;
    
    private List<AuthView> authViews;
    

	public String getAuthSystem() {
		return authSystem;
	}

	public void setAuthSystem(String authSystem) {
		this.authSystem = authSystem;
	}

	public List<AuthView> getAuthViews() {
		return authViews;
	}

	public void setAuthViews(List<AuthView> authViews) {
		this.authViews = authViews;
	}

	@Override
	public String toString() {
		return "AuthorityVO [authSystem=" + authSystem + ", authViews=" + authViews + "]";
	}
    
}