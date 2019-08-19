
package com.uspring.sdsmesplus.wms.sap.f133;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f133 package. 
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

    private final static QName _MTGetHuDataRT_QNAME = new QName("urn:mes:f133:GetHuDetails", "MT_GetHuData_RT");
    private final static QName _MTGetHuData_QNAME = new QName("urn:mes:f133:GetHuDetails", "MT_GetHuData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f133
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTGetHuDataRT }
     * 
     */
    public DTGetHuDataRT createDTGetHuDataRT() {
        return new DTGetHuDataRT();
    }

    /**
     * Create an instance of {@link DTGetHuData }
     * 
     */
    public DTGetHuData createDTGetHuData() {
        return new DTGetHuData();
    }

    /**
     * Create an instance of {@link DTGetHuDataItem }
     * 
     */
    public DTGetHuDataItem createDTGetHuDataItem() {
        return new DTGetHuDataItem();
    }

    /**
     * Create an instance of {@link DTGetHuDataRT.TDATA }
     * 
     */
    public DTGetHuDataRT.TDATA createDTGetHuDataRTTDATA() {
        return new DTGetHuDataRT.TDATA();
    }

    /**
     * Create an instance of {@link DTGetHuData.TDATA }
     * 
     */
    public DTGetHuData.TDATA createDTGetHuDataTDATA() {
        return new DTGetHuData.TDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTGetHuDataRT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f133:GetHuDetails", name = "MT_GetHuData_RT")
    public JAXBElement<DTGetHuDataRT> createMTGetHuDataRT(DTGetHuDataRT value) {
        return new JAXBElement<DTGetHuDataRT>(_MTGetHuDataRT_QNAME, DTGetHuDataRT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTGetHuData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:f133:GetHuDetails", name = "MT_GetHuData")
    public JAXBElement<DTGetHuData> createMTGetHuData(DTGetHuData value) {
        return new JAXBElement<DTGetHuData>(_MTGetHuData_QNAME, DTGetHuData.class, null, value);
    }

}
