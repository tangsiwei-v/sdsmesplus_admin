
package com.uspring.sdsmesplus.wms.sap.f245;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SI_MES_Unpacking_Out", targetNamespace = "urn:mes:Unpacking")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SIMESUnpackingOut {


    /**
     * 
     * @param mtUnpacking
     */
    @WebMethod(operationName = "SI_MES_Unpacking_Out", action = "http://sap.com/xi/WebService/soap1.1")
    public void siMESUnpackingOut(
        @WebParam(name = "MT_Unpacking", targetNamespace = "urn:ewm:Unpacking", mode = WebParam.Mode.INOUT, partName = "MT_Unpacking")
        Holder<DTUnpacking> mtUnpacking);

}
