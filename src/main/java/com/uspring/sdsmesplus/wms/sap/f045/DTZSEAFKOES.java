
package com.uspring.sdsmesplus.wms.sap.f045;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_ZSEAFKOES complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_ZSEAFKOES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZSEAFKO" type="{urn:mes:PPOrderHours}DT_ZSEAFKO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZSEAFKOES", propOrder = {
    "zseafko"
})
public class DTZSEAFKOES {

    @XmlElement(name = "ZSEAFKO")
    protected List<DTZSEAFKO> zseafko;

    /**
     * Gets the value of the zseafko property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zseafko property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZSEAFKO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZSEAFKO }
     * 
     * 
     */
    public List<DTZSEAFKO> getZSEAFKO() {
        if (zseafko == null) {
            zseafko = new ArrayList<DTZSEAFKO>();
        }
        return this.zseafko;
    }

	public List<DTZSEAFKO> getZseafko() {
		return zseafko;
	}

	public void setZseafko(List<DTZSEAFKO> zseafko) {
		this.zseafko = zseafko;
	}

}
