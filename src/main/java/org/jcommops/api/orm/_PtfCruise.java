package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _PtfCruise was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfCruise extends CayenneDataObject {

    public static final String TO_CRUISE_PROPERTY = "toCruise";
    public static final String TO_PTF_PROPERTY = "toPtf";

    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";
    public static final String PTF_ID_PK_COLUMN = "PTF_ID";

    public void setToCruise(Cruise toCruise) {
        setToOneTarget(TO_CRUISE_PROPERTY, toCruise, true);
    }

    public Cruise getToCruise() {
        return (Cruise)readProperty(TO_CRUISE_PROPERTY);
    }


    public void setToPtf(Ptf toPtf) {
        setToOneTarget(TO_PTF_PROPERTY, toPtf, true);
    }

    public Ptf getToPtf() {
        return (Ptf)readProperty(TO_PTF_PROPERTY);
    }


}