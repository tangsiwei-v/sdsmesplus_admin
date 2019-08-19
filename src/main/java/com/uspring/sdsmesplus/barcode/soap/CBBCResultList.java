
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBBCResultList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBBCResultList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Is_Confirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SuccessBBCList" type="{http://tempuri.org/}ArrayOfCBBC" minOccurs="0"/>
 *         &lt;element name="ErrorBBCList" type="{http://tempuri.org/}ArrayOfCBBC" minOccurs="0"/>
 *         &lt;element name="ErrInfo" type="{http://tempuri.org/}CErrorInfo" minOccurs="0"/>
 *         &lt;element name="ErrorInfoList" type="{http://tempuri.org/}ArrayOfCErrorInfo" minOccurs="0"/>
 *         &lt;element name="Confirm_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmitSuccesssFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CBBCResultList", propOrder = {
    "isConfirm",
    "successBBCList",
    "errorBBCList",
    "errInfo",
    "errorInfoList",
    "confirmDesc",
    "submitSuccesssFlag",
    "transferBillNoInfo"
})
public class CBBCResultList {

    @XmlElement(name = "Is_Confirm")
    protected boolean isConfirm;
    @XmlElement(name = "SuccessBBCList")
    protected ArrayOfCBBC successBBCList;
    @XmlElement(name = "ErrorBBCList")
    protected ArrayOfCBBC errorBBCList;
    @XmlElement(name = "ErrInfo")
    protected CErrorInfo errInfo;
    @XmlElement(name = "ErrorInfoList")
    protected ArrayOfCErrorInfo errorInfoList;
    @XmlElement(name = "Confirm_Desc")
    protected String confirmDesc;
    @XmlElement(name = "SubmitSuccesssFlag")
    protected boolean submitSuccesssFlag;
    @XmlElement(name = "TransferBillNoInfo")
    protected String transferBillNoInfo;

    /**
     * 获取isConfirm属性的值。
     * 
     */
    public boolean isIsConfirm() {
        return isConfirm;
    }

    /**
     * 设置isConfirm属性的值。
     * 
     */
    public void setIsConfirm(boolean value) {
        this.isConfirm = value;
    }

    /**
     * 获取successBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public ArrayOfCBBC getSuccessBBCList() {
        return successBBCList;
    }

    /**
     * 设置successBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public void setSuccessBBCList(ArrayOfCBBC value) {
        this.successBBCList = value;
    }

    /**
     * 获取errorBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public ArrayOfCBBC getErrorBBCList() {
        return errorBBCList;
    }

    /**
     * 设置errorBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public void setErrorBBCList(ArrayOfCBBC value) {
        this.errorBBCList = value;
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
     * 获取errorInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCErrorInfo }
     *     
     */
    public ArrayOfCErrorInfo getErrorInfoList() {
        return errorInfoList;
    }

    /**
     * 设置errorInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCErrorInfo }
     *     
     */
    public void setErrorInfoList(ArrayOfCErrorInfo value) {
        this.errorInfoList = value;
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
