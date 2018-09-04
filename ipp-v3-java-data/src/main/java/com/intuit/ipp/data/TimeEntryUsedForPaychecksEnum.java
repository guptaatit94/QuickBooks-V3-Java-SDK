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
 * <p>Java class for TimeEntryUsedForPaychecksEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeEntryUsedForPaychecksEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="DoNotUseTimeEntry"/>
 *     &lt;enumeration value="UseTimeEntry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeEntryUsedForPaychecksEnum")
@XmlEnum
public enum TimeEntryUsedForPaychecksEnum {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("DoNotUseTimeEntry")
    DO_NOT_USE_TIME_ENTRY("DoNotUseTimeEntry"),
    @XmlEnumValue("UseTimeEntry")
    USE_TIME_ENTRY("UseTimeEntry");
    private final String value;

    TimeEntryUsedForPaychecksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeEntryUsedForPaychecksEnum fromValue(String v) {
        for (TimeEntryUsedForPaychecksEnum c: TimeEntryUsedForPaychecksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
