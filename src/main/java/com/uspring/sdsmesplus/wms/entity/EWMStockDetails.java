package com.uspring.sdsmesplus.wms.entity;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/18 9:41
 */
public class EWMStockDetails {

    //仓库编号
    private String matWarehouseNum;
    //Hu
    private String boxarea_code;
    //仓库类型
    private String stockTypeDes;
    //产品名称
    private String prodName;
    //产品描述
    private String prodDes;
    //批号
    private String matBatchNo;
    //库存数量
    private String decimal;
    //单位
    private String unit;
    //日期
    private String arrivalDate;
    //时间
    private String arrivalTime;
    //炉号
    private String  prod_furnace_no;
    //档位
    private String  prod_glevel;
    //检验员
    private String  inspector;

    public String getBoxarea_code() {
        return boxarea_code;
    }

    public void setBoxarea_code(String boxarea_code) {
        this.boxarea_code = boxarea_code;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getProd_furnace_no() {
        return prod_furnace_no;
    }

    public void setProd_furnace_no(String prod_furnace_no) {
        this.prod_furnace_no = prod_furnace_no;
    }

    public String getProd_glevel() {
        return prod_glevel;
    }

    public void setProd_glevel(String prod_glevel) {
        this.prod_glevel = prod_glevel;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }



    public String getMatWarehouseNum() {
        return matWarehouseNum;
    }

    public void setMatWarehouseNum(String matWarehouseNum) {
        this.matWarehouseNum = matWarehouseNum;
    }

    public String getStockTypeDes() {
        return stockTypeDes;
    }

    public void setStockTypeDes(String stockTypeDes) {
        this.stockTypeDes = stockTypeDes;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDes() {
        return prodDes;
    }

    public void setProdDes(String prodDes) {
        this.prodDes = prodDes;
    }

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }



}
