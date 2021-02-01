package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.PtfConfig;

/**
 * Class _Config was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Config extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> CYCLE_TIME = PropertyFactory.createNumeric("cycleTime", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DRIFT_PRESS = PropertyFactory.createNumeric("driftPress", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ICE_DETECTION = PropertyFactory.createNumeric("iceDetection", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final NumericProperty<BigDecimal> N_LEVELS = PropertyFactory.createNumeric("nLevels", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PNP = PropertyFactory.createNumeric("pnp", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PROFILE_PRESS = PropertyFactory.createNumeric("profilePress", BigDecimal.class);
    public static final NumericProperty<BigDecimal> SURFACE_TIME = PropertyFactory.createNumeric("surfaceTime", BigDecimal.class);
    public static final NumericProperty<BigDecimal> WATCH_CIRCLE = PropertyFactory.createNumeric("watchCircle", BigDecimal.class);
    public static final ListProperty<PtfConfig> PTF_CONFIGS = PropertyFactory.createList("ptfConfigs", PtfConfig.class);

    protected BigDecimal cycleTime;
    protected BigDecimal driftPress;
    protected BigDecimal iceDetection;
    protected BigDecimal id;
    protected BigDecimal nLevels;
    protected BigDecimal pnp;
    protected BigDecimal profilePress;
    protected BigDecimal surfaceTime;
    protected BigDecimal watchCircle;

    protected Object ptfConfigs;

    public void setCycleTime(BigDecimal cycleTime) {
        beforePropertyWrite("cycleTime", this.cycleTime, cycleTime);
        this.cycleTime = cycleTime;
    }

    public BigDecimal getCycleTime() {
        beforePropertyRead("cycleTime");
        return this.cycleTime;
    }

    public void setDriftPress(BigDecimal driftPress) {
        beforePropertyWrite("driftPress", this.driftPress, driftPress);
        this.driftPress = driftPress;
    }

    public BigDecimal getDriftPress() {
        beforePropertyRead("driftPress");
        return this.driftPress;
    }

    public void setIceDetection(BigDecimal iceDetection) {
        beforePropertyWrite("iceDetection", this.iceDetection, iceDetection);
        this.iceDetection = iceDetection;
    }

    public BigDecimal getIceDetection() {
        beforePropertyRead("iceDetection");
        return this.iceDetection;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setNLevels(BigDecimal nLevels) {
        beforePropertyWrite("nLevels", this.nLevels, nLevels);
        this.nLevels = nLevels;
    }

    public BigDecimal getNLevels() {
        beforePropertyRead("nLevels");
        return this.nLevels;
    }

    public void setPnp(BigDecimal pnp) {
        beforePropertyWrite("pnp", this.pnp, pnp);
        this.pnp = pnp;
    }

    public BigDecimal getPnp() {
        beforePropertyRead("pnp");
        return this.pnp;
    }

    public void setProfilePress(BigDecimal profilePress) {
        beforePropertyWrite("profilePress", this.profilePress, profilePress);
        this.profilePress = profilePress;
    }

    public BigDecimal getProfilePress() {
        beforePropertyRead("profilePress");
        return this.profilePress;
    }

    public void setSurfaceTime(BigDecimal surfaceTime) {
        beforePropertyWrite("surfaceTime", this.surfaceTime, surfaceTime);
        this.surfaceTime = surfaceTime;
    }

    public BigDecimal getSurfaceTime() {
        beforePropertyRead("surfaceTime");
        return this.surfaceTime;
    }

    public void setWatchCircle(BigDecimal watchCircle) {
        beforePropertyWrite("watchCircle", this.watchCircle, watchCircle);
        this.watchCircle = watchCircle;
    }

    public BigDecimal getWatchCircle() {
        beforePropertyRead("watchCircle");
        return this.watchCircle;
    }

    public void addToPtfConfigs(PtfConfig obj) {
        addToManyTarget("ptfConfigs", obj, true);
    }

    public void removeFromPtfConfigs(PtfConfig obj) {
        removeToManyTarget("ptfConfigs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PtfConfig> getPtfConfigs() {
        return (List<PtfConfig>)readProperty("ptfConfigs");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cycleTime":
                return this.cycleTime;
            case "driftPress":
                return this.driftPress;
            case "iceDetection":
                return this.iceDetection;
            case "id":
                return this.id;
            case "nLevels":
                return this.nLevels;
            case "pnp":
                return this.pnp;
            case "profilePress":
                return this.profilePress;
            case "surfaceTime":
                return this.surfaceTime;
            case "watchCircle":
                return this.watchCircle;
            case "ptfConfigs":
                return this.ptfConfigs;
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
            case "cycleTime":
                this.cycleTime = (BigDecimal)val;
                break;
            case "driftPress":
                this.driftPress = (BigDecimal)val;
                break;
            case "iceDetection":
                this.iceDetection = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "nLevels":
                this.nLevels = (BigDecimal)val;
                break;
            case "pnp":
                this.pnp = (BigDecimal)val;
                break;
            case "profilePress":
                this.profilePress = (BigDecimal)val;
                break;
            case "surfaceTime":
                this.surfaceTime = (BigDecimal)val;
                break;
            case "watchCircle":
                this.watchCircle = (BigDecimal)val;
                break;
            case "ptfConfigs":
                this.ptfConfigs = val;
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
        out.writeObject(this.cycleTime);
        out.writeObject(this.driftPress);
        out.writeObject(this.iceDetection);
        out.writeObject(this.id);
        out.writeObject(this.nLevels);
        out.writeObject(this.pnp);
        out.writeObject(this.profilePress);
        out.writeObject(this.surfaceTime);
        out.writeObject(this.watchCircle);
        out.writeObject(this.ptfConfigs);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cycleTime = (BigDecimal)in.readObject();
        this.driftPress = (BigDecimal)in.readObject();
        this.iceDetection = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.nLevels = (BigDecimal)in.readObject();
        this.pnp = (BigDecimal)in.readObject();
        this.profilePress = (BigDecimal)in.readObject();
        this.surfaceTime = (BigDecimal)in.readObject();
        this.watchCircle = (BigDecimal)in.readObject();
        this.ptfConfigs = in.readObject();
    }

}
