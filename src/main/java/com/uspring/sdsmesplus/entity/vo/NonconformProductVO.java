package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPO;

public class NonconformProductVO extends NonconformProductLogPO{
	
	private List<NonconformProductMaterialPO> nonconformProductMaterialPOs;

	public List<NonconformProductMaterialPO> getNonconformProductMaterialPOs() {
		return nonconformProductMaterialPOs;
	}

	public void setNonconformProductMaterialPOs(List<NonconformProductMaterialPO> nonconformProductMaterialPOs) {
		this.nonconformProductMaterialPOs = nonconformProductMaterialPOs;
	}
	
	
}
