
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCBackFlushBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCBackFlushBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CBackFlushBBC" type="{http://tempuri.org/}CBackFlushBBC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCBackFlushBBC", propOrder = {
    "cBackFlushBBC"
})
public class ArrayOfCBackFlushBBC {

    @XmlElement(name = "CBackFlushBBC", nillable = true)
    protected List<CBackFlushBBC> cBackFlushBBC;

    /**
     * Gets the value of the cBackFlushBBC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cBackFlushBBC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCBackFlushBBC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBackFlushBBC }
     * 
     * 
     */
    public List<CBackFlushBBC> getCBackFlushBBC() {
        if (cBackFlushBBC == null) {
            cBackFlushBBC = new ArrayList<CBackFlushBBC>();
        }
        return this.cBackFlushBBC;
    }

}
