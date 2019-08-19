
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CBackFlushErrorInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡerrorNo���Ե�ֵ��
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
     * ����errorNo���Ե�ֵ��
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
     * ��ȡerrorDesc���Ե�ֵ��
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
     * ����errorDesc���Ե�ֵ��
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
     * ��ȡerrorUserAccount���Ե�ֵ��
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
     * ����errorUserAccount���Ե�ֵ��
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
     * ��ȡerrorCreateTime���Ե�ֵ��
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
     * ����errorCreateTime���Ե�ֵ��
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
     * ��ȡerrorOperateMode���Ե�ֵ��
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
     * ����errorOperateMode���Ե�ֵ��
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
     * ��ȡerrorObjectType���Ե�ֵ��
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
     * ����errorObjectType���Ե�ֵ��
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
     * ��ȡerrorObjectCode���Ե�ֵ��
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
     * ����errorObjectCode���Ե�ֵ��
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
     * ��ȡerrorBBCParam���Ե�ֵ��
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
     * ����errorBBCParam���Ե�ֵ��
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
     * ��ȡerrorPartParam���Ե�ֵ��
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
     * ����errorPartParam���Ե�ֵ��
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
     * ��ȡerrorLocParam���Ե�ֵ��
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
     * ����errorLocParam���Ե�ֵ��
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
     * ��ȡerrorSiteParam���Ե�ֵ��
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
     * ����errorSiteParam���Ե�ֵ��
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
     * ��ȡerrorDomainParam���Ե�ֵ��
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
     * ����errorDomainParam���Ե�ֵ��
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
     * ��ȡerrorParam1���Ե�ֵ��
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
     * ����errorParam1���Ե�ֵ��
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
     * ��ȡerrorParam2���Ե�ֵ��
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
     * ����errorParam2���Ե�ֵ��
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
     * ��ȡerrorParam3���Ե�ֵ��
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
     * ����errorParam3���Ե�ֵ��
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
