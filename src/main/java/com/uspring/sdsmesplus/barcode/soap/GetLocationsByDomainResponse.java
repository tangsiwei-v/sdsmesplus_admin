
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="getLocationsByDomainResult" type="{http://tempuri.org/}ArrayOfCLocation" minOccurs="0"/>
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
    "getLocationsByDomainResult"
})
@XmlRootElement(name = "getLocationsByDomainResponse")
public class GetLocationsByDomainResponse {

    protected ArrayOfCLocation getLocationsByDomainResult;

    /**
     * ��ȡgetLocationsByDomainResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public ArrayOfCLocation getGetLocationsByDomainResult() {
        return getLocationsByDomainResult;
    }

    /**
     * ����getLocationsByDomainResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public void setGetLocationsByDomainResult(ArrayOfCLocation value) {
        this.getLocationsByDomainResult = value;
    }

}
