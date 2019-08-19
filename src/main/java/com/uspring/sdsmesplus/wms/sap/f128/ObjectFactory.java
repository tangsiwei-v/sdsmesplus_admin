
package com.uspring.sdsmesplus.wms.sap.f128;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f128 package. 
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

    private final static QName _MTGoodIssuesRT_QNAME = new QName("urn:mes:GoodIssues", "MT_GoodIssues_RT");
    private final static QName _MTGoodIssues_QNAME = new QName("urn:mes:GoodIssues", "MT_GoodIssues");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f128
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTGoodIssuesRT }
     * 
     */
    public DTGoodIssuesRT createDTGoodIssuesRT() {
        return new DTGoodIssuesRT();
    }

    /**
     * Create an instance of {@link DTGoodIssuesRT.ITEM }
     * 
     */
    public DTGoodIssuesRT.ITEM createDTGoodIssuesRTITEM() {
        return new DTGoodIssuesRT.ITEM();
    }

    /**
     * Create an instance of {@link DTGoodIssues }
     * 
     */
    public DTGoodIssues createDTGoodIssues() {
        return new DTGoodIssues();
    }

    /**
     * Create an instance of {@link DTGoodIssuesTDataItem }
     * 
     */
    public DTGoodIssuesTDataItem createDTGoodIssuesTDataItem() {
        return new DTGoodIssuesTDataItem();
    }

    /**
     * Create an instance of {@link DTGoodIssuesIsData }
     * 
     */
    public DTGoodIssuesIsData createDTGoodIssuesIsData() {
        return new DTGoodIssuesIsData();
    }

    /**
     * Create an instance of {@link DTGoodIssuesRT.ITEM.TDATA }
     * 
     */
    public DTGoodIssuesRT.ITEM.TDATA createDTGoodIssuesRTITEMTDATA() {
        return new DTGoodIssuesRT.ITEM.TDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTGoodIssuesRT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:GoodIssues", name = "MT_GoodIssues_RT")
    public JAXBElement<DTGoodIssuesRT> createMTGoodIssuesRT(DTGoodIssuesRT value) {
        return new JAXBElement<DTGoodIssuesRT>(_MTGoodIssuesRT_QNAME, DTGoodIssuesRT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTGoodIssues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:GoodIssues", name = "MT_GoodIssues")
    public JAXBElement<DTGoodIssues> createMTGoodIssues(DTGoodIssues value) {
        return new JAXBElement<DTGoodIssues>(_MTGoodIssues_QNAME, DTGoodIssues.class, null, value);
    }

}
