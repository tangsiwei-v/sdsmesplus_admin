
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡloginDomain���Ե�ֵ��
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
     * ����loginDomain���Ե�ֵ��
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
     * ��ȡloginUserId���Ե�ֵ��
     * 
     */
    public int getLoginUserId() {
        return loginUserId;
    }

    /**
     * ����loginUserId���Ե�ֵ��
     * 
     */
    public void setLoginUserId(int value) {
        this.loginUserId = value;
    }

    /**
     * ��ȡclientIP���Ե�ֵ��
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
     * ����clientIP���Ե�ֵ��
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
     * ��ȡbfOption���Ե�ֵ��
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
     * ����bfOption���Ե�ֵ��
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
     * ��ȡscanBBCList���Ե�ֵ��
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
     * ����scanBBCList���Ե�ֵ��
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
