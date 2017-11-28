package org.jcommops.api.orm;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _UpdateTimestamp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UpdateTimestamp extends CayenneDataObject {

    public static final String COMPLETED_PROPERTY = "completed";
    public static final String LAST_UPDATE_PROPERTY = "lastUpdate";
    public static final String NAME_PROPERTY = "name";

    public static final String NAME_PK_COLUMN = "NAME";

    public void setCompleted(Integer completed) {
        writeProperty(COMPLETED_PROPERTY, completed);
    }
    public Integer getCompleted() {
        return (Integer)readProperty(COMPLETED_PROPERTY);
    }

    public void setLastUpdate(Date lastUpdate) {
        writeProperty(LAST_UPDATE_PROPERTY, lastUpdate);
    }
    public Date getLastUpdate() {
        return (Date)readProperty(LAST_UPDATE_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

}
