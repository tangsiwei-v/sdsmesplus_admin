package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class BoxInfoPO {
    private Integer bifId;

    private Integer fcId;

    private String prodCode;

    private String customerCode;

    private Integer bifCount;

    private Date createTime;

    public Integer getBifId() {
        return bifId;
    }

    public void setBifId(Integer bifId) {
        this.bifId = bifId;
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

    public Integer getBifCount() {
        return bifCount;
    }

    public void setBifCount(Integer bifCount) {
        this.bifCount = bifCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}