package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

import com.uspring.sdsmesplus.entity.po.AgvConfigKqPO;

/**
 * @ClassName: AgvConfigKqVO
 * @Description: AGV视图对象
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月22日 下午12:36:38
 */
public class AgvConfigKqVO extends AgvConfigKqPO{

	private List<LineVO> lines;
	
	public List<LineVO> getLines() {
		return lines;
	}

	public void setLines(List<LineVO> lines) {
		this.lines = lines;
	}

	
}
