package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SafelunchOrderPO;
import com.uspring.sdsmesplus.entity.po.SafelunchProductLogPO;

/** 
 * @ClassName: SafeLunchOrderVO 
 * @Description: SafeLunch视图对象
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月23日 上午10:41:37  
 *  
 */

public class SafeLunchOrderVO extends SafelunchOrderPO{
	
	private List<SafelunchProductLogPO> safelunchProductLogPOs;

	public List<SafelunchProductLogPO> getSafelunchProductLogPOs() {
		return safelunchProductLogPOs;
	}

	public void setSafelunchProductLogPOs(List<SafelunchProductLogPO> safelunchProductLogPOs) {
		this.safelunchProductLogPOs = safelunchProductLogPOs;
	}

}
