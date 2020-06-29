package com.uspring.sdsmesplus.wms.impl;


import com.uspring.sdsmesplus.wms.WMSService;
import com.uspring.sdsmesplus.wms.entity.EWMStockDetails;
import com.uspring.sdsmesplus.wms.sap.f135.DTMESSTOCKDETAIL;
import com.uspring.sdsmesplus.wms.sap.f135.DTMESSTOCKDETAILRSP;
import com.uspring.sdsmesplus.wms.sap.f135.DTMESSTOCKDETAILRSPITEM;
import com.uspring.sdsmesplus.wms.sap.f135.SIMESSTOCKDETAILOut;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * * @author 作者 E-mail:chentengfei
 * 
 * @date 创建时间：2019年7月1日 下午4:42:38
 * @version 1.0 * @parameter
 * @since WMS实现类
 * @return
 */
@Service
public class WMSServiceImpl implements WMSService {

	private static Logger logger = LoggerFactory.getLogger(WMSServiceImpl.class);


	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");



	@Autowired
	private SIMESSTOCKDETAILOut sIMESSTOCKDETAILOut;

	@Autowired
	private Mapper dozerMapper;

	@Override
	public List<EWMStockDetails> getStockDetails(String prodBatchCode,String matWarehouseNum) {
		DTMESSTOCKDETAIL param = new DTMESSTOCKDETAIL();
		param.setIVCHARG(prodBatchCode);
		param.setIVLGNUM(matWarehouseNum);

		//如果没有库存直接给前端返回空
		DTMESSTOCKDETAILRSP dTMESSTOCKDETAILRSP = sIMESSTOCKDETAILOut.siMESSTOCKDETAILOut(param);
		DTMESSTOCKDETAILRSP.OTSTOCK  otstock = dTMESSTOCKDETAILRSP.getOTSTOCK();
		if(otstock == null){
			return null;
		}
		//取到ewm库存数据
		List<DTMESSTOCKDETAILRSPITEM> list= dTMESSTOCKDETAILRSP.getOTSTOCK().getITEM();
		//二次封装库存数据
		List<EWMStockDetails> newList = new ArrayList<EWMStockDetails>();
		for (DTMESSTOCKDETAILRSPITEM dtMESSTOCKDETAILRSPITEM : list) {
			EWMStockDetails eWMStockDetails = dozerMapper.map(dtMESSTOCKDETAILRSPITEM, EWMStockDetails.class);
			if(eWMStockDetails != null){
				newList.add(eWMStockDetails);
			}
		}
		return newList;
	}

}
