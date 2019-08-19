package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineStoragebinDao;
import com.uspring.sdsmesplus.dao.NonconformProductDao;
import com.uspring.sdsmesplus.dao.generate.NonconformProductMaterialPODao;
import com.uspring.sdsmesplus.dao.generate.QisTprTroubleProRecordPODao;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPO;
import com.uspring.sdsmesplus.entity.po.QisTprTroubleProRecordPO;
import com.uspring.sdsmesplus.entity.po.SysStoragebinPO;
import com.uspring.sdsmesplus.entity.vo.NonconformProductVO;
import com.uspring.sdsmesplus.entity.vo.UserVO;
import com.uspring.sdsmesplus.enums.NonconformProductStatus;
import com.uspring.sdsmesplus.enums.StorageBinType;
import com.uspring.sdsmesplus.mpmlink.BomMaterial;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.mpmlink.ProcessStep;
import com.uspring.sdsmesplus.mq.PrinterService;
import com.uspring.sdsmesplus.service.NonconformProductService;
import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.NonConformIsolationInfo;

@Service
public class NonconformProductServiceImpl implements NonconformProductService {
	@Autowired
	private NonconformProductDao nonconformProductDao;
	@Autowired
	private NonconformProductMaterialPODao nonconformProductMaterialPODao;
	@Autowired
	private MpmlinkService mpmlinkService;
	@Autowired
	private WMSService wmsService;
	@Autowired
	private QisTprTroubleProRecordPODao qisTprTroubleProRecordPODao;
	@Autowired
	private LineStoragebinDao lineStoragebinDao;
	@Autowired
	private PrinterService printerSrvice;
	
	// 不合格品信息录入
	public void saveNonconformProduct(NonconformProductVO nonconformProductVO) {
		// 1、不合格品记录状态设置为“录入”，设置录入人员、时间等
		nonconformProductVO.setNplBarcode(String.valueOf(UUID.randomUUID()));
		nonconformProductVO.setNplStatus(String.valueOf(NonconformProductStatus.Entering));
		// 录入登录人员姓名，工号
		UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		nonconformProductVO.setCreatePersonNo(user.getEmpNumber());
		if(nonconformProductVO.getCreatePersonName() == null) {
			nonconformProductVO.setCreatePersonName(user.getUserName());
		}
		nonconformProductVO.setCreateTime(new Date());
		nonconformProductVO.setNplId(null);
		// 2、不合格品记录存入数据库
		nonconformProductDao.insertSelective(nonconformProductVO);
		// 3、不合格品对应零件存入数据库
		List<NonconformProductMaterialPO> nonconformProductMaterialPOs = nonconformProductVO
				.getNonconformProductMaterialPOs();
		for (NonconformProductMaterialPO nonconformProductMaterialPO : nonconformProductMaterialPOs) {
			nonconformProductMaterialPODao.insertSelective(nonconformProductMaterialPO);
		}
		// TODO 发送打印指令，打印不合格品标签
		//printerSrvice.
	}

	// 不合格品零件查询
	public List<NonconformProductMaterialPO> compute(NonconformProductLogPO nonconformProductPO) throws Exception {
		// 1、查询对应的工艺路线
		String prodCode = nonconformProductPO.getProdCode();
		Integer lineId = nonconformProductPO.getLineId();
		//先根据Lind_id查询lineMpmlinkCode;
        List<ProcessStep> queryProcessSteps = mpmlinkService.queryProcessSteps(prodCode, lineId);
		// 2、根据不合格品的产生工序，计算该不合格品消耗的零件
		List<NonconformProductMaterialPO> nonconformProductMaterialPO = new ArrayList<NonconformProductMaterialPO>();
		for (int i = 0; i < queryProcessSteps.size(); i++) {
			if (queryProcessSteps.get(i).getProcCode().equals(nonconformProductPO.getNplProdOp())) {
				for (int j = 0; j <= i; j++) {
					List<BomMaterial> boms = queryProcessSteps.get(j).getMaterials();
					for (BomMaterial bomMaterial : boms) {
						NonconformProductMaterialPO backNo = new NonconformProductMaterialPO();
						backNo.setMaterialCode(bomMaterial.getMaterialCode());
						Double consum = bomMaterial.getMaterialUnit();
						backNo.setMaterialQty(nonconformProductPO.getNplQty() * consum.intValue());
						nonconformProductMaterialPO.add(backNo);
					}
				}
				break;
			}
		}
		// 3、返回计算结果
		return nonconformProductMaterialPO;
	}

	// 不合格品确认
	public void confirm(NonconformProductVO nonconformProductVO) {
		// 不合格品记录状态设置为“隔离”，设置确认人员、时间等，修改数据库
		nonconformProductVO.setNplStatus(String.valueOf(NonconformProductStatus.Insulate));
		// 录入登录人员姓名，工号
		UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		nonconformProductVO.setConfirmPersonNo(user.getEmpNumber());
		nonconformProductVO.setConfirmPersonName(user.getUserName());
		nonconformProductVO.setCreateTime(new Date());
		nonconformProductDao.updateByPrimaryKeySelective(nonconformProductVO);
		List<NonconformProductMaterialPO> nonconformProductMaterialPOs = nonconformProductVO.getNonconformProductMaterialPOs();
		for (NonconformProductMaterialPO nonconformProductMaterialPO : nonconformProductMaterialPOs) {
			nonconformProductMaterialPODao.updateByPrimaryKeySelective(nonconformProductMaterialPO);
		}
		// 调用SAP不合格品隔离接口，对涉及零件进行隔离
		List<NonConformIsolationInfo> isolations = new ArrayList<NonConformIsolationInfo>();
		// 遍历NonconformProductMaterialPO
		SysStoragebinPO findBinByType = lineStoragebinDao.findBinByType(Integer.valueOf(nonconformProductVO.getLineId()), String.valueOf(StorageBinType.LineUp));
		SysStoragebinPO binByType = lineStoragebinDao.findBinByType(Integer.valueOf(nonconformProductVO.getLineId()), String.valueOf(StorageBinType.LineIsolation));
		for (NonconformProductMaterialPO nonconformProductMaterialPO : nonconformProductMaterialPOs) {
			NonConformIsolationInfo nonConformIsolationInfo = new NonConformIsolationInfo();
			nonConformIsolationInfo.setProdCode(nonconformProductVO.getProdCode());
			nonConformIsolationInfo.setIsoQty(Double.valueOf(nonconformProductMaterialPO.getMaterialQty()));
			nonConformIsolationInfo.setProdUnit("EA");
			nonConformIsolationInfo.setBatchCode(nonconformProductMaterialPO.getMaterialBatchCode());
			nonConformIsolationInfo.setNowBank(findBinByType.getWarehouseNum());
			nonConformIsolationInfo.setNowBin(findBinByType.getWarehouseLoc());
			nonConformIsolationInfo.setAimBank(binByType.getWarehouseNum());
			nonConformIsolationInfo.setAimBin(binByType.getWarehouseLoc());
			isolations.add(nonConformIsolationInfo);
		}
		wmsService.nonconformIsolate(isolations);
		// 将不合格品涉及的所有零件，移入隔离件表中QIS_tpr_TroubleProRecord
		QisTprTroubleProRecordPO qisTprTroubleProRecordPO = new  QisTprTroubleProRecordPO();
		qisTprTroubleProRecordPO.setTprShift(nonconformProductVO.getShiftCode());
		qisTprTroubleProRecordPO.setTprPodline(nonconformProductVO.getLineCode());
		qisTprTroubleProRecordPO.setTprWorkshop(nonconformProductVO.getShopCode());
		qisTprTroubleProRecordPO.setTprCostcenter(nonconformProductVO.getNplCostCenter());
		qisTprTroubleProRecordPO.setTprCostcentername(nonconformProductVO.getNplCostCenterName());
		qisTprTroubleProRecordPO.setTprFindop(nonconformProductVO.getNplFindOp());
		qisTprTroubleProRecordPO.setTprFindopname(nonconformProductVO.getNplFindOpName());
		qisTprTroubleProRecordPO.setTprCreateperson(nonconformProductVO.getCreatePersonName());
		qisTprTroubleProRecordPO.setTprCreatetime(new Date());
		//qisTprTroubleProRecordPO.setTprLoc(nonconformProductVO.get);
		qisTprTroubleProRecordPODao.insertSelective(qisTprTroubleProRecordPO);
	}

	// 不合格品记录查询
	public PageInfo<NonconformProductVO> record(Integer fcId, Integer shopId, Integer lineId, Integer shiftId,
			String status, String start_time, String end_time, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<NonconformProductVO> nonconformProductVOs = nonconformProductDao.record(fcId, shopId, lineId, shiftId, status, start_time,
				end_time, page_size, page_num);
		PageInfo<NonconformProductVO> pageInfo = new PageInfo<NonconformProductVO>(nonconformProductVOs);
		return pageInfo;
	}

}