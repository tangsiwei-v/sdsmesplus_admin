package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SafelunchOrderPO {
    private Integer safboxId;

    private String safelunchOrder;

    private Integer saflineId;

    private String boxBarcode;

    private Integer productCount;

    private Integer passCount;

    private Integer failedCount;

    private Boolean isPass;

    private Boolean isCommit;

    private String checkPersonNumber;

    private String checkPersonName;

    private String boxPass;

    private String boxFailed;

    private Boolean boxConfirmed;

    private Date createTime;

    private Date updateTime;

    public Integer getSafboxId() {
        return safboxId;
    }

    public void setSafboxId(Integer safboxId) {
        this.safboxId = safboxId;
    }

    public String getSafelunchOrder() {
        return safelunchOrder;
    }

    public void setSafelunchOrder(String safelunchOrder) {
        this.safelunchOrder = safelunchOrder == null ? null : safelunchOrder.trim();
    }

    public Integer getSaflineId() {
        return saflineId;
    }

    public void setSaflineId(Integer saflineId) {
        this.saflineId = saflineId;
    }

    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode == null ? null : boxBarcode.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getPassCount() {
        return passCount;
    }

    public void setPassCount(Integer passCount) {
        this.passCount = passCount;
    }

    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public Boolean getIsPass() {
        return isPass;
    }

    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    public Boolean getIsCommit() {
        return isCommit;
    }

    public void setIsCommit(Boolean isCommit) {
        this.isCommit = isCommit;
    }

    public String getCheckPersonNumber() {
        return checkPersonNumber;
    }

    public void setCheckPersonNumber(String checkPersonNumber) {
        this.checkPersonNumber = checkPersonNumber == null ? null : checkPersonNumber.trim();
    }

    public String getCheckPersonName() {
        return checkPersonName;
    }

    public void setCheckPersonName(String checkPersonName) {
        this.checkPersonName = checkPersonName == null ? null : checkPersonName.trim();
    }

    public String getBoxPass() {
        return boxPass;
    }

    public void setBoxPass(String boxPass) {
        this.boxPass = boxPass == null ? null : boxPass.trim();
    }

    public String getBoxFailed() {
        return boxFailed;
    }

    public void setBoxFailed(String boxFailed) {
        this.boxFailed = boxFailed == null ? null : boxFailed.trim();
    }

    public Boolean getBoxConfirmed() {
        return boxConfirmed;
    }

    public void setBoxConfirmed(Boolean boxConfirmed) {
        this.boxConfirmed = boxConfirmed;
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