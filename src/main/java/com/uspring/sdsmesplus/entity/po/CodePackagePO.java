package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class CodePackagePO {
    private Integer cpId;

    private String huType;

    private String pkgDay;

    private String fcPkgId;

    private String pkgSysteam;

    private Integer pkgCounter;

    private String pkgCode;

    private Date createTime;

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    public String getHuType() {
        return huType;
    }

    public void setHuType(String huType) {
        this.huType = huType == null ? null : huType.trim();
    }

    public String getPkgDay() {
        return pkgDay;
    }

    public void setPkgDay(String pkgDay) {
        this.pkgDay = pkgDay == null ? null : pkgDay.trim();
    }

    public String getFcPkgId() {
        return fcPkgId;
    }

    public void setFcPkgId(String fcPkgId) {
        this.fcPkgId = fcPkgId == null ? null : fcPkgId.trim();
    }

    public String getPkgSysteam() {
        return pkgSysteam;
    }

    public void setPkgSysteam(String pkgSysteam) {
        this.pkgSysteam = pkgSysteam == null ? null : pkgSysteam.trim();
    }

    public Integer getPkgCounter() {
        return pkgCounter;
    }

    public void setPkgCounter(Integer pkgCounter) {
        this.pkgCounter = pkgCounter;
    }

    public String getPkgCode() {
        return pkgCode;
    }

    public void setPkgCode(String pkgCode) {
        this.pkgCode = pkgCode == null ? null : pkgCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}