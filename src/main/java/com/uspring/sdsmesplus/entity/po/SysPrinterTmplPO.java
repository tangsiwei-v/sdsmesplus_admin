package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysPrinterTmplPO {
    private Integer ptmplId;

    private Integer fcId;

    private String prodCode;

    private String customerCode;

    private Integer ptmplSize;

    private String ptmplFileName;

    private Integer ptCounterMin;

    private Integer ptCounterMax;

    private Integer ptCounterValue;

    private Date ptFileUpdatetime;

    private byte[] ptFileBinary;

    public Integer getPtmplId() {
        return ptmplId;
    }

    public void setPtmplId(Integer ptmplId) {
        this.ptmplId = ptmplId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Integer getPtmplSize() {
        return ptmplSize;
    }

    public void setPtmplSize(Integer ptmplSize) {
        this.ptmplSize = ptmplSize;
    }

    public String getPtmplFileName() {
        return ptmplFileName;
    }

    public void setPtmplFileName(String ptmplFileName) {
        this.ptmplFileName = ptmplFileName == null ? null : ptmplFileName.trim();
    }

    public Integer getPtCounterMin() {
        return ptCounterMin;
    }

    public void setPtCounterMin(Integer ptCounterMin) {
        this.ptCounterMin = ptCounterMin;
    }

    public Integer getPtCounterMax() {
        return ptCounterMax;
    }

    public void setPtCounterMax(Integer ptCounterMax) {
        this.ptCounterMax = ptCounterMax;
    }

    public Integer getPtCounterValue() {
        return ptCounterValue;
    }

    public void setPtCounterValue(Integer ptCounterValue) {
        this.ptCounterValue = ptCounterValue;
    }

    public Date getPtFileUpdatetime() {
        return ptFileUpdatetime;
    }

    public void setPtFileUpdatetime(Date ptFileUpdatetime) {
        this.ptFileUpdatetime = ptFileUpdatetime;
    }

    public byte[] getPtFileBinary() {
        return ptFileBinary;
    }

    public void setPtFileBinary(byte[] ptFileBinary) {
        this.ptFileBinary = ptFileBinary;
    }
}