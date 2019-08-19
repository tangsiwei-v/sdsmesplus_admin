
package com.uspring.sdsmesplus.wms.sap.f133;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GetHuData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GetHuData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IV_HU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_DATA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:f133:GetHuDetails}DT_GetHuData_Item" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_GetHuData", propOrder = {
    "ivhu",
    "tdata"
})
public class DTGetHuData {

    @XmlElement(name = "IV_HU", required = true)
    protected String ivhu;
    @XmlElement(name = "T_DATA", required = true)
    protected DTGetHuData.TDATA tdata;

    /**
     * 获取ivhu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVHU() {
        return ivhu;
    }

    /**
     * 设置ivhu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVHU(String value) {
        this.ivhu = value;
    }

    /**
     * 获取tdata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DTGetHuData.TDATA }
     *     
     */
    public DTGetHuData.TDATA getTDATA() {
        return tdata;
    }

    /**
     * 设置tdata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DTGetHuData.TDATA }
     *     
     */
    public void setTDATA(DTGetHuData.TDATA value) {
        this.tdata = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ITEM" type="{urn:mes:f133:GetHuDetails}DT_GetHuData_Item" maxOccurs="unbounded" minOccurs="0"/>
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
        "item"
    })
    public static class TDATA {

        @XmlElement(name = "ITEM")
        protected List<DTGetHuDataItem> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DTGetHuDataItem }
         * 
         * 
         */
        public List<DTGetHuDataItem> getITEM() {
            if (item == null) {
                item = new ArrayList<DTGetHuDataItem>();
            }
            return this.item;
        }

		public List<DTGetHuDataItem> getItem() {
			return item;
		}

		public void setItem(List<DTGetHuDataItem> item) {
			this.item = item;
		}

    }

}
