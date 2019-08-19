
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCScanBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCScanBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CScanBBC" type="{http://tempuri.org/}CScanBBC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCScanBBC", propOrder = {
    "cScanBBC"
})
public class ArrayOfCScanBBC {

    @XmlElement(name = "CScanBBC", nillable = true)
    protected List<CScanBBC> cScanBBC;

    /**
     * Gets the value of the cScanBBC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cScanBBC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCScanBBC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CScanBBC }
     * 
     * 
     */
    public List<CScanBBC> getCScanBBC() {
        if (cScanBBC == null) {
            cScanBBC = new ArrayList<CScanBBC>();
        }
        return this.cScanBBC;
    }

}
