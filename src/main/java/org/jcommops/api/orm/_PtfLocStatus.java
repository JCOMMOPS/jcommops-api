package org.jcommops.api.orm;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _PtfLocStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfLocStatus extends CayenneDataObject {

    public static final String END_DATE_PROPERTY = "endDate";
    public static final String LOC_STATUS_ID_PROPERTY = "locStatusId";
    public static final String PTF_ID_PROPERTY = "ptfId";
    public static final String SOURCE_PROPERTY = "source";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String LOC_STATUS_PROPERTY = "locStatus";
    public static final String PTF_PROPERTY = "ptf";

    public static final String LOC_STATUS_ID_PK_COLUMN = "LOC_STATUS_ID";
    public static final String PTF_ID_PK_COLUMN = "PTF_ID";
    public static final String START_DATE_PK_COLUMN = "START_DATE";

    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setLocStatusId(Integer locStatusId) {
        writeProperty(LOC_STATUS_ID_PROPERTY, locStatusId);
    }
    public Integer getLocStatusId() {
        return (Integer)readProperty(LOC_STATUS_ID_PROPERTY);
    }

    public void setPtfId(Integer ptfId) {
        writeProperty(PTF_ID_PROPERTY, ptfId);
    }
    public Integer getPtfId() {
        return (Integer)readProperty(PTF_ID_PROPERTY);
    }

    public void setSource(String source) {
        writeProperty(SOURCE_PROPERTY, source);
    }
    public String getSource() {
        return (String)readProperty(SOURCE_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setLocStatus(LocStatus locStatus) {
        setToOneTarget(LOC_STATUS_PROPERTY, locStatus, true);
    }

    public LocStatus getLocStatus() {
        return (LocStatus)readProperty(LOC_STATUS_PROPERTY);
    }


    public void setPtf(Ptf ptf) {
        setToOneTarget(PTF_PROPERTY, ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty(PTF_PROPERTY);
    }


}
