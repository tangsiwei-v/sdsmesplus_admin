
package com.uspring.sdsmesplus.wms.sap.f113;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f113 package. 
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

    private final static QName _MTSafeLaunchRT_QNAME = new QName("urn:mes:f113:JudgeSafeLaunch", "MT_SafeLaunch_RT");
    private final static QName _MTSafeLaunch_QNAME = new QName("urn:mes:f113:JudgeSafeLaunch", "MT_SafeLaunch");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f113
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTSafeLaunch }
     * 
     */
    public DTSafeLaunch createDTSafeLaunch() {
        return new DTSafeLaunch();
    }

    /**
     * Create an instance of {@link DTSafeLaunchRT }
     * 
     */
    public DTSafeLaunchRT createDTSafeLaunchRT() {
        return new DTSafeLaunchRT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSafeLaunchRT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f113:JudgeSafeLaunch", name = "MT_SafeLaunch_RT")
    public JAXBElement<DTSafeLaunchRT> createMTSafeLaunchRT(DTSafeLaunchRT value) {
        return new JAXBElement<DTSafeLaunchRT>(_MTSafeLaunchRT_QNAME, DTSafeLaunchRT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSafeLaunch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f113:JudgeSafeLaunch", name = "MT_SafeLaunch")
    public JAXBElement<DTSafeLaunch> createMTSafeLaunch(DTSafeLaunch value) {
        return new JAXBElement<DTSafeLaunch>(_MTSafeLaunch_QNAME, DTSafeLaunch.class, null, value);
    }

}
