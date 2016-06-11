/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject AssetShare
 */
@XStreamAlias("AssetShare")
public class AssetShare extends AbstractSObjectBase {

    // AssetId
    private String AssetId;

    @JsonProperty("AssetId")
    public String getAssetId() {
        return this.AssetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // AssetAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AssetAccessLevelEnum AssetAccessLevel;

    @JsonProperty("AssetAccessLevel")
    public AssetAccessLevelEnum getAssetAccessLevel() {
        return this.AssetAccessLevel;
    }

    @JsonProperty("AssetAccessLevel")
    public void setAssetAccessLevel(AssetAccessLevelEnum AssetAccessLevel) {
        this.AssetAccessLevel = AssetAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}
