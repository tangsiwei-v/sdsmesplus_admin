
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
 *         &lt;element name="getSourceLocationsByUserIdResult" type="{http://tempuri.org/}ArrayOfCLocation" minOccurs="0"/>
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
    "getSourceLocationsByUserIdResult"
})
@XmlRootElement(name = "getSourceLocationsByUserIdResponse")
public class GetSourceLocationsByUserIdResponse {

    protected ArrayOfCLocation getSourceLocationsByUserIdResult;

    /**
     * ��ȡgetSourceLocationsByUserIdResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public ArrayOfCLocation getGetSourceLocationsByUserIdResult() {
        return getSourceLocationsByUserIdResult;
    }

    /**
     * ����getSourceLocationsByUserIdResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public void setGetSourceLocationsByUserIdResult(ArrayOfCLocation value) {
        this.getSourceLocationsByUserIdResult = value;
    }

}
