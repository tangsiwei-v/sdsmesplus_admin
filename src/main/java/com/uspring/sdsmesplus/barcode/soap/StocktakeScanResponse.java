
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
 *         &lt;element name="StocktakeScanResult" type="{http://tempuri.org/}ArrayOfCBBC" minOccurs="0"/>
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
    "stocktakeScanResult"
})
@XmlRootElement(name = "StocktakeScanResponse")
public class StocktakeScanResponse {

    @XmlElement(name = "StocktakeScanResult")
    protected ArrayOfCBBC stocktakeScanResult;

    /**
     * ��ȡstocktakeScanResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public ArrayOfCBBC getStocktakeScanResult() {
        return stocktakeScanResult;
    }

    /**
     * ����stocktakeScanResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCBBC }
     *     
     */
    public void setStocktakeScanResult(ArrayOfCBBC value) {
        this.stocktakeScanResult = value;
    }

}
