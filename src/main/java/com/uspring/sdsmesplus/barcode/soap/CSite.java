
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CSite complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="si_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="si_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="si_domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="si_entity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSite", propOrder = {
    "siSite",
    "siDesc",
    "siDomain",
    "siEntity"
})
public class CSite {

    @XmlElement(name = "si_site")
    protected String siSite;
    @XmlElement(name = "si_desc")
    protected String siDesc;
    @XmlElement(name = "si_domain")
    protected String siDomain;
    @XmlElement(name = "si_entity")
    protected String siEntity;

    /**
     * 获取siSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiSite() {
        return siSite;
    }

    /**
     * 设置siSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiSite(String value) {
        this.siSite = value;
    }

    /**
     * 获取siDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiDesc() {
        return siDesc;
    }

    /**
     * 设置siDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiDesc(String value) {
        this.siDesc = value;
    }

    /**
     * 获取siDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiDomain() {
        return siDomain;
    }

    /**
     * 设置siDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiDomain(String value) {
        this.siDomain = value;
    }

    /**
     * 获取siEntity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiEntity() {
        return siEntity;
    }

    /**
     * 设置siEntity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiEntity(String value) {
        this.siEntity = value;
    }

}
