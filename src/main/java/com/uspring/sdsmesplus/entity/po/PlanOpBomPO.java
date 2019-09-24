package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;

public class PlanOpBomPO {
    private Integer plbmId;

    private Integer plopId;

    private String materialPosnr;

    private String materialCode;

    private String materialName;

    private String materialTuhao;

    private String materialNumber;

    private BigDecimal materialCount;

    private String materialUnit;

    private String materialStloc;

    private String materialPsa;

    public Integer getPlbmId() {
        return plbmId;
    }

    public void setPlbmId(Integer plbmId) {
        this.plbmId = plbmId;
    }

    public Integer getPlopId() {
        return plopId;
    }

    public void setPlopId(Integer plopId) {
        this.plopId = plopId;
    }

    public String getMaterialPosnr() {
        return materialPosnr;
    }

    public void setMaterialPosnr(String materialPosnr) {
        this.materialPosnr = materialPosnr == null ? null : materialPosnr.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
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

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber == null ? null : materialNumber.trim();
    }

    public BigDecimal getMaterialCount() {
        return materialCount;
    }

    public void setMaterialCount(BigDecimal materialCount) {
        this.materialCount = materialCount;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit == null ? null : materialUnit.trim();
    }

    public String getMaterialStloc() {
        return materialStloc;
    }

    public void setMaterialStloc(String materialStloc) {
        this.materialStloc = materialStloc == null ? null : materialStloc.trim();
    }

    public String getMaterialPsa() {
        return materialPsa;
    }

    public void setMaterialPsa(String materialPsa) {
        this.materialPsa = materialPsa == null ? null : materialPsa.trim();
    }
}