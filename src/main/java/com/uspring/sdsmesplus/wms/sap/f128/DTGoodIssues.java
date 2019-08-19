
package com.uspring.sdsmesplus.wms.sap.f128;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GoodIssues complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GoodIssues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IS_DATA" type="{urn:mes:GoodIssues}DT_GoodIssues_Is_Data" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_GoodIssues", propOrder = {
    "isdata"
})
public class DTGoodIssues {

    @XmlElement(name = "IS_DATA")
    protected List<DTGoodIssuesIsData> isdata;

    /**
     * Gets the value of the isdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTGoodIssuesIsData }
     * 
     * 
     */
    public List<DTGoodIssuesIsData> getISDATA() {
        if (isdata == null) {
            isdata = new ArrayList<DTGoodIssuesIsData>();
        }
        return this.isdata;
    }

	public List<DTGoodIssuesIsData> getIsdata() {
		return isdata;
	}

	public void setIsdata(List<DTGoodIssuesIsData> isdata) {
		this.isdata = isdata;
	}

}
