
package com.uspring.sdsmesplus.wms.sap.f049;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_WIP_TRANF_OUTPUT complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_WIP_TRANF_OUTPUT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EV_TANUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OT_OUTPUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:SuspectIsolation}DT_WIP_TRANF_OUTPUT_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_WIP_TRANF_OUTPUT", propOrder = {
    "evtanum",
    "otoutput"
})
public class DTWIPTRANFOUTPUT {

    @XmlElement(name = "EV_TANUM")
    protected String evtanum;
    @XmlElement(name = "OT_OUTPUT", required = true)
    protected DTWIPTRANFOUTPUT.OTOUTPUT otoutput;

    /**
     * ��ȡevtanum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVTANUM() {
        return evtanum;
    }

    /**
     * ����evtanum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVTANUM(String value) {
        this.evtanum = value;
    }

    /**
     * ��ȡotoutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTWIPTRANFOUTPUT.OTOUTPUT }
     *     
     */
    public DTWIPTRANFOUTPUT.OTOUTPUT getOTOUTPUT() {
        return otoutput;
    }

    /**
     * ����otoutput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTWIPTRANFOUTPUT.OTOUTPUT }
     *     
     */
    public void setOTOUTPUT(DTWIPTRANFOUTPUT.OTOUTPUT value) {
        this.otoutput = value;
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
     *         &lt;element name="ITEM" type="{urn:mes:SuspectIsolation}DT_WIP_TRANF_OUTPUT_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class OTOUTPUT {

        @XmlElement(name = "ITEM")
        protected List<DTWIPTRANFOUTPUTITEM> item;

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
         * {@link DTWIPTRANFOUTPUTITEM }
         * 
         * 
         */
        public List<DTWIPTRANFOUTPUTITEM> getITEM() {
            if (item == null) {
                item = new ArrayList<DTWIPTRANFOUTPUTITEM>();
            }
            return this.item;
        }

		public List<DTWIPTRANFOUTPUTITEM> getItem() {
			return item;
		}

		public void setItem(List<DTWIPTRANFOUTPUTITEM> item) {
			this.item = item;
		}
        
    }

}
