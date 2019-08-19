package com.uspring.sdsmesplus.wms.entity;
/** * @author  作者 E-mail:
 * @date 创建时间：2019年7月2日 下午4:00:10 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public enum CleanType {
	
   clean("1","清线"),standard("2","标准打包"),fix("3","混合打包"),out("4","道序委外");
    
    private String code;
    private String name;
    
	private CleanType(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
   
}
