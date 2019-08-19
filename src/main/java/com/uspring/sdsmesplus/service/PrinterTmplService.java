package com.uspring.sdsmesplus.service;

import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;

/** 
 * @ClassName: PrinterTmplService 
 * @Description: 产品主数据接口
 * @author shangyanbing shangyanbing@uspring.cn 
 * @date 2019年7月26日 上午10:47:18 
 *  
 */

public interface PrinterTmplService {
	/** 
	* @Title: printerTmpl 
	* @Description: 根据产品简码，客户号，查询产品条码模板规则
	* @param prod_code 产品简码，customer_code 客户号
	* fcId 工厂ID,page_size page_num
	* @return  产品打印模板实体表
	*/
	 PageInfo<SysPrinterTmplPO> printerTmpl(String prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num);

	 /**
	 * @Title: insertPrinterTmpl 
	 * @Description: 添加产品条码模板规则
	 * @param printerTmpl 产品打印模板实体表
	 */
	void insertPrinterTmpl(SysPrinterTmplPO printerTmpl);
	 
	/**
	 * @Title: updatePrinterTmpl 
	 * @Description: 修改产品条码模板规则
	 * @param prod_code产品编号
	 * customer_code客户号
	 * file 文件上传
	 * @throws Exception 
	 */
	void updatePrinterTmpl(String prod_code, String customer_code, MultipartFile file) throws Exception;

	/**
	 * @Title: insertPrinterTmpl 
	 * @Description: 删除产品条码模板规则
	 * @param ptmplId 主键id
	 */
	void deletePrinterTmpl(Integer ptmplId);

}
