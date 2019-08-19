/**
 * @Title: PrinterService.java 
 * @Package com.uspring.sdsmesplus.mq 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 下午4:48:28 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mq;


import com.uspring.sdsmesplus.wms.entity.Package;
/** 
 * @ClassName: PrinterService 
 * @Description: 打印接口
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月29日 下午4:48:28 
 *  
 */
public interface PrinterService {


	
	/** 
	* @Title: printMatBoxBarcode 
	* @Description: 打印零件合格证
	* @param pkg 零件包装对象
	* @param lineId  产线ID
	*/
	public void printMatBoxBarcode(Package pkg, int lineId);
	
	/** 
	* @Title: printFPBarcode 
	* @Description: 总成条码打印 
	* @param prodCode 产品简码
	* @param customerCode  客户号
	* @param lineId 产线ID
	*/
	public void printFPBarcode(String prodCode, String customerCode, int lineId);
	
	// TODO 不合格品黄牌标签打印
}
