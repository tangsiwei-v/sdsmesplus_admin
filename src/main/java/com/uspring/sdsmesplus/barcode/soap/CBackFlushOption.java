
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBackFlushOption complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBackFlushOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NegativeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BackFlushLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackFlushSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackFlushDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UploadFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperateMode" type="{http://tempuri.org/}OperateModeEnum"/>
 *         &lt;element name="ErrorWay" type="{http://tempuri.org/}ErrorWayEnum"/>
 *         &lt;element name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBackFlushOption", propOrder = {
    "negativeFlag",
    "backFlushLoc",
    "backFlushSite",
    "backFlushDate",
    "shift",
    "pageUID",
    "uploadFilePath",
    "operateMode",
    "errorWay",
    "confirmed"
})
public class CBackFlushOption {

    @XmlElement(name = "NegativeFlag")
    protected boolean negativeFlag;
    @XmlElement(name = "BackFlushLoc")
    protected String backFlushLoc;
    @XmlElement(name = "BackFlushSite")
    protected String backFlushSite;
    @XmlElement(name = "BackFlushDate")
    protected String backFlushDate;
    @XmlElement(name = "Shift")
    protected String shift;
    @XmlElement(name = "PageUID")
    protected String pageUID;
    @XmlElement(name = "UploadFilePath")
    protected String uploadFilePath;
    @XmlElement(name = "OperateMode", required = true)
    @XmlSchemaType(name = "string")
    protected OperateModeEnum operateMode;
    @XmlElement(name = "ErrorWay", required = true)
    @XmlSchemaType(name = "string")
    protected ErrorWayEnum errorWay;
    @XmlElement(name = "Confirmed")
    protected boolean confirmed;

    /**
     * 获取negativeFlag属性的值。
     * 
     */
    public boolean isNegativeFlag() {
        return negativeFlag;
    }

    /**
     * 设置negativeFlag属性的值。
     * 
     */
    public void setNegativeFlag(boolean value) {
        this.negativeFlag = value;
    }

    /**
     * 获取backFlushLoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFlushLoc() {
        return backFlushLoc;
    }

    /**
     * 设置backFlushLoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFlushLoc(String value) {
        this.backFlushLoc = value;
    }

    /**
     * 获取backFlushSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFlushSite() {
        return backFlushSite;
    }

    /**
     * 设置backFlushSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFlushSite(String value) {
        this.backFlushSite = value;
    }

    /**
     * 获取backFlushDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFlushDate() {
        return backFlushDate;
    }

    /**
     * 设置backFlushDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFlushDate(String value) {
        this.backFlushDate = value;
    }

    /**
     * 获取shift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShift() {
        return shift;
    }

    /**
     * 设置shift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShift(String value) {
        this.shift = value;
    }

    /**
     * 获取pageUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageUID() {
        return pageUID;
    }

    /**
     * 设置pageUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageUID(String value) {
        this.pageUID = value;
    }

    /**
     * 获取uploadFilePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadFilePath() {
        return uploadFilePath;
    }

    /**
     * 设置uploadFilePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadFilePath(String value) {
        this.uploadFilePath = value;
    }

    /**
     * 获取operateMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperateModeEnum }
     *     
     */
    public OperateModeEnum getOperateMode() {
        return operateMode;
    }

    /**
     * 设置operateMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperateModeEnum }
     *     
     */
    public void setOperateMode(OperateModeEnum value) {
        this.operateMode = value;
    }

    /**
     * 获取errorWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ErrorWayEnum }
     *     
     */
    public ErrorWayEnum getErrorWay() {
        return errorWay;
    }

    /**
     * 设置errorWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorWayEnum }
     *     
     */
    public void setErrorWay(ErrorWayEnum value) {
        this.errorWay = value;
    }

    /**
     * 获取confirmed属性的值。
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * 设置confirmed属性的值。
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

}
