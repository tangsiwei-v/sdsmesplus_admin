package com.uspring.sdsmesplus.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.RoleDao;
import com.uspring.sdsmesplus.dao.SysQrcodeRuleDao;
import com.uspring.sdsmesplus.dao.generate.SysQrcodeRulePODao;
import com.uspring.sdsmesplus.dao.generate.SysRoleAuthPODao;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPOExample;
import com.uspring.sdsmesplus.entity.vo.RoleVO;
import com.uspring.sdsmesplus.service.RoleService;
import com.uspring.sdsmesplus.service.SysQrcodeRulesService;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月6日 下午2:12:42
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class SysQrcodeRulesServiceImpl implements SysQrcodeRulesService {

	@Autowired
	private SysQrcodeRuleDao sysQrcodeRuleDao;
	
	@Override
	public Map<String, Object> getQrcodeRules(Integer fcId,Integer pageNum,Integer pageSize,String prodCode) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.sysQrcodeRuleDao.getQrcodeRuleList(fcId, prodCode);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public void insertQrcodeRules(SysQrcodeRulePO qrCodePo) {
		// TODO Auto-generated method stub
		qrCodePo.setCreateTime(new Date());
		qrCodePo.setUpdateTime(new Date());
		this.sysQrcodeRuleDao.insertSelective(qrCodePo);
	}

	@Override
	public void updateQrcodeRules(SysQrcodeRulePO qrCodePo) {
		// TODO Auto-generated method stub
		qrCodePo.setUpdateTime(new Date());
		this.sysQrcodeRuleDao.updateByPrimaryKeySelective(qrCodePo);
	}

	@Override
	public void deleteQrcodeRules(Integer qrId) {
		// TODO Auto-generated method stub
		this.sysQrcodeRuleDao.deleteByPrimaryKey(qrId);
	}
}
