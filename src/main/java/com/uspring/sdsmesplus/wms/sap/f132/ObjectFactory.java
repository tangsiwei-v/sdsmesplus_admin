
package com.uspring.sdsmesplus.wms.sap.f132;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f132 package. 
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

    private final static QName _MTEWMIQXRT_QNAME = new QName("urn:mes:ClearLineReport", "MT_EWMI_QX_RT");
    private final static QName _MTEWMIQX_QNAME = new QName("urn:mes:ClearLineReport", "MT_EWMI_QX");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f132
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTEWMIQX }
     * 
     */
    public DTEWMIQX createDTEWMIQX() {
        return new DTEWMIQX();
    }

    /**
     * Create an instance of {@link DTEWMIQXRT }
     * 
     */
    public DTEWMIQXRT createDTEWMIQXRT() {
        return new DTEWMIQXRT();
    }

    /**
     * Create an instance of {@link DTISDATA }
     * 
     */
    public DTISDATA createDTISDATA() {
        return new DTISDATA();
    }

    /**
     * Create an instance of {@link DTEWMIQX.TDATA }
     * 
     */
    public DTEWMIQX.TDATA createDTEWMIQXTDATA() {
        return new DTEWMIQX.TDATA();
    }

    /**
     * Create an instance of {@link DTEWMIQXRT.TDATA }
     * 
     */
    public DTEWMIQXRT.TDATA createDTEWMIQXRTTDATA() {
        return new DTEWMIQXRT.TDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTEWMIQXRT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:ClearLineReport", name = "MT_EWMI_QX_RT")
    public JAXBElement<DTEWMIQXRT> createMTEWMIQXRT(DTEWMIQXRT value) {
        return new JAXBElement<DTEWMIQXRT>(_MTEWMIQXRT_QNAME, DTEWMIQXRT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTEWMIQX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:ClearLineReport", name = "MT_EWMI_QX")
    public JAXBElement<DTEWMIQX> createMTEWMIQX(DTEWMIQX value) {
        return new JAXBElement<DTEWMIQX>(_MTEWMIQX_QNAME, DTEWMIQX.class, null, value);
    }

}
