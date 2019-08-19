
package com.uspring.sdsmesplus.wms.sap.f133;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GetHuData_Item complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GetHuData_Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VLENR_H" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WRKST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QUAN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGTYP_Z" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGPLA_Z" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WDATU" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="G_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="G_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M_VERSION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H_TREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSPECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KUNNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOBM_LIFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOBM_LICHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOBM_HSDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_BATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KDMAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_GetHuData_Item", propOrder = {
    "vlenrh",
    "lgnum",
    "entitled",
    "huident",
    "matnr",
    "bismt",
    "wrkst",
    "maktx",
    "charg",
    "quan",
    "lgtyp",
    "lgpla",
    "lgtypz",
    "lgplaz",
    "wdatu",
    "meins",
    "mdate",
    "gdate",
    "snumber",
    "glevel",
    "mversion",
    "htreat",
    "inspector",
    "remark",
    "kunnr",
    "lobmlifnr",
    "lobmlicha",
    "lobmhsdat",
    "rmatnr",
    "rbatch",
    "kdmat"
})
public class DTGetHuDataItem {

    @XmlElement(name = "VLENR_H")
    protected String vlenrh;
    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "ENTITLED")
    protected String entitled;
    @XmlElement(name = "HUIDENT")
    protected String huident;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "BISMT")
    protected String bismt;
    @XmlElement(name = "WRKST")
    protected String wrkst;
    @XmlElement(name = "MAKTX")
    protected String maktx;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "QUAN")
    protected BigDecimal quan;
    @XmlElement(name = "LGTYP")
    protected String lgtyp;
    @XmlElement(name = "LGPLA")
    protected String lgpla;
    @XmlElement(name = "LGTYP_Z")
    protected String lgtypz;
    @XmlElement(name = "LGPLA_Z")
    protected String lgplaz;
    @XmlElement(name = "WDATU")
    protected BigDecimal wdatu;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "M_DATE")
    protected String mdate;
    @XmlElement(name = "G_DATE")
    protected String gdate;
    @XmlElement(name = "S_NUMBER")
    protected String snumber;
    @XmlElement(name = "G_LEVEL")
    protected String glevel;
    @XmlElement(name = "M_VERSION")
    protected String mversion;
    @XmlElement(name = "H_TREAT")
    protected String htreat;
    @XmlElement(name = "INSPECTOR")
    protected String inspector;
    @XmlElement(name = "REMARK")
    protected String remark;
    @XmlElement(name = "KUNNR")
    protected String kunnr;
    @XmlElement(name = "LOBM_LIFNR")
    protected String lobmlifnr;
    @XmlElement(name = "LOBM_LICHA")
    protected String lobmlicha;
    @XmlElement(name = "LOBM_HSDAT")
    protected String lobmhsdat;
    @XmlElement(name = "R_MATNR")
    protected String rmatnr;
    @XmlElement(name = "R_BATCH")
    protected String rbatch;
    @XmlElement(name = "KDMAT")
    protected String kdmat;

    /**
     * 获取vlenrh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLENRH() {
        return vlenrh;
    }

    /**
     * 设置vlenrh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLENRH(String value) {
        this.vlenrh = value;
    }

    /**
     * 获取lgnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGNUM() {
        return lgnum;
    }

    /**
     * 设置lgnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGNUM(String value) {
        this.lgnum = value;
    }

    /**
     * 获取entitled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITLED() {
        return entitled;
    }

    /**
     * 设置entitled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITLED(String value) {
        this.entitled = value;
    }

    /**
     * 获取huident属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUIDENT() {
        return huident;
    }

    /**
     * 设置huident属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUIDENT(String value) {
        this.huident = value;
    }

    /**
     * 获取matnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * 设置matnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * 获取bismt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBISMT() {
        return bismt;
    }

    /**
     * 设置bismt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBISMT(String value) {
        this.bismt = value;
    }

    /**
     * 获取wrkst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWRKST() {
        return wrkst;
    }

    /**
     * 设置wrkst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWRKST(String value) {
        this.wrkst = value;
    }

    /**
     * 获取maktx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKTX() {
        return maktx;
    }

    /**
     * 设置maktx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKTX(String value) {
        this.maktx = value;
    }

    /**
     * 获取charg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARG() {
        return charg;
    }

    /**
     * 设置charg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARG(String value) {
        this.charg = value;
    }

    /**
     * 获取quan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQUAN() {
        return quan;
    }

    /**
     * 设置quan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQUAN(BigDecimal value) {
        this.quan = value;
    }

    /**
     * 获取lgtyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGTYP() {
        return lgtyp;
    }

    /**
     * 设置lgtyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGTYP(String value) {
        this.lgtyp = value;
    }

    /**
     * 获取lgpla属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGPLA() {
        return lgpla;
    }

    /**
     * 设置lgpla属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGPLA(String value) {
        this.lgpla = value;
    }

    /**
     * 获取lgtypz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGTYPZ() {
        return lgtypz;
    }

    /**
     * 设置lgtypz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGTYPZ(String value) {
        this.lgtypz = value;
    }

    /**
     * 获取lgplaz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGPLAZ() {
        return lgplaz;
    }

    /**
     * 设置lgplaz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGPLAZ(String value) {
        this.lgplaz = value;
    }

    /**
     * 获取wdatu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWDATU() {
        return wdatu;
    }

    /**
     * 设置wdatu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWDATU(BigDecimal value) {
        this.wdatu = value;
    }

    /**
     * 获取meins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINS() {
        return meins;
    }

    /**
     * 设置meins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINS(String value) {
        this.meins = value;
    }

    /**
     * 获取mdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDATE() {
        return mdate;
    }

    /**
     * 设置mdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDATE(String value) {
        this.mdate = value;
    }

    /**
     * 获取gdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGDATE() {
        return gdate;
    }

    /**
     * 设置gdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGDATE(String value) {
        this.gdate = value;
    }

    /**
     * 获取snumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNUMBER() {
        return snumber;
    }

    /**
     * 设置snumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNUMBER(String value) {
        this.snumber = value;
    }

    /**
     * 获取glevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLEVEL() {
        return glevel;
    }

    /**
     * 设置glevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLEVEL(String value) {
        this.glevel = value;
    }

    /**
     * 获取mversion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVERSION() {
        return mversion;
    }

    /**
     * 设置mversion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVERSION(String value) {
        this.mversion = value;
    }

    /**
     * 获取htreat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTREAT() {
        return htreat;
    }

    /**
     * 设置htreat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTREAT(String value) {
        this.htreat = value;
    }

    /**
     * 获取inspector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPECTOR() {
        return inspector;
    }

    /**
     * 设置inspector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPECTOR(String value) {
        this.inspector = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
    }

    /**
     * 获取kunnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNNR() {
        return kunnr;
    }

    /**
     * 设置kunnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNNR(String value) {
        this.kunnr = value;
    }

    /**
     * 获取lobmlifnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBMLIFNR() {
        return lobmlifnr;
    }

    /**
     * 设置lobmlifnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBMLIFNR(String value) {
        this.lobmlifnr = value;
    }

    /**
     * 获取lobmlicha属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBMLICHA() {
        return lobmlicha;
    }

    /**
     * 设置lobmlicha属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBMLICHA(String value) {
        this.lobmlicha = value;
    }

    /**
     * 获取lobmhsdat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBMHSDAT() {
        return lobmhsdat;
    }

    /**
     * 设置lobmhsdat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBMHSDAT(String value) {
        this.lobmhsdat = value;
    }

    /**
     * 获取rmatnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMATNR() {
        return rmatnr;
    }

    /**
     * 设置rmatnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMATNR(String value) {
        this.rmatnr = value;
    }

    /**
     * 获取rbatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBATCH() {
        return rbatch;
    }

    /**
     * 设置rbatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBATCH(String value) {
        this.rbatch = value;
    }

    /**
     * 获取kdmat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT() {
        return kdmat;
    }

    /**
     * 设置kdmat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT(String value) {
        this.kdmat = value;
    }

}
