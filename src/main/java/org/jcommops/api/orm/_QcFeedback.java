package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _QcFeedback was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _QcFeedback extends CayenneDataObject {

    public static final String ANSWER_PROPERTY = "answer";
    public static final String CORRECTION_TYPE_PROPERTY = "correctionType";
    public static final String CORRECTION_VALUE_PROPERTY = "correctionValue";
    public static final String DONE_PROPERTY = "done";
    public static final String EMAIL_PROPERTY = "email";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String ID_PROPERTY = "id";
    public static final String MESSAGE_PROPERTY = "message";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String RECIPIENTS_PROPERTY = "recipients";
    public static final String SENT_PROPERTY = "sent";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String SUBJECT_PROPERTY = "subject";
    public static final String WMO_PROPERTY = "wmo";
    public static final String AGENCY_PROPERTY = "agency";
    public static final String ANSWER_CONTACT_PROPERTY = "answerContact";
    public static final String CONTACT_PROPERTY = "contact";
    public static final String GTS_CCCC_PROPERTY = "gtsCccc";
    public static final String GTS_HEADER_PROPERTY = "gtsHeader";
    public static final String PTF_PROPERTY = "ptf";
    public static final String QC_FEEDBACK_ACTION_PROPERTY = "qcFeedbackAction";
    public static final String QC_FEEDBACK_ERROR_TYPE_PROPERTY = "qcFeedbackErrorType";
    public static final String QC_FEEDBACK_OBSS_PROPERTY = "qcFeedbackObss";
    public static final String QC_FEEDBACK_TYPE_PROPERTY = "qcFeedbackType";
    public static final String QC_FEEDBACK_VARIABLES_PROPERTY = "qcFeedbackVariables";
    public static final String TOPIC_PROPERTY = "topic";
    public static final String VARIABLE_PROPERTY = "variable";
    public static final String WEBLINK_PROPERTY = "weblink";

    public static final String ID_PK_COLUMN = "ID";

    public void setAnswer(String answer) {
        writeProperty(ANSWER_PROPERTY, answer);
    }
    public String getAnswer() {
        return (String)readProperty(ANSWER_PROPERTY);
    }

    public void setCorrectionType(String correctionType) {
        writeProperty(CORRECTION_TYPE_PROPERTY, correctionType);
    }
    public String getCorrectionType() {
        return (String)readProperty(CORRECTION_TYPE_PROPERTY);
    }

    public void setCorrectionValue(BigDecimal correctionValue) {
        writeProperty(CORRECTION_VALUE_PROPERTY, correctionValue);
    }
    public BigDecimal getCorrectionValue() {
        return (BigDecimal)readProperty(CORRECTION_VALUE_PROPERTY);
    }

    public void setDone(Integer done) {
        writeProperty(DONE_PROPERTY, done);
    }
    public Integer getDone() {
        return (Integer)readProperty(DONE_PROPERTY);
    }

    public void setEmail(String email) {
        writeProperty(EMAIL_PROPERTY, email);
    }
    public String getEmail() {
        return (String)readProperty(EMAIL_PROPERTY);
    }

    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setMessage(String message) {
        writeProperty(MESSAGE_PROPERTY, message);
    }
    public String getMessage() {
        return (String)readProperty(MESSAGE_PROPERTY);
    }

    public void setOrigin(String origin) {
        writeProperty(ORIGIN_PROPERTY, origin);
    }
    public String getOrigin() {
        return (String)readProperty(ORIGIN_PROPERTY);
    }

    public void setRecipients(String recipients) {
        writeProperty(RECIPIENTS_PROPERTY, recipients);
    }
    public String getRecipients() {
        return (String)readProperty(RECIPIENTS_PROPERTY);
    }

    public void setSent(Integer sent) {
        writeProperty(SENT_PROPERTY, sent);
    }
    public Integer getSent() {
        return (Integer)readProperty(SENT_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setSubject(String subject) {
        writeProperty(SUBJECT_PROPERTY, subject);
    }
    public String getSubject() {
        return (String)readProperty(SUBJECT_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

    public void setAgency(Agency agency) {
        setToOneTarget(AGENCY_PROPERTY, agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty(AGENCY_PROPERTY);
    }


    public void setAnswerContact(Contact answerContact) {
        setToOneTarget(ANSWER_CONTACT_PROPERTY, answerContact, true);
    }

    public Contact getAnswerContact() {
        return (Contact)readProperty(ANSWER_CONTACT_PROPERTY);
    }


    public void setContact(Contact contact) {
        setToOneTarget(CONTACT_PROPERTY, contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty(CONTACT_PROPERTY);
    }


    public void setGtsCccc(GtsCccc gtsCccc) {
        setToOneTarget(GTS_CCCC_PROPERTY, gtsCccc, true);
    }

    public GtsCccc getGtsCccc() {
        return (GtsCccc)readProperty(GTS_CCCC_PROPERTY);
    }


    public void setGtsHeader(GtsHeader gtsHeader) {
        setToOneTarget(GTS_HEADER_PROPERTY, gtsHeader, true);
    }

    public GtsHeader getGtsHeader() {
        return (GtsHeader)readProperty(GTS_HEADER_PROPERTY);
    }


    public void setPtf(Ptf ptf) {
        setToOneTarget(PTF_PROPERTY, ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty(PTF_PROPERTY);
    }


    public void setQcFeedbackAction(QcFeedbackAction qcFeedbackAction) {
        setToOneTarget(QC_FEEDBACK_ACTION_PROPERTY, qcFeedbackAction, true);
    }

    public QcFeedbackAction getQcFeedbackAction() {
        return (QcFeedbackAction)readProperty(QC_FEEDBACK_ACTION_PROPERTY);
    }


    public void setQcFeedbackErrorType(QcFeedbackErrorType qcFeedbackErrorType) {
        setToOneTarget(QC_FEEDBACK_ERROR_TYPE_PROPERTY, qcFeedbackErrorType, true);
    }

    public QcFeedbackErrorType getQcFeedbackErrorType() {
        return (QcFeedbackErrorType)readProperty(QC_FEEDBACK_ERROR_TYPE_PROPERTY);
    }


    public void addToQcFeedbackObss(QcFeedbackObs obj) {
        addToManyTarget(QC_FEEDBACK_OBSS_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbackObss(QcFeedbackObs obj) {
        removeToManyTarget(QC_FEEDBACK_OBSS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedbackObs> getQcFeedbackObss() {
        return (List<QcFeedbackObs>)readProperty(QC_FEEDBACK_OBSS_PROPERTY);
    }


    public void setQcFeedbackType(QcFeedbackType qcFeedbackType) {
        setToOneTarget(QC_FEEDBACK_TYPE_PROPERTY, qcFeedbackType, true);
    }

    public QcFeedbackType getQcFeedbackType() {
        return (QcFeedbackType)readProperty(QC_FEEDBACK_TYPE_PROPERTY);
    }


    public void addToQcFeedbackVariables(QcFeedbackVariable obj) {
        addToManyTarget(QC_FEEDBACK_VARIABLES_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbackVariables(QcFeedbackVariable obj) {
        removeToManyTarget(QC_FEEDBACK_VARIABLES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedbackVariable> getQcFeedbackVariables() {
        return (List<QcFeedbackVariable>)readProperty(QC_FEEDBACK_VARIABLES_PROPERTY);
    }


    public void setTopic(Topic topic) {
        setToOneTarget(TOPIC_PROPERTY, topic, true);
    }

    public Topic getTopic() {
        return (Topic)readProperty(TOPIC_PROPERTY);
    }


    public void setVariable(Variable variable) {
        setToOneTarget(VARIABLE_PROPERTY, variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty(VARIABLE_PROPERTY);
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget(WEBLINK_PROPERTY, weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty(WEBLINK_PROPERTY);
    }


}
