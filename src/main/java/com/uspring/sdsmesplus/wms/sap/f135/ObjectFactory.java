
package com.uspring.sdsmesplus.wms.sap.f135;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f135 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTMESSTOCKDETAILRSP_QNAME = new QName("urn:mes:f135:GetStockDetails", "MT_MES_STOCKDETAIL_RSP");
    private final static QName _MTMESSTOCKDETAIL_QNAME = new QName("urn:mes:f135:GetStockDetails", "MT_MES_STOCKDETAIL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f135
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTMESSTOCKDETAILRSP }
     * 
     */
    public DTMESSTOCKDETAILRSP createDTMESSTOCKDETAILRSP() {
        return new DTMESSTOCKDETAILRSP();
    }

    /**
     * Create an instance of {@link DTMESSTOCKDETAIL }
     * 
     */
    public DTMESSTOCKDETAIL createDTMESSTOCKDETAIL() {
        return new DTMESSTOCKDETAIL();
    }

    /**
     * Create an instance of {@link DTMESSTOCKDETAILRSPITEM }
     * 
     */
    public DTMESSTOCKDETAILRSPITEM createDTMESSTOCKDETAILRSPITEM() {
        return new DTMESSTOCKDETAILRSPITEM();
    }

    /**
     * Create an instance of {@link DTMESSTOCKDETAILRSP.OTSTOCK }
     * 
     */
    public DTMESSTOCKDETAILRSP.OTSTOCK createDTMESSTOCKDETAILRSPOTSTOCK() {
        return new DTMESSTOCKDETAILRSP.OTSTOCK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMESSTOCKDETAILRSP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f135:GetStockDetails", name = "MT_MES_STOCKDETAIL_RSP")
    public JAXBElement<DTMESSTOCKDETAILRSP> createMTMESSTOCKDETAILRSP(DTMESSTOCKDETAILRSP value) {
        return new JAXBElement<DTMESSTOCKDETAILRSP>(_MTMESSTOCKDETAILRSP_QNAME, DTMESSTOCKDETAILRSP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMESSTOCKDETAIL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f135:GetStockDetails", name = "MT_MES_STOCKDETAIL")
    public JAXBElement<DTMESSTOCKDETAIL> createMTMESSTOCKDETAIL(DTMESSTOCKDETAIL value) {
        return new JAXBElement<DTMESSTOCKDETAIL>(_MTMESSTOCKDETAIL_QNAME, DTMESSTOCKDETAIL.class, null, value);
    }

}
