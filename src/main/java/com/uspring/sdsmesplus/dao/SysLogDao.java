package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysQrcodeRulePODao;

/** 
 * @ClassName: SysLogDao 
 * @Description: 日志记录查询
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午1:10:52  
 */
public interface SysLogDao{
	
	/** 
	* @Title: getSysLog
	* @Description: 获取日志信息
	* @param 
	* @return 
	*/
	List<Map<String,Object>> getSysLog(@Param("fcId")Integer fcId,@Param("shopId")Integer shopId,@Param("lineId")Integer lineId,@Param("poCode")String poCode,@Param("logType")String logType,@Param("empName")String empName,@Param("empNumber")String empNumber,@Param("note")String note,@Param("beginTime")String beginTime,@Param("endTime")String endTime);
}
