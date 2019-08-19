
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CLoginUser complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡloginUserID���Ե�ֵ��
     * 
     */
    public int getLoginUserID() {
        return loginUserID;
    }

    /**
     * ����loginUserID���Ե�ֵ��
     * 
     */
    public void setLoginUserID(int value) {
        this.loginUserID = value;
    }

    /**
     * ��ȡloginUserAccount���Ե�ֵ��
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
     * ����loginUserAccount���Ե�ֵ��
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
     * ��ȡloginUserName���Ե�ֵ��
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
     * ����loginUserName���Ե�ֵ��
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
     * ��ȡloginSite���Ե�ֵ��
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
     * ����loginSite���Ե�ֵ��
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
     * ��ȡloginIP���Ե�ֵ��
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
     * ����loginIP���Ե�ֵ��
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
     * ��ȡcardNo���Ե�ֵ��
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
     * ����cardNo���Ե�ֵ��
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
     * ��ȡpassword���Ե�ֵ��
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
     * ����password���Ե�ֵ��
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
     * ��ȡuserType���Ե�ֵ��
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
     * ����userType���Ե�ֵ��
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
     * ��ȡselectMenus���Ե�ֵ��
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
     * ����selectMenus���Ե�ֵ��
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
     * ��ȡmanageLocations���Ե�ֵ��
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
     * ����manageLocations���Ե�ֵ��
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
     * ��ȡallowLogin���Ե�ֵ��
     * 
     */
    public boolean isAllowLogin() {
        return allowLogin;
    }

    /**
     * ����allowLogin���Ե�ֵ��
     * 
     */
    public void setAllowLogin(boolean value) {
        this.allowLogin = value;
    }

}
