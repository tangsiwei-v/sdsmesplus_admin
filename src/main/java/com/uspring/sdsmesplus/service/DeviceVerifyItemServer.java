package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.vo.DeviceVerifyItemVO;

/**
 * @ClassName: DeviceVerifyItemServer
 * @Description:基于设备防错表数据库操作类
 * @author: shangyanbing shangyanbing@uspring.cn
 * @date: 2019年8月7日 上午11:46:31
 */

public interface DeviceVerifyItemServer {

	/**
	 * @Title: insertDeviceVerify
	 * @Description: 添加设备防错要求
	 * @return 设备防错项目实体类
	 */
	void insertDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem);

	/**
	 * @Title: insertDeviceVerify
	 * @Description: 修改添加设备防错要求
	 * @return 设备防错项目实体类
	 */
	void updateDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem);

	/**
	 * @Title: deleteDeviceVerify
	 * @Description: 根据dviId删除设备防错要求
	 * @param dviId防错项目主键ID
	 * @return 设备防错项目实体类
	 */
	void deleteDeviceVerifyItem(Integer dviId);

	/**
	 * @Title: queryDeviceVerifyLog
	 * @Description: 根据lineId,查询设备防错要求
	 * @param lineId 产线ID page_size page_num
	 * @return 设备防错实体类
	 */
	PageInfo<DeviceVerifyItemVO> queryDeviceVerifyItem(Integer lineId, Integer page_size, Integer page_num,
			Integer shopId, Integer fcId);

	/**
	 * @Title: queryDeviceVerifyLog
	 * @Description: 根据lineId,查询设备防错要求
	 * @param lineId 产线ID page_size page_num
	 * @return 设备防错实体类
	 */
	PageInfo<ProdProcessCheckPO> queryPordProcessCheckService(Integer lineId, String prodCode, Integer page_size, Integer page_num);

	/**
	 * @Title: insertPordProcessCheckService
	 * @Description: 默认所有设备都配置
	 * @param prodProcessCheckPO 是否跳过实体
	 * @return 1
	 */
	int insertPordProcessCheckService(ProdProcessCheckPO prodProcessCheckPO);

	/**
	 * @Title: updatePordProcessCheckService
	 * @Description: 修改一台设备是否跳过防错
	 * @param prodProcessCheckPO 是否跳过实体
	 * @return 1
	 */
	int updatePordProcessCheckService(ProdProcessCheckPO prodProcessCheckPO);

	/**
	 * @Title: deletePordProcessCheckService
	 * @Description: 删除一台设备是否跳过防错
	 * @param ppcId 是否跳过实体
	 * @return 1
	 */
	int deletePordProcessCheckService(Integer ppcId);
}
