package com.uspring.sdsmesplus.enums;

/**
 * @Version 1.0
 * @Description: savelanuch状态
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/1 16:32
 */
public enum SaveLaunchStadus {

    good("FF", "合格"),
    no("BB","不合格");

    //代码
    private String code;
    //描述
    private String desc;

    private SaveLaunchStadus(String code, String desc){
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
