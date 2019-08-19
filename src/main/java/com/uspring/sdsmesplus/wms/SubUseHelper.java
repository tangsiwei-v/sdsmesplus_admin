package com.uspring.sdsmesplus.wms;
/** * @author  作者 E-mail:
 * @date 创建时间：2019年7月12日 上午10:54:49 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public class SubUseHelper {
	
	//物料号
	private String useMatCode;
	
	//消耗数量
	private String useMatNum;
	
	//批次号
	private String piciCode;

	public String getUseMatCode() {
		return useMatCode;
	}

	public void setUseMatCode(String useMatCode) {
		this.useMatCode = useMatCode;
	}

	public String getUseMatNum() {
		return useMatNum;
	}

	public void setUseMatNum(String useMatNum) {
		this.useMatNum = useMatNum;
	}

	public String getPiciCode() {
		return piciCode;
	}

	public void setPiciCode(String piciCode) {
		this.piciCode = piciCode;
	}

}
