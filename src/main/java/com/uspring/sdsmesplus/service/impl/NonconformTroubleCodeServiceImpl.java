package com.uspring.sdsmesplus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.NonconformTroubleCodeDao;
import com.uspring.sdsmesplus.entity.po.NonconformTroubleCodePO;
import com.uspring.sdsmesplus.service.NonconformTroubleCodeService;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月6日 下午2:12:42
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class NonconformTroubleCodeServiceImpl implements NonconformTroubleCodeService {

	@Autowired
	private NonconformTroubleCodeDao nonConformTroubleDao;

	@Override
	public Map<String, Object> getNonconformTrouCode(Integer fcId, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.nonConformTroubleDao.getNonconformTrouCode(fcId);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public void insertNonconformTrouCode(NonconformTroubleCodePO nonconformPo) {
		// TODO Auto-generated method stub
		this.nonConformTroubleDao.insertSelective(nonconformPo);
	}

	@Override
	public void updateNonconformTrouCode(NonconformTroubleCodePO nonconformPo) {
		// TODO Auto-generated method stub
		this.nonConformTroubleDao.updateByPrimaryKeySelective(nonconformPo);
	}

	@Override
	public void deleteNonconformTrouCode(Integer trcId) {
		// TODO Auto-generated method stub
		this.nonConformTroubleDao.deleteByPrimaryKey(trcId);
	}

	
}
