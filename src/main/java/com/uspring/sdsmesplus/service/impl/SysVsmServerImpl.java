package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.SysVsmDao;
import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.vo.VsmVO;
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
	private SysVsmDao sysVsmDao;
	
	//查找工段主数据
	public PageInfo<VsmVO> queryVsm(Integer shopId, Integer vsmId, Integer page_size, Integer page_num, Integer fcId) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<VsmVO> vsms = sysVsmDao.queryVsm(shopId, vsmId, page_size, page_num, fcId);
		PageInfo<VsmVO> pageInfo = new PageInfo<VsmVO>(vsms);
		return pageInfo;
	}

	
	//添加工段主数据
	public void insertVsm(SysVsmPO vsm) {
		sysVsmDao.insertSelective(vsm);
	}
	
	//修改工段主数据
	public void updateVsm(SysVsmPO vsm) {
		sysVsmDao.updateByPrimaryKey(vsm);
	}

	//删除工段主数据
	public void deleteVsm(Integer vsmId) {
		sysVsmDao.deleteByPrimaryKey(vsmId);
	}
}
