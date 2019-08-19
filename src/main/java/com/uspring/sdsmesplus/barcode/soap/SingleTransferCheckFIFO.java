
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
     * ��ȡloginUser���Ե�ֵ��
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
     * ����loginUser���Ե�ֵ��
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
     * ��ȡtranOption���Ե�ֵ��
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
     * ����tranOption���Ե�ֵ��
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
     * ��ȡscanBBC���Ե�ֵ��
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
     * ����scanBBC���Ե�ֵ��
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
     * ��ȡscannedBBCList���Ե�ֵ��
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
     * ����scannedBBCList���Ե�ֵ��
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
