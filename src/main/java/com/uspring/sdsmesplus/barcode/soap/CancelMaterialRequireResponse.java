
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
 *         &lt;element name="CancelMaterialRequireResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "cancelMaterialRequireResult"
})
@XmlRootElement(name = "CancelMaterialRequireResponse")
public class CancelMaterialRequireResponse {

    @XmlElement(name = "CancelMaterialRequireResult")
    protected boolean cancelMaterialRequireResult;

    /**
     * ��ȡcancelMaterialRequireResult���Ե�ֵ��
     * 
     */
    public boolean isCancelMaterialRequireResult() {
        return cancelMaterialRequireResult;
    }

    /**
     * ����cancelMaterialRequireResult���Ե�ֵ��
     * 
     */
    public void setCancelMaterialRequireResult(boolean value) {
        this.cancelMaterialRequireResult = value;
    }

}
