
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FinishedProductBoxBarCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FinishedProductBoxBarCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoxBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBCType" type="{http://tempuri.org/}enumBBCType"/>
 *         &lt;element name="PlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProduceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FurnaceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BoxQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPartNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Shift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BomVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FinishedProductBoxBarCode", propOrder = {
    "msgNo",
    "boxBarCode",
    "bbcType",
    "planId",
    "moNo",
    "site",
    "lineId",
    "partCode",
    "produceNo",
    "furnaceNo",
    "grade",
    "boxQty",
    "qty",
    "customerNo",
    "customerPartNo",
    "moStartDate",
    "shift",
    "bomCode",
    "bomVersion",
    "routingCode",
    "op",
    "opUserAccount"
})
public class FinishedProductBoxBarCode {

    @XmlElement(name = "MsgNo")
    protected String msgNo;
    @XmlElement(name = "BoxBarCode")
    protected String boxBarCode;
    @XmlElement(name = "BBCType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumBBCType bbcType;
    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "MoNo")
    protected String moNo;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "PartCode")
    protected String partCode;
    @XmlElement(name = "ProduceNo")
    protected String produceNo;
    @XmlElement(name = "FurnaceNo")
    protected String furnaceNo;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "BoxQty")
    protected int boxQty;
    @XmlElement(name = "Qty")
    protected int qty;
    @XmlElement(name = "CustomerNo")
    protected String customerNo;
    @XmlElement(name = "CustomerPartNo")
    protected String customerPartNo;
    @XmlElement(name = "MoStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moStartDate;
    @XmlElement(name = "Shift")
    protected String shift;
    @XmlElement(name = "BomCode")
    protected String bomCode;
    @XmlElement(name = "BomVersion")
    protected String bomVersion;
    @XmlElement(name = "RoutingCode")
    protected String routingCode;
    @XmlElement(name = "OP")
    protected String op;
    @XmlElement(name = "OpUserAccount")
    protected String opUserAccount;

    /**
     * 获取msgNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNo() {
        return msgNo;
    }

    /**
     * 设置msgNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNo(String value) {
        this.msgNo = value;
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
     * 获取bbcType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumBBCType }
     *     
     */
    public EnumBBCType getBBCType() {
        return bbcType;
    }

    /**
     * 设置bbcType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBBCType }
     *     
     */
    public void setBBCType(EnumBBCType value) {
        this.bbcType = value;
    }

    /**
     * 获取planId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * 设置planId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
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
     * 获取produceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduceNo() {
        return produceNo;
    }

    /**
     * 设置produceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduceNo(String value) {
        this.produceNo = value;
    }

    /**
     * 获取furnaceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurnaceNo() {
        return furnaceNo;
    }

    /**
     * 设置furnaceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurnaceNo(String value) {
        this.furnaceNo = value;
    }

    /**
     * 获取grade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置grade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * 获取boxQty属性的值。
     * 
     */
    public int getBoxQty() {
        return boxQty;
    }

    /**
     * 设置boxQty属性的值。
     * 
     */
    public void setBoxQty(int value) {
        this.boxQty = value;
    }

    /**
     * 获取qty属性的值。
     * 
     */
    public int getQty() {
        return qty;
    }

    /**
     * 设置qty属性的值。
     * 
     */
    public void setQty(int value) {
        this.qty = value;
    }

    /**
     * 获取customerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * 设置customerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
    }

    /**
     * 获取customerPartNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }

    /**
     * 设置customerPartNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPartNo(String value) {
        this.customerPartNo = value;
    }

    /**
     * 获取moStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoStartDate() {
        return moStartDate;
    }

    /**
     * 设置moStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoStartDate(XMLGregorianCalendar value) {
        this.moStartDate = value;
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
     * 获取bomCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomCode() {
        return bomCode;
    }

    /**
     * 设置bomCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomCode(String value) {
        this.bomCode = value;
    }

    /**
     * 获取bomVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBomVersion() {
        return bomVersion;
    }

    /**
     * 设置bomVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBomVersion(String value) {
        this.bomVersion = value;
    }

    /**
     * 获取routingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * 设置routingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingCode(String value) {
        this.routingCode = value;
    }

    /**
     * 获取op属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOP() {
        return op;
    }

    /**
     * 设置op属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOP(String value) {
        this.op = value;
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
