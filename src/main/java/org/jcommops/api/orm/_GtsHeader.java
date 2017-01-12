package org.jcommops.api.orm;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _GtsHeader was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsHeader extends CayenneDataObject {

    public static final String END_DATE_PROPERTY = "endDate";
    public static final String HEADER_PROPERTY = "header";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String TEXT_PROPERTY = "text";
    public static final String GTS_CCCC_HEADER_ARRAY_PROPERTY = "gtsCcccHeaderArray";
    public static final String OBS_ARRAY_PROPERTY = "obsArray";
    public static final String QC_FEEDBACK_ARRAY_PROPERTY = "qcFeedbackArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setHeader(String header) {
        writeProperty(HEADER_PROPERTY, header);
    }
    public String getHeader() {
        return (String)readProperty(HEADER_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setText(String text) {
        writeProperty(TEXT_PROPERTY, text);
    }
    public String getText() {
        return (String)readProperty(TEXT_PROPERTY);
    }

    public void addToGtsCcccHeaderArray(GtsCcccHeader obj) {
        addToManyTarget(GTS_CCCC_HEADER_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromGtsCcccHeaderArray(GtsCcccHeader obj) {
        removeToManyTarget(GTS_CCCC_HEADER_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<GtsCcccHeader> getGtsCcccHeaderArray() {
        return (List<GtsCcccHeader>)readProperty(GTS_CCCC_HEADER_ARRAY_PROPERTY);
    }


    public void addToObsArray(Obs obj) {
        addToManyTarget(OBS_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromObsArray(Obs obj) {
        removeToManyTarget(OBS_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Obs> getObsArray() {
        return (List<Obs>)readProperty(OBS_ARRAY_PROPERTY);
    }


    public void addToQcFeedbackArray(QcFeedback obj) {
        addToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbackArray(QcFeedback obj) {
        removeToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbackArray() {
        return (List<QcFeedback>)readProperty(QC_FEEDBACK_ARRAY_PROPERTY);
    }


}
