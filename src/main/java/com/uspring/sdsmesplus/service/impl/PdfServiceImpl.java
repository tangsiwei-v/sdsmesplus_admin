package com.uspring.sdsmesplus.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.generate.SysProdPdfPODao;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPOExample;
import com.uspring.sdsmesplus.service.PdfService;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月6日 下午2:12:42
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class PdfServiceImpl implements PdfService {

	@Autowired
	private SysProdPdfPODao pdfDao;
	
	@Value("#{prop.pdf_up_load_file}")
	private String uploadFilePath;
	
	@Override
	public Map<String, Object> getPdfList(String prodCode,Integer pageNum,Integer pageSize,Integer fcId) {
		SysProdPdfPOExample pdfExample = new SysProdPdfPOExample();
		SysProdPdfPOExample.Criteria pdfCriteria = pdfExample.createCriteria();
		if(prodCode != null && !"".equals(prodCode)){
			pdfCriteria.andProdCodeEqualTo(prodCode);
		}
		if(fcId != null){
			pdfCriteria.andFcIdEqualTo(fcId);
		}
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<SysProdPdfPO> resultList = this.pdfDao.selectByExample(pdfExample);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public void insertPdf(SysProdPdfPO pdfDo) {
	    pdfDo.setCreateTime(new Date());
	    pdfDo.setUpdateTime(new Date());
		this.pdfDao.insertSelective(pdfDo);
	}

	@Override
	public void updatePdf(SysProdPdfPO pdfDo) {
		pdfDo.setUpdateTime(new Date());
		this.pdfDao.updateByPrimaryKeySelective(pdfDo);
	}

	@Override
	public void deletePdf(Integer sppId) {
		this.pdfDao.deleteByPrimaryKey(sppId);
		
	}

	@Override
	public String uploadPdf(MultipartFile file) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String fileName = df.format(new Date())+"/"+new Date().getTime()+file.getOriginalFilename()+file.getName().substring(file.getName().indexOf("."));
		
		File uploadFile = new File(uploadFilePath+fileName);
		if(!uploadFile.exists()){
			try {
				uploadFile.createNewFile();
				
				file.transferTo(uploadFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fileName;
	}

	

	
}
