/**
 * @Title: WMSService.java 
 * @Package com.uspring.sdsmesplus.wms 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 上午8:44:11 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.wms;


import com.uspring.sdsmesplus.wms.entity.EWMStockDetails;

import java.util.List;

/**
 * @ClassName: WMSService
 * @Description: WMS系统交互接口
 * @author lihuan lihuan@uspring.cn
 * @date 2019年6月27日 上午8:44:11
 * 
 */
public interface WMSService {


	/**
     * 根据批号获取库存信息
	 * @param prodBatchCode
     * @return
     */
	public List<EWMStockDetails> getStockDetails(String prodBatchCode, String matWarehouseNum);
}
