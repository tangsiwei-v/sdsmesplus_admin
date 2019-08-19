package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.uspring.sdsmesplus.dao.generate.CodePackagePODao;
import com.uspring.sdsmesplus.dao.generate.SysFactoryPODao;
import com.uspring.sdsmesplus.entity.po.CodePackagePO;
import com.uspring.sdsmesplus.entity.po.CodePackagePOExample;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.service.CodePackageService;
import com.uspring.sdsmesplus.wms.entity.HuType;

/**
 * * @author 作者 E-mail:chengtengfei
 * 
 * @date 创建时间：2019年8月2日 下午1:20:52
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class CodePackageServiceImpl implements CodePackageService {
	@Autowired
	private SysFactoryPODao sysFactoryPODao;
	@Autowired
	private CodePackagePODao codePackagePODao;

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public String creatHuCode(HuType huType, String fcCode) throws ServiceException {
		// AABBBBBBCDXXXXXX 规则AAtype BBBBB年月日 C工厂 D系统A XXXXXX编号
		SysFactoryPOExample facExm = new SysFactoryPOExample();
		facExm.createCriteria().andFcCodeEqualTo(fcCode);
		List<SysFactoryPO> ssysFactoryPOs = sysFactoryPODao.selectByExample(facExm);
		if (ssysFactoryPOs.size() == 0)
			throw new ServiceException("工厂主数据未配置全");
		String fcLogo = ssysFactoryPOs.get(0).getFcSdsId();

		// 大于今日最早时间 小于今日最晚时间 排序根据流水号排序倒叙
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String date = sdf.format(new Date());
		
		CodePackagePOExample codePackExm = new CodePackagePOExample();
		codePackExm.createCriteria().andHuTypeEqualTo(huType.toString()).andPkgDayEqualTo(date);
		codePackExm.setOrderByClause("pkg_counter DESC");
		List<CodePackagePO> codePackagePOs = codePackagePODao.selectByExample(codePackExm);
		int newPkgCounter = 1;
		if (codePackagePOs.size() > 0) {
			newPkgCounter = codePackagePOs.get(0).getPkgCounter() + 1;
		}
		String number = String.format("%06d", newPkgCounter);
		String resultHu = huType.toString() + date + fcLogo + "A" + number;
		CodePackagePO code = new CodePackagePO();
		code.setCreateTime(new Date());
		code.setFcPkgId(fcLogo);
		code.setHuType(huType.toString());
		code.setPkgCode(resultHu);
		code.setPkgCounter(newPkgCounter);
		code.setPkgDay(date);
		code.setPkgSysteam("A");
		codePackagePODao.insertSelective(code);
		return resultHu;
	}

}
