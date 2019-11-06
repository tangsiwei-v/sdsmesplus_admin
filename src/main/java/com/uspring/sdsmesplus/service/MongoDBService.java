/**
 * @Title: MongoDBService.java 
 * @Package com.uspring.natiefu.mes.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年8月5日 上午9:11:32 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import com.uspring.sdsmesplus.entity.vo.LineRFID;
import com.uspring.sdsmesplus.exception.ServiceException;

/** 
 * @ClassName: MongoDBService 
 * @Description: MongoDB 服务类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年8月5日 上午9:11:32 
 *  
 */
public interface MongoDBService {

	//按RFID查询过程参数
	Map<String, Object> findPParamByRFID(String rfid);
	
	//按RFID查询过程参数
	Map<String, Object> findPParamByRFIDAndLine(String rfid,String line);
	
	//根据工单编号，修改当天二维码为空的数据最后一条数据
	String updateCodeByOrder(Integer lineId,String qrCode);
	
	//根据工单查询产品生产个数
	List<Map<String,Object>> findList(Integer lineId);
	
	//根据二维码获取过程参数
	Map<String, Object> getParamBySerial(String qrCode);
	
	//更具产线获取最新的一条数据
	Map<String, Object> findPParamByLineId(Integer lineId);
	
	//当天二维码为空的数据
	Map<String, Object> findQrcodeIsEmpty(Integer lineId);

	//将二维码和rfid绑定
	void bingingRfid(String qrCode,String rfid);
	
	//批量绑定数据
	void bingingSomeRfid(List<Map<String,Object>> dataList);
	
	//判断是否重复的数据
	List<String> checkIsExist(List<String> dataList);
	
	//质量参数趋势
	List<Map<String,Object>> getQualtiyProcess(Integer lineId,String searchTime);
	
	//获取当前所有产品的图号简码
	void getProduceDataByLine(String time,Integer line);
	
	//数据填充绑定
	void fillData(String beginTime,String tuhao,Integer lineId,String orderCode)throws ServiceException;
	
	//根据rfid集合查询数据
	List<Map<String,Object>> queryRfidData(List<String> rfids,String orderBy);
	
	//绑定数据
	void materialBind(List<Map<String,Object>> bindList,String time,Integer lineId);
	
	//判断该RFID的所有值是否合格
	Map<String,Object> isCheckOk(String rfid, String factoryCode, Integer lineId);
	
	//获取该RFID所有工序的状态 
	LineRFID getProductStatus(String rfid, Integer lineId);
	
	//三大件反查
	Map<String,Object> dataReverSearch(Integer type,String value,Integer factoryId);
	
	//查询所有工序数据
	List<Map<String,Object>> getProcessData(String rfid,Integer lineId);
	
}
