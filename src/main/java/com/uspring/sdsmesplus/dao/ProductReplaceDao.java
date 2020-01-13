package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;

public interface ProductReplaceDao extends ProdFinishedProductPODao {

	//获取总成替换记录
	List<Map<String,Object>> getProductReplace(@Param("lineId")Integer lineId,
			@Param("prodCode")String prodCode,@Param("poCode")String poCode, @Param("beginTime")String beginTime, @Param("endTime")String endTime,@Param("shopId")Integer shopId, @Param("fcId")Integer fcId);
}
