package org.jcommops.api.orm;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Wmo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Wmo extends CayenneDataObject {

    public static final String END_DATE_PROPERTY = "endDate";
    public static final String MASK_PROPERTY = "mask";
    public static final String START_DATE_PROPERTY = "startDate";
    public static final String WMO_PROPERTY = "wmo";
    public static final String TO_PTF_PROPERTY = "toPtf";

    public static final String ID_PK_COLUMN = "ID";

    public void setEndDate(Date endDate) {
        writeProperty(END_DATE_PROPERTY, endDate);
    }
    public Date getEndDate() {
        return (Date)readProperty(END_DATE_PROPERTY);
    }

    public void setMask(Integer mask) {
        writeProperty(MASK_PROPERTY, mask);
    }
    public Integer getMask() {
        return (Integer)readProperty(MASK_PROPERTY);
    }

    public void setStartDate(Date startDate) {
        writeProperty(START_DATE_PROPERTY, startDate);
    }
    public Date getStartDate() {
        return (Date)readProperty(START_DATE_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

    public void setToPtf(Ptf toPtf) {
        setToOneTarget(TO_PTF_PROPERTY, toPtf, true);
    }

    public Ptf getToPtf() {
        return (Ptf)readProperty(TO_PTF_PROPERTY);
    }


}