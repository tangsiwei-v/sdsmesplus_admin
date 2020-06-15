package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
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
import com.uspring.sdsmesplus.dao.ProductReplaceDao;
import com.uspring.sdsmesplus.dao.SafelunchOrderDao;
import com.uspring.sdsmesplus.dao.SysLogDao;
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
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.entity.vo.StockStat;
import com.uspring.sdsmesplus.service.MongoDBService;
import com.uspring.sdsmesplus.service.OrderService;
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
	
	@Autowired
	private PlanOrderDao planDao;
	
	@Autowired
	private ProductReplaceDao productReplaceDao;
	
	@Autowired
	private SysLogDao sysLogdao;
	

	@Override
	public Map<String, Object> getProductInfo(String barcode,String prodCode) {
		Map<String, Object> resultMap = this.prodFinishDao.getProductInfo(barcode, prodCode);
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
	public Map<String, Object> getProductList(HttpServletResponse response,Integer lineId, String boxCode, String barcode, String tuhao,
			String prodCode, String prodNumber, String poCode, String beginTime, String endTime, Integer pageNum,
			Integer pageSize, Integer shopId, Integer fcId, Integer isExport) {
		
		
		if(lineId != null && lineId == 161){
			shopId = null;
			fcId = null;
			lineId = 42281;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		ProdFinishedProductPOExample prodExample = new ProdFinishedProductPOExample();
		ProdFinishedProductPOExample.Criteria criteria = prodExample.createCriteria();

		PageHelper page = new PageHelper();
		
		//是否分页显示
		if(isExport == 0){
			page.startPage(pageNum, pageSize);
		}
		List<Map<String, Object>> resultList = this.prodFinishDao.getProductList(lineId, boxCode, barcode, tuhao,
				prodCode, prodNumber, poCode, beginTime, endTime, shopId, fcId);
        
		//是否导出
		if(isExport != 0){
			if(isExport == 1){
				exportProductInfo(resultList,response);
			}else if(isExport == 2){
				List<String> titleList = new ArrayList<String>();
				titleList.add("产品总成码");
				titleList.add("箱号");
				titleList.add("工单号");
				titleList.add("装箱时间");
				titleList.add("描述");
				titleList.add("SAP号");
				titleList.add("总成简码");
				titleList.add("图号");
				titleList.add("工厂");
				titleList.add("车间");
				titleList.add("产线");
				
				List<String> columnList = new ArrayList<String>();
				columnList.add("fp_barcode");
				columnList.add("box_barcode");
				columnList.add("po_code");
				columnList.add("create_time");
				columnList.add("prod_name");
				columnList.add("prod_code");
				columnList.add("prod_number");
				columnList.add("prod_tuhao");
				columnList.add("fc_name");
				columnList.add("shop_name");
				columnList.add("line_name");
				
				ExportXls.exportXls(resultList, response, titleList, columnList, "总成查询");
			}
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
			Integer pageNum, Integer pageSize, Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		List<Map<String, Object>> dataList = this.productMaterialDao.useMaterialInfo(fpBarcode, materialCode, batchNo,
				furnaceNo, prodCode, materialBoxCode, beginTime, endTime);

		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("产品总成号");
			titleList.add("总成箱合格证");
			titleList.add("物料箱合格证");
			titleList.add("物料名称");
			titleList.add("物料号");
			titleList.add("物料批次号");
			titleList.add("炉号");
			titleList.add("使用量");
			titleList.add("绑定时间");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("fp_barcode");
			columnList.add("box_barcode");
			columnList.add("mat_box_barcode");
			columnList.add("mat_name");
			columnList.add("mat_code");
			columnList.add("mat_batch_no");
			columnList.add("mat_furnace_no");
			columnList.add("mat_count");
			columnList.add("create_time");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "总成使用查询");
	    }
		
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
			Integer pageSize, Integer isCleaned, Integer shopId, Integer fcId, Integer vsmId, Integer isExprot,HttpServletResponse response) {

		List<StockStat> stockList = new ArrayList<StockStat>();
		
		Map<String, Object> orderParam = new HashMap<String, Object>();
		orderParam.put("vsmId", vsmId);
		orderParam.put("line_id", lineId);
		List<String> status = new ArrayList<String>();
		status.add("Executing");
		orderParam.put("statusList", status);
		List<PlanOrderPO> orderList = planDao.queryPlanVO(orderParam);
		
		List<String> poCodes = new ArrayList<String>();
		for(int i = 0; i < orderList.size(); i++){
			poCodes.add(orderList.get(i).getPoCode());
		}
//		if (lineId != null) {
//			SysLineProdmodelPOExample modelExample = new SysLineProdmodelPOExample();
//			SysLineProdmodelPOExample.Criteria criteria = modelExample.createCriteria();
//			criteria.andLineIdEqualTo(lineId);
//			modelExample.createCriteria().andLineIdEqualTo(lineId);
//			List<SysLineProdmodelPO> modelList = this.LineProdModelDao.selectByExample(modelExample);
//
//			if (modelList.size() > 0) {
//				String model = modelList.get(0).getProdModel();
//				if (model.equals("cv_assy") || model.equals("sec_assy")) {
//					stockList = prodOrderStockDao.statOrderStock(lineId, poCode, matProdCode, boxCode, isCleaned,
//							shopId, fcId, beginTime, endTime, vsmId, poCodes);
//					stockList.addAll(prodOrderStockDao.statCleanStock(lineId, poCode, matProdCode, boxCode, procCode,
//							shopId, fcId, beginTime, endTime, poCodes));
//				} else {
//					stockList = prodOrderStockDao.statProcStock(lineId, poCode, matProdCode, boxCode, procCode,
//							isCleaned, shopId, fcId, beginTime, endTime, vsmId, poCodes);
//					stockList.addAll(prodOrderStockDao.statWipStock(lineId, poCode, matProdCode, boxCode, procCode, shopId,
//							fcId, beginTime, endTime, vsmId, poCodes));
//					stockList.addAll(prodOrderStockDao.statCleanStock(lineId, poCode, matProdCode, boxCode, procCode,
//							shopId, fcId, beginTime, endTime, poCodes));
//				}
//				stockList.addAll(prodOrderStockDao.statNonconform(lineId, poCode, matProdCode, boxCode, procCode,
//						shopId, fcId, beginTime, endTime, vsmId, poCodes));
//			}
//		} else {

		stockList = prodOrderStockDao.statOrderStock(lineId, poCode, matProdCode, boxCode, isCleaned, shopId, fcId,
				beginTime, endTime, vsmId, poCodes);
		stockList.addAll(prodOrderStockDao.statProcStock(lineId, poCode, matProdCode, boxCode, procCode, isCleaned,
				shopId, fcId, beginTime, endTime, vsmId, poCodes));
		stockList.addAll(prodOrderStockDao.statWipStock(lineId, poCode, matProdCode, boxCode, procCode, shopId,
				fcId, beginTime, endTime, vsmId, poCodes));
		stockList.addAll(prodOrderStockDao.statNonconform(lineId, poCode, matProdCode, boxCode, procCode,
				shopId, fcId, beginTime, endTime, vsmId, poCodes));
		stockList.addAll(prodOrderStockDao.statCleanStock(lineId, poCode, matProdCode, boxCode, procCode,
				shopId, fcId, beginTime, endTime, vsmId, poCodes));
		stockList.addAll(prodOrderStockDao.statBoxLogStock(lineId, poCode, matProdCode, boxCode, procCode,
				shopId, fcId, beginTime, endTime, vsmId, poCodes));

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
		
		//导出
		if(isExprot == 1){
			List<Object> objList = new ArrayList<Object>();
			for(StockStat stockStat:resultList){
				objList.add(stockStat);
			}
			
			List<Map<String,Object>> historyData = ExportXls.entityListToMapList(objList);
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号");
			titleList.add("工序号");
			titleList.add("箱号");
			titleList.add("物料号");
			titleList.add("物料名称");
			titleList.add("批次号");
			titleList.add("炉号");
			titleList.add("档位");
			titleList.add("数量");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("poCode");
			columnList.add("procCode");
			columnList.add("boxBarcode");
			columnList.add("matCode");
			columnList.add("matName");
			columnList.add("batchNo");
			columnList.add("furnaceNo");
			columnList.add("glevel");
			columnList.add("matCount");
			
			String fileName = "上料记录查询";
			if(isCleaned == 0){
				fileName = "线上库存报表";
			}
			ExportXls.exportXls(historyData, response, titleList, columnList, fileName);
		}
		

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
			String poCode, Integer shopId, Integer fcId, Integer isExport,HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		
		List<Map<String, Object>> dataList = this.noConformProductDao.getWasteProd(lineId, prodCode, prodNumber,
				beginTime, endTime, matProdCode, matProdNumber, status, poCode, shopId, fcId);

		if(isExport == 1){
			for(Map<String,Object> dataMap:dataList){
				String type = "";
				if(dataMap.get("npl_status").equals("Entering")){
					type = "录入";
				}else if(dataMap.get("npl_status").equals("Isolation")){
					type = "隔离";
				}else if(dataMap.get("npl_status").equals("Cancel")){
					type = "作废";
				}
				dataMap.put("type", type);
				
				String isDebug = "";
				if(dataMap.get("npl_is_test_part").toString().equals("true")){
					isDebug = "是";
				}else if(dataMap.get("npl_is_test_part").toString().equals("false")){
					isDebug = "否";
				}
				dataMap.put("isDebug", isDebug);
			}
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("不合格品编号");
			titleList.add("工单号");
			titleList.add("SAP号");
			titleList.add("图号");
			titleList.add("产品名称");
			titleList.add("发现工序");
			titleList.add("产生工序");
			titleList.add("工作中心");
			titleList.add("缺陷模式");
			titleList.add("缺陷模式名称");
			titleList.add("成本中心");
			titleList.add("缺陷数量");
			titleList.add("批产状态");
			titleList.add("是否调试件");
			titleList.add("设备编号");
			titleList.add("责任类型");
			titleList.add("状态");
			titleList.add("发现人");
			titleList.add("发现时间");
			titleList.add("确认人");
			titleList.add("产线");
			titleList.add("车间");
			titleList.add("工厂");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("npl_barcode");
			columnList.add("po_code");
			columnList.add("prod_code");
			columnList.add("prod_tuhao");
			columnList.add("prod_name");
			columnList.add("npl_find_op_name");
			columnList.add("npl_prod_op_name");
			columnList.add("npl_workcenter");
			columnList.add("npl_defect");
			columnList.add("npl_defect_desc");
			columnList.add("npl_cost_center");
			columnList.add("npl_qty");
			columnList.add("npl_batch_status");
			columnList.add("isDebug");
			columnList.add("npl_device_code");
			columnList.add("npl_duty_type");
			columnList.add("type");
			columnList.add("create_person_name");
			columnList.add("create_time");
			columnList.add("confirm_person_name");
			columnList.add("line_name");
			columnList.add("shop_name");
			columnList.add("fc_name");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "不合格品报表");
	    }
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getWasteProdMaterial(Integer lineId, String nplBarcode, String beginTime, String endTime,
			String matProdCode, String matProdNumber, Integer pageNum, Integer pageSize, Integer shopId, Integer fcId, Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		

		List<Map<String, Object>> dataList = this.noConformProductDao.getWasteProdMaterial(lineId, nplBarcode,
				beginTime, endTime, matProdCode, matProdNumber, shopId, fcId);

		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("不合格品编号");
			titleList.add("不合格零件编号");
			titleList.add("零件SAP号");
			titleList.add("零件简码");
			titleList.add("零件图号");
			titleList.add("零件名称");
			titleList.add("零件箱号");
			titleList.add("零件批次号");
			titleList.add("零件炉号");
			titleList.add("零件等级");
			titleList.add("零件数量");
			titleList.add("生成时间");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("npl_barcode");
			columnList.add("nplm_barcode");
			columnList.add("material_code");
			columnList.add("material_number");
			columnList.add("material_tuhao");
			columnList.add("material_name");
			columnList.add("material_box_code");
			columnList.add("material_batch_code");
			columnList.add("material_furnace_no");
			columnList.add("material_glevel");
			columnList.add("material_qty");
			columnList.add("create_time");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "不合格物料报表");
	    }
		
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
			Integer shopId, Integer fcId, Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		

		List<Map<String, Object>> dataList = this.safelunchOrderDao.getSafeLunch(lineId, poCode, prodCode, prodNumber,
				boxCode, beginTime, endTime, safelineId, shopId, fcId);

		//是否导出
		if(isExport == 1){
			
			for(Map<String,Object> dataMap:dataList){
				String isPass = "";
				if(dataMap.get("is_pass").toString().equals("true")){
					isPass = "是";
				}else if(dataMap.get("is_pass").toString().equals("false")){
					isPass = "否";
				}
				dataMap.put("isPass", isPass);
				
				String isCommit = "";
				if(dataMap.get("is_commit").toString().equals("true")){
					isCommit = "是";
				}else if(dataMap.get("is_commit").toString().equals("false")){
					isCommit = "否";
				}
				dataMap.put("isCommit", isCommit);
			}
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("safelunch编号");
			titleList.add("工单号");
			titleList.add("产品sap号");
			titleList.add("产品简码");
			titleList.add("产品图号");
			titleList.add("箱号");
			titleList.add("产品总数量");
			titleList.add("合格数量");
			titleList.add("异常数量");
			titleList.add("是否提交");
			titleList.add("是否确认");
			titleList.add("确认人");
			titleList.add("safelunch线");
			titleList.add("时间");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("safelunch_order");
			columnList.add("po_code");
			columnList.add("prod_code");
			columnList.add("prod_number");
			columnList.add("prod_tuhao");
			columnList.add("box_barcode");
			columnList.add("product_count");
			columnList.add("pass_count");
			columnList.add("failed_count");
			columnList.add("isPass");
			columnList.add("isCommit");
			columnList.add("check_person_name");
			columnList.add("safline_name");
			columnList.add("update_time");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "safelunch检验记录");
	    }
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getSafeLunchDetail(Integer lineId, String poCode, String prodCode, String prodNumber,
			String boxCode, String beginTime, String endTime, String safeLunchOrder, Integer pageNum, Integer pageSize,
			Integer safelineId, String fpBarcode, Integer shopId, Integer fcId, Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}

		List<Map<String, Object>> dataList = this.safelunchOrderDao.getSafeLunchDetail(lineId, poCode, prodCode,
				prodNumber, boxCode, beginTime, endTime, safeLunchOrder, safelineId, fpBarcode, shopId, fcId);

		//是否导出
		if(isExport == 1){
			
			for(Map<String,Object> dataMap:dataList){
				String isPass = "否";
				if(dataMap.get("is_pass").toString().equals("true")){
					isPass = "是";
				}
				dataMap.put("isPass", isPass);
			}
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单编号 ");
			titleList.add("safelunch");
			titleList.add("总成条码");
			titleList.add("产品SAP号");
			titleList.add("产品简码");
			titleList.add("产品名称");
			titleList.add("箱号");
			titleList.add("是否通过");
			titleList.add("时间");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("po_code");
			columnList.add("safelunch_order");
			columnList.add("fp_barcode");
			columnList.add("prod_code");
			columnList.add("prod_number");
			columnList.add("prod_name");
			columnList.add("box_barcode");
			columnList.add("isPass");
			columnList.add("update_time");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "safelunch检验详情");
	    }
		
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
			String batchNo, Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		
		List<Map<String, Object>> dataList = this.prodBoxMaterialDao.boxMaterialUseInfo(lineId, beginTime, endTime,
				prodCode, matProdCode, boxCode, matBoxCode, furnaceNo, batchNo);

		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("箱合格证");
			titleList.add("物料箱合格证");
			titleList.add("SAP号");
			titleList.add("物料号");
			titleList.add("物料名称");
			titleList.add("物料批次号");
			titleList.add("炉号");
			titleList.add("使用量");
			titleList.add("绑定时间");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("box_barcode");
			columnList.add("mat_box_barcode");
			columnList.add("prodCode");
			columnList.add("mat_code");
			columnList.add("matName");
			columnList.add("mat_batch_no");
			columnList.add("mat_furnace_no");
			columnList.add("mat_count");
			columnList.add("create_time");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "箱物料使用查询");
		}
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	public Map<String, Object> getOrderDetail(Integer lineId, Integer shopId, Integer fcId, String prodCode,
			String prodNumber, String poCode, String beginTime, String endTime, Integer pageNum, Integer pageSize, Integer isExport, HttpServletResponse response) {
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();

		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		
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
		if(isExport == 1){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for(Map<String,Object> dataMap:resultList){
				if(dataMap.get("orderData") != null){
					PlanOrderPO planOrderPO = (PlanOrderPO) dataMap.get("orderData");
					dataMap.put("poCode", planOrderPO.getPoCode());
					dataMap.put("prodCode", planOrderPO.getProdCode());
					dataMap.put("prodNumber", planOrderPO.getProdNumber());
					dataMap.put("prodTuhao", planOrderPO.getProdTuhao());
					dataMap.put("prodName", planOrderPO.getProdName());
					String status = "";
					if(planOrderPO.getPoStatus().equals("Assigned")){
						status = "下达";
					}else if(planOrderPO.getPoStatus().equals("Executing")){
						status = "执行";
					}else if(planOrderPO.getPoStatus().equals("Frozen")){
						status = "冻结";
					}else if(planOrderPO.getPoStatus().equals("Completed")){
						status = "完成";
					}
					dataMap.put("poStatus", status);
					dataMap.put("poStartDatetime", df.format(planOrderPO.getPoStartDatetime()));
					dataMap.put("poCount", planOrderPO.getPoCount());
					dataMap.put("lineName", planOrderPO.getLineName());
					dataMap.put("shopName", planOrderPO.getShopName());
					dataMap.put("fcName", planOrderPO.getFcName());
				}
			}
			
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号");
			titleList.add("产品SAP号");
			titleList.add("产品简码");
			titleList.add("图号");
			titleList.add("产品名称");
			titleList.add("状态");
			titleList.add("计划日期");
			titleList.add("计划数量");
			titleList.add("上料数量");
			titleList.add("报交数量");
			titleList.add("清线数量");
			titleList.add("委外数量");
			titleList.add("不合格数量");
			titleList.add("产线");
			titleList.add("车间");
			titleList.add("工厂");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("poCode");
			columnList.add("prodCode");
			columnList.add("prodNumber");
			columnList.add("prodTuhao");
			columnList.add("prodName");
			columnList.add("poStatus");
			columnList.add("poStartDatetime");
			columnList.add("poCount");
			columnList.add("chargCount");
			columnList.add("completeCount");
			columnList.add("cleanCount");
			columnList.add("outSourceCount");
			columnList.add("wasteCount");
			columnList.add("lineName");
			columnList.add("shopName");
			columnList.add("fcName");
			
			ExportXls.exportXls(resultList, response, titleList, columnList, "工单详情报表");
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
			String matBoxCode, String beginTime, String endTime, String type, Integer pageNum, Integer pageSize,
			Integer isExport, HttpServletResponse response) {
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}

		boolean searchType = false;
		String fileName = "";
		if (type.equals("1")) {
			searchType = false;
			fileName = "清线报表";
		} else {
			searchType = true;
			fileName = "委外报表";
		}

		List<Map<String, Object>> dataList = this.prodCleanLogPoDao.getCleanLog(fcId, shopId, lineId, poCode, prodCode,
				prodNumber, matProdCode, matProdNumber, boxCode, matBoxCode, beginTime, endTime, searchType);

		//是否导出
		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号");
			titleList.add("SAP号");
			titleList.add("总成简码");
			titleList.add("描述");
			titleList.add("物料SAP号");
			titleList.add("物料简码");
			titleList.add("描述");
			titleList.add("旧箱合格证");
			titleList.add("新箱合格证");
			titleList.add("前线时间");
			titleList.add("工厂");
			titleList.add("车间");
			titleList.add("产线");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("po_code");
			columnList.add("prod_code");
			columnList.add("prod_number");
			columnList.add("prod_name");
			columnList.add("mat_code");
			columnList.add("mat_number");
			columnList.add("mat_name");
			columnList.add("box_barcode_old");
			columnList.add("box_barcode_new");
			columnList.add("create_time");
			columnList.add("fc_name");
			columnList.add("shop_name");
			columnList.add("line_name");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, fileName);
	    }
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getProductReplace(Integer fcId, Integer shopId, Integer lineId, String poCode,
			String prodCode, String beginTime, String endTime, Integer pageNum, Integer pageSize,
			Integer isExport, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}

		List<Map<String, Object>> dataList = this.productReplaceDao.getProductReplace(lineId, prodCode, poCode, beginTime, endTime, shopId, fcId);

		//是否导出
		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号");
			titleList.add("SAP号");
			titleList.add("旧条码");
			titleList.add("新条码");
			titleList.add("时间");
			titleList.add("产线");
			titleList.add("车间");
			titleList.add("工厂");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("po_code");
			columnList.add("prod_code");
			columnList.add("fp_barcode_old");
			columnList.add("fp_barcode_new");
			columnList.add("create_time");
			columnList.add("line_name");
			columnList.add("shop_name");
			columnList.add("fc_name");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "总成替换查询");
	    }
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getOperaLog(Integer fcId, Integer shopId, Integer lineId, String poCode, String empName,
			String empNumber, String note, String beginTime, String endTime, String logType, Integer pageNum,
			Integer pageSize, Integer isExport, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}

		List<Map<String, Object>> dataList = this.sysLogdao.getSysLog(fcId, shopId, lineId, poCode,logType, empName, empNumber, note, beginTime, endTime);
				
		for(Map<String, Object> dataMap:dataList){
			if(dataMap.get("log_type").toString().equals("unqlty")){
				dataMap.put("logType", "不合格品");
			}else if(dataMap.get("log_type").toString().equals("package")){
				dataMap.put("logType", "装箱");
			}else if(dataMap.get("log_type").toString().equals("order")){
				dataMap.put("logType", "工单");
			}else if(dataMap.get("log_type").toString().equals("wipbox")){
				dataMap.put("logType", "过程码");
			}else if(dataMap.get("log_type").toString().equals("outsourcing")){
				dataMap.put("logType", "委外");
			}
		}
		
		//是否导出
		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号");
			titleList.add("日志类型");
			titleList.add("详情");
			titleList.add("操作工号");
			titleList.add("操作人");
			titleList.add("备注");
			titleList.add("时间");
			titleList.add("工厂");
			titleList.add("车间");
			titleList.add("产线");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("po_code");
			columnList.add("logType");
			columnList.add("log_note");
			columnList.add("log_emp_number");
			columnList.add("log_emp_name");
			columnList.add("log_remarks");
			columnList.add("create_time");
			columnList.add("fc_name");
			columnList.add("shop_name");
			columnList.add("line_name");
			
			ExportXls.exportXls(dataList, response, titleList, columnList, "日志查询");
	    }
		
		PageInfo info = new PageInfo(dataList);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", dataList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public Map<String, Object> getBoxList(Integer lineId, String boxCode, String tuhao, String prodCode,
			String prodNumber, String beginTime, String endTime, String poCode, Integer vsmId, Integer fcId,
			String prodBatchCode, String prodTraceCode, String boxareaCode, Integer isOverSubmit, Integer isWip,
			Integer isOutsource, Integer isDeleted, Integer isConfirmed, Integer pageNum, Integer pageSize,
			Integer isExport, HttpServletResponse response) {
		
		PageHelper page = new PageHelper();
		//是否分页显示
		if(isExport != 1){
			page.startPage(pageNum, pageSize);
		}
		List<Map<String, Object>> resultList = this.prodBoxLogDao.getBoxList(lineId, boxCode, tuhao, prodCode, prodNumber, beginTime, endTime,
				poCode, vsmId, fcId, prodBatchCode, prodTraceCode, boxareaCode, isOverSubmit, isWip, isOutsource, isDeleted, isConfirmed);
		//是否导出
		if(isExport == 1){
			List<String> titleList = new ArrayList<String>();
			titleList.add("成品箱号");
			titleList.add("满箱时间");
			titleList.add("装箱数量");
			titleList.add("成品SAP号");
			titleList.add("批次号");
			titleList.add("总成简码");
			titleList.add("图号");
			titleList.add("工单号");
			titleList.add("工段");
			titleList.add("产线");
			titleList.add("工厂");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("box_barcode");
			columnList.add("create_time");
			columnList.add("box_quan");
			columnList.add("prod_code");
			columnList.add("prod_batch_code");
			columnList.add("prod_number");
			columnList.add("prod_tuhao");
			columnList.add("po_code");
			columnList.add("vsm_name");
			columnList.add("line_name");
			columnList.add("fc_name");
			
			ExportXls.exportXls(resultList, response, titleList, columnList, "箱合格证查询");
	    }
		
		PageInfo info = new PageInfo(resultList);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

}
