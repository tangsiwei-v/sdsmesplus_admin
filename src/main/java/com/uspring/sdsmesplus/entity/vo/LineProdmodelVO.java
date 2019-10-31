package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;

/**
 * @ClassName: LineProdmodelVO
 * @Description: 产线模式视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月21日 下午5:09:44
 */
public class LineProdmodelVO extends SysLineProdmodelPO {

	private List<LineVO> lines;

	public List<LineVO> getLines() {
		return lines;
	}

	public void setLines(List<LineVO> lines) {
		this.lines = lines;
	}

}
