package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysDeviceVerifyItemPO {
    private Integer dviId;

    private Integer lineId;

    private String devCode;

    private String dviItem;

    private String dviReq;

    private String dviTime;

    private Boolean isSwitchActive;

    private Boolean isActive;

    private Date createTime;

    public Integer getDviId() {
        return dviId;
    }

    public void setDviId(Integer dviId) {
        this.dviId = dviId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode == null ? null : devCode.trim();
    }

    public String getDviItem() {
        return dviItem;
    }

    public void setDviItem(String dviItem) {
        this.dviItem = dviItem == null ? null : dviItem.trim();
    }

    public String getDviReq() {
        return dviReq;
    }

    public void setDviReq(String dviReq) {
        this.dviReq = dviReq == null ? null : dviReq.trim();
    }

    public String getDviTime() {
        return dviTime;
    }

    public void setDviTime(String dviTime) {
        this.dviTime = dviTime == null ? null : dviTime.trim();
    }

    public Boolean getIsSwitchActive() {
        return isSwitchActive;
    }

    public void setIsSwitchActive(Boolean isSwitchActive) {
        this.isSwitchActive = isSwitchActive;
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
}