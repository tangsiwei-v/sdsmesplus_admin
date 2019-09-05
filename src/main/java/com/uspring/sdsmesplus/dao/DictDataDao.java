package com.uspring.sdsmesplus.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.uspring.sdsmesplus.dao.generate.DictDataPODao;
import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.vo.DictDataVO;

/** 
 * @ClassName: DictDataDao 
 * @Description: 基于字典数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年8月26日 下午10:54:18  
 */
public interface DictDataDao extends DictDataPODao{
	
	/**
	 * @Title: queryDictData
	 * @Description 查询字典主数据
	 * @param dt_code 字典类型编码 ,page_size 数据页大小,
	 * page_num 数据页编号
	 * @return 字典实体类 
	 */
	List<DictDataVO> queryDictData(@Param("dt_code") String dt_code, Integer page_size, Integer page_num);
	
	/**
	 * @Title: queryDtCode
	 * @Description 查询字典类型
	 * @return 字典实体类 
	 */
	List<DictDataPO> queryDtCode();
}
