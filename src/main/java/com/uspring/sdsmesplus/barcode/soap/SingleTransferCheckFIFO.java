
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
 *         &lt;element name="loginUser" type="{http://tempuri.org/}CLoginUser" minOccurs="0"/>
 *         &lt;element name="tranOption" type="{http://tempuri.org/}CTransferOption" minOccurs="0"/>
 *         &lt;element name="scanBBC" type="{http://tempuri.org/}CScanBBC" minOccurs="0"/>
 *         &lt;element name="scannedBBCList" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
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
    "loginUser",
    "tranOption",
    "scanBBC",
    "scannedBBCList"
})
@XmlRootElement(name = "SingleTransferCheckFIFO")
public class SingleTransferCheckFIFO {

    protected CLoginUser loginUser;
    protected CTransferOption tranOption;
    protected CScanBBC scanBBC;
    protected ArrayOfString scannedBBCList;

    /**
     * 获取loginUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CLoginUser }
     *     
     */
    public CLoginUser getLoginUser() {
        return loginUser;
    }

    /**
     * 设置loginUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CLoginUser }
     *     
     */
    public void setLoginUser(CLoginUser value) {
        this.loginUser = value;
    }

    /**
     * 获取tranOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTransferOption }
     *     
     */
    public CTransferOption getTranOption() {
        return tranOption;
    }

    /**
     * 设置tranOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTransferOption }
     *     
     */
    public void setTranOption(CTransferOption value) {
        this.tranOption = value;
    }

    /**
     * 获取scanBBC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CScanBBC }
     *     
     */
    public CScanBBC getScanBBC() {
        return scanBBC;
    }

    /**
     * 设置scanBBC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CScanBBC }
     *     
     */
    public void setScanBBC(CScanBBC value) {
        this.scanBBC = value;
    }

    /**
     * 获取scannedBBCList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getScannedBBCList() {
        return scannedBBCList;
    }

    /**
     * 设置scannedBBCList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setScannedBBCList(ArrayOfString value) {
        this.scannedBBCList = value;
    }

}
