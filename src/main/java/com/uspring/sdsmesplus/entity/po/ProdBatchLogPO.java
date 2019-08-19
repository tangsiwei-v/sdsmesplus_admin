package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdBatchLogPO {
    private Integer batchId;

    private String prodCode;

    private String fcCode;

    private String supplier;

    private String supplierBatchCode;

    private String productDate;

    private String prodFurnaceNo;

    private String prodGlevel;

    private String materialVersion;

    private String materialBatchCode;

    private String materialCode;

    private String customerCode;

    private String prodBatchCode;

    private Date createTime;

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode == null ? null : fcCode.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplierBatchCode() {
        return supplierBatchCode;
    }

    public void setSupplierBatchCode(String supplierBatchCode) {
        this.supplierBatchCode = supplierBatchCode == null ? null : supplierBatchCode.trim();
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate == null ? null : productDate.trim();
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

    public String getMaterialVersion() {
        return materialVersion;
    }

    public void setMaterialVersion(String materialVersion) {
        this.materialVersion = materialVersion == null ? null : materialVersion.trim();
    }

    public String getMaterialBatchCode() {
        return materialBatchCode;
    }

    public void setMaterialBatchCode(String materialBatchCode) {
        this.materialBatchCode = materialBatchCode == null ? null : materialBatchCode.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getProdBatchCode() {
        return prodBatchCode;
    }

    public void setProdBatchCode(String prodBatchCode) {
        this.prodBatchCode = prodBatchCode == null ? null : prodBatchCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}