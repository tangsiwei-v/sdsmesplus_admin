package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;

public class PrinterTmplVO extends SysPrinterTmplPO{
	private List<SysFactoryPO> factorys;
	 
	public List<SysFactoryPO> getFactorys() {
		return factorys;
	}

	public void setFactorys(List<SysFactoryPO> factorys) {
		this.factorys = factorys;
	}
}
