
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
 *         &lt;element name="getSitesByDomainResult" type="{http://tempuri.org/}ArrayOfCSite" minOccurs="0"/>
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
    "getSitesByDomainResult"
})
@XmlRootElement(name = "getSitesByDomainResponse")
public class GetSitesByDomainResponse {

    protected ArrayOfCSite getSitesByDomainResult;

    /**
     * 获取getSitesByDomainResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCSite }
     *     
     */
    public ArrayOfCSite getGetSitesByDomainResult() {
        return getSitesByDomainResult;
    }

    /**
     * 设置getSitesByDomainResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCSite }
     *     
     */
    public void setGetSitesByDomainResult(ArrayOfCSite value) {
        this.getSitesByDomainResult = value;
    }

}
