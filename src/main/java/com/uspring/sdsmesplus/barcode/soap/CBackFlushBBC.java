
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CBackFlushBBC complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CBackFlushBBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutingBomList" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="RoutingOPList" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="bbc_BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_UploadFileGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_BoxBarCodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Part" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_DrawingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_PartName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_CurrentNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bbc_Cur_Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Cur_Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Cur_Shelf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_ProduceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_FurnaceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_IsSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bbc_PairPartNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_PairBoxBarCodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_TrayBarCodeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_ScanTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bbc_ScanUserID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bbc_ScanIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Routing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_Op" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_BomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_LineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bbc_LineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bbc_SyncStatus" type="{http://tempuri.org/}PDABBCSyncStatusEnum"/>
 *         &lt;element name="bbc_CheckSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bbc_ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBackFlushBBC", propOrder = {
    "routingBomList",
    "routingOPList",
    "bbcBillType",
    "bbcUploadFileGUID",
    "bbcBoxBarCodeNo",
    "bbcPart",
    "bbcGrade",
    "bbcDrawingNo",
    "bbcPartName",
    "bbcCurrentNumber",
    "bbcCurLoc",
    "bbcCurSite",
    "bbcCurShelf",
    "bbcProduceNo",
    "bbcFurnaceNo",
    "bbcCustomer",
    "bbcIsSet",
    "bbcPairPartNo",
    "bbcPairBoxBarCodeNo",
    "bbcTrayBarCodeNo",
    "bbcScanTime",
    "bbcScanUserID",
    "bbcScanIP",
    "bbcRouting",
    "bbcOp",
    "bbcBomCode",
    "bbcLineCode",
    "bbcLineId",
    "bbcSyncStatus",
    "bbcCheckSuccess",
    "bbcErrorMsg"
})
public class CBackFlushBBC {

    @XmlElement(name = "RoutingBomList")
    protected ArrayOfString routingBomList;
    @XmlElement(name = "RoutingOPList")
    protected ArrayOfString routingOPList;
    @XmlElement(name = "bbc_BillType")
    protected String bbcBillType;
    @XmlElement(name = "bbc_UploadFileGUID")
    protected String bbcUploadFileGUID;
    @XmlElement(name = "bbc_BoxBarCodeNo")
    protected String bbcBoxBarCodeNo;
    @XmlElement(name = "bbc_Part")
    protected String bbcPart;
    @XmlElement(name = "bbc_Grade")
    protected String bbcGrade;
    @XmlElement(name = "bbc_DrawingNo")
    protected String bbcDrawingNo;
    @XmlElement(name = "bbc_PartName")
    protected String bbcPartName;
    @XmlElement(name = "bbc_CurrentNumber")
    protected int bbcCurrentNumber;
    @XmlElement(name = "bbc_Cur_Loc")
    protected String bbcCurLoc;
    @XmlElement(name = "bbc_Cur_Site")
    protected String bbcCurSite;
    @XmlElement(name = "bbc_Cur_Shelf")
    protected String bbcCurShelf;
    @XmlElement(name = "bbc_ProduceNo")
    protected String bbcProduceNo;
    @XmlElement(name = "bbc_FurnaceNo")
    protected String bbcFurnaceNo;
    @XmlElement(name = "bbc_Customer")
    protected String bbcCustomer;
    @XmlElement(name = "bbc_IsSet")
    protected boolean bbcIsSet;
    @XmlElement(name = "bbc_PairPartNo")
    protected String bbcPairPartNo;
    @XmlElement(name = "bbc_PairBoxBarCodeNo")
    protected String bbcPairBoxBarCodeNo;
    @XmlElement(name = "bbc_TrayBarCodeNo")
    protected String bbcTrayBarCodeNo;
    @XmlElement(name = "bbc_ScanTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bbcScanTime;
    @XmlElement(name = "bbc_ScanUserID")
    protected int bbcScanUserID;
    @XmlElement(name = "bbc_ScanIP")
    protected String bbcScanIP;
    @XmlElement(name = "bbc_Routing")
    protected String bbcRouting;
    @XmlElement(name = "bbc_Op")
    protected String bbcOp;
    @XmlElement(name = "bbc_BomCode")
    protected String bbcBomCode;
    @XmlElement(name = "bbc_LineCode")
    protected String bbcLineCode;
    @XmlElement(name = "bbc_LineId")
    protected int bbcLineId;
    @XmlElement(name = "bbc_SyncStatus", required = true)
    @XmlSchemaType(name = "string")
    protected PDABBCSyncStatusEnum bbcSyncStatus;
    @XmlElement(name = "bbc_CheckSuccess")
    protected boolean bbcCheckSuccess;
    @XmlElement(name = "bbc_ErrorMsg")
    protected String bbcErrorMsg;

    /**
     * 获取routingBomList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRoutingBomList() {
        return routingBomList;
    }

    /**
     * 设置routingBomList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRoutingBomList(ArrayOfString value) {
        this.routingBomList = value;
    }

    /**
     * 获取routingOPList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRoutingOPList() {
        return routingOPList;
    }

    /**
     * 设置routingOPList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRoutingOPList(ArrayOfString value) {
        this.routingOPList = value;
    }

    /**
     * 获取bbcBillType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcBillType() {
        return bbcBillType;
    }

    /**
     * 设置bbcBillType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcBillType(String value) {
        this.bbcBillType = value;
    }

    /**
     * 获取bbcUploadFileGUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcUploadFileGUID() {
        return bbcUploadFileGUID;
    }

    /**
     * 设置bbcUploadFileGUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcUploadFileGUID(String value) {
        this.bbcUploadFileGUID = value;
    }

    /**
     * 获取bbcBoxBarCodeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcBoxBarCodeNo() {
        return bbcBoxBarCodeNo;
    }

    /**
     * 设置bbcBoxBarCodeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcBoxBarCodeNo(String value) {
        this.bbcBoxBarCodeNo = value;
    }

    /**
     * 获取bbcPart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcPart() {
        return bbcPart;
    }

    /**
     * 设置bbcPart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcPart(String value) {
        this.bbcPart = value;
    }

    /**
     * 获取bbcGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcGrade() {
        return bbcGrade;
    }

    /**
     * 设置bbcGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcGrade(String value) {
        this.bbcGrade = value;
    }

    /**
     * 获取bbcDrawingNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcDrawingNo() {
        return bbcDrawingNo;
    }

    /**
     * 设置bbcDrawingNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcDrawingNo(String value) {
        this.bbcDrawingNo = value;
    }

    /**
     * 获取bbcPartName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcPartName() {
        return bbcPartName;
    }

    /**
     * 设置bbcPartName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcPartName(String value) {
        this.bbcPartName = value;
    }

    /**
     * 获取bbcCurrentNumber属性的值。
     * 
     */
    public int getBbcCurrentNumber() {
        return bbcCurrentNumber;
    }

    /**
     * 设置bbcCurrentNumber属性的值。
     * 
     */
    public void setBbcCurrentNumber(int value) {
        this.bbcCurrentNumber = value;
    }

    /**
     * 获取bbcCurLoc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcCurLoc() {
        return bbcCurLoc;
    }

    /**
     * 设置bbcCurLoc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcCurLoc(String value) {
        this.bbcCurLoc = value;
    }

    /**
     * 获取bbcCurSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcCurSite() {
        return bbcCurSite;
    }

    /**
     * 设置bbcCurSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcCurSite(String value) {
        this.bbcCurSite = value;
    }

    /**
     * 获取bbcCurShelf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcCurShelf() {
        return bbcCurShelf;
    }

    /**
     * 设置bbcCurShelf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcCurShelf(String value) {
        this.bbcCurShelf = value;
    }

    /**
     * 获取bbcProduceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcProduceNo() {
        return bbcProduceNo;
    }

    /**
     * 设置bbcProduceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcProduceNo(String value) {
        this.bbcProduceNo = value;
    }

    /**
     * 获取bbcFurnaceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcFurnaceNo() {
        return bbcFurnaceNo;
    }

    /**
     * 设置bbcFurnaceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcFurnaceNo(String value) {
        this.bbcFurnaceNo = value;
    }

    /**
     * 获取bbcCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcCustomer() {
        return bbcCustomer;
    }

    /**
     * 设置bbcCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcCustomer(String value) {
        this.bbcCustomer = value;
    }

    /**
     * 获取bbcIsSet属性的值。
     * 
     */
    public boolean isBbcIsSet() {
        return bbcIsSet;
    }

    /**
     * 设置bbcIsSet属性的值。
     * 
     */
    public void setBbcIsSet(boolean value) {
        this.bbcIsSet = value;
    }

    /**
     * 获取bbcPairPartNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcPairPartNo() {
        return bbcPairPartNo;
    }

    /**
     * 设置bbcPairPartNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcPairPartNo(String value) {
        this.bbcPairPartNo = value;
    }

    /**
     * 获取bbcPairBoxBarCodeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcPairBoxBarCodeNo() {
        return bbcPairBoxBarCodeNo;
    }

    /**
     * 设置bbcPairBoxBarCodeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcPairBoxBarCodeNo(String value) {
        this.bbcPairBoxBarCodeNo = value;
    }

    /**
     * 获取bbcTrayBarCodeNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcTrayBarCodeNo() {
        return bbcTrayBarCodeNo;
    }

    /**
     * 设置bbcTrayBarCodeNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcTrayBarCodeNo(String value) {
        this.bbcTrayBarCodeNo = value;
    }

    /**
     * 获取bbcScanTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBbcScanTime() {
        return bbcScanTime;
    }

    /**
     * 设置bbcScanTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBbcScanTime(XMLGregorianCalendar value) {
        this.bbcScanTime = value;
    }

    /**
     * 获取bbcScanUserID属性的值。
     * 
     */
    public int getBbcScanUserID() {
        return bbcScanUserID;
    }

    /**
     * 设置bbcScanUserID属性的值。
     * 
     */
    public void setBbcScanUserID(int value) {
        this.bbcScanUserID = value;
    }

    /**
     * 获取bbcScanIP属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcScanIP() {
        return bbcScanIP;
    }

    /**
     * 设置bbcScanIP属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcScanIP(String value) {
        this.bbcScanIP = value;
    }

    /**
     * 获取bbcRouting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcRouting() {
        return bbcRouting;
    }

    /**
     * 设置bbcRouting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcRouting(String value) {
        this.bbcRouting = value;
    }

    /**
     * 获取bbcOp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcOp() {
        return bbcOp;
    }

    /**
     * 设置bbcOp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcOp(String value) {
        this.bbcOp = value;
    }

    /**
     * 获取bbcBomCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcBomCode() {
        return bbcBomCode;
    }

    /**
     * 设置bbcBomCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcBomCode(String value) {
        this.bbcBomCode = value;
    }

    /**
     * 获取bbcLineCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcLineCode() {
        return bbcLineCode;
    }

    /**
     * 设置bbcLineCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcLineCode(String value) {
        this.bbcLineCode = value;
    }

    /**
     * 获取bbcLineId属性的值。
     * 
     */
    public int getBbcLineId() {
        return bbcLineId;
    }

    /**
     * 设置bbcLineId属性的值。
     * 
     */
    public void setBbcLineId(int value) {
        this.bbcLineId = value;
    }

    /**
     * 获取bbcSyncStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PDABBCSyncStatusEnum }
     *     
     */
    public PDABBCSyncStatusEnum getBbcSyncStatus() {
        return bbcSyncStatus;
    }

    /**
     * 设置bbcSyncStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PDABBCSyncStatusEnum }
     *     
     */
    public void setBbcSyncStatus(PDABBCSyncStatusEnum value) {
        this.bbcSyncStatus = value;
    }

    /**
     * 获取bbcCheckSuccess属性的值。
     * 
     */
    public boolean isBbcCheckSuccess() {
        return bbcCheckSuccess;
    }

    /**
     * 设置bbcCheckSuccess属性的值。
     * 
     */
    public void setBbcCheckSuccess(boolean value) {
        this.bbcCheckSuccess = value;
    }

    /**
     * 获取bbcErrorMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbcErrorMsg() {
        return bbcErrorMsg;
    }

    /**
     * 设置bbcErrorMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbcErrorMsg(String value) {
        this.bbcErrorMsg = value;
    }

}
