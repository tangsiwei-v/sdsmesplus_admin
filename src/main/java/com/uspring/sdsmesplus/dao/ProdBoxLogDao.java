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

import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;

/** 
 * @ClassName: ProdBoxLogDao
 * @Description: 产品装箱记录
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 *  
 */
public interface ProdBoxLogDao {

	/**
	 * 根据工单号查询产品总数
	 * @param poCode
	 * @return
	 */
	Integer quryProdCounts(@Param("poCode") String poCode);

	/**
	 * 根据工单查询装箱数
	 * @param poCode
	 * @return
	 */
	Integer queryBoxCounts(@Param("poCode") String poCode);
	
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
	List<Map<String,Object>> getBoxList(@Param("lineId")Integer lineId,@Param("boxCode1")String boxCode,
	@Param("tuhao")String tuhao,@Param("prodCode")String prodCode,@Param("prodNumber")String prodNumber,@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("poCode")String poCode,@Param("shopId")Integer shopId,@Param("fcId")Integer fcId);

}
