
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
 *         &lt;element name="billType" type="{http://tempuri.org/}enumBillType"/>
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
    "billType",
    "site"
})
@XmlRootElement(name = "GetNextBillNo")
public class GetNextBillNo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnumBillType billType;
    protected String site;

    /**
     * ��ȡbillType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EnumBillType }
     *     
     */
    public EnumBillType getBillType() {
        return billType;
    }

    /**
     * ����billType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBillType }
     *     
     */
    public void setBillType(EnumBillType value) {
        this.billType = value;
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
