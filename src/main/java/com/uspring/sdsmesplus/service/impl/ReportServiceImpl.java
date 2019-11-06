package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.ProdFinishedProductDao;
import com.uspring.sdsmesplus.dao.ProdProductMaterialDao;
import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.dao.generate.ProdProductMaterialPODao;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.po.ProdProductMaterialPO;
import com.uspring.sdsmesplus.entity.po.ProdProductMaterialPOExample;
import com.uspring.sdsmesplus.service.MongoDBService;
import com.uspring.sdsmesplus.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private ProdFinishedProductDao prodFinishDao;
	
	@Autowired
	private ProdBoxLogDao prodBoxLogDao;
	
	@Autowired
	private MongoDBService mongoDBservice;
	
	@Autowired
	private ProdProductMaterialDao productMaterialDao;

	@Override
	public Map<String, Object> getProductInfo(String barcode) {
		// TODO Auto-generated method stub
		Map<String,Object> resultMap = this.prodFinishDao.getProductInfo(barcode);
		return resultMap;
	}

	@Override
	public List<Map<String,Object>> costMaterial(Integer fpId) {
		// TODO Auto-generated method stub
		return this.productMaterialDao.costMaterialInfo(fpId);
	}

	@Override
	public List<Map<String, Object>> getProcessInfo(String rfid, Integer lineId) {
		// TODO Auto-generated method stub
		
		return this.mongoDBservice.getProcessData(rfid, lineId);
	}

	@Override
	public Map<String,Object> getBoxList(Integer lineId, String boxCode, String tuhao, String prodCode,String prodNumber,
			String beginTime, String endTime,String poCode, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.prodBoxLogDao.getBoxList(lineId, boxCode, tuhao, prodCode, prodNumber, beginTime, endTime, poCode);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String,Object> getProductList(Integer lineId, String boxCode, String barcode, String tuhao,
			String prodCode,String prodNumber, String beginTime, String endTime, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		ProdFinishedProductPOExample prodExample = new ProdFinishedProductPOExample();
		ProdFinishedProductPOExample.Criteria criteria = prodExample.createCriteria(); 
		
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.prodFinishDao.getProductList(lineId, boxCode, barcode, tuhao, prodCode, prodNumber, beginTime, endTime);
		
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

}
