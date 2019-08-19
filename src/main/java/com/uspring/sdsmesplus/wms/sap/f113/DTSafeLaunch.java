
package com.uspring.sdsmesplus.wms.sap.f113;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_SafeLaunch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_SafeLaunch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IV_HUIDENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IV_LGNUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IV_MARK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_SafeLaunch", propOrder = {
    "ivhuident",
    "ivlgnum",
    "ivmark"
})
public class DTSafeLaunch {

    @XmlElement(name = "IV_HUIDENT", required = true)
    protected String ivhuident;
    @XmlElement(name = "IV_LGNUM", required = true)
    protected String ivlgnum;
    @XmlElement(name = "IV_MARK", required = true)
    protected String ivmark;

    /**
     * 获取ivhuident属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVHUIDENT() {
        return ivhuident;
    }

    /**
     * 设置ivhuident属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVHUIDENT(String value) {
        this.ivhuident = value;
    }

    /**
     * 获取ivlgnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVLGNUM() {
        return ivlgnum;
    }

    /**
     * 设置ivlgnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVLGNUM(String value) {
        this.ivlgnum = value;
    }

    /**
     * 获取ivmark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVMARK() {
        return ivmark;
    }

    /**
     * 设置ivmark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVMARK(String value) {
        this.ivmark = value;
    }

}
