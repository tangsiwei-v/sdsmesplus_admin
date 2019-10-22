package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.vo.LineProdmodelVO;

/** 
 * @ClassName: LineProdModel 
 * @Description: 产线模式操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月21日 下午5:18:42  
 */
public interface LineProdModelServer {

	/** 
	* @Title: queryLineProdmodel 
	* @Description: 根据lineId,fcId查询产线模式
	* @param lineId 产线ID fcId工厂ID
	*  page_size page_num
	* @return 产线模式实体类
	*/
	PageInfo<LineProdmodelVO> queryLineProdmodel(Integer lineId, Integer fcId, Integer page_size, Integer page_num);

	/**
	 * @Title: insertLineProdmodel
	 * @Description 添加产线模式主数据
	 * @param lineProdmodel 产线模式实体类
	 */
	void insertLineProdmodel(SysLineProdmodelPO lineProdmodel);

	/**
	 * @Title: updateLineProdmodel
	 * @Description 修改产线模式主数据
	 * @param lineProdmodel 产线模式实体类
	 */
	void updateLineProdmodel(SysLineProdmodelPO lineProdmodel);

	/**
	 * @Title: updateLineProdmodel
	 * @Description 删除产线模式主数据
	 * @param lineProdmodel 产线模式实体类
	 */
	void deleteLineProdmodel(Integer linemodId);

}
