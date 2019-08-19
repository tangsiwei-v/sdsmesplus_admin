
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CleanLineNewBoxBarCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡlineClearReportNo���Ե�ֵ��
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
     * ����lineClearReportNo���Ե�ֵ��
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
     * ��ȡnewBoxBarCode���Ե�ֵ��
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
     * ����newBoxBarCode���Ե�ֵ��
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
     * ��ȡmaterialCode���Ե�ֵ��
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
     * ����materialCode���Ե�ֵ��
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
     * ��ȡmaterialName���Ե�ֵ��
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
     * ����materialName���Ե�ֵ��
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
     * ��ȡmaterialNum���Ե�ֵ��
     * 
     */
    public float getMaterialNum() {
        return materialNum;
    }

    /**
     * ����materialNum���Ե�ֵ��
     * 
     */
    public void setMaterialNum(float value) {
        this.materialNum = value;
    }

    /**
     * ��ȡoldBoxBarCode���Ե�ֵ��
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
     * ����oldBoxBarCode���Ե�ֵ��
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
     * ��ȡsuccessFlag���Ե�ֵ��
     * 
     */
    public boolean isSuccessFlag() {
        return successFlag;
    }

    /**
     * ����successFlag���Ե�ֵ��
     * 
     */
    public void setSuccessFlag(boolean value) {
        this.successFlag = value;
    }

    /**
     * ��ȡerrorMsg���Ե�ֵ��
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
     * ����errorMsg���Ե�ֵ��
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
