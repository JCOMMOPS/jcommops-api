package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Ptf;

/**
 * Class _PtfStatistics was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfStatistics extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String PTF_ID_PK_COLUMN = "PTF_ID";

    public static final NumericProperty<BigDecimal> DELAY_AVG = PropertyFactory.createNumeric("delayAvg", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DELAY_AVG_GDAC1 = PropertyFactory.createNumeric("delayAvgGdac1", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DELAY_AVG_GDAC2 = PropertyFactory.createNumeric("delayAvgGdac2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DELAY_MEDIAN = PropertyFactory.createNumeric("delayMedian", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DELAY_MEDIAN_GDAC1 = PropertyFactory.createNumeric("delayMedianGdac1", BigDecimal.class);
    public static final NumericProperty<BigDecimal> DELAY_MEDIAN_GDAC2 = PropertyFactory.createNumeric("delayMedianGdac2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS = PropertyFactory.createNumeric("nbObs", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM = PropertyFactory.createNumeric("nbObsDm", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM_ELIGIBLE = PropertyFactory.createNumeric("nbObsDmEligible", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM_ELIGIBLE_GDAC1 = PropertyFactory.createNumeric("nbObsDmEligibleGdac1", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM_ELIGIBLE_GDAC2 = PropertyFactory.createNumeric("nbObsDmEligibleGdac2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM_GDAC1 = PropertyFactory.createNumeric("nbObsDmGdac1", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_DM_GDAC2 = PropertyFactory.createNumeric("nbObsDmGdac2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_GDAC1 = PropertyFactory.createNumeric("nbObsGdac1", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_GDAC2 = PropertyFactory.createNumeric("nbObsGdac2", BigDecimal.class);
    public static final NumericProperty<BigDecimal> NB_OBS_GTS = PropertyFactory.createNumeric("nbObsGts", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PTF_ID = PropertyFactory.createNumeric("ptfId", BigDecimal.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected BigDecimal delayAvg;
    protected BigDecimal delayAvgGdac1;
    protected BigDecimal delayAvgGdac2;
    protected BigDecimal delayMedian;
    protected BigDecimal delayMedianGdac1;
    protected BigDecimal delayMedianGdac2;
    protected BigDecimal nbObs;
    protected BigDecimal nbObsDm;
    protected BigDecimal nbObsDmEligible;
    protected BigDecimal nbObsDmEligibleGdac1;
    protected BigDecimal nbObsDmEligibleGdac2;
    protected BigDecimal nbObsDmGdac1;
    protected BigDecimal nbObsDmGdac2;
    protected BigDecimal nbObsGdac1;
    protected BigDecimal nbObsGdac2;
    protected BigDecimal nbObsGts;
    protected BigDecimal ptfId;

    protected Object ptf;

    public void setDelayAvg(BigDecimal delayAvg) {
        beforePropertyWrite("delayAvg", this.delayAvg, delayAvg);
        this.delayAvg = delayAvg;
    }

    public BigDecimal getDelayAvg() {
        beforePropertyRead("delayAvg");
        return this.delayAvg;
    }

    public void setDelayAvgGdac1(BigDecimal delayAvgGdac1) {
        beforePropertyWrite("delayAvgGdac1", this.delayAvgGdac1, delayAvgGdac1);
        this.delayAvgGdac1 = delayAvgGdac1;
    }

    public BigDecimal getDelayAvgGdac1() {
        beforePropertyRead("delayAvgGdac1");
        return this.delayAvgGdac1;
    }

    public void setDelayAvgGdac2(BigDecimal delayAvgGdac2) {
        beforePropertyWrite("delayAvgGdac2", this.delayAvgGdac2, delayAvgGdac2);
        this.delayAvgGdac2 = delayAvgGdac2;
    }

    public BigDecimal getDelayAvgGdac2() {
        beforePropertyRead("delayAvgGdac2");
        return this.delayAvgGdac2;
    }

    public void setDelayMedian(BigDecimal delayMedian) {
        beforePropertyWrite("delayMedian", this.delayMedian, delayMedian);
        this.delayMedian = delayMedian;
    }

    public BigDecimal getDelayMedian() {
        beforePropertyRead("delayMedian");
        return this.delayMedian;
    }

    public void setDelayMedianGdac1(BigDecimal delayMedianGdac1) {
        beforePropertyWrite("delayMedianGdac1", this.delayMedianGdac1, delayMedianGdac1);
        this.delayMedianGdac1 = delayMedianGdac1;
    }

    public BigDecimal getDelayMedianGdac1() {
        beforePropertyRead("delayMedianGdac1");
        return this.delayMedianGdac1;
    }

    public void setDelayMedianGdac2(BigDecimal delayMedianGdac2) {
        beforePropertyWrite("delayMedianGdac2", this.delayMedianGdac2, delayMedianGdac2);
        this.delayMedianGdac2 = delayMedianGdac2;
    }

    public BigDecimal getDelayMedianGdac2() {
        beforePropertyRead("delayMedianGdac2");
        return this.delayMedianGdac2;
    }

    public void setNbObs(BigDecimal nbObs) {
        beforePropertyWrite("nbObs", this.nbObs, nbObs);
        this.nbObs = nbObs;
    }

    public BigDecimal getNbObs() {
        beforePropertyRead("nbObs");
        return this.nbObs;
    }

    public void setNbObsDm(BigDecimal nbObsDm) {
        beforePropertyWrite("nbObsDm", this.nbObsDm, nbObsDm);
        this.nbObsDm = nbObsDm;
    }

    public BigDecimal getNbObsDm() {
        beforePropertyRead("nbObsDm");
        return this.nbObsDm;
    }

    public void setNbObsDmEligible(BigDecimal nbObsDmEligible) {
        beforePropertyWrite("nbObsDmEligible", this.nbObsDmEligible, nbObsDmEligible);
        this.nbObsDmEligible = nbObsDmEligible;
    }

    public BigDecimal getNbObsDmEligible() {
        beforePropertyRead("nbObsDmEligible");
        return this.nbObsDmEligible;
    }

    public void setNbObsDmEligibleGdac1(BigDecimal nbObsDmEligibleGdac1) {
        beforePropertyWrite("nbObsDmEligibleGdac1", this.nbObsDmEligibleGdac1, nbObsDmEligibleGdac1);
        this.nbObsDmEligibleGdac1 = nbObsDmEligibleGdac1;
    }

    public BigDecimal getNbObsDmEligibleGdac1() {
        beforePropertyRead("nbObsDmEligibleGdac1");
        return this.nbObsDmEligibleGdac1;
    }

    public void setNbObsDmEligibleGdac2(BigDecimal nbObsDmEligibleGdac2) {
        beforePropertyWrite("nbObsDmEligibleGdac2", this.nbObsDmEligibleGdac2, nbObsDmEligibleGdac2);
        this.nbObsDmEligibleGdac2 = nbObsDmEligibleGdac2;
    }

    public BigDecimal getNbObsDmEligibleGdac2() {
        beforePropertyRead("nbObsDmEligibleGdac2");
        return this.nbObsDmEligibleGdac2;
    }

    public void setNbObsDmGdac1(BigDecimal nbObsDmGdac1) {
        beforePropertyWrite("nbObsDmGdac1", this.nbObsDmGdac1, nbObsDmGdac1);
        this.nbObsDmGdac1 = nbObsDmGdac1;
    }

    public BigDecimal getNbObsDmGdac1() {
        beforePropertyRead("nbObsDmGdac1");
        return this.nbObsDmGdac1;
    }

    public void setNbObsDmGdac2(BigDecimal nbObsDmGdac2) {
        beforePropertyWrite("nbObsDmGdac2", this.nbObsDmGdac2, nbObsDmGdac2);
        this.nbObsDmGdac2 = nbObsDmGdac2;
    }

    public BigDecimal getNbObsDmGdac2() {
        beforePropertyRead("nbObsDmGdac2");
        return this.nbObsDmGdac2;
    }

    public void setNbObsGdac1(BigDecimal nbObsGdac1) {
        beforePropertyWrite("nbObsGdac1", this.nbObsGdac1, nbObsGdac1);
        this.nbObsGdac1 = nbObsGdac1;
    }

    public BigDecimal getNbObsGdac1() {
        beforePropertyRead("nbObsGdac1");
        return this.nbObsGdac1;
    }

    public void setNbObsGdac2(BigDecimal nbObsGdac2) {
        beforePropertyWrite("nbObsGdac2", this.nbObsGdac2, nbObsGdac2);
        this.nbObsGdac2 = nbObsGdac2;
    }

    public BigDecimal getNbObsGdac2() {
        beforePropertyRead("nbObsGdac2");
        return this.nbObsGdac2;
    }

    public void setNbObsGts(BigDecimal nbObsGts) {
        beforePropertyWrite("nbObsGts", this.nbObsGts, nbObsGts);
        this.nbObsGts = nbObsGts;
    }

    public BigDecimal getNbObsGts() {
        beforePropertyRead("nbObsGts");
        return this.nbObsGts;
    }

    public void setPtfId(BigDecimal ptfId) {
        beforePropertyWrite("ptfId", this.ptfId, ptfId);
        this.ptfId = ptfId;
    }

    public BigDecimal getPtfId() {
        beforePropertyRead("ptfId");
        return this.ptfId;
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
            case "delayAvg":
                return this.delayAvg;
            case "delayAvgGdac1":
                return this.delayAvgGdac1;
            case "delayAvgGdac2":
                return this.delayAvgGdac2;
            case "delayMedian":
                return this.delayMedian;
            case "delayMedianGdac1":
                return this.delayMedianGdac1;
            case "delayMedianGdac2":
                return this.delayMedianGdac2;
            case "nbObs":
                return this.nbObs;
            case "nbObsDm":
                return this.nbObsDm;
            case "nbObsDmEligible":
                return this.nbObsDmEligible;
            case "nbObsDmEligibleGdac1":
                return this.nbObsDmEligibleGdac1;
            case "nbObsDmEligibleGdac2":
                return this.nbObsDmEligibleGdac2;
            case "nbObsDmGdac1":
                return this.nbObsDmGdac1;
            case "nbObsDmGdac2":
                return this.nbObsDmGdac2;
            case "nbObsGdac1":
                return this.nbObsGdac1;
            case "nbObsGdac2":
                return this.nbObsGdac2;
            case "nbObsGts":
                return this.nbObsGts;
            case "ptfId":
                return this.ptfId;
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
            case "delayAvg":
                this.delayAvg = (BigDecimal)val;
                break;
            case "delayAvgGdac1":
                this.delayAvgGdac1 = (BigDecimal)val;
                break;
            case "delayAvgGdac2":
                this.delayAvgGdac2 = (BigDecimal)val;
                break;
            case "delayMedian":
                this.delayMedian = (BigDecimal)val;
                break;
            case "delayMedianGdac1":
                this.delayMedianGdac1 = (BigDecimal)val;
                break;
            case "delayMedianGdac2":
                this.delayMedianGdac2 = (BigDecimal)val;
                break;
            case "nbObs":
                this.nbObs = (BigDecimal)val;
                break;
            case "nbObsDm":
                this.nbObsDm = (BigDecimal)val;
                break;
            case "nbObsDmEligible":
                this.nbObsDmEligible = (BigDecimal)val;
                break;
            case "nbObsDmEligibleGdac1":
                this.nbObsDmEligibleGdac1 = (BigDecimal)val;
                break;
            case "nbObsDmEligibleGdac2":
                this.nbObsDmEligibleGdac2 = (BigDecimal)val;
                break;
            case "nbObsDmGdac1":
                this.nbObsDmGdac1 = (BigDecimal)val;
                break;
            case "nbObsDmGdac2":
                this.nbObsDmGdac2 = (BigDecimal)val;
                break;
            case "nbObsGdac1":
                this.nbObsGdac1 = (BigDecimal)val;
                break;
            case "nbObsGdac2":
                this.nbObsGdac2 = (BigDecimal)val;
                break;
            case "nbObsGts":
                this.nbObsGts = (BigDecimal)val;
                break;
            case "ptfId":
                this.ptfId = (BigDecimal)val;
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
        out.writeObject(this.delayAvg);
        out.writeObject(this.delayAvgGdac1);
        out.writeObject(this.delayAvgGdac2);
        out.writeObject(this.delayMedian);
        out.writeObject(this.delayMedianGdac1);
        out.writeObject(this.delayMedianGdac2);
        out.writeObject(this.nbObs);
        out.writeObject(this.nbObsDm);
        out.writeObject(this.nbObsDmEligible);
        out.writeObject(this.nbObsDmEligibleGdac1);
        out.writeObject(this.nbObsDmEligibleGdac2);
        out.writeObject(this.nbObsDmGdac1);
        out.writeObject(this.nbObsDmGdac2);
        out.writeObject(this.nbObsGdac1);
        out.writeObject(this.nbObsGdac2);
        out.writeObject(this.nbObsGts);
        out.writeObject(this.ptfId);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.delayAvg = (BigDecimal)in.readObject();
        this.delayAvgGdac1 = (BigDecimal)in.readObject();
        this.delayAvgGdac2 = (BigDecimal)in.readObject();
        this.delayMedian = (BigDecimal)in.readObject();
        this.delayMedianGdac1 = (BigDecimal)in.readObject();
        this.delayMedianGdac2 = (BigDecimal)in.readObject();
        this.nbObs = (BigDecimal)in.readObject();
        this.nbObsDm = (BigDecimal)in.readObject();
        this.nbObsDmEligible = (BigDecimal)in.readObject();
        this.nbObsDmEligibleGdac1 = (BigDecimal)in.readObject();
        this.nbObsDmEligibleGdac2 = (BigDecimal)in.readObject();
        this.nbObsDmGdac1 = (BigDecimal)in.readObject();
        this.nbObsDmGdac2 = (BigDecimal)in.readObject();
        this.nbObsGdac1 = (BigDecimal)in.readObject();
        this.nbObsGdac2 = (BigDecimal)in.readObject();
        this.nbObsGts = (BigDecimal)in.readObject();
        this.ptfId = (BigDecimal)in.readObject();
        this.ptf = in.readObject();
    }

}
