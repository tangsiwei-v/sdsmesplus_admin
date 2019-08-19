package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class PlanOrderPO {
    private Integer poId;

    private String fcCode;

    private String poCode;

    private String prodCode;

    private String customerCode;

    private Date poStartDate;

    private Date poStartTime;

    private Date poEndDate;

    private Date poEndTime;

    private Date poStartDatetime;

    private Date poEndDatetime;

    private Integer poCount;

    private String poCountUnit;

    private String poCustMatcode;

    private String poProdVersion;

    private Integer lineId;

    private Integer vsmId;

    private String poStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode == null ? null : fcCode.trim();
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Date getPoStartDate() {
        return poStartDate;
    }

    public void setPoStartDate(Date poStartDate) {
        this.poStartDate = poStartDate;
    }

    public Date getPoStartTime() {
        return poStartTime;
    }

    public void setPoStartTime(Date poStartTime) {
        this.poStartTime = poStartTime;
    }

    public Date getPoEndDate() {
        return poEndDate;
    }

    public void setPoEndDate(Date poEndDate) {
        this.poEndDate = poEndDate;
    }

    public Date getPoEndTime() {
        return poEndTime;
    }

    public void setPoEndTime(Date poEndTime) {
        this.poEndTime = poEndTime;
    }

    public Date getPoStartDatetime() {
        return poStartDatetime;
    }

    public void setPoStartDatetime(Date poStartDatetime) {
        this.poStartDatetime = poStartDatetime;
    }

    public Date getPoEndDatetime() {
        return poEndDatetime;
    }

    public void setPoEndDatetime(Date poEndDatetime) {
        this.poEndDatetime = poEndDatetime;
    }

    public Integer getPoCount() {
        return poCount;
    }

    public void setPoCount(Integer poCount) {
        this.poCount = poCount;
    }

    public String getPoCountUnit() {
        return poCountUnit;
    }

    public void setPoCountUnit(String poCountUnit) {
        this.poCountUnit = poCountUnit == null ? null : poCountUnit.trim();
    }

    public String getPoCustMatcode() {
        return poCustMatcode;
    }

    public void setPoCustMatcode(String poCustMatcode) {
        this.poCustMatcode = poCustMatcode == null ? null : poCustMatcode.trim();
    }

    public String getPoProdVersion() {
        return poProdVersion;
    }

    public void setPoProdVersion(String poProdVersion) {
        this.poProdVersion = poProdVersion == null ? null : poProdVersion.trim();
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public String getPoStatus() {
        return poStatus;
    }

    public void setPoStatus(String poStatus) {
        this.poStatus = poStatus == null ? null : poStatus.trim();
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