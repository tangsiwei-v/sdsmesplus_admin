
package com.uspring.sdsmesplus.wms.sap.f135;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MES_STOCKDETAIL complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_MES_STOCKDETAIL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IV_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_ENTITLED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_LGNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_LGPLA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_LGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IV_OWNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_MES_STOCKDETAIL", propOrder = {
    "ivcat",
    "ivcharg",
    "iventitled",
    "ivlgnum",
    "ivlgpla",
    "ivlgtyp",
    "ivmatnr",
    "ivowner"
})
public class DTMESSTOCKDETAIL {

    @XmlElement(name = "IV_CAT")
    protected String ivcat;
    @XmlElement(name = "IV_CHARG")
    protected String ivcharg;
    @XmlElement(name = "IV_ENTITLED")
    protected String iventitled;
    @XmlElement(name = "IV_LGNUM")
    protected String ivlgnum;
    @XmlElement(name = "IV_LGPLA")
    protected String ivlgpla;
    @XmlElement(name = "IV_LGTYP")
    protected String ivlgtyp;
    @XmlElement(name = "IV_MATNR")
    protected String ivmatnr;
    @XmlElement(name = "IV_OWNER")
    protected String ivowner;

    /**
     * ��ȡivcat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVCAT() {
        return ivcat;
    }

    /**
     * ����ivcat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVCAT(String value) {
        this.ivcat = value;
    }

    /**
     * ��ȡivcharg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVCHARG() {
        return ivcharg;
    }

    /**
     * ����ivcharg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVCHARG(String value) {
        this.ivcharg = value;
    }

    /**
     * ��ȡiventitled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVENTITLED() {
        return iventitled;
    }

    /**
     * ����iventitled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVENTITLED(String value) {
        this.iventitled = value;
    }

    /**
     * ��ȡivlgnum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVLGNUM() {
        return ivlgnum;
    }

    /**
     * ����ivlgnum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVLGNUM(String value) {
        this.ivlgnum = value;
    }

    /**
     * ��ȡivlgpla���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVLGPLA() {
        return ivlgpla;
    }

    /**
     * ����ivlgpla���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVLGPLA(String value) {
        this.ivlgpla = value;
    }

    /**
     * ��ȡivlgtyp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVLGTYP() {
        return ivlgtyp;
    }

    /**
     * ����ivlgtyp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVLGTYP(String value) {
        this.ivlgtyp = value;
    }

    /**
     * ��ȡivmatnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVMATNR() {
        return ivmatnr;
    }

    /**
     * ����ivmatnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVMATNR(String value) {
        this.ivmatnr = value;
    }

    /**
     * ��ȡivowner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVOWNER() {
        return ivowner;
    }

    /**
     * ����ivowner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVOWNER(String value) {
        this.ivowner = value;
    }

}
