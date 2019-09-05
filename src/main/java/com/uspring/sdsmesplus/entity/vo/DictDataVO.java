package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictTypePO;

/** 
 * @ClassName: DictData 
 * @Description: 字典视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月26日 下午10:47:42  
 */
public class DictDataVO extends DictDataPO{
	
	private List<DictTypePO> dictTypes;

	public List<DictTypePO> getDictTypes() {
		return dictTypes;
	}

	public void setDictTypes(List<DictTypePO> dictTypes) {
		this.dictTypes = dictTypes;
	}
	
	
}
