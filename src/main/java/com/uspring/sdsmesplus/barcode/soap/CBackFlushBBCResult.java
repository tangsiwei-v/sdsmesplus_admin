
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBackFlushBBCResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBackFlushBBCResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuccessBBCList" type="{http://tempuri.org/}ArrayOfCBackFlushBBC" minOccurs="0"/>
 *         &lt;element name="ErrorBBCList" type="{http://tempuri.org/}ArrayOfCBackFlushBBC" minOccurs="0"/>
 *         &lt;element name="ErrInfo" type="{http://tempuri.org/}CBackFlushErrorInfo" minOccurs="0"/>
 *         &lt;element name="ErrorInfoList" type="{http://tempuri.org/}ArrayOfCBackFlushErrorInfo" minOccurs="0"/>
 *         &lt;element name="SubmitSuccesssFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BackFlushBillNoInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferBillNoInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBackFlushBBCResult", propOrder = {
    "successBBCList",
    "errorBBCList",
    "errInfo",
    "errorInfoList",
    "submitSuccesssFlag",
    "backFlushBillNoInfo",
    "transferBillNoInfo"
})
public class CBackFlushBBCResult {

    @XmlElement(name = "SuccessBBCList")
    protected ArrayOfCBackFlushBBC successBBCList;
    @XmlElement(name = "ErrorBBCList")
    protected ArrayOfCBackFlushBBC errorBBCList;
    @XmlElement(name = "ErrInfo")
    protected CBackFlushErrorInfo errInfo;
    @XmlElement(name = "ErrorInfoList")
    protected ArrayOfCBackFlushErrorInfo errorInfoList;
    @XmlElement(name = "SubmitSuccesssFlag")
    protected boolean submitSuccesssFlag;
    @XmlElement(name = "BackFlushBillNoInfo")
    protected String backFlushBillNoInfo;
    @XmlElement(name = "TransferBillNoInfo")
    protected String transferBillNoInfo;

    /**
     * 获取successBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBackFlushBBC }
     *     
     */
    public ArrayOfCBackFlushBBC getSuccessBBCList() {
        return successBBCList;
    }

    /**
     * 设置successBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBackFlushBBC }
     *     
     */
    public void setSuccessBBCList(ArrayOfCBackFlushBBC value) {
        this.successBBCList = value;
    }

    /**
     * 获取errorBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBackFlushBBC }
     *     
     */
    public ArrayOfCBackFlushBBC getErrorBBCList() {
        return errorBBCList;
    }

    /**
     * 设置errorBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBackFlushBBC }
     *     
     */
    public void setErrorBBCList(ArrayOfCBackFlushBBC value) {
        this.errorBBCList = value;
    }

    /**
     * 获取errInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBackFlushErrorInfo }
     *     
     */
    public CBackFlushErrorInfo getErrInfo() {
        return errInfo;
    }

    /**
     * 设置errInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBackFlushErrorInfo }
     *     
     */
    public void setErrInfo(CBackFlushErrorInfo value) {
        this.errInfo = value;
    }

    /**
     * 获取errorInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBackFlushErrorInfo }
     *     
     */
    public ArrayOfCBackFlushErrorInfo getErrorInfoList() {
        return errorInfoList;
    }

    /**
     * 设置errorInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBackFlushErrorInfo }
     *     
     */
    public void setErrorInfoList(ArrayOfCBackFlushErrorInfo value) {
        this.errorInfoList = value;
    }

    /**
     * 获取submitSuccesssFlag属性的值。
     * 
     */
    public boolean isSubmitSuccesssFlag() {
        return submitSuccesssFlag;
    }

    /**
     * 设置submitSuccesssFlag属性的值。
     * 
     */
    public void setSubmitSuccesssFlag(boolean value) {
        this.submitSuccesssFlag = value;
    }

    /**
     * 获取backFlushBillNoInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFlushBillNoInfo() {
        return backFlushBillNoInfo;
    }

    /**
     * 设置backFlushBillNoInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFlushBillNoInfo(String value) {
        this.backFlushBillNoInfo = value;
    }

    /**
     * 获取transferBillNoInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferBillNoInfo() {
        return transferBillNoInfo;
    }

    /**
     * 设置transferBillNoInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferBillNoInfo(String value) {
        this.transferBillNoInfo = value;
    }

}
