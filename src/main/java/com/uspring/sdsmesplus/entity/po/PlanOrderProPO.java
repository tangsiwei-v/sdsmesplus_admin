package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;

public class PlanOrderProPO {
    private Integer plopId;

    private String poCode;

    private String opNo;

    private String opWorkstation;

    private String opControl;

    private String opDesc;

    private BigDecimal opManHour;

    private BigDecimal opMachineHour;

    public Integer getPlopId() {
        return plopId;
    }

    public void setPlopId(Integer plopId) {
        this.plopId = plopId;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getOpNo() {
        return opNo;
    }

    public void setOpNo(String opNo) {
        this.opNo = opNo == null ? null : opNo.trim();
    }

    public String getOpWorkstation() {
        return opWorkstation;
    }

    public void setOpWorkstation(String opWorkstation) {
        this.opWorkstation = opWorkstation == null ? null : opWorkstation.trim();
    }

    public String getOpControl() {
        return opControl;
    }

    public void setOpControl(String opControl) {
        this.opControl = opControl == null ? null : opControl.trim();
    }

    public String getOpDesc() {
        return opDesc;
    }

    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc == null ? null : opDesc.trim();
    }

    public BigDecimal getOpManHour() {
        return opManHour;
    }

    public void setOpManHour(BigDecimal opManHour) {
        this.opManHour = opManHour;
    }

    public BigDecimal getOpMachineHour() {
        return opMachineHour;
    }

    public void setOpMachineHour(BigDecimal opMachineHour) {
        this.opMachineHour = opMachineHour;
    }
}