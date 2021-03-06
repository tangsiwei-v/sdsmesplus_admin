package com.uspring.sdsmesplus.enums;

/**
 * @Version 1.0
 * @Description: NonconformProduct状态
 * @Author:shangyanbing shangyanbing@uspring.cn 
 * @date 2019年8月3日 上午11:09:45
 */

public enum NonconformProductStatus {
	
	Entering("Entering","录入"),
	Isolation("Isolation","隔离"),
	Cancel("Cancel","作废");

    //代码
    private String code;
    //描述
    private String desc;

    private NonconformProductStatus(String code, String desc){
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
