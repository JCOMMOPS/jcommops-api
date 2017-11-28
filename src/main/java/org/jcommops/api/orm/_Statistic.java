package org.jcommops.api.orm;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Statistic was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Statistic extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String END_DATE_PROPERTY = "endDate";
    public static final String NAME_PROPERTY = "name";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String VALUE_PROPERTY = "value";

    public static final String NAME_PK_COLUMN = "NAME";
    public static final String START_DATE_PK_COLUMN = "START_DATE";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setValue(String value) {
        writeProperty(VALUE_PROPERTY, value);
    }
    public String getValue() {
        return (String)readProperty(VALUE_PROPERTY);
    }

}
