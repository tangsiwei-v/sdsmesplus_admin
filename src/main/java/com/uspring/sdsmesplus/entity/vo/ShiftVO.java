package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysShiftPO;

/** 
 * @ClassName: ShiftVO 
 * @Description:班次视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午3:39:29  
 */
public class ShiftVO extends SysShiftPO{
	
	private List<SysFactoryPO> factorys;

	public List<SysFactoryPO> getFactorys() {
		return factorys;
	}

	public void setFactorys(List<SysFactoryPO> factorys) {
		this.factorys = factorys;
	} 
	
	
}
