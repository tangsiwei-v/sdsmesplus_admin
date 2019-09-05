package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.vo.SafeLunchOrderVO;

/** 
 * @ClassName: SafelunchService 
 * @Description: 基于SafelunchOrder数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月23日 上午11:12:56
 *  
 */

public interface SafelunchService {	
	/** 
	* @Title: save
	* @Description:结果暂存
	* @param safeLunchOrder 对象
	* @return SafelunchOrder实体类
	*/
	void save(SafeLunchOrderVO safeLunchOrder);
	
	/** 
	* @Title: reprint
	* @Description:箱合格证补打
	* @param old_box_barcode 旧箱合格证,new_box_barcode 新箱合格证,box_type 合格证类型
	* @return SafelunchOrder实体类
	*/
	void reprint(String old_box_barcode, String new_box_barcode, String box_type);

	/** 
	* @Title: confirm
	* @Description: SafeLunch扫描确认
	* @param safelunch_order 工单号
	* @return SafelunchOrder实体类
	*/
	void confirm(String safelunch_order);
	
	/** 
	* @Title: queryOrder
	* @Description: 根据isCommit,boxConfirmed,
	* start_time,end_time,page_size,page_num条件查询
	* @param isCommit 是否提交,boxConfirmed 是否已扫描确认
	* @return SafelunchOrder实体类
	*/
	PageInfo<SafeLunchOrderVO> queryOrder(Boolean isCommit, Integer saflineId, Boolean boxConfirmed, String boxBarcode, String start_time,
			String end_time, Integer page_size, Integer page_num);
	
	/** 
	* @Title: queryWorkLine
	* @Description: 根据fc_id,page_size,
	* page_num条件查询产线
	* @param fc_id 产线ID,page_size 数据页大小,page_num 数据页编号
	* @return SafelunchWorkLine实体类
	*/
	PageInfo<SafelunchWorkLinePO> queryWorkLine(Integer fcId, Integer page_size, Integer page_num);

	/**
	 * @Title: queryWorkLine
	 * @Description: 添加SafeLunch产线主数据
	 * @param safelunchWorkLinePO safelunch实体类
	 */
	void insertSafeLunch(SafelunchWorkLinePO safelunchWorkLinePO);

	/**
	 * @Title: updateSafeLunch
	 * @Description: 修改SafeLunch产线主数据
	 * @param safelunchWorkLinePO safelunch实体类
	 */
	void updateSafeLunch(SafelunchWorkLinePO safelunchWorkLinePO);

	/**
	 * @Title: deleteSafeLunch
	 * @Description: 删除SafeLunch产线主数据
	 * @param saflineId
	 */
	void deleteSafeLunch(Integer saflineId);

}
