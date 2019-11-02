package com.uspring.sdsmesplus.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.PrinterTmplDao;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPOExample;
import com.uspring.sdsmesplus.entity.vo.PrinterTmplVO;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.PrinterTmplService;

@Service
public class PrinterTmplServiceImpl implements PrinterTmplService {

	private static Logger logger = LoggerFactory.getLogger(PrinterTmplServiceImpl.class);
	
	@Autowired
	private PrinterTmplDao printerTmplDao;

	// 条码模板主数据
	public PageInfo<PrinterTmplVO> printerTmpl(String prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if (prod_code != null && !prod_code.equals("")) {
			prod_code = "%" + prod_code + "%";
		}
		PageHelper.startPage(page_num, page_size);
		List<PrinterTmplVO> printerTmpl = printerTmplDao.printerTmpl(prod_code, customer_code, fcId, page_size,
				page_num);
		for (SysPrinterTmplPO sysPrinterTmplPO : printerTmpl) {
			sysPrinterTmplPO.setPtFileBinary(null);
		}
		PageInfo<PrinterTmplVO> pageInfo = new PageInfo<PrinterTmplVO>(printerTmpl);
		return pageInfo;
	}

	// 添加产品条码模板规则
	public void insertPrinterTmpl(SysPrinterTmplPO printerTmpl) {
		printerTmpl.setPtmplId(null);
		printerTmpl.setPtmplFileName(printerTmpl.getProdCode()+".lab");
		UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		printerTmpl.setCheckPerson(user.getUserName());
		printerTmpl.setCheckTime(new Date());
		printerTmplDao.insertSelective(printerTmpl);
	}

	// 条码模板上传
	public void uploadingPrinterTmpl(String prod_code, String customer_code, MultipartFile file) throws Exception {
		SysPrinterTmplPOExample tmplPOExample = new SysPrinterTmplPOExample();
		tmplPOExample.createCriteria().andProdCodeEqualTo(prod_code).andCustomerCodeEqualTo(customer_code);
		logger.info("fileName:" + file.getOriginalFilename());
		int index = file.getOriginalFilename().lastIndexOf(".");
		String substring = file.getOriginalFilename().substring(index);
		logger.info(substring);
		if (substring.equals(".lab")) {
			SysPrinterTmplPO printerTmpl = new SysPrinterTmplPO();
			byte[] imgBytes = file.getBytes();
			printerTmpl.setPtFileBinary(imgBytes);
			printerTmpl.setPtFileUpdatetime(new Date());
			printerTmplDao.updateByExampleSelective(printerTmpl, tmplPOExample);
		} else {
			throw new ServiceException("请上传正确的条码模板类型");
		}
	}

	// 删除产品条码模板规则
	public void deletePrinterTmpl(Integer ptmplId) {
		printerTmplDao.deleteByPrimaryKey(ptmplId);
	}

	// 修改条码模板
	public void updatePrinterTmpl(SysPrinterTmplPO printerTmpl) {
		printerTmpl.setPtCounterValue(null);
		printerTmplDao.updateByPrimaryKeySelective(printerTmpl);
	}

	// 下载产品条码模板
	public byte[] downloadTemplate(Integer tmplId) throws Exception {
		Map<String, Object> result = printerTmplDao.queryTemplate(tmplId);
		byte[] bytes = (byte[]) result.get("Template");
		return bytes;
	}

}
