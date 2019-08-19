
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CleanLineOldBoxBarCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmaterialUsedNum���Ե�ֵ��
     * 
     */
    public float getMaterialUsedNum() {
        return materialUsedNum;
    }

    /**
     * ����materialUsedNum���Ե�ֵ��
     * 
     */
    public void setMaterialUsedNum(float value) {
        this.materialUsedNum = value;
    }

    /**
     * ��ȡmaterialRemainNum���Ե�ֵ��
     * 
     */
    public float getMaterialRemainNum() {
        return materialRemainNum;
    }

    /**
     * ����materialRemainNum���Ե�ֵ��
     * 
     */
    public void setMaterialRemainNum(float value) {
        this.materialRemainNum = value;
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
