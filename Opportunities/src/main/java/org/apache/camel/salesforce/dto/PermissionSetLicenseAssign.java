/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject PermissionSetLicenseAssign
 */
@XStreamAlias("PermissionSetLicenseAssign")
public class PermissionSetLicenseAssign extends AbstractSObjectBase {

    // PermissionSetLicenseId
    private String PermissionSetLicenseId;

    @JsonProperty("PermissionSetLicenseId")
    public String getPermissionSetLicenseId() {
        return this.PermissionSetLicenseId;
    }

    @JsonProperty("PermissionSetLicenseId")
    public void setPermissionSetLicenseId(String PermissionSetLicenseId) {
        this.PermissionSetLicenseId = PermissionSetLicenseId;
    }

    // AssigneeId
    private String AssigneeId;

    @JsonProperty("AssigneeId")
    public String getAssigneeId() {
        return this.AssigneeId;
    }

    @JsonProperty("AssigneeId")
    public void setAssigneeId(String AssigneeId) {
        this.AssigneeId = AssigneeId;
    }

}
