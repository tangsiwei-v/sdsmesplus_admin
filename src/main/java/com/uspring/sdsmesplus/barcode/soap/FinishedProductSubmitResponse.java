
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
 *         &lt;element name="FinishedProductSubmitResult" type="{http://tempuri.org/}FinishedProductBoxBarCode" minOccurs="0"/>
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
    "finishedProductSubmitResult"
})
@XmlRootElement(name = "FinishedProductSubmitResponse")
public class FinishedProductSubmitResponse {

    @XmlElement(name = "FinishedProductSubmitResult")
    protected FinishedProductBoxBarCode finishedProductSubmitResult;

    /**
     * ��ȡfinishedProductSubmitResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FinishedProductBoxBarCode }
     *     
     */
    public FinishedProductBoxBarCode getFinishedProductSubmitResult() {
        return finishedProductSubmitResult;
    }

    /**
     * ����finishedProductSubmitResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FinishedProductBoxBarCode }
     *     
     */
    public void setFinishedProductSubmitResult(FinishedProductBoxBarCode value) {
        this.finishedProductSubmitResult = value;
    }

}
