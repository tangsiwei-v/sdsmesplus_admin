
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CScanBackFlushBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CScanBackFlushBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bbc_UploadFileGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_BoxBarCodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_ScanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bbc_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_BomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_LineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_LineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CScanBackFlushBBC", propOrder = {
    "bbcUploadFileGUID",
    "bbcBoxBarCodeNo",
    "bbcScanTime",
    "bbcRouting",
    "bbcOp",
    "bbcBomCode",
    "bbcLineCode",
    "bbcLineId"
})
public class CScanBackFlushBBC {

    @XmlElement(name = "bbc_UploadFileGUID")
    protected String bbcUploadFileGUID;
    @XmlElement(name = "bbc_BoxBarCodeNo")
    protected String bbcBoxBarCodeNo;
    @XmlElement(name = "bbc_ScanTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bbcScanTime;
    @XmlElement(name = "bbc_Routing")
    protected String bbcRouting;
    @XmlElement(name = "bbc_Op")
    protected String bbcOp;
    @XmlElement(name = "bbc_BomCode")
    protected String bbcBomCode;
    @XmlElement(name = "bbc_LineCode")
    protected String bbcLineCode;
    @XmlElement(name = "bbc_LineId")
    protected int bbcLineId;

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

    /**
     * 获取bbcRouting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcRouting() {
        return bbcRouting;
    }

    /**
     * 设置bbcRouting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcRouting(String value) {
        this.bbcRouting = value;
    }

    /**
     * 获取bbcOp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcOp() {
        return bbcOp;
    }

    /**
     * 设置bbcOp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcOp(String value) {
        this.bbcOp = value;
    }

    /**
     * 获取bbcBomCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcBomCode() {
        return bbcBomCode;
    }

    /**
     * 设置bbcBomCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcBomCode(String value) {
        this.bbcBomCode = value;
    }

    /**
     * 获取bbcLineCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcLineCode() {
        return bbcLineCode;
    }

    /**
     * 设置bbcLineCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcLineCode(String value) {
        this.bbcLineCode = value;
    }

    /**
     * 获取bbcLineId属性的值。
     * 
     */
    public int getBbcLineId() {
        return bbcLineId;
    }

    /**
     * 设置bbcLineId属性的值。
     * 
     */
    public void setBbcLineId(int value) {
        this.bbcLineId = value;
    }

}
