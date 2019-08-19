
package com.uspring.sdsmesplus.wms.sap.f128;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SI_MES_GoodIssues_OutService", targetNamespace = "urn:mes:GoodIssues", wsdlLocation = "http://10.50.52.152:10005/F128_QAS_SI_MES_GoodIssues_OutService.wsdl")
public class SIMESGoodIssuesOutService
    extends Service
{

    private final static URL SIMESGOODISSUESOUTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SIMESGOODISSUESOUTSERVICE_EXCEPTION;
    private final static QName SIMESGOODISSUESOUTSERVICE_QNAME = new QName("urn:mes:GoodIssues", "SI_MES_GoodIssues_OutService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.50.52.152:10005/F128_QAS_SI_MES_GoodIssues_OutService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMESGOODISSUESOUTSERVICE_WSDL_LOCATION = url;
        SIMESGOODISSUESOUTSERVICE_EXCEPTION = e;
    }

    public SIMESGoodIssuesOutService() {
        super(__getWsdlLocation(), SIMESGOODISSUESOUTSERVICE_QNAME);
    }

    public SIMESGoodIssuesOutService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMESGOODISSUESOUTSERVICE_QNAME, features);
    }

    public SIMESGoodIssuesOutService(URL wsdlLocation) {
        super(wsdlLocation, SIMESGOODISSUESOUTSERVICE_QNAME);
    }

    public SIMESGoodIssuesOutService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMESGOODISSUESOUTSERVICE_QNAME, features);
    }

    public SIMESGoodIssuesOutService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIMESGoodIssuesOutService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SIMESGoodIssuesOut
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIMESGoodIssuesOut getHTTPPort() {
        return super.getPort(new QName("urn:mes:GoodIssues", "HTTP_Port"), SIMESGoodIssuesOut.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIMESGoodIssuesOut
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIMESGoodIssuesOut getHTTPPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:mes:GoodIssues", "HTTP_Port"), SIMESGoodIssuesOut.class, features);
    }

    /**
     * 
     * @return
     *     returns SIMESGoodIssuesOut
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIMESGoodIssuesOut getHTTPSPort() {
        return super.getPort(new QName("urn:mes:GoodIssues", "HTTPS_Port"), SIMESGoodIssuesOut.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SIMESGoodIssuesOut
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIMESGoodIssuesOut getHTTPSPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:mes:GoodIssues", "HTTPS_Port"), SIMESGoodIssuesOut.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMESGOODISSUESOUTSERVICE_EXCEPTION!= null) {
            throw SIMESGOODISSUESOUTSERVICE_EXCEPTION;
        }
        return SIMESGOODISSUESOUTSERVICE_WSDL_LOCATION;
    }

}
