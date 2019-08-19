package com.uspring.sdsmesplus.entity.po;

public class PlanOpBomPO {
    private Integer plbmId;

    private Integer plopId;

    private String materialPosnr;

    private String materialCode;

    private Double materialCount;

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

	public Double getMaterialCount() {
		return materialCount;
	}

	public void setMaterialCount(Double materialCount) {
		this.materialCount = materialCount;
	}
}