
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
 *         &lt;element name="getUserByICCardResult" type="{http://tempuri.org/}CLoginUser" minOccurs="0"/>
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
    "getUserByICCardResult"
})
@XmlRootElement(name = "getUserByICCardResponse")
public class GetUserByICCardResponse {

    protected CLoginUser getUserByICCardResult;

    /**
     * ��ȡgetUserByICCardResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CLoginUser }
     *     
     */
    public CLoginUser getGetUserByICCardResult() {
        return getUserByICCardResult;
    }

    /**
     * ����getUserByICCardResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CLoginUser }
     *     
     */
    public void setGetUserByICCardResult(CLoginUser value) {
        this.getUserByICCardResult = value;
    }

}
