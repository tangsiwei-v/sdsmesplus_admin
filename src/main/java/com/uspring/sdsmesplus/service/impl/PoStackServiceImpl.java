package com.uspring.sdsmesplus.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineStoragebinDao;
import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.PoStackDao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBoxLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdCleanLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.dao.generate.ProdOrderStockPODao;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPO;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPOExample.Criteria;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample;
import com.uspring.sdsmesplus.entity.po.SysStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.OrderStockBomVO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.StorageBinType;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mq.PrinterService;
import com.uspring.sdsmesplus.service.PoStackService;
import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.CleanType;
import com.uspring.sdsmesplus.wms.entity.MoveStockHelpDo;
import com.uspring.sdsmesplus.wms.entity.Package;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Version 1.0
 * @Description:
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/6/21 15:11
 */
@Service("poStackService")
public class PoStackServiceImpl implements PoStackService {

	@Autowired
	private ProdOrderStockPODao prodOrderStockPODao;

	@Autowired
	private ProdCleanLogPODao prodCleanLogPODao;

	@Autowired
	private ProdBoxLogPODao prodBoxLogPODao;

	@Autowired
	private PrinterService printerService;

	@Autowired
	private PlanOrderDao planDao;

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductDao;

	@Autowired
	private PlanOrderPODao planOrderPODao;

	@Autowired
	private PlanOpBomDao planOpBomDao;

	@Autowired
	private WMSService wMSService;

	@Autowired
	LineStoragebinDao lineStoragebinDao;

	@Autowired
	private Mapper dozerMapper;

	@Autowired
	private PoStackDao poStackDao;

	@Override
	public ProdCleanLogPO cleanstock(String orderCode, String boxCode) throws Exception {

		ProdOrderStockPOExample prodOrderStockPOExample = new ProdOrderStockPOExample();
		prodOrderStockPOExample.createCriteria().andBoxBarcodeEqualTo(boxCode).andPoCodeEqualTo(orderCode)
				.andIsCleanedEqualTo(false);
		prodOrderStockPOExample.setOrderByClause("create_time asc");
		List<ProdOrderStockPO> prodOrderStockPOS = prodOrderStockPODao.selectByExample(prodOrderStockPOExample);

		// 如果工单库存表中不存在 直接抛出异常
		if (prodOrderStockPOS.size() == 0) {
			throw new ServiceException("该箱未上料");
		}
		ProdOrderStockPO prodOrderStockPO = prodOrderStockPOS.get(0);
		List<Package> packgs = new ArrayList<Package>();
		Package packg = new Package();
		packg = dozerMapper.map(prodOrderStockPO, Package.class);
		packg.setBoxQuan(prodOrderStockPO.getBoxQuanLeft());
		packgs.add(packg);

		PlanOrderPOExample planexm = new PlanOrderPOExample();
		planexm.createCriteria().andPoCodeEqualTo(orderCode);
		PlanOrderPO planPo = planDao.selectByExample(planexm).get(0);

		// 如果未开箱返回旧箱信息

		packgs = cleanLineStockHelper(CleanType.clean, packgs, planPo);

		prodOrderStockPO.setIsCleaned(true);
		prodOrderStockPODao.updateByPrimaryKeySelective(prodOrderStockPO);

		// 将新物料箱信息和清线记录存入数据库清线记录表
		ProdCleanLogPO prodCleanLogPO = getcleanLog(prodOrderStockPO, packgs.get(0), orderCode);

		// 4.发送新箱合格证打印指令
		printerService.printMatBoxBarcode(packgs.get(0), planPo.getLineId());

		return prodCleanLogPO;
	}

	@Override
	public void reprinter(String orderCode, ProdCleanLogPO prodCleanLogPO) throws Exception {
		// 在清线记录表中查询该箱的清线记录，查不到则抛出异常
		ProdCleanLogPOExample prodCleanLogPOExample = new ProdCleanLogPOExample();
		prodCleanLogPOExample.createCriteria().andPoCodeEqualTo(orderCode);
		prodCleanLogPOExample.setOrderByClause("create_time asc");
		List<ProdCleanLogPO> prodCleanLogPOs = prodCleanLogPODao.selectByExample(prodCleanLogPOExample);
		// 如果工单库存表中不存在 直接抛出异常
		if (prodCleanLogPOs.size() == 0) {
			throw new ServiceException("不存在已清线箱");
		}

		// 在工单库存表中查询该箱的原始信息
		ProdOrderStockPOExample prodOrderStockPOExample = new ProdOrderStockPOExample();
		prodOrderStockPOExample.createCriteria().andPoCodeEqualTo(orderCode).andIsCleanedEqualTo(true);
		prodOrderStockPOExample.setOrderByClause("create_time asc");
		List<ProdOrderStockPO> prodOrderStockPOS = prodOrderStockPODao.selectByExample(prodOrderStockPOExample);

		// 如果工单库存表中不存在 直接抛出异常
		ProdOrderStockPO prodOrderStockPO = null;
		if (prodOrderStockPOS.size() == 0) {
			throw new ServiceException("原合格证信息不存在");
		}
		// 将其中合格证替换为清线记录中的新箱合格证,并修改剩余数量,将对象发送给打印机打印
		prodOrderStockPO = prodOrderStockPOS.get(0);
		prodOrderStockPO.setBoxBarcode(prodCleanLogPO.getBoxBarcodeNew());
		prodOrderStockPO.setBoxQuanLeft(prodCleanLogPO.getClRestCount());

		Package packge = dozerMapper.map(prodOrderStockPO, Package.class);
		PlanOrderVO planvo = planDao.findPlanVOByOrderCode(orderCode);
		printerService.printMatBoxBarcode(packge, planvo.getLineId());
	}

	@Override
	public Boolean workSheetFeeding(String orderCode, List<Package> packags) throws Exception {
		// 验证该物料是否是本产品BOM内物料，若否则抛异常退出

		for (Package packag : packags) {
			Boolean result = false;
			List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(orderCode);

			for (PlanOpBomPO planOpBomPO : bomMaterials) {
				String materCode = planOpBomPO.getMaterialCode();

				if (packag.getMatCode().equals(materCode)) {
					result = true;
					break;
				}
			}
			if (!result)
				throw new ServiceException("不是本产品的物料");

			// 2.验证该箱物料是否已经上过，上过则抛出异常
			ProdOrderStockPOExample prodOrderStockPOExample = new ProdOrderStockPOExample();
			prodOrderStockPOExample.createCriteria().andBoxBarcodeEqualTo(packag.getBoxBarcode())
					.andIsCleanedEqualTo(false);
			List<ProdOrderStockPO> prodOrderStockPOS = prodOrderStockPODao.selectByExample(prodOrderStockPOExample);
			if (prodOrderStockPOS.size() > 0)
				throw new ServiceException("该箱物料已经上过");
		}

		PlanOrderPOExample planexm = new PlanOrderPOExample();
		planexm.createCriteria().andPoCodeEqualTo(orderCode);
		List<PlanOrderPO> planPos = planDao.selectByExample(planexm);
		// 调SAP上料接口
		SysStoragebinPO binLineUp = lineStoragebinDao.findBinByType(planPos.get(0).getLineId(),
				StorageBinType.LineUp.getCode());
		MoveStockHelpDo moveStock = new MoveStockHelpDo();
		moveStock.setCNNAME("");
		moveStock.setNLTYP(binLineUp.getStorageType());
		moveStock.setNLPLA(binLineUp.getWarehouseLoc());

		Package pkgToSubmit = dozerMapper.map(packags.get(0), Package.class);
		if (packags.size() > 1)
			pkgToSubmit.setBoxBarcode(pkgToSubmit.getUpHu());
		wMSService.feedBox(pkgToSubmit, moveStock, orderCode);

		for (Package packag : packags) {
			// 3、将箱信息插入数据库工单库存表。
			ProdOrderStockPO prodOrderStockPO = dozerMapper.map(packag, ProdOrderStockPO.class);
			prodOrderStockPO.setCreateTime(new Date());
			prodOrderStockPO.setBoxBarcode(packag.getBoxBarcode());
			prodOrderStockPO.setIsCleaned(false);
			prodOrderStockPO.setIsOpen(false);
			prodOrderStockPO.setPoCode(orderCode);
			prodOrderStockPO.setUpdateTime(new Date());
			prodOrderStockPO.setBoxQuanLeft(packag.getBoxQuan());
			prodOrderStockPODao.insertSelective(prodOrderStockPO);
		}

		return true;
	}

	@SuppressWarnings("null")
	@Override
	// 清线
	public List<ProdCleanLogPO> clean(String orderCode) throws Exception {
		// 1.查询出该工单库存中，未消耗完的物料箱
		ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
		orderStockExample.createCriteria().andPoCodeEqualTo(orderCode).andBoxQuanLeftGreaterThan(new BigDecimal(0))
				.andIsCleanedNotEqualTo(true);
		orderStockExample.setOrderByClause("create_time asc");
		List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);

		// 2.调用WMS系统的清线接口，传递源物料箱信息，得到新物料箱信息. +调用wms清线接口 +要写两个for把清线返回的放进去
		List<Package> packgs = new ArrayList<Package>();

		for (ProdOrderStockPO prodOrderStockPO : orders) {
			Package packg = dozerMapper.map(prodOrderStockPO, Package.class);
			packg.setBoxQuan(prodOrderStockPO.getBoxQuanLeft());
			packgs.add(packg);
		}

		PlanOrderPOExample planEx = new PlanOrderPOExample();
		planEx.createCriteria().andPoCodeEqualTo(orderCode);
		PlanOrderPO orPo = planOrderPODao.selectByExample(planEx).get(0);

		List<Package> backPacks = cleanLineStockHelper(CleanType.clean, packgs, orPo);

		List<ProdCleanLogPO> prodCleanLogPOs = new ArrayList<>();
		List<String> loseCodes = new ArrayList<>();
		// 清线 3 清线老的和旧的关系 处理方式
		for (ProdOrderStockPO prodOrderStockPO : orders) {
			for (Package package1 : backPacks) {
				if (package1.getMatCode().equals(prodOrderStockPO.getMatCode())) {
					if (package1.getBoxBarcode().equals("E")) {
						loseCodes.add(package1.getMatCode());
					} else {
						// 将库存记录改为已清线
						prodOrderStockPO.setIsCleaned(true);
						prodOrderStockPODao.updateByPrimaryKeySelective(prodOrderStockPO);
						ProdCleanLogPO prodCleanLogPO = getcleanLog(prodOrderStockPO, package1, orderCode);
						// 4.发送新箱合格证打印指令
						printerService.printMatBoxBarcode(package1, orPo.getLineId());
						prodCleanLogPOs.add(prodCleanLogPO);
					}
				}

			}
		}
		if (loseCodes.size() > 0)
			throw new ServiceException("物料" + JSONObject.toJSONString(loseCodes) + "清线失败");
		// 5.返回清线记录
		return prodCleanLogPOs;
	}

	private List<Package> cleanLineStockHelper(CleanType clean, List<Package> packgs, PlanOrderPO order)
			throws Exception {

		// 查询线上库位
		SysStoragebinPO binLineUp = lineStoragebinDao.findBinByType(order.getLineId(), StorageBinType.LineUp.getCode());

		// 查询线边库位
		SysStoragebinPO binLineSide = lineStoragebinDao.findBinByType(order.getLineId(),
				StorageBinType.LineSide.getCode());

		for (Package packag : packgs) {
			packag.setNowBin(binLineUp.getWarehouseLoc());
			packag.setNowBank(binLineUp.getStorageType());
			packag.setAimBin(binLineSide.getWarehouseLoc());
		}

		List<Package> packs = wMSService.cleanLineStock(order, CleanType.clean, packgs);
		return packs;
	}

	@Override
	public List<ProdOrderStockPO> findLineStock(String orderCode, Boolean iscleaned, Boolean isopen) {
		// 在数据库中查询该工单,没用完的箱合格证信息
		ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
		com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample.Criteria createCriteria = orderStockExample
				.createCriteria();
		createCriteria.andPoCodeEqualTo(orderCode).andBoxQuanLeftGreaterThan(new BigDecimal(0));
		if (iscleaned != null) {
			createCriteria.andIsCleanedEqualTo(iscleaned);
		}
		if (isopen != null) {
			createCriteria.andIsOpenEqualTo(isopen);
		}
		orderStockExample.setOrderByClause("create_time asc");
		List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
		return orders;
	}

	// cleanlog封装
	public ProdCleanLogPO getcleanLog(ProdOrderStockPO prodOrderStockPO, Package packg, String orderCode) {

		// 3.将新物料箱信息和清线记录存入数据库清线记录表
		ProdCleanLogPO prodCleanLogPO = new ProdCleanLogPO();
		prodCleanLogPO.setClCode(UUID.randomUUID().toString());
		prodCleanLogPO.setPoCode(orderCode);
		prodCleanLogPO.setMatCode(packg.getMatCode());
		prodCleanLogPO.setMatName(packg.getMatName());
		prodCleanLogPO.setBoxBarcodeOld(prodOrderStockPO.getBoxBarcode());
		prodCleanLogPO.setBoxBarcodeNew(packg.getBoxBarcode());
		prodCleanLogPO.setClUsedCount((prodOrderStockPO.getBoxQuan().subtract(packg.getBoxQuan())));
		// prodCleanLogPO.setClRestCount();
		prodCleanLogPO.setClRestCount(prodOrderStockPO.getBoxQuanLeft());
		prodCleanLogPO.setIsConfirmed(false);
		prodCleanLogPO.setCreateTime(new Date());
		prodCleanLogPODao.insertSelective(prodCleanLogPO);

		return prodCleanLogPO;

	}

	@Override
	public void clean_confirm(String box_barcode) throws Exception {
		// 1、在清线记录表中查询该箱合格证（按新箱合格证字段查询），查询不出抛出异常；
		ProdCleanLogPOExample prodcleanlog = new ProdCleanLogPOExample();
		prodcleanlog.createCriteria().andBoxBarcodeNewEqualTo(box_barcode);
		List<ProdCleanLogPO> prodCleanLog = prodCleanLogPODao.selectByExample(prodcleanlog);

		if (prodCleanLog.size() == 0)
			throw new ServiceException("该箱没有清线记录");

		// 2、检查该箱合格证状态是否是待确认，不是抛出异常；允许重复确认
		// if (prodCleanLog.get(0).getIsConfirmed())
		// throw new ServiceException("该箱已确认");

		// 3、修改该箱合格证为已确认； 写个sql只改一个状态，根据box_barcode
		poStackDao.upIsConfirmed(box_barcode);
	}

	@Override
	public PageInfo<ProdCleanLogPO> cleanlog(String order_code, Boolean is_confirmed, String start_time,
			String end_time, Integer page_size, Integer page_num) throws Exception {
		// 按照条件查询清线记录列表 page_num == null || page_size == null
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		ProdCleanLogPOExample prodcleanlog = new ProdCleanLogPOExample();
		Criteria criteria = prodcleanlog.createCriteria();
		if (order_code != null && !order_code.equals("")) {
			criteria.andPoCodeEqualTo(order_code);
		}
		if (is_confirmed != null) {
			criteria.andIsConfirmedEqualTo(is_confirmed);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (start_time != null && !start_time.equals("")) {
			Date startTime = sdf.parse(start_time);
			criteria.andCreateTimeGreaterThan(startTime);
		}
		if (end_time != null && !end_time.equals("")) {
			Date endTime = sdf.parse(end_time);
			criteria.andCreateTimeLessThan(endTime);
		}

		PageHelper.startPage(page_num, page_size);
		List<ProdCleanLogPO> prodCleanLog = prodCleanLogPODao.selectByExample(prodcleanlog);
		PageInfo<ProdCleanLogPO> pageInfo = new PageInfo<ProdCleanLogPO>(prodCleanLog);
		return pageInfo;
	}

	@Override
	public List<OrderStockBomVO> findOrderMatStock(String orderCode) throws Exception {

		List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(orderCode);

		List<OrderStockBomVO> boms = new ArrayList<OrderStockBomVO>();
		for (PlanOpBomPO bomMaterial : bomMaterials) {
			if (!bomMaterial.getMaterialUnit().startsWith("KG")) {
				String materCode = bomMaterial.getMaterialCode();
				Double unitCount = bomMaterial.getMaterialCount();

				OrderStockBomVO orderBom = new OrderStockBomVO();
				orderBom.setMaterialCode(materCode);
				orderBom.setMaterialUnit(unitCount);

				// 计算每个物料零件的剩余数量和差额；
				ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
				orderStockExample.createCriteria().andPoCodeEqualTo(orderCode).andMatCodeEqualTo(materCode)
						.andBoxQuanLeftGreaterThan(new BigDecimal(0)).andIsCleanedNotEqualTo(true);
				orderStockExample.setOrderByClause("create_time asc");
				List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
				Double count = 0.00;
				for (ProdOrderStockPO prodOrderStockPO : orders) {
					count += Double.valueOf(prodOrderStockPO.getBoxQuanLeft().toString());
				}
				orderBom.setMaterialNumLeft(count);

				// 计算已经装箱数量
				PlanOrderPOExample planexm = new PlanOrderPOExample();
				planexm.createCriteria().andPoCodeEqualTo(orderCode);
				List<PlanOrderPO> planPos = planDao.selectByExample(planexm);
				Double totalCount = planPos.get(0).getPoCount().doubleValue();
				int sucCount = 0;

				ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
				prodFinishedProductPOExample.createCriteria().andPoCodeEqualTo(orderCode);
				List<ProdFinishedProductPO> prodFinishedProductPOs = prodFinishedProductDao
						.selectByExample(prodFinishedProductPOExample);
				if (prodFinishedProductPOs.size() > 0) {
					sucCount = prodFinishedProductPOs.size();
				} else {
					ProdBoxLogPOExample prodBoxLogPOExample = new ProdBoxLogPOExample();
					prodBoxLogPOExample.createCriteria().andPoCodeEqualTo(orderCode);
					List<ProdBoxLogPO> prodBoxLogPOS = prodBoxLogPODao.selectByExample(prodBoxLogPOExample);
					for (ProdBoxLogPO prodBoxLogPO : prodBoxLogPOS) {
						sucCount += prodBoxLogPO.getBoxQuan();
					}
				}
				Double nedCount = (totalCount - sucCount) * unitCount - count;
				if (nedCount < 0)
					nedCount = 0.00;
				orderBom.setMaterialNumLack(nedCount);
				boms.add(orderBom);
			}
		}

		// 组装List<OrderStockBomVO>并返回
		return boms;
	}

}
