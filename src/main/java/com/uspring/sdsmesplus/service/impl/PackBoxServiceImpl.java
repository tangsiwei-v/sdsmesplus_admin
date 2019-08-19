package com.uspring.sdsmesplus.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.common.UUIDUtil;
import com.uspring.sdsmesplus.dao.LineStoragebinDao;
import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.generate.BoxInfoPODao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBatchLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBoxLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdDeviceStockPODao;
import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.dao.generate.ProdOrderStockPODao;
import com.uspring.sdsmesplus.dao.generate.SysBinStockPODao;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample.Criteria;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.PlanOrderProPO;
import com.uspring.sdsmesplus.entity.po.ProdBatchLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBatchLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPOExample;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample;
import com.uspring.sdsmesplus.entity.po.SysBinStockPO;
import com.uspring.sdsmesplus.entity.po.SysBinStockPOExample;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.entity.po.SysStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderProVo;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.FinishedProductStatus;
import com.uspring.sdsmesplus.enums.StorageBinType;
import com.uspring.sdsmesplus.enums.WorkOrderStatus;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mpmlink.BomMaterial;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.mpmlink.ProcessStep;
import com.uspring.sdsmesplus.mq.PrinterService;
import com.uspring.sdsmesplus.service.CodePackageService;
import com.uspring.sdsmesplus.service.PackBoxService;
import com.uspring.sdsmesplus.wms.SubUseHelper;
import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.BatchCodeRequest;
import com.uspring.sdsmesplus.wms.entity.HuType;
import com.uspring.sdsmesplus.wms.entity.MaterialCallRequest;
import com.uspring.sdsmesplus.wms.entity.MaterialSubmitHelper;
import com.uspring.sdsmesplus.wms.entity.Package;

@Service
public class PackBoxServiceImpl implements PackBoxService {
	@Autowired
	private PlanOrderPODao planOrderPODao;

	@Autowired
	private PlanOrderDao planOrderDao;

	@Autowired
	private BoxInfoPODao boxInfoPODao;

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductPODao;

	@Autowired
	private ProdDeviceStockPODao prodDeviceStockPODao;

	@Autowired
	private ProdOrderStockPODao prodOrderStockPODao;

	@Autowired
	private ProdBoxLogPODao prodBoxLogPODao;

	@Autowired
	private PrinterService printerService;

	@Autowired
	private PlanOpBomDao planOpBomDao;

	@Autowired
	private SysBinStockPODao sysBinStockPODao;

	@Autowired
	private WMSService wMSService;

	@Autowired
	private LineStoragebinDao lineStoragebinDao;

	@Autowired
	private ProdBoxLogDao prodBoxLogDao;

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductDao;

	@Autowired
	private MpmlinkService mpmlinkService;

	@Autowired
	ProdBatchLogPODao prodBatchLogPODao;

	@Autowired
	CodePackageService codePackageService;

	@Autowired
	private Mapper dozerMapper;

	@Autowired
	private SysLinePODao sysLineDao;

	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	// 获取HU信息----返回list<package>
	@Override
	public List<Package> queryMaterialBoxInfo(String boxCode) throws Exception {

		// 条码系统中查询箱合格证信息,修改从WMS获取
		List<Package> packges = new ArrayList<Package>();
		packges = wMSService.queryHuInfo(boxCode);
		if (packges != null && packges.size() >= 0)
			return packges;

		// 如果没有查到，在装箱记录中查询
		ProdBoxLogPOExample prodBoxLogPOExample = new ProdBoxLogPOExample();
		prodBoxLogPOExample.createCriteria().andBoxBarcodeEqualTo(boxCode);
		List<ProdBoxLogPO> prodBoxLogPOS = prodBoxLogPODao.selectByExample(prodBoxLogPOExample);
		for (ProdBoxLogPO prodBoxLogPO : prodBoxLogPOS) {
			Package map = dozerMapper.map(prodBoxLogPO, Package.class);
			packges.add(map);
		}
		return packges;
	}

	// 请求箱合格证
	public ProdBoxLogPO requestBoxCode(String order_code, Integer boxQuan) throws Exception {
		// 查询工单
		PlanOrderPOExample orderExample = new PlanOrderPOExample();
		orderExample.createCriteria().andPoCodeEqualTo(order_code);
		PlanOrderPO order = planOrderPODao.selectByExample(orderExample).get(0);

		// 判断订单状态是否为执行状态
		//
		if (!(order.getPoStatus().equals("Executing")))
			throw new ServiceException("冻结工单不能装箱");

		// 判断数量是否少于等于满箱状态
		BoxInfoPOExample boxExample = new BoxInfoPOExample();
		boxExample.createCriteria().andProdCodeEqualTo(order.getProdCode())
				.andCustomerCodeEqualTo(order.getCustomerCode());
		BoxInfoPO boxInfoPo = boxInfoPODao.selectByExample(boxExample).get(0);
		int count = boxInfoPo.getBifCount();
		if (count < boxQuan)
			throw new ServiceException("装箱数量不能大于额定数量");

		// 1、请求箱体编号
		String boxCodeNew = "";
		try {
			boxCodeNew = codePackageService.creatHuCode(HuType.CK, order.getFcCode());
		} catch (Exception e) {
			throw new ServiceException("箱合格证获取失败，请联系条码系统管理员");
		}

		// 2、创建箱体
		ProdBoxLogPO box = new ProdBoxLogPO();
		box.setPoCode(order.getPoCode());
		box.setIsFeeded(false);
		box.setBoxBarcode(boxCodeNew);
		box.setBoxQuan(boxQuan);
		box.setCreateTime(new Date());
		box.setCustomerCode(order.getPoCustMatcode());
		box.setProdCode(order.getProdCode());
		box.setLineId(order.getLineId());
		box.setIsWip(false);

		// 调取创建批次接口
		String batchcode = getBatchcode(box, order);
		box.setProdBatchCode(batchcode);

		// 3、调用打印机
		printFPBoxBarcode(box);
		return box;
	}

	// 下线装箱
	@Override
	public void createMachBox(String order_code, ProdBoxLogPO boxLog, Boolean matSubstract) throws Exception {
		// 查询工单
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order_code", order_code);
		List<PlanOrderVO> planvos = planOrderDao.queryPlanVO(map);
		PlanOrderVO order = planvos.get(0);

		// 判断订单状态是否为执行状态
		if (!order.getPoStatus().equals(WorkOrderStatus.Executing.getCode()))
			throw new ServiceException("冻结工单不能装箱");

		// 扣減线上库存，触发拉料
		if (matSubstract) {
			removeLineMaterial(boxLog, 1);
			// 异步判断是否需要拉料
			materialCallCheck(order_code);
		}

		// 向WMS系统进行报工 1.封装Package类
		Package subpack = new Package();
		subpack.setBoxInspector(boxLog.getEmpNumber());
		subpack.setBoxBarcode(boxLog.getBoxBarcode());
		subpack.setBoxQuan(new BigDecimal(boxLog.getBoxQuan()));
		subpack.setMatBatchNo(boxLog.getProdBatchCode());

		// 2封装MaterialSubmitHelper实体类
		List<PlanOpBomPO> orderBom = new ArrayList<PlanOpBomPO>();
		List<PlanOrderProVo> planOrderProVo = order.getPlanOrderProVos();
		for (PlanOrderProVo planOrderProVo2 : planOrderProVo) {
			orderBom.addAll(planOrderProVo2.getPlanOpBomPOs());
		}
		List<MaterialSubmitHelper> matBomHelps = new ArrayList<MaterialSubmitHelper>();
		for (PlanOpBomPO orderBomMat : orderBom) {
			
			MaterialSubmitHelper matBomHelp = new MaterialSubmitHelper();
			matBomHelp.setMatnr(orderBomMat.getMaterialCode());
			matBomHelp.setMeins(orderBomMat.getMaterialUnit());
			matBomHelp.setPosnr(orderBomMat.getMaterialPosnr());
			matBomHelp.setPrvbe(orderBomMat.getMaterialPsa());

			if (orderBomMat.getMaterialUnit().startsWith("KG")) {
				SysStoragebinPO binOil = lineStoragebinDao.findBinByType(order.getLineId(),
						StorageBinType.LineOil.getCode());
				SysBinStockPOExample binexm = new SysBinStockPOExample();
				binexm.createCriteria().andSapMatCodeEqualTo(orderBomMat.getMaterialCode())
						.andTargetBinTypeEqualTo(binOil.getWarehouseLoc())
						.andBoxQuanGreaterThan(new BigDecimal(0));
				binexm.setOrderByClause("box_rcv_time DESC");
				List<SysBinStockPO> sysBinStockPOs = sysBinStockPODao.selectByExample(binexm);
				if(sysBinStockPOs.size() == 0) {
					throw new ServiceException("物料"+ orderBomMat.getMaterialCode() +"未上料，无法报交");
				}
				matBomHelp.setCharg(sysBinStockPOs.get(0).getMatBatchNo());
			} else {
				ProdOrderStockPOExample stockExample = new ProdOrderStockPOExample();
				stockExample.createCriteria().andPoCodeEqualTo(order.getPoCode())
						.andMatCodeEqualTo(orderBomMat.getMaterialCode())
						.andIsCleanedEqualTo(false);
				stockExample.setOrderByClause("update_time DESC");
				List<ProdOrderStockPO> stocks = prodOrderStockPODao.selectByExample(stockExample);
				
				if(stocks.size() == 0)
					throw new ServiceException("物料"+ orderBomMat.getMaterialCode() +"未上料，无法报交");
				ProdOrderStockPO stock = stocks.get(0);
				matBomHelp.setCharg(stock.getMatBatchNo());
			}
			
			double consume = orderBomMat.getMaterialCount() * boxLog.getBoxQuan();
			
			matBomHelp.setLgnum(orderBomMat.getMaterialStloc());
			matBomHelp.setBdmng("" + consume);
			matBomHelps.add(matBomHelp);
		}

		// 获取工序
		String processCode = "";
		for (PlanOrderProPO planOrderProPO : order.getPlanOrderProVos()) {
			if (planOrderProPO.getOpControl().equals("PP03"))
				processCode = planOrderProPO.getOpNo();
		}

		// 获取工作中心
		SysStoragebinPO binFinish = lineStoragebinDao.findBinByType(order.getLineId(),
				StorageBinType.LineFinish.getCode());
		String workStation = binFinish.getWorkStation();

		wMSService.submitProdBox(order, subpack, processCode, workStation, matBomHelps);

		// 3.查询是否有成品记录，有修改成品记录为已装箱
		ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
		prodFinishedProductPOExample.createCriteria().andPoCodeEqualTo(order.getPoCode())
				.andFpStatusEqualTo(FinishedProductStatus.ToBoxClose.toString());
		prodFinishedProductPOExample.setOrderByClause("create_time asc");
		List<ProdFinishedProductPO> prodFinishedProductPOs = prodFinishedProductPODao
				.selectByExample(prodFinishedProductPOExample);

		if (boxLog.getBoxQuan() > 0) {
			for (int i = 0; i < boxLog.getBoxQuan(); i++) {
				ProdFinishedProductPO prodFinishedProductPO = prodFinishedProductPOs.get(i);
				prodFinishedProductPO.setFpStatus(FinishedProductStatus.BoxClosed.toString());
				prodFinishedProductPO.setBoxBarcode(boxLog.getBoxBarcode());
				prodFinishedProductPODao.updateByPrimaryKeySelective(prodFinishedProductPO);
			}

			// 4、在数据库存入装箱信息boxlog表；
			prodBoxLogPODao.insertSelective(boxLog);
		}
	}

	@Async
	@Override
	public void materialCallCheck(String orderCode) throws Exception {

		// 4.4扣减线边库存，如果线边库存信息过低触发物料拉动（针对非总成线）
		PlanOrderVO planOrder = planOrderDao.findPlanVOByOrderCode(orderCode);
		// 查询实际产量
		ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
		prodFinishedProductPOExample.createCriteria().andPoCodeEqualTo(orderCode);
		List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao
				.selectByExample(prodFinishedProductPOExample);
		int realProdCount = prodFinishedProductPOS.size();

		// 如果产品为0，则查询装箱记录总数
		if (realProdCount == 0) {
			realProdCount = prodBoxLogDao.quryProdCounts(orderCode);
		}

		// 查询工单BOM
		List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(orderCode);

		// 查询工单每个零件库存
		List<MaterialCallRequest> callList = new ArrayList<>();
		for (PlanOpBomPO bomMaterial : bomMaterials) {

			// 查询线上库存
			ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
			orderStockExample.createCriteria().andPoCodeEqualTo(orderCode)
					.andMatCodeEqualTo(bomMaterial.getMaterialCode()).andIsCleanedNotEqualTo(true);
			List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
			Double count = 0.0;
			for (ProdOrderStockPO prodOrderStockPO : orders) {
				count += Double.valueOf(prodOrderStockPO.getBoxQuanLeft().toString());
			}

			// 查询线边库存
			PlanOrderPOExample planexm = new PlanOrderPOExample();
			planexm.createCriteria().andPoCodeEqualTo(orderCode);
			List<PlanOrderPO> planPos = planOrderDao.selectByExample(planexm);
			SysStoragebinPO binBeside = lineStoragebinDao.findBinByType(planPos.get(0).getLineId(),
					StorageBinType.LineSide.getCode());

			// 判断是否拉料
			if (count < 100) {
				double callCount = bomMaterial.getMaterialCount() * (planOrder.getPoCount() - realProdCount) - count;
				MaterialCallRequest call = new MaterialCallRequest();
				call.setAimBin(binBeside.getWarehouseLoc());
				call.setAimBank(binBeside.getStorageType());
				call.setBoxQuan(new BigDecimal(callCount));
				call.setReciveDate(new Date().getTime());
				call.setMatNumber(bomMaterial.getMaterialCode());
				call.setMatWarehouseNum(binBeside.getWarehouseNum());
				if (callCount > 0)
					callList.add(call);
			}
		}

		if (callList.size() > 0) {
			// wMSService.materialCall(callList, orderCode);
		}
	}

	// 根据多条件查询状态
	public PageInfo<BoxInfoPO> searchBoxInfo(Map<String, Object> map) throws Exception {
		// 默认分页
		int pageNum = 1, pageSize = 10;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date utilDate = null;
		PageHelper.startPage(pageNum, pageSize);
		BoxInfoPOExample boxInfoPOExample = new BoxInfoPOExample();
		Criteria a = boxInfoPOExample.createCriteria();
		if (map.containsKey("prod_code"))
			a.andProdCodeEqualTo(map.get("prod_code").toString());
		if (map.containsKey("start_time")) {
			utilDate = sdf.parse(map.get("start_time").toString());
			a.andCreateTimeLessThan(utilDate);
		}
		if (map.containsKey("end_time")) {
			sdf.parse(map.get("end_time").toString());
			a.andCreateTimeGreaterThan(utilDate);
		}
		List<BoxInfoPO> boxInPOs = boxInfoPODao.selectByExample(boxInfoPOExample);
		PageInfo<BoxInfoPO> pageInfo = new PageInfo<BoxInfoPO>(boxInPOs);
		return pageInfo;

	}

	// 装箱数据
	@Override
	public PageInfo<ProdBoxLogPO> searchBoxLog(Map<String, Object> map) throws Exception {
		// 默认分页
		int pageNum = 1, pageSize = 10;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date utilDate = null;

		ProdBoxLogPOExample prodBoxLogPOExample = new ProdBoxLogPOExample();
		com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample.Criteria a = prodBoxLogPOExample.createCriteria();
		if (map.containsKey("prod_code"))
			a.andProdCodeEqualTo(map.get("prod_code").toString());
		if (map.containsKey("order_code"))
			a.andPoCodeEqualTo(map.get("order_code").toString());
		if (map.containsKey("line_id"))
			a.andLineIdEqualTo(Integer.valueOf(map.get("line_id").toString()));

		if (map.containsKey("dev_code"))
			a.andOpDeviceEqualTo(map.get("dev_code").toString());

		if (map.containsKey("is_wip"))
			a.andIsWipEqualTo(Boolean.valueOf(map.get("is_wip").toString()));

		if (map.containsKey("start_time")) {
			utilDate = sdf.parse(map.get("start_time").toString());

			a.andCreateTimeLessThan(utilDate);
		}
		if (map.containsKey("end_time")) {
			sdf.parse(map.get("end_time").toString());
			a.andCreateTimeGreaterThan(utilDate);

		}
		PageHelper.startPage(pageNum, pageSize);
		prodBoxLogPOExample.setOrderByClause("create_time desc");
		List<ProdBoxLogPO> boxInPOs = prodBoxLogPODao.selectByExample(prodBoxLogPOExample);
		PageInfo<ProdBoxLogPO> pageInfo = new PageInfo<ProdBoxLogPO>(boxInPOs);
		return pageInfo;
	}

	// 过程装箱（过程码）
	@Override
	public void wipBoxInfo(String dev_code, ProdBoxLogPO boxLog) throws Exception {
		// 1、在数据库装箱记录表中存入装箱信息；
		boxLog.setIsWip(true);
		boxLog.setOpDevice(dev_code);
		prodBoxLogPODao.insertSelective(boxLog);

		// 2、扣减设备线上库存，设备库存表
		removeLineDecMaterial(boxLog, dev_code);

		// 3、发送过程码打印指令，返回成功消息。
		printFPBoxBarcode(boxLog);
	}

	// 扣减设备线上物料
	private void removeLineDecMaterial(ProdBoxLogPO boxLog, String devCode) throws Exception {
		// 查询设备生产工单；
		PlanOrderVO orderVo = planOrderDao.findPlanVOByOrderCode(boxLog.getPoCode());

		SysLinePOExample sysLine = new SysLinePOExample();
		sysLine.createCriteria().andLineIdEqualTo(orderVo.getLineId());
		List<SysLinePO> sysLines = sysLineDao.selectByExample(sysLine);
		String lineSdsId = sysLines.get(0).getLineMpmlinkCode();

		// 查询工艺路线；
		List<ProcessStep> pros = mpmlinkService.queryProcessStep(orderVo.getProdCode(), lineSdsId);
		if (pros.size() == 0) {
			throw new ServiceException("未找到相应工序工艺路线");
		}

		Boolean isExitDec = false;
		for (int i = 0; i < pros.size() && !isExitDec; i++) {
			ProcessStep processStep = pros.get(i);
			List<String> devs = processStep.getDevCodes();

			for (int j = 0; j < devs.size() && !isExitDec; j++) {
				String dev = devs.get(j);
				// 查询设备所属工序，以及这步工序的零件消耗；
				if (dev.equals(devCode)) {
					isExitDec = true;

					List<BomMaterial> boms = processStep.getMaterials();
					List<ProdDeviceStockPO> devStockToUpdate = new ArrayList<ProdDeviceStockPO>();
					for (BomMaterial bomMaterial : boms) {
						String materCode = bomMaterial.getMaterialCode();
						Double unitCount = Double.valueOf(bomMaterial.getMaterialUnit());

						// 计算每个零部件总需要消耗
						Double acount = unitCount * boxLog.getBoxQuan();
						BigDecimal gigo = new BigDecimal(acount);

						// 扣减
						ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
						prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(devCode)
								.andMatCodeEqualTo(materCode).andBoxQuanLeftGreaterThan(new BigDecimal(0))
								.andIsCleanedNotEqualTo(true);
						prodDeviceStockPOExample.setOrderByClause("create_time asc");
						List<ProdDeviceStockPO> deorders = prodDeviceStockPODao
								.selectByExample(prodDeviceStockPOExample);

						// 判断是否够扣
						Double total = 0.00;
						for (ProdDeviceStockPO deorder : deorders) {
							total += Double.valueOf(deorder.getBoxQuanLeft().toString());
						}
						if (total < acount)
							throw new ServiceException("物料" + materCode + "不够装箱数");

						// 开始扣减
						for (ProdDeviceStockPO deorder : deorders) {
							BigDecimal count = deorder.getBoxQuanLeft();
							if (gigo.compareTo(count) > 0) {
								gigo = gigo.subtract(count).setScale(2, RoundingMode.HALF_UP);
								deorder.setBoxQuanLeft(new BigDecimal(0));
								deorder.setIsOpen(true);
								deorder.setUpdateTime(new Date());
								devStockToUpdate.add(deorder);
							} else if (gigo.compareTo(new BigDecimal(0)) > 0 && gigo.compareTo(count) < 0) {
								count = count.subtract(gigo).setScale(2, RoundingMode.HALF_UP);
								deorder.setBoxQuanLeft(count);
								deorder.setIsOpen(true);
								deorder.setUpdateTime(new Date());
								devStockToUpdate.add(deorder);

								break;
							}
						}
						// 如果不够扣减，抛出异常
						if (gigo.compareTo(new BigDecimal(0)) > 0) {
							throw new ServiceException("物料" + materCode + "不够装箱数");
						}
					}
					for (ProdDeviceStockPO upDev : devStockToUpdate) {
						prodDeviceStockPODao.updateByPrimaryKey(upDev);
					}
				}
			}
		}
		if (!isExitDec)
			throw new ServiceException("工序未找到当前设备的匹配");
	}

	// 扣减库存 1.扣减工单
	List<SubUseHelper> removeLineMaterial(ProdBoxLogPO boxLog, int a) throws Exception {

		// 4.1查询bom表,获取到零件号 和 零件消耗数
		List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(boxLog.getPoCode());
		List<SubUseHelper> subs = new ArrayList<SubUseHelper>();

		for (PlanOpBomPO bomMaterial : bomMaterials) {
			if (!bomMaterial.getMaterialUnit().startsWith("KG")) {
				String materCode = bomMaterial.getMaterialCode();
				Double unitCount = bomMaterial.getMaterialCount();

				// 4.2 计算每个零部件消耗
				Double acount = unitCount * boxLog.getBoxQuan();
				BigDecimal gigo = new BigDecimal(acount);
				BigDecimal gig = new BigDecimal(0);

				// 4.3 检查物料种类数量是否够
				ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
				orderStockExample.createCriteria().andPoCodeEqualTo(boxLog.getPoCode()).andMatCodeEqualTo(materCode)
						.andBoxQuanLeftGreaterThan(gig).andIsCleanedNotEqualTo(true);
				orderStockExample.setOrderByClause("create_time asc");
				List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
				if (orders.size() == 0)
					throw new ServiceException("当前物料" + materCode + "不足无法生产");
				// 判断当前物料是否够扣
				BigDecimal haveTotal = new BigDecimal(0);
				for (ProdOrderStockPO prodOrderStockPO : orders) {
					haveTotal = haveTotal.add(prodOrderStockPO.getBoxQuanLeft());
				}
				if (gigo.compareTo(haveTotal) > 0)
					throw new ServiceException("当前线上物料不够扣减，无法生产");
			}
		}
		for (PlanOpBomPO bomMaterial : bomMaterials) {
			if (!bomMaterial.getMaterialUnit().startsWith("KG")) {
				String materCode = bomMaterial.getMaterialCode();
				Double unitCount = bomMaterial.getMaterialCount();

				SubUseHelper sub = new SubUseHelper();
				sub.setUseMatCode(materCode);

				// 4.2计算每个零部件消耗
				Double acount = unitCount * boxLog.getBoxQuan();
				sub.setUseMatNum(acount.toString());
				BigDecimal gigo = new BigDecimal(acount);
				BigDecimal gig = new BigDecimal(0);
				subs.add(sub);
				// 4.3扣减库存
				ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
				orderStockExample.createCriteria().andPoCodeEqualTo(boxLog.getPoCode()).andMatCodeEqualTo(materCode)
						.andBoxQuanLeftGreaterThan(gig).andIsCleanedNotEqualTo(true);
				orderStockExample.setOrderByClause("create_time asc");
				List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);

				for (ProdOrderStockPO prodOrderStockPO : orders) {
					sub.setPiciCode(prodOrderStockPO.getMatBatchNo());
					BigDecimal count = prodOrderStockPO.getBoxQuanLeft();
					if (gigo.compareTo(count) > 0) {
						gigo = gigo.subtract(count);
						prodOrderStockPO.setBoxQuanLeft(gig);
						prodOrderStockPO.setIsOpen(true);
						prodOrderStockPO.setUpdateTime(new Date());
						prodOrderStockPODao.updateByPrimaryKey(prodOrderStockPO);
					} else if (gigo.compareTo(gig) > 0 && gigo.compareTo(count) < 0) {
						count = count.subtract(gigo);
						prodOrderStockPO.setBoxQuanLeft(count);
						prodOrderStockPO.setIsOpen(true);
						prodOrderStockPO.setUpdateTime(new Date());
						prodOrderStockPODao.updateByPrimaryKey(prodOrderStockPO);
						break;
					}
				}
			}
		}
		return subs;

	}

	// 箱合格证补打
	public void reprint(String order_code, ProdBoxLogPO boxLog) {
		// 向打印机发送该箱的打印指令
		printFPBoxBarcode(boxLog);

	}

	// 请求过程码
	public ProdBoxLogPO request(String dev_code, Integer boxQuan, String glevel, String furnace_no) throws Exception {
		// 1、查询设备线上库存，确认当前生产的工单；
		ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
		prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(dev_code).andIsCleanedEqualTo(false);
		List<ProdDeviceStockPO> prodDeviceStockPOs = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);
		if (prodDeviceStockPOs.size() == 0) {
			throw new ServiceException("当前设备无工单");
		}
		String poCode = prodDeviceStockPOs.get(0).getPoCode();

		// 2、检查设备线上库存是否满足扣料；
		judgeCount(poCode, boxQuan, dev_code);

		// 3、系统生产过程码编号，组装BoxLog对象；
		String barcode = HuType.WIP.toString() + UUIDUtil.getUUID();// 过程码
		ProdBoxLogPO boxLog = new ProdBoxLogPO();

		boxLog.setBoxBarcode(barcode);
		boxLog.setBoxQuan(Integer.valueOf(prodDeviceStockPOs.get(0).getBoxQuanLeft().toString()));
		boxLog.setCreateTime(new Date());
		boxLog.setIsFeeded(false);
		boxLog.setIsWip(true);
		boxLog.setPoCode(poCode);
		boxLog.setCreateTime(new Date());
		boxLog.setProdBatchCode(prodDeviceStockPOs.get(0).getMatBatchNo());
		boxLog.setProdFurnaceNo(prodDeviceStockPOs.get(0).getMatFurnaceNo());
		boxLog.setProdGlevel(prodDeviceStockPOs.get(0).getMatGlevel());
		boxLog.setProdName(prodDeviceStockPOs.get(0).getMatName());
		boxLog.setProdTuhao(prodDeviceStockPOs.get(0).getMatTuhao());

		// 4、向打印机发出打印指令；
		printFPBoxBarcode(boxLog);

		// 5、向前台返回箱体信息。
		return boxLog;
	}

	// 2、检查设备线上库存是否满足扣料；
	private void judgeCount(String poCode, Integer boxQuan, String devCode) throws Exception {
		// 检查设备线上库存是否满足扣料
		PlanOrderVO orderVo = planOrderDao.findPlanVOByOrderCode(poCode);

		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineIdEqualTo(orderVo.getLineId());
		List<SysLinePO> lists = sysLineDao.selectByExample(sysLinePOExample);
		String lineMpmlinkCode = lists.get(0).getLineMpmlinkCode();

		List<ProcessStep> pros = mpmlinkService.queryProcessStep(orderVo.getProdCode(), lineMpmlinkCode);
		if (pros.size() == 0) {
			throw new ServiceException("未找到订单工序工艺路线");
		}
		Boolean isExitDec = false;
		for (ProcessStep processStep : pros) {
			List<String> devs = processStep.getDevCodes();

			for (String dev : devs) {
				if (dev.equals(devCode)) {
					isExitDec = true;
					List<BomMaterial> boms = processStep.getMaterials();
					for (BomMaterial bomMaterial : boms) {
						String materCode = bomMaterial.getMaterialCode();
						Double unitCount = Double.valueOf(bomMaterial.getMaterialUnit());

						// 计算每个零部件消耗
						Double acount = unitCount * boxQuan;

						// 计算设备上的料是否足够
						ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
						prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(devCode)
								.andMatCodeEqualTo(materCode).andBoxQuanLeftGreaterThan(new BigDecimal(0))
								.andIsCleanedNotEqualTo(true);
						prodDeviceStockPOExample.setOrderByClause("create_time asc");
						List<ProdDeviceStockPO> deorders = prodDeviceStockPODao
								.selectByExample(prodDeviceStockPOExample);
						Double total = 0.00;
						for (ProdDeviceStockPO deorder : deorders) {
							total = Double.valueOf(deorder.getBoxQuanLeft().toString());
						}
						if (total < acount)
							throw new ServiceException("物料" + materCode + "不够装箱数");
					}
					break;
				}
			}
		}
		if (!isExitDec)
			throw new ServiceException("工艺路线未找到对应的当前设备");
	}

	@Override
	public BoxInfoPO queryboxLog(String prod_code, String customer_code, Integer fc_id) {

		BoxInfoPOExample boxinfo = new BoxInfoPOExample();
		Criteria createCriteria = boxinfo.createCriteria();
		createCriteria.andProdCodeEqualTo(prod_code);
		if (customer_code != null) {
			createCriteria.andCustomerCodeEqualTo(customer_code);
		}
		if (fc_id != null) {
			createCriteria.andFcIdEqualTo(fc_id);
		}
		List<BoxInfoPO> selectByExample = boxInfoPODao.selectByExample(boxinfo);
		return selectByExample.get(0);
	}

	// 调取创建批次接口
	public String getBatchcode(ProdBoxLogPO box, PlanOrderPO order) {

		BatchCodeRequest batchReq = new BatchCodeRequest();
		batchReq.setCustomerCode(box.getCustomerCode());
		batchReq.setFcCode(order.getFcCode());
		// 机加传原始物料
		batchReq.setMaterialBatchCode(box.getProdBatchCode());
		batchReq.setMaterialCode(box.getProdCode());
		batchReq.setMaterialVersion("");
		batchReq.setProdCode(box.getProdCode());
		batchReq.setProdFurnaceNo(box.getProdFurnaceNo());
		batchReq.setProdGlevel(box.getProdGlevel());
		batchReq.setProductDate(sdf.format(new Date()));
		batchReq.setSupplier("");
		batchReq.setSupplierBatchCode("");

		// 查询数据库是否已经有此批次
		String batchCode = selectByTable((BatchCodeRequest) batchReq);
		if (batchCode.equals(""))
			return wMSService.getBatchCode(order, batchReq);
		return batchCode;
	}

	private String selectByTable(BatchCodeRequest batchReq) {
		// 在 prod_batch_log 表里查询是否有批次号
		String batchCode = "";
		ProdBatchLogPOExample batchEx = new ProdBatchLogPOExample();
		com.uspring.sdsmesplus.entity.po.ProdBatchLogPOExample.Criteria createCriteria = batchEx.createCriteria();
		if (batchReq.getProdCode() != "" && null != batchReq.getProdCode())
			createCriteria.andProdCodeEqualTo(batchReq.getProdCode());

		if (batchReq.getFcCode() != "" && null != batchReq.getFcCode())
			createCriteria.andFcCodeEqualTo(batchReq.getFcCode());

		if (batchReq.getSupplier() != "" && null != batchReq.getSupplier())
			createCriteria.andSupplierEqualTo(batchReq.getSupplier());

		if (batchReq.getSupplierBatchCode() != "" && null != batchReq.getSupplierBatchCode())
			createCriteria.andSupplierBatchCodeEqualTo(batchReq.getProdCode());

		if (batchReq.getProdFurnaceNo() != "" && null != batchReq.getProdFurnaceNo())
			createCriteria.andProdFurnaceNoEqualTo(batchReq.getProdFurnaceNo());

		if (batchReq.getProdGlevel() != "" && null != batchReq.getProdGlevel())
			createCriteria.andProdGlevelEqualTo(batchReq.getProdGlevel());

		if (batchReq.getMaterialVersion() != "" && null != batchReq.getMaterialVersion())
			createCriteria.andMaterialVersionEqualTo(batchReq.getMaterialVersion());

		if (batchReq.getMaterialBatchCode() != "" && null != batchReq.getMaterialBatchCode())
			createCriteria.andMaterialBatchCodeEqualTo(batchReq.getMaterialBatchCode());

		if (batchReq.getMaterialCode() != "" && null != batchReq.getMaterialCode())
			createCriteria.andMaterialCodeEqualTo(batchReq.getMaterialCode());

		if (batchReq.getCustomerCode() != "" && null != batchReq.getCustomerCode())
			createCriteria.andCustomerCodeEqualTo(batchReq.getProdCode());

		List<ProdBatchLogPO> prodBatchLogPOs = prodBatchLogPODao.selectByExample(batchEx);
		if (prodBatchLogPOs.size() > 0)
			batchCode = prodBatchLogPOs.get(0).getProdBatchCode();
		return batchCode;
	}

	void printFPBoxBarcode(ProdBoxLogPO box) {
		Package pkg = dozerMapper.map(box, Package.class);
		printerService.printMatBoxBarcode(pkg, box.getLineId());
	}

	//添加装箱数主数据
	public void insertBoxInfo(BoxInfoPO boxInfo) {
		boxInfoPODao.insertSelective(boxInfo);
	}

	//修改装箱数主数据
	public void updateBoxInfo(BoxInfoPO boxInfo) {
		boxInfoPODao.updateByPrimaryKey(boxInfo);
	}
	
	//查询额定装箱数主数据
	public PageInfo<BoxInfoPO> standard(Integer prod_code, String customer_code, Integer fcId, Integer page_size,
			Integer page_num) {
		BoxInfoPOExample boxInfoPOExample = new BoxInfoPOExample();
		Criteria createCriteria = boxInfoPOExample.createCriteria();
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if (prod_code != null) {
			createCriteria.andProdCodeEqualTo(String.valueOf(prod_code));
		}
		if (customer_code != null) {
			createCriteria.andCustomerCodeEqualTo(customer_code);
		}
		if (fcId != null) {
			createCriteria.andFcIdEqualTo(fcId);
		}
		PageHelper.startPage(page_num, page_size);
		List<BoxInfoPO> boxInfoPOs = boxInfoPODao.selectByExample(boxInfoPOExample);
		PageInfo<BoxInfoPO> pageInfo = new PageInfo<BoxInfoPO>(boxInfoPOs);
		return pageInfo;
	}

	//删除装箱数主数据
	public void deleteBoxInfo(Integer bifId) {
		boxInfoPODao.deleteByPrimaryKey(bifId);
	}

}
