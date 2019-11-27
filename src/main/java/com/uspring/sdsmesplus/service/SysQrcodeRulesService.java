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

import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;

/** 
 * @ClassName: ReportService 
 * @Description: 数据报表接口
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface SysQrcodeRulesService {
	/**
	 * @Title: getQrcodeRules
	 * @Description: 获取轴管二维码
	 * @param fcId 工厂编号
	 * @throws Exception 
	 */
	Map<String,Object> getQrcodeRules(Integer fcId,Integer pageNum,Integer pageSize,String prodCode);
	
	/**
	 * @Title: insertQrcodeRules
	 * @Description: 新增轴管二维码
	 * @param qrCodePo 
	 * @throws Exception 
	 */
	void insertQrcodeRules(SysQrcodeRulePO qrCodePo);
	
	/**
	 * @Title: updateQrcodeRules
	 * @Description: 修改轴管二维码
	 * @param qrCodePo 
	 * @throws Exception 
	 */
	void updateQrcodeRules(SysQrcodeRulePO qrCodePo);
	
	/**
	 * @Title: deleteQrcodeRules
	 * @Description: 删除轴管二维码
	 * @param qrCodePo 
	 * @throws Exception 
	 */
	void deleteQrcodeRules(Integer qrId);
}
