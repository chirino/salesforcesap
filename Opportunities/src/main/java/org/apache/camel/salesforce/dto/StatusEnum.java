/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum StatusEnum {

    // Behind
    BEHIND("Behind"),
    // Canceled
    CANCELED("Canceled"),
    // Completed
    COMPLETED("Completed"),
    // Critical
    CRITICAL("Critical"),
    // NotCompleted
    NOTCOMPLETED("NotCompleted"),
    // NotStarted
    NOTSTARTED("NotStarted"),
    // OnTrack
    ONTRACK("OnTrack"),
    // Postponed
    POSTPONED("Postponed");

    final String value;

    private StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum e : StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}