
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
 *         &lt;element name="BatchTransferCheckResult" type="{http://tempuri.org/}CBBCResultList" minOccurs="0"/>
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
    "batchTransferCheckResult"
})
@XmlRootElement(name = "BatchTransferCheckResponse")
public class BatchTransferCheckResponse {

    @XmlElement(name = "BatchTransferCheckResult")
    protected CBBCResultList batchTransferCheckResult;

    /**
     * ��ȡbatchTransferCheckResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CBBCResultList }
     *     
     */
    public CBBCResultList getBatchTransferCheckResult() {
        return batchTransferCheckResult;
    }

    /**
     * ����batchTransferCheckResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CBBCResultList }
     *     
     */
    public void setBatchTransferCheckResult(CBBCResultList value) {
        this.batchTransferCheckResult = value;
    }

}
