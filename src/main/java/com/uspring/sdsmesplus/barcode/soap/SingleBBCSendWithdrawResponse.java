
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
 *         &lt;element name="SingleBBCSendWithdrawResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "singleBBCSendWithdrawResult"
})
@XmlRootElement(name = "SingleBBCSendWithdrawResponse")
public class SingleBBCSendWithdrawResponse {

    @XmlElement(name = "SingleBBCSendWithdrawResult")
    protected boolean singleBBCSendWithdrawResult;

    /**
     * ��ȡsingleBBCSendWithdrawResult���Ե�ֵ��
     * 
     */
    public boolean isSingleBBCSendWithdrawResult() {
        return singleBBCSendWithdrawResult;
    }

    /**
     * ����singleBBCSendWithdrawResult���Ե�ֵ��
     * 
     */
    public void setSingleBBCSendWithdrawResult(boolean value) {
        this.singleBBCSendWithdrawResult = value;
    }

}
