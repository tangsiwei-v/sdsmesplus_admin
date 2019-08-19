package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysPrinterTmplDao;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPOExample;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPOExample.Criteria;
import com.uspring.sdsmesplus.service.PrinterTmplService;

@Service
public class PrinterTmplServiceImpl implements PrinterTmplService {

	@Autowired
	private SysPrinterTmplDao sysPrinterTmplDao;

	//条码模板主数据
	public PageInfo<SysPrinterTmplPO> printerTmpl(Integer prod_code, String customer_code, Integer fcId,
			Integer page_size, Integer page_num) {
		SysPrinterTmplPOExample sysPrinterTmplPOExample = new SysPrinterTmplPOExample();
		Criteria createCriteria = sysPrinterTmplPOExample.createCriteria();
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if (prod_code != null) {
			createCriteria.andProdCodeEqualTo(String.valueOf(prod_code));
		}
		if (customer_code != null) {
			createCriteria.andCustomerCodeEqualTo(customer_code);
		}
		if (fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}
		PageHelper.startPage(page_num, page_size);
		List<SysPrinterTmplPO> sysPrinterTmplPOs = sysPrinterTmplDao.selectByExample(sysPrinterTmplPOExample);
		for (SysPrinterTmplPO sysPrinterTmplPO2 : sysPrinterTmplPOs) {
			sysPrinterTmplPO2.setPtFileBinary(null);
		}
		PageInfo<SysPrinterTmplPO> pageInfo = new PageInfo<SysPrinterTmplPO>(sysPrinterTmplPOs);
		return pageInfo;
	}

}
