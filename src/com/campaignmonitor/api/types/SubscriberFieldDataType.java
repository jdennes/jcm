
package com.campaignmonitor.api.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberFieldDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriberFieldDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="MultiSelectOne"/>
 *     &lt;enumeration value="MultiSelectMany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriberFieldDataType")
@XmlEnum
public enum SubscriberFieldDataType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("MultiSelectOne")
    MULTI_SELECT_ONE("MultiSelectOne"),
    @XmlEnumValue("MultiSelectMany")
    MULTI_SELECT_MANY("MultiSelectMany");
    private final String value;

    SubscriberFieldDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriberFieldDataType fromValue(String v) {
        for (SubscriberFieldDataType c: SubscriberFieldDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
