package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class NonconformProductMaterialPO {
    private Integer nplmId;

    private Integer nplId;

    private String nplBarcode;

    private String nplmBarcode;

    private String materialCode;

    private String materialNumber;

    private String materialName;

    private String materialTuhao;

    private String materialBoxCode;

    private String materialBoxQrcode;

    private String materialBatchCode;

    private String materialFurnaceNo;

    private String materialGlevel;

    private BigDecimal materialQty;

    private String materialUnit;

    private Date createTime;

    public Integer getNplmId() {
        return nplmId;
    }

    public void setNplmId(Integer nplmId) {
        this.nplmId = nplmId;
    }

    public Integer getNplId() {
        return nplId;
    }

    public void setNplId(Integer nplId) {
        this.nplId = nplId;
    }

    public String getNplBarcode() {
        return nplBarcode;
    }

    public void setNplBarcode(String nplBarcode) {
        this.nplBarcode = nplBarcode == null ? null : nplBarcode.trim();
    }

    public String getNplmBarcode() {
        return nplmBarcode;
    }

    public void setNplmBarcode(String nplmBarcode) {
        this.nplmBarcode = nplmBarcode == null ? null : nplmBarcode.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber == null ? null : materialNumber.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialTuhao() {
        return materialTuhao;
    }

    public void setMaterialTuhao(String materialTuhao) {
        this.materialTuhao = materialTuhao == null ? null : materialTuhao.trim();
    }

    public String getMaterialBoxCode() {
        return materialBoxCode;
    }

    public void setMaterialBoxCode(String materialBoxCode) {
        this.materialBoxCode = materialBoxCode == null ? null : materialBoxCode.trim();
    }

    public String getMaterialBoxQrcode() {
        return materialBoxQrcode;
    }

    public void setMaterialBoxQrcode(String materialBoxQrcode) {
        this.materialBoxQrcode = materialBoxQrcode == null ? null : materialBoxQrcode.trim();
    }

    public String getMaterialBatchCode() {
        return materialBatchCode;
    }

    public void setMaterialBatchCode(String materialBatchCode) {
        this.materialBatchCode = materialBatchCode == null ? null : materialBatchCode.trim();
    }

    public String getMaterialFurnaceNo() {
        return materialFurnaceNo;
    }

    public void setMaterialFurnaceNo(String materialFurnaceNo) {
        this.materialFurnaceNo = materialFurnaceNo == null ? null : materialFurnaceNo.trim();
    }

    public String getMaterialGlevel() {
        return materialGlevel;
    }

    public void setMaterialGlevel(String materialGlevel) {
        this.materialGlevel = materialGlevel == null ? null : materialGlevel.trim();
    }

    public BigDecimal getMaterialQty() {
        return materialQty;
    }

    public void setMaterialQty(BigDecimal materialQty) {
        this.materialQty = materialQty;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit == null ? null : materialUnit.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}