package com.uspring.sdsmesplus.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPO;
import com.uspring.sdsmesplus.entity.vo.NonconformProductVO;

/** 
 * @ClassName: NonconformProductService 
 * @Description: 基于不合格品记录操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月30日 上午11:26:56
 *  
 */

public interface NonconformProductService {
	/** 
	* @Title: saveNonconformProduct
	* @Description:不合格品信息录入
	* @param nonconformProductVO 对象
	* @return nonconformProductLog 实体类
	*/
	void saveNonconformProduct(NonconformProductVO nonconformProductVO);
	
	/** 
	* @Title: compute
	* @Description: 根据NonconformProductLogPO查询不合格零件信息
	* @return NonconformProductMaterialPO实体类
	 * @throws Exception 
	*/
	List<NonconformProductMaterialPO> compute(NonconformProductLogPO nonconformProductPO) throws Exception;
	
	/** 
	* @Title: confirm
	* @Description:不合格品确认
	* @param nonconformProductVO 对象
	* @return nonconformProductLog 实体类
	*/
	void confirm(NonconformProductVO nonconformProductVO);
	
	/** 
	* @Title: record
	* @Description: 根据fcId,shopId,
	* lineId,shiftId,status,start_time,end_time,page_size,page_num条件查询
	* @param fcId 工厂ID,shopId 车间ID,lineId 产线ID,shiftId 班次ID,status 状态
	* @return NonconformProductLog实体类
	*/
	PageInfo<NonconformProductVO> record(Integer fcId, Integer shopId, Integer lineId, Integer shiftId, String status,
			String start_time, String end_time, Integer page_size, Integer page_num);

}
