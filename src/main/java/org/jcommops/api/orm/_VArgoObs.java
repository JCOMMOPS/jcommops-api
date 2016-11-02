package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VArgoObs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VArgoObs extends CayenneDataObject {

    public static final String DAC_PROPERTY = "dac";
    public static final String DATA_FORMAT_PROPERTY = "dataFormat";
    public static final String DELAY_DAC_PROPERTY = "delayDac";
    public static final String DELAY_GDAC_PROPERTY = "delayGdac";
    public static final String DELAY_TOTAL_PROPERTY = "delayTotal";
    public static final String GDAC_PROPERTY = "gdac";
    public static final String OBS_DATA_STATUS_PROPERTY = "obsDataStatus";
    public static final String OBS_DATE_PROPERTY = "obsDate";
    public static final String OBS_ID_PROPERTY = "obsId";
    public static final String OBS_LOC_LAT_PROPERTY = "obsLocLat";
    public static final String OBS_LOC_LON_PROPERTY = "obsLocLon";
    public static final String PTF_REF_PROPERTY = "ptfRef";


    public void setDac(String dac) {
        writeProperty(DAC_PROPERTY, dac);
    }
    public String getDac() {
        return (String)readProperty(DAC_PROPERTY);
    }

    public void setDataFormat(String dataFormat) {
        writeProperty(DATA_FORMAT_PROPERTY, dataFormat);
    }
    public String getDataFormat() {
        return (String)readProperty(DATA_FORMAT_PROPERTY);
    }

    public void setDelayDac(Integer delayDac) {
        writeProperty(DELAY_DAC_PROPERTY, delayDac);
    }
    public Integer getDelayDac() {
        return (Integer)readProperty(DELAY_DAC_PROPERTY);
    }

    public void setDelayGdac(Integer delayGdac) {
        writeProperty(DELAY_GDAC_PROPERTY, delayGdac);
    }
    public Integer getDelayGdac() {
        return (Integer)readProperty(DELAY_GDAC_PROPERTY);
    }

    public void setDelayTotal(Integer delayTotal) {
        writeProperty(DELAY_TOTAL_PROPERTY, delayTotal);
    }
    public Integer getDelayTotal() {
        return (Integer)readProperty(DELAY_TOTAL_PROPERTY);
    }

    public void setGdac(String gdac) {
        writeProperty(GDAC_PROPERTY, gdac);
    }
    public String getGdac() {
        return (String)readProperty(GDAC_PROPERTY);
    }

    public void setObsDataStatus(String obsDataStatus) {
        writeProperty(OBS_DATA_STATUS_PROPERTY, obsDataStatus);
    }
    public String getObsDataStatus() {
        return (String)readProperty(OBS_DATA_STATUS_PROPERTY);
    }

    public void setObsDate(Date obsDate) {
        writeProperty(OBS_DATE_PROPERTY, obsDate);
    }
    public Date getObsDate() {
        return (Date)readProperty(OBS_DATE_PROPERTY);
    }

    public void setObsId(Integer obsId) {
        writeProperty(OBS_ID_PROPERTY, obsId);
    }
    public Integer getObsId() {
        return (Integer)readProperty(OBS_ID_PROPERTY);
    }

    public void setObsLocLat(BigDecimal obsLocLat) {
        writeProperty(OBS_LOC_LAT_PROPERTY, obsLocLat);
    }
    public BigDecimal getObsLocLat() {
        return (BigDecimal)readProperty(OBS_LOC_LAT_PROPERTY);
    }

    public void setObsLocLon(BigDecimal obsLocLon) {
        writeProperty(OBS_LOC_LON_PROPERTY, obsLocLon);
    }
    public BigDecimal getObsLocLon() {
        return (BigDecimal)readProperty(OBS_LOC_LON_PROPERTY);
    }

    public void setPtfRef(String ptfRef) {
        writeProperty(PTF_REF_PROPERTY, ptfRef);
    }
    public String getPtfRef() {
        return (String)readProperty(PTF_REF_PROPERTY);
    }

}