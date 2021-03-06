/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject DatacloudSocialHandle
 */
@XStreamAlias("DatacloudSocialHandle")
public class DatacloudSocialHandle extends AbstractSObjectBase {

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // DatacloudContactId
    private String DatacloudContactId;

    @JsonProperty("DatacloudContactId")
    public String getDatacloudContactId() {
        return this.DatacloudContactId;
    }

    @JsonProperty("DatacloudContactId")
    public void setDatacloudContactId(String DatacloudContactId) {
        this.DatacloudContactId = DatacloudContactId;
    }

    // SocialId
    private String SocialId;

    @JsonProperty("SocialId")
    public String getSocialId() {
        return this.SocialId;
    }

    @JsonProperty("SocialId")
    public void setSocialId(String SocialId) {
        this.SocialId = SocialId;
    }

    // ProviderName
    private String ProviderName;

    @JsonProperty("ProviderName")
    public String getProviderName() {
        return this.ProviderName;
    }

    @JsonProperty("ProviderName")
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    // Url
    private String Url;

    @JsonProperty("Url")
    public String getUrl() {
        return this.Url;
    }

    @JsonProperty("Url")
    public void setUrl(String Url) {
        this.Url = Url;
    }

}
