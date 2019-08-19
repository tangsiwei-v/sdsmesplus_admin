/**
 * @Title: FPBarcodeMessageData.java 
 * @Package com.uspring.sdsmesplus.mq 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月24日 下午10:00:48 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mq;

/** 
 * @ClassName: FPBarcodeMessageData 
 * @Description: 总成条码打印消息
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月24日 下午10:00:48 
 *  
 */
public class FPBarcodeMessageData {

	private String prodCode;
	
	private String customerCode;

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
}
