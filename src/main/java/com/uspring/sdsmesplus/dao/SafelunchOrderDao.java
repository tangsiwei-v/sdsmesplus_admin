package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SafelunchOrderPODao;
import com.uspring.sdsmesplus.entity.vo.SafeLunchOrderVO;

/** 
 * @ClassName: SafelunchOrderDao 
 * @Description: 基于SafelunchOrder数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月23日 上午11:09:46
 *  
 */

public interface SafelunchOrderDao extends SafelunchOrderPODao{
	/** 
	* @Title: queryOrder
	* @Description: 根据isCommit,boxConfirmed,
	* start_time,end_time,page_size,page_num条件查询
	* @param isCommit 是否提交,boxConfirmed 是否已扫描确认
	* @return SafelunchOrder实体类
	*/
	List<SafeLunchOrderVO> queryOrder(@Param("isCommit") Boolean isCommit, @Param("saflineId") Integer saflineId, @Param("boxConfirmed") Boolean boxConfirmed, @Param("boxBarcode") String boxBarcode, @Param("start_time") String start_time,
			@Param("end_time") String end_time, Integer page_size, Integer page_num);
}
