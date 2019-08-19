package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

import org.dozer.Mapping;

public class ProdBoxLogPO {
	
    private Integer blId;

    private String poCode;

    private Integer lineId;

    @Mapping("matCode")
    private String prodCode;
    
    @Mapping("matName")
    private String prodName;
    
    @Mapping("matTuhao")
    private String prodTuhao;
    
    @Mapping("matFurnaceNo")
    private String prodFurnaceNo;
    
    @Mapping("matGlevel")
    private String prodGlevel;
    
    @Mapping("matBatchNo")
    private String prodBatchCode;
    
    @Mapping("customerCode")
    private String customerCode;
    
    @Mapping("boxBarcode")
    private String boxBarcode;
    
    @Mapping("boxQuan")
    private Integer boxQuan;

    private String empNumber;

    private Boolean isWip;

    private String opDevice;

    private String opNo;

    private String opDesc;

    private String opWorkstation;

    private Boolean isFeeded;

    private Date createTime;

    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdTuhao() {
        return prodTuhao;
    }

    public void setProdTuhao(String prodTuhao) {
        this.prodTuhao = prodTuhao == null ? null : prodTuhao.trim();
    }

    public String getProdFurnaceNo() {
        return prodFurnaceNo;
    }

    public void setProdFurnaceNo(String prodFurnaceNo) {
        this.prodFurnaceNo = prodFurnaceNo == null ? null : prodFurnaceNo.trim();
    }

    public String getProdGlevel() {
        return prodGlevel;
    }

    public void setProdGlevel(String prodGlevel) {
        this.prodGlevel = prodGlevel == null ? null : prodGlevel.trim();
    }

    public String getProdBatchCode() {
        return prodBatchCode;
    }

    public void setProdBatchCode(String prodBatchCode) {
        this.prodBatchCode = prodBatchCode == null ? null : prodBatchCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode == null ? null : boxBarcode.trim();
    }

    public Integer getBoxQuan() {
        return boxQuan;
    }

    public void setBoxQuan(Integer boxQuan) {
        this.boxQuan = boxQuan;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
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
        this.opDevice = opDevice == null ? null : opDevice.trim();
    }

    public String getOpNo() {
        return opNo;
    }

    public void setOpNo(String opNo) {
        this.opNo = opNo == null ? null : opNo.trim();
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc == null ? null : opDesc.trim();
    }

    public String getOpWorkstation() {
        return opWorkstation;
    }

    public void setOpWorkstation(String opWorkstation) {
        this.opWorkstation = opWorkstation == null ? null : opWorkstation.trim();
    }

    public Boolean getIsFeeded() {
        return isFeeded;
    }

    public void setIsFeeded(Boolean isFeeded) {
        this.isFeeded = isFeeded;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}