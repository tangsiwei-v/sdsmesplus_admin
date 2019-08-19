package com.uspring.sdsmesplus.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.generate.SysLineProdmodelPODao;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPOExample;
import com.uspring.sdsmesplus.service.SysLineProdmodelService;
@Service
public class SysLineProdmodelServiceImpl implements SysLineProdmodelService {

	@Autowired
	private SysLineProdmodelPODao sysLineProdmodelPODao;

	@Override
	public SysLineProdmodelPO prodmodel(Integer line_id) {
		SysLineProdmodelPOExample lineProdmodel = new SysLineProdmodelPOExample();
		lineProdmodel.createCriteria().andLineIdEqualTo(line_id);
		List<SysLineProdmodelPO> list = sysLineProdmodelPODao.selectByExample(lineProdmodel);
		
		SysLineProdmodelPO syslineProdmodel = new SysLineProdmodelPO();
		if(list.size() > 0) {
			syslineProdmodel = list.get(0);
		}else {
			syslineProdmodel = null;
		}
		
		return syslineProdmodel;
	}

}
