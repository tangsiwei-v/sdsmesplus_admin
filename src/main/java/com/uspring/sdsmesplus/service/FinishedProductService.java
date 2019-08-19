package com.uspring.sdsmesplus.service;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * @Version 1.0
 * @Description:
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/1 11:33
 */
public interface FinishedProductService {

    /**
     * 产品下线
     * @param pfBarcode 条形码
     * @param weightVerifyWithOutRfid 是否执行不带RFID称重防错逻辑
     * @param prodFinishedProductPO 产品信息
     * @return int
     * @throws Exception 
     * @date 2019/7/1 13:14
     */
    int productOut(String pfBarcode, boolean weightVerifyWithOutRfid, ProdFinishedProductPO prodFinishedProductPO) throws Exception;

    /**
     * 总成替换
     * @param pfBarcode
     * @param fp_barcode_new 
     * @return int
     * @date 2019/7/2 11:04
     */
    boolean productReplace(String pfBarcode, String fp_barcode_new);

    /**
     * 总成报废
     * @param pfBarcode
     * @return boolean
     * @date 2019/7/2 13:21
     */
    boolean productDelete(String pfBarcode);

    /**
     * 成品查询
     * @return java.util.List<com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO>
     * @date 2019/7/10 14:35
     */
    PageInfo<ProdFinishedProductPO> getProds(Map<String,Object> para)throws Exception;


    /**
     * 成品状态修改
     * @param fp_barcode
     * @param to_status
     * @return java.util.List<com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO>
     * @date 2019/7/10 15:48
     */
    boolean change_status(String fp_barcode,String to_status)throws Exception;
   
    /**
     * 总成补打
     * @param prod_code
     * @param customer_code
     * @param line_id 
     * @return 产品打印模板实体表
     * @date 2019/7/26 10:13
     */
	void print(String prod_code, String customer_code, Integer line_id);

}
