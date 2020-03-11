/**
 * @Title: LineBinDao.java 
 * @Package com.uspring.sdsmesplus.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年7月18日 下午11:01:18 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysStoragebinPODao;
import com.uspring.sdsmesplus.entity.po.SysStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.LineStoragebinVO;

/** 
 * @ClassName: LineBinDao 
 * @Description: 产线库位DAO类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年7月18日 下午11:01:18 
 *  
 */
public interface LineStoragebinDao extends SysStoragebinPODao {

	SysStoragebinPO findBinByType(@Param("line_id")Integer lineId, @Param("storage_type")String binType);
	
	/** 
	* @Title: selectLineStoragebins
	* @Description: 查找产线库位主数据
	* @param lineId 产线ID
	* page_num, page_size
	* @return 产线库位实体类
	*/
	List<LineStoragebinVO> selectLineStoragebins(@Param("lineId") Integer lineId, Integer page_size, Integer page_num,@Param("shopId") Integer shopId,@Param("fcId") Integer fcId);
}
