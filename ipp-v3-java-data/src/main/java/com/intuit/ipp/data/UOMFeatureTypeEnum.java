//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.03 at 12:04:22 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UOMFeatureTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UOMFeatureTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="SinglePerItem"/>
 *     &lt;enumeration value="MultiplePerItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UOMFeatureTypeEnum")
@XmlEnum
public enum UOMFeatureTypeEnum {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("SinglePerItem")
    SINGLE_PER_ITEM("SinglePerItem"),
    @XmlEnumValue("MultiplePerItem")
    MULTIPLE_PER_ITEM("MultiplePerItem");
    private final String value;

    UOMFeatureTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UOMFeatureTypeEnum fromValue(String v) {
        for (UOMFeatureTypeEnum c: UOMFeatureTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
