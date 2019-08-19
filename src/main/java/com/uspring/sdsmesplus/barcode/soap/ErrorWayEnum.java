
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ErrorWayEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorWayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleErrorWay"/>
 *     &lt;enumeration value="GroupErrorWay"/>
 *     &lt;enumeration value="AllErrorWay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorWayEnum")
@XmlEnum
public enum ErrorWayEnum {

    @XmlEnumValue("SingleErrorWay")
    SINGLE_ERROR_WAY("SingleErrorWay"),
    @XmlEnumValue("GroupErrorWay")
    GROUP_ERROR_WAY("GroupErrorWay"),
    @XmlEnumValue("AllErrorWay")
    ALL_ERROR_WAY("AllErrorWay");
    private final String value;

    ErrorWayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorWayEnum fromValue(String v) {
        for (ErrorWayEnum c: ErrorWayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
