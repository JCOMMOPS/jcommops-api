package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericIdProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Line;
import org.oceanops.api.orm.Ptf;

/**
 * Class _LinePtf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LinePtf extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final NumericIdProperty<BigDecimal> LINE_ID_PK_PROPERTY = PropertyFactory.createNumericId("LINE_ID", "LinePtf", BigDecimal.class);
    public static final String LINE_ID_PK_COLUMN = "LINE_ID";
    public static final NumericIdProperty<BigDecimal> PTF_ID_PK_PROPERTY = PropertyFactory.createNumericId("PTF_ID", "LinePtf", BigDecimal.class);
    public static final String PTF_ID_PK_COLUMN = "PTF_ID";

    public static final EntityProperty<Line> LINE = PropertyFactory.createEntity("line", Line.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);


    protected Object line;
    protected Object ptf;

    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
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
            case "line":
                return this.line;
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
            case "line":
                this.line = val;
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
        out.writeObject(this.line);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.line = in.readObject();
        this.ptf = in.readObject();
    }

}