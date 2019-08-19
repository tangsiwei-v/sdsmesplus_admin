
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
@WebService(name = "MaterialPullServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MaterialPullServiceSoap {


    /**
     * 
     * @param site
     * @param custNo
     * @param partNo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCustPartNo", action = "http://tempuri.org/GetCustPartNo")
    @WebResult(name = "GetCustPartNoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCustPartNo", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetCustPartNo")
    @ResponseWrapper(localName = "GetCustPartNoResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetCustPartNoResponse")
    public String getCustPartNo(
        @WebParam(name = "site", targetNamespace = "http://tempuri.org/")
        String site,
        @WebParam(name = "custNo", targetNamespace = "http://tempuri.org/")
        String custNo,
        @WebParam(name = "partNo", targetNamespace = "http://tempuri.org/")
        String partNo);

    /**
     * 
     * @param lockFlag
     * @param site
     * @param bbcList
     * @param account
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "LockBBC", action = "http://tempuri.org/LockBBC")
    @WebResult(name = "LockBBCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LockBBC", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.LockBBC")
    @ResponseWrapper(localName = "LockBBCResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.LockBBCResponse")
    public boolean lockBBC(
        @WebParam(name = "site", targetNamespace = "http://tempuri.org/")
        String site,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "bbcList", targetNamespace = "http://tempuri.org/")
        ArrayOfString bbcList,
        @WebParam(name = "lockFlag", targetNamespace = "http://tempuri.org/")
        int lockFlag);

    /**
     * 
     * @param boxBarCodeNo
     * @param account
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DisableBBC", action = "http://tempuri.org/DisableBBC")
    @WebResult(name = "DisableBBCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DisableBBC", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.DisableBBC")
    @ResponseWrapper(localName = "DisableBBCResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.DisableBBCResponse")
    public boolean disableBBC(
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "boxBarCodeNo", targetNamespace = "http://tempuri.org/")
        String boxBarCodeNo);

    /**
     * 
     * @param strSite
     * @param strLoc
     * @return
     *     returns com.uspring.sdsmesplus.barcode.soap.ArrayOfString
     */
    @WebMethod(operationName = "GetShelfList", action = "http://tempuri.org/GetShelfList")
    @WebResult(name = "GetShelfListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetShelfList", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetShelfList")
    @ResponseWrapper(localName = "GetShelfListResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.GetShelfListResponse")
    public ArrayOfString getShelfList(
        @WebParam(name = "strSite", targetNamespace = "http://tempuri.org/")
        String strSite,
        @WebParam(name = "strLoc", targetNamespace = "http://tempuri.org/")
        String strLoc);

    /**
     * 
     * @param strSite
     * @param strLoc
     * @param strShelf
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ShelfBoxNumber", action = "http://tempuri.org/ShelfBoxNumber")
    @WebResult(name = "ShelfBoxNumberResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ShelfBoxNumber", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.ShelfBoxNumber")
    @ResponseWrapper(localName = "ShelfBoxNumberResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.ShelfBoxNumberResponse")
    public int shelfBoxNumber(
        @WebParam(name = "strSite", targetNamespace = "http://tempuri.org/")
        String strSite,
        @WebParam(name = "strLoc", targetNamespace = "http://tempuri.org/")
        String strLoc,
        @WebParam(name = "strShelf", targetNamespace = "http://tempuri.org/")
        String strShelf);

    /**
     * 
     * @param site
     * @param bbc
     * @param account
     * @return
     *     returns com.uspring.sdsmesplus.barcode.soap.CBBC
     */
    @WebMethod(operationName = "CreateBoxBarCode", action = "http://tempuri.org/CreateBoxBarCode")
    @WebResult(name = "CreateBoxBarCodeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateBoxBarCode", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CreateBoxBarCode")
    @ResponseWrapper(localName = "CreateBoxBarCodeResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CreateBoxBarCodeResponse")
    public CBBC createBoxBarCode(
        @WebParam(name = "site", targetNamespace = "http://tempuri.org/")
        String site,
        @WebParam(name = "account", targetNamespace = "http://tempuri.org/")
        String account,
        @WebParam(name = "bbc", targetNamespace = "http://tempuri.org/")
        CBBC bbc);

    /**
     * 
     * @param requireNo
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CancelMaterialRequire", action = "http://tempuri.org/CancelMaterialRequire")
    @WebResult(name = "CancelMaterialRequireResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelMaterialRequire", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CancelMaterialRequire")
    @ResponseWrapper(localName = "CancelMaterialRequireResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CancelMaterialRequireResponse")
    public boolean cancelMaterialRequire(
        @WebParam(name = "requireNo", targetNamespace = "http://tempuri.org/")
        String requireNo);

    /**
     * 
     * @param material
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MaterialRequire", action = "http://tempuri.org/MaterialRequire")
    @WebResult(name = "MaterialRequireResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MaterialRequire", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.MaterialRequire")
    @ResponseWrapper(localName = "MaterialRequireResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.MaterialRequireResponse")
    public String materialRequire(
        @WebParam(name = "material", targetNamespace = "http://tempuri.org/")
        MaterialRequireDetail material);

    /**
     * 
     * @param materials
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MaterialBatchRequire", action = "http://tempuri.org/MaterialBatchRequire")
    @WebResult(name = "MaterialBatchRequireResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MaterialBatchRequire", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.MaterialBatchRequire")
    @ResponseWrapper(localName = "MaterialBatchRequireResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.MaterialBatchRequireResponse")
    public String materialBatchRequire(
        @WebParam(name = "materials", targetNamespace = "http://tempuri.org/")
        ArrayOfMaterialRequireDetail materials);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FinishedProductCall", action = "http://tempuri.org/FinishedProductCall")
    @WebResult(name = "FinishedProductCallResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FinishedProductCall", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.FinishedProductCall")
    @ResponseWrapper(localName = "FinishedProductCallResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.FinishedProductCallResponse")
    public String finishedProductCall(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        FinishedProductRequest request);

    /**
     * 
     * @param boxBarCode
     * @return
     *     returns com.uspring.sdsmesplus.barcode.soap.FinishedProductBoxBarCode
     */
    @WebMethod(operationName = "FinishedProductSubmit", action = "http://tempuri.org/FinishedProductSubmit")
    @WebResult(name = "FinishedProductSubmitResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FinishedProductSubmit", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.FinishedProductSubmit")
    @ResponseWrapper(localName = "FinishedProductSubmitResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.FinishedProductSubmitResponse")
    public FinishedProductBoxBarCode finishedProductSubmit(
        @WebParam(name = "BoxBarCode", targetNamespace = "http://tempuri.org/")
        FinishedProductBoxBarCode boxBarCode);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CleanLineCall", action = "http://tempuri.org/CleanLineCall")
    @WebResult(name = "CleanLineCallResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CleanLineCall", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CleanLineCall")
    @ResponseWrapper(localName = "CleanLineCallResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CleanLineCallResponse")
    public String cleanLineCall(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        CleanLineRequest request);

    /**
     * 
     * @param oldBBCList
     * @return
     *     returns com.uspring.sdsmesplus.barcode.soap.ArrayOfCleanLineNewBoxBarCode
     */
    @WebMethod(operationName = "CleanLineReport", action = "http://tempuri.org/CleanLineReport")
    @WebResult(name = "CleanLineReportResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CleanLineReport", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CleanLineReport")
    @ResponseWrapper(localName = "CleanLineReportResponse", targetNamespace = "http://tempuri.org/", className = "com.uspring.sdsmesplus.barcode.soap.CleanLineReportResponse")
    public ArrayOfCleanLineNewBoxBarCode cleanLineReport(
        @WebParam(name = "oldBBCList", targetNamespace = "http://tempuri.org/")
        ArrayOfCleanLineOldBoxBarCode oldBBCList);

}
