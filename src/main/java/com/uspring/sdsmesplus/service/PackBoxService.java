package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.wms.entity.Package;

/**
 * * @author 作者 E-mail:chengtenfgei
 * 
 * @date 创建时间：2019年6月20日 下午15:57:41
 * @version 1.0 * @parameter
 * @since PackBoxService
 * @return
 */
public interface PackBoxService {
	//获取hu信息
	List<Package> queryMaterialBoxInfo(String boxCode) throws Exception;
	// 请求箱合格证
	ProdBoxLogPO requestBoxCode(String order_code, Integer boxQuan) throws Exception;

	// 下线装箱
	void createMachBox(String order_code, ProdBoxLogPO boxLog, Boolean matSubstract) throws Exception;

	// 箱体主数据
	PageInfo<BoxInfoPO> searchBoxInfo(Map<String, Object> map) throws Exception;

	// 装箱查询
	PageInfo<ProdBoxLogPO> searchBoxLog(Map<String, Object> map) throws Exception;

	// 过程装箱
	void wipBoxInfo(String dev_code, ProdBoxLogPO boxLog) throws Exception;

	// 箱合格证补打
	void reprint(String order_code, ProdBoxLogPO boxLog);
	
    //请求过程码
	ProdBoxLogPO request(String dev_code, Integer boxQuan, String glevel, String furnace_no) throws Exception;
	
	//查询产品装箱主数据
	BoxInfoPO queryboxLog(String prod_code , String customer_code, Integer fc_id);

	//拉料判断
	void materialCallCheck(String orderCode) throws Exception;
	
	//添加装箱数主数据
	void insertBoxInfo(BoxInfoPO boxInfo);
	
	//修改装箱数主数据
	void updateBoxInfo(BoxInfoPO boxInfo);
	
	//查询额定装箱数主数据
	PageInfo<BoxInfoPO> standard(Integer prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num);
	//删除装箱数主数据
	void deleteBoxInfo(Integer bifId);
	
}
