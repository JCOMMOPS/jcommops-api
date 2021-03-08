package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.BaseProperty;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.value.Wkt;
import org.oceanops.api.orm.ObsGlidersGdacDs;
import org.oceanops.api.orm.ObsGlidersGdacVariable;

/**
 * Class _ObsGlidersGdac was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsGlidersGdac extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> ASSEMBLY_DATE = PropertyFactory.createDate("assemblyDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> CYCLE_NB = PropertyFactory.createNumeric("cycleNb", BigDecimal.class);
    public static final StringProperty<String> DATA_PATH = PropertyFactory.createString("dataPath", String.class);
    public static final NumericProperty<BigDecimal> DESCENDING = PropertyFactory.createNumeric("descending", BigDecimal.class);
    public static final StringProperty<String> FILENAME = PropertyFactory.createString("filename", String.class);
    public static final DateProperty<LocalDateTime> GDAC_CREATION_DATE1 = PropertyFactory.createDate("gdacCreationDate1", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_CREATION_DATE2 = PropertyFactory.createDate("gdacCreationDate2", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_UPDATE_DATE1 = PropertyFactory.createDate("gdacUpdateDate1", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_UPDATE_DATE2 = PropertyFactory.createDate("gdacUpdateDate2", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> LATEST_ASSEMBLY_DATE = PropertyFactory.createDate("latestAssemblyDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> OBS_DATA_STATUS_ID = PropertyFactory.createNumeric("obsDataStatusId", BigDecimal.class);
    public static final DateProperty<LocalDateTime> OBS_DATE = PropertyFactory.createDate("obsDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> PTF_ID = PropertyFactory.createNumeric("ptfId", BigDecimal.class);
    public static final BaseProperty<Wkt> SHAPE = PropertyFactory.createBase("shape", Wkt.class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final StringProperty<String> WMO = PropertyFactory.createString("wmo", String.class);
    public static final ListProperty<ObsGlidersGdacDs> OBS_GLIDERS_GDAC_DSS = PropertyFactory.createList("obsGlidersGdacDss", ObsGlidersGdacDs.class);
    public static final ListProperty<ObsGlidersGdacVariable> OBS_GLIDERS_GDAC_VARIABLES = PropertyFactory.createList("obsGlidersGdacVariables", ObsGlidersGdacVariable.class);

    protected LocalDateTime assemblyDate;
    protected BigDecimal cycleNb;
    protected String dataPath;
    protected BigDecimal descending;
    protected String filename;
    protected LocalDateTime gdacCreationDate1;
    protected LocalDateTime gdacCreationDate2;
    protected LocalDateTime gdacUpdateDate1;
    protected LocalDateTime gdacUpdateDate2;
    protected BigDecimal id;
    protected LocalDateTime insertDate;
    protected LocalDateTime latestAssemblyDate;
    protected BigDecimal obsDataStatusId;
    protected LocalDateTime obsDate;
    protected BigDecimal ptfId;
    protected Wkt shape;
    protected LocalDateTime updateDate;
    protected String wmo;

    protected Object obsGlidersGdacDss;
    protected Object obsGlidersGdacVariables;

    public void setAssemblyDate(LocalDateTime assemblyDate) {
        beforePropertyWrite("assemblyDate", this.assemblyDate, assemblyDate);
        this.assemblyDate = assemblyDate;
    }

    public LocalDateTime getAssemblyDate() {
        beforePropertyRead("assemblyDate");
        return this.assemblyDate;
    }

    public void setCycleNb(BigDecimal cycleNb) {
        beforePropertyWrite("cycleNb", this.cycleNb, cycleNb);
        this.cycleNb = cycleNb;
    }

    public BigDecimal getCycleNb() {
        beforePropertyRead("cycleNb");
        return this.cycleNb;
    }

    public void setDataPath(String dataPath) {
        beforePropertyWrite("dataPath", this.dataPath, dataPath);
        this.dataPath = dataPath;
    }

    public String getDataPath() {
        beforePropertyRead("dataPath");
        return this.dataPath;
    }

    public void setDescending(BigDecimal descending) {
        beforePropertyWrite("descending", this.descending, descending);
        this.descending = descending;
    }

    public BigDecimal getDescending() {
        beforePropertyRead("descending");
        return this.descending;
    }

    public void setFilename(String filename) {
        beforePropertyWrite("filename", this.filename, filename);
        this.filename = filename;
    }

    public String getFilename() {
        beforePropertyRead("filename");
        return this.filename;
    }

    public void setGdacCreationDate1(LocalDateTime gdacCreationDate1) {
        beforePropertyWrite("gdacCreationDate1", this.gdacCreationDate1, gdacCreationDate1);
        this.gdacCreationDate1 = gdacCreationDate1;
    }

    public LocalDateTime getGdacCreationDate1() {
        beforePropertyRead("gdacCreationDate1");
        return this.gdacCreationDate1;
    }

    public void setGdacCreationDate2(LocalDateTime gdacCreationDate2) {
        beforePropertyWrite("gdacCreationDate2", this.gdacCreationDate2, gdacCreationDate2);
        this.gdacCreationDate2 = gdacCreationDate2;
    }

    public LocalDateTime getGdacCreationDate2() {
        beforePropertyRead("gdacCreationDate2");
        return this.gdacCreationDate2;
    }

    public void setGdacUpdateDate1(LocalDateTime gdacUpdateDate1) {
        beforePropertyWrite("gdacUpdateDate1", this.gdacUpdateDate1, gdacUpdateDate1);
        this.gdacUpdateDate1 = gdacUpdateDate1;
    }

    public LocalDateTime getGdacUpdateDate1() {
        beforePropertyRead("gdacUpdateDate1");
        return this.gdacUpdateDate1;
    }

    public void setGdacUpdateDate2(LocalDateTime gdacUpdateDate2) {
        beforePropertyWrite("gdacUpdateDate2", this.gdacUpdateDate2, gdacUpdateDate2);
        this.gdacUpdateDate2 = gdacUpdateDate2;
    }

    public LocalDateTime getGdacUpdateDate2() {
        beforePropertyRead("gdacUpdateDate2");
        return this.gdacUpdateDate2;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        beforePropertyWrite("insertDate", this.insertDate, insertDate);
        this.insertDate = insertDate;
    }

    public LocalDateTime getInsertDate() {
        beforePropertyRead("insertDate");
        return this.insertDate;
    }

    public void setLatestAssemblyDate(LocalDateTime latestAssemblyDate) {
        beforePropertyWrite("latestAssemblyDate", this.latestAssemblyDate, latestAssemblyDate);
        this.latestAssemblyDate = latestAssemblyDate;
    }

    public LocalDateTime getLatestAssemblyDate() {
        beforePropertyRead("latestAssemblyDate");
        return this.latestAssemblyDate;
    }

    public void setObsDataStatusId(BigDecimal obsDataStatusId) {
        beforePropertyWrite("obsDataStatusId", this.obsDataStatusId, obsDataStatusId);
        this.obsDataStatusId = obsDataStatusId;
    }

    public BigDecimal getObsDataStatusId() {
        beforePropertyRead("obsDataStatusId");
        return this.obsDataStatusId;
    }

    public void setObsDate(LocalDateTime obsDate) {
        beforePropertyWrite("obsDate", this.obsDate, obsDate);
        this.obsDate = obsDate;
    }

    public LocalDateTime getObsDate() {
        beforePropertyRead("obsDate");
        return this.obsDate;
    }

    public void setPtfId(BigDecimal ptfId) {
        beforePropertyWrite("ptfId", this.ptfId, ptfId);
        this.ptfId = ptfId;
    }

    public BigDecimal getPtfId() {
        beforePropertyRead("ptfId");
        return this.ptfId;
    }

    public void setShape(Wkt shape) {
        beforePropertyWrite("shape", this.shape, shape);
        this.shape = shape;
    }

    public Wkt getShape() {
        beforePropertyRead("shape");
        return this.shape;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        beforePropertyWrite("updateDate", this.updateDate, updateDate);
        this.updateDate = updateDate;
    }

    public LocalDateTime getUpdateDate() {
        beforePropertyRead("updateDate");
        return this.updateDate;
    }

    public void setWmo(String wmo) {
        beforePropertyWrite("wmo", this.wmo, wmo);
        this.wmo = wmo;
    }

    public String getWmo() {
        beforePropertyRead("wmo");
        return this.wmo;
    }

    public void addToObsGlidersGdacDss(ObsGlidersGdacDs obj) {
        addToManyTarget("obsGlidersGdacDss", obj, true);
    }

    public void removeFromObsGlidersGdacDss(ObsGlidersGdacDs obj) {
        removeToManyTarget("obsGlidersGdacDss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGdacDs> getObsGlidersGdacDss() {
        return (List<ObsGlidersGdacDs>)readProperty("obsGlidersGdacDss");
    }

    public void addToObsGlidersGdacVariables(ObsGlidersGdacVariable obj) {
        addToManyTarget("obsGlidersGdacVariables", obj, true);
    }

    public void removeFromObsGlidersGdacVariables(ObsGlidersGdacVariable obj) {
        removeToManyTarget("obsGlidersGdacVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGdacVariable> getObsGlidersGdacVariables() {
        return (List<ObsGlidersGdacVariable>)readProperty("obsGlidersGdacVariables");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "assemblyDate":
                return this.assemblyDate;
            case "cycleNb":
                return this.cycleNb;
            case "dataPath":
                return this.dataPath;
            case "descending":
                return this.descending;
            case "filename":
                return this.filename;
            case "gdacCreationDate1":
                return this.gdacCreationDate1;
            case "gdacCreationDate2":
                return this.gdacCreationDate2;
            case "gdacUpdateDate1":
                return this.gdacUpdateDate1;
            case "gdacUpdateDate2":
                return this.gdacUpdateDate2;
            case "id":
                return this.id;
            case "insertDate":
                return this.insertDate;
            case "latestAssemblyDate":
                return this.latestAssemblyDate;
            case "obsDataStatusId":
                return this.obsDataStatusId;
            case "obsDate":
                return this.obsDate;
            case "ptfId":
                return this.ptfId;
            case "shape":
                return this.shape;
            case "updateDate":
                return this.updateDate;
            case "wmo":
                return this.wmo;
            case "obsGlidersGdacDss":
                return this.obsGlidersGdacDss;
            case "obsGlidersGdacVariables":
                return this.obsGlidersGdacVariables;
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
            case "assemblyDate":
                this.assemblyDate = (LocalDateTime)val;
                break;
            case "cycleNb":
                this.cycleNb = (BigDecimal)val;
                break;
            case "dataPath":
                this.dataPath = (String)val;
                break;
            case "descending":
                this.descending = (BigDecimal)val;
                break;
            case "filename":
                this.filename = (String)val;
                break;
            case "gdacCreationDate1":
                this.gdacCreationDate1 = (LocalDateTime)val;
                break;
            case "gdacCreationDate2":
                this.gdacCreationDate2 = (LocalDateTime)val;
                break;
            case "gdacUpdateDate1":
                this.gdacUpdateDate1 = (LocalDateTime)val;
                break;
            case "gdacUpdateDate2":
                this.gdacUpdateDate2 = (LocalDateTime)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "insertDate":
                this.insertDate = (LocalDateTime)val;
                break;
            case "latestAssemblyDate":
                this.latestAssemblyDate = (LocalDateTime)val;
                break;
            case "obsDataStatusId":
                this.obsDataStatusId = (BigDecimal)val;
                break;
            case "obsDate":
                this.obsDate = (LocalDateTime)val;
                break;
            case "ptfId":
                this.ptfId = (BigDecimal)val;
                break;
            case "shape":
                this.shape = (Wkt)val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "wmo":
                this.wmo = (String)val;
                break;
            case "obsGlidersGdacDss":
                this.obsGlidersGdacDss = val;
                break;
            case "obsGlidersGdacVariables":
                this.obsGlidersGdacVariables = val;
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
        out.writeObject(this.assemblyDate);
        out.writeObject(this.cycleNb);
        out.writeObject(this.dataPath);
        out.writeObject(this.descending);
        out.writeObject(this.filename);
        out.writeObject(this.gdacCreationDate1);
        out.writeObject(this.gdacCreationDate2);
        out.writeObject(this.gdacUpdateDate1);
        out.writeObject(this.gdacUpdateDate2);
        out.writeObject(this.id);
        out.writeObject(this.insertDate);
        out.writeObject(this.latestAssemblyDate);
        out.writeObject(this.obsDataStatusId);
        out.writeObject(this.obsDate);
        out.writeObject(this.ptfId);
        out.writeObject(this.shape);
        out.writeObject(this.updateDate);
        out.writeObject(this.wmo);
        out.writeObject(this.obsGlidersGdacDss);
        out.writeObject(this.obsGlidersGdacVariables);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.assemblyDate = (LocalDateTime)in.readObject();
        this.cycleNb = (BigDecimal)in.readObject();
        this.dataPath = (String)in.readObject();
        this.descending = (BigDecimal)in.readObject();
        this.filename = (String)in.readObject();
        this.gdacCreationDate1 = (LocalDateTime)in.readObject();
        this.gdacCreationDate2 = (LocalDateTime)in.readObject();
        this.gdacUpdateDate1 = (LocalDateTime)in.readObject();
        this.gdacUpdateDate2 = (LocalDateTime)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.latestAssemblyDate = (LocalDateTime)in.readObject();
        this.obsDataStatusId = (BigDecimal)in.readObject();
        this.obsDate = (LocalDateTime)in.readObject();
        this.ptfId = (BigDecimal)in.readObject();
        this.shape = (Wkt)in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.wmo = (String)in.readObject();
        this.obsGlidersGdacDss = in.readObject();
        this.obsGlidersGdacVariables = in.readObject();
    }

}
