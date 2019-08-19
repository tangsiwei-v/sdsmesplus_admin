
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBackFlushBBCResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsuccessBBCList���Ե�ֵ��
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
     * ����successBBCList���Ե�ֵ��
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
     * ��ȡerrorBBCList���Ե�ֵ��
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
     * ����errorBBCList���Ե�ֵ��
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
     * ��ȡerrInfo���Ե�ֵ��
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
     * ����errInfo���Ե�ֵ��
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
     * ��ȡerrorInfoList���Ե�ֵ��
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
     * ����errorInfoList���Ե�ֵ��
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
     * ��ȡsubmitSuccesssFlag���Ե�ֵ��
     * 
     */
    public boolean isSubmitSuccesssFlag() {
        return submitSuccesssFlag;
    }

    /**
     * ����submitSuccesssFlag���Ե�ֵ��
     * 
     */
    public void setSubmitSuccesssFlag(boolean value) {
        this.submitSuccesssFlag = value;
    }

    /**
     * ��ȡbackFlushBillNoInfo���Ե�ֵ��
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
     * ����backFlushBillNoInfo���Ե�ֵ��
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
     * ��ȡtransferBillNoInfo���Ե�ֵ��
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
     * ����transferBillNoInfo���Ե�ֵ��
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
