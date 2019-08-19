
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
     * 获取batchBBCSendWithdrawResult属性的值。
     * 
     */
    public boolean isBatchBBCSendWithdrawResult() {
        return batchBBCSendWithdrawResult;
    }

    /**
     * 设置batchBBCSendWithdrawResult属性的值。
     * 
     */
    public void setBatchBBCSendWithdrawResult(boolean value) {
        this.batchBBCSendWithdrawResult = value;
    }

}
