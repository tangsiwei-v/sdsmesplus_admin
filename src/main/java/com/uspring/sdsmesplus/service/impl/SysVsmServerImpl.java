package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysVsmPODao;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.po.SysVsmPOExample;
import com.uspring.sdsmesplus.entity.po.SysVsmPOExample.Criteria;
import com.uspring.sdsmesplus.service.SysVsmServer;

/**   
 * @ClassName: SysVsmServerImpl
 * @Version 1.0
 * @author: shangyanbing shangyanbing@uspring.cn   
 * @date: 2019年8月7日 上午10:24:45 
 */
@Service
public class SysVsmServerImpl implements SysVsmServer{
	@Autowired
	private SysVsmPODao sysVsmPODao;
	
	//查找工段主数据
	public PageInfo<SysVsmPO> queryVsm(Integer shopId, Integer vsmId, Integer page_size, Integer page_num) {
		SysVsmPOExample sysVsmPOExample = new SysVsmPOExample();
		Criteria createCriteria = sysVsmPOExample.createCriteria();
		if(shopId != null) {
			createCriteria.andShopIdEqualTo(shopId);
		}
		if(vsmId != null) {
			createCriteria.andVsmIdEqualTo(vsmId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SysVsmPO> sysVsmPOs = sysVsmPODao.selectByExample(sysVsmPOExample);
		PageInfo<SysVsmPO> pageInfo = new PageInfo<SysVsmPO>(sysVsmPOs);
		return pageInfo;
	}
}
