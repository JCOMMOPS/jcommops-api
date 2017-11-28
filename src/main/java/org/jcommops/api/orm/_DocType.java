package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _DocType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DocType extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_LONG_PROPERTY = "nameLong";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String DOCS_PROPERTY = "docs";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameLong(String nameLong) {
        writeProperty(NAME_LONG_PROPERTY, nameLong);
    }
    public String getNameLong() {
        return (String)readProperty(NAME_LONG_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToDocs(Doc obj) {
        addToManyTarget(DOCS_PROPERTY, obj, true);
    }
    public void removeFromDocs(Doc obj) {
        removeToManyTarget(DOCS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocs() {
        return (List<Doc>)readProperty(DOCS_PROPERTY);
    }


}
