package org.jcommops.api.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _WebQuery was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebQuery extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<LocalDateTime> DATE_CREATION = Property.create("dateCreation", LocalDateTime.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<Integer> IS_DEFAULT = Property.create("isDefault", Integer.class);
    public static final Property<Integer> IS_OCEANSITES_DEFAULT = Property.create("isOceansitesDefault", Integer.class);
    public static final Property<String> JSON_FORM_VALUES = Property.create("jsonFormValues", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> NAME_LONG = Property.create("nameLong", String.class);
    public static final Property<String> NAME_SHORT = Property.create("nameShort", String.class);
    public static final Property<String> OBS_SQL_A = Property.create("obsSqlA", String.class);
    public static final Property<String> OBS_SQL_B = Property.create("obsSqlB", String.class);
    public static final Property<Integer> PREFERENCE = Property.create("preference", Integer.class);
    public static final Property<String> SQL = Property.create("sql", String.class);
    public static final Property<Contact> CONTACT = Property.create("contact", Contact.class);

    public void setDateCreation(LocalDateTime dateCreation) {
        writeProperty("dateCreation", dateCreation);
    }
    public LocalDateTime getDateCreation() {
        return (LocalDateTime)readProperty("dateCreation");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setIsDefault(int isDefault) {
        writeProperty("isDefault", isDefault);
    }
    public int getIsDefault() {
        Object value = readProperty("isDefault");
        return (value != null) ? (Integer) value : 0;
    }

    public void setIsOceansitesDefault(int isOceansitesDefault) {
        writeProperty("isOceansitesDefault", isOceansitesDefault);
    }
    public int getIsOceansitesDefault() {
        Object value = readProperty("isOceansitesDefault");
        return (value != null) ? (Integer) value : 0;
    }

    public void setJsonFormValues(String jsonFormValues) {
        writeProperty("jsonFormValues", jsonFormValues);
    }
    public String getJsonFormValues() {
        return (String)readProperty("jsonFormValues");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setNameLong(String nameLong) {
        writeProperty("nameLong", nameLong);
    }
    public String getNameLong() {
        return (String)readProperty("nameLong");
    }

    public void setNameShort(String nameShort) {
        writeProperty("nameShort", nameShort);
    }
    public String getNameShort() {
        return (String)readProperty("nameShort");
    }

    public void setObsSqlA(String obsSqlA) {
        writeProperty("obsSqlA", obsSqlA);
    }
    public String getObsSqlA() {
        return (String)readProperty("obsSqlA");
    }

    public void setObsSqlB(String obsSqlB) {
        writeProperty("obsSqlB", obsSqlB);
    }
    public String getObsSqlB() {
        return (String)readProperty("obsSqlB");
    }

    public void setPreference(int preference) {
        writeProperty("preference", preference);
    }
    public int getPreference() {
        Object value = readProperty("preference");
        return (value != null) ? (Integer) value : 0;
    }

    public void setSql(String sql) {
        writeProperty("sql", sql);
    }
    public String getSql() {
        return (String)readProperty("sql");
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }


}
