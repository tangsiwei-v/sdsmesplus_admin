package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysLineProdmodelPO {
    private Integer linemodId;

    private Integer lineId;

    private String prodModel;

    private String opNo;

    private Date createTime;

    public Integer getLinemodId() {
        return linemodId;
    }

    public void setLinemodId(Integer linemodId) {
        this.linemodId = linemodId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getProdModel() {
        return prodModel;
    }

    public void setProdModel(String prodModel) {
        this.prodModel = prodModel == null ? null : prodModel.trim();
    }

    public String getOpNo() {
        return opNo;
    }

    public void setOpNo(String opNo) {
        this.opNo = opNo == null ? null : opNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}