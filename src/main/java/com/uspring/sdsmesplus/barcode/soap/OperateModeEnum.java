
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OperateModeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OperateModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GenerateTransfer"/>
 *     &lt;enumeration value="ListTransfer"/>
 *     &lt;enumeration value="SendTransfer"/>
 *     &lt;enumeration value="ReceiveTransfer"/>
 *     &lt;enumeration value="WWOutTransfer"/>
 *     &lt;enumeration value="WWInnerTransfer"/>
 *     &lt;enumeration value="DefeatTransfer"/>
 *     &lt;enumeration value="BBCScanShelf"/>
 *     &lt;enumeration value="BackFlush"/>
 *     &lt;enumeration value="NegativeBackFlush"/>
 *     &lt;enumeration value="Stocktake"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperateModeEnum")
@XmlEnum
public enum OperateModeEnum {

    @XmlEnumValue("GenerateTransfer")
    GENERATE_TRANSFER("GenerateTransfer"),
    @XmlEnumValue("ListTransfer")
    LIST_TRANSFER("ListTransfer"),
    @XmlEnumValue("SendTransfer")
    SEND_TRANSFER("SendTransfer"),
    @XmlEnumValue("ReceiveTransfer")
    RECEIVE_TRANSFER("ReceiveTransfer"),
    @XmlEnumValue("WWOutTransfer")
    WW_OUT_TRANSFER("WWOutTransfer"),
    @XmlEnumValue("WWInnerTransfer")
    WW_INNER_TRANSFER("WWInnerTransfer"),
    @XmlEnumValue("DefeatTransfer")
    DEFEAT_TRANSFER("DefeatTransfer"),
    @XmlEnumValue("BBCScanShelf")
    BBC_SCAN_SHELF("BBCScanShelf"),
    @XmlEnumValue("BackFlush")
    BACK_FLUSH("BackFlush"),
    @XmlEnumValue("NegativeBackFlush")
    NEGATIVE_BACK_FLUSH("NegativeBackFlush"),
    @XmlEnumValue("Stocktake")
    STOCKTAKE("Stocktake");
    private final String value;

    OperateModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperateModeEnum fromValue(String v) {
        for (OperateModeEnum c: OperateModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
