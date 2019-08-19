package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class DeviceVerifyLogPO {
    private Integer dvId;

    private Integer lineId;

    private Date shiftDate;

    private String shiftId;

    private String orderCode;

    private String prodCode;

    private String dvDevice;

    private String dvProcedure;

    private String dvItem;

    private String dvRequirement;

    private String dvResult;

    private Date createTime;

    private String dvPerson;

    private String dvAuthorizer;

    private Date dvAuthTime;

    public Integer getDvId() {
        return dvId;
    }

    public void setDvId(Integer dvId) {
        this.dvId = dvId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Date getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(Date shiftDate) {
        this.shiftDate = shiftDate;
    }

    public String getShiftId() {
        return shiftId;
    }

    public void setShiftId(String shiftId) {
        this.shiftId = shiftId == null ? null : shiftId.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getDvDevice() {
        return dvDevice;
    }

    public void setDvDevice(String dvDevice) {
        this.dvDevice = dvDevice == null ? null : dvDevice.trim();
    }

    public String getDvProcedure() {
        return dvProcedure;
    }

    public void setDvProcedure(String dvProcedure) {
        this.dvProcedure = dvProcedure == null ? null : dvProcedure.trim();
    }

    public String getDvItem() {
        return dvItem;
    }

    public void setDvItem(String dvItem) {
        this.dvItem = dvItem == null ? null : dvItem.trim();
    }

    public String getDvRequirement() {
        return dvRequirement;
    }

    public void setDvRequirement(String dvRequirement) {
        this.dvRequirement = dvRequirement == null ? null : dvRequirement.trim();
    }

    public String getDvResult() {
        return dvResult;
    }

    public void setDvResult(String dvResult) {
        this.dvResult = dvResult == null ? null : dvResult.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDvPerson() {
        return dvPerson;
    }

    public void setDvPerson(String dvPerson) {
        this.dvPerson = dvPerson == null ? null : dvPerson.trim();
    }

    public String getDvAuthorizer() {
        return dvAuthorizer;
    }

    public void setDvAuthorizer(String dvAuthorizer) {
        this.dvAuthorizer = dvAuthorizer == null ? null : dvAuthorizer.trim();
    }

    public Date getDvAuthTime() {
        return dvAuthTime;
    }

    public void setDvAuthTime(Date dvAuthTime) {
        this.dvAuthTime = dvAuthTime;
    }
}