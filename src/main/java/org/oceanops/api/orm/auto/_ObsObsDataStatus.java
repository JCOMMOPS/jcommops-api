package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Obs;
import org.oceanops.api.orm.ObsDataStatus;

/**
 * Class _ObsObsDataStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ObsObsDataStatus extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String OBS_DATA_STATUS_ID_PK_COLUMN = "OBS_DATA_STATUS_ID";
    public static final String OBS_ID_PK_COLUMN = "OBS_ID";

    public static final NumericProperty<BigDecimal> OBS_DATA_STATUS_ID = PropertyFactory.createNumeric("obsDataStatusId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> OBS_ID = PropertyFactory.createNumeric("obsId", BigDecimal.class);
    public static final DateProperty<LocalDateTime> STATUS_DATE = PropertyFactory.createDate("statusDate", LocalDateTime.class);
    public static final EntityProperty<Obs> OBS = PropertyFactory.createEntity("obs", Obs.class);
    public static final EntityProperty<ObsDataStatus> OBS_DATA_STATUS = PropertyFactory.createEntity("obsDataStatus", ObsDataStatus.class);

    protected BigDecimal obsDataStatusId;
    protected BigDecimal obsId;
    protected LocalDateTime statusDate;

    protected Object obs;
    protected Object obsDataStatus;

    public void setObsDataStatusId(BigDecimal obsDataStatusId) {
        beforePropertyWrite("obsDataStatusId", this.obsDataStatusId, obsDataStatusId);
        this.obsDataStatusId = obsDataStatusId;
    }

    public BigDecimal getObsDataStatusId() {
        beforePropertyRead("obsDataStatusId");
        return this.obsDataStatusId;
    }

    public void setObsId(BigDecimal obsId) {
        beforePropertyWrite("obsId", this.obsId, obsId);
        this.obsId = obsId;
    }

    public BigDecimal getObsId() {
        beforePropertyRead("obsId");
        return this.obsId;
    }

    public void setStatusDate(LocalDateTime statusDate) {
        beforePropertyWrite("statusDate", this.statusDate, statusDate);
        this.statusDate = statusDate;
    }

    public LocalDateTime getStatusDate() {
        beforePropertyRead("statusDate");
        return this.statusDate;
    }

    public void setObs(Obs obs) {
        setToOneTarget("obs", obs, true);
    }

    public Obs getObs() {
        return (Obs)readProperty("obs");
    }

    public void setObsDataStatus(ObsDataStatus obsDataStatus) {
        setToOneTarget("obsDataStatus", obsDataStatus, true);
    }

    public ObsDataStatus getObsDataStatus() {
        return (ObsDataStatus)readProperty("obsDataStatus");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "obsDataStatusId":
                return this.obsDataStatusId;
            case "obsId":
                return this.obsId;
            case "statusDate":
                return this.statusDate;
            case "obs":
                return this.obs;
            case "obsDataStatus":
                return this.obsDataStatus;
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
            case "obsDataStatusId":
                this.obsDataStatusId = (BigDecimal)val;
                break;
            case "obsId":
                this.obsId = (BigDecimal)val;
                break;
            case "statusDate":
                this.statusDate = (LocalDateTime)val;
                break;
            case "obs":
                this.obs = val;
                break;
            case "obsDataStatus":
                this.obsDataStatus = val;
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
        out.writeObject(this.obsDataStatusId);
        out.writeObject(this.obsId);
        out.writeObject(this.statusDate);
        out.writeObject(this.obs);
        out.writeObject(this.obsDataStatus);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.obsDataStatusId = (BigDecimal)in.readObject();
        this.obsId = (BigDecimal)in.readObject();
        this.statusDate = (LocalDateTime)in.readObject();
        this.obs = in.readObject();
        this.obsDataStatus = in.readObject();
    }

}
