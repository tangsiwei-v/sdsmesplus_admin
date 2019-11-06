/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdProductMaterialPO;

/** 
 * @ClassName: ReportService 
 * @Description: 数据报表接口
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface ReportService {
	/** 
	* @Title: getProductInfo 
	* @Description: 查询产品的基本信息
	* @param barcode 产品条码
	* @return  产品基本信息
	*/
	Map<String,Object> getProductInfo(String barcode);
	
	/** 
	* @Title: costMaterial 
	* @Description: 查询产品的物料消耗
	* @param fpId 产品编号
	* @return  物料对象
	*/
	List<Map<String,Object>> costMaterial(Integer fpId);
	
	/** 
	* @Title: getProcessInfo 
	* @Description: 查询产品的过程参数数据
	* @param rfid RFID
	* @param lineId 产线编号
	* @return  工序数据
	*/
	List<Map<String,Object>> getProcessInfo(String rfid, Integer lineId);
	
	/**
	 * @Title: getBoxList 
	 * @Description: 查询箱的信息
	 * @param lineId 产线编号
	 * @param boxCode 箱编号
	 * @param barcode 产品条码
	 * @param tuhao 图号
	 * @param prodCode 产品简码
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return
	 */
	Map<String,Object> getBoxList(Integer lineId, String boxCode, String tuhao,String prodCode, String prodNumber, String beginTime, String endTime, String poCode, Integer pageNum, Integer pageSize);
	
	/**
	 * @Title: getProductList 
	 * @Description: 查询产品总成信息
	 * @param lineId 产线编号
	 * @param boxCode 箱编号
	 * @param barcode 产品条码
	 * @param tuhao 图号
	 * @param prodCode 产品简码
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return
	 */
	Map<String,Object> getProductList(Integer lineId, String boxCode, String barcode, String tuhao,String prodCode,String prodNumber, String beginTime, String endTime, Integer pageNum, Integer pageSize);
	
		
}
