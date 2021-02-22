package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.PtfType;
import org.oceanops.api.orm.ShipType;

/**
 * Class _SdnPtfClass was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SdnPtfClass extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final StringProperty<String> ID = PropertyFactory.createString("id", String.class);
    public static final DateProperty<LocalDateTime> LAST_UPDATE = PropertyFactory.createDate("lastUpdate", LocalDateTime.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final EntityProperty<PtfType> PTF_TYPE = PropertyFactory.createEntity("ptfType", PtfType.class);
    public static final EntityProperty<ShipType> SHIP_TYPE = PropertyFactory.createEntity("shipType", ShipType.class);

    protected String description;
    protected String id;
    protected LocalDateTime lastUpdate;
    protected String name;
    protected String nameShort;

    protected Object ptfType;
    protected Object shipType;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setId(String id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public String getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        beforePropertyWrite("lastUpdate", this.lastUpdate, lastUpdate);
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getLastUpdate() {
        beforePropertyRead("lastUpdate");
        return this.lastUpdate;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setPtfType(PtfType ptfType) {
        setToOneTarget("ptfType", ptfType, true);
    }

    public PtfType getPtfType() {
        return (PtfType)readProperty("ptfType");
    }

    public void setShipType(ShipType shipType) {
        setToOneTarget("shipType", shipType, true);
    }

    public ShipType getShipType() {
        return (ShipType)readProperty("shipType");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "lastUpdate":
                return this.lastUpdate;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "ptfType":
                return this.ptfType;
            case "shipType":
                return this.shipType;
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
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (String)val;
                break;
            case "lastUpdate":
                this.lastUpdate = (LocalDateTime)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "ptfType":
                this.ptfType = val;
                break;
            case "shipType":
                this.shipType = val;
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
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.lastUpdate);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.ptfType);
        out.writeObject(this.shipType);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (String)in.readObject();
        this.lastUpdate = (LocalDateTime)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.ptfType = in.readObject();
        this.shipType = in.readObject();
    }

}