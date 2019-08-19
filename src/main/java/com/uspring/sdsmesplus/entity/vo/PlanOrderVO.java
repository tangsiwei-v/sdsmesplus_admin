package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.PlanOrderPO;


/** * @author chengtengfei:
 * @date 创建时间：2019年6月20日 上午9:50:13 
 * @version 1.0 * @parameter  
 * @param <PlanOrderProDo>
 * @since       PlanOrderVO实体类
 * @return  
*/
public class PlanOrderVO extends PlanOrderPO{
	
	private List<PlanOrderProVo> planOrderProVos;

	public List<PlanOrderProVo> getPlanOrderProVos() {
		return planOrderProVos;
	}

	public void setPlanOrderProVos(List<PlanOrderProVo> planOrderProVos) {
		this.planOrderProVos = planOrderProVos;
	}
	
}
