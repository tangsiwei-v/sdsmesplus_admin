package com.uspring.sdsmesplus.entity.po;

import java.util.List;

public class SysProcedureProcess {
    private Integer spId;

    private String procedureId;

    private String processCode;

    private Boolean spIsShow;

    private String spType;

    private String spName;

    private Boolean spIsQuality;

    private String socode;

    private int line_id;

    private String paramValue;

    private String spcode;

    private String spname;

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public String getSpcode() {
        return spcode;
    }

    public void setSpcode(String spcode) {
        this.spcode = spcode;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    private List<SysProcedureProcess> list;

    public List<SysProcedureProcess> getList() {
        return list;
    }

    public void setList(List<SysProcedureProcess> list) {
        this.list = list;
    }

    public String getSocode() {
        return socode;
    }

    public void setSocode(String socode) {
        this.socode = socode;
    }

    public int getLine_id() {
        return line_id;
    }

    public void setLine_id(int line_id) {
        this.line_id = line_id;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId == null ? null : procedureId.trim();
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode == null ? null : processCode.trim();
    }

    public Boolean getSpIsShow() {
        return spIsShow;
    }

    public void setSpIsShow(Boolean spIsShow) {
        this.spIsShow = spIsShow;
    }

    public String getSpType() {
        return spType;
    }

    public void setSpType(String spType) {
        this.spType = spType == null ? null : spType.trim();
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public Boolean getSpIsQuality() {
        return spIsQuality;
    }

    public void setSpIsQuality(Boolean spIsQuality) {
        this.spIsQuality = spIsQuality;
    }
}