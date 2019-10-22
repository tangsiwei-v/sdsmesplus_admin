package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class AgvConfigKqPO {
    private Integer agvcfgId;

    private Integer fcId;

    private Integer lineId;

    private String prodCode;

    private String customerCode;

    private Integer fpQtyBefore;

    private Integer firstBoxQty;

    private Integer callGapQty;

    private Date createTime;

    private Date updateTime;

    public Integer getAgvcfgId() {
        return agvcfgId;
    }

    public void setAgvcfgId(Integer agvcfgId) {
        this.agvcfgId = agvcfgId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
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

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Integer getFpQtyBefore() {
        return fpQtyBefore;
    }

    public void setFpQtyBefore(Integer fpQtyBefore) {
        this.fpQtyBefore = fpQtyBefore;
    }

    public Integer getFirstBoxQty() {
        return firstBoxQty;
    }

    public void setFirstBoxQty(Integer firstBoxQty) {
        this.firstBoxQty = firstBoxQty;
    }

    public Integer getCallGapQty() {
        return callGapQty;
    }

    public void setCallGapQty(Integer callGapQty) {
        this.callGapQty = callGapQty;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}