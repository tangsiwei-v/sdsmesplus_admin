
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCleanLineOldBoxBarCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCleanLineOldBoxBarCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CleanLineOldBoxBarCode" type="{http://tempuri.org/}CleanLineOldBoxBarCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCleanLineOldBoxBarCode", propOrder = {
    "cleanLineOldBoxBarCode"
})
public class ArrayOfCleanLineOldBoxBarCode {

    @XmlElement(name = "CleanLineOldBoxBarCode", nillable = true)
    protected List<CleanLineOldBoxBarCode> cleanLineOldBoxBarCode;

    /**
     * Gets the value of the cleanLineOldBoxBarCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cleanLineOldBoxBarCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCleanLineOldBoxBarCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CleanLineOldBoxBarCode }
     * 
     * 
     */
    public List<CleanLineOldBoxBarCode> getCleanLineOldBoxBarCode() {
        if (cleanLineOldBoxBarCode == null) {
            cleanLineOldBoxBarCode = new ArrayList<CleanLineOldBoxBarCode>();
        }
        return this.cleanLineOldBoxBarCode;
    }

	public void setCleanLineOldBoxBarCode(List<CleanLineOldBoxBarCode> cleanLineOldBoxBarCode) {
		this.cleanLineOldBoxBarCode = cleanLineOldBoxBarCode;
	}

	@Override
	public String toString() {
		return "ArrayOfCleanLineOldBoxBarCode [cleanLineOldBoxBarCode=" + cleanLineOldBoxBarCode + "]";
	}

}
