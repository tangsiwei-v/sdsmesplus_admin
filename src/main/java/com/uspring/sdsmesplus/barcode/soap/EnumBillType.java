
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>enumBillType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="enumBillType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DeliveryForm"/>
 *     &lt;enumeration value="ReceiveBill"/>
 *     &lt;enumeration value="GenBBCBill"/>
 *     &lt;enumeration value="TransferNo"/>
 *     &lt;enumeration value="PackAndUnpack"/>
 *     &lt;enumeration value="WWTransfer"/>
 *     &lt;enumeration value="BackFlush"/>
 *     &lt;enumeration value="TrayPackage"/>
 *     &lt;enumeration value="TrayUnPackage"/>
 *     &lt;enumeration value="TrayModify"/>
 *     &lt;enumeration value="TrayTransfer"/>
 *     &lt;enumeration value="AssemblyPLD"/>
 *     &lt;enumeration value="FEE_PICK_BILL"/>
 *     &lt;enumeration value="FEE_BACK_BILL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumBillType")
@XmlEnum
public enum EnumBillType {

    @XmlEnumValue("DeliveryForm")
    DELIVERY_FORM("DeliveryForm"),
    @XmlEnumValue("ReceiveBill")
    RECEIVE_BILL("ReceiveBill"),
    @XmlEnumValue("GenBBCBill")
    GEN_BBC_BILL("GenBBCBill"),
    @XmlEnumValue("TransferNo")
    TRANSFER_NO("TransferNo"),
    @XmlEnumValue("PackAndUnpack")
    PACK_AND_UNPACK("PackAndUnpack"),
    @XmlEnumValue("WWTransfer")
    WW_TRANSFER("WWTransfer"),
    @XmlEnumValue("BackFlush")
    BACK_FLUSH("BackFlush"),
    @XmlEnumValue("TrayPackage")
    TRAY_PACKAGE("TrayPackage"),
    @XmlEnumValue("TrayUnPackage")
    TRAY_UN_PACKAGE("TrayUnPackage"),
    @XmlEnumValue("TrayModify")
    TRAY_MODIFY("TrayModify"),
    @XmlEnumValue("TrayTransfer")
    TRAY_TRANSFER("TrayTransfer"),
    @XmlEnumValue("AssemblyPLD")
    ASSEMBLY_PLD("AssemblyPLD"),
    FEE_PICK_BILL("FEE_PICK_BILL"),
    FEE_BACK_BILL("FEE_BACK_BILL");
    private final String value;

    EnumBillType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumBillType fromValue(String v) {
        for (EnumBillType c: EnumBillType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
