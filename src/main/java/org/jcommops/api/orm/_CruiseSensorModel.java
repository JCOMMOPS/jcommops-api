package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CruiseSensorModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseSensorModel extends CayenneDataObject {

    public static final String CRUISE_ID_PROPERTY = "cruiseId";
    public static final String SENSOR_MODEL_ID_PROPERTY = "sensorModelId";
    public static final String CRUISE_PROPERTY = "cruise";
    public static final String SENSOR_MODEL_PROPERTY = "sensorModel";

    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";
    public static final String SENSOR_MODEL_ID_PK_COLUMN = "SENSOR_MODEL_ID";

    public void setCruiseId(Integer cruiseId) {
        writeProperty(CRUISE_ID_PROPERTY, cruiseId);
    }
    public Integer getCruiseId() {
        return (Integer)readProperty(CRUISE_ID_PROPERTY);
    }

    public void setSensorModelId(Integer sensorModelId) {
        writeProperty(SENSOR_MODEL_ID_PROPERTY, sensorModelId);
    }
    public Integer getSensorModelId() {
        return (Integer)readProperty(SENSOR_MODEL_ID_PROPERTY);
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget(CRUISE_PROPERTY, cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty(CRUISE_PROPERTY);
    }


    public void setSensorModel(SensorModel sensorModel) {
        setToOneTarget(SENSOR_MODEL_PROPERTY, sensorModel, true);
    }

    public SensorModel getSensorModel() {
        return (SensorModel)readProperty(SENSOR_MODEL_PROPERTY);
    }


}
