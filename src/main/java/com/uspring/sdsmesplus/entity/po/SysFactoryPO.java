package com.uspring.sdsmesplus.entity.po;

public class SysFactoryPO {
    private Integer fcId;

    private String fcCode;

    private String fcName;

    private String fcAddress;

    private String fcDomain;

    private String fcSdsId;

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode == null ? null : fcCode.trim();
    }

    public String getFcName() {
        return fcName;
    }

    public void setFcName(String fcName) {
        this.fcName = fcName == null ? null : fcName.trim();
    }

    public String getFcAddress() {
        return fcAddress;
    }

    public void setFcAddress(String fcAddress) {
        this.fcAddress = fcAddress == null ? null : fcAddress.trim();
    }

    public String getFcDomain() {
        return fcDomain;
    }

    public void setFcDomain(String fcDomain) {
        this.fcDomain = fcDomain == null ? null : fcDomain.trim();
    }

    public String getFcSdsId() {
        return fcSdsId;
    }

    public void setFcSdsId(String fcSdsId) {
        this.fcSdsId = fcSdsId == null ? null : fcSdsId.trim();
    }
}