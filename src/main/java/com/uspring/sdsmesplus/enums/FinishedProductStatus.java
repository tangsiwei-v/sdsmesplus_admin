package com.uspring.sdsmesplus.enums;

/**
 * @Version 1.0
 * @Description: 装箱
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/1 16:32
 */
public enum FinishedProductStatus {

    ToBox("ToBox", "待装箱"),
    ToBoxClose("ToBoxClose", "待结箱"),
    BoxClosed("BoxClosed", "已结箱"),
    BoxDeleted("BoxDeleted","已删除");

    //代码
    private String code;
    //描述
    private String desc;

    private FinishedProductStatus(String code, String desc){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }
}
