
package com.uspring.sdsmesplus.wms.sap.f135;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MES_STOCKDETAIL_RSP_ITEM complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_MES_STOCKDETAIL_RSP_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUIDENT_TOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIT_W" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAT_TXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OWNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZEUGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QUAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UI_WDATU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UI_WDATT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="LOBM_LWEDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_BATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRD_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_MES_STOCKDETAIL_RSP_ITEM", propOrder = {
    "lgtyp",
    "lgpla",
    "rsrc",
    "huident",
    "huidenttop",
    "weight",
    "unitw",
    "matnr",
    "maktx",
    "cat",
    "cattxt",
    "owner",
    "entitled",
    "charg",
    "zeugn",
    "quan",
    "unit",
    "uiwdatu",
    "uiwdatt",
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
    "lobmlwedt",
    "rmatnr",
    "rbatch",
    "prdline"
})
public class DTMESSTOCKDETAILRSPITEM {

    @XmlElement(name = "LGTYP")
    protected String lgtyp;
    @XmlElement(name = "LGPLA")
    protected String lgpla;
    @XmlElement(name = "RSRC")
    protected String rsrc;
    @XmlElement(name = "HUIDENT")
    protected String huident;
    @XmlElement(name = "HUIDENT_TOP")
    protected String huidenttop;
    @XmlElement(name = "WEIGHT")
    protected String weight;
    @XmlElement(name = "UNIT_W")
    protected String unitw;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "MAKTX")
    protected String maktx;
    @XmlElement(name = "CAT")
    protected String cat;
    @XmlElement(name = "CAT_TXT")
    protected String cattxt;
    @XmlElement(name = "OWNER")
    protected String owner;
    @XmlElement(name = "ENTITLED")
    protected String entitled;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "ZEUGN")
    protected String zeugn;
    @XmlElement(name = "QUAN")
    protected String quan;
    @XmlElement(name = "UNIT")
    protected String unit;
    @XmlElement(name = "UI_WDATU")
    protected String uiwdatu;
    @XmlElement(name = "UI_WDATT")
    protected String uiwdatt;
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
    @XmlElement(name = "LOBM_LWEDT")
    protected String lobmlwedt;
    @XmlElement(name = "R_MATNR")
    protected String rmatnr;
    @XmlElement(name = "R_BATCH")
    protected String rbatch;
    @XmlElement(name = "PRD_LINE")
    protected String prdline;

    /**
     * ��ȡlgtyp���Ե�ֵ��
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
     * ����lgtyp���Ե�ֵ��
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
     * ��ȡlgpla���Ե�ֵ��
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
     * ����lgpla���Ե�ֵ��
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
     * ��ȡrsrc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSRC() {
        return rsrc;
    }

    /**
     * ����rsrc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSRC(String value) {
        this.rsrc = value;
    }

    /**
     * ��ȡhuident���Ե�ֵ��
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
     * ����huident���Ե�ֵ��
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
     * ��ȡhuidenttop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHUIDENTTOP() {
        return huidenttop;
    }

    /**
     * ����huidenttop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHUIDENTTOP(String value) {
        this.huidenttop = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWEIGHT() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWEIGHT(String value) {
        this.weight = value;
    }

    /**
     * ��ȡunitw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITW() {
        return unitw;
    }

    /**
     * ����unitw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITW(String value) {
        this.unitw = value;
    }

    /**
     * ��ȡmatnr���Ե�ֵ��
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
     * ����matnr���Ե�ֵ��
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
     * ��ȡmaktx���Ե�ֵ��
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
     * ����maktx���Ե�ֵ��
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
     * ��ȡcat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAT() {
        return cat;
    }

    /**
     * ����cat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAT(String value) {
        this.cat = value;
    }

    /**
     * ��ȡcattxt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATTXT() {
        return cattxt;
    }

    /**
     * ����cattxt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATTXT(String value) {
        this.cattxt = value;
    }

    /**
     * ��ȡowner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOWNER() {
        return owner;
    }

    /**
     * ����owner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOWNER(String value) {
        this.owner = value;
    }

    /**
     * ��ȡentitled���Ե�ֵ��
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
     * ����entitled���Ե�ֵ��
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
     * ��ȡcharg���Ե�ֵ��
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
     * ����charg���Ե�ֵ��
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
     * ��ȡzeugn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEUGN() {
        return zeugn;
    }

    /**
     * ����zeugn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEUGN(String value) {
        this.zeugn = value;
    }

    /**
     * ��ȡquan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUAN() {
        return quan;
    }

    /**
     * ����quan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUAN(String value) {
        this.quan = value;
    }

    /**
     * ��ȡunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
        return unit;
    }

    /**
     * ����unit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIT(String value) {
        this.unit = value;
    }

    /**
     * ��ȡuiwdatu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIWDATU() {
        return uiwdatu;
    }

    /**
     * ����uiwdatu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIWDATU(String value) {
        this.uiwdatu = value;
    }

    /**
     * ��ȡuiwdatt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIWDATT() {
        return uiwdatt;
    }

    /**
     * ����uiwdatt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIWDATT(String value) {
        this.uiwdatt = value;
    }

    /**
     * ��ȡgdate���Ե�ֵ��
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
     * ����gdate���Ե�ֵ��
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
     * ��ȡsnumber���Ե�ֵ��
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
     * ����snumber���Ե�ֵ��
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
     * ��ȡglevel���Ե�ֵ��
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
     * ����glevel���Ե�ֵ��
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
     * ��ȡmversion���Ե�ֵ��
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
     * ����mversion���Ե�ֵ��
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
     * ��ȡhtreat���Ե�ֵ��
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
     * ����htreat���Ե�ֵ��
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
     * ��ȡinspector���Ե�ֵ��
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
     * ����inspector���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡkunnr���Ե�ֵ��
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
     * ����kunnr���Ե�ֵ��
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
     * ��ȡlobmlifnr���Ե�ֵ��
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
     * ����lobmlifnr���Ե�ֵ��
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
     * ��ȡlobmlicha���Ե�ֵ��
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
     * ����lobmlicha���Ե�ֵ��
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
     * ��ȡlobmlwedt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOBMLWEDT() {
        return lobmlwedt;
    }

    /**
     * ����lobmlwedt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOBMLWEDT(String value) {
        this.lobmlwedt = value;
    }

    /**
     * ��ȡrmatnr���Ե�ֵ��
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
     * ����rmatnr���Ե�ֵ��
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
     * ��ȡrbatch���Ե�ֵ��
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
     * ����rbatch���Ե�ֵ��
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
     * ��ȡprdline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDLINE() {
        return prdline;
    }

    /**
     * ����prdline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDLINE(String value) {
        this.prdline = value;
    }

}
