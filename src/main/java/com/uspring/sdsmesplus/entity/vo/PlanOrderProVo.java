package com.uspring.sdsmesplus.entity.vo;

import java.util.List;


import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderProPO;

/** * @author  chengtengfei:
 * @date 创建时间：2019年6月20日 上午10:51:11 
 * @version 1.0 * @parameter  
 * @since  PlanOrderProVo实体类
 * @return  
*/
public class PlanOrderProVo extends PlanOrderProPO{
	
private List<PlanOpBomPO> planOpBomPOs;

public List<PlanOpBomPO> getPlanOpBomPOs() {
	return planOpBomPOs;
}

public void setPlanOpBomPOs(List<PlanOpBomPO> planOpBomPOs) {
	this.planOpBomPOs = planOpBomPOs;
}



}
