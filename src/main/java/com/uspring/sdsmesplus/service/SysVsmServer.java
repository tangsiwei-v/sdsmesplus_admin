package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.vo.VsmVO;

/**   
 * @ClassName: SysVsmServer
 * @Description:查询工段数据库操作类
 * @author: shangyanbing shangyanbing@uspring.cn   
 * @date: 2019年8月7日 上午10:23:14 
 */

public interface SysVsmServer {
	
	/** 
	* @Title: prodmodel
	* @Description: 根据shopId,vsmId查找工段主数据
	* @param shopId 车间ID, vsmId 工段ID, fcId 工厂ID
	* page_size page_num
	* @return  工段实体类
	*/
	PageInfo<VsmVO> queryVsm(Integer shopId, Integer vsmId, Integer page_size, Integer page_num, Integer fcId);

	/**
	 * @Title: insertVsm
	 * @Description:添加工段主数据
	 * @param vsm 工段实体类
	 */
	void insertVsm(SysVsmPO vsm);

	/**
	 * @Title: updateVsm
	 * @Description:修改工段主数据
	 * @param vsm 工段实体类
	 */
	void updateVsm(SysVsmPO vsm);

	/**
	 * @Title: deleteVsm
	 * @Description:删除工段主数据
	 * @param vsmId 工段ID
	 */
	void deleteVsm(Integer vsmId);
}
