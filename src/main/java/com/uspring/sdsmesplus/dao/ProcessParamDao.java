package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.entity.vo.ProdProcessParam;

public interface ProcessParamDao{

	/** 
	* @Title: getCheckParam
	* @Description: 根据lineId查询工序合格信号
	* @param lineId 产线编号
	* @return ProdProcessParam
	*/
	List<ProdProcessParam> getCheckParam (@Param("lineId") Integer lineId);
}
