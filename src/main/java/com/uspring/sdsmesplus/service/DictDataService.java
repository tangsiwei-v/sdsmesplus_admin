package com.uspring.sdsmesplus.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictTypePO;
import com.uspring.sdsmesplus.entity.vo.DictDataVO;

/** 
 * @ClassName: DictDataService 
 * @Description: 基于字典数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年8月3日 下午4:21:10 
 *  
 */

public interface DictDataService {

	/**
	 * @Title: queryDictData
	 * @Description 查询字典主数据
	 * @param dt_code 字典类型编码 ,page_size 数据页大小,
	 * page_num 数据页编号
	 * @return 字典实体类 
	 */
	PageInfo<DictDataVO> queryDictData(String dt_code, Integer page_size, Integer page_num);

	/**
	 * @Title: insertDictData
	 * @Description 添加字典主数据
	 * @param dictDataPO 字典实体类 
	 */
	void insertDictData(DictDataPO dictDataPO);

	/**
	 * @Title: updateDictData
	 * @Description 修改字典主数据
	 * @param dictDataPO 字典实体类 
	 */
	void updateDictData(DictDataPO dictDataPO);

	/**
	 * @Title: deleteDictData
	 * @Description 删除字典主数据
	 * @param ddId 字典ID
	 */
	void deleteDictData(Integer ddId);

	/**
	 * @Title: queryDtCode
	 * @Description 查询字典类型
	 * @return 字典实体类 
	 */
	List<DictTypePO> queryDtCode();

}
