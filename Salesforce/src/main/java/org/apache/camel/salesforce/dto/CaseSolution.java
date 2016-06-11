/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri May 27 17:39:27 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CaseSolution
 */
@XStreamAlias("CaseSolution")
public class CaseSolution extends AbstractSObjectBase {

    // CaseId
    private String CaseId;

    @JsonProperty("CaseId")
    public String getCaseId() {
        return this.CaseId;
    }

    @JsonProperty("CaseId")
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    // SolutionId
    private String SolutionId;

    @JsonProperty("SolutionId")
    public String getSolutionId() {
        return this.SolutionId;
    }

    @JsonProperty("SolutionId")
    public void setSolutionId(String SolutionId) {
        this.SolutionId = SolutionId;
    }

}