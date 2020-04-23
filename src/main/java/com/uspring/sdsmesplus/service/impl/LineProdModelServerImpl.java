package com.uspring.sdsmesplus.service.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.LineProdModelDao;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.vo.LineProdmodelVO;
import com.uspring.sdsmesplus.service.LineProdModelServer;

/**
 * @ClassName: LineProdModelServerImpl
 * @Version 1.0
 * @author shangyanbing shangyanbing@uspring.cn
 * @date 2019年10月21日 下午5:20:43
 */
@Service
public class LineProdModelServerImpl implements LineProdModelServer {

	@Autowired
	private LineProdModelDao prodModeldao;

	// 查询产线模式主数据
	public PageInfo<LineProdmodelVO> queryLineProdmodel(Integer lineId, Integer fcId, Integer page_size,
			Integer page_num, Integer shopId) {
		if (page_num == null) {
			page_num = 1;
		}
		if (page_size == null) {
			page_size = 1000;
		}
		PageHelper.startPage(page_num, page_size);
		List<LineProdmodelVO> lineProdmodels = prodModeldao.queryLineProdmodel(lineId, fcId, page_size, page_num, shopId);
		PageInfo<LineProdmodelVO> pageInfo = new PageInfo<LineProdmodelVO>(lineProdmodels);
		return pageInfo;
	}

	// 添加产线模式主数据
	public void insertLineProdmodel(SysLineProdmodelPO lineProdmodel) {
		
		if(lineProdmodel.getExtraRate() != null){
			lineProdmodel.setExtraRate(new BigDecimal((lineProdmodel.getExtraRate().doubleValue() / 100)+ ""));
		}

		if(lineProdmodel.getFeedLimitRate() != null){
			lineProdmodel.setFeedLimitRate(new BigDecimal((lineProdmodel.getFeedLimitRate().doubleValue() / 100)+ ""));
		}
		
		prodModeldao.insertSelective(lineProdmodel);
	}

	// 修改产线模式主数据
	public void updateLineProdmodel(SysLineProdmodelPO lineProdmodel) {

		if(lineProdmodel.getExtraRate() != null){
			lineProdmodel.setExtraRate(new BigDecimal((lineProdmodel.getExtraRate().doubleValue() / 100)+ ""));
		}

		if(lineProdmodel.getFeedLimitRate() != null){
			lineProdmodel.setFeedLimitRate(new BigDecimal((lineProdmodel.getFeedLimitRate().doubleValue() / 100)+ ""));
		}
		prodModeldao.updateByPrimaryKey(lineProdmodel);
	}

	// 删除产线模式主数据
	public void deleteLineProdmodel(Integer linemodId) {
		prodModeldao.deleteByPrimaryKey(linemodId);
	}

}
