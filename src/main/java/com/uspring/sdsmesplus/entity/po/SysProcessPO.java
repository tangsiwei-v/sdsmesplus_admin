package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysProcessPO {
    private Integer spId;

    private String spCode;

    private String spName;

    private Integer spOrder;

    private Boolean spShow;

    private Boolean spCheck;

    private Integer lineId;

    private Date createTime;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode == null ? null : spCode.trim();
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public Integer getSpOrder() {
        return spOrder;
    }

    public void setSpOrder(Integer spOrder) {
        this.spOrder = spOrder;
    }

    public Boolean getSpShow() {
        return spShow;
    }

    public void setSpShow(Boolean spShow) {
        this.spShow = spShow;
    }

    public Boolean getSpCheck() {
        return spCheck;
    }

    public void setSpCheck(Boolean spCheck) {
        this.spCheck = spCheck;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}