package com.uspring.sdsmesplus.barcode;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.context.SecurityContextHolder;

import com.alibaba.fastjson.JSONObject;
import com.uspring.sdsmesplus.barcode.soap.ArrayOfCBBC;
import com.uspring.sdsmesplus.barcode.soap.ArrayOfCleanLineNewBoxBarCode;
import com.uspring.sdsmesplus.barcode.soap.ArrayOfCleanLineOldBoxBarCode;
import com.uspring.sdsmesplus.barcode.soap.CBBC;
import com.uspring.sdsmesplus.barcode.soap.CleanLineNewBoxBarCode;
import com.uspring.sdsmesplus.barcode.soap.CleanLineOldBoxBarCode;
import com.uspring.sdsmesplus.barcode.soap.EnumBBCType;
import com.uspring.sdsmesplus.barcode.soap.FinishedProductBoxBarCode;
import com.uspring.sdsmesplus.barcode.soap.MaterialPullService;
import com.uspring.sdsmesplus.barcode.soap.MaterialPullServiceSoap;
import com.uspring.sdsmesplus.barcode.soap.PDAWebService;
import com.uspring.sdsmesplus.barcode.soap.PDAWebServiceSoap;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.enums.SafeLunchResult;
import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.BatchCodeRequest;
import com.uspring.sdsmesplus.wms.entity.CleanType;
import com.uspring.sdsmesplus.wms.entity.MaterialCallRequest;
import com.uspring.sdsmesplus.wms.entity.MaterialSubmitHelper;
import com.uspring.sdsmesplus.wms.entity.MoveStockHelpDo;
import com.uspring.sdsmesplus.wms.entity.NonConformIsolationInfo;
import com.uspring.sdsmesplus.wms.entity.Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Version 1.0
 * @Description:
 * @Author: Chengtengfei
 * @date 2019/7/30 9:59
 */

public class BarCodeServiceImpl implements WMSService {
	@Autowired
	private Mapper dozerMapper;

	@Value("#{prop.barcode_address}")
	private String BarcodeAddress;
	
	@Autowired
	private SysLinePODao sysLinePODao;

	private static Logger logger = LoggerFactory.getLogger(BarCodeServiceImpl.class);// slf4j日志记录器

	@Override
	public List<Package> queryHuInfo(String huCode) {
		logger.info("开始调用条码系统获取箱条码信息接口入参" + JSONObject.toJSONString(huCode));
		PDAWebServiceSoap soap = (PDAWebServiceSoap) new PDAWebService();
		List<Package> packs = new ArrayList<Package>();
		CBBC bbcInfo = soap.getBBCInfo(huCode);
		if (bbcInfo == null) {
			ArrayOfCBBC bbcByPLDNo = soap.getBBCByPLDNo(huCode);
			logger.info("调条码系统获取箱条码信息接口获取的结果" + JSONObject.toJSONString(bbcByPLDNo));
			for (CBBC cbbc : bbcByPLDNo.getCBBC()) {
				Package pack = dozerMapper.map(cbbc, Package.class);
				packs.add(pack);

			}
			return packs;
		}
		logger.info("调条码系统获取箱条码信息接口获取的结果" + JSONObject.toJSONString(bbcInfo));
		Package pack = dozerMapper.map(bbcInfo, Package.class);
		packs.add(pack);
		return packs;
	}

	@Override
	public String feedBox(Package boxLog, MoveStockHelpDo move, String ordercode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBatchCode(PlanOrderPO plan, BatchCodeRequest batchReq) {
		logger.info("开始调用条码系统获取箱条码信息接口");
		final String url = "GetAssemblingProductNo?";
		Map<String, Object> parmas = new HashMap<>();
		// TODO  工厂
		parmas.put("strSite", plan.getFcCode());
		// 零件
		parmas.put("strPart", batchReq.getMaterialCode());
		// 询问日期格式
		parmas.put("strDate", new Date().toString());
		parmas.put("strCustomerNo", batchReq.getCustomerCode());
		SysLinePOExample linEx = new SysLinePOExample();
		linEx.createCriteria().andLineIdEqualTo(plan.getLineId());
		SysLinePO sysLinePO = sysLinePODao.selectByExample(linEx).get(0);
		parmas.put("strLineId",sysLinePO.getLineBarcodeId());
		logger.info("开始调用条码系统获取箱条码信息接口入参" + JSONObject.toJSONString(parmas)+"地址为"+ BarcodeAddress+url);
		String BatchCode = HTTPUtils.SendPost(BarcodeAddress+url, parmas);
		logger.info("获取批次号出参" + BatchCode);
		return BatchCode;
	}

	@Override
	@Async
	public void submitProdBox(PlanOrderPO plan, Package sub, String processCode, String workStation,
			List<MaterialSubmitHelper> dtz) {
		logger.info("开始调用条码系统保交接口");
		MaterialPullServiceSoap materPull = (MaterialPullServiceSoap) new MaterialPullService();
		FinishedProductBoxBarCode FinshboxBarCode = dozerMapper.map(plan, FinishedProductBoxBarCode.class);
		String type = sub.getBoxBarcode().substring(0, 2);
		FinshboxBarCode.setBBCType(EnumBBCType.valueOf(type));
		FinshboxBarCode.setMsgNo("pop");
		FinshboxBarCode.setBomCode(sub.getBoxBarcode());
		FinshboxBarCode.setProduceNo(sub.getMatBatchNo());
		FinshboxBarCode.setFurnaceNo(sub.getMatFurnaceNo());
		FinshboxBarCode.setGrade(sub.getMatGlevel());
		FinshboxBarCode.setQty(sub.getBoxQuan().intValue());
		FinshboxBarCode.setBomVersion("");
		FinshboxBarCode.setOP("66661");
		//  当前登录人工号
		UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		FinshboxBarCode.setOpUserAccount(user.getEmpNumber());
		// FinshboxBarCode.setOpUserAccount("测试人");
		FinshboxBarCode.setBomCode(sub.getMatCode());
		// FinshboxBarCode.setOpUserAccount(sub.getBoxInspector());
		logger.info("调用条码系统保交信息接口入参" + JSONObject.toJSONString(FinshboxBarCode));
		FinishedProductBoxBarCode finishedProductSubmit = materPull.finishedProductSubmit(FinshboxBarCode);
	}

	@Override
	public List<Package> cleanLineStock(PlanOrderPO plan, CleanType clean, List<Package> cleanHelpDos) throws Exception {
		logger.info("调用条码系统清线接口");
		SysLinePOExample linEx = new SysLinePOExample();
		linEx.createCriteria().andLineIdEqualTo(plan.getLineId());
		SysLinePO sysLinePO = sysLinePODao.selectByExample(linEx).get(0);

		MaterialPullServiceSoap materPull = (MaterialPullServiceSoap) new MaterialPullService();
		ArrayOfCleanLineOldBoxBarCode arrcleans = new ArrayOfCleanLineOldBoxBarCode();
		List<CleanLineOldBoxBarCode> cleanOldCodes = new ArrayList<>();
		for (Package packag : cleanHelpDos) {
			CleanLineOldBoxBarCode cleanOldCode = dozerMapper.map(packag, CleanLineOldBoxBarCode.class);
			cleanOldCode.setLineClearReportNo(UUID.randomUUID().toString());
			cleanOldCode.setSite(plan.getFcCode());
			cleanOldCode.setLineId(sysLinePO.getLineBarcodeId());
			UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			cleanOldCode.setOpUserAccount(user.getEmpNumber());
			cleanOldCodes.add(cleanOldCode);
		}
		arrcleans.setCleanLineOldBoxBarCode(cleanOldCodes);
		logger.info("调用条码系统清线接口入参" + JSONObject.toJSONString(arrcleans));
		ArrayOfCleanLineNewBoxBarCode cleanLineReports = materPull.cleanLineReport(arrcleans);
		List<CleanLineNewBoxBarCode> cleanLineNewBoxBarCodes = cleanLineReports.getCleanLineNewBoxBarCode();
		List<Package> packs = new ArrayList<>();
		
		for(int i = 0; i < cleanOldCodes.size(); i++ ) {
		for (CleanLineNewBoxBarCode cleanLineNewBoxBarCode : cleanLineNewBoxBarCodes) {
			if(cleanOldCodes.get(i).getBoxBarCode().equals(cleanLineNewBoxBarCode.getOldBoxBarCode())) {
			Package pack = dozerMapper.map(cleanLineNewBoxBarCode, Package.class);
			packs.add(pack);
			}
		}
		}
		logger.info("调用条码系统清线接口出参" + JSONObject.toJSONString(packs));
		return packs;
	}

	@Override
	public List<Package> packageSplit(Package oldPkg, int splitCount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void safelunchJudge(Package pkg, SafeLunchResult resultType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void materialCall(List<MaterialCallRequest> requestes, String orderCode) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void closePlanOrder(PlanOrderVO order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void nonconformIsolate(List<NonConformIsolationInfo> isolations) {
		// TODO Auto-generated method stub

	}

}