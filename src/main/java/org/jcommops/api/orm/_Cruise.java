package org.jcommops.api.orm;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Cruise was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cruise extends CayenneDataObject {

    public static final String ARRIVAL_DATE_PROPERTY = "arrivalDate";
    public static final String AUTONOMY_PROPERTY = "autonomy";
    public static final String COOPERATIONS_PROPERTY = "cooperations";
    public static final String COST_MONTH_PROPERTY = "costMonth";
    public static final String COST_UNIT_PROPERTY = "costUnit";
    public static final String DATES_PENDING_PROPERTY = "datesPending";
    public static final String DEMOB_DATE_PROPERTY = "demobDate";
    public static final String DEPARTURE_DATE_PROPERTY = "departureDate";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EMBARK_CAPACITY_PROPERTY = "embarkCapacity";
    public static final String FLEXIBLE_ROUTE_PROPERTY = "flexibleRoute";
    public static final String INSERT_DATE_PROPERTY = "insertDate";
    public static final String LINE_ID_PROPERTY = "lineId";
    public static final String MOB_DATE_PROPERTY = "mobDate";
    public static final String MODIF_DATE_PROPERTY = "modifDate";
    public static final String NAME_LONG_PROPERTY = "nameLong";
    public static final String OPERATION_DATE_PROPERTY = "operationDate";
    public static final String PROJECT_NAME_PROPERTY = "projectName";
    public static final String REF_PROPERTY = "ref";
    public static final String REF_TMP_PROPERTY = "refTmp";
    public static final String ROUTE_PENDING_PROPERTY = "routePending";
    public static final String ROUTE_PRIVATE_PROPERTY = "routePrivate";
    public static final String SHAPE_PROPERTY = "shape";
    public static final String SHIP_STOP_PROPERTY = "shipStop";
    public static final String STORAGE_CAPACITY_PROPERTY = "storageCapacity";
    public static final String UNOLS_ID_PROPERTY = "unolsId";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String VALIDATED_PROPERTY = "validated";
    public static final String WKT_PROPERTY = "wkt";
    public static final String CRUISE_CONTACT_ARRAY_PROPERTY = "cruiseContactArray";
    public static final String CRUISE_COUNTRY_ARRAY_PROPERTY = "cruiseCountryArray";
    public static final String CRUISE_SENSOR_MODEL_ARRAY_PROPERTY = "cruiseSensorModelArray";
    public static final String CRUISE_VARIABLE_ARRAY_PROPERTY = "cruiseVariableArray";
    public static final String PTF_CRUISE_ARRAY_PROPERTY = "ptfCruiseArray";
    public static final String PTF_DEPLOYMENT_ARRAY_PROPERTY = "ptfDeploymentArray";
    public static final String SECTION_ARRAY_PROPERTY = "sectionArray";
    public static final String TO_AGENCY_PROPERTY = "toAgency";
    public static final String TO_AVAILABILITY_PROPERTY = "toAvailability";
    public static final String TO_CRUISE_CLASS_PROPERTY = "toCruiseClass";
    public static final String TO_CRUISE_STATUS_PROPERTY = "toCruiseStatus";
    public static final String TO_CRUISE_TYPE_PROPERTY = "toCruiseType";
    public static final String TO_FREQUENCY_PROPERTY = "toFrequency";
    public static final String TO_IMAGE_PROPERTY = "toImage";
    public static final String TO_PROGRAM_PROPERTY = "toProgram";
    public static final String TO_SHIP_PROPERTY = "toShip";
    public static final String TO_WEBLINK_PROPERTY = "toWeblink";

    public static final String ID_PK_COLUMN = "ID";

    public void setArrivalDate(Date arrivalDate) {
        writeProperty(ARRIVAL_DATE_PROPERTY, arrivalDate);
    }
    public Date getArrivalDate() {
        return (Date)readProperty(ARRIVAL_DATE_PROPERTY);
    }

    public void setAutonomy(Integer autonomy) {
        writeProperty(AUTONOMY_PROPERTY, autonomy);
    }
    public Integer getAutonomy() {
        return (Integer)readProperty(AUTONOMY_PROPERTY);
    }

    public void setCooperations(Integer cooperations) {
        writeProperty(COOPERATIONS_PROPERTY, cooperations);
    }
    public Integer getCooperations() {
        return (Integer)readProperty(COOPERATIONS_PROPERTY);
    }

    public void setCostMonth(Integer costMonth) {
        writeProperty(COST_MONTH_PROPERTY, costMonth);
    }
    public Integer getCostMonth() {
        return (Integer)readProperty(COST_MONTH_PROPERTY);
    }

    public void setCostUnit(Integer costUnit) {
        writeProperty(COST_UNIT_PROPERTY, costUnit);
    }
    public Integer getCostUnit() {
        return (Integer)readProperty(COST_UNIT_PROPERTY);
    }

    public void setDatesPending(Integer datesPending) {
        writeProperty(DATES_PENDING_PROPERTY, datesPending);
    }
    public Integer getDatesPending() {
        return (Integer)readProperty(DATES_PENDING_PROPERTY);
    }

    public void setDemobDate(Date demobDate) {
        writeProperty(DEMOB_DATE_PROPERTY, demobDate);
    }
    public Date getDemobDate() {
        return (Date)readProperty(DEMOB_DATE_PROPERTY);
    }

    public void setDepartureDate(Date departureDate) {
        writeProperty(DEPARTURE_DATE_PROPERTY, departureDate);
    }
    public Date getDepartureDate() {
        return (Date)readProperty(DEPARTURE_DATE_PROPERTY);
    }

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setEmbarkCapacity(Integer embarkCapacity) {
        writeProperty(EMBARK_CAPACITY_PROPERTY, embarkCapacity);
    }
    public Integer getEmbarkCapacity() {
        return (Integer)readProperty(EMBARK_CAPACITY_PROPERTY);
    }

    public void setFlexibleRoute(Integer flexibleRoute) {
        writeProperty(FLEXIBLE_ROUTE_PROPERTY, flexibleRoute);
    }
    public Integer getFlexibleRoute() {
        return (Integer)readProperty(FLEXIBLE_ROUTE_PROPERTY);
    }

    public void setInsertDate(Date insertDate) {
        writeProperty(INSERT_DATE_PROPERTY, insertDate);
    }
    public Date getInsertDate() {
        return (Date)readProperty(INSERT_DATE_PROPERTY);
    }

    public void setLineId(Integer lineId) {
        writeProperty(LINE_ID_PROPERTY, lineId);
    }
    public Integer getLineId() {
        return (Integer)readProperty(LINE_ID_PROPERTY);
    }

    public void setMobDate(Date mobDate) {
        writeProperty(MOB_DATE_PROPERTY, mobDate);
    }
    public Date getMobDate() {
        return (Date)readProperty(MOB_DATE_PROPERTY);
    }

    public void setModifDate(Date modifDate) {
        writeProperty(MODIF_DATE_PROPERTY, modifDate);
    }
    public Date getModifDate() {
        return (Date)readProperty(MODIF_DATE_PROPERTY);
    }

    public void setNameLong(String nameLong) {
        writeProperty(NAME_LONG_PROPERTY, nameLong);
    }
    public String getNameLong() {
        return (String)readProperty(NAME_LONG_PROPERTY);
    }

    public void setOperationDate(Date operationDate) {
        writeProperty(OPERATION_DATE_PROPERTY, operationDate);
    }
    public Date getOperationDate() {
        return (Date)readProperty(OPERATION_DATE_PROPERTY);
    }

    public void setProjectName(String projectName) {
        writeProperty(PROJECT_NAME_PROPERTY, projectName);
    }
    public String getProjectName() {
        return (String)readProperty(PROJECT_NAME_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

    public void setRefTmp(String refTmp) {
        writeProperty(REF_TMP_PROPERTY, refTmp);
    }
    public String getRefTmp() {
        return (String)readProperty(REF_TMP_PROPERTY);
    }

    public void setRoutePending(Integer routePending) {
        writeProperty(ROUTE_PENDING_PROPERTY, routePending);
    }
    public Integer getRoutePending() {
        return (Integer)readProperty(ROUTE_PENDING_PROPERTY);
    }

    public void setRoutePrivate(Integer routePrivate) {
        writeProperty(ROUTE_PRIVATE_PROPERTY, routePrivate);
    }
    public Integer getRoutePrivate() {
        return (Integer)readProperty(ROUTE_PRIVATE_PROPERTY);
    }

    public void setShape($importUtils.formatJavaType(${attr.Type}) shape) {
        writeProperty(SHAPE_PROPERTY, shape);
    }
    public $importUtils.formatJavaType(${attr.Type}) getShape() {
        return ($importUtils.formatJavaType(${attr.Type}))readProperty(SHAPE_PROPERTY);
    }

    public void setShipStop(Integer shipStop) {
        writeProperty(SHIP_STOP_PROPERTY, shipStop);
    }
    public Integer getShipStop() {
        return (Integer)readProperty(SHIP_STOP_PROPERTY);
    }

    public void setStorageCapacity(Integer storageCapacity) {
        writeProperty(STORAGE_CAPACITY_PROPERTY, storageCapacity);
    }
    public Integer getStorageCapacity() {
        return (Integer)readProperty(STORAGE_CAPACITY_PROPERTY);
    }

    public void setUnolsId(Integer unolsId) {
        writeProperty(UNOLS_ID_PROPERTY, unolsId);
    }
    public Integer getUnolsId() {
        return (Integer)readProperty(UNOLS_ID_PROPERTY);
    }

    public void setUpdateDate(Date updateDate) {
        writeProperty(UPDATE_DATE_PROPERTY, updateDate);
    }
    public Date getUpdateDate() {
        return (Date)readProperty(UPDATE_DATE_PROPERTY);
    }

    public void setValidated(Integer validated) {
        writeProperty(VALIDATED_PROPERTY, validated);
    }
    public Integer getValidated() {
        return (Integer)readProperty(VALIDATED_PROPERTY);
    }

    public void setWkt(String wkt) {
        writeProperty(WKT_PROPERTY, wkt);
    }
    public String getWkt() {
        return (String)readProperty(WKT_PROPERTY);
    }

    public void addToCruiseContactArray(CruiseContact obj) {
        addToManyTarget(CRUISE_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseContactArray(CruiseContact obj) {
        removeToManyTarget(CRUISE_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseContact> getCruiseContactArray() {
        return (List<CruiseContact>)readProperty(CRUISE_CONTACT_ARRAY_PROPERTY);
    }


    public void addToCruiseCountryArray(CruiseCountry obj) {
        addToManyTarget(CRUISE_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseCountryArray(CruiseCountry obj) {
        removeToManyTarget(CRUISE_COUNTRY_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseCountry> getCruiseCountryArray() {
        return (List<CruiseCountry>)readProperty(CRUISE_COUNTRY_ARRAY_PROPERTY);
    }


    public void addToCruiseSensorModelArray(CruiseSensorModel obj) {
        addToManyTarget(CRUISE_SENSOR_MODEL_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseSensorModelArray(CruiseSensorModel obj) {
        removeToManyTarget(CRUISE_SENSOR_MODEL_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseSensorModel> getCruiseSensorModelArray() {
        return (List<CruiseSensorModel>)readProperty(CRUISE_SENSOR_MODEL_ARRAY_PROPERTY);
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


    public void addToPtfCruiseArray(PtfCruise obj) {
        addToManyTarget(PTF_CRUISE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfCruiseArray(PtfCruise obj) {
        removeToManyTarget(PTF_CRUISE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfCruise> getPtfCruiseArray() {
        return (List<PtfCruise>)readProperty(PTF_CRUISE_ARRAY_PROPERTY);
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


    public void addToSectionArray(Section obj) {
        addToManyTarget(SECTION_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromSectionArray(Section obj) {
        removeToManyTarget(SECTION_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Section> getSectionArray() {
        return (List<Section>)readProperty(SECTION_ARRAY_PROPERTY);
    }


    public void setToAgency(Agency toAgency) {
        setToOneTarget(TO_AGENCY_PROPERTY, toAgency, true);
    }

    public Agency getToAgency() {
        return (Agency)readProperty(TO_AGENCY_PROPERTY);
    }


    public void setToAvailability(Availability toAvailability) {
        setToOneTarget(TO_AVAILABILITY_PROPERTY, toAvailability, true);
    }

    public Availability getToAvailability() {
        return (Availability)readProperty(TO_AVAILABILITY_PROPERTY);
    }


    public void setToCruiseClass(CruiseClass toCruiseClass) {
        setToOneTarget(TO_CRUISE_CLASS_PROPERTY, toCruiseClass, true);
    }

    public CruiseClass getToCruiseClass() {
        return (CruiseClass)readProperty(TO_CRUISE_CLASS_PROPERTY);
    }


    public void setToCruiseStatus(CruiseStatus toCruiseStatus) {
        setToOneTarget(TO_CRUISE_STATUS_PROPERTY, toCruiseStatus, true);
    }

    public CruiseStatus getToCruiseStatus() {
        return (CruiseStatus)readProperty(TO_CRUISE_STATUS_PROPERTY);
    }


    public void setToCruiseType(CruiseType toCruiseType) {
        setToOneTarget(TO_CRUISE_TYPE_PROPERTY, toCruiseType, true);
    }

    public CruiseType getToCruiseType() {
        return (CruiseType)readProperty(TO_CRUISE_TYPE_PROPERTY);
    }


    public void setToFrequency(Frequency toFrequency) {
        setToOneTarget(TO_FREQUENCY_PROPERTY, toFrequency, true);
    }

    public Frequency getToFrequency() {
        return (Frequency)readProperty(TO_FREQUENCY_PROPERTY);
    }


    public void setToImage(Image toImage) {
        setToOneTarget(TO_IMAGE_PROPERTY, toImage, true);
    }

    public Image getToImage() {
        return (Image)readProperty(TO_IMAGE_PROPERTY);
    }


    public void setToProgram(Program toProgram) {
        setToOneTarget(TO_PROGRAM_PROPERTY, toProgram, true);
    }

    public Program getToProgram() {
        return (Program)readProperty(TO_PROGRAM_PROPERTY);
    }


    public void setToShip(Ship toShip) {
        setToOneTarget(TO_SHIP_PROPERTY, toShip, true);
    }

    public Ship getToShip() {
        return (Ship)readProperty(TO_SHIP_PROPERTY);
    }


    public void setToWeblink(Weblink toWeblink) {
        setToOneTarget(TO_WEBLINK_PROPERTY, toWeblink, true);
    }

    public Weblink getToWeblink() {
        return (Weblink)readProperty(TO_WEBLINK_PROPERTY);
    }


}