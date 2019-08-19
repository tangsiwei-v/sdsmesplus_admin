package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.SkillVerifyLogDao;
import com.uspring.sdsmesplus.dao.generate.PlanOrderPODao;
import com.uspring.sdsmesplus.dao.generate.ProdSkillVerifyLogPODao;
import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.mpmlink.MpmlinkService;
import com.uspring.sdsmesplus.mpmlink.ProcessStep;
import com.uspring.sdsmesplus.service.ShiftService;
import com.uspring.sdsmesplus.service.SkillVerifyService;
@Service
public class SkillVerifyServiceImpl implements SkillVerifyService{
	@Autowired
	private ProdSkillVerifyLogPODao  prodSkillVerifyLogPODao;
	@Autowired
	private PlanOrderPODao planOrderPODao;
	@Autowired
	private MpmlinkService mpmlinkService;
	@Autowired
	private SysLinePODao sysLinePODao;
	@Autowired
	private SysFactoryPODao sysFactoryPODao;
    @Autowired
	private ShiftService shiftService;
    @Autowired
	private SkillVerifyLogDao skillVerifyLogDao; 
	//人员技能要求查询
	public List<ProdSkillVerifyLogPO> querySkillVerify(String order_code) throws Exception {
		//根据工单号查询产品简码和产线
		PlanOrderPOExample planOrder = new PlanOrderPOExample();
		planOrder.createCriteria().andPoCodeEqualTo(order_code);
		List<PlanOrderPO> planOrders = planOrderPODao.selectByExample(planOrder);
		
		String prodCode = planOrders.get(0).getProdCode();
		Integer lineId = planOrders.get(0).getLineId();
		
		SysLinePOExample sysLine = new SysLinePOExample();
		sysLine.createCriteria().andLineIdEqualTo(lineId);
		List<SysLinePO> sysLines = sysLinePODao.selectByExample(sysLine);
		String lineSdsId = sysLines.get(0).getLineMpmlinkCode();
		
		//根据产品简码和产线从MPMLink中查询工艺计划
		List<ProcessStep> queryProcessStep = mpmlinkService.queryProcessStep(prodCode, lineSdsId);
		
		//组装List<SkillVerifyLog>,其中技能要求固定为“L”
		List<ProdSkillVerifyLogPO> skillVerifylogs = new ArrayList<ProdSkillVerifyLogPO>();
		for (ProcessStep processStep : queryProcessStep) {
			ProdSkillVerifyLogPO psk = new ProdSkillVerifyLogPO();
			String procName = processStep.getProcName();
			psk.setSvProcedure(procName);
			psk.setSvSkillNeed("L");
			skillVerifylogs.add(psk);
		}
		//填充要求信息,返回给前台
		return skillVerifylogs;
	}

	//人员技能验证结果提交
	public void insertSkillVerifyLog(List<ProdSkillVerifyLogPO> skillVerifyLog ,Integer line_id) {
		for (ProdSkillVerifyLogPO prodSkillVerifyLogPO : skillVerifyLog) {
			prodSkillVerifyLogPO.setLineId(line_id);
			prodSkillVerifyLogPODao.insertSelective(prodSkillVerifyLogPO);
		}
	}

	//查询是否需要做人员防错
	public boolean findSkillVerifyLog(String order_code) {
		PlanOrderPOExample order = new PlanOrderPOExample();
		order.createCriteria().andPoCodeEqualTo(order_code);
		List<PlanOrderPO> planOrder = planOrderPODao.selectByExample(order);
		String fcCode = planOrder.get(0).getFcCode();
		
		SysFactoryPOExample factory = new SysFactoryPOExample();
		factory.createCriteria().andFcCodeEqualTo(fcCode);
		List<SysFactoryPO> sysFactory = sysFactoryPODao.selectByExample(factory);
		Integer fcId = sysFactory.get(0).getFcId();
		
		Date time=new Date();
		Date shiftStartTimeOfTime = shiftService.getShiftStartTimeOfTime(time, fcId);
		Date shiftEndTimeOfTime = shiftService.getShiftEndTimeOfTime(time, fcId);
		List<ProdSkillVerifyLogPO> compare = skillVerifyLogDao.compare(shiftStartTimeOfTime, shiftEndTimeOfTime, planOrder.get(0).getLineId());
		if(compare.size() > 0)
			return false;
		return true;		
	}

}
