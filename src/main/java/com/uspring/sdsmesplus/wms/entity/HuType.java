/**
 * @Title: HuType.java 
 * @Package com.uspring.sdsmesplus.wms.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月27日 上午8:58:53 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.wms.entity;

/** 
 * @ClassName: HuType 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月27日 上午8:58:53 
 *  
 */
public enum HuType {

	//采购
	CG,
	//回冲
	CK,
	//红牌
	HK,
	//进口
	JK,
	//精锻
	PF,
	//拆箱
	TK,
	//托盘
	TP,
	//仓库打包
	WM,
	//委外
	WW,
	//总成
	ZC,
	//过程条码（MES内部使用）
	WIP;
}
