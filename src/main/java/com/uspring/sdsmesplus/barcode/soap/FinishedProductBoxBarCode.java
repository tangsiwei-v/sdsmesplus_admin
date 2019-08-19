
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>FinishedProductBoxBarCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmsgNo���Ե�ֵ��
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
     * ����msgNo���Ե�ֵ��
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
     * ��ȡboxBarCode���Ե�ֵ��
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
     * ����boxBarCode���Ե�ֵ��
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
     * ��ȡbbcType���Ե�ֵ��
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
     * ����bbcType���Ե�ֵ��
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
     * ��ȡplanId���Ե�ֵ��
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
     * ����planId���Ե�ֵ��
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
     * ��ȡmoNo���Ե�ֵ��
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
     * ����moNo���Ե�ֵ��
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
     * ��ȡsite���Ե�ֵ��
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
     * ����site���Ե�ֵ��
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
     * ��ȡlineId���Ե�ֵ��
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
     * ����lineId���Ե�ֵ��
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
     * ��ȡpartCode���Ե�ֵ��
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
     * ����partCode���Ե�ֵ��
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
     * ��ȡproduceNo���Ե�ֵ��
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
     * ����produceNo���Ե�ֵ��
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
     * ��ȡfurnaceNo���Ե�ֵ��
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
     * ����furnaceNo���Ե�ֵ��
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
     * ��ȡgrade���Ե�ֵ��
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
     * ����grade���Ե�ֵ��
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
     * ��ȡboxQty���Ե�ֵ��
     * 
     */
    public int getBoxQty() {
        return boxQty;
    }

    /**
     * ����boxQty���Ե�ֵ��
     * 
     */
    public void setBoxQty(int value) {
        this.boxQty = value;
    }

    /**
     * ��ȡqty���Ե�ֵ��
     * 
     */
    public int getQty() {
        return qty;
    }

    /**
     * ����qty���Ե�ֵ��
     * 
     */
    public void setQty(int value) {
        this.qty = value;
    }

    /**
     * ��ȡcustomerNo���Ե�ֵ��
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
     * ����customerNo���Ե�ֵ��
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
     * ��ȡcustomerPartNo���Ե�ֵ��
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
     * ����customerPartNo���Ե�ֵ��
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
     * ��ȡmoStartDate���Ե�ֵ��
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
     * ����moStartDate���Ե�ֵ��
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
     * ��ȡbomCode���Ե�ֵ��
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
     * ����bomCode���Ե�ֵ��
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
     * ��ȡbomVersion���Ե�ֵ��
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
     * ����bomVersion���Ե�ֵ��
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
     * ��ȡroutingCode���Ե�ֵ��
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
     * ����routingCode���Ե�ֵ��
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
     * ��ȡop���Ե�ֵ��
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
     * ����op���Ե�ֵ��
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
     * ��ȡopUserAccount���Ե�ֵ��
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
     * ����opUserAccount���Ե�ֵ��
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
