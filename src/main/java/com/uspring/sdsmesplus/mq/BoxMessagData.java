/**
 * @Title: BoxMessagData.java 
 * @Package com.uspring.sdsmesplus.mq 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月24日 下午10:01:47 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mq;

/** 
 * @ClassName: BoxMessagData 
 * @Description: 箱合格证打印消息
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月24日 下午10:01:47 
 *  
 */
public class BoxMessagData {

	/**
	 * @Fields boxBarcode : 合格证号
	 */
	private String boxBarcode;
	
	/**
	 * @Fields sapCode : SAP物料号
	 */
	private String sapCode;
	
	/**
	 * @Fields prodName : 物料名称
	 */
	private String prodName;
	
	/**
	 * @Fields prodCode : 物料号
	 */
	private String prodCode;
	
	/**
	 * @Fields tuhao : 图号
	 */
	private String tuhao;
	
	//客户料号
	/**
	 * @Fields customerMtCode : 客户料号
	 */
	private String customerMtCode;
	
	/**
	 * @Fields batchNo : 生产批号
	 */
	private String batchNo;
	
	/**
	 * @Fields luhao : 炉号
	 */
	private String luhao;
	
	/**
	 * @Fields glevel : 档位
	 */
	private String glevel;
	
	/**
	 * @Fields count : 数量
	 */
	private Integer count;
	
	/**
	 * @Fields checkPerson : 校验人
	 */
	private String checkPerson;
	
	/**
	 * @Fields date : 日期
	 */
	private String date;

	public String getBoxBarcode() {
		return boxBarcode;
	}

	public void setBoxBarcode(String boxBarcode) {
		this.boxBarcode = boxBarcode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getTuhao() {
		return tuhao;
	}

	public void setTuhao(String tuhao) {
		this.tuhao = tuhao;
	}

	public String getCustomerMtCode() {
		return customerMtCode;
	}

	public void setCustomerMtCode(String customerMtCode) {
		this.customerMtCode = customerMtCode;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getLuhao() {
		return luhao;
	}

	public void setLuhao(String luhao) {
		this.luhao = luhao;
	}

	public String getGlevel() {
		return glevel;
	}

	public void setGlevel(String glevel) {
		this.glevel = glevel;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getCheckPerson() {
		return checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}
}
