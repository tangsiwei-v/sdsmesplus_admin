
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbbcType���Ե�ֵ��
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
     * ����bbcType���Ե�ֵ��
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

}
