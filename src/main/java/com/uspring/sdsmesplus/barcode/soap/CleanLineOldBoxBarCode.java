
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CleanLineOldBoxBarCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CleanLineOldBoxBarCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineClearReportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoxBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialUsedNum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="MaterialRemainNum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="OpUserAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanLineOldBoxBarCode", propOrder = {
    "lineClearReportNo",
    "moNo",
    "site",
    "lineId",
    "boxBarCode",
    "materialCode",
    "materialUsedNum",
    "materialRemainNum",
    "opUserAccount"
})
public class CleanLineOldBoxBarCode {

    @XmlElement(name = "LineClearReportNo")
    protected String lineClearReportNo;
    @XmlElement(name = "MoNo")
    protected String moNo;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "BoxBarCode")
    protected String boxBarCode;
    @XmlElement(name = "MaterialCode")
    protected String materialCode;
    @XmlElement(name = "MaterialUsedNum")
    protected float materialUsedNum;
    @XmlElement(name = "MaterialRemainNum")
    protected float materialRemainNum;
    @XmlElement(name = "OpUserAccount")
    protected String opUserAccount;

    /**
     * 获取lineClearReportNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineClearReportNo() {
        return lineClearReportNo;
    }

    /**
     * 设置lineClearReportNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineClearReportNo(String value) {
        this.lineClearReportNo = value;
    }

    /**
     * 获取moNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoNo() {
        return moNo;
    }

    /**
     * 设置moNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoNo(String value) {
        this.moNo = value;
    }

    /**
     * 获取site属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置site属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * 获取lineId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * 设置lineId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * 获取boxBarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxBarCode() {
        return boxBarCode;
    }

    /**
     * 设置boxBarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxBarCode(String value) {
        this.boxBarCode = value;
    }

    /**
     * 获取materialCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialCode() {
        return materialCode;
    }

    /**
     * 设置materialCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialCode(String value) {
        this.materialCode = value;
    }

    /**
     * 获取materialUsedNum属性的值。
     * 
     */
    public float getMaterialUsedNum() {
        return materialUsedNum;
    }

    /**
     * 设置materialUsedNum属性的值。
     * 
     */
    public void setMaterialUsedNum(float value) {
        this.materialUsedNum = value;
    }

    /**
     * 获取materialRemainNum属性的值。
     * 
     */
    public float getMaterialRemainNum() {
        return materialRemainNum;
    }

    /**
     * 设置materialRemainNum属性的值。
     * 
     */
    public void setMaterialRemainNum(float value) {
        this.materialRemainNum = value;
    }

    /**
     * 获取opUserAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpUserAccount() {
        return opUserAccount;
    }

    /**
     * 设置opUserAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpUserAccount(String value) {
        this.opUserAccount = value;
    }

}
