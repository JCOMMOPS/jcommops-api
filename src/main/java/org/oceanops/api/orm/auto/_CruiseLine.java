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
import org.oceanops.api.orm.Line;

/**
 * Class _CruiseLine was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseLine extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PERFORMANCE_INDEX = PropertyFactory.createNumeric("performanceIndex", BigDecimal.class);
    public static final NumericProperty<BigDecimal> RANK = PropertyFactory.createNumeric("rank", BigDecimal.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<Line> LINE = PropertyFactory.createEntity("line", Line.class);

    protected BigDecimal id;
    protected BigDecimal performanceIndex;
    protected BigDecimal rank;

    protected Object cruise;
    protected Object line;

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setPerformanceIndex(BigDecimal performanceIndex) {
        beforePropertyWrite("performanceIndex", this.performanceIndex, performanceIndex);
        this.performanceIndex = performanceIndex;
    }

    public BigDecimal getPerformanceIndex() {
        beforePropertyRead("performanceIndex");
        return this.performanceIndex;
    }

    public void setRank(BigDecimal rank) {
        beforePropertyWrite("rank", this.rank, rank);
        this.rank = rank;
    }

    public BigDecimal getRank() {
        beforePropertyRead("rank");
        return this.rank;
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget("cruise", cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty("cruise");
    }

    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "performanceIndex":
                return this.performanceIndex;
            case "rank":
                return this.rank;
            case "cruise":
                return this.cruise;
            case "line":
                return this.line;
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
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "performanceIndex":
                this.performanceIndex = (BigDecimal)val;
                break;
            case "rank":
                this.rank = (BigDecimal)val;
                break;
            case "cruise":
                this.cruise = val;
                break;
            case "line":
                this.line = val;
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
        out.writeObject(this.id);
        out.writeObject(this.performanceIndex);
        out.writeObject(this.rank);
        out.writeObject(this.cruise);
        out.writeObject(this.line);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.id = (BigDecimal)in.readObject();
        this.performanceIndex = (BigDecimal)in.readObject();
        this.rank = (BigDecimal)in.readObject();
        this.cruise = in.readObject();
        this.line = in.readObject();
    }

}