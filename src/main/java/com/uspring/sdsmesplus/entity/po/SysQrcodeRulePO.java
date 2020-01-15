package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysQrcodeRulePO {
    private Integer sqrId;

    private Integer fcId;

    private String prodCode;

    private String customerCode;

    private Integer qrcodeLength;

    private String qrcodeStart;

    private Date createTime;

    private Date updateTime;

    private Boolean qrcodeCheck;

    public Integer getSqrId() {
        return sqrId;
    }

    public void setSqrId(Integer sqrId) {
        this.sqrId = sqrId;
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

    public Integer getQrcodeLength() {
        return qrcodeLength;
    }

    public void setQrcodeLength(Integer qrcodeLength) {
        this.qrcodeLength = qrcodeLength;
    }

    public String getQrcodeStart() {
        return qrcodeStart;
    }

    public void setQrcodeStart(String qrcodeStart) {
        this.qrcodeStart = qrcodeStart == null ? null : qrcodeStart.trim();
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

    public Boolean getQrcodeCheck() {
        return qrcodeCheck;
    }

    public void setQrcodeCheck(Boolean qrcodeCheck) {
        this.qrcodeCheck = qrcodeCheck;
    }
}