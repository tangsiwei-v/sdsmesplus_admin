package com.uspring.sdsmesplus.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.common.DateUtils;
import com.uspring.sdsmesplus.common.ExportXls;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.SysFactoryDao;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
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
	
	@Autowired
	private SysFactoryDao sysFactoryDao;

	@Override
	public PageInfo<PlanOrderPO> selectOrder(Map<String, Object> map,Integer isExport, HttpServletResponse response) {
		if (map != null) {
			int pageNum = Integer.parseInt(map.get("page_num").toString());
			int pageSize = Integer.parseInt(map.get("page_size").toString());
			if(isExport != 1){
				PageHelper.startPage(pageNum, pageSize);
			}
			
			// 时间判断
			if (map.containsKey("start_time")) {
				String star = (String) map.get("start_time");
				map.put("starDate", star);
			}
			if (map.containsKey("end_time")) {
				String end = (String) map.get("end_time");
				end = DateUtils.dealEndTime(end);
				map.put("endDate", end);
			}
			// 切割传入status
			if (map.containsKey("status")) {
				if(!map.get("status").equals("")){
					String stri = map.get("status").toString().replace("\"", "");
					List<String> status = new ArrayList<String>();
					String[] b = stri.split(",");
					for (int i = 0; i < b.length; i++) {
						status.add(b[i]);
					}
					map.put("statusList", status);
				}
			}
		}
		
		List<PlanOrderPO> list = planDao.queryPlanVO(map);
		
		//是否导出
		if(isExport == 1){
			List<Object> objList = new ArrayList<Object>();
			for(PlanOrderPO planOrder:list){
				objList.add(planOrder);
			}
			
			List<Map<String,Object>> mapList = ExportXls.entityListToMapList(objList);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			for(Map<String,Object> dataMap:mapList){
				String status = "";
				if(dataMap.get("poStatus").toString().equals("Assigned")){
					status = "下达";
				}else if(dataMap.get("poStatus").toString().equals("Executing")){
					status = "执行";
				}else if(dataMap.get("poStatus").toString().equals("Frozen")){
					status = "冻结";
				}else if(dataMap.get("poStatus").toString().equals("Completed")){
					status = "完成";
				}
				dataMap.put("status", status);
				
				String startTime = df.format(dataMap.get("poStartDatetime"));
				dataMap.put("startTime", startTime);
				String endTime = df.format(dataMap.get("poEndDatetime"));
				dataMap.put("endTime", endTime);
			}
			
			List<String> titleList = new ArrayList<String>();
			titleList.add("工单号 ");
			titleList.add("产品简码");
			titleList.add("产品名称");
			titleList.add("产品老简码");
			titleList.add("客户号");
			titleList.add("数量");
			titleList.add("计划开始");
			titleList.add("计划结束");
			titleList.add("状态");
			
			List<String> columnList = new ArrayList<String>();
			columnList.add("poCode");
			columnList.add("prodCode");
			columnList.add("prodName");
			columnList.add("prodNumber");
			columnList.add("customerCode");
			columnList.add("poCount");
			columnList.add("startTime");
			columnList.add("endTime");
			columnList.add("status");
			
			ExportXls.exportXls(mapList, response, titleList, columnList, "工单报表");
	    }
		
		PageInfo<PlanOrderPO> pageInfo = new PageInfo<PlanOrderPO>(list);
		return pageInfo;
	}

	@Override
	public List<PlanOrderPO> selectPrinterByFactory(Integer fcId) {
		
    SysFactoryPO factory = sysFactoryDao.selectByPrimaryKey(fcId);
    
    List<PlanOrderPO> listPO1s = planDao.queryByFcCode(factory.getFcCode());   
    
    List<PlanOrderPO> listPO2s = planDao.queryNullVO(factory.getFcCode());    
    
	List<PlanOrderPO> listPOs = planDao.queryPrintVO(factory.getFcCode());

	listPO1s.removeAll(listPOs);
	listPO1s.removeAll(listPO2s);
	
	return listPO1s;
	}


}
