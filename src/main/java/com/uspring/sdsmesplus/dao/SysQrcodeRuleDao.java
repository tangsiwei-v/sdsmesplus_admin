package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysQrcodeRulePODao;

/** 
 * @ClassName: LineDao 
 * @Description: 轴管二维码
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午1:10:52  
 */
public interface SysQrcodeRuleDao extends SysQrcodeRulePODao{
	
	/** 
	* @Title: getQrcodeRuleList
	* @Description: 获取轴管二维码数据
	* @param 
	* @return 产线实体类
	*/
	List<Map<String,Object>> getQrcodeRuleList(@Param("fcId")Integer fcId,@Param("prodCode")String prodCode);
}
