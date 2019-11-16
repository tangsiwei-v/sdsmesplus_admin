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
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;

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
	Map<String,Object> getProductList(Integer lineId, String boxCode, String barcode, String tuhao,String prodCode,String prodNumber,String poCode, String beginTime, String endTime, Integer pageNum, Integer pageSize);
	
	
	/**
	 * @Title: useMaterialInfo 
	 * @Description: 查询物料的使用情况
	 * @param fpBarcode  产品总成号
	 * @param boxCode  箱号
	 * @param materialCode 物料号
	 * @param batchNo 批次号
	 * @param furnaceNo 炉号
	 * @param prodCode 产品简码
	 * @param materialBoxCode物料合格证
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @param pageNum 
	 * @param pageSize
	 * @return
	 */
	Map<String,Object> useMaterialInfo(String fpBarcode,String boxCode, String materialCode,String batchNo,String furnaceNo,String prodCode,String materialBoxCode,String beginTime,String endTime,Integer pageNum, Integer pageSize);
	
	/**
	 * 三大件反查
	 * @param type  1:轴， 2：外星轮，3：轴叉
	 * @param value  二维码编号
	 * @param factoryCode 工厂编号
	 * @return
	 */
	List<Map<String,Object>> getInverseQuery(Integer type,String value,Integer fcId);
	
	/**
	 * 获取线边库存数据
	 * @param orderCode 工单编号
	 * @param prodCode 产品简码
	 * @param beginTime
	 * @param endTime
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	Map<String,Object> getOrderStock(String orderCode, String prodCode, String beginTime, String endTime,
			Integer pageNum, Integer pageSize, Integer lineId, String prodNumber,String matProdCode,String matProdNumber,String boxCode);
	
	/**
	 * 获取不合格品记录
	 * @param lineId 产线编号
	 * @param prodCode SAP号
	 * @param prodNumber 产品简码
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @param pageNum
	 * @param pageSize
	 * @param status 状态
	 * @return
	 */
	Map<String,Object> getWasteProd(Integer lineId,String prodCode,String prodNumber,String beginTime,String endTime,Integer pageNum,Integer pageSize,String matProdCode,String matProdNumber,String status,String poCode);
	
	/**
	 * 
	 * @param lineId
	 * @param nplBarcode  不合格品编号
	 * @param beginTime
	 * @param endTime
	 * @param prodCode  sap号
	 * @param prodNumber  产品简码
	 * @param matProdCode  物料sap号
	 * @param matProdNumber 物料简码
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	Map<String,Object> getWasteProdMaterial(Integer lineId,String nplBarcode,String beginTime,String endTime,String matProdCode,String matProdNumber,Integer pageNum,Integer pageSize);
	
	/**
	 * 
	 * @param lineId
	 * @param poCode 工单编号
	 * @param prodCode SAP号
	 * @param prodNumber 产品简码
	 * @param batchNo 批次号
	 * @param furnaceNo 炉号
	 * @param beginTime
	 * @param endTime
	 * @param pageNum
	 * @param pageSize
	 * @param matProdCode 物料SAP号
	 * @param matProdNumber 物料简码
	 * @return
	 */
	Map<String,Object> getMachMaterial(Integer lineId,String poCode,String prodCode,String prodNumber,String batchNo,String furnaceNo,String beginTime,String endTime,Integer pageNum,Integer pageSize,String matProdCode,String matProdNumber,String matBoxCode);
	
	/**
	 * 查询safelunch记录
	 * @param lineId 
	 * @param poCode工单编号
	 * @param prodCode 工单编号
	 * @param prodNumber 产品简码
	 * @param boxCode 箱号
	 * @param beginTime
	 * @param endTime
	 * @param safelineId sefelunch产线
	 * @return
	 */
	Map<String,Object> getSafeLunch(Integer lineId,String poCode,String prodCode,String prodNumber,String boxCode,String beginTime,String endTime,Integer pageNum,Integer pageSize,Integer safelineId);
	
	/**
	 * 查询safelunch详细信息
	 * @param lineId
	 * @param poCode 工单编号
	 * @param prodCode 工单编号
	 * @param prodNumber 产品简码
	 * @param boxCode 箱号
	 * @param beginTime
	 * @param endTime
	 * @param safeLunchOrder safelunch检验编号
	 * @param safelineId sefelunch产线
	 * @return
	 */
	Map<String,Object> getSafeLunchDetail(Integer lineId,String poCode,String prodCode,String prodNumber,String boxCode,String beginTime,String endTime,String safeLunchOrder,Integer pageNum,Integer pageSize,Integer safelineId,String fpBarcode);
	
	/**
	 * 获取safelunch线
	 * @param fcId
	 * @return
	 */
	List<SafelunchWorkLinePO> getSafeLunchWorkLine(Integer fcId);
		
}
