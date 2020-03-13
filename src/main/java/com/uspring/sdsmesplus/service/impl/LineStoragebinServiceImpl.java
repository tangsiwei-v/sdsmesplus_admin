package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineStoragebinDao;
import com.uspring.sdsmesplus.dao.generate.SysLineStoragebinPODao;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.LineStoragebinVO;
import com.uspring.sdsmesplus.service.LineStoragebinService;

/**
 * @ClassName: LineStoragebinServiceImpl
 * @Description: TODO
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月28日 下午5:38:16
 */
@Service
public class LineStoragebinServiceImpl implements LineStoragebinService {

	@Autowired
	private LineStoragebinDao lineStoragebinDao;
	@Autowired
	private SysLineStoragebinPODao sysLineStoragebinPODao;

	// 查找产线库位主数据
	public PageInfo<LineStoragebinVO> selectLineStoragebins(Integer lineId, Integer page_size, Integer page_num,
			Integer shopId, Integer fcId) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<LineStoragebinVO> lineStoragebins = lineStoragebinDao.selectLineStoragebins(lineId, page_size, page_num,
				shopId, fcId);
		PageInfo<LineStoragebinVO> pageInfo = new PageInfo<LineStoragebinVO>(lineStoragebins);
		return pageInfo;
	}

	// 添加产线库位主数据
	public void insertLineStoragebins(SysLineStoragebinPO lineStoragebin) {
		sysLineStoragebinPODao.insertSelective(lineStoragebin);
	}

	// 修改产线库位主数据
	public void updateLineStoragebins(SysLineStoragebinPO lineStoragebin) {
		sysLineStoragebinPODao.updateByPrimaryKey(lineStoragebin);
	}

	// 删除产线库位主数据
	public void deleteLineStoragebins(Integer linbinId) {
		sysLineStoragebinPODao.deleteByPrimaryKey(linbinId);
	}

}
