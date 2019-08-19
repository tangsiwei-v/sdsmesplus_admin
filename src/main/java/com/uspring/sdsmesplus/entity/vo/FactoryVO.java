package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
/** 
 * @ClassName: SysFactoryVO 
 * @Description: 工厂视图对象
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月25日 下午4:36:16  
 *  
 */
public class FactoryVO extends SysFactoryPO{
	
	private List<WorkshopVO> workShopVOs;

	public List<WorkshopVO> getWorkshopVOs() {
		return workShopVOs;
	}

	public void setSysWorkshopVOs(List<WorkshopVO> workShopVOs) {
		this.workShopVOs = workShopVOs;
	}
}
