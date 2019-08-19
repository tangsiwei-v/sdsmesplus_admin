
package com.uspring.sdsmesplus.wms.sap.f049;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.f049 package. 
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

    private final static QName _MTWIPTRANFOUTPUT_QNAME = new QName("urn:mes:SuspectIsolation", "MT_WIP_TRANF_OUTPUT");
    private final static QName _MTWIPTRANFINPUT_QNAME = new QName("urn:mes:SuspectIsolation", "MT_WIP_TRANF_INPUT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.f049
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTWIPTRANFINPUT }
     * 
     */
    public DTWIPTRANFINPUT createDTWIPTRANFINPUT() {
        return new DTWIPTRANFINPUT();
    }

    /**
     * Create an instance of {@link DTWIPTRANFOUTPUT }
     * 
     */
    public DTWIPTRANFOUTPUT createDTWIPTRANFOUTPUT() {
        return new DTWIPTRANFOUTPUT();
    }

    /**
     * Create an instance of {@link DTWIPTRANFINPUTITEM }
     * 
     */
    public DTWIPTRANFINPUTITEM createDTWIPTRANFINPUTITEM() {
        return new DTWIPTRANFINPUTITEM();
    }

    /**
     * Create an instance of {@link DTWIPTRANFOUTPUTITEM }
     * 
     */
    public DTWIPTRANFOUTPUTITEM createDTWIPTRANFOUTPUTITEM() {
        return new DTWIPTRANFOUTPUTITEM();
    }

    /**
     * Create an instance of {@link DTWIPTRANFINPUT.ITINPUT }
     * 
     */
    public DTWIPTRANFINPUT.ITINPUT createDTWIPTRANFINPUTITINPUT() {
        return new DTWIPTRANFINPUT.ITINPUT();
    }

    /**
     * Create an instance of {@link DTWIPTRANFOUTPUT.OTOUTPUT }
     * 
     */
    public DTWIPTRANFOUTPUT.OTOUTPUT createDTWIPTRANFOUTPUTOTOUTPUT() {
        return new DTWIPTRANFOUTPUT.OTOUTPUT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTWIPTRANFOUTPUT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:SuspectIsolation", name = "MT_WIP_TRANF_OUTPUT")
    public JAXBElement<DTWIPTRANFOUTPUT> createMTWIPTRANFOUTPUT(DTWIPTRANFOUTPUT value) {
        return new JAXBElement<DTWIPTRANFOUTPUT>(_MTWIPTRANFOUTPUT_QNAME, DTWIPTRANFOUTPUT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTWIPTRANFINPUT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:SuspectIsolation", name = "MT_WIP_TRANF_INPUT")
    public JAXBElement<DTWIPTRANFINPUT> createMTWIPTRANFINPUT(DTWIPTRANFINPUT value) {
        return new JAXBElement<DTWIPTRANFINPUT>(_MTWIPTRANFINPUT_QNAME, DTWIPTRANFINPUT.class, null, value);
    }

}
