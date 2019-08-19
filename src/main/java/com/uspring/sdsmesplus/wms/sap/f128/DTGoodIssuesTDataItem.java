
package com.uspring.sdsmesplus.wms.sap.f128;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GoodIssues_T_Data_Item complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GoodIssues_T_Data_Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HUIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QUEUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_GoodIssues_T_Data_Item", propOrder = {
    "matnr",
    "tanum",
    "huident",
    "queue"
})
public class DTGoodIssuesTDataItem {

    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "TANUM")
    protected String tanum;
    @XmlElement(name = "HUIDENT")
    protected String huident;
    @XmlElement(name = "QUEUE")
    protected String queue;

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
     * 获取tanum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANUM() {
        return tanum;
    }

    /**
     * 设置tanum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANUM(String value) {
        this.tanum = value;
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
     * 获取queue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUEUE() {
        return queue;
    }

    /**
     * 设置queue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUEUE(String value) {
        this.queue = value;
    }

}
