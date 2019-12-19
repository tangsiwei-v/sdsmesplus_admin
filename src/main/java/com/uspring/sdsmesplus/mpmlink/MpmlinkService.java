/**
 * @Title: MpmlinkService.java 
 * @Package org.uspring.natiefu.mes.mpmlink 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年7月24日 下午12:05:11 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mpmlink;

import java.util.List;

/**
 * @ClassName: MpmlinkService
 * @Description: Mpmlink服务接口
 * @author lihuan lihuan@uspring.cn
 * @date 2018年7月24日 下午12:05:11
 * 
 */
public interface MpmlinkService {

	/**
	 * @Title: queryBom
	 * @Description: 查询产品BOM
	 * @param prodCode
	 *            产品简码
	 * @param lineCode
	 *            产线编码
	 * @return 返回BOM对象
	 * @throws Exception 
	 */
	public List<BomMaterial> queryBom(String prodCode, Integer fcId) throws Exception;
	
}
