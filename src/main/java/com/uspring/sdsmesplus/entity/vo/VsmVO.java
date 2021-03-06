package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
/** 
 * @ClassName: SysVsmVO
 * @Description: 工段视图对象
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月25日 下午4:43:10 
 *  
 */
public class VsmVO extends SysVsmPO{
	
	private List<SysLinePO> sysLinePOs;
	
	private List<WorkshopVO> workshopVOs;

	public List<WorkshopVO> getWorkshopVOs() {
		return workshopVOs;
	}

	public void setWorkshopVOs(List<WorkshopVO> workshopVOs) {
		this.workshopVOs = workshopVOs;
	}

	public List<SysLinePO> getSysLinePOs() {
		return sysLinePOs;
	}

	public void setSysLinePOs(List<SysLinePO> sysLinePOs) {
		this.sysLinePOs = sysLinePOs;
	}
	
}
