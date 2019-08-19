package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdSkillVerifyLogPO {
    private Integer svId;

    private Integer lineId;

    private Date shiftDate;

    private Integer shiftId;

    private String orderCode;

    private String svProcedure;

    private String svMachine;

    private String svSkillNeed;

    private String svSkillReal;

    private String empNumber;

    private String svResult;

    private String svAuthorizer;

    private Date svAuthTime;

    private Date createTime;

    public Integer getSvId() {
        return svId;
    }

    public void setSvId(Integer svId) {
        this.svId = svId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Date getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(Date shiftDate) {
        this.shiftDate = shiftDate;
    }

    public Integer getShiftId() {
        return shiftId;
    }

    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getSvProcedure() {
        return svProcedure;
    }

    public void setSvProcedure(String svProcedure) {
        this.svProcedure = svProcedure == null ? null : svProcedure.trim();
    }

    public String getSvMachine() {
        return svMachine;
    }

    public void setSvMachine(String svMachine) {
        this.svMachine = svMachine == null ? null : svMachine.trim();
    }

    public String getSvSkillNeed() {
        return svSkillNeed;
    }

    public void setSvSkillNeed(String svSkillNeed) {
        this.svSkillNeed = svSkillNeed == null ? null : svSkillNeed.trim();
    }

    public String getSvSkillReal() {
        return svSkillReal;
    }

    public void setSvSkillReal(String svSkillReal) {
        this.svSkillReal = svSkillReal == null ? null : svSkillReal.trim();
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
    }

    public String getSvResult() {
        return svResult;
    }

    public void setSvResult(String svResult) {
        this.svResult = svResult == null ? null : svResult.trim();
    }

    public String getSvAuthorizer() {
        return svAuthorizer;
    }

    public void setSvAuthorizer(String svAuthorizer) {
        this.svAuthorizer = svAuthorizer == null ? null : svAuthorizer.trim();
    }

    public Date getSvAuthTime() {
        return svAuthTime;
    }

    public void setSvAuthTime(Date svAuthTime) {
        this.svAuthTime = svAuthTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}