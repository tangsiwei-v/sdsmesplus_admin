
package com.uspring.sdsmesplus.barcode.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MaterialRequireDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaterialRequireDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequireNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PullMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RemainingQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialRequireDetail", propOrder = {
    "requireNo",
    "moNo",
    "lineId",
    "stationCode",
    "materialCode",
    "reqQty",
    "unit",
    "partCode",
    "pullMethod",
    "targetTime",
    "remainingQty",
    "totalQty"
})
public class MaterialRequireDetail {

    @XmlElement(name = "RequireNo")
    protected String requireNo;
    @XmlElement(name = "MoNo")
    protected String moNo;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "StationCode")
    protected String stationCode;
    @XmlElement(name = "MaterialCode")
    protected String materialCode;
    @XmlElement(name = "ReqQty", required = true)
    protected BigDecimal reqQty;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "PartCode")
    protected String partCode;
    @XmlElement(name = "PullMethod")
    protected String pullMethod;
    @XmlElement(name = "TargetTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar targetTime;
    @XmlElement(name = "RemainingQty", required = true)
    protected BigDecimal remainingQty;
    @XmlElement(name = "TotalQty", required = true)
    protected BigDecimal totalQty;

    /**
     * 获取requireNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequireNo() {
        return requireNo;
    }

    /**
     * 设置requireNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequireNo(String value) {
        this.requireNo = value;
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
     * 获取stationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * 设置stationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
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
     * 获取reqQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqQty() {
        return reqQty;
    }

    /**
     * 设置reqQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqQty(BigDecimal value) {
        this.reqQty = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * 获取partCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartCode() {
        return partCode;
    }

    /**
     * 设置partCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartCode(String value) {
        this.partCode = value;
    }

    /**
     * 获取pullMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullMethod() {
        return pullMethod;
    }

    /**
     * 设置pullMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullMethod(String value) {
        this.pullMethod = value;
    }

    /**
     * 获取targetTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetTime() {
        return targetTime;
    }

    /**
     * 设置targetTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetTime(XMLGregorianCalendar value) {
        this.targetTime = value;
    }

    /**
     * 获取remainingQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingQty() {
        return remainingQty;
    }

    /**
     * 设置remainingQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingQty(BigDecimal value) {
        this.remainingQty = value;
    }

    /**
     * 获取totalQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQty() {
        return totalQty;
    }

    /**
     * 设置totalQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalQty(BigDecimal value) {
        this.totalQty = value;
    }

}
