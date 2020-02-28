package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.vo.LineVO;

/** 
 * @ClassName: LineDao 
 * @Description: 基于Line数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 下午1:10:52  
 */
public interface LineDao extends SysLinePODao{
	
	/** 
	* @Title: prodmodel
	* @Description: 根据shopId,vsmId,lineId查找产线主数据
	* @param shopId 车间ID, vsmId 工段ID, lineId 产线ID,
	* page_size page_num
	* @return 产线实体类
	*/
	List<LineVO> queryLine(@Param("shopId") Integer shopId,@Param("vsmId") Integer vsmId,@Param("lineId") Integer lineId, Integer page_size, Integer page_num,@Param("fcId") Integer fcId);
}
