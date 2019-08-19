
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBBCResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBBCResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuccessBBC" type="{http://tempuri.org/}CBBC" minOccurs="0"/>
 *         &lt;element name="ErrorBBC" type="{http://tempuri.org/}CBBC" minOccurs="0"/>
 *         &lt;element name="ErrInfo" type="{http://tempuri.org/}CErrorInfo" minOccurs="0"/>
 *         &lt;element name="SendBillNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalBBCCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConfirmedBBCCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Confirm_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBBCResult", propOrder = {
    "successBBC",
    "errorBBC",
    "errInfo",
    "sendBillNo",
    "totalBBCCount",
    "confirmedBBCCount",
    "confirmDesc"
})
public class CBBCResult {

    @XmlElement(name = "SuccessBBC")
    protected CBBC successBBC;
    @XmlElement(name = "ErrorBBC")
    protected CBBC errorBBC;
    @XmlElement(name = "ErrInfo")
    protected CErrorInfo errInfo;
    @XmlElement(name = "SendBillNo")
    protected String sendBillNo;
    @XmlElement(name = "TotalBBCCount")
    protected int totalBBCCount;
    @XmlElement(name = "ConfirmedBBCCount")
    protected int confirmedBBCCount;
    @XmlElement(name = "Confirm_Desc")
    protected String confirmDesc;

    /**
     * 获取successBBC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBBC }
     *     
     */
    public CBBC getSuccessBBC() {
        return successBBC;
    }

    /**
     * 设置successBBC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBBC }
     *     
     */
    public void setSuccessBBC(CBBC value) {
        this.successBBC = value;
    }

    /**
     * 获取errorBBC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBBC }
     *     
     */
    public CBBC getErrorBBC() {
        return errorBBC;
    }

    /**
     * 设置errorBBC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBBC }
     *     
     */
    public void setErrorBBC(CBBC value) {
        this.errorBBC = value;
    }

    /**
     * 获取errInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CErrorInfo }
     *     
     */
    public CErrorInfo getErrInfo() {
        return errInfo;
    }

    /**
     * 设置errInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CErrorInfo }
     *     
     */
    public void setErrInfo(CErrorInfo value) {
        this.errInfo = value;
    }

    /**
     * 获取sendBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBillNo() {
        return sendBillNo;
    }

    /**
     * 设置sendBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBillNo(String value) {
        this.sendBillNo = value;
    }

    /**
     * 获取totalBBCCount属性的值。
     * 
     */
    public int getTotalBBCCount() {
        return totalBBCCount;
    }

    /**
     * 设置totalBBCCount属性的值。
     * 
     */
    public void setTotalBBCCount(int value) {
        this.totalBBCCount = value;
    }

    /**
     * 获取confirmedBBCCount属性的值。
     * 
     */
    public int getConfirmedBBCCount() {
        return confirmedBBCCount;
    }

    /**
     * 设置confirmedBBCCount属性的值。
     * 
     */
    public void setConfirmedBBCCount(int value) {
        this.confirmedBBCCount = value;
    }

    /**
     * 获取confirmDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmDesc() {
        return confirmDesc;
    }

    /**
     * 设置confirmDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmDesc(String value) {
        this.confirmDesc = value;
    }

}
