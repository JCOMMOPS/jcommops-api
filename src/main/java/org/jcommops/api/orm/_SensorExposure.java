package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _SensorExposure was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SensorExposure extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String PUB47REF_PROPERTY = "pub47Ref";
    public static final String REF_PROPERTY = "ref";
    public static final String PTF_SENSOR_MODELS_PROPERTY = "ptfSensorModels";

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

    public void setPub47Ref(String pub47Ref) {
        writeProperty(PUB47REF_PROPERTY, pub47Ref);
    }
    public String getPub47Ref() {
        return (String)readProperty(PUB47REF_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

    public void addToPtfSensorModels(PtfSensorModel obj) {
        addToManyTarget(PTF_SENSOR_MODELS_PROPERTY, obj, true);
    }
    public void removeFromPtfSensorModels(PtfSensorModel obj) {
        removeToManyTarget(PTF_SENSOR_MODELS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfSensorModel> getPtfSensorModels() {
        return (List<PtfSensorModel>)readProperty(PTF_SENSOR_MODELS_PROPERTY);
    }


}
