package com.uspring.sdsmesplus.entity.vo;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/15 11:05
 */
public class ProdBoxLogVO  {


    private String boxBarcode;
    private String lineId;
    private String boxareaCode;
    private String prodBatchCode;
    private String empNumber;
    private String empName;
    private String boxQuan;
    private String createTime;
    private String prodTuhao;
    private String prodName;


    public String getBoxBarcode() {
        return boxBarcode;
    }

    public void setBoxBarcode(String boxBarcode) {
        this.boxBarcode = boxBarcode;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getBoxareaCode() {
        return boxareaCode;
    }

    public void setBoxareaCode(String boxareaCode) {
        this.boxareaCode = boxareaCode;
    }

    public String getProdBatchCode() {
        return prodBatchCode;
    }

    public void setProdBatchCode(String prodBatchCode) {
        this.prodBatchCode = prodBatchCode;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBoxQuan() {
        return boxQuan;
    }

    public void setBoxQuan(String boxQuan) {
        this.boxQuan = boxQuan;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getProdTuhao() {
        return prodTuhao;
    }

    public void setProdTuhao(String prodTuhao) {
        this.prodTuhao = prodTuhao;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }



}
