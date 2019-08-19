package com.uspring.sdsmesplus.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBoxLogPODao;
import com.uspring.sdsmesplus.dao.generate.ProdDeviceStockPODao;
import com.uspring.sdsmesplus.dao.generate.ProdOrderStockPODao;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPOExample;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPOExample.Criteria;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mpmlink.BomMaterial;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.mpmlink.ProcessStep;
import com.uspring.sdsmesplus.service.DeviceStackService;
import com.uspring.sdsmesplus.wms.entity.Package;

/**
 * * @author 作者 E-mail:chengtengfei
 * 
 * @date 创建时间：2019年6月25日 下午5:41:33
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class DeviceStackServiceImpl implements DeviceStackService {

	@Autowired
	private PlanOrderDao planDao;

	@Autowired
	private SysLinePODao lineDao;

	@Autowired
	private ProdBoxLogPODao prodBoxLogPODao;

	@Autowired
	private ProdDeviceStockPODao prodDeviceStockPODao;

	@Autowired
	private MpmlinkService mpmlinkService;

	@Autowired
	private ProdOrderStockPODao prodOrderStockPODao;

	@Override
	// 将物料投入到某设备的线上库存，针对非一物流。
	public void putEquipment(String devCode, Package packag) throws Exception {
		// 1.1，查询该物料是否在设备；
		ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
		prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(devCode)
				.andBoxBarcodeEqualTo(packag.getBoxBarcode());
		List<ProdDeviceStockPO> prodDeviceStockPOs = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);

		if (prodDeviceStockPOs.size() > 0)
			throw new ServiceException("该箱物料已经上过");

		// 2.验证该箱物料的批次是否和已上线的批次不同，不同则抛出异常；
		prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(devCode)
				.andIsCleanedNotEqualTo(true).andMatCodeEqualTo(packag.getMatCode());
		List<ProdDeviceStockPO> prodDeviceStockPO1s = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);
		for (ProdDeviceStockPO prodDeviceStockPO : prodDeviceStockPO1s) {
			if (!(prodDeviceStockPO.getMatBatchNo().equals(packag.getMatBatchNo()))) {
				throw new ServiceException("不同物料批次不能同时上");
			}
		}

		// 3、查询当前设备正在生产什么工单。
		String orderId = "";
		// 根据设备号，查询设备表，查询工单号
		orderId = selectDecByDevcode(devCode);

		ProdOrderStockPOExample prodOrderStockPOExample = new ProdOrderStockPOExample();
		prodOrderStockPOExample.createCriteria().andBoxBarcodeEqualTo(packag.getBoxBarcode())
				.andMatCodeEqualTo(packag.getMatCode());
		List<ProdOrderStockPO> prodOrderStockPOS = prodOrderStockPODao.selectByExample(prodOrderStockPOExample);
		String stockOrderId = "";
		if (prodOrderStockPOS.size() > 0) {
			stockOrderId = prodOrderStockPOS.get(0).getPoCode();
		}

		//  5.如果设备工单号存在，验证设备工单和物料工单是否匹配，如果不匹配，抛出异常
		if("".equals(orderId)) {
			orderId = stockOrderId;
		}
		if ("".equals(orderId) && "".equals(stockOrderId)) 
			throw new ServiceException("找不到该箱物料工单");
		else if (!orderId.equals(stockOrderId))
			throw new ServiceException("物料订单和设备订单不统一");

		PlanOrderPO po = planDao.findPlanVOByOrderCode(orderId);
		Integer LineId = po.getLineId();
		String procode = po.getProdCode();

		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineIdEqualTo(LineId);
		List<SysLinePO> lists = lineDao.selectByExample(sysLinePOExample);
		String lineMpmlinkCode = lists.get(0).getLineMpmlinkCode();
		// a)根据工单查询工艺路线；
		List<ProcessStep> pros = mpmlinkService.queryProcessStep(procode, lineMpmlinkCode);
		if(pros.size() == 0) {
			throw new ServiceException("未找到对应工艺路径");
		}
		// b)在工序中找寻该台设备所属的工序，如果不是第一道工序，则执行下一步；
		Boolean firDevReult = false;
		if(pros.get(0).getDevCodes().size() > 0) {
			List<String> firstDevos=pros.get(0).getDevCodes();
			for (String fieDev : firstDevos) {
				if(fieDev.equals(devCode)) {
					firDevReult = true;
					break ;
				}
			}
		}
		
		// 如果不是第一个工序则进行工序防错验证
		if(!firDevReult) {
			// c)在Boxlog中找寻投料的下线工序，验证两个工序是否是顺序关系；
			ProdBoxLogPOExample prodBoxLogPOExample = new ProdBoxLogPOExample();
			prodBoxLogPOExample.createCriteria().andBoxBarcodeEqualTo(packag.getBoxBarcode());
			prodBoxLogPOExample.setOrderByClause("create_time desc");
			List<ProdBoxLogPO> boxLogPos = prodBoxLogPODao.selectByExample(prodBoxLogPOExample);
			if(boxLogPos.size() == 0)
				throw  new ServiceException("未找到下线总成箱记录"); 
			
			String LastDecive = boxLogPos.get(0).getOpDevice(); // 下线设备
			
			Boolean nexDevResult = false;
			for(int i = 0; i< pros.size() - 1; i++) {
				List<String> devos = pros.get(i).getDevCodes();				
                for (String dev : devos) {
					if(dev.equals(LastDecive)) {
						List<String> nexDevos=pros.get(i+1).getDevCodes();
						for (String nexDev : nexDevos) {
							if(nexDev.equals(devCode)) {
								nexDevResult = true;
								break;
							}
						}
					}
				}
			}
			if(!nexDevResult) 
				throw new ServiceException("本设备不在工艺路线内");          
		}
		
		// 5、将该箱记录插入数据库
		ProdDeviceStockPO deviceStock = new ProdDeviceStockPO();
		deviceStock.setPoCode(orderId);
		deviceStock.setDeviceCode(devCode);
		deviceStock.setMatMandat(packag.getMatMandat());
		deviceStock.setMatWarehouseNum(packag.getMatWarehouseNum());
		deviceStock.setMatEntitledPart(packag.getMatEntitledPart());
		deviceStock.setMatHuident(packag.getBoxBarcode());
		deviceStock.setMatNumber(packag.getMatNumber());
		deviceStock.setMatCode(packag.getMatCode());
		deviceStock.setMatTuhao(packag.getMatTuhao());
		deviceStock.setMatName(packag.getMatName());
		deviceStock.setMatFurnaceNo(packag.getMatFurnaceNo());
		deviceStock.setMatGlevel(packag.getMatGlevel());
		deviceStock.setMatVersion(packag.getMatVersion());
		deviceStock.setMatBatchNo(packag.getMatBatchNo());
		deviceStock.setBoxQuan(packag.getBoxQuan());
		deviceStock.setBoxBarcode(packag.getBoxBarcode());
		deviceStock.setBoxInspector(packag.getBoxInspector());
		deviceStock.setCreateTime(new Date());
		deviceStock.setUpdateTime(new Date());
		deviceStock.setIsOpen(false);
		deviceStock.setBoxQuanLeft(packag.getBoxQuan());
		deviceStock.setIsCleaned(false);
		prodDeviceStockPODao.insertSelective(deviceStock);

	}

	// 查询当前设备正在执行什么工单
	private String selectDecByDevcode(String devCode) {
		String pocode = "";
		ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
		prodDeviceStockPOExample.createCriteria().andDeviceCodeEqualTo(devCode)
				.andBoxQuanLeftGreaterThan(new BigDecimal(0)).andIsCleanedEqualTo(false);

		List<ProdDeviceStockPO> prodDeviceStockPOs = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);
		if (prodDeviceStockPOs.size() > 0)
			pocode = prodDeviceStockPOs.get(0).getPoCode();

		return pocode;
	}

	@Override
	public List<ProdDeviceStockPO> findEquipment(String devCode, Boolean iscleaned, Boolean isopen) {
		ProdDeviceStockPOExample prodDeviceStockPOExample = new ProdDeviceStockPOExample();
		Criteria createCriteria = prodDeviceStockPOExample.createCriteria();
		createCriteria.andDeviceCodeEqualTo(devCode).andBoxQuanLeftGreaterThan(new BigDecimal(0));
		if (iscleaned != null) {
			createCriteria.andIsCleanedEqualTo(iscleaned);
		}
		if (isopen != null) {
			createCriteria.andIsOpenEqualTo(isopen);
		}
		prodDeviceStockPOExample.setOrderByClause("create_time asc");
		List<ProdDeviceStockPO> deorders = prodDeviceStockPODao.selectByExample(prodDeviceStockPOExample);
		return deorders;
	}

}
