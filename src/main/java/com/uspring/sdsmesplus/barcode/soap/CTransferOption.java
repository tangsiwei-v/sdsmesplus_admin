
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTransferOption complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取toLoc属性的值。
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
     * 设置toLoc属性的值。
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
     * 获取toShelf属性的值。
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
     * 设置toShelf属性的值。
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
     * 获取toSite属性的值。
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
     * 设置toSite属性的值。
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
     * 获取toLocCardNo属性的值。
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
     * 设置toLocCardNo属性的值。
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
     * 获取transferDate属性的值。
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
     * 设置transferDate属性的值。
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
     * 获取shift属性的值。
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
     * 设置shift属性的值。
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
     * 获取pageUID属性的值。
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
     * 设置pageUID属性的值。
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
     * 获取uploadFilePath属性的值。
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
     * 设置uploadFilePath属性的值。
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
     * 获取operateMode属性的值。
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
     * 设置operateMode属性的值。
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
     * 获取errorWay属性的值。
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
     * 设置errorWay属性的值。
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
     * 获取confirmed属性的值。
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * 设置confirmed属性的值。
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

}
