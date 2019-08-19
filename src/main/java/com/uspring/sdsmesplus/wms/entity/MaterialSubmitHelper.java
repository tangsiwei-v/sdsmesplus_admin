package com.uspring.sdsmesplus.wms.entity;

/** * @author  作者 E-mail:chentengfei
 * @date 创建时间：2019年7月8日 下午9:37:50
 * @version 1.0 * @parameter  
 * @since   等同于DTZSRESBL类
 * @return  
*/
public class MaterialSubmitHelper {
	
    private String posnr;
    private String matnr;
    private String bdmng;
    private String meins;
    //批次
    private String charg;
    private String lgnum;
    private String prvbe;
    
	public String getPosnr() {
		return posnr;
	}
	public void setPosnr(String posnr) {
		this.posnr = posnr;
	}
	public String getMatnr() {
		return matnr;
	}
	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}
	public String getBdmng() {
		return bdmng;
	}
	public void setBdmng(String bdmng) {
		this.bdmng = bdmng;
	}
	public String getMeins() {
		return meins;
	}
	public void setMeins(String meins) {
		this.meins = meins;
	}
	public String getCharg() {
		return charg;
	}
	public void setCharg(String charg) {
		this.charg = charg;
	}
	public String getLgnum() {
		return lgnum;
	}
	public void setLgnum(String lgnum) {
		this.lgnum = lgnum;
	}
	public String getPrvbe() {
		return prvbe;
	}
	public void setPrvbe(String prvbe) {
		this.prvbe = prvbe;
	}
	
	@Override
	public String toString() {
		return "MaterialSubmitHelper [posnr=" + posnr + ", matnr=" + matnr + ", bdmng=" + bdmng + ", meins=" + meins
				+ ", charg=" + charg + ", lgnum=" + lgnum + ", prvbe=" + prvbe + "]";
	}


    
	
}
