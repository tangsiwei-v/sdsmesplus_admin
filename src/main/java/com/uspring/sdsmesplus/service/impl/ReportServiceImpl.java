package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.common.ExportXls;
import com.uspring.sdsmesplus.dao.LineProdModelDao;
import com.uspring.sdsmesplus.dao.NonconformProductDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.ProcessParamDao;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.ProdBoxMaterialDao;
import com.uspring.sdsmesplus.dao.ProdCleanLogDao;
import com.uspring.sdsmesplus.dao.ProdFinishedProductDao;
import com.uspring.sdsmesplus.dao.ProdOrderStockDao;
import com.uspring.sdsmesplus.dao.ProdProcessStockDao;
import com.uspring.sdsmesplus.dao.ProdProductMaterialDao;
import com.uspring.sdsmesplus.dao.SafelunchOrderDao;
import com.uspring.sdsmesplus.dao.generate.NonconformProductLogPODao;
import com.uspring.sdsmesplus.dao.generate.SafelunchWorkLinePODao;
import com.uspring.sdsmesplus.dao.generate.SysProcessPODao;
import com.uspring.sdsmesplus.dao.generate.SysProcessParamPODao;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPOExample;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPO;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample;
import com.uspring.sdsmesplus.entity.po.ProdProcessStockPO;
import com.uspring.sdsmesplus.entity.po.ProdProcessStockPOExample;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePOExample;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPOExample;
import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import com.uspring.sdsmesplus.entity.po.SysProcessPOExample;
import com.uspring.sdsmesplus.entity.po.SysProcessParamPO;
import com.uspring.sdsmesplus.entity.po.SysProcessParamPOExample;
import com.uspring.sdsmesplus.entity.vo.StockStat;
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

	@Autowired
	private PlanOrderDao planOrderDao;

	@Autowired
	private NonconformProductLogPODao nonconformProductDao;

	@Autowired
	private ProdCleanLogDao prodCleanLogPoDao;

	@Autowired
	private LineProdModelDao LineProdModelDao;
	
	@Autowired  
	private SysProcessPODao processDao;
	
	@Autowired
	private SysProcessParamPODao processParamDao;
	
	@Autowired
	private ProcessParamDao ParamDao;

	@Override
	public Map<String, Object> getProductInfo(String barcode) {
		Map<String, Object> resultMap = this.prodFinishDao.getProductInfo(barcode);
		return resultMap;
	}

	@Override
	public List<Map<String, Object>> costMaterial(Integer fpId) {
		return this.productMaterialDao.costMaterialInfo(fpId);
	}

	@Override
	public List<Map<String, Object>> getProcessInfo(String rfid, Integer lineId) {
		return this.mongoDBservice.getProcessData(rfid, lineId);
	}

	@Override
	public Map<String, Object> getBoxList(Integer lineId, String boxCode, String tuhao, String prodCode,
			String prodNumber, String beginTime, String endTime, String poCode, Integer pageNum, Integer pageSize,
			Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String, Object>> resultList = this.prodBoxLogDao.getBoxList(lineId, boxCode, tuhao, prodCode,
				prodNumber, beginTime, endTime, poCode, shopId, fcId);
		PageInfo info = new PageInfo(resultList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getProductList(HttpServletResponse response,Integer lineId, String boxCode, String barcode, String tuhao,
			String prodCode, String prodNumber, String poCode, String beginTime, String endTime, Integer pageNum,
			Integer pageSize, Integer shopId, Integer fcId, Integer isExport) {
		
		if(lineId == 161){
			shopId = null;
			fcId = null;
			lineId = 42281;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		ProdFinishedProductPOExample prodExample = new ProdFinishedProductPOExample();
		ProdFinishedProductPOExample.Criteria criteria = prodExample.createCriteria();

		PageHelper page = new PageHelper();
		
		//是否分页显示
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		List<Map<String, Object>> resultList = this.prodFinishDao.getProductList(lineId, boxCode, barcode, tuhao,
				prodCode, prodNumber, poCode, beginTime, endTime, shopId, fcId);
        
		//是否导出
		if(isExport == 1){
			exportProductInfo(resultList,response);
	    }
		
		PageInfo info = new PageInfo(resultList);

		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());

		return resultMap;
	}
	
	public void exportProductInfo(List<Map<String, Object>> productList,HttpServletResponse response){
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		Integer lineId = 0;
		
		List<String> rfidList = new ArrayList<String>();
		
		for(Map<String,Object> productInfo:productList){
			/*List<Map<String,Object>> processList = this.mongoDBservice.getProcessData(productInfo.get("fp_rfid").toString(), Integer.parseInt(productInfo.get("line_id").toString()));
			resultList.add(processList);*/
			
			lineId = Integer.parseInt(productInfo.get("line_id").toString());
			rfidList.add(productInfo.get("fp_rfid").toString());
		}
		
		/*rfidList.clear();
		rfidList.add("20191129060018");
		rfidList.add("20191129060016");
		rfidList.add("20191129060015");
		rfidList.add("20191129060014");
		rfidList.add("20191129060006");
		rfidList.add("20191129060005");*/
		//获取产品的所有数据
		resultList = this.mongoDBservice.findPParamByRFIDList(rfidList, lineId+"");
		
		lineId = 161;
		//获取所有工序的数据
		SysProcessPOExample processExample = new SysProcessPOExample();
		processExample.createCriteria().andLineIdEqualTo(lineId);
		processExample.setOrderByClause("sp_order asc");
		
		List<Map<String,Object>> resultProcessList = new ArrayList<Map<String,Object>>();
		//查询产品需要显示的工序
		List<SysProcessPO> processList = this.processDao.selectByExample(processExample);
		for(SysProcessPO processDo:processList){
			/*Map<String,Object> processMap = new HashMap<String,Object>();
			processMap.put("processName", processDo.getSpName());
			processMap.put("processCode", processDo.getSpCode());
			processMap.put("paramList", new ArrayList());*/
			
			//查询所有的工序参数
			SysProcessParamPOExample paramExample = new SysProcessParamPOExample();
			paramExample.createCriteria().andSpIdEqualTo(processDo.getSpId()).andPpShowEqualTo(true);
			paramExample.setOrderByClause("pp_order asc");
			List<SysProcessParamPO> paramList = this.processParamDao.selectByExample(paramExample);
			
			//List<Map<String,Object>> paramValueList = new ArrayList<Map<String,Object>>();
			
			for(SysProcessParamPO paramDo:paramList){
				Map<String,Object> paramMap = new HashMap<String,Object>();
				paramMap.put("paramName", paramDo.getPpName());
				paramMap.put("paramCode", paramDo.getPpCode());
				
				paramMap.put("processName", processDo.getSpName());
				paramMap.put("processCode", processDo.getSpCode());
				
				resultProcessList.add(paramMap);
			}
			//processMap.put("paramList", paramValueList);
		}
		ExportXls.exportBarcode(resultList, response, resultProcessList, null, "精确追溯数据");
	}

	@Override
	public Map<String, Object> useMaterialInfo(String fpBarcode, String boxCode, String materialCode, String batchNo,
			String furnaceNo, String prodCode, String materialBoxCode, String beginTime, String endTime,
			Integer pageNum, Integer pageSize) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String, Object>> dataList = this.productMaterialDao.useMaterialInfo(fpBarcode, materialCode, batchNo,
				furnaceNo, prodCode, materialBoxCode, beginTime, endTime);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public List<Map<String, Object>> getInverseQuery(Integer type, String value, Integer fcId) {
		List<Map<String, Object>> resulList = new ArrayList<Map<String, Object>>();
		Map<String, Object> rfidMap = this.mongoDBservice.dataReverSearch(type, value, fcId);
		if (rfidMap != null) {
			resulList = this.prodFinishDao.getProductData(Integer.parseInt(rfidMap.get("line").toString()),
					rfidMap.get("rfid").toString());
		}

		return resulList;
	}

	@Override
	public Map<String, Object> getOrderStock(String orderCode, String prodCode, String beginTime, String endTime,
			Integer pageNum, Integer pageSize, Integer lineId, String prodNumber, String matProdCode,
			String matProdNumber, String boxCode, Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.prodOrderStockDao.getOrderStock(orderCode, prodCode, prodNumber,
				matProdCode, matProdNumber, boxCode, beginTime, endTime, lineId, shopId, fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public List<StockStat> statOrderStock(Integer lineId, String poCode, String procCode, String matProdCode,
			String matProdNumber, String boxCode, String groupBy, String beginTime, String endTime, Integer pageNum,
			Integer pageSize, Integer isCleaned, Integer shopId, Integer fcId) {

		List<StockStat> stockList = new ArrayList<StockStat>();

		if (lineId != null) {
			SysLineProdmodelPOExample modelExample = new SysLineProdmodelPOExample();
			SysLineProdmodelPOExample.Criteria criteria = modelExample.createCriteria();
			criteria.andLineIdEqualTo(lineId);
			modelExample.createCriteria().andLineIdEqualTo(lineId);
			List<SysLineProdmodelPO> modelList = this.LineProdModelDao.selectByExample(modelExample);

			if (modelList.size() > 0) {
				String model = modelList.get(0).getProdModel();
				if (model.equals("cv_assy") || model.equals("sec_assy")) {
					stockList = prodOrderStockDao.statOrderStock(lineId, poCode, matProdCode, boxCode, isCleaned,
							shopId, fcId, beginTime, endTime);
				} else {
					stockList = prodOrderStockDao.statProcStock(lineId, poCode, matProdCode, boxCode, procCode,
							isCleaned, shopId, fcId, beginTime, endTime);
				}
			}
		} else {
			stockList = prodOrderStockDao.statOrderStock(lineId, poCode, matProdCode, boxCode, isCleaned, shopId, fcId,
					beginTime, endTime);
			stockList.addAll(prodOrderStockDao.statProcStock(lineId, poCode, matProdCode, boxCode, procCode, isCleaned,
					shopId, fcId, beginTime, endTime));
			stockList.addAll(prodOrderStockDao.statWipStock(lineId, poCode, matProdCode, boxCode, procCode, shopId,
					fcId, beginTime, endTime));
		}

		Map<String, StockStat> resultMap = new HashMap<String, StockStat>();
		for (StockStat stock : stockList) {
			String key = stock.getBoxBarcode();
			if ("Batch".equals(groupBy))
				key = stock.getMatCode() + stock.getBatchNo();
			if (resultMap.containsKey(key)) {
				StockStat mapStock = resultMap.get(key);
				mapStock.setMatCount(mapStock.getMatCount() + stock.getMatCount());
			} else {
				if ("Batch".equals(groupBy)) {
					// 批次统计-忽略工单、工序和箱的信息
					stock.setBoxBarcode("");
					stock.setProcCode("");
					stock.setPoCode("");
				}
				resultMap.put(key, stock);
			}
		}
		List<StockStat> resultList = new ArrayList<StockStat>();
		resultList.addAll(resultMap.values());

		return resultList;
	}

	public Integer getLineId(String poCode) {
		Integer lineId = null;
		PlanOrderPOExample planExample = new PlanOrderPOExample();
		planExample.createCriteria().andLineIdEqualTo(lineId);

		List<PlanOrderPO> orderList = this.planOrderDao.selectByExample(planExample);
		if (orderList.size() > 0) {
			lineId = orderList.get(0).getLineId();
		}
		return lineId;
	}

	@Override
	public Map<String, Object> getWasteProd(Integer lineId, String prodCode, String prodNumber, String beginTime,
			String endTime, Integer pageNum, Integer pageSize, String matProdCode, String matProdNumber, String status,
			String poCode, Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.noConformProductDao.getWasteProd(lineId, prodCode, prodNumber,
				beginTime, endTime, matProdCode, matProdNumber, status, poCode, shopId, fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getWasteProdMaterial(Integer lineId, String nplBarcode, String beginTime, String endTime,
			String matProdCode, String matProdNumber, Integer pageNum, Integer pageSize, Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.noConformProductDao.getWasteProdMaterial(lineId, nplBarcode,
				beginTime, endTime, matProdCode, matProdNumber, shopId, fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getMachMaterial(Integer lineId, String poCode, String prodCode, String prodNumber,
			String batchNo, String furnaceNo, String beginTime, String endTime, Integer pageNum, Integer pageSize,
			String matProdCode, String matProdNumber, String matBoxCode, Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.prodProcessStockDao.getProcessMaterial(lineId, poCode, prodCode,
				prodNumber, batchNo, furnaceNo, beginTime, endTime, matProdCode, matProdNumber, matBoxCode, shopId,
				fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getSafeLunch(Integer lineId, String poCode, String prodCode, String prodNumber,
			String boxCode, String beginTime, String endTime, Integer pageNum, Integer pageSize, Integer safelineId,
			Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.safelunchOrderDao.getSafeLunch(lineId, poCode, prodCode, prodNumber,
				boxCode, beginTime, endTime, safelineId, shopId, fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getSafeLunchDetail(Integer lineId, String poCode, String prodCode, String prodNumber,
			String boxCode, String beginTime, String endTime, String safeLunchOrder, Integer pageNum, Integer pageSize,
			Integer safelineId, String fpBarcode, Integer shopId, Integer fcId) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.safelunchOrderDao.getSafeLunchDetail(lineId, poCode, prodCode,
				prodNumber, boxCode, beginTime, endTime, safeLunchOrder, safelineId, fpBarcode, shopId, fcId);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public List<SafelunchWorkLinePO> getSafeLunchWorkLine(Integer fcId) {
		SafelunchWorkLinePOExample workLineExample = new SafelunchWorkLinePOExample();
		workLineExample.createCriteria().andFcIdEqualTo(fcId);

		List<SafelunchWorkLinePO> workLineList = this.safelunchWorklinePoDao.selectByExample(workLineExample);
		return workLineList;
	}

	@Override

	public Map<String, Object> boxMaterialUseInfo(Integer lineId, String beginTime, String endTime, String prodCode,
			String matProdCode, String boxCode, String matBoxCode, Integer pageNum, Integer pageSize, String furnaceNo,
			String batchNo) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List<Map<String, Object>> dataList = this.prodBoxMaterialDao.boxMaterialUseInfo(lineId, beginTime, endTime,
				prodCode, matProdCode, boxCode, matBoxCode, furnaceNo, batchNo);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	public Map<String, Object> getOrderDetail(Integer lineId, Integer shopId, Integer fcId, String prodCode,
			String prodNumber, String poCode, String beginTime, String endTime, Integer pageNum, Integer pageSize) {
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();

		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("line_id", lineId);
		paramMap.put("shopId", shopId);
		paramMap.put("fcId", fcId);
		paramMap.put("order_code", poCode);
		paramMap.put("starDate", beginTime);
		paramMap.put("endDate", endTime);
		paramMap.put("prodCode", prodCode);
		paramMap.put("prodNumber", prodNumber);

		List<PlanOrderPO> dataList = planOrderDao.queryPlanVO(paramMap);

		for (PlanOrderPO dataObject : dataList) {
			Map<String, Object> resultMap = getOrderData(dataObject.getPoCode(), dataObject.getLineId());

			resultMap.put("orderData", dataObject);

			resultList.add(resultMap);
		}

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;

	}

	public Map<String, Object> getOrderData(String poCode,Integer lineId) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		// 上料数量
		// 装配上料数量
		double chargCount = 0;
		double completeCount = 0;
		double wasteCount = 0;
		double cleanCount = 0;
		double outSourceCount = 0;
		
		//类型 1装配上料，2机加上料
		int type = 1;
		
		//判断产线类型
		SysLineProdmodelPOExample modelExample = new SysLineProdmodelPOExample();
		modelExample.createCriteria().andLineIdEqualTo(lineId);
		List<SysLineProdmodelPO> modelList = this.LineProdModelDao.selectByExample(modelExample);
		
		if(modelList.size() > 0){
			String model = modelList.get(0).getProdModel();
			
			if(model.equals("cv_assy") || model.equals("sec_assy")){
				//读取工单库存表
				ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
				orderStockExample.createCriteria().andPoCodeEqualTo(poCode);
				
				List<ProdOrderStockPO> prodOrderStockList = this.prodOrderStockDao.selectByExample(orderStockExample);
				for(ProdOrderStockPO data:prodOrderStockList){
					chargCount += data.getBoxQuan().doubleValue();
				}
				type = 1;
			}else{
				//读取工序库存表
				ProdProcessStockPOExample prodProcessStockExampel = new ProdProcessStockPOExample();
				prodProcessStockExampel.createCriteria().andPoCodeEqualTo(poCode);
				
				List<ProdProcessStockPO> prodProcessStockList = this.prodProcessStockDao.selectByExample(prodProcessStockExampel);
				
				for(ProdProcessStockPO data:prodProcessStockList){
					chargCount += data.getBoxQuan().doubleValue();
				}
				type = 2;

			}
			
		}

		// 报交数量
		ProdBoxLogPOExample prodBoxLogExample = new ProdBoxLogPOExample();
		prodBoxLogExample.createCriteria().andPoCodeEqualTo(poCode);

		List<ProdBoxLogPO> prodBoxLogList = prodBoxLogDao.selectByExample(prodBoxLogExample);

		for (ProdBoxLogPO data : prodBoxLogList) {
			completeCount += data.getBoxQuan().doubleValue();
		}

		// 清线数量 //委外数量
		ProdCleanLogPOExample prodClanLogExample = new ProdCleanLogPOExample();
		prodClanLogExample.createCriteria().andPoCodeEqualTo(poCode);

		List<ProdCleanLogPO> prodCleanLogList = this.prodCleanLogPoDao.selectByExample(prodClanLogExample);

		for (ProdCleanLogPO data : prodCleanLogList) {
			if (data.getIsOutsource()) {
				outSourceCount += data.getClRestCount().doubleValue();
			} else {
				cleanCount += data.getClRestCount().doubleValue();
			}

		}

		// 不合格品数量
		NonconformProductLogPOExample nonconformProductExample = new NonconformProductLogPOExample();
		nonconformProductExample.createCriteria().andPoCodeEqualTo(poCode);

		List<NonconformProductLogPO> wasteList = this.nonconformProductDao.selectByExample(nonconformProductExample);

		for (NonconformProductLogPO data : wasteList) {
			wasteCount += data.getNplQty().doubleValue();
		}

		resultMap.put("modelType", type);
		resultMap.put("chargCount", chargCount);
		resultMap.put("completeCount", completeCount);
		resultMap.put("wasteCount", wasteCount);
		resultMap.put("cleanCount", cleanCount);
		resultMap.put("outSourceCount", outSourceCount);

		return resultMap;
	}

	@Override
	public Map<String, Object> getOrderDetailInfoByType(String poCode, Integer type, Integer pageNum,
			Integer pageSize) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		List resultList = new ArrayList();

		// type 1.上料记录， 2.报交数量，3清线记录，4委外记录,5.不合格品记录
		if (type == 1) {
			ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
			orderStockExample.createCriteria().andPoCodeEqualTo(poCode);

			resultList = this.prodOrderStockDao.selectByExample(orderStockExample);
		} else if (type == 2) {
			ProdBoxLogPOExample prodBoxLogExample = new ProdBoxLogPOExample();
			prodBoxLogExample.createCriteria().andPoCodeEqualTo(poCode);

			resultList = prodBoxLogDao.selectByExample(prodBoxLogExample);
		} else if (type == 3) {
			ProdCleanLogPOExample prodClanLogExample = new ProdCleanLogPOExample();
			prodClanLogExample.createCriteria().andPoCodeEqualTo(poCode).andIsOutsourceEqualTo(false);

			resultList = this.prodCleanLogPoDao.selectByExample(prodClanLogExample);
		} else if (type == 4) {
			ProdCleanLogPOExample prodClanLogExample = new ProdCleanLogPOExample();
			prodClanLogExample.createCriteria().andPoCodeEqualTo(poCode).andIsOutsourceEqualTo(true);

			resultList = this.prodCleanLogPoDao.selectByExample(prodClanLogExample);
		} else if (type == 5) {
			NonconformProductLogPOExample nonconformProductExample = new NonconformProductLogPOExample();
			nonconformProductExample.createCriteria().andPoCodeEqualTo(poCode);

			resultList = this.nonconformProductDao.selectByExample(nonconformProductExample);
		}

		PageInfo info = new PageInfo(resultList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getCleanInfo(Integer fcId, Integer shopId, Integer lineId, String poCode,
			String prodCode, String prodNumber, String matProdCode, String matProdNumber, String boxCode,
			String matBoxCode, String beginTime, String endTime, String type, Integer pageNum, Integer pageSize) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);

		boolean searchType = false;
		if (type.equals("1")) {
			searchType = false;
		} else {
			searchType = true;
		}

		List<Map<String, Object>> dataList = this.prodCleanLogPoDao.getCleanLog(fcId, shopId, lineId, poCode, prodCode,
				prodNumber, matProdCode, matProdNumber, boxCode, matBoxCode, beginTime, endTime, searchType);

		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

}
