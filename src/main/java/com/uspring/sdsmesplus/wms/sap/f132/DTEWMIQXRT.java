
package com.uspring.sdsmesplus.wms.sap.f132;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_EWMI_QX_RT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_EWMI_QX_RT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_DATA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:ClearLineReport}DT_IS_DATA" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_EWMI_QX_RT", propOrder = {
    "tdata"
})
public class DTEWMIQXRT {

    @XmlElement(name = "T_DATA", required = true)
    protected DTEWMIQXRT.TDATA tdata;

    /**
     * 获取tdata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DTEWMIQXRT.TDATA }
     *     
     */
    public DTEWMIQXRT.TDATA getTDATA() {
        return tdata;
    }

    /**
     * 设置tdata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DTEWMIQXRT.TDATA }
     *     
     */
    public void setTDATA(DTEWMIQXRT.TDATA value) {
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
     *         &lt;element name="ITEM" type="{urn:mes:ClearLineReport}DT_IS_DATA" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<DTISDATA> item;

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
         * {@link DTISDATA }
         * 
         * 
         */
        public List<DTISDATA> getITEM() {
            if (item == null) {
                item = new ArrayList<DTISDATA>();
            }
            return this.item;
        }

    }

}
