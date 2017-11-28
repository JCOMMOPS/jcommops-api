package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _LocStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocStatus extends CayenneDataObject {

    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String PTF_LOC_STATUSES_PROPERTY = "ptfLocStatuses";

    public static final String ID_PK_COLUMN = "ID";

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

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToPtfLocStatuses(PtfLocStatus obj) {
        addToManyTarget(PTF_LOC_STATUSES_PROPERTY, obj, true);
    }
    public void removeFromPtfLocStatuses(PtfLocStatus obj) {
        removeToManyTarget(PTF_LOC_STATUSES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfLocStatus> getPtfLocStatuses() {
        return (List<PtfLocStatus>)readProperty(PTF_LOC_STATUSES_PROPERTY);
    }


}
