/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject WorkFeedbackRequest
 */
@XStreamAlias("WorkFeedbackRequest")
public class WorkFeedbackRequest extends AbstractSObjectBase {

    // SubjectId
    private String SubjectId;

    @JsonProperty("SubjectId")
    public String getSubjectId() {
        return this.SubjectId;
    }

    @JsonProperty("SubjectId")
    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    // RecipientId
    private String RecipientId;

    @JsonProperty("RecipientId")
    public String getRecipientId() {
        return this.RecipientId;
    }

    @JsonProperty("RecipientId")
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    // QuestionSetId
    private String QuestionSetId;

    @JsonProperty("QuestionSetId")
    public String getQuestionSetId() {
        return this.QuestionSetId;
    }

    @JsonProperty("QuestionSetId")
    public void setQuestionSetId(String QuestionSetId) {
        this.QuestionSetId = QuestionSetId;
    }

    // RelatedObjectId
    private String RelatedObjectId;

    @JsonProperty("RelatedObjectId")
    public String getRelatedObjectId() {
        return this.RelatedObjectId;
    }

    @JsonProperty("RelatedObjectId")
    public void setRelatedObjectId(String RelatedObjectId) {
        this.RelatedObjectId = RelatedObjectId;
    }

    // FeedbackType
    @XStreamConverter(PicklistEnumConverter.class)
    private FeedbackTypeEnum FeedbackType;

    @JsonProperty("FeedbackType")
    public FeedbackTypeEnum getFeedbackType() {
        return this.FeedbackType;
    }

    @JsonProperty("FeedbackType")
    public void setFeedbackType(FeedbackTypeEnum FeedbackType) {
        this.FeedbackType = FeedbackType;
    }

    // FeedbackRequestState
    @XStreamConverter(PicklistEnumConverter.class)
    private FeedbackRequestStateEnum FeedbackRequestState;

    @JsonProperty("FeedbackRequestState")
    public FeedbackRequestStateEnum getFeedbackRequestState() {
        return this.FeedbackRequestState;
    }

    @JsonProperty("FeedbackRequestState")
    public void setFeedbackRequestState(FeedbackRequestStateEnum FeedbackRequestState) {
        this.FeedbackRequestState = FeedbackRequestState;
    }

    // PerformanceCycleId
    private String PerformanceCycleId;

    @JsonProperty("PerformanceCycleId")
    public String getPerformanceCycleId() {
        return this.PerformanceCycleId;
    }

    @JsonProperty("PerformanceCycleId")
    public void setPerformanceCycleId(String PerformanceCycleId) {
        this.PerformanceCycleId = PerformanceCycleId;
    }

    // LastRemindDate
    private org.joda.time.DateTime LastRemindDate;

    @JsonProperty("LastRemindDate")
    public org.joda.time.DateTime getLastRemindDate() {
        return this.LastRemindDate;
    }

    @JsonProperty("LastRemindDate")
    public void setLastRemindDate(org.joda.time.DateTime LastRemindDate) {
        this.LastRemindDate = LastRemindDate;
    }

    // IsUnreadByOwner
    private Boolean IsUnreadByOwner;

    @JsonProperty("IsUnreadByOwner")
    public Boolean getIsUnreadByOwner() {
        return this.IsUnreadByOwner;
    }

    @JsonProperty("IsUnreadByOwner")
    public void setIsUnreadByOwner(Boolean IsUnreadByOwner) {
        this.IsUnreadByOwner = IsUnreadByOwner;
    }

    // SubmittedDate
    private org.joda.time.DateTime SubmittedDate;

    @JsonProperty("SubmittedDate")
    public org.joda.time.DateTime getSubmittedDate() {
        return this.SubmittedDate;
    }

    @JsonProperty("SubmittedDate")
    public void setSubmittedDate(org.joda.time.DateTime SubmittedDate) {
        this.SubmittedDate = SubmittedDate;
    }

    // LastSharedDate
    private org.joda.time.DateTime LastSharedDate;

    @JsonProperty("LastSharedDate")
    public org.joda.time.DateTime getLastSharedDate() {
        return this.LastSharedDate;
    }

    @JsonProperty("LastSharedDate")
    public void setLastSharedDate(org.joda.time.DateTime LastSharedDate) {
        this.LastSharedDate = LastSharedDate;
    }

    // SubmitFeedbackToId
    private String SubmitFeedbackToId;

    @JsonProperty("SubmitFeedbackToId")
    public String getSubmitFeedbackToId() {
        return this.SubmitFeedbackToId;
    }

    @JsonProperty("SubmitFeedbackToId")
    public void setSubmitFeedbackToId(String SubmitFeedbackToId) {
        this.SubmitFeedbackToId = SubmitFeedbackToId;
    }

    // IsShareWithSubject
    private Boolean IsShareWithSubject;

    @JsonProperty("IsShareWithSubject")
    public Boolean getIsShareWithSubject() {
        return this.IsShareWithSubject;
    }

    @JsonProperty("IsShareWithSubject")
    public void setIsShareWithSubject(Boolean IsShareWithSubject) {
        this.IsShareWithSubject = IsShareWithSubject;
    }

    // IsUnsolicited
    private Boolean IsUnsolicited;

    @JsonProperty("IsUnsolicited")
    public Boolean getIsUnsolicited() {
        return this.IsUnsolicited;
    }

    @JsonProperty("IsUnsolicited")
    public void setIsUnsolicited(Boolean IsUnsolicited) {
        this.IsUnsolicited = IsUnsolicited;
    }

    // SharingScope
    @XStreamConverter(PicklistEnumConverter.class)
    private SharingScopeEnum SharingScope;

    @JsonProperty("SharingScope")
    public SharingScopeEnum getSharingScope() {
        return this.SharingScope;
    }

    @JsonProperty("SharingScope")
    public void setSharingScope(SharingScopeEnum SharingScope) {
        this.SharingScope = SharingScope;
    }

    // TemplateId
    private String TemplateId;

    @JsonProperty("TemplateId")
    public String getTemplateId() {
        return this.TemplateId;
    }

    @JsonProperty("TemplateId")
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // AdHocQuestion
    private String AdHocQuestion;

    @JsonProperty("AdHocQuestion")
    public String getAdHocQuestion() {
        return this.AdHocQuestion;
    }

    @JsonProperty("AdHocQuestion")
    public void setAdHocQuestion(String AdHocQuestion) {
        this.AdHocQuestion = AdHocQuestion;
    }

    // AdHocFeedback
    private String AdHocFeedback;

    @JsonProperty("AdHocFeedback")
    public String getAdHocFeedback() {
        return this.AdHocFeedback;
    }

    @JsonProperty("AdHocFeedback")
    public void setAdHocFeedback(String AdHocFeedback) {
        this.AdHocFeedback = AdHocFeedback;
    }

}