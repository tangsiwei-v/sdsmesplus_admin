
package com.uspring.sdsmesplus.wms.sap.f245;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.f245 package. 
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

    private final static QName _MTUnpacking_QNAME = new QName("urn:ewm:Unpacking", "MT_Unpacking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.f245
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTUnpacking }
     * 
     */
    public DTUnpacking createDTUnpacking() {
        return new DTUnpacking();
    }

    /**
     * Create an instance of {@link DTUnpackingItem }
     * 
     */
    public DTUnpackingItem createDTUnpackingItem() {
        return new DTUnpackingItem();
    }

    /**
     * Create an instance of {@link DTUnpacking.TDATA }
     * 
     */
    public DTUnpacking.TDATA createDTUnpackingTDATA() {
        return new DTUnpacking.TDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTUnpacking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ewm:Unpacking", name = "MT_Unpacking")
    public JAXBElement<DTUnpacking> createMTUnpacking(DTUnpacking value) {
        return new JAXBElement<DTUnpacking>(_MTUnpacking_QNAME, DTUnpacking.class, null, value);
    }

}
