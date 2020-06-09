package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProdWeightPO {
    private Integer pwlId;

    private Integer lineId;

    private String prodRfid;

    private BigDecimal prodWeight;

    private Date prodTime;

    public Integer getPwlId() {
        return pwlId;
    }

    public void setPwlId(Integer pwlId) {
        this.pwlId = pwlId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getProdRfid() {
        return prodRfid;
    }

    public void setProdRfid(String prodRfid) {
        this.prodRfid = prodRfid == null ? null : prodRfid.trim();
    }

    public BigDecimal getProdWeight() {
        return prodWeight;
    }

    public void setProdWeight(BigDecimal prodWeight) {
        this.prodWeight = prodWeight;
    }

    public Date getProdTime() {
        return prodTime;
    }

    public void setProdTime(Date prodTime) {
        this.prodTime = prodTime;
    }
}