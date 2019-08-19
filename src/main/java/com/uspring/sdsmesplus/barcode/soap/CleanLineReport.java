
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
 *         &lt;element name="oldBBCList" type="{http://tempuri.org/}ArrayOfCleanLineOldBoxBarCode" minOccurs="0"/>
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
    "oldBBCList"
})
@XmlRootElement(name = "CleanLineReport")
public class CleanLineReport {

    protected ArrayOfCleanLineOldBoxBarCode oldBBCList;

    /**
     * 获取oldBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCleanLineOldBoxBarCode }
     *     
     */
    public ArrayOfCleanLineOldBoxBarCode getOldBBCList() {
        return oldBBCList;
    }

    /**
     * 设置oldBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCleanLineOldBoxBarCode }
     *     
     */
    public void setOldBBCList(ArrayOfCleanLineOldBoxBarCode value) {
        this.oldBBCList = value;
    }

}
