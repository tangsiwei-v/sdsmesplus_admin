package com.uspring.sdsmesplus.service.impl;

import com.uspring.sdsmesplus.dao.ProdBoxLogDao;
import com.uspring.sdsmesplus.dao.ProdBoxMaterialDao;
import com.uspring.sdsmesplus.dao.generate.ProdBatchLogPODao;
import com.uspring.sdsmesplus.entity.po.ProdBatchLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBatchLogPOExample;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import com.uspring.sdsmesplus.entity.vo.BackMatBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.MatBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBoxLogVO;
import com.uspring.sdsmesplus.service.RetrospectServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/11 10:08
 */
@Service
public class RetrospectServerImpl implements RetrospectServer {
    //零件装箱记录
    @Autowired
    private ProdBoxMaterialDao prodBoxMaterialDao;
    //零件装箱记录
    @Autowired
    private ProdBatchLogPODao prodBatchLogPODao;
    //装箱记录信息
    @Autowired
    private ProdBoxLogDao prodBoxLogDao;


    @Override
    public List<ProdBatchCodeVO> listForwardTraceByMatBatchNo(String matBatchNo) {
        return prodBoxMaterialDao.listForwardTraceByMatBatchNo(matBatchNo);
    }

    @Override
    public List<BackMatBatchCodeVO> listReverseTraceByProdBatchCode(String prodBatchCode) {
    	//首先根据批次查询成品物料和批号，如果批号多显示产品，批次在下一层
        List<MatBatchCodeVO> maters = prodBoxMaterialDao.listReverseTraceByProdBatchCode(prodBatchCode);
        
        List<BackMatBatchCodeVO> backs = new ArrayList<>();
        Map<String,List<MatBatchCodeVO>> map = new HashMap<String,List<MatBatchCodeVO>>();
        for (MatBatchCodeVO matBatchCodeVO : maters) {
			String key = matBatchCodeVO.getMatCode();
			if(map.containsKey(key)) {
				map.get(key).add(matBatchCodeVO);
			}else {
			List<MatBatchCodeVO> matVos = new ArrayList<MatBatchCodeVO>();
			matVos.add(matBatchCodeVO);
			map.put(key,matVos);
			}
		}
    	
        for(String key: map.keySet()) {
       	 BackMatBatchCodeVO back = new BackMatBatchCodeVO();
       	 if(map.get(key).size() == 1) {
       		 back.setMatCode(map.get(key).get(0).getMatCode());
       		 back.setMatBatchNo(map.get(key).get(0).getMatBatchNo());
       		 back.setMatCount(map.get(key).get(0).getMatCount());
       		 back.setMatName(map.get(key).get(0).getMatName());  
       		backs.add(back);
       	 }else {      	 
       		back.setMatCode(key);
       		back.setMatBatchNos(map.get(key));
       		backs.add(back);
       	 }
       	 }
            	
    	return backs;
    }

    @Override
    public List<ProdBatchLogPO> getByProdBatchCode(String prodBatchCode) {
        ProdBatchLogPOExample example = new ProdBatchLogPOExample();
        example.createCriteria().andProdBatchCodeEqualTo(prodBatchCode);
        return prodBatchLogPODao.selectByExample(example);
    }

    @Override
    public List<ProdBoxLogVO> listBoxLogByProdBatchCode(String prodBatchCode) {
        return prodBoxLogDao.selectBox_barcodeByProdBatchCode(prodBatchCode);
    }
}
