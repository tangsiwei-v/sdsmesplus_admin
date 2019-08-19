/**
 * @Title: OrderStockBomVO.java 
 * @Package com.uspring.sdsmesplus.entity.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月13日 下午4:23:00 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

/** 
 * @ClassName: OrderStockBomVO 
 * @Description: 工单物料按BOM统计
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月13日 下午4:23:00 
 *  
 */
public class OrderStockBomVO {

	//物料简码
	private String materialCode;
	
	//物料名称
	private String materialName;
	
	//物料单位消耗
	private double materialUnit;
	
	//物料线上剩余数量
	private double materialNumLeft;
	
	//物料缺额
	private double materialNumLack;

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public double getMaterialUnit() {
		return materialUnit;
	}

	public void setMaterialUnit(double materialUnit) {
		this.materialUnit = materialUnit;
	}

	public double getMaterialNumLeft() {
		return materialNumLeft;
	}

	public void setMaterialNumLeft(double materialNumLeft) {
		this.materialNumLeft = materialNumLeft;
	}

	public double getMaterialNumLack() {
		return materialNumLack;
	}

	public void setMaterialNumLack(double materialNumLack) {
		this.materialNumLack = materialNumLack;
	}
}
