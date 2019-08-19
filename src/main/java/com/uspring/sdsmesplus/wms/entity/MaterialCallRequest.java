package com.uspring.sdsmesplus.wms.entity;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * @ClassName: MaterialCall 
 * @Description: 物料拉动请求
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月18日 下午10:17:08 
 *  
 */
public class MaterialCallRequest {

	// 仓库编号/综合仓库
	private String matWarehouseNum;
	
	// 物料号
	private String matNumber;
	
	// 数量
	private BigDecimal boxQuan;
	
	// 基本计量单位
	private String matUnit;
	
	// 需求库位
	private String aimBank;
	
	// 需求仓位
	private String aimBin;
	
	// 期望截止日期
	private Long reciveDate;
	
	public String getMatWarehouseNum() {
		return matWarehouseNum;
	}
	
	public void setMatWarehouseNum(String matWarehouseNum) {
		this.matWarehouseNum = matWarehouseNum;
	}
	
	public String getMatNumber() {
		return matNumber;
	}
	
	public void setMatNumber(String matNumber) {
		this.matNumber = matNumber;
	}
	
	public BigDecimal getBoxQuan() {
		return boxQuan;
	}
	
	public void setBoxQuan(BigDecimal boxQuan) {
		this.boxQuan = boxQuan;
	}
	
	public String getMatUnit() {
		return matUnit;
	}
	
	public void setMatUnit(String matUnit) {
		this.matUnit = matUnit;
	}
	
	public String getAimBank() {
		return aimBank;
	}
	
	public void setAimBank(String aimBank) {
		this.aimBank = aimBank;
	}
	
	public String getAimBin() {
		return aimBin;
	}
	
	public void setAimBin(String aimBin) {
		this.aimBin = aimBin;
	}
	
	public Long getReciveDate() {
		return reciveDate;
	}
	
	public void setReciveDate(Long reciveDate) {
		this.reciveDate = reciveDate;
	}
	
	@Override
	public String toString() {
		return "BegMatDo [matWarehouseNum=" + matWarehouseNum + ", matNumber=" + matNumber + ", boxQuan=" + boxQuan
				+ ", matUnit=" + matUnit + ", aimBank=" + aimBank + ", aimBin=" + aimBin + ", reciveDate=" + reciveDate
				+ "]";
	}
    
}
