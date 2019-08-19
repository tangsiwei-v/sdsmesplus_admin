/**
 * @Title: DevProdStatus.java 
 * @Package com.uspring.sdsmesplus.entity.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月11日 上午11:24:20 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

/** 
 * @ClassName: DevProdStatus 
 * @Description: 设备加工状态
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月11日 上午11:24:20 
 *  
 */
public class DevProdStatus {

	//设备编号
	private String devCode;
	
	//设备名称
	private String devName;
	
	//工单编号
	private String orderCode;
	
	//产品简码
	private String prodCode;
	
	//产品名称
	private String prodName;
	
	//投料数量
	private long materialNum;
	
	//产出数量
	private long outputNum;
	
	//不合格品数量
	private long unqualifyNum;

	public String getDevCode() {
		return devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public long getMaterialNum() {
		return materialNum;
	}

	public void setMaterialNum(long materialNum) {
		this.materialNum = materialNum;
	}

	public long getOutputNum() {
		return outputNum;
	}

	public void setOutputNum(long outputNum) {
		this.outputNum = outputNum;
	}

	public long getUnqualifyNum() {
		return unqualifyNum;
	}

	public void setUnqualifyNum(long unqualifyNum) {
		this.unqualifyNum = unqualifyNum;
	}
}
