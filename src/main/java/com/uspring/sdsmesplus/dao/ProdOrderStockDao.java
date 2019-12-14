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

import com.uspring.sdsmesplus.dao.generate.ProdOrderStockPODao;
import com.uspring.sdsmesplus.dao.generate.ProdProductMaterialPODao;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.vo.StockStat;

/**
 * @ClassName: ProdProductMaterialDao
 * @Description: 产品物料消耗
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 * 
 */
public interface ProdOrderStockDao extends ProdOrderStockPODao {

	List<Map<String, Object>> getOrderStock(@Param("poCode") String poCode, @Param("prodCode") String prodCode,
			@Param("prodNumber") String prodNumber, @Param("matProdCode") String matProdCode,
			@Param("matProdNumber") String matProdNumber, @Param("boxCode") String boxCode,
			@Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("lineId") Integer lineId,
			@Param("shopId") Integer shopId, @Param("fcId") Integer fcId);

	List<StockStat> statOrderStock(@Param("lineId") Integer lineId, @Param("poCode") String poCode,
			@Param("matCode") String matCode, @Param("boxBarcode") String boxBarcode);

	List<StockStat> statProcStock(@Param("lineId") Integer lineId, @Param("poCode") String poCode,
			@Param("matCode") String matCode, @Param("boxBarcode") String boxBarcode,
			@Param("procCode") String procCode);

	List<StockStat> statWipStock(@Param("lineId") Integer lineId, @Param("poCode") String poCode,
			@Param("matCode") String matCode, @Param("boxBarcode") String boxBarcode,
			@Param("procCode") String procCode);

}
