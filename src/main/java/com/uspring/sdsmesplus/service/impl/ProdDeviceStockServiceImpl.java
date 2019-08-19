package com.uspring.sdsmesplus.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.generate.*;
import com.uspring.sdsmesplus.entity.po.*;
import com.uspring.sdsmesplus.entity.vo.OrderProdStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.entity.vo.DevProdStatus;
import com.uspring.sdsmesplus.service.ProdDeviceStockService;
@Service
public class ProdDeviceStockServiceImpl implements ProdDeviceStockService{
	
	@Autowired
	private ProdDeviceStockPODao prodDeviceStockPODao;
	
	@Autowired
	private ProdOrderStockPODao prodOrderStockPODao;
	
	@Autowired
    private ProdBoxLogPODao prodBoxLogPODao;
	
	@Autowired
	private DevicePODao devicePODao;

	@Autowired
	private PlanOrderDao planOrderDao;

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductDao;

	@Autowired
	private ProdBoxLogDao prodBoxLogDao;

	@Autowired
	private SysBoxInfoDao sysBoxInfoDao;

	@Override
	public DevProdStatus device(String dev_code) {
		//1、查询该设备正在加工的工单、投料数量、产出数量、不合格品数量等
		ProdDeviceStockPOExample ProdDeviceStock = new ProdDeviceStockPOExample();
		ProdDeviceStock.createCriteria().andDeviceCodeEqualTo(dev_code);
		List<ProdDeviceStockPO> deviceStock = prodDeviceStockPODao.selectByExample(ProdDeviceStock);
		String poCode = deviceStock.get(0).getPoCode();
		
		ProdOrderStockPOExample prodOrderStock = new ProdOrderStockPOExample();
		prodOrderStock.createCriteria().andPoCodeEqualTo(poCode);
		List<ProdOrderStockPO> orderStock = prodOrderStockPODao.selectByExample(prodOrderStock);
		BigDecimal num = new BigDecimal(0) ;
		
		DevicePOExample device = new DevicePOExample();
		device.createCriteria().andDevCodeEqualTo(dev_code);
		List<DevicePO> devicePO = devicePODao.selectByExample(device);
		
		for (ProdOrderStockPO prodOrderStockPO : orderStock) {
			num = num.add(prodOrderStockPO.getBoxQuan());
		}
		ProdBoxLogPOExample prodBoxLog = new ProdBoxLogPOExample();
		prodBoxLog.createCriteria().andPoCodeEqualTo(poCode);
		List<ProdBoxLogPO> boxLog = prodBoxLogPODao.selectByExample(prodBoxLog);
		int chunm = 0;
		for (ProdBoxLogPO prodBoxLogPO : boxLog) {
			chunm+=prodBoxLogPO.getBoxQuan();
		}
		int disqualification = 0;
		//2、组装为DevProdStatus对象，返回；
		DevProdStatus devProdStatus = new DevProdStatus();
		devProdStatus.setDevCode(devicePO.get(0).getDevCode());
		devProdStatus.setDevName(devicePO.get(0).getDevName());
		devProdStatus.setOrderCode(orderStock.get(0).getPoCode());
		devProdStatus.setProdCode(orderStock.get(0).getMatCode());
		devProdStatus.setProdName(orderStock.get(0).getMatName());
		long amount = num.longValue();
		devProdStatus.setMaterialNum(amount);
		devProdStatus.setOutputNum(chunm);
		devProdStatus.setUnqualifyNum(disqualification);
		return devProdStatus;
	}

	@Override
	public OrderProdStatus queryOrderStatus(String orderCode) {
		//查询工单信息
		PlanOrderPO planOrder = planOrderDao.findPlanVOByOrderCode(orderCode);

		//查询实际产量
		ProdFinishedProductPOExample prodFinishedProductPOExample=new ProdFinishedProductPOExample();
		prodFinishedProductPOExample.createCriteria().andPoCodeEqualTo(orderCode);
		List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
		int realProdCount = prodFinishedProductPOS.size();

		//如果产品为0，则查询装箱记录总数
		if(realProdCount == 0){
			realProdCount =  prodBoxLogDao.quryProdCounts(orderCode);
		}

		//查询实际装箱数
		int realBoxCount = prodBoxLogDao.queryBoxCounts(orderCode);


		//查询每箱数量
		SysBoxInfoPOExample sysBoxInfoPOExample = new SysBoxInfoPOExample();
		sysBoxInfoPOExample.createCriteria().andProdCodeEqualTo(planOrder.getProdCode())
				.andCustomerCodeEqualTo(planOrder.getCustomerCode());
		List<SysBoxInfoPO> sysBoxInfoPOS=sysBoxInfoDao.selectByExample(sysBoxInfoPOExample);
		int bifCount=sysBoxInfoPOS.get(0).getBifCount();
		//计算剩余产品数量
		int lastCount = planOrder.getPoCount() - realProdCount;
		//计算剩余装箱数量
		int lastBoxCount = lastCount % bifCount == 0 ? lastCount / bifCount : lastCount / bifCount + 1;
		//总共箱数
		int totalBoxCount = realBoxCount + lastBoxCount;


		//返回对象赋值
		OrderProdStatus orderProdStatus = new OrderProdStatus();
		orderProdStatus.setBoxCount(realBoxCount);
		orderProdStatus.setFpCount(realProdCount);
		orderProdStatus.setOrderCode(orderCode);
		orderProdStatus.setPlanBoxCount(totalBoxCount);
		orderProdStatus.setProdCode(planOrder.getProdCode());

		return orderProdStatus;
	}

}
