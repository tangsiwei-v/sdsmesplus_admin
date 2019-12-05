package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProdCleanLogPO {
    private Integer clId;

    private String clCode;

    private String poCode;

    private String matCode;

    private String matName;

    private String matNumber;

    private String matTuhao;

    private String matFurnaceNo;

    private String matGlevel;

    private String matBatchNo;

    private String boxBarcodeOld;

    private String boxBarcodeNew;

    private BigDecimal clUsedCount;

    private BigDecimal clRestCount;

    private Boolean isExtra;

    private Boolean isOutsource;

    private String clPersonNumber;

    private String clPersonName;

    private Boolean isConfirmed;

    private Date createTime;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClCode() {
        return clCode;
    }

    public void setClCode(String clCode) {
        this.clCode = clCode == null ? null : clCode.trim();
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
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

    public String getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber == null ? null : matNumber.trim();
    }

    public String getMatTuhao() {
        return matTuhao;
    }

    public void setMatTuhao(String matTuhao) {
        this.matTuhao = matTuhao == null ? null : matTuhao.trim();
    }

    public String getMatFurnaceNo() {
        return matFurnaceNo;
    }

    public void setMatFurnaceNo(String matFurnaceNo) {
        this.matFurnaceNo = matFurnaceNo == null ? null : matFurnaceNo.trim();
    }

    public String getMatGlevel() {
        return matGlevel;
    }

    public void setMatGlevel(String matGlevel) {
        this.matGlevel = matGlevel == null ? null : matGlevel.trim();
    }

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo == null ? null : matBatchNo.trim();
    }

    public String getBoxBarcodeOld() {
        return boxBarcodeOld;
    }

    public void setBoxBarcodeOld(String boxBarcodeOld) {
        this.boxBarcodeOld = boxBarcodeOld == null ? null : boxBarcodeOld.trim();
    }

    public String getBoxBarcodeNew() {
        return boxBarcodeNew;
    }

    public void setBoxBarcodeNew(String boxBarcodeNew) {
        this.boxBarcodeNew = boxBarcodeNew == null ? null : boxBarcodeNew.trim();
    }

    public BigDecimal getClUsedCount() {
        return clUsedCount;
    }

    public void setClUsedCount(BigDecimal clUsedCount) {
        this.clUsedCount = clUsedCount;
    }

    public BigDecimal getClRestCount() {
        return clRestCount;
    }

    public void setClRestCount(BigDecimal clRestCount) {
        this.clRestCount = clRestCount;
    }

    public Boolean getIsExtra() {
        return isExtra;
    }

    public void setIsExtra(Boolean isExtra) {
        this.isExtra = isExtra;
    }

    public Boolean getIsOutsource() {
        return isOutsource;
    }

    public void setIsOutsource(Boolean isOutsource) {
        this.isOutsource = isOutsource;
    }

    public String getClPersonNumber() {
        return clPersonNumber;
    }

    public void setClPersonNumber(String clPersonNumber) {
        this.clPersonNumber = clPersonNumber == null ? null : clPersonNumber.trim();
    }

    public String getClPersonName() {
        return clPersonName;
    }

    public void setClPersonName(String clPersonName) {
        this.clPersonName = clPersonName == null ? null : clPersonName.trim();
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}