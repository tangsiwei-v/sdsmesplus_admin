
package com.uspring.sdsmesplus.wms.sap.f132;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_IS_DATA complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_IS_DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENTITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NISTA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PACK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NISTA_P" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_IS_DATA", propOrder = {
    "lgnum",
    "vlenr",
    "vltyp",
    "vlpla",
    "cat",
    "matnr",
    "entitled",
    "charg",
    "nista",
    "pack",
    "nlpla",
    "messt",
    "mess",
    "nlenr",
    "nistap"
})
public class DTISDATA {

    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "VLENR")
    protected String vlenr;
    @XmlElement(name = "VLTYP")
    protected String vltyp;
    @XmlElement(name = "VLPLA")
    protected String vlpla;
    @XmlElement(name = "CAT")
    protected String cat;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "ENTITLED")
    protected String entitled;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "NISTA", defaultValue = "0")
    protected BigDecimal nista;
    @XmlElement(name = "PACK")
    protected String pack;
    @XmlElement(name = "NLPLA")
    protected String nlpla;
    @XmlElement(name = "MESS_T")
    protected String messt;
    @XmlElement(name = "MESS")
    protected String mess;
    @XmlElement(name = "NLENR")
    protected String nlenr;
    @XmlElement(name = "NISTA_P", defaultValue = "0")
    protected BigDecimal nistap;

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
     * 获取vlenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLENR() {
        return vlenr;
    }

    /**
     * 设置vlenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLENR(String value) {
        this.vlenr = value;
    }

    /**
     * 获取vltyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLTYP() {
        return vltyp;
    }

    /**
     * 设置vltyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLTYP(String value) {
        this.vltyp = value;
    }

    /**
     * 获取vlpla属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLPLA() {
        return vlpla;
    }

    /**
     * 设置vlpla属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLPLA(String value) {
        this.vlpla = value;
    }

    /**
     * 获取cat属性的值。
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
     * 设置cat属性的值。
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
     * 获取nista属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNISTA() {
        return nista;
    }

    /**
     * 设置nista属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNISTA(BigDecimal value) {
        this.nista = value;
    }

    /**
     * 获取pack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACK() {
        return pack;
    }

    /**
     * 设置pack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACK(String value) {
        this.pack = value;
    }

    /**
     * 获取nlpla属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLPLA() {
        return nlpla;
    }

    /**
     * 设置nlpla属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLPLA(String value) {
        this.nlpla = value;
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

    /**
     * 获取nlenr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLENR() {
        return nlenr;
    }

    /**
     * 设置nlenr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLENR(String value) {
        this.nlenr = value;
    }

    /**
     * 获取nistap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNISTAP() {
        return nistap;
    }

    /**
     * 设置nistap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNISTAP(BigDecimal value) {
        this.nistap = value;
    }

}
