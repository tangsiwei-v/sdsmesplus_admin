package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample.Criteria;
import com.uspring.sdsmesplus.service.SysLineService;
@Service
public class SysLineServiceImpl implements SysLineService{
	
	@Autowired
	private SysLinePODao sysLinePODao;
	
	@Override
	public SysLinePO queryLineId(String line_sap_code) {
		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineSapCodeEqualTo(line_sap_code);
		List<SysLinePO> list = sysLinePODao.selectByExample(sysLinePOExample);
		
		SysLinePO sysLinePOs = new SysLinePO();
		if(list.size() > 0) {
			sysLinePOs = list.get(0);
		} else {
			sysLinePOs = null;
		}
		return sysLinePOs;
	}

	@Override
	public SysLinePO queryLineCode(String line_sap_code) {
		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineSapCodeEqualTo(line_sap_code);
		List<SysLinePO> list = sysLinePODao.selectByExample(sysLinePOExample);
		
		SysLinePO sysLinePOs = new SysLinePO();
		if(list.size() > 0) {
			sysLinePOs = list.get(0);
		} else {
			sysLinePOs = null;
		}
		return sysLinePOs;
	}

	//查询产线主数据
	public PageInfo<SysLinePO> queryLine(Integer shopId, Integer vsmId, Integer lineId, Integer page_size,
			Integer page_num) {
		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		Criteria createCriteria = sysLinePOExample.createCriteria();
		if(shopId != null) {
			createCriteria.andShopIdEqualTo(shopId);
		}
		if(vsmId != null) {
			createCriteria.andVsmIdEqualTo(vsmId);
		}
		if(lineId != null) {
			createCriteria.andLineIdEqualTo(lineId);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<SysLinePO> sysLinePOs = sysLinePODao.selectByExample(sysLinePOExample);
		PageInfo<SysLinePO> pageInfo = new PageInfo<SysLinePO>(sysLinePOs);
		return pageInfo;
	}

}
