package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _AomlPtfModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AomlPtfModel extends CayenneDataObject {

    public static final String AOML_MANUF_PROPERTY = "aomlManuf";
    public static final String AOML_MODEL_PROPERTY = "aomlModel";
    public static final String PTF_MODEL_ID_PROPERTY = "ptfModelId";


    public void setAomlManuf(String aomlManuf) {
        writeProperty(AOML_MANUF_PROPERTY, aomlManuf);
    }
    public String getAomlManuf() {
        return (String)readProperty(AOML_MANUF_PROPERTY);
    }

    public void setAomlModel(String aomlModel) {
        writeProperty(AOML_MODEL_PROPERTY, aomlModel);
    }
    public String getAomlModel() {
        return (String)readProperty(AOML_MODEL_PROPERTY);
    }

    public void setPtfModelId(Integer ptfModelId) {
        writeProperty(PTF_MODEL_ID_PROPERTY, ptfModelId);
    }
    public Integer getPtfModelId() {
        return (Integer)readProperty(PTF_MODEL_ID_PROPERTY);
    }

}