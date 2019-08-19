package com.uspring.sdsmesplus.dao;

import java.util.List;

import com.uspring.sdsmesplus.dao.generate.ProdDeviceStockPODao;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;

/** 
 * @ClassName: DeviceDao 
 * @Description: 基于Device数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月24日 下午2:55:10 
 *  
 */
public interface ProdDeviceStockDao extends ProdDeviceStockPODao{
	/** 
	* @Title: updateListDev
	* @Description: 批量更新 
	* @param List<ProdDeviceStockPO>
	* @return  null
	*/
	void updateListDev(List<ProdDeviceStockPO> proDevs);
}
