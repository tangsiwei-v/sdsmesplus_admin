package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysStoragebinPO {
    private Integer binId;

    private String warehouseNum;

    private String warehouseLoc;

    private String storageType;

    private String storageTypeDesc;

    private String workStation;

    private String workStationDesc;

    private String entitledPart;

    private String binArea;

    private Boolean isActive;

    private Date createTime;

    private Date updateTime;

    public Integer getBinId() {
        return binId;
    }

    public void setBinId(Integer binId) {
        this.binId = binId;
    }

    public String getWarehouseNum() {
        return warehouseNum;
    }

    public void setWarehouseNum(String warehouseNum) {
        this.warehouseNum = warehouseNum == null ? null : warehouseNum.trim();
    }

    public String getWarehouseLoc() {
        return warehouseLoc;
    }

    public void setWarehouseLoc(String warehouseLoc) {
        this.warehouseLoc = warehouseLoc == null ? null : warehouseLoc.trim();
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType == null ? null : storageType.trim();
    }

    public String getStorageTypeDesc() {
        return storageTypeDesc;
    }

    public void setStorageTypeDesc(String storageTypeDesc) {
        this.storageTypeDesc = storageTypeDesc == null ? null : storageTypeDesc.trim();
    }

    public String getWorkStation() {
        return workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation == null ? null : workStation.trim();
    }

    public String getWorkStationDesc() {
        return workStationDesc;
    }

    public void setWorkStationDesc(String workStationDesc) {
        this.workStationDesc = workStationDesc == null ? null : workStationDesc.trim();
    }

    public String getEntitledPart() {
        return entitledPart;
    }

    public void setEntitledPart(String entitledPart) {
        this.entitledPart = entitledPart == null ? null : entitledPart.trim();
    }

    public String getBinArea() {
        return binArea;
    }

    public void setBinArea(String binArea) {
        this.binArea = binArea == null ? null : binArea.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
}