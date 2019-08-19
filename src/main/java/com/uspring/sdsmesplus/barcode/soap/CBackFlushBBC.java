
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CBackFlushBBC complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡroutingBomList���Ե�ֵ��
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
     * ����routingBomList���Ե�ֵ��
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
     * ��ȡroutingOPList���Ե�ֵ��
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
     * ����routingOPList���Ե�ֵ��
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
     * ��ȡbbcBillType���Ե�ֵ��
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
     * ����bbcBillType���Ե�ֵ��
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
     * ��ȡbbcUploadFileGUID���Ե�ֵ��
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
     * ����bbcUploadFileGUID���Ե�ֵ��
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
     * ��ȡbbcBoxBarCodeNo���Ե�ֵ��
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
     * ����bbcBoxBarCodeNo���Ե�ֵ��
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
     * ��ȡbbcPart���Ե�ֵ��
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
     * ����bbcPart���Ե�ֵ��
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
     * ��ȡbbcGrade���Ե�ֵ��
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
     * ����bbcGrade���Ե�ֵ��
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
     * ��ȡbbcDrawingNo���Ե�ֵ��
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
     * ����bbcDrawingNo���Ե�ֵ��
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
     * ��ȡbbcPartName���Ե�ֵ��
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
     * ����bbcPartName���Ե�ֵ��
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
     * ��ȡbbcCurrentNumber���Ե�ֵ��
     * 
     */
    public int getBbcCurrentNumber() {
        return bbcCurrentNumber;
    }

    /**
     * ����bbcCurrentNumber���Ե�ֵ��
     * 
     */
    public void setBbcCurrentNumber(int value) {
        this.bbcCurrentNumber = value;
    }

    /**
     * ��ȡbbcCurLoc���Ե�ֵ��
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
     * ����bbcCurLoc���Ե�ֵ��
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
     * ��ȡbbcCurSite���Ե�ֵ��
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
     * ����bbcCurSite���Ե�ֵ��
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
     * ��ȡbbcCurShelf���Ե�ֵ��
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
     * ����bbcCurShelf���Ե�ֵ��
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
     * ��ȡbbcProduceNo���Ե�ֵ��
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
     * ����bbcProduceNo���Ե�ֵ��
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
     * ��ȡbbcFurnaceNo���Ե�ֵ��
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
     * ����bbcFurnaceNo���Ե�ֵ��
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
     * ��ȡbbcCustomer���Ե�ֵ��
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
     * ����bbcCustomer���Ե�ֵ��
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
     * ��ȡbbcIsSet���Ե�ֵ��
     * 
     */
    public boolean isBbcIsSet() {
        return bbcIsSet;
    }

    /**
     * ����bbcIsSet���Ե�ֵ��
     * 
     */
    public void setBbcIsSet(boolean value) {
        this.bbcIsSet = value;
    }

    /**
     * ��ȡbbcPairPartNo���Ե�ֵ��
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
     * ����bbcPairPartNo���Ե�ֵ��
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
     * ��ȡbbcPairBoxBarCodeNo���Ե�ֵ��
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
     * ����bbcPairBoxBarCodeNo���Ե�ֵ��
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
     * ��ȡbbcTrayBarCodeNo���Ե�ֵ��
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
     * ����bbcTrayBarCodeNo���Ե�ֵ��
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
     * ��ȡbbcScanTime���Ե�ֵ��
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
     * ����bbcScanTime���Ե�ֵ��
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
     * ��ȡbbcScanUserID���Ե�ֵ��
     * 
     */
    public int getBbcScanUserID() {
        return bbcScanUserID;
    }

    /**
     * ����bbcScanUserID���Ե�ֵ��
     * 
     */
    public void setBbcScanUserID(int value) {
        this.bbcScanUserID = value;
    }

    /**
     * ��ȡbbcScanIP���Ե�ֵ��
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
     * ����bbcScanIP���Ե�ֵ��
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
     * ��ȡbbcRouting���Ե�ֵ��
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
     * ����bbcRouting���Ե�ֵ��
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
     * ��ȡbbcOp���Ե�ֵ��
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
     * ����bbcOp���Ե�ֵ��
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
     * ��ȡbbcBomCode���Ե�ֵ��
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
     * ����bbcBomCode���Ե�ֵ��
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
     * ��ȡbbcLineCode���Ե�ֵ��
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
     * ����bbcLineCode���Ե�ֵ��
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
     * ��ȡbbcLineId���Ե�ֵ��
     * 
     */
    public int getBbcLineId() {
        return bbcLineId;
    }

    /**
     * ����bbcLineId���Ե�ֵ��
     * 
     */
    public void setBbcLineId(int value) {
        this.bbcLineId = value;
    }

    /**
     * ��ȡbbcSyncStatus���Ե�ֵ��
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
     * ����bbcSyncStatus���Ե�ֵ��
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
     * ��ȡbbcCheckSuccess���Ե�ֵ��
     * 
     */
    public boolean isBbcCheckSuccess() {
        return bbcCheckSuccess;
    }

    /**
     * ����bbcCheckSuccess���Ե�ֵ��
     * 
     */
    public void setBbcCheckSuccess(boolean value) {
        this.bbcCheckSuccess = value;
    }

    /**
     * ��ȡbbcErrorMsg���Ե�ֵ��
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
     * ����bbcErrorMsg���Ե�ֵ��
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
