
package com.uspring.sdsmesplus.wms.sap.f245;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_Unpacking_Item complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_Unpacking_Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NISTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLENR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS_T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_Unpacking_Item", propOrder = {
    "vlenr",
    "nltyp",
    "nlpla",
    "lgnum",
    "matnr",
    "cat",
    "charg",
    "nista",
    "nlenr",
    "messt",
    "mess"
})
public class DTUnpackingItem {

    @XmlElement(name = "VLENR")
    protected String vlenr;
    @XmlElement(name = "NLTYP")
    protected String nltyp;
    @XmlElement(name = "NLPLA")
    protected String nlpla;
    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "CAT")
    protected String cat;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "NISTA")
    protected String nista;
    @XmlElement(name = "NLENR")
    protected String nlenr;
    @XmlElement(name = "MESS_T")
    protected String messt;
    @XmlElement(name = "MESS")
    protected String mess;

    /**
     * ��ȡvlenr���Ե�ֵ��
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
     * ����vlenr���Ե�ֵ��
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

    /**
     * ��ȡlgnum���Ե�ֵ��
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
     * ����lgnum���Ե�ֵ��
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
     * ��ȡcat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAT() {
        return cat;
    }

    /**
     * ����cat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAT(String value) {
        this.cat = value;
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
     * ��ȡnista���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNISTA() {
        return nista;
    }

    /**
     * ����nista���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNISTA(String value) {
        this.nista = value;
    }

    /**
     * ��ȡnlenr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLENR() {
        return nlenr;
    }

    /**
     * ����nlenr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLENR(String value) {
        this.nlenr = value;
    }

    /**
     * ��ȡmesst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESST() {
        return messt;
    }

    /**
     * ����messt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESST(String value) {
        this.messt = value;
    }

    /**
     * ��ȡmess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESS() {
        return mess;
    }

    /**
     * ����mess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESS(String value) {
        this.mess = value;
    }

}
