
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
 *         &lt;element name="SubmitBackFlushResult" type="{http://tempuri.org/}CBackFlushBBCResult" minOccurs="0"/>
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
    "submitBackFlushResult"
})
@XmlRootElement(name = "SubmitBackFlushResponse")
public class SubmitBackFlushResponse {

    @XmlElement(name = "SubmitBackFlushResult")
    protected CBackFlushBBCResult submitBackFlushResult;

    /**
     * ��ȡsubmitBackFlushResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CBackFlushBBCResult }
     *     
     */
    public CBackFlushBBCResult getSubmitBackFlushResult() {
        return submitBackFlushResult;
    }

    /**
     * ����submitBackFlushResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CBackFlushBBCResult }
     *     
     */
    public void setSubmitBackFlushResult(CBackFlushBBCResult value) {
        this.submitBackFlushResult = value;
    }

}
