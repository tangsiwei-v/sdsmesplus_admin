
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
 *         &lt;element name="SingleTransferCheckFIFOResult" type="{http://tempuri.org/}CBBCResult" minOccurs="0"/>
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
    "singleTransferCheckFIFOResult"
})
@XmlRootElement(name = "SingleTransferCheckFIFOResponse")
public class SingleTransferCheckFIFOResponse {

    @XmlElement(name = "SingleTransferCheckFIFOResult")
    protected CBBCResult singleTransferCheckFIFOResult;

    /**
     * 获取singleTransferCheckFIFOResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBBCResult }
     *     
     */
    public CBBCResult getSingleTransferCheckFIFOResult() {
        return singleTransferCheckFIFOResult;
    }

    /**
     * 设置singleTransferCheckFIFOResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBBCResult }
     *     
     */
    public void setSingleTransferCheckFIFOResult(CBBCResult value) {
        this.singleTransferCheckFIFOResult = value;
    }

}
