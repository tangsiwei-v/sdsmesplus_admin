package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SafelunchWorkLinePO {
    private Integer saflineId;

    private String saflineName;

    private Integer fcId;

    private Date createTime;

    private Date updateTime;

    public Integer getSaflineId() {
        return saflineId;
    }

    public void setSaflineId(Integer saflineId) {
        this.saflineId = saflineId;
    }

    public String getSaflineName() {
        return saflineName;
    }

    public void setSaflineName(String saflineName) {
        this.saflineName = saflineName == null ? null : saflineName.trim();
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
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