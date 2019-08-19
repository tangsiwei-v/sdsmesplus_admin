package com.uspring.sdsmesplus.entity.vo;

import com.uspring.sdsmesplus.enums.StatusCode;

public class Result {
	
	private String message ;
	
	private Object data;
	
	private int status;

	public Result(String message, Object data, StatusCode status) {
		super();
		this.message = message;
		this.data = data;
		this.status = status.getCode();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(StatusCode status) {
		this.status = status.getCode();
	}
}
