package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class DictDataPO {
    private Integer ddId;

    private String ddCode;

    private String dtCode;

    private String ddName;

    private Integer ddSeq;

    private Boolean isDefault;

    private Boolean isFixed;

    private Boolean isActive;

    private Date createTime;

    private String note;

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public String getDdCode() {
        return ddCode;
    }

    public void setDdCode(String ddCode) {
        this.ddCode = ddCode == null ? null : ddCode.trim();
    }

    public String getDtCode() {
        return dtCode;
    }

    public void setDtCode(String dtCode) {
        this.dtCode = dtCode == null ? null : dtCode.trim();
    }

    public String getDdName() {
        return ddName;
    }

    public void setDdName(String ddName) {
        this.ddName = ddName == null ? null : ddName.trim();
    }

    public Integer getDdSeq() {
        return ddSeq;
    }

    public void setDdSeq(Integer ddSeq) {
        this.ddSeq = ddSeq;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(Boolean isFixed) {
        this.isFixed = isFixed;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}