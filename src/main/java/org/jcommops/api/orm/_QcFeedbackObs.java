package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _QcFeedbackObs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _QcFeedbackObs extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String OBS_ID_PK_COLUMN = "OBS_ID";
    public static final String QC_FEEDBACK_ID_PK_COLUMN = "QC_FEEDBACK_ID";

    public static final Property<Integer> OBS_ID = Property.create("obsId", Integer.class);
    public static final Property<Integer> QC_FEEDBACK_ID = Property.create("qcFeedbackId", Integer.class);
    public static final Property<QcFeedback> QC_FEEDBACK = Property.create("qcFeedback", QcFeedback.class);

    public void setObsId(int obsId) {
        writeProperty("obsId", obsId);
    }
    public int getObsId() {
        Object value = readProperty("obsId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setQcFeedbackId(int qcFeedbackId) {
        writeProperty("qcFeedbackId", qcFeedbackId);
    }
    public int getQcFeedbackId() {
        Object value = readProperty("qcFeedbackId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setQcFeedback(QcFeedback qcFeedback) {
        setToOneTarget("qcFeedback", qcFeedback, true);
    }

    public QcFeedback getQcFeedback() {
        return (QcFeedback)readProperty("qcFeedback");
    }


}
