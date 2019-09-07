package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.DictDataDao;
import com.uspring.sdsmesplus.dao.generate.DictTypePODao;
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictTypePO;
import com.uspring.sdsmesplus.entity.po.DictTypePOExample;
import com.uspring.sdsmesplus.entity.vo.DictDataVO;
import com.uspring.sdsmesplus.service.DictDataService;
@Service
public class DictDataServiceImpl implements DictDataService{
	
	@Autowired
	private DictDataDao dictDataDao;
	
	@Autowired
	private DictTypePODao dictTypePODao;
	
	//字典主数据
	public PageInfo<DictDataVO> queryDictData(String dt_code, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<DictDataVO> dictDataPOs = dictDataDao.queryDictData(dt_code, page_size, page_num);
		PageInfo<DictDataVO> pageInfo = new PageInfo<DictDataVO>(dictDataPOs);
		return pageInfo;
	}

	//添加字典主数据
	public void insertDictData(DictDataPO dictDataPO) {
		dictDataDao.insertSelective(dictDataPO);
	}

	//修改字典主数据
	public void updateDictData(DictDataPO dictDataPO) {
		dictDataDao.updateByPrimaryKey(dictDataPO);
	}

	//删除字典主数据
	public void deleteDictData(Integer ddId) {
		dictDataDao.deleteByPrimaryKey(ddId);
	}

	//查询字典类型
	public List<DictTypePO> queryDtCode() {
		DictTypePOExample dictTypePOExample = new DictTypePOExample();
		dictTypePOExample.createCriteria();
		List<DictTypePO> dictTypes = dictTypePODao.selectByExample(dictTypePOExample);
		return dictTypes;
	}

}
