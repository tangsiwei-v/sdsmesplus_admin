/**
 * @Title: BasePParamter.java 
 * @Package com.uspring.cn.opcengine.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年7月27日 下午4:46:10 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * @ClassName: BasePParamter 
 * @Description: 过程参数基类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年7月27日 下午4:46:10 
 *  
 */
@Document(collection = "ProcessParameter")
public class BasePParameter {
	@Id
    private String id;
	
	@Indexed
	private String rfid;
	
	private String line;
	
	private String barcode;
	
	private Date time;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "BasePParameter [id=" + id + ", rfid=" + rfid + ", line=" + line + ", barcode=" + barcode + ", time="
				+ time + "]";
	}

	
	
}
