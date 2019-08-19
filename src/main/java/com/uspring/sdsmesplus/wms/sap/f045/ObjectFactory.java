
package com.uspring.sdsmesplus.wms.sap.f045;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f045 package. 
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

    private final static QName _MTZPPCNFM1_QNAME = new QName("urn:mes:PPOrderHours", "MT_ZPPCNFM1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f045
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZSEAFKOES }
     * 
     */
    public DTZSEAFKOES createDTZSEAFKOES() {
        return new DTZSEAFKOES();
    }

    /**
     * Create an instance of {@link DTZSEAFKO }
     * 
     */
    public DTZSEAFKO createDTZSEAFKO() {
        return new DTZSEAFKO();
    }

    /**
     * Create an instance of {@link DTZSRESBL }
     * 
     */
    public DTZSRESBL createDTZSRESBL() {
        return new DTZSRESBL();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZSEAFKOES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:PPOrderHours", name = "MT_ZPPCNFM1")
    public JAXBElement<DTZSEAFKOES> createMTZPPCNFM1(DTZSEAFKOES value) {
        return new JAXBElement<DTZSEAFKOES>(_MTZPPCNFM1_QNAME, DTZSEAFKOES.class, null, value);
    }

}
