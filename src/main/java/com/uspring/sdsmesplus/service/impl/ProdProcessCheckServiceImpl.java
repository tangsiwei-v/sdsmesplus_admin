package com.uspring.sdsmesplus.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.ProdProcessCheckDao;
import com.uspring.sdsmesplus.dao.RoleDao;
import com.uspring.sdsmesplus.dao.SysQrcodeRuleDao;
import com.uspring.sdsmesplus.dao.generate.ProdProcessCheckPODao;
import com.uspring.sdsmesplus.dao.generate.SysQrcodeRulePODao;
import com.uspring.sdsmesplus.dao.generate.SysRoleAuthPODao;
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPOExample;
import com.uspring.sdsmesplus.entity.vo.RoleVO;
import com.uspring.sdsmesplus.service.ProdProcessCheckService;
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
public class ProdProcessCheckServiceImpl implements ProdProcessCheckService {

	@Autowired
	private ProdProcessCheckDao prodProcessCheckDao;
	
	@Override
	public Map<String, Object> getProdProcessCheck(Integer fcId,Integer shopId,Integer lineId,String opCode,String prodCode,Integer pageNum,Integer pageSize) {
		// TODO Auto-generated method stub
		
		PageHelper page = new PageHelper();
		page.startPage(pageNum, pageSize);
		List<Map<String,Object>> resultList = this.prodProcessCheckDao.getProdProcessDataCheck(fcId, shopId, lineId, opCode, prodCode);
		PageInfo info = new PageInfo(resultList);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("data", resultList);
		resultMap.put("total", info.getTotal());
		return resultMap;
	}

	@Override
	public void insertProdProcessCheck(ProdProcessCheckPO prodProcessCheckPO) {
		// TODO Auto-generated method stub
		prodProcessCheckPO.setCreateTime(new Date());
		prodProcessCheckPO.setUpdateTime(new Date());
		this.prodProcessCheckDao.insertSelective(prodProcessCheckPO);
	}

	@Override
	public void updateProdProcessCheck(ProdProcessCheckPO prodProcessCheckPO) {
		// TODO Auto-generated method stub
		prodProcessCheckPO.setUpdateTime(new Date());
		this.prodProcessCheckDao.updateByPrimaryKeySelective(prodProcessCheckPO);
	}

	@Override
	public void deleteProcessCheck(Integer ppcId) {
		// TODO Auto-generated method stub
		this.prodProcessCheckDao.deleteByPrimaryKey(ppcId);
	}
}
