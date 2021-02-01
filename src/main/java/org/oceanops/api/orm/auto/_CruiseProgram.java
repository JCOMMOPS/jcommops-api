package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Cruise;
import org.oceanops.api.orm.Program;

/**
 * Class _CruiseProgram was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseProgram extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";
    public static final String PROGRAM_ID_PK_COLUMN = "PROGRAM_ID";

    public static final NumericProperty<BigDecimal> CRUISE_ID = PropertyFactory.createNumeric("cruiseId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LEAD = PropertyFactory.createNumeric("lead", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PROGRAM_ID = PropertyFactory.createNumeric("programId", BigDecimal.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);

    protected BigDecimal cruiseId;
    protected BigDecimal lead;
    protected BigDecimal programId;

    protected Object cruise;
    protected Object program;

    public void setCruiseId(BigDecimal cruiseId) {
        beforePropertyWrite("cruiseId", this.cruiseId, cruiseId);
        this.cruiseId = cruiseId;
    }

    public BigDecimal getCruiseId() {
        beforePropertyRead("cruiseId");
        return this.cruiseId;
    }

    public void setLead(BigDecimal lead) {
        beforePropertyWrite("lead", this.lead, lead);
        this.lead = lead;
    }

    public BigDecimal getLead() {
        beforePropertyRead("lead");
        return this.lead;
    }

    public void setProgramId(BigDecimal programId) {
        beforePropertyWrite("programId", this.programId, programId);
        this.programId = programId;
    }

    public BigDecimal getProgramId() {
        beforePropertyRead("programId");
        return this.programId;
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget("cruise", cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty("cruise");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cruiseId":
                return this.cruiseId;
            case "lead":
                return this.lead;
            case "programId":
                return this.programId;
            case "cruise":
                return this.cruise;
            case "program":
                return this.program;
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
            case "cruiseId":
                this.cruiseId = (BigDecimal)val;
                break;
            case "lead":
                this.lead = (BigDecimal)val;
                break;
            case "programId":
                this.programId = (BigDecimal)val;
                break;
            case "cruise":
                this.cruise = val;
                break;
            case "program":
                this.program = val;
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
        out.writeObject(this.cruiseId);
        out.writeObject(this.lead);
        out.writeObject(this.programId);
        out.writeObject(this.cruise);
        out.writeObject(this.program);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cruiseId = (BigDecimal)in.readObject();
        this.lead = (BigDecimal)in.readObject();
        this.programId = (BigDecimal)in.readObject();
        this.cruise = in.readObject();
        this.program = in.readObject();
    }

}
