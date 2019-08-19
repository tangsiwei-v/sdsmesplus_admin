package com.uspring.sdsmesplus.wms.entity;

public class NonConformIsolationInfo {

	//物料号
	private String prodCode;
	
	//数量
	private Double isoQty;
	
	//单位
	private String prodUnit;
	
	//批次号
	private String batchCode;
	
	//现有库位
    private String nowBank;
    
    //现有仓位
    private String nowBin;
    
    //目标库位
    private String aimBank;
    
    //目标仓位
    private String aimBin;

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getIsoQty() {
		return isoQty;
	}

	public void setIsoQty(Double isoQty) {
		this.isoQty = isoQty;
	}

	public String getProdUnit() {
		return prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getNowBank() {
		return nowBank;
	}

	public void setNowBank(String nowBank) {
		this.nowBank = nowBank;
	}

	public String getNowBin() {
		return nowBin;
	}

	public void setNowBin(String nowBin) {
		this.nowBin = nowBin;
	}

	public String getAimBank() {
		return aimBank;
	}

	public void setAimBank(String aimBank) {
		this.aimBank = aimBank;
	}

	public String getAimBin() {
		return aimBin;
	}

	public void setAimBin(String aimBin) {
		this.aimBin = aimBin;
	}
}
