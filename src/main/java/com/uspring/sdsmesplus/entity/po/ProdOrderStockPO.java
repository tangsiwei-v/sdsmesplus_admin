package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

import org.dozer.Mapping;

public class ProdOrderStockPO {
    private Integer pobId;

    private String poCode;
    
    private String matMandat;
    
    private String matWarehouseNum;

    private String matEntitledPart;

    private String matHuident;

    private String matNumber;

    private String matCode;

    private String matTuhao;

    private String matName;

    private String matFurnaceNo;

    private String matGlevel;

    private String matVersion;
    
    private String matBatchNo;

    private BigDecimal boxQuan;
    
    private String boxBarcode;

    private String boxInspector;

    private Date createTime;

    private Date updateTime;

    private Boolean isOpen;

    private BigDecimal boxQuanLeft;

    private Boolean isCleaned;

    public Integer getPobId() {
        return pobId;
    }

    public void setPobId(Integer pobId) {
        this.pobId = pobId;
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getMatMandat() {
        return matMandat;
    }

    public void setMatMandat(String matMandat) {
        this.matMandat = matMandat == null ? null : matMandat.trim();
    }

    public String getMatWarehouseNum() {
        return matWarehouseNum;
    }

    public void setMatWarehouseNum(String matWarehouseNum) {
        this.matWarehouseNum = matWarehouseNum == null ? null : matWarehouseNum.trim();
    }

    public String getMatEntitledPart() {
        return matEntitledPart;
    }

    public void setMatEntitledPart(String matEntitledPart) {
        this.matEntitledPart = matEntitledPart == null ? null : matEntitledPart.trim();
    }

    public String getMatHuident() {
        return matHuident;
    }

    public void setMatHuident(String matHuident) {
        this.matHuident = matHuident == null ? null : matHuident.trim();
    }

    public String getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber == null ? null : matNumber.trim();
    }

    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode == null ? null : matCode.trim();
    }

    public String getMatTuhao() {
        return matTuhao;
    }

    public void setMatTuhao(String matTuhao) {
        this.matTuhao = matTuhao == null ? null : matTuhao.trim();
    }

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName == null ? null : matName.trim();
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

    public String getMatVersion() {
        return matVersion;
    }

    public void setMatVersion(String matVersion) {
        this.matVersion = matVersion == null ? null : matVersion.trim();
    }

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo == null ? null : matBatchNo.trim();
    }

    public BigDecimal getBoxQuan() {
        return boxQuan;
    }

    public void setBoxQuan(BigDecimal boxQuan) {
        this.boxQuan = boxQuan;
    }

    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode == null ? null : boxBarcode.trim();
    }

    public String getBoxInspector() {
        return boxInspector;
    }

    public void setBoxInspector(String boxInspector) {
        this.boxInspector = boxInspector == null ? null : boxInspector.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public BigDecimal getBoxQuanLeft() {
        return boxQuanLeft;
    }

    public void setBoxQuanLeft(BigDecimal boxQuanLeft) {
        this.boxQuanLeft = boxQuanLeft;
    }

    public Boolean getIsCleaned() {
        return isCleaned;
    }

    public void setIsCleaned(Boolean isCleaned) {
        this.isCleaned = isCleaned;
    }
}