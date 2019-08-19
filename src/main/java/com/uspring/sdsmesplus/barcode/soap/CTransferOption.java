
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTransferOption complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CTransferOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToShelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToLocCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CTransferOption", propOrder = {
    "toLoc",
    "toShelf",
    "toSite",
    "toLocCardNo",
    "transferDate",
    "shift",
    "pageUID",
    "uploadFilePath",
    "operateMode",
    "errorWay",
    "confirmed"
})
public class CTransferOption {

    @XmlElement(name = "ToLoc")
    protected String toLoc;
    @XmlElement(name = "ToShelf")
    protected String toShelf;
    @XmlElement(name = "ToSite")
    protected String toSite;
    @XmlElement(name = "ToLocCardNo")
    protected String toLocCardNo;
    @XmlElement(name = "TransferDate")
    protected String transferDate;
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
     * ��ȡtoLoc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLoc() {
        return toLoc;
    }

    /**
     * ����toLoc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLoc(String value) {
        this.toLoc = value;
    }

    /**
     * ��ȡtoShelf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToShelf() {
        return toShelf;
    }

    /**
     * ����toShelf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToShelf(String value) {
        this.toShelf = value;
    }

    /**
     * ��ȡtoSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSite() {
        return toSite;
    }

    /**
     * ����toSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSite(String value) {
        this.toSite = value;
    }

    /**
     * ��ȡtoLocCardNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLocCardNo() {
        return toLocCardNo;
    }

    /**
     * ����toLocCardNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLocCardNo(String value) {
        this.toLocCardNo = value;
    }

    /**
     * ��ȡtransferDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * ����transferDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDate(String value) {
        this.transferDate = value;
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
