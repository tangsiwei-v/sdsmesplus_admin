
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
 *         &lt;element name="GetBBCInfoResult" type="{http://tempuri.org/}CBBC" minOccurs="0"/>
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
    "getBBCInfoResult"
})
@XmlRootElement(name = "GetBBCInfoResponse")
public class GetBBCInfoResponse {

    @XmlElement(name = "GetBBCInfoResult")
    protected CBBC getBBCInfoResult;

    /**
     * ��ȡgetBBCInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CBBC }
     *     
     */
    public CBBC getGetBBCInfoResult() {
        return getBBCInfoResult;
    }

    /**
     * ����getBBCInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CBBC }
     *     
     */
    public void setGetBBCInfoResult(CBBC value) {
        this.getBBCInfoResult = value;
    }

}
