package com.uspring.sdsmesplus.entity.vo;

import java.util.Date;
import java.util.List;

public class LineRFID {

	//rfid编号
	public String rfid;
	
	//状态0不合格  1合格
	public Boolean status;
	
	//不合格描述
	public String message;
	
	//rfid产生时间
	public Date rfidTime;
	
	//rfid下的工序
	public List<ProdProcess> lineProcess;

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRfidTime() {
		return rfidTime;
	}

	public void setRfidTime(Date rfidTime) {
		this.rfidTime = rfidTime;
	}

	public List<ProdProcess> getLineProcess() {
		return lineProcess;
	}

	public void setLineProcess(List<ProdProcess> lineProcess) {
		this.lineProcess = lineProcess;
	}

    
	
	
	
}
