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
 * Salesforce DTO for SObject MacroHistory
 */
@XStreamAlias("MacroHistory")
public class MacroHistory extends AbstractSObjectBase {

    // MacroId
    private String MacroId;

    @JsonProperty("MacroId")
    public String getMacroId() {
        return this.MacroId;
    }

    @JsonProperty("MacroId")
    public void setMacroId(String MacroId) {
        this.MacroId = MacroId;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private FieldEnum Field;

    @JsonProperty("Field")
    public FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(FieldEnum Field) {
        this.Field = Field;
    }

    // OldValue
    private String OldValue;

    @JsonProperty("OldValue")
    public String getOldValue() {
        return this.OldValue;
    }

    @JsonProperty("OldValue")
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    // NewValue
    private String NewValue;

    @JsonProperty("NewValue")
    public String getNewValue() {
        return this.NewValue;
    }

    @JsonProperty("NewValue")
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

}
