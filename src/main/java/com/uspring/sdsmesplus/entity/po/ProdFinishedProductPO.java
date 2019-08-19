package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdFinishedProductPO {
    private Integer fpId;

    private String poCode;

    private String customerCode;

    private Integer lineId;

    private String prodCode;

    private String fpRfid;

    private String fpStatus;

    private String boxBarcode;

    private String fpBarcode;

    private Date createTime;

    public Integer getFpId() {
        return fpId;
    }

    public void setFpId(Integer fpId) {
        this.fpId = fpId;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
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

    public String getFpRfid() {
        return fpRfid;
    }

    public void setFpRfid(String fpRfid) {
        this.fpRfid = fpRfid == null ? null : fpRfid.trim();
    }

    public String getFpStatus() {
        return fpStatus;
    }

    public void setFpStatus(String fpStatus) {
        this.fpStatus = fpStatus == null ? null : fpStatus.trim();
    }

    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode == null ? null : boxBarcode.trim();
    }

    public String getFpBarcode() {
        return fpBarcode;
    }

    public void setFpBarcode(String fpBarcode) {
        this.fpBarcode = fpBarcode == null ? null : fpBarcode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}