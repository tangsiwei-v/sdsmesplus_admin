
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
 *         &lt;element name="getUserListByLocationResult" type="{http://tempuri.org/}ArrayOfCLoginUser" minOccurs="0"/>
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
    "getUserListByLocationResult"
})
@XmlRootElement(name = "getUserListByLocationResponse")
public class GetUserListByLocationResponse {

    protected ArrayOfCLoginUser getUserListByLocationResult;

    /**
     * ��ȡgetUserListByLocationResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCLoginUser }
     *     
     */
    public ArrayOfCLoginUser getGetUserListByLocationResult() {
        return getUserListByLocationResult;
    }

    /**
     * ����getUserListByLocationResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCLoginUser }
     *     
     */
    public void setGetUserListByLocationResult(ArrayOfCLoginUser value) {
        this.getUserListByLocationResult = value;
    }

}
