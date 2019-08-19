package com.uspring.sdsmesplus.wms.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.ws.Holder;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.uspring.sdsmesplus.common.UUIDUtil;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.SafeLunchResult;
import com.uspring.sdsmesplus.enums.SubType;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.BatchCodeRequest;
import com.uspring.sdsmesplus.wms.entity.CleanType;
import com.uspring.sdsmesplus.wms.entity.MaterialCallRequest;
import com.uspring.sdsmesplus.wms.entity.MaterialSubmitHelper;
import com.uspring.sdsmesplus.wms.entity.MoveStockHelpDo;
import com.uspring.sdsmesplus.wms.entity.NonConformIsolationInfo;
import com.uspring.sdsmesplus.wms.entity.Package;
import com.uspring.sdsmesplus.wms.sap.f045.DTZSEAFKO;
import com.uspring.sdsmesplus.wms.sap.f045.DTZSEAFKOES;
import com.uspring.sdsmesplus.wms.sap.f045.DTZSRESBL;
import com.uspring.sdsmesplus.wms.sap.f045.SIEMS2EWMPPOrdersHoursAsyncOut;
import com.uspring.sdsmesplus.wms.sap.f045.SIEMS2EWMPPOrdersHoursAsyncOutService;
import com.uspring.sdsmesplus.wms.sap.f049.DTWIPTRANFINPUT;
import com.uspring.sdsmesplus.wms.sap.f049.DTWIPTRANFINPUT.ITINPUT;
import com.uspring.sdsmesplus.wms.sap.f049.DTWIPTRANFINPUTITEM;
import com.uspring.sdsmesplus.wms.sap.f049.SIMESSuspectIsolationOut;
import com.uspring.sdsmesplus.wms.sap.f049.SIMESSuspectIsolationOutService;
import com.uspring.sdsmesplus.wms.sap.f080.SISRMCreChargeOut;
import com.uspring.sdsmesplus.wms.sap.f080.SISRMCreChargeOutService;
import com.uspring.sdsmesplus.wms.sap.f080.ZMMICREATECHARG;
import com.uspring.sdsmesplus.wms.sap.f080.ZSMMCHARGINPUT;
import com.uspring.sdsmesplus.wms.sap.f113.DTSafeLaunch;
import com.uspring.sdsmesplus.wms.sap.f113.SIMESJudgeSafeLaunchOut;
import com.uspring.sdsmesplus.wms.sap.f113.SIMESJudgeSafeLaunchOutService;
import com.uspring.sdsmesplus.wms.sap.f128.DTGoodIssues;
import com.uspring.sdsmesplus.wms.sap.f128.DTGoodIssuesIsData;
import com.uspring.sdsmesplus.wms.sap.f128.SIMESGoodIssuesOut;
import com.uspring.sdsmesplus.wms.sap.f128.SIMESGoodIssuesOutService;
import com.uspring.sdsmesplus.wms.sap.f132.DTEWMIQX;
import com.uspring.sdsmesplus.wms.sap.f132.DTEWMIQXRT;
import com.uspring.sdsmesplus.wms.sap.f132.DTISDATA;
import com.uspring.sdsmesplus.wms.sap.f132.SIMESClearLineReportOut;
import com.uspring.sdsmesplus.wms.sap.f132.SIMESClearLineReportOutService;
import com.uspring.sdsmesplus.wms.sap.f133.DTGetHuData;
import com.uspring.sdsmesplus.wms.sap.f133.DTGetHuData.TDATA;
import com.uspring.sdsmesplus.wms.sap.f133.DTGetHuDataItem;
import com.uspring.sdsmesplus.wms.sap.f133.DTGetHuDataRT;
import com.uspring.sdsmesplus.wms.sap.f133.SIMESGetHuDetailsOut;
import com.uspring.sdsmesplus.wms.sap.f133.SIMESGetHuDetailsOutService;
import com.uspring.sdsmesplus.wms.sap.f241.DTMoveStockReq;
import com.uspring.sdsmesplus.wms.sap.f241.DTMoveStockReq.IWDATA;
import com.uspring.sdsmesplus.wms.sap.f241.DTMoveStockRet;
import com.uspring.sdsmesplus.wms.sap.f241.SIMESMoveStockOut;
import com.uspring.sdsmesplus.wms.sap.f241.SIMESMoveStockOutService;
import com.uspring.sdsmesplus.wms.sap.f245.DTUnpacking;
import com.uspring.sdsmesplus.wms.sap.f245.DTUnpackingItem;
import com.uspring.sdsmesplus.wms.sap.f245.SIMESUnpackingOut;
import com.uspring.sdsmesplus.wms.sap.f245.SIMESUnpackingOutService;


/**
 * * @author 作者 E-mail:chentengfei
 * 
 * @date 创建时间：2019年7月1日 下午4:42:38
 * @version 1.0 * @parameter
 * @since WMS实现类
 * @return
 */
@Service
public class WMSServiceImpl implements WMSService {

	private static Logger logger = LoggerFactory.getLogger(WMSServiceImpl.class);

	@Autowired
	private Mapper dozerMapper;

	@Override
	public List<Package> queryHuInfo(String huCode) {
		// 调用wms接口获取hu信息
		logger.info("开始wms接口获取hu信息"+huCode);
		SIMESGetHuDetailsOut sim = new SIMESGetHuDetailsOutService().getHTTPPort();
		DTGetHuData dt = new DTGetHuData();
		dt.setIVHU(huCode);
		DTGetHuData.TDATA t = new TDATA();
		dt.setTDATA(t);
		DTGetHuDataRT result = sim.siMESGetHuDetailsOut(dt);
		logger.info("调用箱条码信息出参" + JSONObject.toJSONString(result));
		if (result.getOVMESST().equals("E"))
			throw new ServiceException(result.getOVMESS());
		List<Package> packs = new ArrayList<Package>();
		List<DTGetHuDataItem> item = result.getTDATA().getITEM();
		for (DTGetHuDataItem dtGetHuDataItem : item) {
			Package packg = dozerMapper.map(dtGetHuDataItem, Package.class);
			if (dtGetHuDataItem.getVLENRH() != null)
				packg.setUpHu(dtGetHuDataItem.getVLENRH());
			packs.add(packg);
		}
		logger.info("结束wms接口获取hu信息：{}",JSONObject.toJSONString(packs));
		return packs;

	}

	@Override
	public String feedBox(Package boxLog, MoveStockHelpDo move, String ordercode) {
		// 调用wms接口进行移库
		logger.info("开始调用wms接口进行移库");
		SIMESMoveStockOut si = new SIMESMoveStockOutService().getHTTPPort();
		DTMoveStockReq dq = new DTMoveStockReq();

		IWDATA ia = new IWDATA();
		ia.setAUFNR(ordercode);
		ia.setCNAME(move.getCNNAME());
		ia.setLGNUM(boxLog.getMatWarehouseNum());
		ia.setMATNR("");// 总成物料编号，可随便传
		ia.setNLPLA(move.getNLPLA());
		ia.setNLTYP(move.getNLTYP());
		ia.setVLENR(boxLog.getBoxBarcode());

		if (!"".equals(boxLog.getAimBin())) {
			ia.setVLPLA(boxLog.getAimBin());
			ia.setVLTYP(boxLog.getAimBank());
		} else {
			ia.setVLPLA(boxLog.getNowBin());
			ia.setVLTYP(boxLog.getNowBank());
		}

		dq.setIWDATA(ia);
		logger.info("wms上料移库入参：{}",JSONObject.toJSONString(dq));
		DTMoveStockRet dt = si.siMESMoveStockOut(dq);
		// 1.HU不存在 2.移库成功 返回的是汉字
		if (dt.getCVMESST().equals("E"))
			throw new ServiceException(dt.getCVMESS());
		logger.info("wms上料移库出参：{}",JSONObject.toJSONString(dt));
		return dt.getCVMESS();
	}

	@Override
	public String getBatchCode(PlanOrderPO order,BatchCodeRequest batchReq) {
		logger.info("开始调用获取批次号");
		SISRMCreChargeOut si = new SISRMCreChargeOutService().getHTTPPort();
		ZSMMCHARGINPUT zs = null;
		List<ZSMMCHARGINPUT> zss = new ArrayList<ZSMMCHARGINPUT>();

		zs = dozerMapper.map(batchReq, ZSMMCHARGINPUT.class);
		zs.setZID("123132132");
		zs.setSYSID("MES");
		zss.add(zs);
		ZMMICREATECHARG zm = new ZMMICREATECHARG();
		ZMMICREATECHARG.ITHEAD it = new ZMMICREATECHARG.ITHEAD();
		it.setItem(zss);
		zm.setITHEAD(it);
		logger.info("wms获取条形码入参：{}",JSONObject.toJSONString(zm));
		String batchCode = si.siSRMCreChargeOut(zm).getETRETURN().getItem().get(0).getZNUMBER();
		logger.info("结束调用获取批次出参:{}" + batchCode);
		return batchCode;
	}

	@Async
	@Override
	public void submitProdBox(PlanOrderPO plan, Package sub, String processCode, String workStation,
			List<MaterialSubmitHelper> dtzs) {
		logger.info("开始调用报交接口");
		SIEMS2EWMPPOrdersHoursAsyncOut out = new SIEMS2EWMPPOrdersHoursAsyncOutService().getHTTPPort();
		DTZSEAFKOES zes = new DTZSEAFKOES();
		List<DTZSEAFKO> dts = new ArrayList<DTZSEAFKO>();

		DTZSEAFKO ze = dozerMapper.map(plan, DTZSEAFKO.class);
		Date t = new Date();
		SimpleDateFormat df = new SimpleDateFormat("HHmmss");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");
		ze.setEXIDV(sub.getBoxBarcode());
		ze.setZHIND(SubType.Sub.getCode());
		ze.setZGUID(UUIDUtil.getUUID());
		ze.setZEMPNO(sub.getBoxInspector());
		ze.setGLUZP(df.format(t));
		ze.setGLTRP(df1.format(t));
		ze.setVORNR(processCode);
		ze.setCHARG(sub.getMatBatchNo());
		ze.setZWSTATION(workStation);
		ze.setGAMNG("" + sub.getBoxQuan());

		ze.setVGW01("1000");
		ze.setVGW02("1001");

		List<DTZSRESBL> zsresbl = new ArrayList<>();
		for (MaterialSubmitHelper msh : dtzs) {
			DTZSRESBL dtzsr = dozerMapper.map(msh, DTZSRESBL.class);
			zsresbl.add(dtzsr);
		}
		ze.setZsresbl(zsresbl);
		dts.add(ze);
		zes.setZseafko(dts);
		logger.info("wms保交入参：{}",JSONObject.toJSONString(zes));
		out.siEMS2EWMPPOrdersHoursAsyncOut(zes);
		logger.info("结束调用报交接口");
	}

	@Override
	public List<Package> cleanLineStock(PlanOrderPO plan,CleanType clean, List<Package> cleanHelpDos) throws Exception {
		logger.info("开始调用清线接口");
		SIMESClearLineReportOut si = new SIMESClearLineReportOutService().getHTTPPort();
		DTEWMIQX.TDATA da = new DTEWMIQX.TDATA();

		List<DTISDATA> items = da.getITEM();
		for (Package pack : cleanHelpDos) {
			DTISDATA ds = dozerMapper.map(pack, DTISDATA.class);
			ds.setVLENR(pack.getBoxBarcode());
			items.add(ds);
		}
		DTEWMIQX dt = new DTEWMIQX();
		dt.setIVFLAG(clean.getCode());
		da.setItem(items);
		dt.setTDATA(da);
		// 调用wms接口
		logger.info("wms清线入参：{}",JSONObject.toJSONString(dt));
		DTEWMIQXRT dtBack = si.siMESClearLineReportOut(dt);
		logger.info("wms清线出参：{}",JSONObject.toJSONString(dtBack));
		List<DTISDATA> disds = dtBack.getTDATA().getITEM();
		List<Package> packs = new ArrayList<Package>();
		for(int i = 0;i < items.size();i++ ) {
		for (DTISDATA dtisdata : disds) {
			if(items.get(i).getNLENR().equals(dtisdata.getNLENR())) {
			Package pack = dozerMapper.map(dtisdata, Package.class);
			if (dtisdata.getMESST().equals("E"))
				pack.setBoxBarcode("E");
			packs.add(pack);
		}
		}
		}
		logger.info("清线接口:{}" + packs.toString());
		return packs;
	}

	public void materialCall(List<MaterialCallRequest> requestes, String orderCode) throws Exception {
		logger.info("开始调用wms拉料接口：{}");
		SIMESGoodIssuesOut out = new SIMESGoodIssuesOutService().getHTTPPort();
		DTGoodIssues dts = new DTGoodIssues();
		List<DTGoodIssuesIsData> isdatas = new ArrayList<DTGoodIssuesIsData>();
		for (MaterialCallRequest request : requestes) {
			DTGoodIssuesIsData dt = dozerMapper.map(request, DTGoodIssuesIsData.class);
			dt.setAUFNR(orderCode);
			isdatas.add(dt);
		}
		dts.setIsdata(isdatas);
		logger.info("wms拉料入参：{}",JSONObject.toJSONString(dts));
		out.siMESGoodIssuesOut(dts);
	}

	@Override
	public List<Package> packageSplit(Package oldPkg, int splitCount) {
		logger.info("开始调用savelaunch拆包接口");
		SIMESUnpackingOut si = new SIMESUnpackingOutService().getHTTPPort();
		DTUnpackingItem it = new DTUnpackingItem();
		it.setVLENR(oldPkg.getBoxBarcode());
		it.setNLTYP(oldPkg.getNowBank());
		it.setNLPLA(oldPkg.getNowBin());
		it.setLGNUM(oldPkg.getMatWarehouseNum());
		it.setMATNR(oldPkg.getMatCode());
		it.setCHARG(oldPkg.getMatBatchNo());
		it.setNISTA(String.valueOf(splitCount));

		DTUnpacking.TDATA td = new DTUnpacking.TDATA();
		td.getITEM().add(it);

		DTUnpacking dTUnpackings = new DTUnpacking();
		dTUnpackings.setTDATA(td);

		Holder<DTUnpacking> dt = new Holder<DTUnpacking>();
		dt.value = dTUnpackings;
		logger.info("wms拆包入参：{}",JSONObject.toJSONString(dt));
		si.siMESUnpackingOut(dt);
		it = dt.value.getTDATA().getItem().get(0);
		logger.info("wms拆包出参：{}",JSONObject.toJSONString(it));
		List<Package> packages = new ArrayList<Package>();
		Package badpage = dozerMapper.map(oldPkg, Package.class);
		badpage.setNowBank(it.getNLTYP());
		badpage.setNowBin(it.getNLPLA());
		badpage.setMatWarehouseNum(it.getLGNUM());
		badpage.setMatVersion(it.getMATNR());
		badpage.setBoxQuan(new BigDecimal(it.getNISTA()));
		badpage.setMatBatchNo(it.getCHARG());

		// System.out.println("新箱合格证"+it.getNLENR());
		badpage.setBoxBarcode(it.getNLENR());

		packages.add(badpage);

		Package goodpage = dozerMapper.map(oldPkg, Package.class);
		goodpage.setBoxBarcode(it.getVLENR());
		goodpage.setNowBank(it.getNLTYP());
		goodpage.setNowBin(it.getNLPLA());
		goodpage.setMatWarehouseNum(it.getLGNUM());
		goodpage.setMatVersion(it.getMATNR());
		goodpage.setBoxQuan(new BigDecimal(it.getNISTA()));
		goodpage.setMatBatchNo(it.getCHARG());

		packages.add(goodpage);
		logger.info("调用savelaunch拆包接口结束");
		return packages;
	}

	@Override
	public void safelunchJudge(Package pkg, SafeLunchResult resultType) {
		logger.info("开始调用savelaunch判定接口");
		SIMESJudgeSafeLaunchOut out = new SIMESJudgeSafeLaunchOutService().getHTTPPort();
		DTSafeLaunch dts = new DTSafeLaunch();
		// 处理单元
		dts.setIVHUIDENT(pkg.getBoxBarcode());
		// 仓库
		dts.setIVLGNUM(pkg.getMatWarehouseNum());
		// 状态 FF合格 BB不合格
		dts.setIVMARK(resultType.getCode());
		logger.info("wmssavelaunch判定入参：{}",JSONObject.toJSONString(dts));
		out.siMESJudgeSafeLaunchOut(dts).getCVMESST();
		logger.info("调用savelaunch结束");
	}

	@Override
	@Async
	public void closePlanOrder(PlanOrderVO order) {
		logger.info("开始调用订单关闭接口");
		SIEMS2EWMPPOrdersHoursAsyncOut out = new SIEMS2EWMPPOrdersHoursAsyncOutService().getHTTPPort();
		DTZSEAFKOES zes = new DTZSEAFKOES();
		List<DTZSEAFKO> dts = new ArrayList<DTZSEAFKO>();

		DTZSEAFKO ze = dozerMapper.map(order, DTZSEAFKO.class);
		// 报工标识
		ze.setZHIND(SubType.Close.getCode());
		// ZGUID
		ze.setZGUID(UUIDUtil.getUUID());
		// 报交员工号
		// TODO 取当前用户号
		// ze.setZEMPNO(sub.getBoxInspector());
		// 工厂
		ze.setWERKS(order.getFcCode());
		// 订单号
		ze.setAUFNR(order.getPoCode());
		dts.add(ze);
		zes.setZseafko(dts);
		logger.info("wms订单关闭入参：{}",JSONObject.toJSONString(zes));
		out.siEMS2EWMPPOrdersHoursAsyncOut(zes);
		logger.info("结束调用订单关闭接口");
	}

	@Override
	public void nonconformIsolate(List<NonConformIsolationInfo> isolations) {
		logger.info("开始调用不合格品隔离接口");
		SIMESSuspectIsolationOut si = new SIMESSuspectIsolationOutService().getHTTPPort();
		List<DTWIPTRANFINPUTITEM> dts = new ArrayList<DTWIPTRANFINPUTITEM>();
		for (NonConformIsolationInfo nonConformIsolationInfo : isolations) {
			DTWIPTRANFINPUTITEM dt = new DTWIPTRANFINPUTITEM();
			dt.setMATNR(nonConformIsolationInfo.getProdCode());
			dt.setGAMNG(String.valueOf(nonConformIsolationInfo.getIsoQty()));
			dt.setGMEIN(nonConformIsolationInfo.getProdUnit());
			dt.setCHARG(nonConformIsolationInfo.getBatchCode());
			dt.setVLTYP(nonConformIsolationInfo.getNowBank());
			dt.setVLPLA(nonConformIsolationInfo.getNowBin());
			dt.setNLTYP(nonConformIsolationInfo.getAimBank());
			dt.setNLPLA(nonConformIsolationInfo.getAimBin());
			dts.add(dt);
		}
		DTWIPTRANFINPUT mtWIPTRANFINPUT = new DTWIPTRANFINPUT();
		DTWIPTRANFINPUT.ITINPUT dtw = new ITINPUT();
		dtw.setItem(dts);
		mtWIPTRANFINPUT.setITINPUT(dtw);
		logger.info("wms不合格品入参：{}",JSONObject.toJSONString(mtWIPTRANFINPUT));
		si.siMESSuspectIsolationOut(mtWIPTRANFINPUT);
		logger.info("结束调用不合格品隔离接口");
	}

}
