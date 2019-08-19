package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysLinePO {
    private Integer lineId;

    private String lineName;

    private Integer vsmId;

    private Integer shopId;

    private Integer fcId;

    private String lineType;

    private String lineBarcodeId;

    private String lineBarcodeCode;

    private String lineSapCode;

    private String lineMpmlinkCode;

    private Date updateTime;

    private Date createTime;

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType == null ? null : lineType.trim();
    }

    public String getLineBarcodeId() {
        return lineBarcodeId;
    }

    public void setLineBarcodeId(String lineBarcodeId) {
        this.lineBarcodeId = lineBarcodeId == null ? null : lineBarcodeId.trim();
    }

    public String getLineBarcodeCode() {
        return lineBarcodeCode;
    }

    public void setLineBarcodeCode(String lineBarcodeCode) {
        this.lineBarcodeCode = lineBarcodeCode == null ? null : lineBarcodeCode.trim();
    }

    public String getLineSapCode() {
        return lineSapCode;
    }

    public void setLineSapCode(String lineSapCode) {
        this.lineSapCode = lineSapCode == null ? null : lineSapCode.trim();
    }

    public String getLineMpmlinkCode() {
        return lineMpmlinkCode;
    }

    public void setLineMpmlinkCode(String lineMpmlinkCode) {
        this.lineMpmlinkCode = lineMpmlinkCode == null ? null : lineMpmlinkCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}