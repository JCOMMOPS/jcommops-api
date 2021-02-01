package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.Country;
import org.oceanops.api.orm.GtsCcccHeader;
import org.oceanops.api.orm.Obs;
import org.oceanops.api.orm.QcFeedback;

/**
 * Class _GtsCccc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsCccc extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> CCCC = PropertyFactory.createString("cccc", String.class);
    public static final StringProperty<String> CENTER = PropertyFactory.createString("center", String.class);
    public static final StringProperty<String> CITY = PropertyFactory.createString("city", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> INSERT_MARINE = PropertyFactory.createNumeric("insertMarine", BigDecimal.class);
    public static final StringProperty<String> LOCATION = PropertyFactory.createString("location", String.class);
    public static final StringProperty<String> TAG = PropertyFactory.createString("tag", String.class);
    public static final StringProperty<String> TMP = PropertyFactory.createString("tmp", String.class);
    public static final EntityProperty<Agency> AGENCY = PropertyFactory.createEntity("agency", Agency.class);
    public static final EntityProperty<Country> COUNTRY = PropertyFactory.createEntity("country", Country.class);
    public static final ListProperty<GtsCcccHeader> GTS_CCCC_HEADERS = PropertyFactory.createList("gtsCcccHeaders", GtsCcccHeader.class);
    public static final ListProperty<Obs> OBSS = PropertyFactory.createList("obss", Obs.class);
    public static final ListProperty<QcFeedback> QC_FEEDBACKS = PropertyFactory.createList("qcFeedbacks", QcFeedback.class);

    protected String cccc;
    protected String center;
    protected String city;
    protected BigDecimal id;
    protected BigDecimal insertMarine;
    protected String location;
    protected String tag;
    protected String tmp;

    protected Object agency;
    protected Object country;
    protected Object gtsCcccHeaders;
    protected Object obss;
    protected Object qcFeedbacks;

    public void setCccc(String cccc) {
        beforePropertyWrite("cccc", this.cccc, cccc);
        this.cccc = cccc;
    }

    public String getCccc() {
        beforePropertyRead("cccc");
        return this.cccc;
    }

    public void setCenter(String center) {
        beforePropertyWrite("center", this.center, center);
        this.center = center;
    }

    public String getCenter() {
        beforePropertyRead("center");
        return this.center;
    }

    public void setCity(String city) {
        beforePropertyWrite("city", this.city, city);
        this.city = city;
    }

    public String getCity() {
        beforePropertyRead("city");
        return this.city;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setInsertMarine(BigDecimal insertMarine) {
        beforePropertyWrite("insertMarine", this.insertMarine, insertMarine);
        this.insertMarine = insertMarine;
    }

    public BigDecimal getInsertMarine() {
        beforePropertyRead("insertMarine");
        return this.insertMarine;
    }

    public void setLocation(String location) {
        beforePropertyWrite("location", this.location, location);
        this.location = location;
    }

    public String getLocation() {
        beforePropertyRead("location");
        return this.location;
    }

    public void setTag(String tag) {
        beforePropertyWrite("tag", this.tag, tag);
        this.tag = tag;
    }

    public String getTag() {
        beforePropertyRead("tag");
        return this.tag;
    }

    public void setTmp(String tmp) {
        beforePropertyWrite("tmp", this.tmp, tmp);
        this.tmp = tmp;
    }

    public String getTmp() {
        beforePropertyRead("tmp");
        return this.tmp;
    }

    public void setAgency(Agency agency) {
        setToOneTarget("agency", agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty("agency");
    }

    public void setCountry(Country country) {
        setToOneTarget("country", country, true);
    }

    public Country getCountry() {
        return (Country)readProperty("country");
    }

    public void addToGtsCcccHeaders(GtsCcccHeader obj) {
        addToManyTarget("gtsCcccHeaders", obj, true);
    }

    public void removeFromGtsCcccHeaders(GtsCcccHeader obj) {
        removeToManyTarget("gtsCcccHeaders", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<GtsCcccHeader> getGtsCcccHeaders() {
        return (List<GtsCcccHeader>)readProperty("gtsCcccHeaders");
    }

    public void addToObss(Obs obj) {
        addToManyTarget("obss", obj, true);
    }

    public void removeFromObss(Obs obj) {
        removeToManyTarget("obss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Obs> getObss() {
        return (List<Obs>)readProperty("obss");
    }

    public void addToQcFeedbacks(QcFeedback obj) {
        addToManyTarget("qcFeedbacks", obj, true);
    }

    public void removeFromQcFeedbacks(QcFeedback obj) {
        removeToManyTarget("qcFeedbacks", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<QcFeedback> getQcFeedbacks() {
        return (List<QcFeedback>)readProperty("qcFeedbacks");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cccc":
                return this.cccc;
            case "center":
                return this.center;
            case "city":
                return this.city;
            case "id":
                return this.id;
            case "insertMarine":
                return this.insertMarine;
            case "location":
                return this.location;
            case "tag":
                return this.tag;
            case "tmp":
                return this.tmp;
            case "agency":
                return this.agency;
            case "country":
                return this.country;
            case "gtsCcccHeaders":
                return this.gtsCcccHeaders;
            case "obss":
                return this.obss;
            case "qcFeedbacks":
                return this.qcFeedbacks;
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
            case "cccc":
                this.cccc = (String)val;
                break;
            case "center":
                this.center = (String)val;
                break;
            case "city":
                this.city = (String)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "insertMarine":
                this.insertMarine = (BigDecimal)val;
                break;
            case "location":
                this.location = (String)val;
                break;
            case "tag":
                this.tag = (String)val;
                break;
            case "tmp":
                this.tmp = (String)val;
                break;
            case "agency":
                this.agency = val;
                break;
            case "country":
                this.country = val;
                break;
            case "gtsCcccHeaders":
                this.gtsCcccHeaders = val;
                break;
            case "obss":
                this.obss = val;
                break;
            case "qcFeedbacks":
                this.qcFeedbacks = val;
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
        out.writeObject(this.cccc);
        out.writeObject(this.center);
        out.writeObject(this.city);
        out.writeObject(this.id);
        out.writeObject(this.insertMarine);
        out.writeObject(this.location);
        out.writeObject(this.tag);
        out.writeObject(this.tmp);
        out.writeObject(this.agency);
        out.writeObject(this.country);
        out.writeObject(this.gtsCcccHeaders);
        out.writeObject(this.obss);
        out.writeObject(this.qcFeedbacks);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cccc = (String)in.readObject();
        this.center = (String)in.readObject();
        this.city = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.insertMarine = (BigDecimal)in.readObject();
        this.location = (String)in.readObject();
        this.tag = (String)in.readObject();
        this.tmp = (String)in.readObject();
        this.agency = in.readObject();
        this.country = in.readObject();
        this.gtsCcccHeaders = in.readObject();
        this.obss = in.readObject();
        this.qcFeedbacks = in.readObject();
    }

}
