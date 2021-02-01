package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/**
 * Class _Adoption was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Adoption extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> ADOPTER_ADDRESS = PropertyFactory.createString("adopterAddress", String.class);
    public static final StringProperty<String> ADOPTER_EMAIL = PropertyFactory.createString("adopterEmail", String.class);
    public static final StringProperty<String> ADOPTER_NAME = PropertyFactory.createString("adopterName", String.class);
    public static final DateProperty<LocalDateTime> ADOPTION_DATE = PropertyFactory.createDate("adoptionDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> IMAGE_ID = PropertyFactory.createNumeric("imageId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PTF_ID = PropertyFactory.createNumeric("ptfId", BigDecimal.class);
    public static final StringProperty<String> PTF_NAME = PropertyFactory.createString("ptfName", String.class);
    public static final StringProperty<String> TEXT = PropertyFactory.createString("text", String.class);
    public static final StringProperty<String> TITLE = PropertyFactory.createString("title", String.class);
    public static final StringProperty<String> URL = PropertyFactory.createString("url", String.class);

    protected String adopterAddress;
    protected String adopterEmail;
    protected String adopterName;
    protected LocalDateTime adoptionDate;
    protected BigDecimal id;
    protected BigDecimal imageId;
    protected BigDecimal ptfId;
    protected String ptfName;
    protected String text;
    protected String title;
    protected String url;


    public void setAdopterAddress(String adopterAddress) {
        beforePropertyWrite("adopterAddress", this.adopterAddress, adopterAddress);
        this.adopterAddress = adopterAddress;
    }

    public String getAdopterAddress() {
        beforePropertyRead("adopterAddress");
        return this.adopterAddress;
    }

    public void setAdopterEmail(String adopterEmail) {
        beforePropertyWrite("adopterEmail", this.adopterEmail, adopterEmail);
        this.adopterEmail = adopterEmail;
    }

    public String getAdopterEmail() {
        beforePropertyRead("adopterEmail");
        return this.adopterEmail;
    }

    public void setAdopterName(String adopterName) {
        beforePropertyWrite("adopterName", this.adopterName, adopterName);
        this.adopterName = adopterName;
    }

    public String getAdopterName() {
        beforePropertyRead("adopterName");
        return this.adopterName;
    }

    public void setAdoptionDate(LocalDateTime adoptionDate) {
        beforePropertyWrite("adoptionDate", this.adoptionDate, adoptionDate);
        this.adoptionDate = adoptionDate;
    }

    public LocalDateTime getAdoptionDate() {
        beforePropertyRead("adoptionDate");
        return this.adoptionDate;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setImageId(BigDecimal imageId) {
        beforePropertyWrite("imageId", this.imageId, imageId);
        this.imageId = imageId;
    }

    public BigDecimal getImageId() {
        beforePropertyRead("imageId");
        return this.imageId;
    }

    public void setPtfId(BigDecimal ptfId) {
        beforePropertyWrite("ptfId", this.ptfId, ptfId);
        this.ptfId = ptfId;
    }

    public BigDecimal getPtfId() {
        beforePropertyRead("ptfId");
        return this.ptfId;
    }

    public void setPtfName(String ptfName) {
        beforePropertyWrite("ptfName", this.ptfName, ptfName);
        this.ptfName = ptfName;
    }

    public String getPtfName() {
        beforePropertyRead("ptfName");
        return this.ptfName;
    }

    public void setText(String text) {
        beforePropertyWrite("text", this.text, text);
        this.text = text;
    }

    public String getText() {
        beforePropertyRead("text");
        return this.text;
    }

    public void setTitle(String title) {
        beforePropertyWrite("title", this.title, title);
        this.title = title;
    }

    public String getTitle() {
        beforePropertyRead("title");
        return this.title;
    }

    public void setUrl(String url) {
        beforePropertyWrite("url", this.url, url);
        this.url = url;
    }

    public String getUrl() {
        beforePropertyRead("url");
        return this.url;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "adopterAddress":
                return this.adopterAddress;
            case "adopterEmail":
                return this.adopterEmail;
            case "adopterName":
                return this.adopterName;
            case "adoptionDate":
                return this.adoptionDate;
            case "id":
                return this.id;
            case "imageId":
                return this.imageId;
            case "ptfId":
                return this.ptfId;
            case "ptfName":
                return this.ptfName;
            case "text":
                return this.text;
            case "title":
                return this.title;
            case "url":
                return this.url;
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
            case "adopterAddress":
                this.adopterAddress = (String)val;
                break;
            case "adopterEmail":
                this.adopterEmail = (String)val;
                break;
            case "adopterName":
                this.adopterName = (String)val;
                break;
            case "adoptionDate":
                this.adoptionDate = (LocalDateTime)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "imageId":
                this.imageId = (BigDecimal)val;
                break;
            case "ptfId":
                this.ptfId = (BigDecimal)val;
                break;
            case "ptfName":
                this.ptfName = (String)val;
                break;
            case "text":
                this.text = (String)val;
                break;
            case "title":
                this.title = (String)val;
                break;
            case "url":
                this.url = (String)val;
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
        out.writeObject(this.adopterAddress);
        out.writeObject(this.adopterEmail);
        out.writeObject(this.adopterName);
        out.writeObject(this.adoptionDate);
        out.writeObject(this.id);
        out.writeObject(this.imageId);
        out.writeObject(this.ptfId);
        out.writeObject(this.ptfName);
        out.writeObject(this.text);
        out.writeObject(this.title);
        out.writeObject(this.url);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.adopterAddress = (String)in.readObject();
        this.adopterEmail = (String)in.readObject();
        this.adopterName = (String)in.readObject();
        this.adoptionDate = (LocalDateTime)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.imageId = (BigDecimal)in.readObject();
        this.ptfId = (BigDecimal)in.readObject();
        this.ptfName = (String)in.readObject();
        this.text = (String)in.readObject();
        this.title = (String)in.readObject();
        this.url = (String)in.readObject();
    }

}
