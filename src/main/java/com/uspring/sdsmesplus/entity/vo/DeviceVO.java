package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;

/** 
 * @ClassName: DeviceVO 
 * @Description: 设备视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午4:47:21  
 */
public class DeviceVO extends DevicePO{
	
	private List<SysFactoryPO> factorys;
	
	private List<SysWorkshopPO> workshops;
	
	private List<SysVsmPO> vsms;
	
	private List<SysLinePO> lines;

	public List<SysFactoryPO> getFactorys() {
		return factorys;
	}

	public void setFactorys(List<SysFactoryPO> factorys) {
		this.factorys = factorys;
	}

	public List<SysWorkshopPO> getWorkshops() {
		return workshops;
	}

	public void setWorkshops(List<SysWorkshopPO> workshops) {
		this.workshops = workshops;
	}

	public List<SysVsmPO> getVsms() {
		return vsms;
	}

	public void setVsms(List<SysVsmPO> vsms) {
		this.vsms = vsms;
	}

	public List<SysLinePO> getLines() {
		return lines;
	}

	public void setLines(List<SysLinePO> lines) {
		this.lines = lines;
	}
	
}
