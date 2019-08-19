
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CleanLineNewBoxBarCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CleanLineNewBoxBarCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineClearReportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewBoxBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaterialNum" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="OldBoxBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProduceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FurnaceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanLineNewBoxBarCode", propOrder = {
    "lineClearReportNo",
    "moNo",
    "site",
    "lineId",
    "newBoxBarCode",
    "materialCode",
    "materialName",
    "materialNum",
    "oldBoxBarCode",
    "produceNo",
    "furnaceNo",
    "grade",
    "successFlag",
    "errorMsg"
})
public class CleanLineNewBoxBarCode {

    @XmlElement(name = "LineClearReportNo")
    protected String lineClearReportNo;
    @XmlElement(name = "MoNo")
    protected String moNo;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "NewBoxBarCode")
    protected String newBoxBarCode;
    @XmlElement(name = "MaterialCode")
    protected String materialCode;
    @XmlElement(name = "MaterialName")
    protected String materialName;
    @XmlElement(name = "MaterialNum")
    protected float materialNum;
    @XmlElement(name = "OldBoxBarCode")
    protected String oldBoxBarCode;
    @XmlElement(name = "ProduceNo")
    protected String produceNo;
    @XmlElement(name = "FurnaceNo")
    protected String furnaceNo;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "SuccessFlag")
    protected boolean successFlag;
    @XmlElement(name = "ErrorMsg")
    protected String errorMsg;

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
     * 获取newBoxBarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBoxBarCode() {
        return newBoxBarCode;
    }

    /**
     * 设置newBoxBarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBoxBarCode(String value) {
        this.newBoxBarCode = value;
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
     * 获取materialName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * 设置materialName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialName(String value) {
        this.materialName = value;
    }

    /**
     * 获取materialNum属性的值。
     * 
     */
    public float getMaterialNum() {
        return materialNum;
    }

    /**
     * 设置materialNum属性的值。
     * 
     */
    public void setMaterialNum(float value) {
        this.materialNum = value;
    }

    /**
     * 获取oldBoxBarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBoxBarCode() {
        return oldBoxBarCode;
    }

    /**
     * 设置oldBoxBarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBoxBarCode(String value) {
        this.oldBoxBarCode = value;
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
     * 获取successFlag属性的值。
     * 
     */
    public boolean isSuccessFlag() {
        return successFlag;
    }

    /**
     * 设置successFlag属性的值。
     * 
     */
    public void setSuccessFlag(boolean value) {
        this.successFlag = value;
    }

    /**
     * 获取errorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置errorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

}
