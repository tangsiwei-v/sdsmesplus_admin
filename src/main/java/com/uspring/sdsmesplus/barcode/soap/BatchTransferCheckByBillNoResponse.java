
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
 *         &lt;element name="BatchTransferCheckByBillNoResult" type="{http://tempuri.org/}CBBCResultList" minOccurs="0"/>
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
    "batchTransferCheckByBillNoResult"
})
@XmlRootElement(name = "BatchTransferCheckByBillNoResponse")
public class BatchTransferCheckByBillNoResponse {

    @XmlElement(name = "BatchTransferCheckByBillNoResult")
    protected CBBCResultList batchTransferCheckByBillNoResult;

    /**
     * ��ȡbatchTransferCheckByBillNoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CBBCResultList }
     *     
     */
    public CBBCResultList getBatchTransferCheckByBillNoResult() {
        return batchTransferCheckByBillNoResult;
    }

    /**
     * ����batchTransferCheckByBillNoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CBBCResultList }
     *     
     */
    public void setBatchTransferCheckByBillNoResult(CBBCResultList value) {
        this.batchTransferCheckByBillNoResult = value;
    }

}
