package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.Role;
import org.oceanops.api.orm.UserGroup;

/**
 * Class _UserGroupContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UserGroupContact extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String USER_GROUP_ID_PK_COLUMN = "USER_GROUP_ID";

    public static final NumericProperty<BigDecimal> CONTACT_ID = PropertyFactory.createNumeric("contactId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> USER_GROUP_ID = PropertyFactory.createNumeric("userGroupId", BigDecimal.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final EntityProperty<Role> ROLE = PropertyFactory.createEntity("role", Role.class);
    public static final EntityProperty<UserGroup> USER_GROUP = PropertyFactory.createEntity("userGroup", UserGroup.class);

    protected BigDecimal contactId;
    protected BigDecimal userGroupId;

    protected Object contact;
    protected Object country;
    protected Object role;
    protected Object userGroup;

    public void setContactId(BigDecimal contactId) {
        beforePropertyWrite("contactId", this.contactId, contactId);
        this.contactId = contactId;
    }

    public BigDecimal getContactId() {
        beforePropertyRead("contactId");
        return this.contactId;
    }

    public void setUserGroupId(BigDecimal userGroupId) {
        beforePropertyWrite("userGroupId", this.userGroupId, userGroupId);
        this.userGroupId = userGroupId;
    }

    public BigDecimal getUserGroupId() {
        beforePropertyRead("userGroupId");
        return this.userGroupId;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }

    public void setRole(Role role) {
        setToOneTarget("role", role, true);
    }

    public Role getRole() {
        return (Role)readProperty("role");
    }

    public void setUserGroup(UserGroup userGroup) {
        setToOneTarget("userGroup", userGroup, true);
    }

    public UserGroup getUserGroup() {
        return (UserGroup)readProperty("userGroup");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "contactId":
                return this.contactId;
            case "userGroupId":
                return this.userGroupId;
            case "contact":
                return this.contact;
            case "country":
                return this.country;
            case "role":
                return this.role;
            case "userGroup":
                return this.userGroup;
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
            case "contactId":
                this.contactId = (BigDecimal)val;
                break;
            case "userGroupId":
                this.userGroupId = (BigDecimal)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "country":
                this.country = val;
                break;
            case "role":
                this.role = val;
                break;
            case "userGroup":
                this.userGroup = val;
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
        out.writeObject(this.contactId);
        out.writeObject(this.userGroupId);
        out.writeObject(this.contact);
        out.writeObject(this.country);
        out.writeObject(this.role);
        out.writeObject(this.userGroup);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.contactId = (BigDecimal)in.readObject();
        this.userGroupId = (BigDecimal)in.readObject();
        this.contact = in.readObject();
        this.country = in.readObject();
        this.role = in.readObject();
        this.userGroup = in.readObject();
    }

}