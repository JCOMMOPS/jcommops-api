package org.oceanops.api.orm;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Cruise was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cruise extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<LocalDateTime> ARRIVAL_DATE = Property.create("arrivalDate", LocalDateTime.class);
    public static final Property<Integer> AUTONOMY = Property.create("autonomy", Integer.class);
    public static final Property<Integer> COOPERATIONS = Property.create("cooperations", Integer.class);
    public static final Property<Integer> COST_MONTH = Property.create("costMonth", Integer.class);
    public static final Property<Integer> COST_UNIT = Property.create("costUnit", Integer.class);
    public static final Property<Integer> DATES_PENDING = Property.create("datesPending", Integer.class);
    public static final Property<LocalDateTime> DEMOB_DATE = Property.create("demobDate", LocalDateTime.class);
    public static final Property<LocalDateTime> DEPARTURE_DATE = Property.create("departureDate", LocalDateTime.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> EMBARK_CAPACITY = Property.create("embarkCapacity", Integer.class);
    public static final Property<Integer> FLEXIBLE_ROUTE = Property.create("flexibleRoute", Integer.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> IIOE2ID = Property.create("iioe2Id", String.class);
    public static final Property<LocalDateTime> INSERT_DATE = Property.create("insertDate", LocalDateTime.class);
    public static final Property<LocalDateTime> MOB_DATE = Property.create("mobDate", LocalDateTime.class);
    public static final Property<LocalDateTime> MODIF_DATE = Property.create("modifDate", LocalDateTime.class);
    public static final Property<String> NAME_LONG = Property.create("nameLong", String.class);
    public static final Property<LocalDateTime> OPERATION_DATE = Property.create("operationDate", LocalDateTime.class);
    public static final Property<String> PROJECT_NAME = Property.create("projectName", String.class);
    public static final Property<String> REF = Property.create("ref", String.class);
    public static final Property<String> REF_TMP = Property.create("refTmp", String.class);
    public static final Property<Integer> ROUTE_PENDING = Property.create("routePending", Integer.class);
    public static final Property<Integer> ROUTE_PRIVATE = Property.create("routePrivate", Integer.class);
    public static final Property<byte[]> SHAPE = Property.create("shape", byte[].class);
    public static final Property<Integer> SHIP_STOP = Property.create("shipStop", Integer.class);
    public static final Property<Integer> STORAGE_CAPACITY = Property.create("storageCapacity", Integer.class);
    public static final Property<Integer> UNOLS_ID = Property.create("unolsId", Integer.class);
    public static final Property<LocalDateTime> UPDATE_DATE = Property.create("updateDate", LocalDateTime.class);
    public static final Property<Integer> VALIDATED = Property.create("validated", Integer.class);
    public static final Property<String> WKT = Property.create("wkt", String.class);
    public static final Property<Agency> AGENCY = Property.create("agency", Agency.class);
    public static final Property<Availability> CREW_AVAILABILITY = Property.create("crewAvailability", Availability.class);
    public static final Property<CruiseClass> CRUISE_CLASS = Property.create("cruiseClass", CruiseClass.class);
    public static final Property<List<CruiseContact>> CRUISE_CONTACTS = Property.create("cruiseContacts", List.class);
    public static final Property<List<CruiseCountry>> CRUISE_COUNTRIES = Property.create("cruiseCountries", List.class);
    public static final Property<CruisePolygon> CRUISE_POLYGON = Property.create("cruisePolygon", CruisePolygon.class);
    public static final Property<List<CruiseProgram>> CRUISE_PROGRAMS = Property.create("cruisePrograms", List.class);
    public static final Property<List<CruiseSensorModel>> CRUISE_SENSOR_MODELS = Property.create("cruiseSensorModels", List.class);
    public static final Property<CruiseStatus> CRUISE_STATUS = Property.create("cruiseStatus", CruiseStatus.class);
    public static final Property<CruiseType> CRUISE_TYPE = Property.create("cruiseType", CruiseType.class);
    public static final Property<List<CruiseVariable>> CRUISE_VARIABLES = Property.create("cruiseVariables", List.class);
    public static final Property<Frequency> FREQUENCY = Property.create("frequency", Frequency.class);
    public static final Property<Image> IMAGE = Property.create("image", Image.class);
    public static final Property<Line> LINE = Property.create("line", Line.class);
    public static final Property<List<PtfCruise>> PTF_CRUISES = Property.create("ptfCruises", List.class);
    public static final Property<List<PtfDeployment>> PTF_DEPLOYMENTS = Property.create("ptfDeployments", List.class);
    public static final Property<List<Retrieval>> RETRIEVALS = Property.create("retrievals", List.class);
    public static final Property<List<Section>> SECTIONS = Property.create("sections", List.class);
    public static final Property<List<Service>> SERVICES = Property.create("services", List.class);
    public static final Property<Ship> SHIP = Property.create("ship", Ship.class);
    public static final Property<List<WebFrequentation>> WEB_FREQUENTATIONS = Property.create("webFrequentations", List.class);
    public static final Property<Weblink> WEBLINK = Property.create("weblink", Weblink.class);

    public void setArrivalDate(LocalDateTime arrivalDate) {
        writeProperty("arrivalDate", arrivalDate);
    }
    public LocalDateTime getArrivalDate() {
        return (LocalDateTime)readProperty("arrivalDate");
    }

    public void setAutonomy(int autonomy) {
        writeProperty("autonomy", autonomy);
    }
    public int getAutonomy() {
        Object value = readProperty("autonomy");
        return (value != null) ? (Integer) value : 0;
    }

    public void setCooperations(int cooperations) {
        writeProperty("cooperations", cooperations);
    }
    public int getCooperations() {
        Object value = readProperty("cooperations");
        return (value != null) ? (Integer) value : 0;
    }

    public void setCostMonth(int costMonth) {
        writeProperty("costMonth", costMonth);
    }
    public int getCostMonth() {
        Object value = readProperty("costMonth");
        return (value != null) ? (Integer) value : 0;
    }

    public void setCostUnit(int costUnit) {
        writeProperty("costUnit", costUnit);
    }
    public int getCostUnit() {
        Object value = readProperty("costUnit");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDatesPending(int datesPending) {
        writeProperty("datesPending", datesPending);
    }
    public int getDatesPending() {
        Object value = readProperty("datesPending");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDemobDate(LocalDateTime demobDate) {
        writeProperty("demobDate", demobDate);
    }
    public LocalDateTime getDemobDate() {
        return (LocalDateTime)readProperty("demobDate");
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        writeProperty("departureDate", departureDate);
    }
    public LocalDateTime getDepartureDate() {
        return (LocalDateTime)readProperty("departureDate");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setEmbarkCapacity(int embarkCapacity) {
        writeProperty("embarkCapacity", embarkCapacity);
    }
    public int getEmbarkCapacity() {
        Object value = readProperty("embarkCapacity");
        return (value != null) ? (Integer) value : 0;
    }

    public void setFlexibleRoute(int flexibleRoute) {
        writeProperty("flexibleRoute", flexibleRoute);
    }
    public int getFlexibleRoute() {
        Object value = readProperty("flexibleRoute");
        return (value != null) ? (Integer) value : 0;
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setIioe2Id(String iioe2Id) {
        writeProperty("iioe2Id", iioe2Id);
    }
    public String getIioe2Id() {
        return (String)readProperty("iioe2Id");
    }

    public void setInsertDate(LocalDateTime insertDate) {
        writeProperty("insertDate", insertDate);
    }
    public LocalDateTime getInsertDate() {
        return (LocalDateTime)readProperty("insertDate");
    }

    public void setMobDate(LocalDateTime mobDate) {
        writeProperty("mobDate", mobDate);
    }
    public LocalDateTime getMobDate() {
        return (LocalDateTime)readProperty("mobDate");
    }

    public void setModifDate(LocalDateTime modifDate) {
        writeProperty("modifDate", modifDate);
    }
    public LocalDateTime getModifDate() {
        return (LocalDateTime)readProperty("modifDate");
    }

    public void setNameLong(String nameLong) {
        writeProperty("nameLong", nameLong);
    }
    public String getNameLong() {
        return (String)readProperty("nameLong");
    }

    public void setOperationDate(LocalDateTime operationDate) {
        writeProperty("operationDate", operationDate);
    }
    public LocalDateTime getOperationDate() {
        return (LocalDateTime)readProperty("operationDate");
    }

    public void setProjectName(String projectName) {
        writeProperty("projectName", projectName);
    }
    public String getProjectName() {
        return (String)readProperty("projectName");
    }

    public void setRef(String ref) {
        writeProperty("ref", ref);
    }
    public String getRef() {
        return (String)readProperty("ref");
    }

    public void setRefTmp(String refTmp) {
        writeProperty("refTmp", refTmp);
    }
    public String getRefTmp() {
        return (String)readProperty("refTmp");
    }

    public void setRoutePending(int routePending) {
        writeProperty("routePending", routePending);
    }
    public int getRoutePending() {
        Object value = readProperty("routePending");
        return (value != null) ? (Integer) value : 0;
    }

    public void setRoutePrivate(int routePrivate) {
        writeProperty("routePrivate", routePrivate);
    }
    public int getRoutePrivate() {
        Object value = readProperty("routePrivate");
        return (value != null) ? (Integer) value : 0;
    }

    public void setShape(byte[] shape) {
        writeProperty("shape", shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty("shape");
    }

    public void setShipStop(int shipStop) {
        writeProperty("shipStop", shipStop);
    }
    public int getShipStop() {
        Object value = readProperty("shipStop");
        return (value != null) ? (Integer) value : 0;
    }

    public void setStorageCapacity(int storageCapacity) {
        writeProperty("storageCapacity", storageCapacity);
    }
    public int getStorageCapacity() {
        Object value = readProperty("storageCapacity");
        return (value != null) ? (Integer) value : 0;
    }

    public void setUnolsId(int unolsId) {
        writeProperty("unolsId", unolsId);
    }
    public int getUnolsId() {
        Object value = readProperty("unolsId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime)readProperty("updateDate");
    }

    public void setValidated(int validated) {
        writeProperty("validated", validated);
    }
    public int getValidated() {
        Object value = readProperty("validated");
        return (value != null) ? (Integer) value : 0;
    }

    public void setWkt(String wkt) {
        writeProperty("wkt", wkt);
    }
    public String getWkt() {
        return (String)readProperty("wkt");
    }

    public void setAgency(Agency agency) {
        setToOneTarget("agency", agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty("agency");
    }


    public void setCrewAvailability(Availability crewAvailability) {
        setToOneTarget("crewAvailability", crewAvailability, true);
    }

    public Availability getCrewAvailability() {
        return (Availability)readProperty("crewAvailability");
    }


    public void setCruiseClass(CruiseClass cruiseClass) {
        setToOneTarget("cruiseClass", cruiseClass, true);
    }

    public CruiseClass getCruiseClass() {
        return (CruiseClass)readProperty("cruiseClass");
    }


    public void addToCruiseContacts(CruiseContact obj) {
        addToManyTarget("cruiseContacts", obj, true);
    }
    public void removeFromCruiseContacts(CruiseContact obj) {
        removeToManyTarget("cruiseContacts", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseContact> getCruiseContacts() {
        return (List<CruiseContact>)readProperty("cruiseContacts");
    }


    public void addToCruiseCountries(CruiseCountry obj) {
        addToManyTarget("cruiseCountries", obj, true);
    }
    public void removeFromCruiseCountries(CruiseCountry obj) {
        removeToManyTarget("cruiseCountries", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseCountry> getCruiseCountries() {
        return (List<CruiseCountry>)readProperty("cruiseCountries");
    }


    public void setCruisePolygon(CruisePolygon cruisePolygon) {
        setToOneTarget("cruisePolygon", cruisePolygon, true);
    }

    public CruisePolygon getCruisePolygon() {
        return (CruisePolygon)readProperty("cruisePolygon");
    }


    public void addToCruisePrograms(CruiseProgram obj) {
        addToManyTarget("cruisePrograms", obj, true);
    }
    public void removeFromCruisePrograms(CruiseProgram obj) {
        removeToManyTarget("cruisePrograms", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseProgram> getCruisePrograms() {
        return (List<CruiseProgram>)readProperty("cruisePrograms");
    }


    public void addToCruiseSensorModels(CruiseSensorModel obj) {
        addToManyTarget("cruiseSensorModels", obj, true);
    }
    public void removeFromCruiseSensorModels(CruiseSensorModel obj) {
        removeToManyTarget("cruiseSensorModels", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseSensorModel> getCruiseSensorModels() {
        return (List<CruiseSensorModel>)readProperty("cruiseSensorModels");
    }


    public void setCruiseStatus(CruiseStatus cruiseStatus) {
        setToOneTarget("cruiseStatus", cruiseStatus, true);
    }

    public CruiseStatus getCruiseStatus() {
        return (CruiseStatus)readProperty("cruiseStatus");
    }


    public void setCruiseType(CruiseType cruiseType) {
        setToOneTarget("cruiseType", cruiseType, true);
    }

    public CruiseType getCruiseType() {
        return (CruiseType)readProperty("cruiseType");
    }


    public void addToCruiseVariables(CruiseVariable obj) {
        addToManyTarget("cruiseVariables", obj, true);
    }
    public void removeFromCruiseVariables(CruiseVariable obj) {
        removeToManyTarget("cruiseVariables", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseVariable> getCruiseVariables() {
        return (List<CruiseVariable>)readProperty("cruiseVariables");
    }


    public void setFrequency(Frequency frequency) {
        setToOneTarget("frequency", frequency, true);
    }

    public Frequency getFrequency() {
        return (Frequency)readProperty("frequency");
    }


    public void setImage(Image image) {
        setToOneTarget("image", image, true);
    }

    public Image getImage() {
        return (Image)readProperty("image");
    }


    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
    }


    public void addToPtfCruises(PtfCruise obj) {
        addToManyTarget("ptfCruises", obj, true);
    }
    public void removeFromPtfCruises(PtfCruise obj) {
        removeToManyTarget("ptfCruises", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfCruise> getPtfCruises() {
        return (List<PtfCruise>)readProperty("ptfCruises");
    }


    public void addToPtfDeployments(PtfDeployment obj) {
        addToManyTarget("ptfDeployments", obj, true);
    }
    public void removeFromPtfDeployments(PtfDeployment obj) {
        removeToManyTarget("ptfDeployments", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfDeployment> getPtfDeployments() {
        return (List<PtfDeployment>)readProperty("ptfDeployments");
    }


    public void addToRetrievals(Retrieval obj) {
        addToManyTarget("retrievals", obj, true);
    }
    public void removeFromRetrievals(Retrieval obj) {
        removeToManyTarget("retrievals", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Retrieval> getRetrievals() {
        return (List<Retrieval>)readProperty("retrievals");
    }


    public void addToSections(Section obj) {
        addToManyTarget("sections", obj, true);
    }
    public void removeFromSections(Section obj) {
        removeToManyTarget("sections", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Section> getSections() {
        return (List<Section>)readProperty("sections");
    }


    public void addToServices(Service obj) {
        addToManyTarget("services", obj, true);
    }
    public void removeFromServices(Service obj) {
        removeToManyTarget("services", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Service> getServices() {
        return (List<Service>)readProperty("services");
    }


    public void setShip(Ship ship) {
        setToOneTarget("ship", ship, true);
    }

    public Ship getShip() {
        return (Ship)readProperty("ship");
    }


    public void addToWebFrequentations(WebFrequentation obj) {
        addToManyTarget("webFrequentations", obj, true);
    }
    public void removeFromWebFrequentations(WebFrequentation obj) {
        removeToManyTarget("webFrequentations", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<WebFrequentation> getWebFrequentations() {
        return (List<WebFrequentation>)readProperty("webFrequentations");
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget("weblink", weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty("weblink");
    }


}