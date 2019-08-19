package com.uspring.sdsmesplus.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
	public PageInfo<SysPrinterTmplPO> printerTmpl(String prod_code, String customer_code, Integer fcId,
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

	//添加产品条码模板规则
	public void insertPrinterTmpl(SysPrinterTmplPO printerTmpl) {
		sysPrinterTmplDao.insertSelective(printerTmpl);
	}
	
	//条码模板上传
	public void updatePrinterTmpl(String prod_code, String customer_code, MultipartFile file) throws Exception {
		SysPrinterTmplPOExample tmplPOExample = new SysPrinterTmplPOExample();
		tmplPOExample.createCriteria().andProdCodeEqualTo(prod_code).andCustomerCodeEqualTo(customer_code);
		
		SysPrinterTmplPO printerTmpl = new SysPrinterTmplPO();
		byte[] imgBytes = file.getBytes();
		printerTmpl.setPtFileBinary(imgBytes);
		printerTmpl.setPtFileUpdatetime(new Date());
		sysPrinterTmplDao.updateByExampleSelective(printerTmpl, tmplPOExample);
	}

	//删除产品条码模板规则
	public void deletePrinterTmpl(Integer ptmplId) {
		sysPrinterTmplDao.deleteByPrimaryKey(ptmplId);
	}

}
