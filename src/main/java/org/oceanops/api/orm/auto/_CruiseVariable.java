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
import org.oceanops.api.orm.Variable;

/**
 * Class _CruiseVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseVariable extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public static final NumericProperty<BigDecimal> CRUISE_ID = PropertyFactory.createNumeric("cruiseId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> VARIABLE_ID = PropertyFactory.createNumeric("variableId", BigDecimal.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<Variable> VARIABLE = PropertyFactory.createEntity("variable", Variable.class);

    protected BigDecimal cruiseId;
    protected BigDecimal variableId;

    protected Object cruise;
    protected Object variable;

    public void setCruiseId(BigDecimal cruiseId) {
        beforePropertyWrite("cruiseId", this.cruiseId, cruiseId);
        this.cruiseId = cruiseId;
    }

    public BigDecimal getCruiseId() {
        beforePropertyRead("cruiseId");
        return this.cruiseId;
    }

    public void setVariableId(BigDecimal variableId) {
        beforePropertyWrite("variableId", this.variableId, variableId);
        this.variableId = variableId;
    }

    public BigDecimal getVariableId() {
        beforePropertyRead("variableId");
        return this.variableId;
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget("cruise", cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty("cruise");
    }

    public void setVariable(Variable variable) {
        setToOneTarget("variable", variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty("variable");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cruiseId":
                return this.cruiseId;
            case "variableId":
                return this.variableId;
            case "cruise":
                return this.cruise;
            case "variable":
                return this.variable;
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
            case "variableId":
                this.variableId = (BigDecimal)val;
                break;
            case "cruise":
                this.cruise = val;
                break;
            case "variable":
                this.variable = val;
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
        out.writeObject(this.variableId);
        out.writeObject(this.cruise);
        out.writeObject(this.variable);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cruiseId = (BigDecimal)in.readObject();
        this.variableId = (BigDecimal)in.readObject();
        this.cruise = in.readObject();
        this.variable = in.readObject();
    }

}
