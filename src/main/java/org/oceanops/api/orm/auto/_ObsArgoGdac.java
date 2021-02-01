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
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Agency;
import org.oceanops.api.orm.ObsArgoGdacDs;
import org.oceanops.api.orm.ObsArgoGdacVariable;
import org.oceanops.api.orm.ObsDataStatus;
import org.oceanops.api.orm.Ptf;

/**
 * Class _ObsArgoGdac was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsArgoGdac extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> ASSEMBLY_DATE = PropertyFactory.createDate("assemblyDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> ASSEMBLY_DATE_BGC = PropertyFactory.createDate("assemblyDateBgc", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> CYCLE_NB = PropertyFactory.createNumeric("cycleNb", BigDecimal.class);
    public static final StringProperty<String> DATA_PATH = PropertyFactory.createString("dataPath", String.class);
    public static final NumericProperty<BigDecimal> DESCENDING = PropertyFactory.createNumeric("descending", BigDecimal.class);
    public static final StringProperty<String> FILENAME = PropertyFactory.createString("filename", String.class);
    public static final StringProperty<String> FILENAME_BGC = PropertyFactory.createString("filenameBgc", String.class);
    public static final DateProperty<LocalDateTime> GDAC_CREATION_DATE1 = PropertyFactory.createDate("gdacCreationDate1", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_CREATION_DATE2 = PropertyFactory.createDate("gdacCreationDate2", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_UPDATE_DATE1 = PropertyFactory.createDate("gdacUpdateDate1", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> GDAC_UPDATE_DATE2 = PropertyFactory.createDate("gdacUpdateDate2", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final DateProperty<LocalDateTime> INSERT_DATE = PropertyFactory.createDate("insertDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> LATEST_ASSEMBLY_DATE = PropertyFactory.createDate("latestAssemblyDate", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> LATEST_ASSEMBLY_DATE_BGC = PropertyFactory.createDate("latestAssemblyDateBgc", LocalDateTime.class);
    public static final DateProperty<LocalDateTime> OBS_DATE = PropertyFactory.createDate("obsDate", LocalDateTime.class);
    public static final BaseProperty<byte[]> SHAPE = PropertyFactory.createBase("shape", byte[].class);
    public static final DateProperty<LocalDateTime> UPDATE_DATE = PropertyFactory.createDate("updateDate", LocalDateTime.class);
    public static final StringProperty<String> WMO = PropertyFactory.createString("wmo", String.class);
    public static final EntityProperty<Agency> DAC = PropertyFactory.createEntity("dac", Agency.class);
    public static final ListProperty<ObsArgoGdacDs> OBS_ARGO_GDAC_DSS = PropertyFactory.createList("obsArgoGdacDss", ObsArgoGdacDs.class);
    public static final ListProperty<ObsArgoGdacVariable> OBS_ARGO_GDAC_VARIABLES = PropertyFactory.createList("obsArgoGdacVariables", ObsArgoGdacVariable.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS = PropertyFactory.createEntity("obsDataStatus", ObsDataStatus.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS_BGC = PropertyFactory.createEntity("obsDataStatusBgc", ObsDataStatus.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected LocalDateTime assemblyDate;
    protected LocalDateTime assemblyDateBgc;
    protected BigDecimal cycleNb;
    protected String dataPath;
    protected BigDecimal descending;
    protected String filename;
    protected String filenameBgc;
    protected LocalDateTime gdacCreationDate1;
    protected LocalDateTime gdacCreationDate2;
    protected LocalDateTime gdacUpdateDate1;
    protected LocalDateTime gdacUpdateDate2;
    protected BigDecimal id;
    protected LocalDateTime insertDate;
    protected LocalDateTime latestAssemblyDate;
    protected LocalDateTime latestAssemblyDateBgc;
    protected LocalDateTime obsDate;
    protected byte[] shape;
    protected LocalDateTime updateDate;
    protected String wmo;

    protected Object dac;
    protected Object obsArgoGdacDss;
    protected Object obsArgoGdacVariables;
    protected Object obsDataStatus;
    protected Object obsDataStatusBgc;
    protected Object ptf;

    public void setAssemblyDate(LocalDateTime assemblyDate) {
        beforePropertyWrite("assemblyDate", this.assemblyDate, assemblyDate);
        this.assemblyDate = assemblyDate;
    }

    public LocalDateTime getAssemblyDate() {
        beforePropertyRead("assemblyDate");
        return this.assemblyDate;
    }

    public void setAssemblyDateBgc(LocalDateTime assemblyDateBgc) {
        beforePropertyWrite("assemblyDateBgc", this.assemblyDateBgc, assemblyDateBgc);
        this.assemblyDateBgc = assemblyDateBgc;
    }

    public LocalDateTime getAssemblyDateBgc() {
        beforePropertyRead("assemblyDateBgc");
        return this.assemblyDateBgc;
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

    public void setFilenameBgc(String filenameBgc) {
        beforePropertyWrite("filenameBgc", this.filenameBgc, filenameBgc);
        this.filenameBgc = filenameBgc;
    }

    public String getFilenameBgc() {
        beforePropertyRead("filenameBgc");
        return this.filenameBgc;
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

    public void setLatestAssemblyDateBgc(LocalDateTime latestAssemblyDateBgc) {
        beforePropertyWrite("latestAssemblyDateBgc", this.latestAssemblyDateBgc, latestAssemblyDateBgc);
        this.latestAssemblyDateBgc = latestAssemblyDateBgc;
    }

    public LocalDateTime getLatestAssemblyDateBgc() {
        beforePropertyRead("latestAssemblyDateBgc");
        return this.latestAssemblyDateBgc;
    }

    public void setObsDate(LocalDateTime obsDate) {
        beforePropertyWrite("obsDate", this.obsDate, obsDate);
        this.obsDate = obsDate;
    }

    public LocalDateTime getObsDate() {
        beforePropertyRead("obsDate");
        return this.obsDate;
    }

    public void setShape(byte[] shape) {
        beforePropertyWrite("shape", this.shape, shape);
        this.shape = shape;
    }

    public byte[] getShape() {
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

    public void setDac(Agency dac) {
        setToOneTarget("dac", dac, true);
    }

    public Agency getDac() {
        return (Agency)readProperty("dac");
    }

    public void addToObsArgoGdacDss(ObsArgoGdacDs obj) {
        addToManyTarget("obsArgoGdacDss", obj, true);
    }

    public void removeFromObsArgoGdacDss(ObsArgoGdacDs obj) {
        removeToManyTarget("obsArgoGdacDss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdacDs> getObsArgoGdacDss() {
        return (List<ObsArgoGdacDs>)readProperty("obsArgoGdacDss");
    }

    public void addToObsArgoGdacVariables(ObsArgoGdacVariable obj) {
        addToManyTarget("obsArgoGdacVariables", obj, true);
    }

    public void removeFromObsArgoGdacVariables(ObsArgoGdacVariable obj) {
        removeToManyTarget("obsArgoGdacVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsArgoGdacVariable> getObsArgoGdacVariables() {
        return (List<ObsArgoGdacVariable>)readProperty("obsArgoGdacVariables");
    }

    public void setObsDataStatus(ObsDataStatus obsDataStatus) {
        setToOneTarget("obsDataStatus", obsDataStatus, true);
    }

    public ObsDataStatus getObsDataStatus() {
        return (ObsDataStatus)readProperty("obsDataStatus");
    }

    public void setObsDataStatusBgc(ObsDataStatus obsDataStatusBgc) {
        setToOneTarget("obsDataStatusBgc", obsDataStatusBgc, true);
    }

    public ObsDataStatus getObsDataStatusBgc() {
        return (ObsDataStatus)readProperty("obsDataStatusBgc");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "assemblyDate":
                return this.assemblyDate;
            case "assemblyDateBgc":
                return this.assemblyDateBgc;
            case "cycleNb":
                return this.cycleNb;
            case "dataPath":
                return this.dataPath;
            case "descending":
                return this.descending;
            case "filename":
                return this.filename;
            case "filenameBgc":
                return this.filenameBgc;
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
            case "latestAssemblyDateBgc":
                return this.latestAssemblyDateBgc;
            case "obsDate":
                return this.obsDate;
            case "shape":
                return this.shape;
            case "updateDate":
                return this.updateDate;
            case "wmo":
                return this.wmo;
            case "dac":
                return this.dac;
            case "obsArgoGdacDss":
                return this.obsArgoGdacDss;
            case "obsArgoGdacVariables":
                return this.obsArgoGdacVariables;
            case "obsDataStatus":
                return this.obsDataStatus;
            case "obsDataStatusBgc":
                return this.obsDataStatusBgc;
            case "ptf":
                return this.ptf;
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
            case "assemblyDateBgc":
                this.assemblyDateBgc = (LocalDateTime)val;
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
            case "filenameBgc":
                this.filenameBgc = (String)val;
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
            case "latestAssemblyDateBgc":
                this.latestAssemblyDateBgc = (LocalDateTime)val;
                break;
            case "obsDate":
                this.obsDate = (LocalDateTime)val;
                break;
            case "shape":
                this.shape = (byte[])val;
                break;
            case "updateDate":
                this.updateDate = (LocalDateTime)val;
                break;
            case "wmo":
                this.wmo = (String)val;
                break;
            case "dac":
                this.dac = val;
                break;
            case "obsArgoGdacDss":
                this.obsArgoGdacDss = val;
                break;
            case "obsArgoGdacVariables":
                this.obsArgoGdacVariables = val;
                break;
            case "obsDataStatus":
                this.obsDataStatus = val;
                break;
            case "obsDataStatusBgc":
                this.obsDataStatusBgc = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.assemblyDateBgc);
        out.writeObject(this.cycleNb);
        out.writeObject(this.dataPath);
        out.writeObject(this.descending);
        out.writeObject(this.filename);
        out.writeObject(this.filenameBgc);
        out.writeObject(this.gdacCreationDate1);
        out.writeObject(this.gdacCreationDate2);
        out.writeObject(this.gdacUpdateDate1);
        out.writeObject(this.gdacUpdateDate2);
        out.writeObject(this.id);
        out.writeObject(this.insertDate);
        out.writeObject(this.latestAssemblyDate);
        out.writeObject(this.latestAssemblyDateBgc);
        out.writeObject(this.obsDate);
        out.writeObject(this.shape);
        out.writeObject(this.updateDate);
        out.writeObject(this.wmo);
        out.writeObject(this.dac);
        out.writeObject(this.obsArgoGdacDss);
        out.writeObject(this.obsArgoGdacVariables);
        out.writeObject(this.obsDataStatus);
        out.writeObject(this.obsDataStatusBgc);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.assemblyDate = (LocalDateTime)in.readObject();
        this.assemblyDateBgc = (LocalDateTime)in.readObject();
        this.cycleNb = (BigDecimal)in.readObject();
        this.dataPath = (String)in.readObject();
        this.descending = (BigDecimal)in.readObject();
        this.filename = (String)in.readObject();
        this.filenameBgc = (String)in.readObject();
        this.gdacCreationDate1 = (LocalDateTime)in.readObject();
        this.gdacCreationDate2 = (LocalDateTime)in.readObject();
        this.gdacUpdateDate1 = (LocalDateTime)in.readObject();
        this.gdacUpdateDate2 = (LocalDateTime)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.insertDate = (LocalDateTime)in.readObject();
        this.latestAssemblyDate = (LocalDateTime)in.readObject();
        this.latestAssemblyDateBgc = (LocalDateTime)in.readObject();
        this.obsDate = (LocalDateTime)in.readObject();
        this.shape = (byte[])in.readObject();
        this.updateDate = (LocalDateTime)in.readObject();
        this.wmo = (String)in.readObject();
        this.dac = in.readObject();
        this.obsArgoGdacDss = in.readObject();
        this.obsArgoGdacVariables = in.readObject();
        this.obsDataStatus = in.readObject();
        this.obsDataStatusBgc = in.readObject();
        this.ptf = in.readObject();
    }

}
