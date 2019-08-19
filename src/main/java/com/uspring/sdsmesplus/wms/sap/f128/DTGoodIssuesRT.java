
package com.uspring.sdsmesplus.wms.sap.f128;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_GoodIssues_RT complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_GoodIssues_RT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITEM" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OV_MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OV_MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="T_DATA" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ITEM" type="{urn:mes:GoodIssues}DT_GoodIssues_T_Data_Item" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "DT_GoodIssues_RT", propOrder = {
    "item"
})
public class DTGoodIssuesRT {

    @XmlElement(name = "ITEM")
    protected List<DTGoodIssuesRT.ITEM> item;

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
     * {@link DTGoodIssuesRT.ITEM }
     * 
     * 
     */
    public List<DTGoodIssuesRT.ITEM> getITEM() {
        if (item == null) {
            item = new ArrayList<DTGoodIssuesRT.ITEM>();
        }
        return this.item;
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
     *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OV_MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OV_MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="T_DATA" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ITEM" type="{urn:mes:GoodIssues}DT_GoodIssues_T_Data_Item" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "matnr",
        "ovmess",
        "ovmesst",
        "tdata"
    })
    public static class ITEM {

        @XmlElement(name = "MATNR")
        protected String matnr;
        @XmlElement(name = "OV_MESS")
        protected String ovmess;
        @XmlElement(name = "OV_MESS_T")
        protected String ovmesst;
        @XmlElement(name = "T_DATA")
        protected DTGoodIssuesRT.ITEM.TDATA tdata;

        /**
         * 获取matnr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMATNR() {
            return matnr;
        }

        /**
         * 设置matnr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMATNR(String value) {
            this.matnr = value;
        }

        /**
         * 获取ovmess属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVMESS() {
            return ovmess;
        }

        /**
         * 设置ovmess属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVMESS(String value) {
            this.ovmess = value;
        }

        /**
         * 获取ovmesst属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVMESST() {
            return ovmesst;
        }

        /**
         * 设置ovmesst属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVMESST(String value) {
            this.ovmesst = value;
        }

        /**
         * 获取tdata属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DTGoodIssuesRT.ITEM.TDATA }
         *     
         */
        public DTGoodIssuesRT.ITEM.TDATA getTDATA() {
            return tdata;
        }

        /**
         * 设置tdata属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DTGoodIssuesRT.ITEM.TDATA }
         *     
         */
        public void setTDATA(DTGoodIssuesRT.ITEM.TDATA value) {
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
         *         &lt;element name="ITEM" type="{urn:mes:GoodIssues}DT_GoodIssues_T_Data_Item" maxOccurs="unbounded" minOccurs="0"/>
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
            protected List<DTGoodIssuesTDataItem> item;

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
             * {@link DTGoodIssuesTDataItem }
             * 
             * 
             */
            public List<DTGoodIssuesTDataItem> getITEM() {
                if (item == null) {
                    item = new ArrayList<DTGoodIssuesTDataItem>();
                }
                return this.item;
            }

        }

    }

}
