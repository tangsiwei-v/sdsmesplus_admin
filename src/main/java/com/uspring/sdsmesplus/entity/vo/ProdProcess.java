package com.uspring.sdsmesplus.entity.vo;

public class ProdProcess {
	
   //工序编号
   public String processCode;
   
   //工序名称
   public String processName;
   
   //工序状态  0不合格， 1合格，2不存在（无数据）
   public int processStatus;

	public String getProcessCode() {
		return processCode;
	}
	
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	
	public String getProcessName() {
		return processName;
	}
	
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	public int getProcessStatus() {
		return processStatus;
	}
	
	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}
   
   
}
