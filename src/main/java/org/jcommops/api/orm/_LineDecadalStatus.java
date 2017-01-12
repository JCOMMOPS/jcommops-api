package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _LineDecadalStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LineDecadalStatus extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String LINE_ARRAY_PROPERTY = "lineArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void addToLineArray(Line obj) {
        addToManyTarget(LINE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromLineArray(Line obj) {
        removeToManyTarget(LINE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Line> getLineArray() {
        return (List<Line>)readProperty(LINE_ARRAY_PROPERTY);
    }


}