package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;

public interface ProdFinishedProductDao extends ProdFinishedProductPODao {

	//获取所有的总成信息
	List<Map<String,Object>> getProductList(@Param("lineId")Integer lineId, @Param("boxCode1")String boxCode, @Param("barcode")String barcode,
			@Param("tuhao")String tuhao,@Param("prodCode")String prodCode,@Param("prodNumber")String prodNumber,@Param("poCode")String poCode, @Param("beginTime")String beginTime, @Param("endTime")String endTime,@Param("shopId")Integer shopId, @Param("fcId")Integer fcId);
	
	//获取产品的基本信息
	Map<String,Object> getProductInfo(@Param("barcode")String barcode,@Param("prodCode") String prodCode);
	
	//
	List<Map<String,Object>> getProductData(@Param("lineId")Integer lineId,@Param("rfid")String rfid);
}
