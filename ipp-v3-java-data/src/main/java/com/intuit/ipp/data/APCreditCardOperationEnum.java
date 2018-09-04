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
 * <p>Java class for APCreditCardOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APCreditCardOperationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Charge"/>
 *     &lt;enumeration value="Credit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APCreditCardOperationEnum")
@XmlEnum
public enum APCreditCardOperationEnum {

    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    APCreditCardOperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APCreditCardOperationEnum fromValue(String v) {
        for (APCreditCardOperationEnum c: APCreditCardOperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
