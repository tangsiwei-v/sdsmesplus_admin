/**
 * @Title: BomInfo.java 
 * @Package com.uspring.sdsmesplus.mpmlink 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月24日 上午11:31:07 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mpmlink;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: BomInfo 
 * @Description: 产品BOM信息
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月24日 上午11:31:07 
 *  
 */
public class BomInfo {
	
	//产品简码
	private String prodCode;
	
	//产品名称
	private String prodName;
	
	//产线编号
	private String lineCode;

	private List<BomMaterial> materials = new ArrayList<BomMaterial>();

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	public List<BomMaterial> getMaterials() {
		return materials;
	}

	public void setMaterials(List<BomMaterial> materials) {
		this.materials = materials;
	}
}
