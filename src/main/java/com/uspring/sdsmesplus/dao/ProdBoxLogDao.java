/**
 * @Title: ShiftDao.java 
 * @Package com.uspring.sdsmesplus.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 上午9:32:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import org.apache.ibatis.annotations.Param;

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

}
