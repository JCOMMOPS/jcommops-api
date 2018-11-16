package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _MasterProg was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MasterProg extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DATA = Property.create("data", String.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<String> OBJECTIVES = Property.create("objectives", String.class);
    public static final Property<String> OLD_SITE_HOMEPAGE = Property.create("oldSiteHomepage", String.class);
    public static final Property<String> ORIGINS = Property.create("origins", String.class);
    public static final Property<String> OVERVIEW = Property.create("overview", String.class);
    public static final Property<String> PEOPLE = Property.create("people", String.class);
    public static final Property<String> TECH = Property.create("tech", String.class);
    public static final Property<List<AgencyDacType>> AGENCY_DAC_TYPES = Property.create("agencyDacTypes", List.class);
    public static final Property<List<Doc>> DOCS = Property.create("docs", List.class);
    public static final Property<List<Image>> IMAGES = Property.create("images", List.class);
    public static final Property<List<Indicator>> INDICATORS = Property.create("indicators", List.class);
    public static final Property<List<MapTypeMasterProg>> MAP_TYPE_MASTER_PROGS = Property.create("mapTypeMasterProgs", List.class);
    public static final Property<List<MasterProgContact>> MASTER_PROG_CONTACTS = Property.create("masterProgContacts", List.class);
    public static final Property<List<Network>> NETWORKS = Property.create("networks", List.class);
    public static final Property<List<Program>> PROGRAMS = Property.create("programs", List.class);
    public static final Property<List<PtfModel>> PTF_MODELS = Property.create("ptfModels", List.class);
    public static final Property<List<SensorModel>> SENSOR_MODELS = Property.create("sensorModels", List.class);
    public static final Property<List<Site>> SITES = Property.create("sites", List.class);
    public static final Property<List<Survey>> SURVEYS = Property.create("surveys", List.class);
    public static final Property<List<UserGroup>> USER_GROUPS = Property.create("userGroups", List.class);
    public static final Property<WebMetricMasterProg> WEB_METRIC_MASTER_PROG = Property.create("webMetricMasterProg", WebMetricMasterProg.class);
    public static final Property<List<Weblink>> WEBLINKS = Property.create("weblinks", List.class);

    public void setData(String data) {
        writeProperty("data", data);
    }
    public String getData() {
        return (String)readProperty("data");
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

    public void setObjectives(String objectives) {
        writeProperty("objectives", objectives);
    }
    public String getObjectives() {
        return (String)readProperty("objectives");
    }

    public void setOldSiteHomepage(String oldSiteHomepage) {
        writeProperty("oldSiteHomepage", oldSiteHomepage);
    }
    public String getOldSiteHomepage() {
        return (String)readProperty("oldSiteHomepage");
    }

    public void setOrigins(String origins) {
        writeProperty("origins", origins);
    }
    public String getOrigins() {
        return (String)readProperty("origins");
    }

    public void setOverview(String overview) {
        writeProperty("overview", overview);
    }
    public String getOverview() {
        return (String)readProperty("overview");
    }

    public void setPeople(String people) {
        writeProperty("people", people);
    }
    public String getPeople() {
        return (String)readProperty("people");
    }

    public void setTech(String tech) {
        writeProperty("tech", tech);
    }
    public String getTech() {
        return (String)readProperty("tech");
    }

    public void addToAgencyDacTypes(AgencyDacType obj) {
        addToManyTarget("agencyDacTypes", obj, true);
    }
    public void removeFromAgencyDacTypes(AgencyDacType obj) {
        removeToManyTarget("agencyDacTypes", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<AgencyDacType> getAgencyDacTypes() {
        return (List<AgencyDacType>)readProperty("agencyDacTypes");
    }


    public void addToDocs(Doc obj) {
        addToManyTarget("docs", obj, true);
    }
    public void removeFromDocs(Doc obj) {
        removeToManyTarget("docs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Doc> getDocs() {
        return (List<Doc>)readProperty("docs");
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


    public void addToIndicators(Indicator obj) {
        addToManyTarget("indicators", obj, true);
    }
    public void removeFromIndicators(Indicator obj) {
        removeToManyTarget("indicators", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Indicator> getIndicators() {
        return (List<Indicator>)readProperty("indicators");
    }


    public void addToMapTypeMasterProgs(MapTypeMasterProg obj) {
        addToManyTarget("mapTypeMasterProgs", obj, true);
    }
    public void removeFromMapTypeMasterProgs(MapTypeMasterProg obj) {
        removeToManyTarget("mapTypeMasterProgs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<MapTypeMasterProg> getMapTypeMasterProgs() {
        return (List<MapTypeMasterProg>)readProperty("mapTypeMasterProgs");
    }


    public void addToMasterProgContacts(MasterProgContact obj) {
        addToManyTarget("masterProgContacts", obj, true);
    }
    public void removeFromMasterProgContacts(MasterProgContact obj) {
        removeToManyTarget("masterProgContacts", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<MasterProgContact> getMasterProgContacts() {
        return (List<MasterProgContact>)readProperty("masterProgContacts");
    }


    public void addToNetworks(Network obj) {
        addToManyTarget("networks", obj, true);
    }
    public void removeFromNetworks(Network obj) {
        removeToManyTarget("networks", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Network> getNetworks() {
        return (List<Network>)readProperty("networks");
    }


    public void addToPrograms(Program obj) {
        addToManyTarget("programs", obj, true);
    }
    public void removeFromPrograms(Program obj) {
        removeToManyTarget("programs", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Program> getPrograms() {
        return (List<Program>)readProperty("programs");
    }


    public void addToPtfModels(PtfModel obj) {
        addToManyTarget("ptfModels", obj, true);
    }
    public void removeFromPtfModels(PtfModel obj) {
        removeToManyTarget("ptfModels", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfModel> getPtfModels() {
        return (List<PtfModel>)readProperty("ptfModels");
    }


    public void addToSensorModels(SensorModel obj) {
        addToManyTarget("sensorModels", obj, true);
    }
    public void removeFromSensorModels(SensorModel obj) {
        removeToManyTarget("sensorModels", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorModel> getSensorModels() {
        return (List<SensorModel>)readProperty("sensorModels");
    }


    public void addToSites(Site obj) {
        addToManyTarget("sites", obj, true);
    }
    public void removeFromSites(Site obj) {
        removeToManyTarget("sites", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Site> getSites() {
        return (List<Site>)readProperty("sites");
    }


    public void addToSurveys(Survey obj) {
        addToManyTarget("surveys", obj, true);
    }
    public void removeFromSurveys(Survey obj) {
        removeToManyTarget("surveys", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Survey> getSurveys() {
        return (List<Survey>)readProperty("surveys");
    }


    public void addToUserGroups(UserGroup obj) {
        addToManyTarget("userGroups", obj, true);
    }
    public void removeFromUserGroups(UserGroup obj) {
        removeToManyTarget("userGroups", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroup> getUserGroups() {
        return (List<UserGroup>)readProperty("userGroups");
    }


    public void setWebMetricMasterProg(WebMetricMasterProg webMetricMasterProg) {
        setToOneTarget("webMetricMasterProg", webMetricMasterProg, true);
    }

    public WebMetricMasterProg getWebMetricMasterProg() {
        return (WebMetricMasterProg)readProperty("webMetricMasterProg");
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
