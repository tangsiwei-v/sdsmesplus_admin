package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
/** 
 * @ClassName: SysWorkshopVO 
 * @Description: 车间视图对象
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月25日 下午4:39:46 
 *  
 */
public class WorkshopVO extends SysWorkshopPO{
	
	private List<VsmVO> vsmVOs;
	
	private List<SysLinePO> sysLinePOs;

	public List<VsmVO> getVsmVOs() {
		return vsmVOs;
	}

	public void setVsmVOs(List<VsmVO> vsmVOs) {
		this.vsmVOs = vsmVOs;
	}
	
	public List<SysLinePO> getSysLinePOs() {
		return sysLinePOs;
	}

	public void setSysLinePOs(List<SysLinePO> sysLinePOs) {
		this.sysLinePOs = sysLinePOs;
	}
}
