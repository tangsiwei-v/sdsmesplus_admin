
package com.uspring.sdsmesplus.wms.sap.f080;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_ZSEAFKO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_ZSEAFKO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZHIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZEMPNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GAMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMEIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXIDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHARG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLUZP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GLTRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VORNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VGW01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VGW02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VHILM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZWSTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZSRESBL" type="{urn:mes:PPOrderHours}DT_ZSRESBL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZSEAFKO", propOrder = {
    "zhind",
    "zguid",
    "zempno",
    "werks",
    "aufnr",
    "matnr",
    "gamng",
    "gmein",
    "exidv",
    "charg",
    "verid",
    "gluzp",
    "gltrp",
    "vornr",
    "vgw01",
    "vgw02",
    "vhilm",
    "zwstation",
    "zsresbl"
})
public class DTZSEAFKO {

    @XmlElement(name = "ZHIND")
    protected String zhind;
    @XmlElement(name = "ZGUID")
    protected String zguid;
    @XmlElement(name = "ZEMPNO")
    protected String zempno;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "GAMNG")
    protected String gamng;
    @XmlElement(name = "GMEIN")
    protected String gmein;
    @XmlElement(name = "EXIDV")
    protected String exidv;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "VERID")
    protected String verid;
    @XmlElement(name = "GLUZP")
    protected String gluzp;
    @XmlElement(name = "GLTRP")
    protected String gltrp;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "VGW01")
    protected String vgw01;
    @XmlElement(name = "VGW02")
    protected String vgw02;
    @XmlElement(name = "VHILM")
    protected String vhilm;
    @XmlElement(name = "ZWSTATION")
    protected String zwstation;
    @XmlElement(name = "ZSRESBL")
    protected List<DTZSRESBL> zsresbl;

    /**
     * ��ȡzhind���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZHIND() {
        return zhind;
    }

    /**
     * ����zhind���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZHIND(String value) {
        this.zhind = value;
    }

    /**
     * ��ȡzguid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZGUID() {
        return zguid;
    }

    /**
     * ����zguid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZGUID(String value) {
        this.zguid = value;
    }

    /**
     * ��ȡzempno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEMPNO() {
        return zempno;
    }

    /**
     * ����zempno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEMPNO(String value) {
        this.zempno = value;
    }

    /**
     * ��ȡwerks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * ����werks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * ��ȡaufnr���Ե�ֵ��
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
     * ����aufnr���Ե�ֵ��
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
     * ��ȡexidv���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXIDV() {
        return exidv;
    }

    /**
     * ����exidv���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXIDV(String value) {
        this.exidv = value;
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
     * ��ȡverid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERID() {
        return verid;
    }

    public String getZhind() {
		return zhind;
	}

	public void setZhind(String zhind) {
		this.zhind = zhind;
	}

	public String getZguid() {
		return zguid;
	}

	public void setZguid(String zguid) {
		this.zguid = zguid;
	}

	public String getZempno() {
		return zempno;
	}

	public void setZempno(String zempno) {
		this.zempno = zempno;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public String getAufnr() {
		return aufnr;
	}

	public void setAufnr(String aufnr) {
		this.aufnr = aufnr;
	}

	public String getMatnr() {
		return matnr;
	}

	public void setMatnr(String matnr) {
		this.matnr = matnr;
	}

	public String getGamng() {
		return gamng;
	}

	public void setGamng(String gamng) {
		this.gamng = gamng;
	}

	public String getGmein() {
		return gmein;
	}

	public void setGmein(String gmein) {
		this.gmein = gmein;
	}

	public String getExidv() {
		return exidv;
	}

	public void setExidv(String exidv) {
		this.exidv = exidv;
	}

	public String getCharg() {
		return charg;
	}

	public void setCharg(String charg) {
		this.charg = charg;
	}

	public String getVerid() {
		return verid;
	}

	public void setVerid(String verid) {
		this.verid = verid;
	}

	public String getGluzp() {
		return gluzp;
	}

	public void setGluzp(String gluzp) {
		this.gluzp = gluzp;
	}

	public String getGltrp() {
		return gltrp;
	}

	public void setGltrp(String gltrp) {
		this.gltrp = gltrp;
	}

	public String getVornr() {
		return vornr;
	}

	public void setVornr(String vornr) {
		this.vornr = vornr;
	}

	public String getVgw01() {
		return vgw01;
	}

	public void setVgw01(String vgw01) {
		this.vgw01 = vgw01;
	}

	public String getVgw02() {
		return vgw02;
	}

	public void setVgw02(String vgw02) {
		this.vgw02 = vgw02;
	}

	public String getVhilm() {
		return vhilm;
	}

	public void setVhilm(String vhilm) {
		this.vhilm = vhilm;
	}

	public String getZwstation() {
		return zwstation;
	}

	public void setZwstation(String zwstation) {
		this.zwstation = zwstation;
	}

	public List<DTZSRESBL> getZsresbl() {
		return zsresbl;
	}

	public void setZsresbl(List<DTZSRESBL> zsresbl) {
		this.zsresbl = zsresbl;
	}

	/**
     * ����verid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERID(String value) {
        this.verid = value;
    }

    /**
     * ��ȡgluzp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLUZP() {
        return gluzp;
    }

    /**
     * ����gluzp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLUZP(String value) {
        this.gluzp = value;
    }

    /**
     * ��ȡgltrp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLTRP() {
        return gltrp;
    }

    /**
     * ����gltrp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLTRP(String value) {
        this.gltrp = value;
    }

    /**
     * ��ȡvornr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNR() {
        return vornr;
    }

    /**
     * ����vornr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNR(String value) {
        this.vornr = value;
    }

    /**
     * ��ȡvgw01���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGW01() {
        return vgw01;
    }

    /**
     * ����vgw01���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGW01(String value) {
        this.vgw01 = value;
    }

    /**
     * ��ȡvgw02���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVGW02() {
        return vgw02;
    }

    /**
     * ����vgw02���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVGW02(String value) {
        this.vgw02 = value;
    }

    /**
     * ��ȡvhilm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILM() {
        return vhilm;
    }

    /**
     * ����vhilm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILM(String value) {
        this.vhilm = value;
    }

    /**
     * ��ȡzwstation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZWSTATION() {
        return zwstation;
    }

    /**
     * ����zwstation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZWSTATION(String value) {
        this.zwstation = value;
    }

    /**
     * Gets the value of the zsresbl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zsresbl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZSRESBL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZSRESBL }
     * 
     * 
     */
    public List<DTZSRESBL> getZSRESBL() {
        if (zsresbl == null) {
            zsresbl = new ArrayList<DTZSRESBL>();
        }
        return this.zsresbl;
    }

}
