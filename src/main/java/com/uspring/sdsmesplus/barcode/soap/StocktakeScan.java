
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
 *         &lt;element name="loginDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginUserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrBBC" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "loginDomain",
    "loginUserId",
    "strLocation",
    "arrBBC"
})
@XmlRootElement(name = "StocktakeScan")
public class StocktakeScan {

    protected String loginDomain;
    protected int loginUserId;
    protected String strLocation;
    protected ArrayOfString arrBBC;

    /**
     * 获取loginDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginDomain() {
        return loginDomain;
    }

    /**
     * 设置loginDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginDomain(String value) {
        this.loginDomain = value;
    }

    /**
     * 获取loginUserId属性的值。
     * 
     */
    public int getLoginUserId() {
        return loginUserId;
    }

    /**
     * 设置loginUserId属性的值。
     * 
     */
    public void setLoginUserId(int value) {
        this.loginUserId = value;
    }

    /**
     * 获取strLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLocation() {
        return strLocation;
    }

    /**
     * 设置strLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLocation(String value) {
        this.strLocation = value;
    }

    /**
     * 获取arrBBC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getArrBBC() {
        return arrBBC;
    }

    /**
     * 设置arrBBC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setArrBBC(ArrayOfString value) {
        this.arrBBC = value;
    }

}
