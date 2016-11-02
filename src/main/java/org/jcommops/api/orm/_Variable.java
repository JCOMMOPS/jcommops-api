package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Variable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Variable extends CayenneDataObject {

    public static final String ARGO_REF_PROPERTY = "argoRef";
    public static final String CANONICAL_UNIT_PROPERTY = "canonicalUnit";
    public static final String CF_REF_PROPERTY = "cfRef";
    public static final String DATA_SOURCE_PROPERTY = "dataSource";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_ALTER_PROPERTY = "nameAlter";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String WIGOS_REF_PROPERTY = "wigosRef";
    public static final String CRUISE_VARIABLE_ARRAY_PROPERTY = "cruiseVariableArray";
    public static final String OBS_VARIABLE_ARRAY_PROPERTY = "obsVariableArray";
    public static final String PTF_VARIABLE_ARRAY_PROPERTY = "ptfVariableArray";
    public static final String QC_FEEDBACK_ARRAY_PROPERTY = "qcFeedbackArray";
    public static final String SENSOR_TYPE_ARRAY_PROPERTY = "sensorTypeArray";
    public static final String TO_VARIABLE_FAMILY_PROPERTY = "toVariableFamily";

    public static final String ID_PK_COLUMN = "ID";

    public void setArgoRef(String argoRef) {
        writeProperty(ARGO_REF_PROPERTY, argoRef);
    }
    public String getArgoRef() {
        return (String)readProperty(ARGO_REF_PROPERTY);
    }

    public void setCanonicalUnit(String canonicalUnit) {
        writeProperty(CANONICAL_UNIT_PROPERTY, canonicalUnit);
    }
    public String getCanonicalUnit() {
        return (String)readProperty(CANONICAL_UNIT_PROPERTY);
    }

    public void setCfRef(String cfRef) {
        writeProperty(CF_REF_PROPERTY, cfRef);
    }
    public String getCfRef() {
        return (String)readProperty(CF_REF_PROPERTY);
    }

    public void setDataSource(String dataSource) {
        writeProperty(DATA_SOURCE_PROPERTY, dataSource);
    }
    public String getDataSource() {
        return (String)readProperty(DATA_SOURCE_PROPERTY);
    }

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

    public void setNameAlter(String nameAlter) {
        writeProperty(NAME_ALTER_PROPERTY, nameAlter);
    }
    public String getNameAlter() {
        return (String)readProperty(NAME_ALTER_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void setWigosRef(Integer wigosRef) {
        writeProperty(WIGOS_REF_PROPERTY, wigosRef);
    }
    public Integer getWigosRef() {
        return (Integer)readProperty(WIGOS_REF_PROPERTY);
    }

    public void addToCruiseVariableArray(CruiseVariable obj) {
        addToManyTarget(CRUISE_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseVariableArray(CruiseVariable obj) {
        removeToManyTarget(CRUISE_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseVariable> getCruiseVariableArray() {
        return (List<CruiseVariable>)readProperty(CRUISE_VARIABLE_ARRAY_PROPERTY);
    }


    public void addToObsVariableArray(ObsVariable obj) {
        addToManyTarget(OBS_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromObsVariableArray(ObsVariable obj) {
        removeToManyTarget(OBS_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ObsVariable> getObsVariableArray() {
        return (List<ObsVariable>)readProperty(OBS_VARIABLE_ARRAY_PROPERTY);
    }


    public void addToPtfVariableArray(PtfVariable obj) {
        addToManyTarget(PTF_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfVariableArray(PtfVariable obj) {
        removeToManyTarget(PTF_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfVariable> getPtfVariableArray() {
        return (List<PtfVariable>)readProperty(PTF_VARIABLE_ARRAY_PROPERTY);
    }


    public void addToQcFeedbackArray(QcFeedback obj) {
        addToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbackArray(QcFeedback obj) {
        removeToManyTarget(QC_FEEDBACK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbackArray() {
        return (List<QcFeedback>)readProperty(QC_FEEDBACK_ARRAY_PROPERTY);
    }


    public void addToSensorTypeArray(SensorType obj) {
        addToManyTarget(SENSOR_TYPE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromSensorTypeArray(SensorType obj) {
        removeToManyTarget(SENSOR_TYPE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorType> getSensorTypeArray() {
        return (List<SensorType>)readProperty(SENSOR_TYPE_ARRAY_PROPERTY);
    }


    public void setToVariableFamily(VariableFamily toVariableFamily) {
        setToOneTarget(TO_VARIABLE_FAMILY_PROPERTY, toVariableFamily, true);
    }

    public VariableFamily getToVariableFamily() {
        return (VariableFamily)readProperty(TO_VARIABLE_FAMILY_PROPERTY);
    }


}