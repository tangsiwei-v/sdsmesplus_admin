package com.uspring.sdsmesplus.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysVsmPODao;
import com.uspring.sdsmesplus.entity.vo.VsmVO;

/** 
 * @ClassName: SysVsmDao 
 * @Description:基于SysVsm数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月25日 上午10:20:12  
 */
public interface SysVsmDao extends SysVsmPODao{
	/** 
	* @Title: prodmodel
	* @Description: 根据shopId,vsmId查找工段主数据
	* @param shopId 车间ID, vsmId 工段ID,
	* page_size page_num
	* @return  工段实体类
	*/
	List<VsmVO> queryVsm(@Param("shopId") Integer shopId, @Param("vsmId") Integer vsmId, Integer page_size, Integer page_num);
}
