package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.ContactPtfRole;
import org.oceanops.api.orm.ContactSiteRole;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.CruiseContact;
import org.oceanops.api.orm.DocContact;
import org.oceanops.api.orm.Image;
import org.oceanops.api.orm.Meeting;
import org.oceanops.api.orm.NcNotification;
import org.oceanops.api.orm.NcSubscription;
import org.oceanops.api.orm.NetworkContact;
import org.oceanops.api.orm.ProgramContact;
import org.oceanops.api.orm.PtfDeployment;
import org.oceanops.api.orm.PtfModel;
import org.oceanops.api.orm.Service;
import org.oceanops.api.orm.TelecomFormat;
import org.oceanops.api.orm.UserGroupContact;
import org.oceanops.api.orm.WebConnection;
import org.oceanops.api.orm.WebContactModule;
import org.oceanops.api.orm.WebContactPreferences;
import org.oceanops.api.orm.WebFrequentation;
import org.oceanops.api.orm.WebQuery;
import org.oceanops.api.orm.WebWorkspace;
import org.oceanops.api.orm.Weblink;

/**
 * Class _Contact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contact extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> ADDRESS = PropertyFactory.createString("address", String.class);
    public static final NumericProperty<BigDecimal> ADMIN = PropertyFactory.createNumeric("admin", BigDecimal.class);
    public static final StringProperty<String> EMAIL = PropertyFactory.createString("email", String.class);
    public static final StringProperty<String> EMAIL2 = PropertyFactory.createString("email2", String.class);
    public static final StringProperty<String> EMAIL_PUBLIC = PropertyFactory.createString("emailPublic", String.class);
    public static final StringProperty<String> FAX = PropertyFactory.createString("fax", String.class);
    public static final StringProperty<String> FIRST_NAME = PropertyFactory.createString("firstName", String.class);
    public static final NumericProperty<BigDecimal> GREETINGS = PropertyFactory.createNumeric("greetings", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> IS_PRIVATE = PropertyFactory.createNumeric("isPrivate", BigDecimal.class);
    public static final StringProperty<String> LAST_NAME = PropertyFactory.createString("lastName", String.class);
    public static final DateProperty<LocalDateTime> LAST_UPDATE = PropertyFactory.createDate("lastUpdate", LocalDateTime.class);
    public static final StringProperty<String> LOGIN = PropertyFactory.createString("login", String.class);
    public static final StringProperty<String> ORCID = PropertyFactory.createString("orcid", String.class);
    public static final StringProperty<String> PASSWD = PropertyFactory.createString("passwd", String.class);
    public static final StringProperty<String> TEL = PropertyFactory.createString("tel", String.class);
    public static final StringProperty<String> TEL2 = PropertyFactory.createString("tel2", String.class);
    public static final StringProperty<String> TITLE = PropertyFactory.createString("title", String.class);
    public static final EntityProperty<Agency> AGENCY = PropertyFactory.createEntity("agency", Agency.class);
    public static final ListProperty<ContactPtfRole> CONTACT_PTF_ROLES = PropertyFactory.createList("contactPtfRoles", ContactPtfRole.class);
    public static final ListProperty<ContactSiteRole> CONTACT_SITE_ROLES = PropertyFactory.createList("contactSiteRoles", ContactSiteRole.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final ListProperty<CruiseContact> CRUISE_CONTACTS = PropertyFactory.createList("cruiseContacts", CruiseContact.class);
    public static final ListProperty<DocContact> DOC_CONTACTS = PropertyFactory.createList("docContacts", DocContact.class);
    public static final EntityProperty<Image> IMAGE = PropertyFactory.createEntity("image", Image.class);
    public static final ListProperty<Meeting> MEETINGS = PropertyFactory.createList("meetings", Meeting.class);
    public static final ListProperty<NcNotification> NC_NOTIFICATIONS = PropertyFactory.createList("ncNotifications", NcNotification.class);
    public static final ListProperty<NcSubscription> NC_SUBSCRIPTIONS = PropertyFactory.createList("ncSubscriptions", NcSubscription.class);
    public static final ListProperty<NetworkContact> NETWORK_CONTACTS = PropertyFactory.createList("networkContacts", NetworkContact.class);
    public static final ListProperty<ProgramContact> PROGRAM_CONTACTS = PropertyFactory.createList("programContacts", ProgramContact.class);
    public static final ListProperty<PtfDeployment> PTF_DEPLOYMENTS = PropertyFactory.createList("ptfDeployments", PtfDeployment.class);
    public static final ListProperty<PtfModel> PTF_MODELS = PropertyFactory.createList("ptfModels", PtfModel.class);
    public static final ListProperty<Service> SERVICES = PropertyFactory.createList("services", Service.class);
    public static final ListProperty<TelecomFormat> TELECOM_FORMATS = PropertyFactory.createList("telecomFormats", TelecomFormat.class);
    public static final ListProperty<UserGroupContact> USER_GROUP_CONTACTS = PropertyFactory.createList("userGroupContacts", UserGroupContact.class);
    public static final ListProperty<WebConnection> WEB_CONNECTIONS = PropertyFactory.createList("webConnections", WebConnection.class);
    public static final ListProperty<WebContactModule> WEB_CONTACT_MODULES = PropertyFactory.createList("webContactModules", WebContactModule.class);
    public static final EntityProperty<WebContactPreferences> WEB_CONTACT_PREFERENCES = PropertyFactory.createEntity("webContactPreferences", WebContactPreferences.class);
    public static final ListProperty<WebFrequentation> WEB_FREQUENTATIONS = PropertyFactory.createList("webFrequentations", WebFrequentation.class);
    public static final ListProperty<WebQuery> WEB_QUERIES = PropertyFactory.createList("webQueries", WebQuery.class);
    public static final ListProperty<WebWorkspace> WEB_WORKSPACES = PropertyFactory.createList("webWorkspaces", WebWorkspace.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected String address;
    protected BigDecimal admin;
    protected String email;
    protected String email2;
    protected String emailPublic;
    protected String fax;
    protected String firstName;
    protected BigDecimal greetings;
    protected BigDecimal id;
    protected BigDecimal isPrivate;
    protected String lastName;
    protected LocalDateTime lastUpdate;
    protected String login;
    protected String orcid;
    protected String passwd;
    protected String tel;
    protected String tel2;
    protected String title;

    protected Object agency;
    protected Object contactPtfRoles;
    protected Object contactSiteRoles;
    protected Object country;
    protected Object cruiseContacts;
    protected Object docContacts;
    protected Object image;
    protected Object meetings;
    protected Object ncNotifications;
    protected Object ncSubscriptions;
    protected Object networkContacts;
    protected Object programContacts;
    protected Object ptfDeployments;
    protected Object ptfModels;
    protected Object services;
    protected Object telecomFormats;
    protected Object userGroupContacts;
    protected Object webConnections;
    protected Object webContactModules;
    protected Object webContactPreferences;
    protected Object webFrequentations;
    protected Object webQueries;
    protected Object webWorkspaces;
    protected Object weblink;

    public void setAddress(String address) {
        beforePropertyWrite("address", this.address, address);
        this.address = address;
    }

    public String getAddress() {
        beforePropertyRead("address");
        return this.address;
    }

    public void setAdmin(BigDecimal admin) {
        beforePropertyWrite("admin", this.admin, admin);
        this.admin = admin;
    }

    public BigDecimal getAdmin() {
        beforePropertyRead("admin");
        return this.admin;
    }

    public void setEmail(String email) {
        beforePropertyWrite("email", this.email, email);
        this.email = email;
    }

    public String getEmail() {
        beforePropertyRead("email");
        return this.email;
    }

    public void setEmail2(String email2) {
        beforePropertyWrite("email2", this.email2, email2);
        this.email2 = email2;
    }

    public String getEmail2() {
        beforePropertyRead("email2");
        return this.email2;
    }

    public void setEmailPublic(String emailPublic) {
        beforePropertyWrite("emailPublic", this.emailPublic, emailPublic);
        this.emailPublic = emailPublic;
    }

    public String getEmailPublic() {
        beforePropertyRead("emailPublic");
        return this.emailPublic;
    }

    public void setFax(String fax) {
        beforePropertyWrite("fax", this.fax, fax);
        this.fax = fax;
    }

    public String getFax() {
        beforePropertyRead("fax");
        return this.fax;
    }

    public void setFirstName(String firstName) {
        beforePropertyWrite("firstName", this.firstName, firstName);
        this.firstName = firstName;
    }

    public String getFirstName() {
        beforePropertyRead("firstName");
        return this.firstName;
    }

    public void setGreetings(BigDecimal greetings) {
        beforePropertyWrite("greetings", this.greetings, greetings);
        this.greetings = greetings;
    }

    public BigDecimal getGreetings() {
        beforePropertyRead("greetings");
        return this.greetings;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setIsPrivate(BigDecimal isPrivate) {
        beforePropertyWrite("isPrivate", this.isPrivate, isPrivate);
        this.isPrivate = isPrivate;
    }

    public BigDecimal getIsPrivate() {
        beforePropertyRead("isPrivate");
        return this.isPrivate;
    }

    public void setLastName(String lastName) {
        beforePropertyWrite("lastName", this.lastName, lastName);
        this.lastName = lastName;
    }

    public String getLastName() {
        beforePropertyRead("lastName");
        return this.lastName;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        beforePropertyWrite("lastUpdate", this.lastUpdate, lastUpdate);
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getLastUpdate() {
        beforePropertyRead("lastUpdate");
        return this.lastUpdate;
    }

    public void setLogin(String login) {
        beforePropertyWrite("login", this.login, login);
        this.login = login;
    }

    public String getLogin() {
        beforePropertyRead("login");
        return this.login;
    }

    public void setOrcid(String orcid) {
        beforePropertyWrite("orcid", this.orcid, orcid);
        this.orcid = orcid;
    }

    public String getOrcid() {
        beforePropertyRead("orcid");
        return this.orcid;
    }

    public void setPasswd(String passwd) {
        beforePropertyWrite("passwd", this.passwd, passwd);
        this.passwd = passwd;
    }

    public String getPasswd() {
        beforePropertyRead("passwd");
        return this.passwd;
    }

    public void setTel(String tel) {
        beforePropertyWrite("tel", this.tel, tel);
        this.tel = tel;
    }

    public String getTel() {
        beforePropertyRead("tel");
        return this.tel;
    }

    public void setTel2(String tel2) {
        beforePropertyWrite("tel2", this.tel2, tel2);
        this.tel2 = tel2;
    }

    public String getTel2() {
        beforePropertyRead("tel2");
        return this.tel2;
    }

    public void setTitle(String title) {
        beforePropertyWrite("title", this.title, title);
        this.title = title;
    }

    public String getTitle() {
        beforePropertyRead("title");
        return this.title;
    }

    public void setAgency(Agency agency) {
        setToOneTarget("agency", agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty("agency");
    }

    public void addToContactPtfRoles(ContactPtfRole obj) {
        addToManyTarget("contactPtfRoles", obj, true);
    }

    public void removeFromContactPtfRoles(ContactPtfRole obj) {
        removeToManyTarget("contactPtfRoles", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ContactPtfRole> getContactPtfRoles() {
        return (List<ContactPtfRole>)readProperty("contactPtfRoles");
    }

    public void addToContactSiteRoles(ContactSiteRole obj) {
        addToManyTarget("contactSiteRoles", obj, true);
    }

    public void removeFromContactSiteRoles(ContactSiteRole obj) {
        removeToManyTarget("contactSiteRoles", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ContactSiteRole> getContactSiteRoles() {
        return (List<ContactSiteRole>)readProperty("contactSiteRoles");
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
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

    public void addToDocContacts(DocContact obj) {
        addToManyTarget("docContacts", obj, true);
    }

    public void removeFromDocContacts(DocContact obj) {
        removeToManyTarget("docContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<DocContact> getDocContacts() {
        return (List<DocContact>)readProperty("docContacts");
    }

    public void setImage(Image image) {
        setToOneTarget("image", image, true);
    }

    public Image getImage() {
        return (Image)readProperty("image");
    }

    public void addToMeetings(Meeting obj) {
        addToManyTarget("meetings", obj, true);
    }

    public void removeFromMeetings(Meeting obj) {
        removeToManyTarget("meetings", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Meeting> getMeetings() {
        return (List<Meeting>)readProperty("meetings");
    }

    public void addToNcNotifications(NcNotification obj) {
        addToManyTarget("ncNotifications", obj, true);
    }

    public void removeFromNcNotifications(NcNotification obj) {
        removeToManyTarget("ncNotifications", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<NcNotification> getNcNotifications() {
        return (List<NcNotification>)readProperty("ncNotifications");
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

    public void addToNetworkContacts(NetworkContact obj) {
        addToManyTarget("networkContacts", obj, true);
    }

    public void removeFromNetworkContacts(NetworkContact obj) {
        removeToManyTarget("networkContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<NetworkContact> getNetworkContacts() {
        return (List<NetworkContact>)readProperty("networkContacts");
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

    public void addToTelecomFormats(TelecomFormat obj) {
        addToManyTarget("telecomFormats", obj, true);
    }

    public void removeFromTelecomFormats(TelecomFormat obj) {
        removeToManyTarget("telecomFormats", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<TelecomFormat> getTelecomFormats() {
        return (List<TelecomFormat>)readProperty("telecomFormats");
    }

    public void addToUserGroupContacts(UserGroupContact obj) {
        addToManyTarget("userGroupContacts", obj, true);
    }

    public void removeFromUserGroupContacts(UserGroupContact obj) {
        removeToManyTarget("userGroupContacts", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<UserGroupContact> getUserGroupContacts() {
        return (List<UserGroupContact>)readProperty("userGroupContacts");
    }

    public void addToWebConnections(WebConnection obj) {
        addToManyTarget("webConnections", obj, true);
    }

    public void removeFromWebConnections(WebConnection obj) {
        removeToManyTarget("webConnections", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WebConnection> getWebConnections() {
        return (List<WebConnection>)readProperty("webConnections");
    }

    public void addToWebContactModules(WebContactModule obj) {
        addToManyTarget("webContactModules", obj, true);
    }

    public void removeFromWebContactModules(WebContactModule obj) {
        removeToManyTarget("webContactModules", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WebContactModule> getWebContactModules() {
        return (List<WebContactModule>)readProperty("webContactModules");
    }

    public void setWebContactPreferences(WebContactPreferences webContactPreferences) {
        setToOneTarget("webContactPreferences", webContactPreferences, true);
    }

    public WebContactPreferences getWebContactPreferences() {
        return (WebContactPreferences)readProperty("webContactPreferences");
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

    public void addToWebQueries(WebQuery obj) {
        addToManyTarget("webQueries", obj, true);
    }

    public void removeFromWebQueries(WebQuery obj) {
        removeToManyTarget("webQueries", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WebQuery> getWebQueries() {
        return (List<WebQuery>)readProperty("webQueries");
    }

    public void addToWebWorkspaces(WebWorkspace obj) {
        addToManyTarget("webWorkspaces", obj, true);
    }

    public void removeFromWebWorkspaces(WebWorkspace obj) {
        removeToManyTarget("webWorkspaces", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<WebWorkspace> getWebWorkspaces() {
        return (List<WebWorkspace>)readProperty("webWorkspaces");
    }

    public void setWeblink(Weblink weblink) {
        setToOneTarget("weblink", weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty("weblink");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "address":
                return this.address;
            case "admin":
                return this.admin;
            case "email":
                return this.email;
            case "email2":
                return this.email2;
            case "emailPublic":
                return this.emailPublic;
            case "fax":
                return this.fax;
            case "firstName":
                return this.firstName;
            case "greetings":
                return this.greetings;
            case "id":
                return this.id;
            case "isPrivate":
                return this.isPrivate;
            case "lastName":
                return this.lastName;
            case "lastUpdate":
                return this.lastUpdate;
            case "login":
                return this.login;
            case "orcid":
                return this.orcid;
            case "passwd":
                return this.passwd;
            case "tel":
                return this.tel;
            case "tel2":
                return this.tel2;
            case "title":
                return this.title;
            case "agency":
                return this.agency;
            case "contactPtfRoles":
                return this.contactPtfRoles;
            case "contactSiteRoles":
                return this.contactSiteRoles;
            case "country":
                return this.country;
            case "cruiseContacts":
                return this.cruiseContacts;
            case "docContacts":
                return this.docContacts;
            case "image":
                return this.image;
            case "meetings":
                return this.meetings;
            case "ncNotifications":
                return this.ncNotifications;
            case "ncSubscriptions":
                return this.ncSubscriptions;
            case "networkContacts":
                return this.networkContacts;
            case "programContacts":
                return this.programContacts;
            case "ptfDeployments":
                return this.ptfDeployments;
            case "ptfModels":
                return this.ptfModels;
            case "services":
                return this.services;
            case "telecomFormats":
                return this.telecomFormats;
            case "userGroupContacts":
                return this.userGroupContacts;
            case "webConnections":
                return this.webConnections;
            case "webContactModules":
                return this.webContactModules;
            case "webContactPreferences":
                return this.webContactPreferences;
            case "webFrequentations":
                return this.webFrequentations;
            case "webQueries":
                return this.webQueries;
            case "webWorkspaces":
                return this.webWorkspaces;
            case "weblink":
                return this.weblink;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "address":
                this.address = (String)val;
                break;
            case "admin":
                this.admin = (BigDecimal)val;
                break;
            case "email":
                this.email = (String)val;
                break;
            case "email2":
                this.email2 = (String)val;
                break;
            case "emailPublic":
                this.emailPublic = (String)val;
                break;
            case "fax":
                this.fax = (String)val;
                break;
            case "firstName":
                this.firstName = (String)val;
                break;
            case "greetings":
                this.greetings = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "isPrivate":
                this.isPrivate = (BigDecimal)val;
                break;
            case "lastName":
                this.lastName = (String)val;
                break;
            case "lastUpdate":
                this.lastUpdate = (LocalDateTime)val;
                break;
            case "login":
                this.login = (String)val;
                break;
            case "orcid":
                this.orcid = (String)val;
                break;
            case "passwd":
                this.passwd = (String)val;
                break;
            case "tel":
                this.tel = (String)val;
                break;
            case "tel2":
                this.tel2 = (String)val;
                break;
            case "title":
                this.title = (String)val;
                break;
            case "agency":
                this.agency = val;
                break;
            case "contactPtfRoles":
                this.contactPtfRoles = val;
                break;
            case "contactSiteRoles":
                this.contactSiteRoles = val;
                break;
            case "country":
                this.country = val;
                break;
            case "cruiseContacts":
                this.cruiseContacts = val;
                break;
            case "docContacts":
                this.docContacts = val;
                break;
            case "image":
                this.image = val;
                break;
            case "meetings":
                this.meetings = val;
                break;
            case "ncNotifications":
                this.ncNotifications = val;
                break;
            case "ncSubscriptions":
                this.ncSubscriptions = val;
                break;
            case "networkContacts":
                this.networkContacts = val;
                break;
            case "programContacts":
                this.programContacts = val;
                break;
            case "ptfDeployments":
                this.ptfDeployments = val;
                break;
            case "ptfModels":
                this.ptfModels = val;
                break;
            case "services":
                this.services = val;
                break;
            case "telecomFormats":
                this.telecomFormats = val;
                break;
            case "userGroupContacts":
                this.userGroupContacts = val;
                break;
            case "webConnections":
                this.webConnections = val;
                break;
            case "webContactModules":
                this.webContactModules = val;
                break;
            case "webContactPreferences":
                this.webContactPreferences = val;
                break;
            case "webFrequentations":
                this.webFrequentations = val;
                break;
            case "webQueries":
                this.webQueries = val;
                break;
            case "webWorkspaces":
                this.webWorkspaces = val;
                break;
            case "weblink":
                this.weblink = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.address);
        out.writeObject(this.admin);
        out.writeObject(this.email);
        out.writeObject(this.email2);
        out.writeObject(this.emailPublic);
        out.writeObject(this.fax);
        out.writeObject(this.firstName);
        out.writeObject(this.greetings);
        out.writeObject(this.id);
        out.writeObject(this.isPrivate);
        out.writeObject(this.lastName);
        out.writeObject(this.lastUpdate);
        out.writeObject(this.login);
        out.writeObject(this.orcid);
        out.writeObject(this.passwd);
        out.writeObject(this.tel);
        out.writeObject(this.tel2);
        out.writeObject(this.title);
        out.writeObject(this.agency);
        out.writeObject(this.contactPtfRoles);
        out.writeObject(this.contactSiteRoles);
        out.writeObject(this.country);
        out.writeObject(this.cruiseContacts);
        out.writeObject(this.docContacts);
        out.writeObject(this.image);
        out.writeObject(this.meetings);
        out.writeObject(this.ncNotifications);
        out.writeObject(this.ncSubscriptions);
        out.writeObject(this.networkContacts);
        out.writeObject(this.programContacts);
        out.writeObject(this.ptfDeployments);
        out.writeObject(this.ptfModels);
        out.writeObject(this.services);
        out.writeObject(this.telecomFormats);
        out.writeObject(this.userGroupContacts);
        out.writeObject(this.webConnections);
        out.writeObject(this.webContactModules);
        out.writeObject(this.webContactPreferences);
        out.writeObject(this.webFrequentations);
        out.writeObject(this.webQueries);
        out.writeObject(this.webWorkspaces);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.address = (String)in.readObject();
        this.admin = (BigDecimal)in.readObject();
        this.email = (String)in.readObject();
        this.email2 = (String)in.readObject();
        this.emailPublic = (String)in.readObject();
        this.fax = (String)in.readObject();
        this.firstName = (String)in.readObject();
        this.greetings = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.isPrivate = (BigDecimal)in.readObject();
        this.lastName = (String)in.readObject();
        this.lastUpdate = (LocalDateTime)in.readObject();
        this.login = (String)in.readObject();
        this.orcid = (String)in.readObject();
        this.passwd = (String)in.readObject();
        this.tel = (String)in.readObject();
        this.tel2 = (String)in.readObject();
        this.title = (String)in.readObject();
        this.agency = in.readObject();
        this.contactPtfRoles = in.readObject();
        this.contactSiteRoles = in.readObject();
        this.country = in.readObject();
        this.cruiseContacts = in.readObject();
        this.docContacts = in.readObject();
        this.image = in.readObject();
        this.meetings = in.readObject();
        this.ncNotifications = in.readObject();
        this.ncSubscriptions = in.readObject();
        this.networkContacts = in.readObject();
        this.programContacts = in.readObject();
        this.ptfDeployments = in.readObject();
        this.ptfModels = in.readObject();
        this.services = in.readObject();
        this.telecomFormats = in.readObject();
        this.userGroupContacts = in.readObject();
        this.webConnections = in.readObject();
        this.webContactModules = in.readObject();
        this.webContactPreferences = in.readObject();
        this.webFrequentations = in.readObject();
        this.webQueries = in.readObject();
        this.webWorkspaces = in.readObject();
        this.weblink = in.readObject();
    }

}
