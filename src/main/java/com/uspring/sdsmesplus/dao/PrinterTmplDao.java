package com.uspring.sdsmesplus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.dao.generate.SysPrinterTmplDao;
import com.uspring.sdsmesplus.entity.vo.PrinterTmplVO;

/**
 * @ClassName: PrinterTmplDao
 * @Description:基于PrinterTmpl数据库操作类
 * @author shangyanbing shangyanbing@uspring.cn
 * @date: 2019年8月22日 下午15:36:32
 */

public interface PrinterTmplDao extends SysPrinterTmplDao {
	/** 
	* @Title: printerTmpl 
	* @Description: 根据产品简码，客户号，查询产品条码模板规则
	* @param prod_code 产品简码，customer_code 客户号
	* fcId 工厂ID,page_size page_num
	* @return 产品打印模板实体表
	*/
	 List<PrinterTmplVO> printerTmpl(@Param("prod_code") String prod_code, @Param("customer_code") String customer_code, @Param("fcId") Integer fcId, Integer page_size,
			Integer page_num);
	 /**
	  * @Title: printerTmpl 
	  * @Description: 查询条码模板二进制文件
	  * @param prod_code 
	  * @return
	  */
	 Map<String, Object> queryTemplate(Integer tmplId);
	 
}
