package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;

/** 
 * @ClassName: DeviceVerifyItemVO 
 * @Description: 设备防错视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 上午9:24:57  
 */
public class DeviceVerifyItemVO extends SysDeviceVerifyItemPO{
	private List<SysLinePO> lines;

	public List<SysLinePO> getLines() {
		return lines;
	}

	public void setLines(List<SysLinePO> lines) {
		this.lines = lines;
	}

}
