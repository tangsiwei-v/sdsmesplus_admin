package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdProcessCheckPO {
    private Integer ppcId;

    private String prodCode;

    private Integer lineId;

    private String opCode;

    private Boolean skipCheck;

    private Boolean isActive;

    private Boolean isDeleted;

    private Date createTime;

    private Date updateTime;

    private String opName;

    public Integer getPpcId() {
        return ppcId;
    }

    public void setPpcId(Integer ppcId) {
        this.ppcId = ppcId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode == null ? null : opCode.trim();
    }

    public Boolean getSkipCheck() {
        return skipCheck;
    }

    public void setSkipCheck(Boolean skipCheck) {
        this.skipCheck = skipCheck;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }
}