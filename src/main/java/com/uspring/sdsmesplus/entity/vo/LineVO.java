package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;

/** 
 * @ClassName: LineVO 
 * @Description: 产线视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午1:06:18  
 */
public class LineVO extends SysLinePO{
	
	private List<SysVsmPO> vsms;
	
	private List<SysFactoryPO> factorys;
	
	public List<SysVsmPO> getVsms() {
		return vsms;
	}

	public void setVsms(List<SysVsmPO> vsms) {
		this.vsms = vsms;
	}

	public List<SysFactoryPO> getFactorys() {
		return factorys;
	}

	public void setFactorys(List<SysFactoryPO> factorys) {
		this.factorys = factorys;
	}
	
}
