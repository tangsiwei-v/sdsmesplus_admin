package com.uspring.sdsmesplus.wms.entity;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年7月2日 下午2:15:33
 * @version 1.0 * @parameter
 * @since
 * @return
 */
public class MoveStockHelpDo {
	// 目的库位 N
	private String NLTYP;
	// 目的仓位 N
	private String NLPLA;
	// 操作工 N
	private String CNNAME;
	public String getNLTYP() {
		return NLTYP;
	}
	public void setNLTYP(String nLTYP) {
		NLTYP = nLTYP;
	}
	public String getNLPLA() {
		return NLPLA;
	}
	public void setNLPLA(String nLPLA) {
		NLPLA = nLPLA;
	}
	public String getCNNAME() {
		return CNNAME;
	}
	public void setCNNAME(String cNNAME) {
		CNNAME = cNNAME;
	}
	@Override
	public String toString() {
		return "MoveStockHelpDo [NLTYP=" + NLTYP + ", NLPLA=" + NLPLA + ", CNNAME=" + CNNAME + "]";
	}
}
