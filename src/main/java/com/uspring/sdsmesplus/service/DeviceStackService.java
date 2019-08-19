package com.uspring.sdsmesplus.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.wms.entity.Package;

/** * @author  作者 E-mail:chengtengfei
 * @date 创建时间：2019年6月25日 下午5:31:05 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public interface DeviceStackService {
	
    /**
     * 将物料投入到某设备的线上库存，针对非一物流
     * @param devCode
     * @RequestBody ProdBoxLogPO
     * @return
     * @throws Exception
     */
	void putEquipment(String devCode, Package packag) throws Exception;
	
    /**
     * 查询某一个设备的线上物料库存
     * @param devCode
     * @return List<ProdBoxLogPO>
     * @throws Exception
     */
	List<ProdDeviceStockPO> findEquipment(String devCode, Boolean iscleaned, Boolean isopen);

}
