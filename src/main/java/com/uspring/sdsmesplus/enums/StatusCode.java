/**
 * @Title: StatusCode.java 
 * @Package com.uspring.template.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年3月28日 上午11:27:06 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.enums;

/** 
 * @ClassName: StatusCode 
 * @Description: 错误代码列表
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年3月28日 上午11:27:06 
 *  
 */
public enum StatusCode {
	SUCCESS("成功", 100),
	FAILED("失败", 101),
	WRONGPASS("用户名或密码不正确", 102),
	USERDISABLE("用户被禁用，请联系管理员", 103),
	PARAMERROR("参数错误", 104),
	RUNERROR("服务内部错误", 500);
	
	//描述
	private String desc;
	//代码
	private int code;
	
	private StatusCode(String desc, int code){
		this.desc = desc;
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public int getCode() {
		return code;
	}
}
