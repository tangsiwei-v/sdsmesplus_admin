
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
     * ��ȡstrLocation���Ե�ֵ��
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
     * ����strLocation���Ե�ֵ��
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
     * ��ȡarrBBC���Ե�ֵ��
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
     * ����arrBBC���Ե�ֵ��
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
