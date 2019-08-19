
package com.uspring.sdsmesplus.barcode.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCLoginUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCLoginUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLoginUser" type="{http://tempuri.org/}CLoginUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCLoginUser", propOrder = {
    "cLoginUser"
})
public class ArrayOfCLoginUser {

    @XmlElement(name = "CLoginUser", nillable = true)
    protected List<CLoginUser> cLoginUser;

    /**
     * Gets the value of the cLoginUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cLoginUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCLoginUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLoginUser }
     * 
     * 
     */
    public List<CLoginUser> getCLoginUser() {
        if (cLoginUser == null) {
            cLoginUser = new ArrayList<CLoginUser>();
        }
        return this.cLoginUser;
    }

}
