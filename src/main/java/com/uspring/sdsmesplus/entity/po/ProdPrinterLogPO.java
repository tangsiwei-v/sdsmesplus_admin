package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

public class ProdPrinterLogPO {
    private Integer fpId;

    private Integer lineId;

    private String prodCode;

    private String customerCode;

    private String barcode;

    private String barcodeType;

    private String printDetail;

    private String printerIp;

    private String printerMac;

    private Date createTime;

    public Integer getFpId() {
        return fpId;
    }

    public void setFpId(Integer fpId) {
        this.fpId = fpId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String barcodeType) {
        this.barcodeType = barcodeType == null ? null : barcodeType.trim();
    }

    public String getPrintDetail() {
        return printDetail;
    }

    public void setPrintDetail(String printDetail) {
        this.printDetail = printDetail == null ? null : printDetail.trim();
    }

    public String getPrinterIp() {
        return printerIp;
    }

    public void setPrinterIp(String printerIp) {
        this.printerIp = printerIp == null ? null : printerIp.trim();
    }

    public String getPrinterMac() {
        return printerMac;
    }

    public void setPrinterMac(String printerMac) {
        this.printerMac = printerMac == null ? null : printerMac.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}