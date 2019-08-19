
package com.uspring.sdsmesplus.wms.sap.f245;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_Unpacking complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_Unpacking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="T_DATA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:Unpacking}DT_Unpacking_Item" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_Unpacking", propOrder = {
    "tdata"
})
public class DTUnpacking {

    @XmlElement(name = "T_DATA", required = true)
    protected DTUnpacking.TDATA tdata;

    /**
     * ��ȡtdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTUnpacking.TDATA }
     *     
     */
    public DTUnpacking.TDATA getTDATA() {
        return tdata;
    }

    /**
     * ����tdata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTUnpacking.TDATA }
     *     
     */
    public void setTDATA(DTUnpacking.TDATA value) {
        this.tdata = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ITEM" type="{urn:mes:Unpacking}DT_Unpacking_Item" maxOccurs="unbounded" minOccurs="0"/>
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
        protected List<DTUnpackingItem> item;

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
         * {@link DTUnpackingItem }
         * 
         * 
         */
        public List<DTUnpackingItem> getITEM() {
            if (item == null) {
                item = new ArrayList<DTUnpackingItem>();
            }
            return this.item;
        }

		public List<DTUnpackingItem> getItem() {
			return item;
		}

		public void setItem(List<DTUnpackingItem> item) {
			this.item = item;
		}
        

    }

}
