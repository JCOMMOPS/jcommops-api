package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CruiseContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseContact extends CayenneDataObject {

    public static final String TO_CONTACT_PROPERTY = "toContact";
    public static final String TO_CRUISE_PROPERTY = "toCruise";
    public static final String TO_ROLE_PROPERTY = "toRole";

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";
    public static final String ROLE_ID_PK_COLUMN = "ROLE_ID";

    public void setToContact(Contact toContact) {
        setToOneTarget(TO_CONTACT_PROPERTY, toContact, true);
    }

    public Contact getToContact() {
        return (Contact)readProperty(TO_CONTACT_PROPERTY);
    }


    public void setToCruise(Cruise toCruise) {
        setToOneTarget(TO_CRUISE_PROPERTY, toCruise, true);
    }

    public Cruise getToCruise() {
        return (Cruise)readProperty(TO_CRUISE_PROPERTY);
    }


    public void setToRole(Role toRole) {
        setToOneTarget(TO_ROLE_PROPERTY, toRole, true);
    }

    public Role getToRole() {
        return (Role)readProperty(TO_ROLE_PROPERTY);
    }


}