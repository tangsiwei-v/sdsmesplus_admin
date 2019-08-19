package com.uspring.sdsmesplus.exception;

import com.uspring.sdsmesplus.enums.StatusCode;

public class ServiceException  extends RuntimeException{

	/** serialVersionUID*/
	private static final long serialVersionUID = 6074377231716707531L;
	
	/** 错误代码 */
	private StatusCode code = StatusCode.FAILED;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	
	public ServiceException(StatusCode statusCode){
		super(statusCode.getDesc());
		this.code = statusCode;
	}

	public StatusCode getCode() {
		return code;
	}

}
