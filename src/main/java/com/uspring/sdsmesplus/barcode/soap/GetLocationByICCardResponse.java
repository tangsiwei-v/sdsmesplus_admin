
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
 *         &lt;element name="getLocationByICCardResult" type="{http://tempuri.org/}CLocation" minOccurs="0"/>
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
    "getLocationByICCardResult"
})
@XmlRootElement(name = "getLocationByICCardResponse")
public class GetLocationByICCardResponse {

    protected CLocation getLocationByICCardResult;

    /**
     * ��ȡgetLocationByICCardResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CLocation }
     *     
     */
    public CLocation getGetLocationByICCardResult() {
        return getLocationByICCardResult;
    }

    /**
     * ����getLocationByICCardResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CLocation }
     *     
     */
    public void setGetLocationByICCardResult(CLocation value) {
        this.getLocationByICCardResult = value;
    }

}
