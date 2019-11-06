/**
 * @Title: ShiftDao.java 
 * @Package com.uspring.sdsmesplus.dao 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月29日 上午9:32:39 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.ProdProductMaterialPODao;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;

/** 
 * @ClassName: ProdBoxLogDao
 * @Description: 产品装箱记录
 * @author liuwenchao liuwenchao@uspring.cn
 * @date 2019年7月13日 下午15:09:39
 *  
 */
public interface ProdProductMaterialDao extends ProdProductMaterialPODao {

	List<Map<String,Object>> costMaterialInfo(@Param("fpId")Integer fpId);
}
