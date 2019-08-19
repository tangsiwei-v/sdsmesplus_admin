package com.uspring.sdsmesplus.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdSkillVerifyLogPODao;
import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPO;

/** 
 * @ClassName: SkillVerifyLogDao 
 * @Description: 基于ProdSkillVerifyLog数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月20日 下午1:35:10 
 *  
 */

public interface SkillVerifyLogDao extends ProdSkillVerifyLogPODao{
	/** 
	* @Title: compare 
	* @Description: 根据开始时间，结束时间，产线ID查询是否做过设备防错
	* @param shiftStartTimeOfTime 开始时间，shiftEndTimeOfTime 结束时间，lineId产线ID
	* @return  人员防错实体类
	*/
	List<ProdSkillVerifyLogPO> compare(@Param("shiftStartTimeOfTime")Date shiftStartTimeOfTime,
			@Param("shiftEndTimeOfTime")Date shiftEndTimeOfTime,
			@Param("line_id")Integer line_id);
}
