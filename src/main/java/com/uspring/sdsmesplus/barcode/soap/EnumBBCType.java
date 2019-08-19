
package com.uspring.sdsmesplus.barcode.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>enumBBCType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="enumBBCType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="WW"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="ZC"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="PBN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "enumBBCType")
@XmlEnum
public enum EnumBBCType {

    CG,
    SK,
    PF,
    CK,
    TK,
    WW,
    MT,
    ZC,
    HK,
    PBN;

    public String value() {
        return name();
    }

    public static EnumBBCType fromValue(String v) {
        return valueOf(v);
    }



}
