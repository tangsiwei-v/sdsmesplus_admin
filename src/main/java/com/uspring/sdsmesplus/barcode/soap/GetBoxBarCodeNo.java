
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bbcType" type="{http://tempuri.org/}enumBBCType"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bbcType",
    "site"
})
@XmlRootElement(name = "GetBoxBarCodeNo")
public class GetBoxBarCodeNo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumBBCType bbcType;
    protected String site;

    /**
     * 获取bbcType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumBBCType }
     *     
     */
    public EnumBBCType getBbcType() {
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
    public void setBbcType(EnumBBCType value) {
        this.bbcType = value;
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

}
