package com.uspring.sdsmesplus.entity.po;

import java.math.BigDecimal;
import java.util.Date;

public class ProdProductMaterialPO {
    private Integer pmbId;

    private Integer fpId;

    private String fpBarcode;

    private String matCode;

    private String matTuhao;

    private String matBatchNo;

    private String matFurnaceNo;

    private String matGlevel;

    private String matBarcode;

    private String matBoxBarcode;

    private BigDecimal matCount;

    private Date createTime;

    public Integer getPmbId() {
        return pmbId;
    }

    public void setPmbId(Integer pmbId) {
        this.pmbId = pmbId;
    }

    public Integer getFpId() {
        return fpId;
    }

    public void setFpId(Integer fpId) {
        this.fpId = fpId;
    }

    public String getFpBarcode() {
        return fpBarcode;
    }

    public void setFpBarcode(String fpBarcode) {
        this.fpBarcode = fpBarcode == null ? null : fpBarcode.trim();
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

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo == null ? null : matBatchNo.trim();
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

    public String getMatBarcode() {
        return matBarcode;
    }

    public void setMatBarcode(String matBarcode) {
        this.matBarcode = matBarcode == null ? null : matBarcode.trim();
    }

    public String getMatBoxBarcode() {
        return matBoxBarcode;
    }

    public void setMatBoxBarcode(String matBoxBarcode) {
        this.matBoxBarcode = matBoxBarcode == null ? null : matBoxBarcode.trim();
    }

    public BigDecimal getMatCount() {
        return matCount;
    }

    public void setMatCount(BigDecimal matCount) {
        this.matCount = matCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}