package com.uspring.sdsmesplus.entity.vo;

import java.util.ArrayList;
import java.util.List;


/**
 * @author liubo@uspring.cn
 * @Description: 封装子零件和成品批号
 * @date 2020/5/11 9:54
 */
public class ProdBatchCodeVO {


    private String prodCode;
    private String prodBatchCode;
    private String prodName;
    private String boxQuan;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getBoxQuan() {
        return boxQuan;
    }

    public void setBoxQuan(String boxQuan) {
        this.boxQuan = boxQuan;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdBatchCode() {
        return prodBatchCode;
    }

    public void setProdBatchCode(String prodBatchCode) {
        this.prodBatchCode = prodBatchCode;
    }











}
