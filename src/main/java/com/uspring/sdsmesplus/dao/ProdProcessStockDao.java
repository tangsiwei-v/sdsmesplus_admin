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
 * @ClassName: ProdProductMaterialDao
 * @Description: 产品物料消耗
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 *  
 */
public interface ProdProcessStockDao{

	List<Map<String,Object>> getProcessMaterial(@Param("lineId")Integer lineId, @Param("poCode")String poCode, @Param("prodCode")String prodCode, @Param("prodNumber")String prodNumber,
			@Param("batchNo")String batchNo, @Param("furnaceNo")String furnaceNo, @Param("beginTime")String beginTime, @Param("endTime")String endTime,@Param("matProdCode")String matProdCode,@Param("matBoxCode")String matBoxCode,@Param("matProdNumber")String matProdNumber,@Param("shopId")Integer shopId,@Param("fcId")Integer fcId);
	
	
}
