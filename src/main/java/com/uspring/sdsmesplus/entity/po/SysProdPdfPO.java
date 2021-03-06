package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class SysProdPdfPO {
    private Integer sppId;

    private Integer fcId;

    private String prodCode;

    private String pdfName;

    private String pdfContent;

    private String pdfUrl;

    private Integer pdfLastpage;

    private String pdfType;

    private Date createTime;

    private Date updateTime;

    public Integer getSppId() {
        return sppId;
    }

    public void setSppId(Integer sppId) {
        this.sppId = sppId;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName == null ? null : pdfName.trim();
    }

    public String getPdfContent() {
        return pdfContent;
    }

    public void setPdfContent(String pdfContent) {
        this.pdfContent = pdfContent == null ? null : pdfContent.trim();
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl == null ? null : pdfUrl.trim();
    }

    public Integer getPdfLastpage() {
        return pdfLastpage;
    }

    public void setPdfLastpage(Integer pdfLastpage) {
        this.pdfLastpage = pdfLastpage;
    }

    public String getPdfType() {
        return pdfType;
    }

    public void setPdfType(String pdfType) {
        this.pdfType = pdfType == null ? null : pdfType.trim();
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