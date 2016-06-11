/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Rating
 */
public enum RatingEnum {

    // Cold
    COLD("Cold"),
    // Hot
    HOT("Hot"),
    // Warm
    WARM("Warm");

    final String value;

    private RatingEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RatingEnum fromValue(String value) {
        for (RatingEnum e : RatingEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
