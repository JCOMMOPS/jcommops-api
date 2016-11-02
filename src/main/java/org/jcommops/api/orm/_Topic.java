package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Topic was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Topic extends CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String DOC_ARRAY_PROPERTY = "docArray";
    public static final String QC_FEEDBACK_ARRAY_PROPERTY = "qcFeedbackArray";
    public static final String WEBLINK_ARRAY_PROPERTY = "weblinkArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void addToDocArray(Doc obj) {
        addToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromDocArray(Doc obj) {
        removeToManyTarget(DOC_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocArray() {
        return (List<Doc>)readProperty(DOC_ARRAY_PROPERTY);
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


    public void addToWeblinkArray(Weblink obj) {
        addToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromWeblinkArray(Weblink obj) {
        removeToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Weblink> getWeblinkArray() {
        return (List<Weblink>)readProperty(WEBLINK_ARRAY_PROPERTY);
    }


}