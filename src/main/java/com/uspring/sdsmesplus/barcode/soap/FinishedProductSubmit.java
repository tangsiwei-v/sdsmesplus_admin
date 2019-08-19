
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
 *         &lt;element name="BoxBarCode" type="{http://tempuri.org/}FinishedProductBoxBarCode" minOccurs="0"/>
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
    "boxBarCode"
})
@XmlRootElement(name = "FinishedProductSubmit")
public class FinishedProductSubmit {

    @XmlElement(name = "BoxBarCode")
    protected FinishedProductBoxBarCode boxBarCode;

    /**
     * 获取boxBarCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FinishedProductBoxBarCode }
     *     
     */
    public FinishedProductBoxBarCode getBoxBarCode() {
        return boxBarCode;
    }

    /**
     * 设置boxBarCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FinishedProductBoxBarCode }
     *     
     */
    public void setBoxBarCode(FinishedProductBoxBarCode value) {
        this.boxBarCode = value;
    }

}
