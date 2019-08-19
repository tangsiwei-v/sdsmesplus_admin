
package com.uspring.sdsmesplus.wms.sap.f241;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MoveStock_Req complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DT_MoveStock_Req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IW_DATA">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="C_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DT_MoveStock_Req", propOrder = {
    "iwdata"
})
public class DTMoveStockReq {

    @XmlElement(name = "IW_DATA", required = true)
    protected DTMoveStockReq.IWDATA iwdata;

    /**
     * 获取iwdata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DTMoveStockReq.IWDATA }
     *     
     */
    public DTMoveStockReq.IWDATA getIWDATA() {
        return iwdata;
    }

    /**
     * 设置iwdata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DTMoveStockReq.IWDATA }
     *     
     */
    public void setIWDATA(DTMoveStockReq.IWDATA value) {
        this.iwdata = value;
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
     *         &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="C_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "lgnum",
        "vlenr",
        "vltyp",
        "vlpla",
        "nltyp",
        "nlpla",
        "aufnr",
        "matnr",
        "cname"
    })
    public static class IWDATA {

        @XmlElement(name = "LGNUM")
        protected String lgnum;
        @XmlElement(name = "VLENR")
        protected String vlenr;
        @XmlElement(name = "VLTYP")
        protected String vltyp;
        @XmlElement(name = "VLPLA")
        protected String vlpla;
        @XmlElement(name = "NLTYP")
        protected String nltyp;
        @XmlElement(name = "NLPLA")
        protected String nlpla;
        @XmlElement(name = "AUFNR")
        protected String aufnr;
        @XmlElement(name = "MATNR")
        protected String matnr;
        @XmlElement(name = "C_NAME")
        protected String cname;

        /**
         * 获取lgnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLGNUM() {
            return lgnum;
        }

        /**
         * 设置lgnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLGNUM(String value) {
            this.lgnum = value;
        }

        /**
         * 获取vlenr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVLENR() {
            return vlenr;
        }

        /**
         * 设置vlenr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVLENR(String value) {
            this.vlenr = value;
        }

        /**
         * 获取vltyp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVLTYP() {
            return vltyp;
        }

        /**
         * 设置vltyp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVLTYP(String value) {
            this.vltyp = value;
        }

        /**
         * 获取vlpla属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVLPLA() {
            return vlpla;
        }

        /**
         * 设置vlpla属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVLPLA(String value) {
            this.vlpla = value;
        }

        /**
         * 获取nltyp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNLTYP() {
            return nltyp;
        }

        /**
         * 设置nltyp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNLTYP(String value) {
            this.nltyp = value;
        }

        /**
         * 获取nlpla属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNLPLA() {
            return nlpla;
        }

        /**
         * 设置nlpla属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNLPLA(String value) {
            this.nlpla = value;
        }

        /**
         * 获取aufnr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUFNR() {
            return aufnr;
        }

        /**
         * 设置aufnr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUFNR(String value) {
            this.aufnr = value;
        }

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
         * 获取cname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNAME() {
            return cname;
        }

        /**
         * 设置cname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNAME(String value) {
            this.cname = value;
        }

    }

}
