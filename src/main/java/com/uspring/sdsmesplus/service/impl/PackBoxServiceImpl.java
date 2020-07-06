package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.BoxInfoDao;
import com.uspring.sdsmesplus.dao.generate.BoxInfoPODao;
import com.uspring.sdsmesplus.dao.generate.ProdBatchLogPODao;
import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample.Criteria;
import com.uspring.sdsmesplus.entity.vo.BoxInfoVO;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.PackBoxService;

@Service
public class PackBoxServiceImpl implements PackBoxService {

	@Autowired
	private BoxInfoPODao boxInfoPODao;

	@Autowired
	ProdBatchLogPODao prodBatchLogPODao;

	@Autowired
	private BoxInfoDao boxInfoDao;

	// 根据多条件查询状态
	public PageInfo<BoxInfoPO> searchBoxInfo(Map<String, Object> map) throws Exception {
		// 默认分页
		int pageNum = 1, pageSize = 10;
		if (map != null) {
			if (map.containsKey("page_num")) {
				pageNum = Integer.parseInt(map.get("page_num").toString());
			}
			if (map.containsKey("page_size")) {
				pageSize = Integer.parseInt(map.get("page_size").toString());
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date utilDate = null;
		PageHelper.startPage(pageNum, pageSize);
		BoxInfoPOExample boxInfoPOExample = new BoxInfoPOExample();
		Criteria a = boxInfoPOExample.createCriteria();
		if (map.containsKey("prod_code"))
			a.andProdCodeEqualTo(map.get("prod_code").toString());
		if (map.containsKey("start_time")) {
			utilDate = sdf.parse(map.get("start_time").toString());
			a.andCreateTimeLessThan(utilDate);
		}
		if (map.containsKey("end_time")) {
			sdf.parse(map.get("end_time").toString());
			a.andCreateTimeGreaterThan(utilDate);
		}
		List<BoxInfoPO> boxInPOs = boxInfoPODao.selectByExample(boxInfoPOExample);
		PageInfo<BoxInfoPO> pageInfo = new PageInfo<BoxInfoPO>(boxInPOs);
		return pageInfo;

	}

	@Override
	public BoxInfoPO queryboxLog(String prod_code, String customer_code,String recevier_code, Integer fc_id) {

		BoxInfoPOExample boxinfo = new BoxInfoPOExample();
		Criteria createCriteria = boxinfo.createCriteria();
		createCriteria.andProdCodeEqualTo(prod_code).andCustomerCodeEqualTo(customer_code).andFcIdEqualTo(fc_id)
				.andRecevierCodeEqualTo(recevier_code);
		List<BoxInfoPO> selectByExample = boxInfoPODao.selectByExample(boxinfo);
		if(selectByExample.size()>0){
			return selectByExample.get(0);
		}
		return null;
	}

	// 添加装箱数主数据
	public void insertBoxInfo(BoxInfoPO boxInfo) {
		boxInfo.setBifId(null);
		List<BoxInfoPO> repeat = boxInfoDao.repeat(boxInfo.getFcId(), boxInfo.getProdCode(), boxInfo.getCustomerCode() ,boxInfo.getRecevierCode());
		if (repeat.size() > 0)
			throw new ServiceException("装箱主数据已存在！");
		boxInfoDao.insertSelective(boxInfo);
	}

	// 修改装箱数主数据
	public void updateBoxInfo(BoxInfoPO boxInfo) {
		boxInfoDao.updateByPrimaryKey(boxInfo);
	}




	// 查询额定装箱数主数据
	public PageInfo<BoxInfoVO> standard(String prod_code, String customer_code,String recevierCode, Integer fcId, Integer page_size,
			Integer page_num) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		if (prod_code != null && !prod_code.equals("")) {
			prod_code = "%" + prod_code + "%";
		}
		PageHelper.startPage(page_num, page_size);
		List<BoxInfoVO> standard = boxInfoDao.standard(prod_code, customer_code,recevierCode, fcId, page_size, page_num);
		PageInfo<BoxInfoVO> pageInfo = new PageInfo<BoxInfoVO>(standard);
		return pageInfo;
	}

	// 删除装箱数主数据
	public void deleteBoxInfo(Integer bifId) {
		boxInfoDao.deleteByPrimaryKey(bifId);
	}

}
