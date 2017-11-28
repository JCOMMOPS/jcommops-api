package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Agency was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Agency extends CayenneDataObject {

    public static final String ADDRESS_PROPERTY = "address";
    public static final String DEPLOYER_PROPERTY = "deployer";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FAX_PROPERTY = "fax";
    public static final String ID_PROPERTY = "id";
    public static final String MANUF_PROPERTY = "manuf";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String PURCHASER_PROPERTY = "purchaser";
    public static final String REF_PROPERTY = "ref";
    public static final String SHAPE_PROPERTY = "shape";
    public static final String TEL_PROPERTY = "tel";
    public static final String AGENCY_DAC_TYPES_PROPERTY = "agencyDacTypes";
    public static final String AGENCY_PTFS_PROPERTY = "agencyPtfs";
    public static final String CONTACTS_PROPERTY = "contacts";
    public static final String COUNTRY_PROPERTY = "country";
    public static final String CRUISES_PROPERTY = "cruises";
    public static final String GTS_CCCCS_PROPERTY = "gtsCcccs";
    public static final String IMAGE_PROPERTY = "image";
    public static final String IMAGES_PROPERTY = "images";
    public static final String OBSS_PROPERTY = "obss";
    public static final String OBSS1_PROPERTY = "obss1";
    public static final String PROGRAM_AGENCIES_PROPERTY = "programAgencies";
    public static final String PTF_FIRMWARES_PROPERTY = "ptfFirmwares";
    public static final String PTF_HULL_TYPES_PROPERTY = "ptfHullTypes";
    public static final String PTF_MODELS_PROPERTY = "ptfModels";
    public static final String QC_FEEDBACKS_PROPERTY = "qcFeedbacks";
    public static final String SENSOR_MODELS_PROPERTY = "sensorModels";
    public static final String SERVICES_PROPERTY = "services";
    public static final String USER_GROUP_AGENCIES_PROPERTY = "userGroupAgencies";
    public static final String WEBLINK_PROPERTY = "weblink";

    public static final String ID_PK_COLUMN = "ID";

    public void setAddress(String address) {
        writeProperty(ADDRESS_PROPERTY, address);
    }
    public String getAddress() {
        return (String)readProperty(ADDRESS_PROPERTY);
    }

    public void setDeployer(Integer deployer) {
        writeProperty(DEPLOYER_PROPERTY, deployer);
    }
    public Integer getDeployer() {
        return (Integer)readProperty(DEPLOYER_PROPERTY);
    }

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setEmail(String email) {
        writeProperty(EMAIL_PROPERTY, email);
    }
    public String getEmail() {
        return (String)readProperty(EMAIL_PROPERTY);
    }

    public void setFax(String fax) {
        writeProperty(FAX_PROPERTY, fax);
    }
    public String getFax() {
        return (String)readProperty(FAX_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setManuf(Integer manuf) {
        writeProperty(MANUF_PROPERTY, manuf);
    }
    public Integer getManuf() {
        return (Integer)readProperty(MANUF_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void setPurchaser(Integer purchaser) {
        writeProperty(PURCHASER_PROPERTY, purchaser);
    }
    public Integer getPurchaser() {
        return (Integer)readProperty(PURCHASER_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

    public void setShape(byte[] shape) {
        writeProperty(SHAPE_PROPERTY, shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty(SHAPE_PROPERTY);
    }

    public void setTel(String tel) {
        writeProperty(TEL_PROPERTY, tel);
    }
    public String getTel() {
        return (String)readProperty(TEL_PROPERTY);
    }

    public void addToAgencyDacTypes(AgencyDacType obj) {
        addToManyTarget(AGENCY_DAC_TYPES_PROPERTY, obj, true);
    }
    public void removeFromAgencyDacTypes(AgencyDacType obj) {
        removeToManyTarget(AGENCY_DAC_TYPES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<AgencyDacType> getAgencyDacTypes() {
        return (List<AgencyDacType>)readProperty(AGENCY_DAC_TYPES_PROPERTY);
    }


    public void addToAgencyPtfs(AgencyPtf obj) {
        addToManyTarget(AGENCY_PTFS_PROPERTY, obj, true);
    }
    public void removeFromAgencyPtfs(AgencyPtf obj) {
        removeToManyTarget(AGENCY_PTFS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<AgencyPtf> getAgencyPtfs() {
        return (List<AgencyPtf>)readProperty(AGENCY_PTFS_PROPERTY);
    }


    public void addToContacts(Contact obj) {
        addToManyTarget(CONTACTS_PROPERTY, obj, true);
    }
    public void removeFromContacts(Contact obj) {
        removeToManyTarget(CONTACTS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Contact> getContacts() {
        return (List<Contact>)readProperty(CONTACTS_PROPERTY);
    }


    public void setCountry(Country country) {
        setToOneTarget(COUNTRY_PROPERTY, country, true);
    }

    public Country getCountry() {
        return (Country)readProperty(COUNTRY_PROPERTY);
    }


    public void addToCruises(Cruise obj) {
        addToManyTarget(CRUISES_PROPERTY, obj, true);
    }
    public void removeFromCruises(Cruise obj) {
        removeToManyTarget(CRUISES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cruise> getCruises() {
        return (List<Cruise>)readProperty(CRUISES_PROPERTY);
    }


    public void addToGtsCcccs(GtsCccc obj) {
        addToManyTarget(GTS_CCCCS_PROPERTY, obj, true);
    }
    public void removeFromGtsCcccs(GtsCccc obj) {
        removeToManyTarget(GTS_CCCCS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<GtsCccc> getGtsCcccs() {
        return (List<GtsCccc>)readProperty(GTS_CCCCS_PROPERTY);
    }


    public void setImage(Image image) {
        setToOneTarget(IMAGE_PROPERTY, image, true);
    }

    public Image getImage() {
        return (Image)readProperty(IMAGE_PROPERTY);
    }


    public void addToImages(Image obj) {
        addToManyTarget(IMAGES_PROPERTY, obj, true);
    }
    public void removeFromImages(Image obj) {
        removeToManyTarget(IMAGES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Image> getImages() {
        return (List<Image>)readProperty(IMAGES_PROPERTY);
    }


    public void addToObss(Obs obj) {
        addToManyTarget(OBSS_PROPERTY, obj, true);
    }
    public void removeFromObss(Obs obj) {
        removeToManyTarget(OBSS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Obs> getObss() {
        return (List<Obs>)readProperty(OBSS_PROPERTY);
    }


    public void addToObss1(Obs obj) {
        addToManyTarget(OBSS1_PROPERTY, obj, true);
    }
    public void removeFromObss1(Obs obj) {
        removeToManyTarget(OBSS1_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Obs> getObss1() {
        return (List<Obs>)readProperty(OBSS1_PROPERTY);
    }


    public void addToProgramAgencies(ProgramAgency obj) {
        addToManyTarget(PROGRAM_AGENCIES_PROPERTY, obj, true);
    }
    public void removeFromProgramAgencies(ProgramAgency obj) {
        removeToManyTarget(PROGRAM_AGENCIES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ProgramAgency> getProgramAgencies() {
        return (List<ProgramAgency>)readProperty(PROGRAM_AGENCIES_PROPERTY);
    }


    public void addToPtfFirmwares(PtfFirmware obj) {
        addToManyTarget(PTF_FIRMWARES_PROPERTY, obj, true);
    }
    public void removeFromPtfFirmwares(PtfFirmware obj) {
        removeToManyTarget(PTF_FIRMWARES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfFirmware> getPtfFirmwares() {
        return (List<PtfFirmware>)readProperty(PTF_FIRMWARES_PROPERTY);
    }


    public void addToPtfHullTypes(PtfHullType obj) {
        addToManyTarget(PTF_HULL_TYPES_PROPERTY, obj, true);
    }
    public void removeFromPtfHullTypes(PtfHullType obj) {
        removeToManyTarget(PTF_HULL_TYPES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfHullType> getPtfHullTypes() {
        return (List<PtfHullType>)readProperty(PTF_HULL_TYPES_PROPERTY);
    }


    public void addToPtfModels(PtfModel obj) {
        addToManyTarget(PTF_MODELS_PROPERTY, obj, true);
    }
    public void removeFromPtfModels(PtfModel obj) {
        removeToManyTarget(PTF_MODELS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PtfModel> getPtfModels() {
        return (List<PtfModel>)readProperty(PTF_MODELS_PROPERTY);
    }


    public void addToQcFeedbacks(QcFeedback obj) {
        addToManyTarget(QC_FEEDBACKS_PROPERTY, obj, true);
    }
    public void removeFromQcFeedbacks(QcFeedback obj) {
        removeToManyTarget(QC_FEEDBACKS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbacks() {
        return (List<QcFeedback>)readProperty(QC_FEEDBACKS_PROPERTY);
    }


    public void addToSensorModels(SensorModel obj) {
        addToManyTarget(SENSOR_MODELS_PROPERTY, obj, true);
    }
    public void removeFromSensorModels(SensorModel obj) {
        removeToManyTarget(SENSOR_MODELS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SensorModel> getSensorModels() {
        return (List<SensorModel>)readProperty(SENSOR_MODELS_PROPERTY);
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


    public void addToUserGroupAgencies(UserGroupAgency obj) {
        addToManyTarget(USER_GROUP_AGENCIES_PROPERTY, obj, true);
    }
    public void removeFromUserGroupAgencies(UserGroupAgency obj) {
        removeToManyTarget(USER_GROUP_AGENCIES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UserGroupAgency> getUserGroupAgencies() {
        return (List<UserGroupAgency>)readProperty(USER_GROUP_AGENCIES_PROPERTY);
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget(WEBLINK_PROPERTY, weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty(WEBLINK_PROPERTY);
    }


}
