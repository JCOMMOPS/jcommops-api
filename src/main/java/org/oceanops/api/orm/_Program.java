package org.oceanops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Program was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Program extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ACTIVE = Property.create("active", Integer.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<String> WIGOS_CODE = Property.create("wigosCode", String.class);
    public static final Property<List<Agency>> AGENCIES = Property.create("agencies", List.class);
    public static final Property<Country> COUNTRY = Property.create("country", Country.class);
    public static final Property<List<CruiseProgram>> CRUISE_PROGRAMS = Property.create("cruisePrograms", List.class);
    public static final Property<List<Image>> IMAGES = Property.create("images", List.class);
    public static final Property<List<LineProgram>> LINE_PROGRAMS = Property.create("linePrograms", List.class);
    public static final Property<List<NcSubscription>> NC_SUBSCRIPTIONS = Property.create("ncSubscriptions", List.class);
    public static final Property<Network> NETWORK = Property.create("network", Network.class);
    public static final Property<List<ProgramAgency>> PROGRAM_AGENCIES = Property.create("programAgencies", List.class);
    public static final Property<List<ProgramContact>> PROGRAM_CONTACTS = Property.create("programContacts", List.class);
    public static final Property<List<PtfSensorModel>> PTF_SENSOR_MODELS = Property.create("ptfSensorModels", List.class);
    public static final Property<List<Ptf>> PTFS = Property.create("ptfs", List.class);
    public static final Property<List<ShipRecruitment>> SHIP_RECRUITMENTS = Property.create("shipRecruitments", List.class);
    public static final Property<List<Weblink>> WEBLINKS = Property.create("weblinks", List.class);

    public void setActive(int active) {
        writeProperty("active", active);
    }
    public int getActive() {
        Object value = readProperty("active");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setNameShort(String nameShort) {
        writeProperty("nameShort", nameShort);
    }
    public String getNameShort() {
        return (String)readProperty("nameShort");
    }

    public void setWigosCode(String wigosCode) {
        writeProperty("wigosCode", wigosCode);
    }
    public String getWigosCode() {
        return (String)readProperty("wigosCode");
    }

    public void addToAgencies(Agency obj) {
        addToManyTarget("agencies", obj, true);
    }
    public void removeFromAgencies(Agency obj) {
        removeToManyTarget("agencies", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Agency> getAgencies() {
        return (List<Agency>)readProperty("agencies");
    }


    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
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


    public void addToImages(Image obj) {
        addToManyTarget("images", obj, true);
    }
    public void removeFromImages(Image obj) {
        removeToManyTarget("images", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Image> getImages() {
        return (List<Image>)readProperty("images");
    }


    public void addToLinePrograms(LineProgram obj) {
        addToManyTarget("linePrograms", obj, true);
    }
    public void removeFromLinePrograms(LineProgram obj) {
        removeToManyTarget("linePrograms", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<LineProgram> getLinePrograms() {
        return (List<LineProgram>)readProperty("linePrograms");
    }


    public void addToNcSubscriptions(NcSubscription obj) {
        addToManyTarget("ncSubscriptions", obj, true);
    }
    public void removeFromNcSubscriptions(NcSubscription obj) {
        removeToManyTarget("ncSubscriptions", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NcSubscription> getNcSubscriptions() {
        return (List<NcSubscription>)readProperty("ncSubscriptions");
    }


    public void setNetwork(Network network) {
        setToOneTarget("network", network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty("network");
    }


    public void addToProgramAgencies(ProgramAgency obj) {
        addToManyTarget("programAgencies", obj, true);
    }
    public void removeFromProgramAgencies(ProgramAgency obj) {
        removeToManyTarget("programAgencies", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ProgramAgency> getProgramAgencies() {
        return (List<ProgramAgency>)readProperty("programAgencies");
    }


    public void addToProgramContacts(ProgramContact obj) {
        addToManyTarget("programContacts", obj, true);
    }
    public void removeFromProgramContacts(ProgramContact obj) {
        removeToManyTarget("programContacts", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ProgramContact> getProgramContacts() {
        return (List<ProgramContact>)readProperty("programContacts");
    }


    public void addToPtfSensorModels(PtfSensorModel obj) {
        addToManyTarget("ptfSensorModels", obj, true);
    }
    public void removeFromPtfSensorModels(PtfSensorModel obj) {
        removeToManyTarget("ptfSensorModels", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfSensorModel> getPtfSensorModels() {
        return (List<PtfSensorModel>)readProperty("ptfSensorModels");
    }


    public void addToPtfs(Ptf obj) {
        addToManyTarget("ptfs", obj, true);
    }
    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget("ptfs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty("ptfs");
    }


    public void addToShipRecruitments(ShipRecruitment obj) {
        addToManyTarget("shipRecruitments", obj, true);
    }
    public void removeFromShipRecruitments(ShipRecruitment obj) {
        removeToManyTarget("shipRecruitments", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ShipRecruitment> getShipRecruitments() {
        return (List<ShipRecruitment>)readProperty("shipRecruitments");
    }


    public void addToWeblinks(Weblink obj) {
        addToManyTarget("weblinks", obj, true);
    }
    public void removeFromWeblinks(Weblink obj) {
        removeToManyTarget("weblinks", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Weblink> getWeblinks() {
        return (List<Weblink>)readProperty("weblinks");
    }


}