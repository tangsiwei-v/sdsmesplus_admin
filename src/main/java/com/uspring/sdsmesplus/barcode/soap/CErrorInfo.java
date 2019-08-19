
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CErrorInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CErrorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_UserAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Error_Param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_Param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Error_OperateMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CErrorInfo", propOrder = {
    "errorNo",
    "errorDesc",
    "errorUserAccount",
    "errorCreateTime",
    "errorParam1",
    "errorParam2",
    "errorParam3",
    "errorParam4",
    "errorParam5",
    "errorOperateMode"
})
public class CErrorInfo {

    @XmlElement(name = "Error_No")
    protected String errorNo;
    @XmlElement(name = "Error_Desc")
    protected String errorDesc;
    @XmlElement(name = "Error_UserAccount")
    protected String errorUserAccount;
    @XmlElement(name = "Error_CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar errorCreateTime;
    @XmlElement(name = "Error_Param1")
    protected String errorParam1;
    @XmlElement(name = "Error_Param2")
    protected String errorParam2;
    @XmlElement(name = "Error_Param3")
    protected String errorParam3;
    @XmlElement(name = "Error_Param4")
    protected String errorParam4;
    @XmlElement(name = "Error_Param5")
    protected String errorParam5;
    @XmlElement(name = "Error_OperateMode")
    protected String errorOperateMode;

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

    /**
     * 获取errorParam4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorParam4() {
        return errorParam4;
    }

    /**
     * 设置errorParam4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorParam4(String value) {
        this.errorParam4 = value;
    }

    /**
     * 获取errorParam5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorParam5() {
        return errorParam5;
    }

    /**
     * 设置errorParam5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorParam5(String value) {
        this.errorParam5 = value;
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

}
