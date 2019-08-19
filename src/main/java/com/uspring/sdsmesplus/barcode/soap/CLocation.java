
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CLocation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Loc_Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Shelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Loc_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLocation", propOrder = {
    "locLoc",
    "locDesc",
    "locShelf",
    "locSite",
    "locDomain",
    "locStatus"
})
public class CLocation {

    @XmlElement(name = "Loc_Loc")
    protected String locLoc;
    @XmlElement(name = "Loc_Desc")
    protected String locDesc;
    @XmlElement(name = "Loc_Shelf")
    protected String locShelf;
    @XmlElement(name = "Loc_Site")
    protected String locSite;
    @XmlElement(name = "Loc_Domain")
    protected String locDomain;
    @XmlElement(name = "Loc_Status")
    protected String locStatus;

    /**
     * ��ȡlocLoc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocLoc() {
        return locLoc;
    }

    /**
     * ����locLoc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocLoc(String value) {
        this.locLoc = value;
    }

    /**
     * ��ȡlocDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocDesc() {
        return locDesc;
    }

    /**
     * ����locDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocDesc(String value) {
        this.locDesc = value;
    }

    /**
     * ��ȡlocShelf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocShelf() {
        return locShelf;
    }

    /**
     * ����locShelf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocShelf(String value) {
        this.locShelf = value;
    }

    /**
     * ��ȡlocSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocSite() {
        return locSite;
    }

    /**
     * ����locSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocSite(String value) {
        this.locSite = value;
    }

    /**
     * ��ȡlocDomain���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocDomain() {
        return locDomain;
    }

    /**
     * ����locDomain���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocDomain(String value) {
        this.locDomain = value;
    }

    /**
     * ��ȡlocStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocStatus() {
        return locStatus;
    }

    /**
     * ����locStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocStatus(String value) {
        this.locStatus = value;
    }

}
