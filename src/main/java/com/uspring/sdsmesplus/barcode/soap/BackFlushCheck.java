
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
 *         &lt;element name="clientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bfOption" type="{http://tempuri.org/}CBackFlushOption" minOccurs="0"/>
 *         &lt;element name="scanBBCList" type="{http://tempuri.org/}ArrayOfCScanBackFlushBBC" minOccurs="0"/>
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
    "clientIP",
    "bfOption",
    "scanBBCList"
})
@XmlRootElement(name = "BackFlushCheck")
public class BackFlushCheck {

    protected String loginDomain;
    protected int loginUserId;
    protected String clientIP;
    protected CBackFlushOption bfOption;
    protected ArrayOfCScanBackFlushBBC scanBBCList;

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
     * 获取clientIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * 设置clientIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIP(String value) {
        this.clientIP = value;
    }

    /**
     * 获取bfOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CBackFlushOption }
     *     
     */
    public CBackFlushOption getBfOption() {
        return bfOption;
    }

    /**
     * 设置bfOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CBackFlushOption }
     *     
     */
    public void setBfOption(CBackFlushOption value) {
        this.bfOption = value;
    }

    /**
     * 获取scanBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCScanBackFlushBBC }
     *     
     */
    public ArrayOfCScanBackFlushBBC getScanBBCList() {
        return scanBBCList;
    }

    /**
     * 设置scanBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCScanBackFlushBBC }
     *     
     */
    public void setScanBBCList(ArrayOfCScanBackFlushBBC value) {
        this.scanBBCList = value;
    }

}
