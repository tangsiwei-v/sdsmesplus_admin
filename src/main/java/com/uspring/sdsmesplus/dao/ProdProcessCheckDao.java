package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdProcessCheckPODao;
import com.uspring.sdsmesplus.dao.generate.SysQrcodeRulePODao;

/** 
 * @ClassName: LineDao 
 * @Description: 产品工序确认
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午1:10:52  
 */
public interface ProdProcessCheckDao extends ProdProcessCheckPODao{
	
	/** 
	* @Title: getQrcodeRuleList
	* @Description: 产品工序确认
	* @param 
	* @return 产线实体类
	*/
	List<Map<String,Object>> getProdProcessDataCheck(@Param("fcId")Integer fcId,@Param("shopId")Integer shopId,@Param("lineId")Integer lineId,@Param("opCode")String opCode,@Param("prodCode")String prodCode);
}
