
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="WebTestResult" type="{http://tempuri.org/}ArrayOfCScanBBC" minOccurs="0"/>
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
    "webTestResult"
})
@XmlRootElement(name = "WebTestResponse")
public class WebTestResponse {

    @XmlElement(name = "WebTestResult")
    protected ArrayOfCScanBBC webTestResult;

    /**
     * ��ȡwebTestResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCScanBBC }
     *     
     */
    public ArrayOfCScanBBC getWebTestResult() {
        return webTestResult;
    }

    /**
     * ����webTestResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCScanBBC }
     *     
     */
    public void setWebTestResult(ArrayOfCScanBBC value) {
        this.webTestResult = value;
    }

}
