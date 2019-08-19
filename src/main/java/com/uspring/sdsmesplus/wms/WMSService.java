/**
 * @Title: WMSService.java 
 * @Package com.uspring.sdsmesplus.wms 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 上午8:44:11 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.wms;

import java.util.List;


import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.vo.PlanOrderVO;
import com.uspring.sdsmesplus.enums.SafeLunchResult;
import com.uspring.sdsmesplus.wms.entity.BatchCodeRequest;
import com.uspring.sdsmesplus.wms.entity.CleanType;
import com.uspring.sdsmesplus.wms.entity.HuType;
import com.uspring.sdsmesplus.wms.entity.MaterialCallRequest;
import com.uspring.sdsmesplus.wms.entity.MaterialSubmitHelper;
import com.uspring.sdsmesplus.wms.entity.MoveStockHelpDo;
import com.uspring.sdsmesplus.wms.entity.NonConformIsolationInfo;
import com.uspring.sdsmesplus.wms.entity.Package;


/**
 * @ClassName: WMSService
 * @Description: WMS系统交互接口
 * @author lihuan lihuan@uspring.cn
 * @date 2019年6月27日 上午8:44:11
 * 
 */
public interface WMSService {

	/**
	 * @Title: queryHuInfo
	 * @Description: 查询HU信息
	 * @param huCode
	 *            HU条码,可能是托盘条码
	 * @return 箱合格证信息列表
	 */
	public List<Package> queryHuInfo(String huCode);

	/**
	 * @Title: feedBox
	 * @Description: 物料上线移库
	 * @param boxLog,move
	 *            箱合格证对象
	 */
	public String feedBox(Package boxLog,MoveStockHelpDo move,String ordercode);
	

	/**
	 * @Title: getBatchCode
	 * @Description: 获取成品批次号
	 * @param batchReq
	 *            批次号请求对象
	 * @return 批次号
	 */
	public String getBatchCode(PlanOrderPO plan,BatchCodeRequest batchReq);


	/**
	 * @Title: submitProdBox
	 * @Description: 报工接口
	 * @param PlanOrderPO
	 *         Packge
	 *         processCode 报工序号 
	 *          workStation  工作中心
	 * @return void
	 * @throws Exception 
	 */
	
	public void submitProdBox(PlanOrderPO plan,Package sub,String processCode,String workStation,List<MaterialSubmitHelper> dtz);

	/**
	 * @Title: cleanLineStock
	 * @Description: 清线接口
	 * @param boxLogs
	 *            线上库存对象
	 * @return List<Package>
	 * @throws Exception 
	 */
	public List<Package> cleanLineStock(PlanOrderPO plan,CleanType clean,List<Package> cleanHelpDos) throws Exception;
	
	/**
	 * @Title: packageSplit
	 * @Description: 拆包接口
	 * @param oldPkg 旧箱信息
	 * @param splitCount 拆箱数量
	 * @return List<Package> 拆之后的Package
	 */
	public List<Package> packageSplit(Package oldPkg, int splitCount);
	
	/**
	 * @Title: safelunchJudge
	 * @Description: safelunch判定
	 * @param pkg 箱信息
	 */
	public void safelunchJudge(Package pkg, SafeLunchResult resultType);
	
	/**
	 * @Title: 发送拉料请求
	 * @Description: 发送拉料请求
	 * @param requestes 拉料请求对象列表
	 * @param pocode 工单号
	 * @return 
	 * @throws Exception 
	 */
	public void materialCall(List<MaterialCallRequest> requestes, String orderCode) throws Exception;

	/**
	 * @Title: 工单关闭
	 * @Description: 向WMS系统发送工单关闭消息
	 * @param PlanOrderVO 工单对象
	 * @return 
	 */
	public void closePlanOrder(PlanOrderVO order);
	
	/**
	 * @Title: 不合格品隔离
	 * @Description: 向WMS系统发送隔离消息
	 * @param List<NonConformIsolationInfo> 不合格品信息列表
	 * @return 
	 */
	public void nonconformIsolate(List<NonConformIsolationInfo> isolations);
}
