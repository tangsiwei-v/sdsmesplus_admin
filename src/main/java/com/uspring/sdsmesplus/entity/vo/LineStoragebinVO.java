package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;

/** 
 * @ClassName: LineStoragebinVO 
 * @Description: 产线库位视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月28日 下午4:58:51  
 */
public class LineStoragebinVO extends SysLineStoragebinPO{
	private List<SysLinePO> lines;

	public List<SysLinePO> getLines() {
		return lines;
	}

	public void setLines(List<SysLinePO> lines) {
		this.lines = lines;
	}
	
	
}
