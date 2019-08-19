
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCleanLineNewBoxBarCode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCleanLineNewBoxBarCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CleanLineNewBoxBarCode" type="{http://tempuri.org/}CleanLineNewBoxBarCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCleanLineNewBoxBarCode", propOrder = {
    "cleanLineNewBoxBarCode"
})
public class ArrayOfCleanLineNewBoxBarCode {

    @XmlElement(name = "CleanLineNewBoxBarCode", nillable = true)
    protected List<CleanLineNewBoxBarCode> cleanLineNewBoxBarCode;

    /**
     * Gets the value of the cleanLineNewBoxBarCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cleanLineNewBoxBarCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCleanLineNewBoxBarCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CleanLineNewBoxBarCode }
     * 
     * 
     */
    public List<CleanLineNewBoxBarCode> getCleanLineNewBoxBarCode() {
        if (cleanLineNewBoxBarCode == null) {
            cleanLineNewBoxBarCode = new ArrayList<CleanLineNewBoxBarCode>();
        }
        return this.cleanLineNewBoxBarCode;
    }

	public void setCleanLineNewBoxBarCode(List<CleanLineNewBoxBarCode> cleanLineNewBoxBarCode) {
		this.cleanLineNewBoxBarCode = cleanLineNewBoxBarCode;
	}

	@Override
	public String toString() {
		return "ArrayOfCleanLineNewBoxBarCode [cleanLineNewBoxBarCode=" + cleanLineNewBoxBarCode + "]";
	}

}
