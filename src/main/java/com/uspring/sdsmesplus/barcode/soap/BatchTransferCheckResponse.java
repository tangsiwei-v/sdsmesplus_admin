
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取batchTransferCheckResult属性的值。
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
     * 设置batchTransferCheckResult属性的值。
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
