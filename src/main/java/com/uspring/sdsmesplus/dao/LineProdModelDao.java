package com.uspring.sdsmesplus.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysLineProdmodelPODao;
import com.uspring.sdsmesplus.entity.vo.LineProdmodelVO;

/** 
 * @ClassName: LineProdModelDao 
 * @Description: 基于LineProdModel数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月21日 下午5:50:07  
 */
public interface LineProdModelDao extends SysLineProdmodelPODao {
	
	/** 
	* @Title: queryLineProdmodel 
	* @Description: 根据lineId,fcId查询产线模式
	* @param lineId 产线ID fcId工厂ID
	*  page_size page_num
	* @return 产线模式实体类
	*/
	List<LineProdmodelVO> queryLineProdmodel(@Param("lineId") Integer lineId, @Param("fcId") Integer fcId, Integer page_size, Integer page_num);
}
