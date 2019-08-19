
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CBackFlushErrorInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBackFlushErrorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_UserAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Error_OperateMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_ObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_BBCParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_PartParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_LocParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_SiteParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_DomainParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBackFlushErrorInfo", propOrder = {
    "errorNo",
    "errorDesc",
    "errorUserAccount",
    "errorCreateTime",
    "errorOperateMode",
    "errorObjectType",
    "errorObjectCode",
    "errorBBCParam",
    "errorPartParam",
    "errorLocParam",
    "errorSiteParam",
    "errorDomainParam",
    "errorParam1",
    "errorParam2",
    "errorParam3"
})
public class CBackFlushErrorInfo {

    @XmlElement(name = "Error_No")
    protected String errorNo;
    @XmlElement(name = "Error_Desc")
    protected String errorDesc;
    @XmlElement(name = "Error_UserAccount")
    protected String errorUserAccount;
    @XmlElement(name = "Error_CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar errorCreateTime;
    @XmlElement(name = "Error_OperateMode")
    protected String errorOperateMode;
    @XmlElement(name = "Error_ObjectType")
    protected String errorObjectType;
    @XmlElement(name = "Error_ObjectCode")
    protected String errorObjectCode;
    @XmlElement(name = "Error_BBCParam")
    protected String errorBBCParam;
    @XmlElement(name = "Error_PartParam")
    protected String errorPartParam;
    @XmlElement(name = "Error_LocParam")
    protected String errorLocParam;
    @XmlElement(name = "Error_SiteParam")
    protected String errorSiteParam;
    @XmlElement(name = "Error_DomainParam")
    protected String errorDomainParam;
    @XmlElement(name = "Error_Param1")
    protected String errorParam1;
    @XmlElement(name = "Error_Param2")
    protected String errorParam2;
    @XmlElement(name = "Error_Param3")
    protected String errorParam3;

    /**
     * 获取errorNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorNo() {
        return errorNo;
    }

    /**
     * 设置errorNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorNo(String value) {
        this.errorNo = value;
    }

    /**
     * 获取errorDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * 设置errorDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * 获取errorUserAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUserAccount() {
        return errorUserAccount;
    }

    /**
     * 设置errorUserAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUserAccount(String value) {
        this.errorUserAccount = value;
    }

    /**
     * 获取errorCreateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErrorCreateTime() {
        return errorCreateTime;
    }

    /**
     * 设置errorCreateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErrorCreateTime(XMLGregorianCalendar value) {
        this.errorCreateTime = value;
    }

    /**
     * 获取errorOperateMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorOperateMode() {
        return errorOperateMode;
    }

    /**
     * 设置errorOperateMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorOperateMode(String value) {
        this.errorOperateMode = value;
    }

    /**
     * 获取errorObjectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorObjectType() {
        return errorObjectType;
    }

    /**
     * 设置errorObjectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorObjectType(String value) {
        this.errorObjectType = value;
    }

    /**
     * 获取errorObjectCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorObjectCode() {
        return errorObjectCode;
    }

    /**
     * 设置errorObjectCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorObjectCode(String value) {
        this.errorObjectCode = value;
    }

    /**
     * 获取errorBBCParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorBBCParam() {
        return errorBBCParam;
    }

    /**
     * 设置errorBBCParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorBBCParam(String value) {
        this.errorBBCParam = value;
    }

    /**
     * 获取errorPartParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorPartParam() {
        return errorPartParam;
    }

    /**
     * 设置errorPartParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorPartParam(String value) {
        this.errorPartParam = value;
    }

    /**
     * 获取errorLocParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLocParam() {
        return errorLocParam;
    }

    /**
     * 设置errorLocParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLocParam(String value) {
        this.errorLocParam = value;
    }

    /**
     * 获取errorSiteParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSiteParam() {
        return errorSiteParam;
    }

    /**
     * 设置errorSiteParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSiteParam(String value) {
        this.errorSiteParam = value;
    }

    /**
     * 获取errorDomainParam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDomainParam() {
        return errorDomainParam;
    }

    /**
     * 设置errorDomainParam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDomainParam(String value) {
        this.errorDomainParam = value;
    }

    /**
     * 获取errorParam1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorParam1() {
        return errorParam1;
    }

    /**
     * 设置errorParam1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorParam1(String value) {
        this.errorParam1 = value;
    }

    /**
     * 获取errorParam2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorParam2() {
        return errorParam2;
    }

    /**
     * 设置errorParam2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorParam2(String value) {
        this.errorParam2 = value;
    }

    /**
     * 获取errorParam3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorParam3() {
        return errorParam3;
    }

    /**
     * 设置errorParam3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorParam3(String value) {
        this.errorParam3 = value;
    }

}
