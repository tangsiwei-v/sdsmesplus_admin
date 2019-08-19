package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;

/** 
 * @ClassName: SysFactoryDao 
 * @Description: 基于SysFactoryDao数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月25日 上午9:15:16 
 *  
 */
public interface SysFactoryDao extends SysFactoryPODao{
	/** 
	* @Title: queryFactory
	* @Description: 根据fc_id,fc_code查找工厂、车间、工段、产线树结构
	* @param fc_id 工厂ID,fc_code 工厂简码
	* @return 工厂实体类
	*/
	List<FactoryVO> queryFactory (@Param("fc_id") Integer fc_id,@Param("fc_code") String fc_code);
	/** 
	* @Title: queryFactory
	* @Description: 根据fc_id,fc_code查找工厂、车间、工段、产线树结构
	* @param fc_id 工厂ID,fc_code 工厂简码
	* @return 工厂实体类
	*/
	List<FactoryVO> querytreenovsm (@Param("fc_id") Integer fc_id,@Param("fc_code") String fc_code);
}
