
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
 *         &lt;element name="ShelfBoxNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "shelfBoxNumberResult"
})
@XmlRootElement(name = "ShelfBoxNumberResponse")
public class ShelfBoxNumberResponse {

    @XmlElement(name = "ShelfBoxNumberResult")
    protected int shelfBoxNumberResult;

    /**
     * ��ȡshelfBoxNumberResult���Ե�ֵ��
     * 
     */
    public int getShelfBoxNumberResult() {
        return shelfBoxNumberResult;
    }

    /**
     * ����shelfBoxNumberResult���Ե�ֵ��
     * 
     */
    public void setShelfBoxNumberResult(int value) {
        this.shelfBoxNumberResult = value;
    }

}
