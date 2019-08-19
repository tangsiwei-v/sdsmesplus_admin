
package com.uspring.sdsmesplus.wms.sap.f045;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_ZSEAFKO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_ZSEAFKO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZHIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZEMPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GAMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMEIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXIDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLUZP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLTRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VORNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VGW01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VGW02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VHILM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZWSTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZSRESBL" type="{urn:mes:PPOrderHours}DT_ZSRESBL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZSEAFKO", propOrder = {
    "zhind",
    "zguid",
    "zempno",
    "werks",
    "aufnr",
    "matnr",
    "gamng",
    "gmein",
    "exidv",
    "charg",
    "verid",
    "gluzp",
    "gltrp",
    "vornr",
    "vgw01",
    "vgw02",
    "vhilm",
    "zwstation",
    "zsresbl"
})
public class DTZSEAFKO {

    @XmlElement(name = "ZHIND")
    protected String zhind;
    @XmlElement(name = "ZGUID")
    protected String zguid;
    @XmlElement(name = "ZEMPNO")
    protected String zempno;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "GAMNG")
    protected String gamng;
    @XmlElement(name = "GMEIN")
    protected String gmein;
    @XmlElement(name = "EXIDV")
    protected String exidv;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "VERID")
    protected String verid;
    @XmlElement(name = "GLUZP")
    protected String gluzp;
    @XmlElement(name = "GLTRP")
    protected String gltrp;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "VGW01")
    protected String vgw01;
    @XmlElement(name = "VGW02")
    protected String vgw02;
    @XmlElement(name = "VHILM")
    protected String vhilm;
    @XmlElement(name = "ZWSTATION")
    protected String zwstation;
    @XmlElement(name = "ZSRESBL")
    protected List<DTZSRESBL> zsresbl;

    /**
     * 获取zhind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZHIND() {
        return zhind;
    }

    /**
     * 设置zhind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZHIND(String value) {
        this.zhind = value;
    }

    /**
     * 获取zguid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZGUID() {
        return zguid;
    }

    /**
     * 设置zguid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZGUID(String value) {
        this.zguid = value;
    }

    /**
     * 获取zempno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEMPNO() {
        return zempno;
    }

    /**
     * 设置zempno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEMPNO(String value) {
        this.zempno = value;
    }

    /**
     * 获取werks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * 设置werks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * 获取aufnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUFNR() {
        return aufnr;
    }

    /**
     * 设置aufnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUFNR(String value) {
        this.aufnr = value;
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
     * 获取gamng属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGAMNG() {
        return gamng;
    }

    /**
     * 设置gamng属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGAMNG(String value) {
        this.gamng = value;
    }

    /**
     * 获取gmein属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMEIN() {
        return gmein;
    }

    /**
     * 设置gmein属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMEIN(String value) {
        this.gmein = value;
    }

    /**
     * 获取exidv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXIDV() {
        return exidv;
    }

    /**
     * 设置exidv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXIDV(String value) {
        this.exidv = value;
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
     * 获取verid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERID() {
        return verid;
    }

    /**
     * 设置verid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERID(String value) {
        this.verid = value;
    }

    /**
     * 获取gluzp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLUZP() {
        return gluzp;
    }

    /**
     * 设置gluzp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLUZP(String value) {
        this.gluzp = value;
    }

    /**
     * 获取gltrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLTRP() {
        return gltrp;
    }

    /**
     * 设置gltrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLTRP(String value) {
        this.gltrp = value;
    }

    /**
     * 获取vornr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNR() {
        return vornr;
    }

    /**
     * 设置vornr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNR(String value) {
        this.vornr = value;
    }

    /**
     * 获取vgw01属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGW01() {
        return vgw01;
    }

    /**
     * 设置vgw01属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGW01(String value) {
        this.vgw01 = value;
    }

    /**
     * 获取vgw02属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGW02() {
        return vgw02;
    }

    /**
     * 设置vgw02属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGW02(String value) {
        this.vgw02 = value;
    }

    /**
     * 获取vhilm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILM() {
        return vhilm;
    }

    /**
     * 设置vhilm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILM(String value) {
        this.vhilm = value;
    }

    /**
     * 获取zwstation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZWSTATION() {
        return zwstation;
    }

    /**
     * 设置zwstation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZWSTATION(String value) {
        this.zwstation = value;
    }

    /**
     * Gets the value of the zsresbl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zsresbl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZSRESBL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZSRESBL }
     * 
     * 
     */
    public List<DTZSRESBL> getZSRESBL() {
        if (zsresbl == null) {
            zsresbl = new ArrayList<DTZSRESBL>();
        }
        return this.zsresbl;
    }

	public List<DTZSRESBL> getZsresbl() {
		return zsresbl;
	}

	public void setZsresbl(List<DTZSRESBL> zsresbl) {
		this.zsresbl = zsresbl;
	}

}
