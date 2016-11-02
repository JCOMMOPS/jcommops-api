package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Bufrcodeflag was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Bufrcodeflag extends CayenneDataObject {

    public static final String FILTER_PROPERTY = "filter";
    public static final String FXY_PROPERTY = "fxy";
    public static final String LOCAL_CENTRE_PROPERTY = "localCentre";
    public static final String LOCAL_SUB_CENTRE_PROPERTY = "localSubCentre";
    public static final String MASTER_TABLE_PROPERTY = "masterTable";
    public static final String MAX_PROPERTY = "max";
    public static final String MEANING_PROPERTY = "meaning";
    public static final String MIN_PROPERTY = "min";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String RANK_PROPERTY = "rank";
    public static final String TABLE_VERSION_PROPERTY = "tableVersion";
    public static final String PTF_DEPLOYMENT_ARRAY_PROPERTY = "ptfDeploymentArray";
    public static final String PTF_DEPLOYMENT_ARRAY1_PROPERTY = "ptfDeploymentArray1";

    public static final String ID_PK_COLUMN = "ID";

    public void setFilter(Integer filter) {
        writeProperty(FILTER_PROPERTY, filter);
    }
    public Integer getFilter() {
        return (Integer)readProperty(FILTER_PROPERTY);
    }

    public void setFxy(String fxy) {
        writeProperty(FXY_PROPERTY, fxy);
    }
    public String getFxy() {
        return (String)readProperty(FXY_PROPERTY);
    }

    public void setLocalCentre(Integer localCentre) {
        writeProperty(LOCAL_CENTRE_PROPERTY, localCentre);
    }
    public Integer getLocalCentre() {
        return (Integer)readProperty(LOCAL_CENTRE_PROPERTY);
    }

    public void setLocalSubCentre(Integer localSubCentre) {
        writeProperty(LOCAL_SUB_CENTRE_PROPERTY, localSubCentre);
    }
    public Integer getLocalSubCentre() {
        return (Integer)readProperty(LOCAL_SUB_CENTRE_PROPERTY);
    }

    public void setMasterTable(Integer masterTable) {
        writeProperty(MASTER_TABLE_PROPERTY, masterTable);
    }
    public Integer getMasterTable() {
        return (Integer)readProperty(MASTER_TABLE_PROPERTY);
    }

    public void setMax(Integer max) {
        writeProperty(MAX_PROPERTY, max);
    }
    public Integer getMax() {
        return (Integer)readProperty(MAX_PROPERTY);
    }

    public void setMeaning(String meaning) {
        writeProperty(MEANING_PROPERTY, meaning);
    }
    public String getMeaning() {
        return (String)readProperty(MEANING_PROPERTY);
    }

    public void setMin(Integer min) {
        writeProperty(MIN_PROPERTY, min);
    }
    public Integer getMin() {
        return (Integer)readProperty(MIN_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void setRank(Integer rank) {
        writeProperty(RANK_PROPERTY, rank);
    }
    public Integer getRank() {
        return (Integer)readProperty(RANK_PROPERTY);
    }

    public void setTableVersion(Integer tableVersion) {
        writeProperty(TABLE_VERSION_PROPERTY, tableVersion);
    }
    public Integer getTableVersion() {
        return (Integer)readProperty(TABLE_VERSION_PROPERTY);
    }

    public void addToPtfDeploymentArray(PtfDeployment obj) {
        addToManyTarget(PTF_DEPLOYMENT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfDeploymentArray(PtfDeployment obj) {
        removeToManyTarget(PTF_DEPLOYMENT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeploymentArray() {
        return (List<PtfDeployment>)readProperty(PTF_DEPLOYMENT_ARRAY_PROPERTY);
    }


    public void addToPtfDeploymentArray1(PtfDeployment obj) {
        addToManyTarget(PTF_DEPLOYMENT_ARRAY1_PROPERTY, obj, true);
    }
    public void removeFromPtfDeploymentArray1(PtfDeployment obj) {
        removeToManyTarget(PTF_DEPLOYMENT_ARRAY1_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeploymentArray1() {
        return (List<PtfDeployment>)readProperty(PTF_DEPLOYMENT_ARRAY1_PROPERTY);
    }


}