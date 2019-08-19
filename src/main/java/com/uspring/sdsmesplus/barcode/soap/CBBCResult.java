
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBBCResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsuccessBBC���Ե�ֵ��
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
     * ����successBBC���Ե�ֵ��
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
     * ��ȡerrorBBC���Ե�ֵ��
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
     * ����errorBBC���Ե�ֵ��
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
     * ��ȡerrInfo���Ե�ֵ��
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
     * ����errInfo���Ե�ֵ��
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
     * ��ȡsendBillNo���Ե�ֵ��
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
     * ����sendBillNo���Ե�ֵ��
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
     * ��ȡtotalBBCCount���Ե�ֵ��
     * 
     */
    public int getTotalBBCCount() {
        return totalBBCCount;
    }

    /**
     * ����totalBBCCount���Ե�ֵ��
     * 
     */
    public void setTotalBBCCount(int value) {
        this.totalBBCCount = value;
    }

    /**
     * ��ȡconfirmedBBCCount���Ե�ֵ��
     * 
     */
    public int getConfirmedBBCCount() {
        return confirmedBBCCount;
    }

    /**
     * ����confirmedBBCCount���Ե�ֵ��
     * 
     */
    public void setConfirmedBBCCount(int value) {
        this.confirmedBBCCount = value;
    }

    /**
     * ��ȡconfirmDesc���Ե�ֵ��
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
     * ����confirmDesc���Ե�ֵ��
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
