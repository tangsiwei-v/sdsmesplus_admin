package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.DictDataPODao;
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictDataPOExample;
import com.uspring.sdsmesplus.entity.po.DictDataPOExample.Criteria;
import com.uspring.sdsmesplus.service.DictDataService;
@Service
public class DictDataServiceImpl implements DictDataService{
	
	@Autowired
	private DictDataPODao dictDataPODao;
	
	//查询工单冻结原因
	public List<DictDataPO> queryReason() {
		DictDataPOExample dictDataPOExample = new DictDataPOExample();
		dictDataPOExample.createCriteria().andDtCodeEqualTo("FrozeReason");
		List<DictDataPO> list = dictDataPODao.selectByExample(dictDataPOExample);
		return list;
	}

	//字典主数据
	public PageInfo<DictDataPO> queryDictData(String dt_code, Integer page_size, Integer page_num) {
		DictDataPOExample dictDataPOExample = new DictDataPOExample();
		Criteria createCriteria = dictDataPOExample.createCriteria();
		if(dt_code != null && !dt_code.equals("")) {
			createCriteria.andDtCodeEqualTo(dt_code);
		}
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<DictDataPO> dictDataPOs = dictDataPODao.selectByExample(dictDataPOExample);
		PageInfo<DictDataPO> pageInfo = new PageInfo<DictDataPO>(dictDataPOs);
		return pageInfo;
	}

	//添加字典主数据
	public void insertDictData(DictDataPO dictDataPO) {
		dictDataPODao.insertSelective(dictDataPO);
	}

	//修改字典主数据
	public void updateDictData(DictDataPO dictDataPO) {
		dictDataPODao.updateByPrimaryKey(dictDataPO);
	}

	//删除字典主数据
	public void deleteDictData(Integer ddId) {
		dictDataPODao.deleteByPrimaryKey(ddId);
	}

}
