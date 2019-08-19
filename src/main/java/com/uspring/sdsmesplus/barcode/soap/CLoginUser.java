
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CLoginUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CLoginUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LoginUserAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectMenus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManageLocations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CLoginUser", propOrder = {
    "loginUserID",
    "loginUserAccount",
    "loginUserName",
    "loginSite",
    "loginDomain",
    "loginIP",
    "cardNo",
    "password",
    "userType",
    "selectMenus",
    "manageLocations",
    "allowLogin"
})
public class CLoginUser {

    @XmlElement(name = "LoginUserID")
    protected int loginUserID;
    @XmlElement(name = "LoginUserAccount")
    protected String loginUserAccount;
    @XmlElement(name = "LoginUserName")
    protected String loginUserName;
    @XmlElement(name = "LoginSite")
    protected String loginSite;
    @XmlElement(name = "LoginDomain")
    protected String loginDomain;
    @XmlElement(name = "LoginIP")
    protected String loginIP;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "UserType")
    protected String userType;
    @XmlElement(name = "SelectMenus")
    protected String selectMenus;
    @XmlElement(name = "ManageLocations")
    protected String manageLocations;
    @XmlElement(name = "AllowLogin")
    protected boolean allowLogin;

    /**
     * 获取loginUserID属性的值。
     * 
     */
    public int getLoginUserID() {
        return loginUserID;
    }

    /**
     * 设置loginUserID属性的值。
     * 
     */
    public void setLoginUserID(int value) {
        this.loginUserID = value;
    }

    /**
     * 获取loginUserAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUserAccount() {
        return loginUserAccount;
    }

    /**
     * 设置loginUserAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUserAccount(String value) {
        this.loginUserAccount = value;
    }

    /**
     * 获取loginUserName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    /**
     * 设置loginUserName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUserName(String value) {
        this.loginUserName = value;
    }

    /**
     * 获取loginSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginSite() {
        return loginSite;
    }

    /**
     * 设置loginSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginSite(String value) {
        this.loginSite = value;
    }

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
     * 获取loginIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginIP() {
        return loginIP;
    }

    /**
     * 设置loginIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginIP(String value) {
        this.loginIP = value;
    }

    /**
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取userType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置userType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * 获取selectMenus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectMenus() {
        return selectMenus;
    }

    /**
     * 设置selectMenus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectMenus(String value) {
        this.selectMenus = value;
    }

    /**
     * 获取manageLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageLocations() {
        return manageLocations;
    }

    /**
     * 设置manageLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageLocations(String value) {
        this.manageLocations = value;
    }

    /**
     * 获取allowLogin属性的值。
     * 
     */
    public boolean isAllowLogin() {
        return allowLogin;
    }

    /**
     * 设置allowLogin属性的值。
     * 
     */
    public void setAllowLogin(boolean value) {
        this.allowLogin = value;
    }

}
