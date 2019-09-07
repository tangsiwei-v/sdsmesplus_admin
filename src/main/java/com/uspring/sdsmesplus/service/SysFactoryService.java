package com.uspring.sdsmesplus.service;

import java.rmi.ServerException;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.vo.FactoryVO;

/** 
 * @ClassName: SysFactoryService 
 * @Description: 基于SysFactory数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年6月25日 上午9:15:16 
 *  
 */
public interface SysFactoryService {
	/** 
	* @Title: queryFactory
	* @Description: 根据fc_id,fc_code查找工厂、车间、工段、产线树结构
	* @param fc_id 工厂ID,fc_code 工厂简码
	* @return 工厂实体类
	*/
	List<FactoryVO> queryFactory (Integer fc_id,String fc_code);
	
	/** 
	* @Title: queryFactory
	* @Description: 根据fc_id,fc_code查找工厂、车间、产线树结构
	* @param fc_id 工厂ID,fc_code 工厂简码
	* @return 工厂实体类
	*/
	List<FactoryVO> querytreenovsm(Integer fc_id, String fc_code);
	
	/** 
	* @Title: queryFactorys
	* @Description: 根据fc_id 查询工厂主数据
	* @param fc_id 工厂ID
	* page_size ，page_num
	* @return 工厂实体类
	*/
	PageInfo<SysFactoryPO> queryFactorys(Integer fcId, Integer page_size, Integer page_num);

	/**
	 * @Title: insertFactory
	 * @Description:添加工厂主数据
	 * @param factory 工厂实体类
	 * @throws ServerException 
	 */
	void insertFactory(SysFactoryPO factory) throws ServerException;
	
	/**
	 * @Title: deleteFactory
	 * @Description:删除工厂主数据
	 * @param fcId 工厂ID
	 */
	void deleteFactory(Integer fcId);

	/**
	 * @Title: updateFactory
	 * @Description:修改工厂主数据
	 * @param factory
	 */
	void updateFactory(SysFactoryPO factory);
	
	/** 
	* @Title: selectFactorys
	* @Description: 查询工厂主数据
	* @return 工厂实体类
	*/
	List<SysFactoryPO> selectFactorys();
	
}
