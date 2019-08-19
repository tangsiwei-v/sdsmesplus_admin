/**
 * @Title: OrderProdStatus.java 
 * @Package com.uspring.sdsmesplus.entity.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月13日 下午12:07:38 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

/** 
 * @ClassName: OrderProdStatus 
 * @Description: 工单加工统计
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月13日 下午12:07:38 
 *  
 */
public class OrderProdStatus {

	//工单号
	private String orderCode;
	
	//总成简码
	private String prodCode;
	
	//实际完成数量
	private long fpCount;
	
	//实际完成箱数量
	private long boxCount;
	
	//计划完成箱数量
	private long planBoxCount;

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

	public long getFpCount() {
		return fpCount;
	}

	public void setFpCount(long fpCount) {
		this.fpCount = fpCount;
	}

	public long getBoxCount() {
		return boxCount;
	}

	public void setBoxCount(long boxCount) {
		this.boxCount = boxCount;
	}

	public long getPlanBoxCount() {
		return planBoxCount;
	}

	public void setPlanBoxCount(long planBoxCount) {
		this.planBoxCount = planBoxCount;
	}
	
}
