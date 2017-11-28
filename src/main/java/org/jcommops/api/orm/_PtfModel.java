package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _PtfModel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfModel extends CayenneDataObject {

    public static final String AIR_DEPL_CERTIF_PROPERTY = "airDeplCertif";
    public static final String COMMERCIAL_PROPERTY = "commercial";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String DIAMETER_PROPERTY = "diameter";
    public static final String DROGUE_PROPERTY = "drogue";
    public static final String DROGUE_DEPTH_PROPERTY = "drogueDepth";
    public static final String DROGUE_TYPE_PROPERTY = "drogueType";
    public static final String HEIGHT_PROPERTY = "height";
    public static final String HEIGHT_ABOVE_PROPERTY = "heightAbove";
    public static final String HULL_DEPTH_PROPERTY = "hullDepth";
    public static final String ID_PROPERTY = "id";
    public static final String KEY_PROPERTY = "key";
    public static final String LENGTH_PROPERTY = "length";
    public static final String LIFE_TIME_PROPERTY = "lifeTime";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String TOTAL_HEIGHT_PROPERTY = "totalHeight";
    public static final String WEIGHT_PROPERTY = "weight";
    public static final String WIDTH_PROPERTY = "width";
    public static final String AGENCY_PROPERTY = "agency";
    public static final String CONTACT_PROPERTY = "contact";
    public static final String GTS_INSTRUMENT_TYPE_PROPERTY = "gtsInstrumentType";
    public static final String HULL_TYPE_PROPERTY = "hullType";
    public static final String IMAGE_PROPERTY = "image";
    public static final String MASTER_PROG_PROPERTY = "masterProg";
    public static final String PTF_TYPE_PROPERTY = "ptfType";
    public static final String PTFS_PROPERTY = "ptfs";
    public static final String TELECOM_FORMATS_PROPERTY = "telecomFormats";
    public static final String WEBLINK_PROPERTY = "weblink";

    public static final String ID_PK_COLUMN = "ID";

    public void setAirDeplCertif(Integer airDeplCertif) {
        writeProperty(AIR_DEPL_CERTIF_PROPERTY, airDeplCertif);
    }
    public Integer getAirDeplCertif() {
        return (Integer)readProperty(AIR_DEPL_CERTIF_PROPERTY);
    }

    public void setCommercial(Integer commercial) {
        writeProperty(COMMERCIAL_PROPERTY, commercial);
    }
    public Integer getCommercial() {
        return (Integer)readProperty(COMMERCIAL_PROPERTY);
    }

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setDiameter(Integer diameter) {
        writeProperty(DIAMETER_PROPERTY, diameter);
    }
    public Integer getDiameter() {
        return (Integer)readProperty(DIAMETER_PROPERTY);
    }

    public void setDrogue(Integer drogue) {
        writeProperty(DROGUE_PROPERTY, drogue);
    }
    public Integer getDrogue() {
        return (Integer)readProperty(DROGUE_PROPERTY);
    }

    public void setDrogueDepth(BigDecimal drogueDepth) {
        writeProperty(DROGUE_DEPTH_PROPERTY, drogueDepth);
    }
    public BigDecimal getDrogueDepth() {
        return (BigDecimal)readProperty(DROGUE_DEPTH_PROPERTY);
    }

    public void setDrogueType(String drogueType) {
        writeProperty(DROGUE_TYPE_PROPERTY, drogueType);
    }
    public String getDrogueType() {
        return (String)readProperty(DROGUE_TYPE_PROPERTY);
    }

    public void setHeight(Integer height) {
        writeProperty(HEIGHT_PROPERTY, height);
    }
    public Integer getHeight() {
        return (Integer)readProperty(HEIGHT_PROPERTY);
    }

    public void setHeightAbove(BigDecimal heightAbove) {
        writeProperty(HEIGHT_ABOVE_PROPERTY, heightAbove);
    }
    public BigDecimal getHeightAbove() {
        return (BigDecimal)readProperty(HEIGHT_ABOVE_PROPERTY);
    }

    public void setHullDepth(Integer hullDepth) {
        writeProperty(HULL_DEPTH_PROPERTY, hullDepth);
    }
    public Integer getHullDepth() {
        return (Integer)readProperty(HULL_DEPTH_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setKey(String key) {
        writeProperty(KEY_PROPERTY, key);
    }
    public String getKey() {
        return (String)readProperty(KEY_PROPERTY);
    }

    public void setLength(Integer length) {
        writeProperty(LENGTH_PROPERTY, length);
    }
    public Integer getLength() {
        return (Integer)readProperty(LENGTH_PROPERTY);
    }

    public void setLifeTime(String lifeTime) {
        writeProperty(LIFE_TIME_PROPERTY, lifeTime);
    }
    public String getLifeTime() {
        return (String)readProperty(LIFE_TIME_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void setTotalHeight(BigDecimal totalHeight) {
        writeProperty(TOTAL_HEIGHT_PROPERTY, totalHeight);
    }
    public BigDecimal getTotalHeight() {
        return (BigDecimal)readProperty(TOTAL_HEIGHT_PROPERTY);
    }

    public void setWeight(BigDecimal weight) {
        writeProperty(WEIGHT_PROPERTY, weight);
    }
    public BigDecimal getWeight() {
        return (BigDecimal)readProperty(WEIGHT_PROPERTY);
    }

    public void setWidth(BigDecimal width) {
        writeProperty(WIDTH_PROPERTY, width);
    }
    public BigDecimal getWidth() {
        return (BigDecimal)readProperty(WIDTH_PROPERTY);
    }

    public void setAgency(Agency agency) {
        setToOneTarget(AGENCY_PROPERTY, agency, true);
    }

    public Agency getAgency() {
        return (Agency)readProperty(AGENCY_PROPERTY);
    }


    public void setContact(Contact contact) {
        setToOneTarget(CONTACT_PROPERTY, contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty(CONTACT_PROPERTY);
    }


    public void setGtsInstrumentType(GtsInstrumentType gtsInstrumentType) {
        setToOneTarget(GTS_INSTRUMENT_TYPE_PROPERTY, gtsInstrumentType, true);
    }

    public GtsInstrumentType getGtsInstrumentType() {
        return (GtsInstrumentType)readProperty(GTS_INSTRUMENT_TYPE_PROPERTY);
    }


    public void setHullType(PtfHullType hullType) {
        setToOneTarget(HULL_TYPE_PROPERTY, hullType, true);
    }

    public PtfHullType getHullType() {
        return (PtfHullType)readProperty(HULL_TYPE_PROPERTY);
    }


    public void setImage(Image image) {
        setToOneTarget(IMAGE_PROPERTY, image, true);
    }

    public Image getImage() {
        return (Image)readProperty(IMAGE_PROPERTY);
    }


    public void setMasterProg(MasterProg masterProg) {
        setToOneTarget(MASTER_PROG_PROPERTY, masterProg, true);
    }

    public MasterProg getMasterProg() {
        return (MasterProg)readProperty(MASTER_PROG_PROPERTY);
    }


    public void setPtfType(PtfType ptfType) {
        setToOneTarget(PTF_TYPE_PROPERTY, ptfType, true);
    }

    public PtfType getPtfType() {
        return (PtfType)readProperty(PTF_TYPE_PROPERTY);
    }


    public void addToPtfs(Ptf obj) {
        addToManyTarget(PTFS_PROPERTY, obj, true);
    }
    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget(PTFS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty(PTFS_PROPERTY);
    }


    public void addToTelecomFormats(TelecomFormat obj) {
        addToManyTarget(TELECOM_FORMATS_PROPERTY, obj, true);
    }
    public void removeFromTelecomFormats(TelecomFormat obj) {
        removeToManyTarget(TELECOM_FORMATS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TelecomFormat> getTelecomFormats() {
        return (List<TelecomFormat>)readProperty(TELECOM_FORMATS_PROPERTY);
    }


    public void setWeblink(Weblink weblink) {
        setToOneTarget(WEBLINK_PROPERTY, weblink, true);
    }

    public Weblink getWeblink() {
        return (Weblink)readProperty(WEBLINK_PROPERTY);
    }


}
