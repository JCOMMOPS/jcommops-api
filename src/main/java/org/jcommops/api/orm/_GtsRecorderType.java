package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _GtsRecorderType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsRecorderType extends CayenneDataObject {

    public static final String CODE_PROPERTY = "code";
    public static final String DETAILS_PROPERTY = "details";
    public static final String TYPE_PROPERTY = "type";
    public static final String OBS_ARRAY_PROPERTY = "obsArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setCode(String code) {
        writeProperty(CODE_PROPERTY, code);
    }
    public String getCode() {
        return (String)readProperty(CODE_PROPERTY);
    }

    public void setDetails(String details) {
        writeProperty(DETAILS_PROPERTY, details);
    }
    public String getDetails() {
        return (String)readProperty(DETAILS_PROPERTY);
    }

    public void setType(String type) {
        writeProperty(TYPE_PROPERTY, type);
    }
    public String getType() {
        return (String)readProperty(TYPE_PROPERTY);
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


}