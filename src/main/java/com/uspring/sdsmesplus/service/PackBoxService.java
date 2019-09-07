package com.uspring.sdsmesplus.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.vo.BoxInfoVO;

/**
 * * @author 作者 E-mail:chengtenfgei
 * 
 * @date 创建时间：2019年6月20日 下午15:57:41
 * @version 1.0 * @parameter
 * @since PackBoxService
 * @return
 */
public interface PackBoxService {
	// 箱体主数据
	PageInfo<BoxInfoPO> searchBoxInfo(Map<String, Object> map) throws Exception;
	
	//查询产品装箱主数据
	BoxInfoPO queryboxLog(String prod_code , String customer_code, Integer fc_id);
  
	//添加装箱数主数据
	void insertBoxInfo(BoxInfoPO boxInfo);
	
	//修改装箱数主数据
	void updateBoxInfo(BoxInfoPO boxInfo);
	
	//查询额定装箱数主数据
	PageInfo<BoxInfoVO> standard(String prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num);
	
	//删除装箱数主数据
	void deleteBoxInfo(Integer bifId);
	
}
