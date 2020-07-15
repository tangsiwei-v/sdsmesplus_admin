package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdProcessParamHistPO {
    private Integer ppphId;

    private Integer lineId;

    private String rfid;

    private String processParam;

    private String paramValue;

    private Date createTime;

    private String line_name;

    public String getLine_name() {
        return line_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public Integer getPpphId() {
        return ppphId;
    }

    public void setPpphId(Integer ppphId) {
        this.ppphId = ppphId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getProcessParam() {
        return processParam;
    }

    public void setProcessParam(String processParam) {
        this.processParam = processParam == null ? null : processParam.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}