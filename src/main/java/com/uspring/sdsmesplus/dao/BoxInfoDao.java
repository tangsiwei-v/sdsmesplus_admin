package com.uspring.sdsmesplus.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.BoxInfoPODao;
import com.uspring.sdsmesplus.entity.vo.BoxInfoVO;

/**
 * @ClassName: BoxInfoDao
 * @Description:基于BoxInfo数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date: 2019年8月22日 上午10:09:01
 */

public interface BoxInfoDao extends BoxInfoPODao {

	/**
	 * @Title: standard
	 * @Description: 查询额定装箱数主数据
	 * @param prod_code 产品简码, customer_code 客户号, fcId 工厂ID
	 * @return BoxInfoPO实体类
	 */
	List<BoxInfoVO> standard(@Param("prod_code") Integer prod_code, @Param("customer_code") String customer_code,
			@Param("fcId") Integer fcId, Integer page_size, Integer page_num);
}
