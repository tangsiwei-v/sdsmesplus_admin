/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.Map;

import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;

/** 
 * @ClassName: ReportService 
 * @Description: 数据报表接口
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface ProdProcessCheckService {
	/**
	 * @Title: getProdProcessCheck
	 * @Description: 查询产品工序确认
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	Map<String,Object> getProdProcessCheck(Integer fcId,Integer shopId,Integer lineId,String opCode,String prodCode,Integer pageNum,Integer pageSize);
	
	/**
	 * @Title: insertProdProcessCheck
	 * @Description: 新增产品工序确认
	 * @param ProdProcessCheckPO 
	 * @throws Exception 
	 */
	void insertProdProcessCheck(ProdProcessCheckPO prodProcessCheckPO);
	
	/**
	 * @Title: updateProdProcessCheck
	 * @Description: 修改产品工序确认
	 * @param ProdProcessCheckPO 
	 * @throws Exception 
	 */
	void updateProdProcessCheck(ProdProcessCheckPO prodProcessCheckPO);
	
	/**
	 * @Title: deleteProcessCheck
	 * @Description: 删除产品工序确认
	 * @param ProdProcessCheckPO 
	 * @throws Exception 
	 */
	void deleteProcessCheck(Integer ppcId);
}
