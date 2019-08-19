
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CBackFlushOption complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnegativeFlag���Ե�ֵ��
     * 
     */
    public boolean isNegativeFlag() {
        return negativeFlag;
    }

    /**
     * ����negativeFlag���Ե�ֵ��
     * 
     */
    public void setNegativeFlag(boolean value) {
        this.negativeFlag = value;
    }

    /**
     * ��ȡbackFlushLoc���Ե�ֵ��
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
     * ����backFlushLoc���Ե�ֵ��
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
     * ��ȡbackFlushSite���Ե�ֵ��
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
     * ����backFlushSite���Ե�ֵ��
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
     * ��ȡbackFlushDate���Ե�ֵ��
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
     * ����backFlushDate���Ե�ֵ��
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
     * ��ȡshift���Ե�ֵ��
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
     * ����shift���Ե�ֵ��
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
     * ��ȡpageUID���Ե�ֵ��
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
     * ����pageUID���Ե�ֵ��
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
     * ��ȡuploadFilePath���Ե�ֵ��
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
     * ����uploadFilePath���Ե�ֵ��
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
     * ��ȡoperateMode���Ե�ֵ��
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
     * ����operateMode���Ե�ֵ��
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
     * ��ȡerrorWay���Ե�ֵ��
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
     * ����errorWay���Ե�ֵ��
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
     * ��ȡconfirmed���Ե�ֵ��
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * ����confirmed���Ե�ֵ��
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

}
