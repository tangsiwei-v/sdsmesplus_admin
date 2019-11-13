package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.NonconformProductLogPODao;
import com.uspring.sdsmesplus.entity.vo.NonconformProductVO;

/** 
 * @ClassName: NonconformProductLogDao 
 * @Description: 基于NonconformProductLog数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月30日 下午1:12:57
 *  
 */

public interface NonconformProductDao extends NonconformProductLogPODao{
	/** 
	* @Title: record
	* @Description: 根据fcId,shopId,
	* lineId,shiftId,status,start_time,end_time,page_size,page_num条件查询
	* @param fcId 工厂ID,shopId 车间ID,lineId 产线ID,shiftId 班次ID,status 状态
	* @return NonconformProductLog实体类
	*/
	List<NonconformProductVO> record(@Param("fcId") Integer fcId, @Param("shopId") Integer shopId, @Param("lineId") Integer lineId, @Param("shiftId") Integer shiftId, @Param("status") String status,
			@Param("start_time") String start_time, @Param("end_time") String end_time, Integer page_size, Integer page_num);
	
	List<Map<String,Object>> getWasteProd(@Param("lineId")Integer lineId,@Param("prodCode")String prodCode,@Param("prodNumber")String prodNumber,@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("matProdCode")String matProdCode,@Param("matProdNumber")String matProdNumber,@Param("status")String status);
	
	List<Map<String,Object>> getWasteProdMaterial(@Param("lineId")Integer lineId, @Param("nplBarcode")String nplBarcode, @Param("beginTime")String beginTime, @Param("endTime")String endTime,
			@Param("prodCode")String prodCode, @Param("prodNumber")String prodNumber, @Param("matProdCode")String matProdCode, @Param("matProdNumber")String matProdNumber);
}
