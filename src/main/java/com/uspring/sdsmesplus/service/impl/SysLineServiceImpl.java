package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineDao;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.entity.vo.LineVO;
import com.uspring.sdsmesplus.service.SysLineService;
@Service
public class SysLineServiceImpl implements SysLineService{
	
	@Autowired
	private LineDao lineDao;
	
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
	public PageInfo<LineVO> queryLine(Integer shopId, Integer vsmId, Integer lineId, Integer page_size,
			Integer page_num, Integer fcId) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<LineVO> lines = lineDao.queryLine(shopId, vsmId, lineId, page_size, page_num, fcId);
		PageInfo<LineVO> pageInfo = new PageInfo<LineVO>(lines);
		return pageInfo;
	}

	//添加产线主数据
	public void insertLine(SysLinePO linePO) {
		lineDao.insertSelective(linePO);
		
	}

	//修改产线主数据
	public void updateLine(SysLinePO linePO) {
		lineDao.updateByPrimaryKey(linePO);
	}

	//删除产线主数据
	public void deleteLine(Integer lineId) {
		lineDao.deleteByPrimaryKey(lineId);
	}

}
