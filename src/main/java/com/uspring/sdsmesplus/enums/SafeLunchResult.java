package com.uspring.sdsmesplus.enums;

/**
 * @Version 1.0
 * @Description: 拆包
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/24 15:32
 */

public enum SafeLunchResult {

	PASS("FF", "合格"),
    FAIL("BB", "不合格");

    //代码
    private String code;
    //描述
    private String desc;

    private SafeLunchResult(String code, String desc){
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
