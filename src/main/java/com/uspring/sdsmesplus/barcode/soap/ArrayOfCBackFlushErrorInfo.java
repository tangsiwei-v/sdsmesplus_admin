
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCBackFlushErrorInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCBackFlushErrorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CBackFlushErrorInfo" type="{http://tempuri.org/}CBackFlushErrorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCBackFlushErrorInfo", propOrder = {
    "cBackFlushErrorInfo"
})
public class ArrayOfCBackFlushErrorInfo {

    @XmlElement(name = "CBackFlushErrorInfo", nillable = true)
    protected List<CBackFlushErrorInfo> cBackFlushErrorInfo;

    /**
     * Gets the value of the cBackFlushErrorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cBackFlushErrorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCBackFlushErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBackFlushErrorInfo }
     * 
     * 
     */
    public List<CBackFlushErrorInfo> getCBackFlushErrorInfo() {
        if (cBackFlushErrorInfo == null) {
            cBackFlushErrorInfo = new ArrayList<CBackFlushErrorInfo>();
        }
        return this.cBackFlushErrorInfo;
    }

}
