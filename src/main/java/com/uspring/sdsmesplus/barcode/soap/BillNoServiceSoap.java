
package com.uspring.sdsmesplus.barcode.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BillNoServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BillNoServiceSoap {


    /**
     * 
     * @param site
     * @param billType
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetNextBillNo", action = "http://tempuri.org/GetNextBillNo")
    @WebResult(name = "GetNextBillNoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetNextBillNo", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetNextBillNo")
    @ResponseWrapper(localName = "GetNextBillNoResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetNextBillNoResponse")
    public String getNextBillNo(
        @WebParam(name = "billType", targetNamespace = "http://tempuri.org/")
        EnumBillType billType,
        @WebParam(name = "site", targetNamespace = "http://tempuri.org/")
        String site);

    /**
     * 
     * @param site
     * @param bbcType
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBoxBarCodeNo", action = "http://tempuri.org/GetBoxBarCodeNo")
    @WebResult(name = "GetBoxBarCodeNoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBoxBarCodeNo", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetBoxBarCodeNo")
    @ResponseWrapper(localName = "GetBoxBarCodeNoResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetBoxBarCodeNoResponse")
    public String getBoxBarCodeNo(
        @WebParam(name = "bbcType", targetNamespace = "http://tempuri.org/")
        EnumBBCType bbcType,
        @WebParam(name = "site", targetNamespace = "http://tempuri.org/")
        String site);

}
