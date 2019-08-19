
package com.uspring.sdsmesplus.wms.sap.f241;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uspring.sdsmesplus.wms.sap.f241 package. 
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

    private final static QName _MTMoveStockRet_QNAME = new QName("urn:mes:MoveStock", "MT_MoveStock_Ret");
    private final static QName _MTMoveStockReq_QNAME = new QName("urn:mes:MoveStock", "MT_MoveStock_Req");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uspring.sdsmesplus.wms.sap.f241
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTMoveStockReq }
     * 
     */
    public DTMoveStockReq createDTMoveStockReq() {
        return new DTMoveStockReq();
    }

    /**
     * Create an instance of {@link DTMoveStockRet }
     * 
     */
    public DTMoveStockRet createDTMoveStockRet() {
        return new DTMoveStockRet();
    }

    /**
     * Create an instance of {@link DTMoveStockReq.IWDATA }
     * 
     */
    public DTMoveStockReq.IWDATA createDTMoveStockReqIWDATA() {
        return new DTMoveStockReq.IWDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMoveStockRet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:MoveStock", name = "MT_MoveStock_Ret")
    public JAXBElement<DTMoveStockRet> createMTMoveStockRet(DTMoveStockRet value) {
        return new JAXBElement<DTMoveStockRet>(_MTMoveStockRet_QNAME, DTMoveStockRet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMoveStockReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mes:MoveStock", name = "MT_MoveStock_Req")
    public JAXBElement<DTMoveStockReq> createMTMoveStockReq(DTMoveStockReq value) {
        return new JAXBElement<DTMoveStockReq>(_MTMoveStockReq_QNAME, DTMoveStockReq.class, null, value);
    }

}
