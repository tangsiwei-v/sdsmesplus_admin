package com.uspring.sdsmesplus.dao;

/** 
 * @ClassName: PoStackDao 
 * @Description: 基于ProdCleanLogPO数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年8月2日 上午9:41:32 
 *  
 */

public interface PoStackDao {
	
	/** 
	* @Title: upIsConfirmed 
	* @Description: 根据box_barcode，清线记录要求批量修改箱合格证为已确认
	* @param lineId 产线ID
	* @return  设备防错实体类
	*/
	void upIsConfirmed (String box_barcode);
}
