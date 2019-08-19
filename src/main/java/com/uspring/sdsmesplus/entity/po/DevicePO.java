package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class DevicePO {
    private Integer devId;

    private String devCode;

    private String devName;

    private Integer fcId;

    private Integer shopId;

    private Integer vsmId;

    private Integer lineId;

    private String devSize;

    private String devProcedure;

    private String note;

    private String devLocImg;

    private String devBarcodeImg;

    private Date createTime;

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode == null ? null : devCode.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getDevSize() {
        return devSize;
    }

    public void setDevSize(String devSize) {
        this.devSize = devSize == null ? null : devSize.trim();
    }

    public String getDevProcedure() {
        return devProcedure;
    }

    public void setDevProcedure(String devProcedure) {
        this.devProcedure = devProcedure == null ? null : devProcedure.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getDevLocImg() {
        return devLocImg;
    }

    public void setDevLocImg(String devLocImg) {
        this.devLocImg = devLocImg == null ? null : devLocImg.trim();
    }

    public String getDevBarcodeImg() {
        return devBarcodeImg;
    }

    public void setDevBarcodeImg(String devBarcodeImg) {
        this.devBarcodeImg = devBarcodeImg == null ? null : devBarcodeImg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}