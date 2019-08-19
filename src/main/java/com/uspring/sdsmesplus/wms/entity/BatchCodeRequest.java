/**
 * @Title: BatchCodeRequest.java 
 * @Package com.uspring.sdsmesplus.wms.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午2:13:28 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.wms.entity;

import java.util.Date;

/** 
 * @ClassName: BatchCodeRequest 
 * @Description: 批次号请求类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月27日 下午2:13:28 
 *  
 */
public class BatchCodeRequest {

	//物料号
	private String prodCode; 
	
	//工厂编号
	private String fcCode;
	
	//供应商
	private String supplier;
	
	//供应商批次号
	private String supplierBatchCode;
	
	//生产日期
	private String productDate;
	
	//炉号
	private String prodFurnaceNo;
	
	//档位
	private String prodGlevel;
	
	//零件物料版本
	private String materialVersion;
	
	//零件批次号
	private String materialBatchCode;
	
	//零件物料号
	private String materialCode;
	
	//客户号
	private String customerCode;

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getFcCode() {
		return fcCode;
	}

	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierBatchCode() {
		return supplierBatchCode;
	}

	public void setSupplierBatchCode(String supplierBatchCode) {
		this.supplierBatchCode = supplierBatchCode;
	}

	public String getProductDate() {
		return productDate;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public String getProdFurnaceNo() {
		return prodFurnaceNo;
	}

	public void setProdFurnaceNo(String prodFurnaceNo) {
		this.prodFurnaceNo = prodFurnaceNo;
	}

	public String getProdGlevel() {
		return prodGlevel;
	}

	public void setProdGlevel(String prodGlevel) {
		this.prodGlevel = prodGlevel;
	}

	public String getMaterialVersion() {
		return materialVersion;
	}

	public void setMaterialVersion(String materialVersion) {
		this.materialVersion = materialVersion;
	}

	public String getMaterialBatchCode() {
		return materialBatchCode;
	}

	public void setMaterialBatchCode(String materialBatchCode) {
		this.materialBatchCode = materialBatchCode;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
}
