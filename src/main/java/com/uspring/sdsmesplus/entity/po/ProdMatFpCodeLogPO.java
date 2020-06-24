package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdMatFpCodeLogPO {
    private Integer mfpclId;

    private String prodCode;

    private String prodFpcode;

    private String matCode;

    private String codeName;

    private String codeValue;

    private Date createTime;

    public Integer getMfpclId() {
        return mfpclId;
    }

    public void setMfpclId(Integer mfpclId) {
        this.mfpclId = mfpclId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdFpcode() {
        return prodFpcode;
    }

    public void setProdFpcode(String prodFpcode) {
        this.prodFpcode = prodFpcode == null ? null : prodFpcode.trim();
    }

    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode == null ? null : matCode.trim();
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}