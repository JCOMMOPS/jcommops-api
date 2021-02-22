package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.BaseProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.CruiseLine;
import org.oceanops.api.orm.LineDecadalStatus;
import org.oceanops.api.orm.LineFamily;
import org.oceanops.api.orm.LineProgram;
import org.oceanops.api.orm.LineSurvey;
import org.oceanops.api.orm.Ptf;
import org.oceanops.api.orm.Section;
import org.oceanops.api.orm.WebFrequentation;
import org.oceanops.api.orm.Weblink;

/**
 * Class _Line was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Line extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> FROM_TO = PropertyFactory.createString("fromTo", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final BaseProperty<byte[]> SHAPE = PropertyFactory.createBase("shape", byte[].class);
    public static final StringProperty<String> WKT = PropertyFactory.createString("wkt", String.class);
    public static final ListProperty<CruiseLine> CRUISE_LINES = PropertyFactory.createList("cruiseLines", CruiseLine.class);
    public static final ListProperty<Cruise> CRUISES = PropertyFactory.createList("cruises", Cruise.class);
    public static final EntityProperty<LineDecadalStatus> LINE_DECADAL_STATUS = PropertyFactory.createEntity("lineDecadalStatus", LineDecadalStatus.class);
    public static final EntityProperty<LineFamily> LINE_FAMILY = PropertyFactory.createEntity("lineFamily", LineFamily.class);
    public static final ListProperty<LineProgram> LINE_PROGRAMS = PropertyFactory.createList("linePrograms", LineProgram.class);
    public static final ListProperty<LineSurvey> LINE_SURVEYS = PropertyFactory.createList("lineSurveys", LineSurvey.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);
    public static final ListProperty<Section> SECTIONS = PropertyFactory.createList("sections", Section.class);
    public static final ListProperty<WebFrequentation> WEB_FREQUENTATIONS = PropertyFactory.createList("webFrequentations", WebFrequentation.class);
    public static final EntityProperty<Weblink> WEBLINK = PropertyFactory.createEntity("weblink", Weblink.class);

    protected String fromTo;
    protected BigDecimal id;
    protected String name;
    protected byte[] shape;
    protected String wkt;

    protected Object cruiseLines;
    protected Object cruises;
    protected Object lineDecadalStatus;
    protected Object lineFamily;
    protected Object linePrograms;
    protected Object lineSurveys;
    protected Object ptfs;
    protected Object sections;
    protected Object webFrequentations;
    protected Object weblink;

    public void setFromTo(String fromTo) {
        beforePropertyWrite("fromTo", this.fromTo, fromTo);
        this.fromTo = fromTo;
    }

    public String getFromTo() {
        beforePropertyRead("fromTo");
        return this.fromTo;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setShape(byte[] shape) {
        beforePropertyWrite("shape", this.shape, shape);
        this.shape = shape;
    }

    public byte[] getShape() {
        beforePropertyRead("shape");
        return this.shape;
    }

    public void setWkt(String wkt) {
        beforePropertyWrite("wkt", this.wkt, wkt);
        this.wkt = wkt;
    }

    public String getWkt() {
        beforePropertyRead("wkt");
        return this.wkt;
    }

    public void addToCruiseLines(CruiseLine obj) {
        addToManyTarget("cruiseLines", obj, true);
    }

    public void removeFromCruiseLines(CruiseLine obj) {
        removeToManyTarget("cruiseLines", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CruiseLine> getCruiseLines() {
        return (List<CruiseLine>)readProperty("cruiseLines");
    }

    public void addToCruises(Cruise obj) {
        addToManyTarget("cruises", obj, true);
    }

    public void removeFromCruises(Cruise obj) {
        removeToManyTarget("cruises", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Cruise> getCruises() {
        return (List<Cruise>)readProperty("cruises");
    }

    public void setLineDecadalStatus(LineDecadalStatus lineDecadalStatus) {
        setToOneTarget("lineDecadalStatus", lineDecadalStatus, true);
    }

    public LineDecadalStatus getLineDecadalStatus() {
        return (LineDecadalStatus)readProperty("lineDecadalStatus");
    }

    public void setLineFamily(LineFamily lineFamily) {
        setToOneTarget("lineFamily", lineFamily, true);
    }

    public LineFamily getLineFamily() {
        return (LineFamily)readProperty("lineFamily");
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

    public void addToLineSurveys(LineSurvey obj) {
        addToManyTarget("lineSurveys", obj, true);
    }

    public void removeFromLineSurveys(LineSurvey obj) {
        removeToManyTarget("lineSurveys", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<LineSurvey> getLineSurveys() {
        return (List<LineSurvey>)readProperty("lineSurveys");
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

    public void addToSections(Section obj) {
        addToManyTarget("sections", obj, true);
    }

    public void removeFromSections(Section obj) {
        removeToManyTarget("sections", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Section> getSections() {
        return (List<Section>)readProperty("sections");
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
            case "fromTo":
                return this.fromTo;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "shape":
                return this.shape;
            case "wkt":
                return this.wkt;
            case "cruiseLines":
                return this.cruiseLines;
            case "cruises":
                return this.cruises;
            case "lineDecadalStatus":
                return this.lineDecadalStatus;
            case "lineFamily":
                return this.lineFamily;
            case "linePrograms":
                return this.linePrograms;
            case "lineSurveys":
                return this.lineSurveys;
            case "ptfs":
                return this.ptfs;
            case "sections":
                return this.sections;
            case "webFrequentations":
                return this.webFrequentations;
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
            case "fromTo":
                this.fromTo = (String)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "shape":
                this.shape = (byte[])val;
                break;
            case "wkt":
                this.wkt = (String)val;
                break;
            case "cruiseLines":
                this.cruiseLines = val;
                break;
            case "cruises":
                this.cruises = val;
                break;
            case "lineDecadalStatus":
                this.lineDecadalStatus = val;
                break;
            case "lineFamily":
                this.lineFamily = val;
                break;
            case "linePrograms":
                this.linePrograms = val;
                break;
            case "lineSurveys":
                this.lineSurveys = val;
                break;
            case "ptfs":
                this.ptfs = val;
                break;
            case "sections":
                this.sections = val;
                break;
            case "webFrequentations":
                this.webFrequentations = val;
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
        out.writeObject(this.fromTo);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.shape);
        out.writeObject(this.wkt);
        out.writeObject(this.cruiseLines);
        out.writeObject(this.cruises);
        out.writeObject(this.lineDecadalStatus);
        out.writeObject(this.lineFamily);
        out.writeObject(this.linePrograms);
        out.writeObject(this.lineSurveys);
        out.writeObject(this.ptfs);
        out.writeObject(this.sections);
        out.writeObject(this.webFrequentations);
        out.writeObject(this.weblink);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.fromTo = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.shape = (byte[])in.readObject();
        this.wkt = (String)in.readObject();
        this.cruiseLines = in.readObject();
        this.cruises = in.readObject();
        this.lineDecadalStatus = in.readObject();
        this.lineFamily = in.readObject();
        this.linePrograms = in.readObject();
        this.lineSurveys = in.readObject();
        this.ptfs = in.readObject();
        this.sections = in.readObject();
        this.webFrequentations = in.readObject();
        this.weblink = in.readObject();
    }

}