
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
 *         &lt;element name="BatchBBCSendWithdrawResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "batchBBCSendWithdrawResult"
})
@XmlRootElement(name = "BatchBBCSendWithdrawResponse")
public class BatchBBCSendWithdrawResponse {

    @XmlElement(name = "BatchBBCSendWithdrawResult")
    protected boolean batchBBCSendWithdrawResult;

    /**
     * ��ȡbatchBBCSendWithdrawResult���Ե�ֵ��
     * 
     */
    public boolean isBatchBBCSendWithdrawResult() {
        return batchBBCSendWithdrawResult;
    }

    /**
     * ����batchBBCSendWithdrawResult���Ե�ֵ��
     * 
     */
    public void setBatchBBCSendWithdrawResult(boolean value) {
        this.batchBBCSendWithdrawResult = value;
    }

}
