/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject UserLogin
 */
@XStreamAlias("UserLogin")
public class UserLogin extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // IsFrozen
    private Boolean IsFrozen;

    @JsonProperty("IsFrozen")
    public Boolean getIsFrozen() {
        return this.IsFrozen;
    }

    @JsonProperty("IsFrozen")
    public void setIsFrozen(Boolean IsFrozen) {
        this.IsFrozen = IsFrozen;
    }

    // IsPasswordLocked
    private Boolean IsPasswordLocked;

    @JsonProperty("IsPasswordLocked")
    public Boolean getIsPasswordLocked() {
        return this.IsPasswordLocked;
    }

    @JsonProperty("IsPasswordLocked")
    public void setIsPasswordLocked(Boolean IsPasswordLocked) {
        this.IsPasswordLocked = IsPasswordLocked;
    }

}
