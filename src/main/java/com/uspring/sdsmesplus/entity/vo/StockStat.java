package com.uspring.sdsmesplus.entity.vo;

import java.util.Date;

/**
 * @author lihuan
 * 库存统计类
 */
public class StockStat {
	
	//工单号
	private String poCode;
	
	//工序号
	private String procCode;
	
	//箱号
	private String boxBarcode;
	
	//物料号
	private String matCode;
	
	//物料名称
	private String matName;
	
	//批次号
	private String batchNo;
	
	//炉号
	private String furnaceNo;
	
	//档位
	private String glevel;
	
	//数量
	private double matCount;
	
	//创建时间
	private Date createTime;
	
	//修改时间
	private Date updateTime;

	public String getPoCode() {
		return poCode;
	}

	public void setPoCode(String poCode) {
		this.poCode = poCode;
	}

	public String getProcCode() {
		return procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public String getMatCode() {
		return matCode;
	}

	public void setMatCode(String matCode) {
		this.matCode = matCode;
	}

	public String getMatName() {
		return matName;
	}

	public void setMatName(String matName) {
		this.matName = matName;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getFurnaceNo() {
		return furnaceNo;
	}

	public void setFurnaceNo(String furnaceNo) {
		this.furnaceNo = furnaceNo;
	}

	public String getGlevel() {
		return glevel;
	}

	public void setGlevel(String glevel) {
		this.glevel = glevel;
	}

	public double getMatCount() {
		return matCount;
	}

	public void setMatCount(double matCount) {
		this.matCount = matCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBoxBarcode() {
		return boxBarcode;
	}

	public void setBoxBarcode(String boxBarcode) {
		this.boxBarcode = boxBarcode;
	}
}
