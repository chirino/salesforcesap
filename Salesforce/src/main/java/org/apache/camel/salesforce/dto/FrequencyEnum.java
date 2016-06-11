/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Frequency
 */
public enum FrequencyEnum {

    // Fortnightly
    FORTNIGHTLY("Fortnightly"),
    // Monthly
    MONTHLY("Monthly"),
    // Once
    ONCE("Once"),
    // Quarterly
    QUARTERLY("Quarterly"),
    // Weekly
    WEEKLY("Weekly"),
    // Yearly
    YEARLY("Yearly");

    final String value;

    private FrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
        for (FrequencyEnum e : FrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
