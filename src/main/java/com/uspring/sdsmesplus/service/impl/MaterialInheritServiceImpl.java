package com.uspring.sdsmesplus.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.SysMaterialInheritDao;
import com.uspring.sdsmesplus.dao.generate.SysMaterialInheritPODao;
import com.uspring.sdsmesplus.dao.generate.SysProdPdfPODao;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.SysMaterialInheritPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPOExample;
import com.uspring.sdsmesplus.mpmlink.BomMaterial;
import com.uspring.sdsmesplus.mpmlink.MPlinkServiceimpl;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.service.MaterialInheritService;
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
public class MaterialInheritServiceImpl implements MaterialInheritService {

	@Autowired
	private SysMaterialInheritDao materialInheritDao;
	
	@Resource(name="MPlinkServiceimpl")
	private MPlinkServiceimpl mpmlinkService;
	
	@Autowired
	private PlanOpBomDao bomDao;

	@Override
	public Map<String, Object> getMaterialInherit(Integer pageNum, Integer pageSize, Integer fcId,String matCode) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.materialInheritDao.getMaterialInherit(fcId, matCode);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public void insertMaterialInherit(SysMaterialInheritPO materialInheritPo) {
		// TODO Auto-generated method stub
		materialInheritPo.setUpdateTime(new Date());
		materialInheritPo.setCreateTime(new Date());
		this.materialInheritDao.insertSelective(materialInheritPo);
	}

	@Override
	public void updateMaterialInherit(SysMaterialInheritPO materialInheritPo) {
		// TODO Auto-generated method stub
		materialInheritPo.setUpdateTime(new Date());
		this.materialInheritDao.updateByPrimaryKeySelective(materialInheritPo);
	}

	@Override
	public void deleteMaterialInherit(Integer mathId) {
		// TODO Auto-generated method stub
		this.materialInheritDao.deleteByPrimaryKey(mathId);
	}

	@Override
	public List<BomMaterial> getProdBOM(String prodCode,Integer fcId) {
		// TODO Auto-generated method stub
		List<BomMaterial> bomList = new ArrayList<BomMaterial>();
		try {
			bomList = this.mpmlinkService.queryBom(prodCode, fcId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bomList;
	}

	@Override
	public PlanOpBomPO getMtInfo(String prodCode) {
		// TODO Auto-generated method stub
		PlanOpBomPO bomInfo = null;
		
		List<String> mtCodes = new ArrayList<String>();
		mtCodes.add(prodCode);
		List<PlanOpBomPO> bomList = this.bomDao.selectBomByMtCode(mtCodes);
		
		if(bomList.size() > 0){
			bomInfo = bomList.get(0);
		}
		
		return null;
	}
  
}
