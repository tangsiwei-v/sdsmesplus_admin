package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;

public class ShiftPO {
    private Integer sfId;

    private String sfCode;

    private String sfName;

    private Integer sfStartHour;

    private Integer sfStartMinute;

    private Integer sfEndHour;

    private Integer sfEndMinute;

    private BigDecimal sfHour;

    private Integer sfSpanDay;

    private Integer fcId;

    public Integer getSfId() {
        return sfId;
    }

    public void setSfId(Integer sfId) {
        this.sfId = sfId;
    }

    public String getSfCode() {
        return sfCode;
    }

    public void setSfCode(String sfCode) {
        this.sfCode = sfCode == null ? null : sfCode.trim();
    }

    public String getSfName() {
        return sfName;
    }

    public void setSfName(String sfName) {
        this.sfName = sfName == null ? null : sfName.trim();
    }

    public Integer getSfStartHour() {
        return sfStartHour;
    }

    public void setSfStartHour(Integer sfStartHour) {
        this.sfStartHour = sfStartHour;
    }

    public Integer getSfStartMinute() {
        return sfStartMinute;
    }

    public void setSfStartMinute(Integer sfStartMinute) {
        this.sfStartMinute = sfStartMinute;
    }

    public Integer getSfEndHour() {
        return sfEndHour;
    }

    public void setSfEndHour(Integer sfEndHour) {
        this.sfEndHour = sfEndHour;
    }

    public Integer getSfEndMinute() {
        return sfEndMinute;
    }

    public void setSfEndMinute(Integer sfEndMinute) {
        this.sfEndMinute = sfEndMinute;
    }

    public BigDecimal getSfHour() {
        return sfHour;
    }

    public void setSfHour(BigDecimal sfHour) {
        this.sfHour = sfHour;
    }

    public Integer getSfSpanDay() {
        return sfSpanDay;
    }

    public void setSfSpanDay(Integer sfSpanDay) {
        this.sfSpanDay = sfSpanDay;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }
}