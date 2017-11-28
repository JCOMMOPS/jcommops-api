package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _SensorModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SensorModel extends CayenneDataObject {

    public static final String AXES_NO_PROPERTY = "axesNo";
    public static final String CALIB_FREQUENCY_PROPERTY = "calibFrequency";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_LONG_PROPERTY = "nameLong";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String ORIGINAL_DATASET_PROPERTY = "originalDataset";
    public static final String RESOLUTION_PROPERTY = "resolution";
    public static final String SPEC_PROPERTY = "spec";
    public static final String YEARLY_DRIFT_PROPERTY = "yearlyDrift";
    public static final String AGENCY_PROPERTY = "agency";
    public static final String CRUISE_SENSOR_MODELS_PROPERTY = "cruiseSensorModels";
    public static final String IMAGE_PROPERTY = "image";
    public static final String MASTER_PROG_PROPERTY = "masterProg";
    public static final String PTF_SENSOR_MODELS_PROPERTY = "ptfSensorModels";
    public static final String SENSOR_MODEL_SENSOR_TYPES_PROPERTY = "sensorModelSensorTypes";
    public static final String SERVICES_PROPERTY = "services";
    public static final String SENSOR_TYPES_PROPERTY = "sensorTypes";
    public static final String WEBLINK_PROPERTY = "weblink";

    public static final String ID_PK_COLUMN = "ID";

    public void setAxesNo(Integer axesNo) {
        writeProperty(AXES_NO_PROPERTY, axesNo);
    }
    public Integer getAxesNo() {
        return (Integer)readProperty(AXES_NO_PROPERTY);
    }

    public void setCalibFrequency(Integer calibFrequency) {
        writeProperty(CALIB_FREQUENCY_PROPERTY, calibFrequency);
    }
    public Integer getCalibFrequency() {
        return (Integer)readProperty(CALIB_FREQUENCY_PROPERTY);
    }

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

    public void setOriginalDataset(String originalDataset) {
        writeProperty(ORIGINAL_DATASET_PROPERTY, originalDataset);
    }
    public String getOriginalDataset() {
        return (String)readProperty(ORIGINAL_DATASET_PROPERTY);
    }

    public void setResolution(Integer resolution) {
        writeProperty(RESOLUTION_PROPERTY, resolution);
    }
    public Integer getResolution() {
        return (Integer)readProperty(RESOLUTION_PROPERTY);
    }

    public void setSpec(byte[] spec) {
        writeProperty(SPEC_PROPERTY, spec);
    }
    public byte[] getSpec() {
        return (byte[])readProperty(SPEC_PROPERTY);
    }

    public void setYearlyDrift(Integer yearlyDrift) {
        writeProperty(YEARLY_DRIFT_PROPERTY, yearlyDrift);
    }
    public Integer getYearlyDrift() {
        return (Integer)readProperty(YEARLY_DRIFT_PROPERTY);
    }

    public void setAgency(Agency agency) {
        setToOneTarget(AGENCY_PROPERTY, agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty(AGENCY_PROPERTY);
    }


    public void addToCruiseSensorModels(CruiseSensorModel obj) {
        addToManyTarget(CRUISE_SENSOR_MODELS_PROPERTY, obj, true);
    }
    public void removeFromCruiseSensorModels(CruiseSensorModel obj) {
        removeToManyTarget(CRUISE_SENSOR_MODELS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseSensorModel> getCruiseSensorModels() {
        return (List<CruiseSensorModel>)readProperty(CRUISE_SENSOR_MODELS_PROPERTY);
    }


    public void setImage(Image image) {
        setToOneTarget(IMAGE_PROPERTY, image, true);
    }

    public Image getImage() {
        return (Image)readProperty(IMAGE_PROPERTY);
    }


    public void setMasterProg(MasterProg masterProg) {
        setToOneTarget(MASTER_PROG_PROPERTY, masterProg, true);
    }

    public MasterProg getMasterProg() {
        return (MasterProg)readProperty(MASTER_PROG_PROPERTY);
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


    public void addToSensorModelSensorTypes(SensorModelSensorType obj) {
        addToManyTarget(SENSOR_MODEL_SENSOR_TYPES_PROPERTY, obj, true);
    }
    public void removeFromSensorModelSensorTypes(SensorModelSensorType obj) {
        removeToManyTarget(SENSOR_MODEL_SENSOR_TYPES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorModelSensorType> getSensorModelSensorTypes() {
        return (List<SensorModelSensorType>)readProperty(SENSOR_MODEL_SENSOR_TYPES_PROPERTY);
    }


    public void addToServices(Service obj) {
        addToManyTarget(SERVICES_PROPERTY, obj, true);
    }
    public void removeFromServices(Service obj) {
        removeToManyTarget(SERVICES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Service> getServices() {
        return (List<Service>)readProperty(SERVICES_PROPERTY);
    }


    public void addToSensorTypes(SensorType obj) {
        addToManyTarget(SENSOR_TYPES_PROPERTY, obj, true);
    }
    public void removeFromSensorTypes(SensorType obj) {
        removeToManyTarget(SENSOR_TYPES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorType> getSensorTypes() {
        return (List<SensorType>)readProperty(SENSOR_TYPES_PROPERTY);
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget(WEBLINK_PROPERTY, weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty(WEBLINK_PROPERTY);
    }


}
