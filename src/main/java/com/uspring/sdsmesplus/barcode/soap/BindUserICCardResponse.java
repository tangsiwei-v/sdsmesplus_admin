
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
 *         &lt;element name="bindUserICCardResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "bindUserICCardResult"
})
@XmlRootElement(name = "bindUserICCardResponse")
public class BindUserICCardResponse {

    protected boolean bindUserICCardResult;

    /**
     * ��ȡbindUserICCardResult���Ե�ֵ��
     * 
     */
    public boolean isBindUserICCardResult() {
        return bindUserICCardResult;
    }

    /**
     * ����bindUserICCardResult���Ե�ֵ��
     * 
     */
    public void setBindUserICCardResult(boolean value) {
        this.bindUserICCardResult = value;
    }

}
