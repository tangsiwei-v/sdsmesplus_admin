/**
 * @Title: Package.java 
 * @Package com.uspring.sdsmesplus.wms 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 下午3:05:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.wms.entity;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * @ClassName: Package 
 * @Description: 包装类，包括成品包装和零件包装
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月29日 下午3:05:39 
 *  
 */
public class Package {

	//上层hu
	private String upHu;
	
	//箱合格证编号
	private String boxBarcode;
	
	//集团
	private String matMandat;

	//仓库编号/综合仓库
    private String matWarehouseNum;

    //授权处理方 
    private String matEntitledPart;

    //产品编号
    private String matNumber;

    //零件简码 
    private String matCode;

    //零件图号
    private String matTuhao;

    //物料描述
    private String matName;

    //炉号
    private String matFurnaceNo;

    //档位
    private String matGlevel;
    
    //物料版本
    private String matVersion;

    //批次
    private String matBatchNo;

    //数量
    private BigDecimal boxQuan;
    
    //现有库位
    private String nowBank;
    
    //现有仓位
    private String nowBin;
    
    //指向库位--线边
    private String aimBank;
    
    //指向仓位--线边
    private String aimBin;

    //检验员
    private String boxInspector;
    
    //收货日期
    private Date reciveDate;
    
    //制造日期 
    private Date prodDate;
    
    //原材料收货日期 
    private String matRcvDate;
    
    //基本计量单位
    private String matUnit;
    
    //热处理特性 
    private String heatFeature;
    
    //备注
    private String notes;
    
    //客户编号
    private String customerCode;
    
    //客户物料编号
    private String customerMatCode;
    
    //供应商账号 
    private String supplierAccount;
    
    //供应商批次编号 
    private String supplierBatch;
    
	//原材料物料号
    private String beforMatNo;
    
    //原材料批次号
    private String beforBatNo;
    
    //生产批次的日期 
    private String batchDate;
    
    //是否过程码
    private Boolean isWip;
    
    //下线设备
    private String opDevice;
    
    //下线工序编号
    private String opNo;
    
    //下线工序描述
    private String opDesc;
    
    //下线成本中心 
    private String opWorkstation;

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

	public String getBeforMatNo() {
		return beforMatNo;
	}

	public void setBeforMatNo(String beforMatNo) {
		this.beforMatNo = beforMatNo;
	}

	public String getBeforBatNo() {
		return beforBatNo;
	}

	public void setBeforBatNo(String beforBatNo) {
		this.beforBatNo = beforBatNo;
	}

	public String getBoxBarcode() {
		return boxBarcode;
	}

	public void setBoxBarcode(String boxBarcode) {
		this.boxBarcode = boxBarcode;
	}

	public String getMatMandat() {
		return matMandat;
	}

	public void setMatMandat(String matMandat) {
		this.matMandat = matMandat;
	}

	public String getMatWarehouseNum() {
		return matWarehouseNum;
	}

	public void setMatWarehouseNum(String matWarehouseNum) {
		this.matWarehouseNum = matWarehouseNum;
	}

	public String getMatEntitledPart() {
		return matEntitledPart;
	}

	public void setMatEntitledPart(String matEntitledPart) {
		this.matEntitledPart = matEntitledPart;
	}

	public String getMatCode() {
		return matCode;
	}

	public void setMatCode(String matCode) {
		this.matCode = matCode;
	}

	public String getMatTuhao() {
		return matTuhao;
	}

	public void setMatTuhao(String matTuhao) {
		this.matTuhao = matTuhao;
	}

	public String getMatName() {
		return matName;
	}

	public void setMatName(String matName) {
		this.matName = matName;
	}

	public String getMatFurnaceNo() {
		return matFurnaceNo;
	}

	public void setMatFurnaceNo(String matFurnaceNo) {
		this.matFurnaceNo = matFurnaceNo;
	}

	public String getMatGlevel() {
		return matGlevel;
	}

	public void setMatGlevel(String matGlevel) {
		this.matGlevel = matGlevel;
	}

	public String getMatVersion() {
		return matVersion;
	}

	public void setMatVersion(String matVersion) {
		this.matVersion = matVersion;
	}

	public String getMatBatchNo() {
		return matBatchNo;
	}

	public void setMatBatchNo(String matBatchNo) {
		this.matBatchNo = matBatchNo;
	}

	public BigDecimal getBoxQuan() {
		return boxQuan;
	}

	public void setBoxQuan(BigDecimal boxQuan) {
		this.boxQuan = boxQuan;
	}

	public String getBoxInspector() {
		return boxInspector;
	}

	public void setBoxInspector(String boxInspector) {
		this.boxInspector = boxInspector;
	}

	public Date getReciveDate() {
		return reciveDate;
	}

	public void setReciveDate(Date reciveDate) {
		this.reciveDate = reciveDate;
	}

	public Date getProdDate() {
		return prodDate;
	}

	public void setProdDate(Date prodDate) {
		this.prodDate = prodDate;
	}



	public String getMatUnit() {
		return matUnit;
	}

	public void setMatUnit(String matUnit) {
		this.matUnit = matUnit;
	}

	public String getHeatFeature() {
		return heatFeature;
	}

	public void setHeatFeature(String heatFeature) {
		this.heatFeature = heatFeature;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerMatCode() {
		return customerMatCode;
	}

	public void setCustomerMatCode(String customerMatCode) {
		this.customerMatCode = customerMatCode;
	}

	public String getSupplierAccount() {
		return supplierAccount;
	}

	public void setSupplierAccount(String supplierAccount) {
		this.supplierAccount = supplierAccount;
	}

	public String getSupplierBatch() {
		return supplierBatch;
	}

	public void setSupplierBatch(String supplierBatch) {
		this.supplierBatch = supplierBatch;
	}

	public String getBatchDate() {
		return batchDate;
	}

	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}

	public Boolean getIsWip() {
		return isWip;
	}

	public void setIsWip(Boolean isWip) {
		this.isWip = isWip;
	}

	public String getOpDevice() {
		return opDevice;
	}

	public void setOpDevice(String opDevice) {
		this.opDevice = opDevice;
	}

	public String getOpNo() {
		return opNo;
	}

	public void setOpNo(String opNo) {
		this.opNo = opNo;
	}

	public String getOpDesc() {
		return opDesc;
	}

	public void setOpDesc(String opDesc) {
		this.opDesc = opDesc;
	}

	public String getOpWorkstation() {
		return opWorkstation;
	}

	public void setOpWorkstation(String opWorkstation) {
		this.opWorkstation = opWorkstation;
	}

	public String getUpHu() {
		return upHu;
	}

	public void setUpHu(String upHu) {
		this.upHu = upHu;
	}



	public String getMatRcvDate() {
		return matRcvDate;
	}

	public void setMatRcvDate(String matRcvDate) {
		this.matRcvDate = matRcvDate;
	}

	public String getMatNumber() {
		return matNumber;
	}

	public void setMatNumber(String matNumber) {
		this.matNumber = matNumber;
	}

	@Override
	public String toString() {
		return "Package [upHu=" + upHu + ", boxBarcode=" + boxBarcode + ", matMandat=" + matMandat
				+ ", matWarehouseNum=" + matWarehouseNum + ", matEntitledPart=" + matEntitledPart + ", matNumber="
				+ matNumber + ", matCode=" + matCode + ", matTuhao=" + matTuhao + ", matName=" + matName
				+ ", matFurnaceNo=" + matFurnaceNo + ", matGlevel=" + matGlevel + ", matVersion=" + matVersion
				+ ", matBatchNo=" + matBatchNo + ", boxQuan=" + boxQuan + ", nowBank=" + nowBank + ", nowBin=" + nowBin
				+ ", aimBank=" + aimBank + ", aimBin=" + aimBin + ", boxInspector=" + boxInspector + ", reciveDate="
				+ reciveDate + ", prodDate=" + prodDate + ", matRcvDate=" + matRcvDate + ", matUnit=" + matUnit
				+ ", heatFeature=" + heatFeature + ", notes=" + notes + ", customerCode=" + customerCode
				+ ", customerMatCode=" + customerMatCode + ", supplierAccount=" + supplierAccount + ", supplierBatch="
				+ supplierBatch + ", beforMatNo=" + beforMatNo + ", beforBatNo=" + beforBatNo + ", batchDate="
				+ batchDate + ", isWip=" + isWip + ", opDevice=" + opDevice + ", opNo=" + opNo + ", opDesc=" + opDesc
				+ ", opWorkstation=" + opWorkstation + "]";
	}

	
}
