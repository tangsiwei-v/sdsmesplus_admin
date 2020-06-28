package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.po.ProdBatchLogPO;
import com.uspring.sdsmesplus.entity.vo.BackMatBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBoxLogVO;

import java.util.List;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/11 10:06
 */
public interface RetrospectServer {

    List<ProdBatchCodeVO> listForwardTraceByMatBatchNo(String matBatchNo);


    List<BackMatBatchCodeVO> listReverseTraceByProdBatchCode(String prodBatchCode);

    List<ProdBatchLogPO> getByProdBatchCode(String prodBatchCode);

    List<ProdBoxLogVO> listBoxLogByProdBatchCode(String prodBatchCode);
}
