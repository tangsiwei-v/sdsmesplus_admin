package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysMaterialInheritPO {
    private Integer mathId;

    private Integer fcId;

    private String matCode;

    private String matName;

    private String furnaceMatCode;

    private String furnaceMatName;

    private String batchMatCode;

    private String batchMatName;

    private Date updateTime;

    private Date createTime;

    public Integer getMathId() {
        return mathId;
    }

    public void setMathId(Integer mathId) {
        this.mathId = mathId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode == null ? null : matCode.trim();
    }

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName == null ? null : matName.trim();
    }

    public String getFurnaceMatCode() {
        return furnaceMatCode;
    }

    public void setFurnaceMatCode(String furnaceMatCode) {
        this.furnaceMatCode = furnaceMatCode == null ? null : furnaceMatCode.trim();
    }

    public String getFurnaceMatName() {
        return furnaceMatName;
    }

    public void setFurnaceMatName(String furnaceMatName) {
        this.furnaceMatName = furnaceMatName == null ? null : furnaceMatName.trim();
    }

    public String getBatchMatCode() {
        return batchMatCode;
    }

    public void setBatchMatCode(String batchMatCode) {
        this.batchMatCode = batchMatCode == null ? null : batchMatCode.trim();
    }

    public String getBatchMatName() {
        return batchMatName;
    }

    public void setBatchMatName(String batchMatName) {
        this.batchMatName = batchMatName == null ? null : batchMatName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}