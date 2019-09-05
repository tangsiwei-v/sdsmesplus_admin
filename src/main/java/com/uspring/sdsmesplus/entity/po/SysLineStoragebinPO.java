package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysLineStoragebinPO {
    private Integer linbinId;

    private Integer lineId;

    private Integer binId;

    private String binCode;

    private String storageType;

    private Date createTime;

    public Integer getLinbinId() {
        return linbinId;
    }

    public void setLinbinId(Integer linbinId) {
        this.linbinId = linbinId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getBinId() {
        return binId;
    }

    public void setBinId(Integer binId) {
        this.binId = binId;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode == null ? null : binCode.trim();
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType == null ? null : storageType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}