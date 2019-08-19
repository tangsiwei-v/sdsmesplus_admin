package com.uspring.sdsmesplus.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.vo.OrderStockBomVO;
import com.uspring.sdsmesplus.wms.entity.Package;

/**
 * @Version 1.0
 * @Description:
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/6/21 13:59
 */
public interface PoStackService {

	/**
	 * 物料退料
	 * 
	 * @param orderCode
	 * @param boxCode
	 * @return com.uspring.sdsmesplus.entity.po.ProdBoxLogPO
	 * @date 2019/6/21 17:03
	 */
	public ProdCleanLogPO cleanstock(String orderCode, String boxCode) throws Exception;

	/**
	 * 箱合格证补打
	 * 
	 * @param orderCode
	 * @param boxCode
	 * @param prodBoxLogPO
	 * @return com.uspring.sdsmesplus.entity.po.ProdBoxLogPO
	 * @date 2019/6/21 17:04
	 */
	public void reprinter(String orderCode, ProdCleanLogPO prodCleanLogPO) throws Exception;

	/**
	 * 工单投料
	 * 
	 * @param orderCode
	 * @param prodBoxLogPO
	 * @return com.uspring.sdsmesplus.entity.po.ProdBoxLogPO
	 * @date 2019/6/21 17:42
	 */
	public Boolean workSheetFeeding(String orderCode, List<Package> packags) throws Exception;

	/**
	 * 清线
	 * 
	 * @param orderCode
	 * @param ProdCleanLogPO
	 * @return com.uspring.sdsmesplus.entity.po.List<ProdCleanLogPO>
	 * @throws Exception
	 * @date 2019/6/25 16:09
	 */
	public List<ProdCleanLogPO> clean(String orderCode) throws Exception;

	/**
	 * 查询某一个工单的线上物料库存
	 * 
	 * @param orderCode
	 * @param isopen
	 * @param iscleaned
	 * @return List<ProdBoxLogPO>
	 * @date 2019/6/25 16:58
	 */
	public List<ProdOrderStockPO> findLineStock(String orderCode, Boolean iscleaned, Boolean isopen);

	/**
	 * 清线合格证扫描确认
	 * 
	 * @param box_barcode
	 * @throws Exception
	 * @date 2019/7/9 15:48
	 */
	public void clean_confirm(String box_barcode) throws Exception;

	/**
	 * 查询清线记录
	 * 
	 * @param freeze_id，clean_status
	 * @throws Exception
	 * @date 2019/7/9 17:48
	 */
	public PageInfo<ProdCleanLogPO> cleanlog(String order_code, Boolean is_confirmed, String start_time,
			String end_time, Integer page_size, Integer page_num) throws Exception;

	/**
	 * 查询某一个工单的线上物料库存
	 * 
	 * @param orderCode
	 * @throws Exception
	 * @date 2019/7/9 17:48
	 */
	public List<OrderStockBomVO> findOrderMatStock(String orderCode) throws Exception;

}
