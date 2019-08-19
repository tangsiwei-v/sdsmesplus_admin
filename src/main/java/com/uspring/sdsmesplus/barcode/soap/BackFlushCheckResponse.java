
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
 *         &lt;element name="BackFlushCheckResult" type="{http://tempuri.org/}CBackFlushBBCResult" minOccurs="0"/>
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
    "backFlushCheckResult"
})
@XmlRootElement(name = "BackFlushCheckResponse")
public class BackFlushCheckResponse {

    @XmlElement(name = "BackFlushCheckResult")
    protected CBackFlushBBCResult backFlushCheckResult;

    /**
     * 获取backFlushCheckResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBackFlushBBCResult }
     *     
     */
    public CBackFlushBBCResult getBackFlushCheckResult() {
        return backFlushCheckResult;
    }

    /**
     * 设置backFlushCheckResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBackFlushBBCResult }
     *     
     */
    public void setBackFlushCheckResult(CBackFlushBBCResult value) {
        this.backFlushCheckResult = value;
    }

}
