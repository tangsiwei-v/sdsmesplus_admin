
package com.uspring.sdsmesplus.wms.sap.f049;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_WIP_TRANF_INPUT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_WIP_TRANF_INPUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IT_INPUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:SuspectIsolation}DT_WIP_TRANF_INPUT_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_WIP_TRANF_INPUT", propOrder = {
    "itinput"
})
public class DTWIPTRANFINPUT {

    @XmlElement(name = "IT_INPUT", required = true)
    protected DTWIPTRANFINPUT.ITINPUT itinput;

    /**
     * ��ȡitinput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTWIPTRANFINPUT.ITINPUT }
     *     
     */
    public DTWIPTRANFINPUT.ITINPUT getITINPUT() {
        return itinput;
    }

    /**
     * ����itinput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTWIPTRANFINPUT.ITINPUT }
     *     
     */
    public void setITINPUT(DTWIPTRANFINPUT.ITINPUT value) {
        this.itinput = value;
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
     *         &lt;element name="ITEM" type="{urn:mes:SuspectIsolation}DT_WIP_TRANF_INPUT_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class ITINPUT {

        @XmlElement(name = "ITEM")
        protected List<DTWIPTRANFINPUTITEM> item;

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
         * {@link DTWIPTRANFINPUTITEM }
         * 
         * 
         */
        public List<DTWIPTRANFINPUTITEM> getITEM() {
            if (item == null) {
                item = new ArrayList<DTWIPTRANFINPUTITEM>();
            }
            return this.item;
        }

		public List<DTWIPTRANFINPUTITEM> getItem() {
			return item;
		}

		public void setItem(List<DTWIPTRANFINPUTITEM> item) {
			this.item = item;
		}
        
    }

}
