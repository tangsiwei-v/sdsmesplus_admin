package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SafelunchProductLogPO {
    private Integer resId;

    private String safelunchOrder;

    private String fpBarcode;

    private String boxBarcode;

    private Boolean isPass;

    private Date createTime;

    private Date updateTime;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getSafelunchOrder() {
        return safelunchOrder;
    }

    public void setSafelunchOrder(String safelunchOrder) {
        this.safelunchOrder = safelunchOrder == null ? null : safelunchOrder.trim();
    }

    public String getFpBarcode() {
        return fpBarcode;
    }

    public void setFpBarcode(String fpBarcode) {
        this.fpBarcode = fpBarcode == null ? null : fpBarcode.trim();
    }

    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode == null ? null : boxBarcode.trim();
    }

    public Boolean getIsPass() {
        return isPass;
    }

    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
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