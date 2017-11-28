package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _TelecomType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TelecomType extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String PUB47REF_PROPERTY = "pub47Ref";
    public static final String TELECOMS_PROPERTY = "telecoms";

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

    public void setPub47Ref(String pub47Ref) {
        writeProperty(PUB47REF_PROPERTY, pub47Ref);
    }
    public String getPub47Ref() {
        return (String)readProperty(PUB47REF_PROPERTY);
    }

    public void addToTelecoms(Telecom obj) {
        addToManyTarget(TELECOMS_PROPERTY, obj, true);
    }
    public void removeFromTelecoms(Telecom obj) {
        removeToManyTarget(TELECOMS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Telecom> getTelecoms() {
        return (List<Telecom>)readProperty(TELECOMS_PROPERTY);
    }


}
