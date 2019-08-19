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
 * @ClassName: 库位类型
 * @Description: 类型代码列表
 * @author
 * @date 2018年3月28日 上午11:27:06 
 *  
 */
public enum StorageBinType {
	
		LineUp("LineUp", "线上"),
		LineSide("LineSide", "线边"),
		LineFinish("LineFinish", "线完成库位"),
		LineIsolation("LineIsolation", "不合格品隔离库位"),
	    LineOil("LineOil", "油料线上库位");

		 //代码
	    private String code;
	    
	    //描述
	    private String desc;

	    private StorageBinType(String code, String desc){
	        this.desc = desc;
	        this.code = code;
	    }

	    public String getDesc() {
	        return desc;
	    }

	    public String getCode() {
	        return code;
	    }
}
