
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
 *         &lt;element name="CleanLineReportResult" type="{http://tempuri.org/}ArrayOfCleanLineNewBoxBarCode" minOccurs="0"/>
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
    "cleanLineReportResult"
})
@XmlRootElement(name = "CleanLineReportResponse")
public class CleanLineReportResponse {

    @XmlElement(name = "CleanLineReportResult")
    protected ArrayOfCleanLineNewBoxBarCode cleanLineReportResult;

    /**
     * 获取cleanLineReportResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCleanLineNewBoxBarCode }
     *     
     */
    public ArrayOfCleanLineNewBoxBarCode getCleanLineReportResult() {
        return cleanLineReportResult;
    }

    /**
     * 设置cleanLineReportResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCleanLineNewBoxBarCode }
     *     
     */
    public void setCleanLineReportResult(ArrayOfCleanLineNewBoxBarCode value) {
        this.cleanLineReportResult = value;
    }

}
