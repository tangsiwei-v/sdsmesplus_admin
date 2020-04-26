package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.uspring.sdsmesplus.dao.ProdProcessCheckDao;
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPOExample;
import com.uspring.sdsmesplus.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.DeviceVerifyItemDao;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.vo.DeviceVerifyItemVO;
import com.uspring.sdsmesplus.service.DeviceVerifyItemServer;

/**
 * @ClassName: DeviceVerifyItemServerImpl
 * @Version 1.0
 * @author: shangyanbing shangyanbing@uspring.cn
 * @date: 2019年8月7日 上午11:49:31
 */

@Service
public class DeviceVerifyItemServerImpl implements DeviceVerifyItemServer {
	@Autowired
	private DeviceVerifyItemDao deviceVerifyItemDao;

	@Autowired
	private ProdProcessCheckDao prodProcessCheckDao;

	// 添加设备防错要求
	public void insertDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemDao.insertSelective(deviceVerifyItem);
	}

	// 修改设备防错要求
	public void updateDeviceVerifyItem(SysDeviceVerifyItemPO deviceVerifyItem) {
		deviceVerifyItemDao.updateByPrimaryKey(deviceVerifyItem);
	}

	// 删除设备防错要求
	public void deleteDeviceVerifyItem(Integer dviId) {
		deviceVerifyItemDao.deleteByPrimaryKey(dviId);
	}

	// 查询设备防错要求
	public PageInfo<DeviceVerifyItemVO> queryDeviceVerifyItem(Integer lineId, Integer page_size, Integer page_num,
			Integer shopId, Integer fcId) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<DeviceVerifyItemVO> deviceVerifyItems = deviceVerifyItemDao.queryDeviceVerifyItem(lineId, page_size,
				page_num, shopId, fcId);
		PageInfo<DeviceVerifyItemVO> pageInfo = new PageInfo<DeviceVerifyItemVO>(deviceVerifyItems);
		return pageInfo;
	}

	@Override
	public PageInfo<ProdProcessCheckPO> queryPordProcessCheckService(Integer lineId, String prodCode, Integer page_size, Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 100;
		}
		PageHelper.startPage(page_num, page_size);
		ProdProcessCheckPOExample prodProcessCheckPOExample = new ProdProcessCheckPOExample();
		if (prodCode != null && !"".equals(prodCode)) {
			prodProcessCheckPOExample.createCriteria().andProdCodeEqualTo(prodCode).andLineIdEqualTo(lineId);
		} else {
			prodProcessCheckPOExample.createCriteria().andLineIdEqualTo(lineId);
		}

		List<ProdProcessCheckPO> prodProcessCheckPOS = this.prodProcessCheckDao.selectByExample(prodProcessCheckPOExample);
		PageInfo<ProdProcessCheckPO> pageInfo = new PageInfo<ProdProcessCheckPO>(prodProcessCheckPOS);
		return pageInfo;
	}

	@Override
	public int insertPordProcessCheckService(ProdProcessCheckPO prodProcessCheckPO) {

		String prodCode = prodProcessCheckPO.getProdCode();
		ProdProcessCheckPOExample prodProcessCheckPOExample = new ProdProcessCheckPOExample();
		prodProcessCheckPOExample.createCriteria().andProdCodeEqualTo(prodCode);
		List<ProdProcessCheckPO> prodProcessCheckPOS = this.prodProcessCheckDao.selectByExample(prodProcessCheckPOExample);
		if (!prodProcessCheckPOS.isEmpty()) {
			throw new ServiceException("该产品已经配置过了");
		}

		List<String> list = new ArrayList<String>();
		list.add("lianjiezhou_jiance1");
		list.add("lianjiezhou_jiance2");
		list.add("lianjiezhouyaji1");
		list.add("lianjiezhouyaji2");
		list.add("lianjiezhouyaji3");
		list.add("lianjiezhouyaji4");
		prodProcessCheckPO.setCreateTime(new Date());
		prodProcessCheckPO.setLineId(161);
		for (String s : list) {
			prodProcessCheckPO.setOpCode(s);
			this.prodProcessCheckDao.insertSelective(prodProcessCheckPO);
		}
		return 1;
	}

	@Override
	public int updatePordProcessCheckService(ProdProcessCheckPO prodProcessCheckPO) {
		ProdProcessCheckPOExample prodProcessCheckPOExample = new ProdProcessCheckPOExample();
		prodProcessCheckPOExample.createCriteria().andPpcIdEqualTo(prodProcessCheckPO.getPpcId());
		List<ProdProcessCheckPO> prodProcessCheckPOS = this.prodProcessCheckDao.selectByExample(prodProcessCheckPOExample);
		String prodCode = prodProcessCheckPOS.get(0).getProdCode();

		if (!prodProcessCheckPOS.isEmpty() && !prodCode.equals(prodProcessCheckPO.getProdCode()))	{
			prodProcessCheckPOExample.clear();
			prodProcessCheckPOExample.createCriteria().andProdCodeEqualTo(prodCode);
			List<ProdProcessCheckPO> processCheckPOS = this.prodProcessCheckDao.selectByExample(prodProcessCheckPOExample);
			for (ProdProcessCheckPO processCheckPO : processCheckPOS) {
				processCheckPO.setProdCode(prodProcessCheckPO.getProdCode());
				this.prodProcessCheckDao.updateByPrimaryKeySelective(processCheckPO);
			}
		}

		return this.prodProcessCheckDao.updateByPrimaryKeySelective(prodProcessCheckPO);
	}

	@Override
	public int deletePordProcessCheckService(Integer ppcId) {
		ProdProcessCheckPO prodProcessCheckPO = this.prodProcessCheckDao.selectByPrimaryKey(ppcId);
		ProdProcessCheckPOExample prodProcessCheckPOExample = new ProdProcessCheckPOExample();
		prodProcessCheckPOExample.createCriteria().andProdCodeEqualTo(prodProcessCheckPO.getProdCode());
		return this.prodProcessCheckDao.deleteByExample(prodProcessCheckPOExample);
	}

}
