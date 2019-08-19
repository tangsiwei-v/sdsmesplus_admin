
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CScanBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CScanBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bbc_DeliveryFormNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_UploadFileGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_BoxBarCodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_To_Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_To_Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_To_Shelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_ScanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CScanBBC", propOrder = {
    "bbcDeliveryFormNo",
    "bbcUploadFileGUID",
    "bbcBoxBarCodeNo",
    "bbcToLoc",
    "bbcToSite",
    "bbcToShelf",
    "bbcScanTime"
})
public class CScanBBC {

    @XmlElement(name = "bbc_DeliveryFormNo")
    protected String bbcDeliveryFormNo;
    @XmlElement(name = "bbc_UploadFileGUID")
    protected String bbcUploadFileGUID;
    @XmlElement(name = "bbc_BoxBarCodeNo")
    protected String bbcBoxBarCodeNo;
    @XmlElement(name = "bbc_To_Loc")
    protected String bbcToLoc;
    @XmlElement(name = "bbc_To_Site")
    protected String bbcToSite;
    @XmlElement(name = "bbc_To_Shelf")
    protected String bbcToShelf;
    @XmlElement(name = "bbc_ScanTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bbcScanTime;

    /**
     * 获取bbcDeliveryFormNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcDeliveryFormNo() {
        return bbcDeliveryFormNo;
    }

    /**
     * 设置bbcDeliveryFormNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcDeliveryFormNo(String value) {
        this.bbcDeliveryFormNo = value;
    }

    /**
     * 获取bbcUploadFileGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcUploadFileGUID() {
        return bbcUploadFileGUID;
    }

    /**
     * 设置bbcUploadFileGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcUploadFileGUID(String value) {
        this.bbcUploadFileGUID = value;
    }

    /**
     * 获取bbcBoxBarCodeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcBoxBarCodeNo() {
        return bbcBoxBarCodeNo;
    }

    /**
     * 设置bbcBoxBarCodeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcBoxBarCodeNo(String value) {
        this.bbcBoxBarCodeNo = value;
    }

    /**
     * 获取bbcToLoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcToLoc() {
        return bbcToLoc;
    }

    /**
     * 设置bbcToLoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcToLoc(String value) {
        this.bbcToLoc = value;
    }

    /**
     * 获取bbcToSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcToSite() {
        return bbcToSite;
    }

    /**
     * 设置bbcToSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcToSite(String value) {
        this.bbcToSite = value;
    }

    /**
     * 获取bbcToShelf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcToShelf() {
        return bbcToShelf;
    }

    /**
     * 设置bbcToShelf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcToShelf(String value) {
        this.bbcToShelf = value;
    }

    /**
     * 获取bbcScanTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBbcScanTime() {
        return bbcScanTime;
    }

    /**
     * 设置bbcScanTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBbcScanTime(XMLGregorianCalendar value) {
        this.bbcScanTime = value;
    }

}
