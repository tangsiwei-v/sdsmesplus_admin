package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysProcessParamPO {
    private Integer ppId;

    private String ppCode;

    private String ppName;

    private Integer ppOrder;

    private Boolean ppShow;

    private String ppType;

    private Boolean ppIsOk;

    private Integer spId;

    private Date createTime;

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String getPpCode() {
        return ppCode;
    }

    public void setPpCode(String ppCode) {
        this.ppCode = ppCode == null ? null : ppCode.trim();
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName == null ? null : ppName.trim();
    }

    public Integer getPpOrder() {
        return ppOrder;
    }

    public void setPpOrder(Integer ppOrder) {
        this.ppOrder = ppOrder;
    }

    public Boolean getPpShow() {
        return ppShow;
    }

    public void setPpShow(Boolean ppShow) {
        this.ppShow = ppShow;
    }

    public String getPpType() {
        return ppType;
    }

    public void setPpType(String ppType) {
        this.ppType = ppType == null ? null : ppType.trim();
    }

    public Boolean getPpIsOk() {
        return ppIsOk;
    }

    public void setPpIsOk(Boolean ppIsOk) {
        this.ppIsOk = ppIsOk;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}