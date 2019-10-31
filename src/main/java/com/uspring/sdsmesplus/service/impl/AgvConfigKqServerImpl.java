package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.AgvConfigKqDao;
import com.uspring.sdsmesplus.entity.po.AgvConfigKqPO;
import com.uspring.sdsmesplus.entity.vo.AgvConfigKqVO;
import com.uspring.sdsmesplus.service.AgvConfigKqServer;

/** 
 * @ClassName: AgvConfigKqServerImpl 
 * @Version 1.0
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月22日 下午1:05:09  
 */

@Service
public class AgvConfigKqServerImpl implements AgvConfigKqServer{
	
	@Autowired
	private AgvConfigKqDao agvConfigKqDao;
	
	//查询AGV主数据
	public PageInfo<AgvConfigKqVO> queryAgvConfig(Integer fcId, Integer lineId, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<AgvConfigKqVO> agvConfigs = agvConfigKqDao.queryAgvConfig(fcId, lineId, page_size, page_num);
		PageInfo<AgvConfigKqVO> pageInfo = new PageInfo<AgvConfigKqVO>(agvConfigs);
		return pageInfo;
	}

	//添加AGV拉动配置表
	public void insertAgvConfig(AgvConfigKqPO agvConfigKq) {
		agvConfigKqDao.insertSelective(agvConfigKq);
	}

	//修改AGV拉动配置表
	public void updateAgvConfig(AgvConfigKqPO agvConfigKq) {
		agvConfigKqDao.updateByPrimaryKeySelective(agvConfigKq);
	}

	//删除AGV拉动配置表
	public void deleteAgvConfig(Integer agvcfgId) {
		agvConfigKqDao.deleteByPrimaryKey(agvcfgId);
	}

}
