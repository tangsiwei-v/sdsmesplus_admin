
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
 *         &lt;element name="CreateBoxBarCodeResult" type="{http://tempuri.org/}CBBC" minOccurs="0"/>
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
    "createBoxBarCodeResult"
})
@XmlRootElement(name = "CreateBoxBarCodeResponse")
public class CreateBoxBarCodeResponse {

    @XmlElement(name = "CreateBoxBarCodeResult")
    protected CBBC createBoxBarCodeResult;

    /**
     * ��ȡcreateBoxBarCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CBBC }
     *     
     */
    public CBBC getCreateBoxBarCodeResult() {
        return createBoxBarCodeResult;
    }

    /**
     * ����createBoxBarCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CBBC }
     *     
     */
    public void setCreateBoxBarCodeResult(CBBC value) {
        this.createBoxBarCodeResult = value;
    }

}
