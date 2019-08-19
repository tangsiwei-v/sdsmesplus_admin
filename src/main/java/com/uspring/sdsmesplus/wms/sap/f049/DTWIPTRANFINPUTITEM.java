
package com.uspring.sdsmesplus.wms.sap.f049;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_WIP_TRANF_INPUT_ITEM complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_WIP_TRANF_INPUT_ITEM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GAMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMEIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_WIP_TRANF_INPUT_ITEM", propOrder = {
    "matnr",
    "gamng",
    "gmein",
    "charg",
    "vltyp",
    "vlpla",
    "nltyp",
    "nlpla"
})
public class DTWIPTRANFINPUTITEM {

    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "GAMNG")
    protected String gamng;
    @XmlElement(name = "GMEIN")
    protected String gmein;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "VLTYP")
    protected String vltyp;
    @XmlElement(name = "VLPLA")
    protected String vlpla;
    @XmlElement(name = "NLTYP")
    protected String nltyp;
    @XmlElement(name = "NLPLA")
    protected String nlpla;

    /**
     * ��ȡmatnr���Ե�ֵ��
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
     * ����matnr���Ե�ֵ��
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
     * ��ȡgamng���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGAMNG() {
        return gamng;
    }

    /**
     * ����gamng���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGAMNG(String value) {
        this.gamng = value;
    }

    /**
     * ��ȡgmein���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMEIN() {
        return gmein;
    }

    /**
     * ����gmein���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMEIN(String value) {
        this.gmein = value;
    }

    /**
     * ��ȡcharg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARG() {
        return charg;
    }

    /**
     * ����charg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARG(String value) {
        this.charg = value;
    }

    /**
     * ��ȡvltyp���Ե�ֵ��
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
     * ����vltyp���Ե�ֵ��
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
     * ��ȡvlpla���Ե�ֵ��
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
     * ����vlpla���Ե�ֵ��
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
     * ��ȡnltyp���Ե�ֵ��
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
     * ����nltyp���Ե�ֵ��
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
     * ��ȡnlpla���Ե�ֵ��
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
     * ����nlpla���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLPLA(String value) {
        this.nlpla = value;
    }

}
