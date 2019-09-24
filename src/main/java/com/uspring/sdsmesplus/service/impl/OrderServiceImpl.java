package com.uspring.sdsmesplus.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.service.OrderService;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 订单实现类
 * @author chengtenfgei chentengfei@uspring.cn
 * @date 2019年6月18日 下午 13:16:04
 * 
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private PlanOrderDao planDao;

	@Override
	public PageInfo<PlanOrderPO> selectOrder(Map<String, Object> map) {
		if (map != null) {
			int pageNum = Integer.parseInt(map.get("page_num").toString());
			int pageSize = Integer.parseInt(map.get("page_size").toString());
			PageHelper.startPage(pageNum, pageSize);
			// 时间判断
			if (map.containsKey("start_time")) {
				String star = (String) map.get("start_time");
				map.put("starDate", star);
			}
			if (map.containsKey("end_time")) {
				String end = (String) map.get("end_time");
				map.put("endDate", end);
			}
			// 切割传入status
			if (map.containsKey("status")) {
				String stri = map.get("status").toString().replace("\"", "");
				List<String> status = new ArrayList<String>();
				String[] b = stri.substring(1, stri.length() - 1).split(",", 0);
				for (int i = 0; i < b.length; i++) {
					status.add(b[i]);
				}
				map.put("statusList", status);
			}
		}
		
		List<PlanOrderPO> list = planDao.queryPlanVO(map);
		PageInfo<PlanOrderPO> pageInfo = new PageInfo<PlanOrderPO>(list);
		return pageInfo;
	}

}
