package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _GtsCcccHeader was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsCcccHeader extends CayenneDataObject {

    public static final String GTS_CCCC_ID_PROPERTY = "gtsCcccId";
    public static final String GTS_HEADER_ID_PROPERTY = "gtsHeaderId";
    public static final String GTS_CCCC_PROPERTY = "gtsCccc";
    public static final String GTS_HEADER_PROPERTY = "gtsHeader";

    public static final String GTS_CCCC_ID_PK_COLUMN = "GTS_CCCC_ID";
    public static final String GTS_HEADER_ID_PK_COLUMN = "GTS_HEADER_ID";

    public void setGtsCcccId(Integer gtsCcccId) {
        writeProperty(GTS_CCCC_ID_PROPERTY, gtsCcccId);
    }
    public Integer getGtsCcccId() {
        return (Integer)readProperty(GTS_CCCC_ID_PROPERTY);
    }

    public void setGtsHeaderId(Integer gtsHeaderId) {
        writeProperty(GTS_HEADER_ID_PROPERTY, gtsHeaderId);
    }
    public Integer getGtsHeaderId() {
        return (Integer)readProperty(GTS_HEADER_ID_PROPERTY);
    }

    public void setGtsCccc(GtsCccc gtsCccc) {
        setToOneTarget(GTS_CCCC_PROPERTY, gtsCccc, true);
    }

    public GtsCccc getGtsCccc() {
        return (GtsCccc)readProperty(GTS_CCCC_PROPERTY);
    }


    public void setGtsHeader(GtsHeader gtsHeader) {
        setToOneTarget(GTS_HEADER_PROPERTY, gtsHeader, true);
    }

    public GtsHeader getGtsHeader() {
        return (GtsHeader)readProperty(GTS_HEADER_PROPERTY);
    }


}
