/**
 * @Title: ShiftDao.java 
 * @Package com.uspring.sdsmesplus.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 上午9:32:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdProductMaterialPODao;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;

/** 
 * @ClassName: SafelunchOrderDao
 * @Description: safelunch记录
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 *  
 */
public interface SafelunchOrderDao{

	public List<Map<String,Object>> getSafeLunch(@Param("lineId")Integer lineId, @Param("poCode")String poCode, @Param("prodCode")String prodCode, @Param("prodNumber")String prodNumber,
			@Param("boxCode")String boxCode, @Param("beginTime")String beginTime, @Param("endTime")String endTime,@Param("safelineId")Integer safelineId);
	
	public List<Map<String,Object>> getSafeLunchDetail(@Param("lineId")Integer lineId, @Param("poCode")String poCode, @Param("prodCode")String prodCode, @Param("prodNumber")String prodNumber,
			@Param("boxCode")String boxCode, @Param("beginTime")String beginTime, @Param("endTime")String endTime, @Param("safeLunchOrder")String safeLunchOrder,@Param("safelineId")Integer safelineId,@Param("fpBarcode")String fpBarcode);
	
	
}
