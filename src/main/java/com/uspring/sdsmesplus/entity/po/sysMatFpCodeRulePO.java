package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class sysMatFpCodeRulePO {
    private Integer mfpcId;

    private Integer fcId;

    private String prodCode;

    private String customerCode;

    private String matCode;

    private String codeName;

    private Integer codeLength;

    private String codeStart;

    private String codeRegex;

    private Boolean isActive;

    private Date createTime;

    private Date updateTime;

    private Boolean isDeleted;

    public Integer getMfpcId() {
        return mfpcId;
    }

    public void setMfpcId(Integer mfpcId) {
        this.mfpcId = mfpcId;
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

    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode == null ? null : matCode.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public Integer getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    public String getCodeStart() {
        return codeStart;
    }

    public void setCodeStart(String codeStart) {
        this.codeStart = codeStart == null ? null : codeStart.trim();
    }

    public String getCodeRegex() {
        return codeRegex;
    }

    public void setCodeRegex(String codeRegex) {
        this.codeRegex = codeRegex == null ? null : codeRegex.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}