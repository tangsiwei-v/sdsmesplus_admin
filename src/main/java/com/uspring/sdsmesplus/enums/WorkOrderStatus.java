package com.uspring.sdsmesplus.enums;
/** 
 * @ClassName: WorkOrderStatus 
 * @Description: 工单状态枚举
 * @author chengtengfei chengtengfei@uspring.cn 
 * @date 2018年6月18日 下午13:25:24 
 *  
 */
public enum WorkOrderStatus{
	
	Assigned("Assigned", "下达"),
	Executing("Executing", "执行"),
	Frozen("Frozen", "冻结"),
	Completed("Completed", "完成");
	
	//代码
	private String code;
	
	//描述
	private String desc;
	
	private WorkOrderStatus(String code, String desc){
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
