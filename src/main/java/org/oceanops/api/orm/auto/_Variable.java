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
import org.oceanops.api.orm.CruiseVariable;
import org.oceanops.api.orm.ObsArgoGdacVariable;
import org.oceanops.api.orm.ObsGlidersGdacVariable;
import org.oceanops.api.orm.ObsGlidersGtsOsmcVariable;
import org.oceanops.api.orm.ObsTsunaGtsOsmcVariable;
import org.oceanops.api.orm.ObsVariable;
import org.oceanops.api.orm.PtfVariable;
import org.oceanops.api.orm.QcFeedback;
import org.oceanops.api.orm.QcFeedbackVariable;
import org.oceanops.api.orm.SensorType;
import org.oceanops.api.orm.VariableFamily;
import org.oceanops.api.orm.VariableSub;
import org.oceanops.api.orm.VariableVariableFamily;

/**
 * Class _Variable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Variable extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> ARGO_REF = PropertyFactory.createString("argoRef", String.class);
    public static final StringProperty<String> CANONICAL_UNIT = PropertyFactory.createString("canonicalUnit", String.class);
    public static final StringProperty<String> CF_REF = PropertyFactory.createString("cfRef", String.class);
    public static final StringProperty<String> DATA_SOURCE = PropertyFactory.createString("dataSource", String.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> IMOS_REF = PropertyFactory.createString("imosRef", String.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_ALTER = PropertyFactory.createString("nameAlter", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final StringProperty<String> P01REF = PropertyFactory.createString("p01Ref", String.class);
    public static final StringProperty<String> QC_REF = PropertyFactory.createString("qcRef", String.class);
    public static final StringProperty<String> WIGOS_CODE = PropertyFactory.createString("wigosCode", String.class);
    public static final NumericProperty<BigDecimal> WIGOS_REF = PropertyFactory.createNumeric("wigosRef", BigDecimal.class);
    public static final ListProperty<CruiseVariable> CRUISE_VARIABLES = PropertyFactory.createList("cruiseVariables", CruiseVariable.class);
    public static final ListProperty<ObsArgoGdacVariable> OBS_ARGO_GDAC_VARIABLES = PropertyFactory.createList("obsArgoGdacVariables", ObsArgoGdacVariable.class);
    public static final ListProperty<ObsGlidersGdacVariable> OBS_GLIDERS_GDAC_VARIABLES = PropertyFactory.createList("obsGlidersGdacVariables", ObsGlidersGdacVariable.class);
    public static final ListProperty<ObsGlidersGtsOsmcVariable> OBS_GLIDERS_GTS_OSMC_VARIABLES = PropertyFactory.createList("obsGlidersGtsOsmcVariables", ObsGlidersGtsOsmcVariable.class);
    public static final ListProperty<ObsTsunaGtsOsmcVariable> OBS_TSUNA_GTS_OSMC_VARIABLES = PropertyFactory.createList("obsTsunaGtsOsmcVariables", ObsTsunaGtsOsmcVariable.class);
    public static final ListProperty<ObsVariable> OBS_VARIABLES = PropertyFactory.createList("obsVariables", ObsVariable.class);
    public static final ListProperty<PtfVariable> PTF_VARIABLES = PropertyFactory.createList("ptfVariables", PtfVariable.class);
    public static final ListProperty<QcFeedbackVariable> QC_FEEDBACK_VARIABLES = PropertyFactory.createList("qcFeedbackVariables", QcFeedbackVariable.class);
    public static final ListProperty<QcFeedback> QC_FEEDBACKS = PropertyFactory.createList("qcFeedbacks", QcFeedback.class);
    public static final ListProperty<SensorType> SENSOR_TYPES = PropertyFactory.createList("sensorTypes", SensorType.class);
    public static final EntityProperty<VariableFamily> VARIABLE_FAMILY = PropertyFactory.createEntity("variableFamily", VariableFamily.class);
    public static final ListProperty<VariableSub> VARIABLE_SUBS = PropertyFactory.createList("variableSubs", VariableSub.class);
    public static final ListProperty<VariableVariableFamily> VARIABLE_VARIABLE_FAMILIES = PropertyFactory.createList("variableVariableFamilies", VariableVariableFamily.class);

    protected String argoRef;
    protected String canonicalUnit;
    protected String cfRef;
    protected String dataSource;
    protected String description;
    protected BigDecimal id;
    protected String imosRef;
    protected String name;
    protected String nameAlter;
    protected String nameShort;
    protected String p01Ref;
    protected String qcRef;
    protected String wigosCode;
    protected BigDecimal wigosRef;

    protected Object cruiseVariables;
    protected Object obsArgoGdacVariables;
    protected Object obsGlidersGdacVariables;
    protected Object obsGlidersGtsOsmcVariables;
    protected Object obsTsunaGtsOsmcVariables;
    protected Object obsVariables;
    protected Object ptfVariables;
    protected Object qcFeedbackVariables;
    protected Object qcFeedbacks;
    protected Object sensorTypes;
    protected Object variableFamily;
    protected Object variableSubs;
    protected Object variableVariableFamilies;

    public void setArgoRef(String argoRef) {
        beforePropertyWrite("argoRef", this.argoRef, argoRef);
        this.argoRef = argoRef;
    }

    public String getArgoRef() {
        beforePropertyRead("argoRef");
        return this.argoRef;
    }

    public void setCanonicalUnit(String canonicalUnit) {
        beforePropertyWrite("canonicalUnit", this.canonicalUnit, canonicalUnit);
        this.canonicalUnit = canonicalUnit;
    }

    public String getCanonicalUnit() {
        beforePropertyRead("canonicalUnit");
        return this.canonicalUnit;
    }

    public void setCfRef(String cfRef) {
        beforePropertyWrite("cfRef", this.cfRef, cfRef);
        this.cfRef = cfRef;
    }

    public String getCfRef() {
        beforePropertyRead("cfRef");
        return this.cfRef;
    }

    public void setDataSource(String dataSource) {
        beforePropertyWrite("dataSource", this.dataSource, dataSource);
        this.dataSource = dataSource;
    }

    public String getDataSource() {
        beforePropertyRead("dataSource");
        return this.dataSource;
    }

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setImosRef(String imosRef) {
        beforePropertyWrite("imosRef", this.imosRef, imosRef);
        this.imosRef = imosRef;
    }

    public String getImosRef() {
        beforePropertyRead("imosRef");
        return this.imosRef;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNameAlter(String nameAlter) {
        beforePropertyWrite("nameAlter", this.nameAlter, nameAlter);
        this.nameAlter = nameAlter;
    }

    public String getNameAlter() {
        beforePropertyRead("nameAlter");
        return this.nameAlter;
    }

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setP01Ref(String p01Ref) {
        beforePropertyWrite("p01Ref", this.p01Ref, p01Ref);
        this.p01Ref = p01Ref;
    }

    public String getP01Ref() {
        beforePropertyRead("p01Ref");
        return this.p01Ref;
    }

    public void setQcRef(String qcRef) {
        beforePropertyWrite("qcRef", this.qcRef, qcRef);
        this.qcRef = qcRef;
    }

    public String getQcRef() {
        beforePropertyRead("qcRef");
        return this.qcRef;
    }

    public void setWigosCode(String wigosCode) {
        beforePropertyWrite("wigosCode", this.wigosCode, wigosCode);
        this.wigosCode = wigosCode;
    }

    public String getWigosCode() {
        beforePropertyRead("wigosCode");
        return this.wigosCode;
    }

    public void setWigosRef(BigDecimal wigosRef) {
        beforePropertyWrite("wigosRef", this.wigosRef, wigosRef);
        this.wigosRef = wigosRef;
    }

    public BigDecimal getWigosRef() {
        beforePropertyRead("wigosRef");
        return this.wigosRef;
    }

    public void addToCruiseVariables(CruiseVariable obj) {
        addToManyTarget("cruiseVariables", obj, true);
    }

    public void removeFromCruiseVariables(CruiseVariable obj) {
        removeToManyTarget("cruiseVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CruiseVariable> getCruiseVariables() {
        return (List<CruiseVariable>)readProperty("cruiseVariables");
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

    public void addToObsGlidersGtsOsmcVariables(ObsGlidersGtsOsmcVariable obj) {
        addToManyTarget("obsGlidersGtsOsmcVariables", obj, true);
    }

    public void removeFromObsGlidersGtsOsmcVariables(ObsGlidersGtsOsmcVariable obj) {
        removeToManyTarget("obsGlidersGtsOsmcVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsGlidersGtsOsmcVariable> getObsGlidersGtsOsmcVariables() {
        return (List<ObsGlidersGtsOsmcVariable>)readProperty("obsGlidersGtsOsmcVariables");
    }

    public void addToObsTsunaGtsOsmcVariables(ObsTsunaGtsOsmcVariable obj) {
        addToManyTarget("obsTsunaGtsOsmcVariables", obj, true);
    }

    public void removeFromObsTsunaGtsOsmcVariables(ObsTsunaGtsOsmcVariable obj) {
        removeToManyTarget("obsTsunaGtsOsmcVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsTsunaGtsOsmcVariable> getObsTsunaGtsOsmcVariables() {
        return (List<ObsTsunaGtsOsmcVariable>)readProperty("obsTsunaGtsOsmcVariables");
    }

    public void addToObsVariables(ObsVariable obj) {
        addToManyTarget("obsVariables", obj, true);
    }

    public void removeFromObsVariables(ObsVariable obj) {
        removeToManyTarget("obsVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ObsVariable> getObsVariables() {
        return (List<ObsVariable>)readProperty("obsVariables");
    }

    public void addToPtfVariables(PtfVariable obj) {
        addToManyTarget("ptfVariables", obj, true);
    }

    public void removeFromPtfVariables(PtfVariable obj) {
        removeToManyTarget("ptfVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PtfVariable> getPtfVariables() {
        return (List<PtfVariable>)readProperty("ptfVariables");
    }

    public void addToQcFeedbackVariables(QcFeedbackVariable obj) {
        addToManyTarget("qcFeedbackVariables", obj, true);
    }

    public void removeFromQcFeedbackVariables(QcFeedbackVariable obj) {
        removeToManyTarget("qcFeedbackVariables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<QcFeedbackVariable> getQcFeedbackVariables() {
        return (List<QcFeedbackVariable>)readProperty("qcFeedbackVariables");
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

    public void addToSensorTypes(SensorType obj) {
        addToManyTarget("sensorTypes", obj, true);
    }

    public void removeFromSensorTypes(SensorType obj) {
        removeToManyTarget("sensorTypes", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<SensorType> getSensorTypes() {
        return (List<SensorType>)readProperty("sensorTypes");
    }

    public void setVariableFamily(VariableFamily variableFamily) {
        setToOneTarget("variableFamily", variableFamily, true);
    }

    public VariableFamily getVariableFamily() {
        return (VariableFamily)readProperty("variableFamily");
    }

    public void addToVariableSubs(VariableSub obj) {
        addToManyTarget("variableSubs", obj, true);
    }

    public void removeFromVariableSubs(VariableSub obj) {
        removeToManyTarget("variableSubs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<VariableSub> getVariableSubs() {
        return (List<VariableSub>)readProperty("variableSubs");
    }

    public void addToVariableVariableFamilies(VariableVariableFamily obj) {
        addToManyTarget("variableVariableFamilies", obj, true);
    }

    public void removeFromVariableVariableFamilies(VariableVariableFamily obj) {
        removeToManyTarget("variableVariableFamilies", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<VariableVariableFamily> getVariableVariableFamilies() {
        return (List<VariableVariableFamily>)readProperty("variableVariableFamilies");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "argoRef":
                return this.argoRef;
            case "canonicalUnit":
                return this.canonicalUnit;
            case "cfRef":
                return this.cfRef;
            case "dataSource":
                return this.dataSource;
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "imosRef":
                return this.imosRef;
            case "name":
                return this.name;
            case "nameAlter":
                return this.nameAlter;
            case "nameShort":
                return this.nameShort;
            case "p01Ref":
                return this.p01Ref;
            case "qcRef":
                return this.qcRef;
            case "wigosCode":
                return this.wigosCode;
            case "wigosRef":
                return this.wigosRef;
            case "cruiseVariables":
                return this.cruiseVariables;
            case "obsArgoGdacVariables":
                return this.obsArgoGdacVariables;
            case "obsGlidersGdacVariables":
                return this.obsGlidersGdacVariables;
            case "obsGlidersGtsOsmcVariables":
                return this.obsGlidersGtsOsmcVariables;
            case "obsTsunaGtsOsmcVariables":
                return this.obsTsunaGtsOsmcVariables;
            case "obsVariables":
                return this.obsVariables;
            case "ptfVariables":
                return this.ptfVariables;
            case "qcFeedbackVariables":
                return this.qcFeedbackVariables;
            case "qcFeedbacks":
                return this.qcFeedbacks;
            case "sensorTypes":
                return this.sensorTypes;
            case "variableFamily":
                return this.variableFamily;
            case "variableSubs":
                return this.variableSubs;
            case "variableVariableFamilies":
                return this.variableVariableFamilies;
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
            case "argoRef":
                this.argoRef = (String)val;
                break;
            case "canonicalUnit":
                this.canonicalUnit = (String)val;
                break;
            case "cfRef":
                this.cfRef = (String)val;
                break;
            case "dataSource":
                this.dataSource = (String)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "imosRef":
                this.imosRef = (String)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameAlter":
                this.nameAlter = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "p01Ref":
                this.p01Ref = (String)val;
                break;
            case "qcRef":
                this.qcRef = (String)val;
                break;
            case "wigosCode":
                this.wigosCode = (String)val;
                break;
            case "wigosRef":
                this.wigosRef = (BigDecimal)val;
                break;
            case "cruiseVariables":
                this.cruiseVariables = val;
                break;
            case "obsArgoGdacVariables":
                this.obsArgoGdacVariables = val;
                break;
            case "obsGlidersGdacVariables":
                this.obsGlidersGdacVariables = val;
                break;
            case "obsGlidersGtsOsmcVariables":
                this.obsGlidersGtsOsmcVariables = val;
                break;
            case "obsTsunaGtsOsmcVariables":
                this.obsTsunaGtsOsmcVariables = val;
                break;
            case "obsVariables":
                this.obsVariables = val;
                break;
            case "ptfVariables":
                this.ptfVariables = val;
                break;
            case "qcFeedbackVariables":
                this.qcFeedbackVariables = val;
                break;
            case "qcFeedbacks":
                this.qcFeedbacks = val;
                break;
            case "sensorTypes":
                this.sensorTypes = val;
                break;
            case "variableFamily":
                this.variableFamily = val;
                break;
            case "variableSubs":
                this.variableSubs = val;
                break;
            case "variableVariableFamilies":
                this.variableVariableFamilies = val;
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
        out.writeObject(this.argoRef);
        out.writeObject(this.canonicalUnit);
        out.writeObject(this.cfRef);
        out.writeObject(this.dataSource);
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.imosRef);
        out.writeObject(this.name);
        out.writeObject(this.nameAlter);
        out.writeObject(this.nameShort);
        out.writeObject(this.p01Ref);
        out.writeObject(this.qcRef);
        out.writeObject(this.wigosCode);
        out.writeObject(this.wigosRef);
        out.writeObject(this.cruiseVariables);
        out.writeObject(this.obsArgoGdacVariables);
        out.writeObject(this.obsGlidersGdacVariables);
        out.writeObject(this.obsGlidersGtsOsmcVariables);
        out.writeObject(this.obsTsunaGtsOsmcVariables);
        out.writeObject(this.obsVariables);
        out.writeObject(this.ptfVariables);
        out.writeObject(this.qcFeedbackVariables);
        out.writeObject(this.qcFeedbacks);
        out.writeObject(this.sensorTypes);
        out.writeObject(this.variableFamily);
        out.writeObject(this.variableSubs);
        out.writeObject(this.variableVariableFamilies);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.argoRef = (String)in.readObject();
        this.canonicalUnit = (String)in.readObject();
        this.cfRef = (String)in.readObject();
        this.dataSource = (String)in.readObject();
        this.description = (String)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.imosRef = (String)in.readObject();
        this.name = (String)in.readObject();
        this.nameAlter = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.p01Ref = (String)in.readObject();
        this.qcRef = (String)in.readObject();
        this.wigosCode = (String)in.readObject();
        this.wigosRef = (BigDecimal)in.readObject();
        this.cruiseVariables = in.readObject();
        this.obsArgoGdacVariables = in.readObject();
        this.obsGlidersGdacVariables = in.readObject();
        this.obsGlidersGtsOsmcVariables = in.readObject();
        this.obsTsunaGtsOsmcVariables = in.readObject();
        this.obsVariables = in.readObject();
        this.ptfVariables = in.readObject();
        this.qcFeedbackVariables = in.readObject();
        this.qcFeedbacks = in.readObject();
        this.sensorTypes = in.readObject();
        this.variableFamily = in.readObject();
        this.variableSubs = in.readObject();
        this.variableVariableFamilies = in.readObject();
    }

}