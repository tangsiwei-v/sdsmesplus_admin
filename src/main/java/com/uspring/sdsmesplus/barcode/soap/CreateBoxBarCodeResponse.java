
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
 *         &lt;element name="CreateBoxBarCodeResult" type="{http://tempuri.org/}CBBC" minOccurs="0"/>
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
    "createBoxBarCodeResult"
})
@XmlRootElement(name = "CreateBoxBarCodeResponse")
public class CreateBoxBarCodeResponse {

    @XmlElement(name = "CreateBoxBarCodeResult")
    protected CBBC createBoxBarCodeResult;

    /**
     * 获取createBoxBarCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBBC }
     *     
     */
    public CBBC getCreateBoxBarCodeResult() {
        return createBoxBarCodeResult;
    }

    /**
     * 设置createBoxBarCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBBC }
     *     
     */
    public void setCreateBoxBarCodeResult(CBBC value) {
        this.createBoxBarCodeResult = value;
    }

}
