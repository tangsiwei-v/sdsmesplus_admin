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

import com.uspring.sdsmesplus.entity.vo.MatBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBatchCodeVO;
import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdProductMaterialPODao;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;

/** 
 * @ClassName: ProdProductMaterialDao
 * @Description: 箱物料消耗
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 *  
 */
public interface ProdBoxMaterialDao{

   List<Map<String,Object>>	boxMaterialUseInfo(@Param("lineId")Integer lineId,@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("prodCode")String prodCode,@Param("matProdCode")String matProdCode,@Param("boxCode")String boxCode,@Param("matBoxCode")String matBoxCode,@Param("furnaceNo")String furnaceNo,@Param("batchNo")String batchNo);

   List<ProdBatchCodeVO> listForwardTraceByMatBatchNo(@Param("matBatchNo")String  matBatchNo);

   List<MatBatchCodeVO> listReverseTraceByProdBatchCode(@Param("prodBatchCode")String  prodBatchCode);
}
