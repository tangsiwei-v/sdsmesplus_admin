package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.LineStoragebinVO;

/** 
 * @ClassName: LineStoragebinService 
 * @Description:基于SysLineStoragebin数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月28日 下午5:36:18  
 */
public interface LineStoragebinService {
	/** 
	* @Title: selectLineStoragebins
	* @Description: 查找产线库位主数据
	* @param lineId 产线ID
	* page_num, page_size
	* @return 产线库位实体类
	*/
	PageInfo<LineStoragebinVO> selectLineStoragebins(Integer lineId, String factoryId,Integer page_size, Integer page_num);

	/** 
	* @Title: insertLineStoragebins
	* @Description: 添加产线库位主数据
	* @param SysLineStoragebinPO 产线库位实体类
	*/
	void insertLineStoragebins(SysLineStoragebinPO lineStoragebin);

	/** 
	* @Title: updateLineStoragebins
	* @Description: 修改产线库位主数据
	* @param SysLineStoragebinPO 产线库位实体类
	*/
	void updateLineStoragebins(SysLineStoragebinPO lineStoragebin);

	/** 
	* @Title: deleteLineStoragebins
	* @Description: 删除产线库位主数据
	* @param linbinId 产线库位ID
	*/
	void deleteLineStoragebins(Integer linbinId);
}
