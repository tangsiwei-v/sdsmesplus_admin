/**
 * @Title: File.java 
 * @Package com.baan.monitor.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2017年12月13日 下午6:31:24 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

/** 
 * @ClassName: File 
 * @Description: 文件对象，用于文件相关接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2017年12月13日 下午6:31:24 
 *  
 */
public class USFile {
	private String filename;
	private String url;
	private String uuid;

	public USFile(String filename, String url, String uuid) {
		super();
		this.filename = filename;
		this.url = url;
		this.uuid = uuid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
