/**
 * @Title: BomMaterial.java 
 * @Package com.uspring.sdsmesplus.mpmlink 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月24日 下午2:16:15 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mpmlink;

/** 
 * @ClassName: BomMaterial 
 * @Description: BOM物料信息
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月24日 下午2:16:15 
 *  
 */
public class BomMaterial {

	//物料简码
	private String materialCode;
	
	//物料名称
	private String materialName;
	
	//物料单位消耗
	private double materialUnit;

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public double getMaterialUnit() {
		return materialUnit;
	}

	public void setMaterialUnit(double materialUnit) {
		this.materialUnit = materialUnit;
	}
}
