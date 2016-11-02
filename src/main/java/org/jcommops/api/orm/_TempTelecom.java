package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _TempTelecom was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TempTelecom extends CayenneDataObject {

    public static final String END_DATE_PROPERTY = "endDate";
    public static final String ID_PROPERTY = "id";
    public static final String IMEI_PROPERTY = "imei";
    public static final String NUM_PROPERTY = "num";
    public static final String REF_PROG_PROPERTY = "refProg";
    public static final String REPETITION_RATE_PROPERTY = "repetitionRate";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String TELECOM_FORMAT_ID_PROPERTY = "telecomFormatId";
    public static final String TELECOM_TYPE_ID_PROPERTY = "telecomTypeId";


    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setImei(String imei) {
        writeProperty(IMEI_PROPERTY, imei);
    }
    public String getImei() {
        return (String)readProperty(IMEI_PROPERTY);
    }

    public void setNum(String num) {
        writeProperty(NUM_PROPERTY, num);
    }
    public String getNum() {
        return (String)readProperty(NUM_PROPERTY);
    }

    public void setRefProg(String refProg) {
        writeProperty(REF_PROG_PROPERTY, refProg);
    }
    public String getRefProg() {
        return (String)readProperty(REF_PROG_PROPERTY);
    }

    public void setRepetitionRate(BigDecimal repetitionRate) {
        writeProperty(REPETITION_RATE_PROPERTY, repetitionRate);
    }
    public BigDecimal getRepetitionRate() {
        return (BigDecimal)readProperty(REPETITION_RATE_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setTelecomFormatId(Integer telecomFormatId) {
        writeProperty(TELECOM_FORMAT_ID_PROPERTY, telecomFormatId);
    }
    public Integer getTelecomFormatId() {
        return (Integer)readProperty(TELECOM_FORMAT_ID_PROPERTY);
    }

    public void setTelecomTypeId(Integer telecomTypeId) {
        writeProperty(TELECOM_TYPE_ID_PROPERTY, telecomTypeId);
    }
    public Integer getTelecomTypeId() {
        return (Integer)readProperty(TELECOM_TYPE_ID_PROPERTY);
    }

}