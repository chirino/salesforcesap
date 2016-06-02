/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UserVisibility
 */
public enum UserVisibilityEnum {

    // Creator
    CREATOR("Creator"),
    // CustomExcludedUser
    CUSTOMEXCLUDEDUSER("CustomExcludedUser"),
    // CustomUser
    CUSTOMUSER("CustomUser"),
    // Everyone
    EVERYONE("Everyone"),
    // EveryoneButCreator
    EVERYONEBUTCREATOR("EveryoneButCreator"),
    // Manager
    MANAGER("Manager");

    final String value;

    private UserVisibilityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserVisibilityEnum fromValue(String value) {
        for (UserVisibilityEnum e : UserVisibilityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}