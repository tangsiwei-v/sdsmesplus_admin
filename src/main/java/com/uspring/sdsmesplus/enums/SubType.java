package com.uspring.sdsmesplus.enums;

/**
 * @Version 1.0
 * @Description: 报工
 * @Author:
 * @date 2019/7/27 16:32
 */
public enum SubType {
	
	/**
	 * 报工标识            A-下线点报工，
	 * GR/GI/TT   T-中间工序报工，
	 * GI/TT      R-返工下线，
	 * GR/GI      C-工单关闭，Close
	 **/

    Sub("A", "下线点报工"),
    Mind("T", "中间工序报工"),
    Back("R", "返工下线"),
    Close("C","工单关闭，Close");

    //代码
    private String code;
    //描述
    private String desc;

    private SubType(String code, String desc){
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
