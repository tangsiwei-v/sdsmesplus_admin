package com.uspring.sdsmesplus.wms.entity;

/** * @author  作者 E-mail:
 * @date 创建时间：2019年7月2日 下午4:42:12 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public class CleanHelpDo {
	//库位  清线时的线上库位       ---仓位----通过产线找线上库位，线边库位sysystorgbin   
	private String VLTYP;
	//库存类型    可传空                                   //根据储存类型  sysylinstorbin 中间表查询  
	private String CAT;                     
	//移库中转库位    选择清先后未完成物料去的地方 例：线边，回库等        ------仓位-------线边
	private String NLPLA;      
	//处理状态E/S
	private String Mess_T;
	//处理消息
	private String Mess;
	//新处理HU包装号    它返回过来的 不需要传入
	private String NLENR;                   
	//包装数量              清线返回的包装数量
	private String NISTA_P;
	//Package 类       这里面的数量是传过去清线的数量
	private Package packge;
	
	
	public Package getPackge() {
		return packge;
	}
	public void setPackge(Package packge) {
		this.packge = packge;
	}
	public String getVLTYP() {
		return VLTYP;
	}
	public void setVLTYP(String vLTYP) {
		VLTYP = vLTYP;
	}
	public String getCAT() {
		return CAT;
	}
	public void setCAT(String cAT) {
		CAT = cAT;
	}
	public String getNLPLA() {
		return NLPLA;
	}
	public void setNLPLA(String nLPLA) {
		NLPLA = nLPLA;
	}
	public String getMess_T() {
		return Mess_T;
	}
	public void setMess_T(String mess_T) {
		Mess_T = mess_T;
	}
	public String getMess() {
		return Mess;
	}
	public void setMess(String mess) {
		Mess = mess;
	}
	public String getNLENR() {
		return NLENR;
	}
	public void setNLENR(String nLENR) {
		NLENR = nLENR;
	}
	public String getNISTA_P() {
		return NISTA_P;
	}
	public void setNISTA_P(String nISTA_P) {
		NISTA_P = nISTA_P;
	}
	@Override
	public String toString() {
		return "CleanHelpDo [VLTYP=" + VLTYP + ", CAT=" + CAT + ", NLPLA=" + NLPLA + ", Mess_T=" + Mess_T + ", Mess="
				+ Mess + ", NLENR=" + NLENR + ", NISTA_P=" + NISTA_P + ", packge=" + packge + "]";
	}

}
