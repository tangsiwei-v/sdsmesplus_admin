
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getSourceLocationsByUserIdResult" type="{http://tempuri.org/}ArrayOfCLocation" minOccurs="0"/>
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
    "getSourceLocationsByUserIdResult"
})
@XmlRootElement(name = "getSourceLocationsByUserIdResponse")
public class GetSourceLocationsByUserIdResponse {

    protected ArrayOfCLocation getSourceLocationsByUserIdResult;

    /**
     * 获取getSourceLocationsByUserIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public ArrayOfCLocation getGetSourceLocationsByUserIdResult() {
        return getSourceLocationsByUserIdResult;
    }

    /**
     * 设置getSourceLocationsByUserIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCLocation }
     *     
     */
    public void setGetSourceLocationsByUserIdResult(ArrayOfCLocation value) {
        this.getSourceLocationsByUserIdResult = value;
    }

}
