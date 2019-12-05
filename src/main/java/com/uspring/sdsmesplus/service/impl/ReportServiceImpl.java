package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.NonconformProductDao;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.ProdBoxMaterialDao;
import com.uspring.sdsmesplus.dao.ProdFinishedProductDao;
import com.uspring.sdsmesplus.dao.ProdOrderStockDao;
import com.uspring.sdsmesplus.dao.ProdProcessStockDao;
import com.uspring.sdsmesplus.dao.ProdProductMaterialDao;
import com.uspring.sdsmesplus.dao.SafelunchOrderDao;
import com.uspring.sdsmesplus.dao.generate.SafelunchWorkLinePODao;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePOExample;
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
	
	@Autowired
	private ProdOrderStockDao prodOrderStockDao;
	
	@Autowired
	private NonconformProductDao noConformProductDao;
	
	@Autowired
	private ProdProcessStockDao prodProcessStockDao;
	
	@Autowired
	private SafelunchOrderDao safelunchOrderDao;
	
	@Autowired
	private SafelunchWorkLinePODao safelunchWorklinePoDao;
	
	@Autowired
	private ProdBoxMaterialDao prodBoxMaterialDao;

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
			String beginTime, String endTime,String poCode, Integer pageNum, Integer pageSize,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.prodBoxLogDao.getBoxList(lineId, boxCode, tuhao, prodCode, prodNumber, beginTime, endTime, poCode,shopId,fcId);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String,Object> getProductList(Integer lineId, String boxCode, String barcode, String tuhao,
			String prodCode,String prodNumber,String poCode, String beginTime, String endTime, Integer pageNum, Integer pageSize,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		ProdFinishedProductPOExample prodExample = new ProdFinishedProductPOExample();
		ProdFinishedProductPOExample.Criteria criteria = prodExample.createCriteria(); 
		
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.prodFinishDao.getProductList(lineId, boxCode, barcode, tuhao, prodCode, prodNumber,poCode, beginTime, endTime,shopId,fcId);
		
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String,Object> useMaterialInfo(String fpBarcode, String boxCode, String materialCode,
			String batchNo, String furnaceNo, String prodCode,String materialBoxCode, String beginTime, String endTime, Integer pageNum,
			Integer pageSize) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> dataList = this.productMaterialDao.useMaterialInfo(fpBarcode, materialCode, batchNo, furnaceNo, prodCode, materialBoxCode, beginTime, endTime);
		
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public List<Map<String,Object>> getInverseQuery(Integer type, String value, Integer fcId) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resulList = new ArrayList<Map<String,Object>>();
	    Map<String,Object> rfidMap = this.mongoDBservice.dataReverSearch(type, value, fcId);
	    if(rfidMap != null){
	    	resulList = this.prodFinishDao.getProductData(Integer.parseInt(rfidMap.get("line").toString()), rfidMap.get("rfid").toString());
	    }
	    
		return resulList;
	}

	@Override
	public Map<String, Object> getOrderStock(String orderCode, String prodCode, String beginTime, String endTime,
			Integer pageNum, Integer pageSize, Integer lineId, String prodNumber,String matProdCode,String matProdNumber,String boxCode,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.prodOrderStockDao.getOrderStock(orderCode, prodCode, prodNumber, matProdCode, matProdNumber,boxCode, beginTime, endTime, lineId, shopId, fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getWasteProd(Integer lineId, String prodCode, String prodNumber, String beginTime,
			String endTime, Integer pageNum, Integer pageSize, String matProdCode, String matProdNumber,
			String status,String poCode,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub noConformProductDao
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.noConformProductDao.getWasteProd(lineId, prodCode, prodNumber, beginTime, endTime, matProdCode, matProdNumber, status, poCode, shopId, fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getWasteProdMaterial(Integer lineId, String nplBarcode, String beginTime, String endTime,
			 String matProdCode, String matProdNumber, Integer pageNum,
			Integer pageSize,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.noConformProductDao.getWasteProdMaterial(lineId, nplBarcode, beginTime, endTime, matProdCode, matProdNumber,shopId,fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getMachMaterial (Integer lineId, String poCode, String prodCode, String prodNumber,
			String batchNo, String furnaceNo, String beginTime, String endTime, Integer pageNum, Integer pageSize,String matProdCode,String matProdNumber,String matBoxCode,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.prodProcessStockDao.getProcessMaterial(lineId, poCode, prodCode, prodNumber, batchNo, furnaceNo, beginTime, endTime, matProdCode, matProdNumber, matBoxCode,shopId,fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getSafeLunch(Integer lineId, String poCode, String prodCode, String prodNumber,
			String boxCode, String beginTime, String endTime, Integer pageNum, Integer pageSize,Integer safelineId,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.safelunchOrderDao.getSafeLunch(lineId, poCode, prodCode, prodNumber, boxCode, beginTime, endTime, safelineId,shopId,fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getSafeLunchDetail(Integer lineId, String poCode, String prodCode, String prodNumber,
			String boxCode, String beginTime, String endTime, String safeLunchOrder, Integer pageNum,
			Integer pageSize,Integer safelineId,String fpBarcode,Integer shopId,Integer fcId) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.safelunchOrderDao.getSafeLunchDetail(lineId, poCode, prodCode, prodNumber, boxCode, beginTime, endTime, safeLunchOrder, safelineId,fpBarcode,shopId,fcId);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public List<SafelunchWorkLinePO> getSafeLunchWorkLine(Integer fcId) {
		// TODO Auto-generated method stub
		SafelunchWorkLinePOExample workLineExample = new SafelunchWorkLinePOExample();
		workLineExample.createCriteria().andFcIdEqualTo(fcId);
		
		List<SafelunchWorkLinePO> workLineList = this.safelunchWorklinePoDao.selectByExample(workLineExample);
		
		return workLineList;
	}

	@Override
	public Map<String, Object> boxMaterialUseInfo(Integer lineId, String beginTime, String endTime, String prodCode,
			String matProdCode, String boxCode, String matBoxCode, Integer pageNum, Integer pageSize,String furnaceNo,String batchNo) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		
		List<Map<String,Object>> dataList = this.prodBoxMaterialDao.boxMaterialUseInfo(lineId, beginTime, endTime, prodCode, matProdCode, boxCode, matBoxCode, furnaceNo, batchNo);
		
        PageInfo info = new PageInfo(dataList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}



}
