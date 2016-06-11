/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DigestFrequency
 */
public enum DigestFrequencyEnum {

    // D
    D("D"),
    // N
    N("N"),
    // W
    W("W");

    final String value;

    private DigestFrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DigestFrequencyEnum fromValue(String value) {
        for (DigestFrequencyEnum e : DigestFrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}