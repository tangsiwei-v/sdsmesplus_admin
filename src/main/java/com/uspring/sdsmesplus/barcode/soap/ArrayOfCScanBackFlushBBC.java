
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCScanBackFlushBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCScanBackFlushBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CScanBackFlushBBC" type="{http://tempuri.org/}CScanBackFlushBBC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCScanBackFlushBBC", propOrder = {
    "cScanBackFlushBBC"
})
public class ArrayOfCScanBackFlushBBC {

    @XmlElement(name = "CScanBackFlushBBC", nillable = true)
    protected List<CScanBackFlushBBC> cScanBackFlushBBC;

    /**
     * Gets the value of the cScanBackFlushBBC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cScanBackFlushBBC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCScanBackFlushBBC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CScanBackFlushBBC }
     * 
     * 
     */
    public List<CScanBackFlushBBC> getCScanBackFlushBBC() {
        if (cScanBackFlushBBC == null) {
            cScanBackFlushBBC = new ArrayList<CScanBackFlushBBC>();
        }
        return this.cScanBackFlushBBC;
    }

}
