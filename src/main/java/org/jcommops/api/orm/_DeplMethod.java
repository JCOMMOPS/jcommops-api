package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _DeplMethod was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeplMethod extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String PTF_DEPLOYMENTS_PROPERTY = "ptfDeployments";

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

    public void addToPtfDeployments(PtfDeployment obj) {
        addToManyTarget(PTF_DEPLOYMENTS_PROPERTY, obj, true);
    }
    public void removeFromPtfDeployments(PtfDeployment obj) {
        removeToManyTarget(PTF_DEPLOYMENTS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeployments() {
        return (List<PtfDeployment>)readProperty(PTF_DEPLOYMENTS_PROPERTY);
    }


}
