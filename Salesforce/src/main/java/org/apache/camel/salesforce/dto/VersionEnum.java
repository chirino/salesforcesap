/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Version
 */
public enum VersionEnum {

    // SAML1_1
    SAML1_1("SAML1_1"),
    // SAML2_0
    SAML2_0("SAML2_0");

    final String value;

    private VersionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static VersionEnum fromValue(String value) {
        for (VersionEnum e : VersionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
