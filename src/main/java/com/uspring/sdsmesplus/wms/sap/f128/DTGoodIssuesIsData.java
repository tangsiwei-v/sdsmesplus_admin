
package com.uspring.sdsmesplus.wms.sap.f128;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GoodIssues_Is_Data complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GoodIssues_Is_Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NISTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDATU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_GoodIssues_Is_Data", propOrder = {
    "lgnum",
    "aufnr",
    "matnr",
    "nista",
    "meins",
    "lgtyp",
    "lgpla",
    "cdatu",
    "messt",
    "mess"
})
public class DTGoodIssuesIsData {

    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "NISTA")
    protected String nista;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "LGTYP")
    protected String lgtyp;
    @XmlElement(name = "LGPLA")
    protected String lgpla;
    @XmlElement(name = "CDATU")
    protected String cdatu;
    @XmlElement(name = "MESS_T")
    protected String messt;
    @XmlElement(name = "MESS")
    protected String mess;

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
     * 获取nista属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNISTA() {
        return nista;
    }

    /**
     * 设置nista属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNISTA(String value) {
        this.nista = value;
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
     * 获取cdatu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDATU() {
        return cdatu;
    }

    /**
     * 设置cdatu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDATU(String value) {
        this.cdatu = value;
    }

    /**
     * 获取messt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESST() {
        return messt;
    }

    /**
     * 设置messt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESST(String value) {
        this.messt = value;
    }

    /**
     * 获取mess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESS() {
        return mess;
    }

    /**
     * 设置mess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESS(String value) {
        this.mess = value;
    }

}
