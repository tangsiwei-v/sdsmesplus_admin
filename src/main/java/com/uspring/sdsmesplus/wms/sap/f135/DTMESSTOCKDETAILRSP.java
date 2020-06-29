
package com.uspring.sdsmesplus.wms.sap.f135;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MES_STOCKDETAIL_RSP complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_MES_STOCKDETAIL_RSP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OT_STOCK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ITEM" type="{urn:mes:f135:GetStockDetails}DT_MES_STOCKDETAIL_RSP_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DT_MES_STOCKDETAIL_RSP", propOrder = {
    "otstock"
})
public class DTMESSTOCKDETAILRSP {

    @XmlElement(name = "OT_STOCK")
    protected OTSTOCK otstock;

    /**
     * ��ȡotstock���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OTSTOCK }
     *     
     */
    public OTSTOCK getOTSTOCK() {
        return otstock;
    }

    /**
     * ����otstock���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OTSTOCK }
     *     
     */
    public void setOTSTOCK(OTSTOCK value) {
        this.otstock = value;
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
     *         &lt;element name="ITEM" type="{urn:mes:f135:GetStockDetails}DT_MES_STOCKDETAIL_RSP_ITEM" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class OTSTOCK {

        @XmlElement(name = "ITEM")
        protected List<DTMESSTOCKDETAILRSPITEM> item;

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
         * {@link DTMESSTOCKDETAILRSPITEM }
         * 
         * 
         */
        public List<DTMESSTOCKDETAILRSPITEM> getITEM() {
            if (item == null) {
                item = new ArrayList<DTMESSTOCKDETAILRSPITEM>();
            }
            return this.item;
        }

    }

}
