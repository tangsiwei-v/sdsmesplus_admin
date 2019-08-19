
package com.uspring.sdsmesplus.wms.sap.f241;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MoveStock_Ret complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_MoveStock_Ret">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CV_MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CV_MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CV_TANUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_MoveStock_Ret", propOrder = {
    "cvmess",
    "cvmesst",
    "cvtanum"
})
public class DTMoveStockRet {

    @XmlElement(name = "CV_MESS")
    protected String cvmess;
    @XmlElement(name = "CV_MESS_T")
    protected String cvmesst;
    @XmlElement(name = "CV_TANUM")
    protected String cvtanum;

    /**
     * 获取cvmess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVMESS() {
        return cvmess;
    }

    /**
     * 设置cvmess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVMESS(String value) {
        this.cvmess = value;
    }

    /**
     * 获取cvmesst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVMESST() {
        return cvmesst;
    }

    /**
     * 设置cvmesst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVMESST(String value) {
        this.cvmesst = value;
    }

    /**
     * 获取cvtanum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVTANUM() {
        return cvtanum;
    }

    /**
     * 设置cvtanum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVTANUM(String value) {
        this.cvtanum = value;
    }

}
