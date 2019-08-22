package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;

/**   
 * @ClassName: BoxInfoVO
 * @Description:装箱视图对象
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date: 2019年8月22日 上午9:56:46 
 */

public class BoxInfoVO extends BoxInfoPO{
	private List<SysFactoryPO> factorys;
 
	public List<SysFactoryPO> getFactorys() {
		return factorys;
	}

	public void setFactorys(List<SysFactoryPO> factorys) {
		this.factorys = factorys;
	}
	
}
