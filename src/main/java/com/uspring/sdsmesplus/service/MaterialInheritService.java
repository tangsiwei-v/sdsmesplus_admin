/**
 * @Title: ShiftService.java 
 * @Package com.uspring.sdsmesplus.service 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 下午7:12:55 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.SysMaterialInheritPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.mpmlink.BomMaterial;

/** 
 * @ClassName: PdfService 
 * @Description: pdf文件上传
 * @author majianqing majianqing@uspring.cn 
 * @date 2019年6月27日 下午7:12:55 
 *  
 */
public interface MaterialInheritService {
	
	Map<String,Object> getMaterialInherit(Integer pageNum,Integer pageSize,Integer fcId,String matCode);
	
	void insertMaterialInherit(SysMaterialInheritPO materialInheritPo);
	
	void updateMaterialInherit(SysMaterialInheritPO materialInheritPo);
	
	void deleteMaterialInherit(Integer mathId);
	
	List<BomMaterial> getProdBOM(String prodCode, Integer fcId);
	
	PlanOpBomPO getMtInfo(String prodCode);
	
	
}
