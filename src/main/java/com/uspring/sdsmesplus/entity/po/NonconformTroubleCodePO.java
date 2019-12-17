package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class NonconformTroubleCodePO {
    private Integer trcId;

    private Integer fcId;

    private String opCode;

    private String trcCode;

    private String trcName;

    private String trcDesc;

    private Integer trcIndex;

    private Boolean trcAlarm;

    private Boolean isActive;

    private Date createTime;

    private Date updateTime;

    public Integer getTrcId() {
        return trcId;
    }

    public void setTrcId(Integer trcId) {
        this.trcId = trcId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode == null ? null : opCode.trim();
    }

    public String getTrcCode() {
        return trcCode;
    }

    public void setTrcCode(String trcCode) {
        this.trcCode = trcCode == null ? null : trcCode.trim();
    }

    public String getTrcName() {
        return trcName;
    }

    public void setTrcName(String trcName) {
        this.trcName = trcName == null ? null : trcName.trim();
    }

    public String getTrcDesc() {
        return trcDesc;
    }

    public void setTrcDesc(String trcDesc) {
        this.trcDesc = trcDesc == null ? null : trcDesc.trim();
    }

    public Integer getTrcIndex() {
        return trcIndex;
    }

    public void setTrcIndex(Integer trcIndex) {
        this.trcIndex = trcIndex;
    }

    public Boolean getTrcAlarm() {
        return trcAlarm;
    }

    public void setTrcAlarm(Boolean trcAlarm) {
        this.trcAlarm = trcAlarm;
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
}