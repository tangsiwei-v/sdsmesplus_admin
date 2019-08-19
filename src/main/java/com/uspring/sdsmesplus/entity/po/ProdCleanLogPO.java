package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProdCleanLogPO {
    private Integer clId;

    private String clCode;

    private String poCode;

    private String matCode;

    private String matName;

    private String boxBarcodeOld;

    private String boxBarcodeNew;

    private BigDecimal clUsedCount;

    private BigDecimal clRestCount;

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