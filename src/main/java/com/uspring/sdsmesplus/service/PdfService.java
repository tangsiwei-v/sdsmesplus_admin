/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.uspring.sdsmesplus.entity.po.SjqcPdfPO;

/** 
 * @ClassName: PdfService 
 * @Description: pdf文件上传
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface PdfService {
	
	Map<String,Object> getPdfList(String prodCode,Integer pageNum,Integer pageSize,Integer fcId);
	
	void insertPdf(SjqcPdfPO pdfDo);
	
	void updatePdf(SjqcPdfPO pdfDo);
	
	void deletePdf(Integer qcpId);
	
	String uploadPdf(MultipartFile file);
}
