/**
 * @Title: ProcessStep.java 
 * @Package com.uspring.sdsmesplus.mpmlink 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月24日 下午1:59:48 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mpmlink;

import java.util.List;

/** 
 * @ClassName: ProcessStep 
 * @Description: 工序信息
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月24日 下午1:59:48 
 *  
 */
public class ProcessStep {

	//工序编码
	private String procCode;
	
	//工序名称
	private String procName;
	
	//关联设备
	private List<String> devCodes;
	
	//物料消耗
	private List<BomMaterial> materials;

	public String getProcCode() {
		return procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public String getProcName() {
		return procName;
	}

	public void setProcName(String procName) {
		this.procName = procName;
	}

	public List<String> getDevCodes() {
		return devCodes;
	}

	public void setDevCodes(List<String> devCodes) {
		this.devCodes = devCodes;
	}

	public List<BomMaterial> getMaterials() {
		return materials;
	}

	public void setMaterials(List<BomMaterial> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "ProcessStep [procCode=" + procCode + ", procName=" + procName + ", devCodes=" + devCodes
				+ ", materials=" + materials + "]";
	}
	
	
	//TODO 人员技能要求
	
	//TODO 质量检验项目
	
	
}
