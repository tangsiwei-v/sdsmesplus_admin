
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="LockBBCResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "lockBBCResult"
})
@XmlRootElement(name = "LockBBCResponse")
public class LockBBCResponse {

    @XmlElement(name = "LockBBCResult")
    protected boolean lockBBCResult;

    /**
     * ��ȡlockBBCResult���Ե�ֵ��
     * 
     */
    public boolean isLockBBCResult() {
        return lockBBCResult;
    }

    /**
     * ����lockBBCResult���Ե�ֵ��
     * 
     */
    public void setLockBBCResult(boolean value) {
        this.lockBBCResult = value;
    }

}
