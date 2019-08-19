
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PDABBCSyncStatusEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PDABBCSyncStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CheckError"/>
 *     &lt;enumeration value="NotUpload"/>
 *     &lt;enumeration value="ImmediatelyDiscard"/>
 *     &lt;enumeration value="IncorrectOperation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PDABBCSyncStatusEnum")
@XmlEnum
public enum PDABBCSyncStatusEnum {

    @XmlEnumValue("CheckError")
    CHECK_ERROR("CheckError"),
    @XmlEnumValue("NotUpload")
    NOT_UPLOAD("NotUpload"),
    @XmlEnumValue("ImmediatelyDiscard")
    IMMEDIATELY_DISCARD("ImmediatelyDiscard"),
    @XmlEnumValue("IncorrectOperation")
    INCORRECT_OPERATION("IncorrectOperation");
    private final String value;

    PDABBCSyncStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PDABBCSyncStatusEnum fromValue(String v) {
        for (PDABBCSyncStatusEnum c: PDABBCSyncStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
