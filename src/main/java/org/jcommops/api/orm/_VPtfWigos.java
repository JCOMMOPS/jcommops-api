package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VPtfWigos was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VPtfWigos extends CayenneDataObject {

    public static final String COUNTRY_ID_PROPERTY = "countryId";
    public static final String COUNTRY_ISO2_PROPERTY = "countryIso2";
    public static final String COUNTRY_ISO3_PROPERTY = "countryIso3";
    public static final String COUNTRY_NAME_PROPERTY = "countryName";
    public static final String DEPL_DATE_PROPERTY = "deplDate";
    public static final String DEPL_ID_PROPERTY = "deplId";
    public static final String DEPL_LAT_PROPERTY = "deplLat";
    public static final String DEPL_LON_PROPERTY = "deplLon";
    public static final String ENDING_DATE_PROPERTY = "endingDate";
    public static final String LAST_LOC_DATE_PROPERTY = "lastLocDate";
    public static final String LAST_LOC_ELEVATION_PROPERTY = "lastLocElevation";
    public static final String LAST_LOC_ID_PROPERTY = "lastLocId";
    public static final String LAST_LOC_LAT_PROPERTY = "lastLocLat";
    public static final String LAST_LOC_LON_PROPERTY = "lastLocLon";
    public static final String MASTERPROG_ID_PROPERTY = "masterprogId";
    public static final String MASTERPROG_NAME_PROPERTY = "masterprogName";
    public static final String MASTERPROG_NAME_SHORT_PROPERTY = "masterprogNameShort";
    public static final String PROG_ACTIVE_PROPERTY = "progActive";
    public static final String PROG_DESC_PROPERTY = "progDesc";
    public static final String PROG_ID_PROPERTY = "progId";
    public static final String PROG_NAME_PROPERTY = "progName";
    public static final String PROG_NAME_SHORT_PROPERTY = "progNameShort";
    public static final String PTF_FAMILY_DESCRIPTION_PROPERTY = "ptfFamilyDescription";
    public static final String PTF_FAMILY_ID_PROPERTY = "ptfFamilyId";
    public static final String PTF_FAMILY_NAME_PROPERTY = "ptfFamilyName";
    public static final String PTF_FAMILY_NAME_SHORT_PROPERTY = "ptfFamilyNameShort";
    public static final String PTF_ID_PROPERTY = "ptfId";
    public static final String PTF_MODEL_DESCRIPTION_PROPERTY = "ptfModelDescription";
    public static final String PTF_MODEL_ID_PROPERTY = "ptfModelId";
    public static final String PTF_MODEL_NAME_PROPERTY = "ptfModelName";
    public static final String PTF_MODEL_NAME_SHORT_PROPERTY = "ptfModelNameShort";
    public static final String PTF_STATUS_PROPERTY = "ptfStatus";
    public static final String PTF_STATUS_ID_PROPERTY = "ptfStatusId";
    public static final String PTF_TYPE_DESCRIPTION_PROPERTY = "ptfTypeDescription";
    public static final String PTF_TYPE_ID_PROPERTY = "ptfTypeId";
    public static final String PTF_TYPE_NAME_PROPERTY = "ptfTypeName";
    public static final String PTF_TYPE_NAME_SHORT_PROPERTY = "ptfTypeNameShort";
    public static final String REF_PROPERTY = "ref";
    public static final String WIGOS_REF_PROPERTY = "wigosRef";


    public void setCountryId(Integer countryId) {
        writeProperty(COUNTRY_ID_PROPERTY, countryId);
    }
    public Integer getCountryId() {
        return (Integer)readProperty(COUNTRY_ID_PROPERTY);
    }

    public void setCountryIso2(String countryIso2) {
        writeProperty(COUNTRY_ISO2_PROPERTY, countryIso2);
    }
    public String getCountryIso2() {
        return (String)readProperty(COUNTRY_ISO2_PROPERTY);
    }

    public void setCountryIso3(String countryIso3) {
        writeProperty(COUNTRY_ISO3_PROPERTY, countryIso3);
    }
    public String getCountryIso3() {
        return (String)readProperty(COUNTRY_ISO3_PROPERTY);
    }

    public void setCountryName(String countryName) {
        writeProperty(COUNTRY_NAME_PROPERTY, countryName);
    }
    public String getCountryName() {
        return (String)readProperty(COUNTRY_NAME_PROPERTY);
    }

    public void setDeplDate(Date deplDate) {
        writeProperty(DEPL_DATE_PROPERTY, deplDate);
    }
    public Date getDeplDate() {
        return (Date)readProperty(DEPL_DATE_PROPERTY);
    }

    public void setDeplId(Integer deplId) {
        writeProperty(DEPL_ID_PROPERTY, deplId);
    }
    public Integer getDeplId() {
        return (Integer)readProperty(DEPL_ID_PROPERTY);
    }

    public void setDeplLat(BigDecimal deplLat) {
        writeProperty(DEPL_LAT_PROPERTY, deplLat);
    }
    public BigDecimal getDeplLat() {
        return (BigDecimal)readProperty(DEPL_LAT_PROPERTY);
    }

    public void setDeplLon(BigDecimal deplLon) {
        writeProperty(DEPL_LON_PROPERTY, deplLon);
    }
    public BigDecimal getDeplLon() {
        return (BigDecimal)readProperty(DEPL_LON_PROPERTY);
    }

    public void setEndingDate(Date endingDate) {
        writeProperty(ENDING_DATE_PROPERTY, endingDate);
    }
    public Date getEndingDate() {
        return (Date)readProperty(ENDING_DATE_PROPERTY);
    }

    public void setLastLocDate(Date lastLocDate) {
        writeProperty(LAST_LOC_DATE_PROPERTY, lastLocDate);
    }
    public Date getLastLocDate() {
        return (Date)readProperty(LAST_LOC_DATE_PROPERTY);
    }

    public void setLastLocElevation(BigDecimal lastLocElevation) {
        writeProperty(LAST_LOC_ELEVATION_PROPERTY, lastLocElevation);
    }
    public BigDecimal getLastLocElevation() {
        return (BigDecimal)readProperty(LAST_LOC_ELEVATION_PROPERTY);
    }

    public void setLastLocId(Integer lastLocId) {
        writeProperty(LAST_LOC_ID_PROPERTY, lastLocId);
    }
    public Integer getLastLocId() {
        return (Integer)readProperty(LAST_LOC_ID_PROPERTY);
    }

    public void setLastLocLat(Integer lastLocLat) {
        writeProperty(LAST_LOC_LAT_PROPERTY, lastLocLat);
    }
    public Integer getLastLocLat() {
        return (Integer)readProperty(LAST_LOC_LAT_PROPERTY);
    }

    public void setLastLocLon(Integer lastLocLon) {
        writeProperty(LAST_LOC_LON_PROPERTY, lastLocLon);
    }
    public Integer getLastLocLon() {
        return (Integer)readProperty(LAST_LOC_LON_PROPERTY);
    }

    public void setMasterprogId(Integer masterprogId) {
        writeProperty(MASTERPROG_ID_PROPERTY, masterprogId);
    }
    public Integer getMasterprogId() {
        return (Integer)readProperty(MASTERPROG_ID_PROPERTY);
    }

    public void setMasterprogName(String masterprogName) {
        writeProperty(MASTERPROG_NAME_PROPERTY, masterprogName);
    }
    public String getMasterprogName() {
        return (String)readProperty(MASTERPROG_NAME_PROPERTY);
    }

    public void setMasterprogNameShort(String masterprogNameShort) {
        writeProperty(MASTERPROG_NAME_SHORT_PROPERTY, masterprogNameShort);
    }
    public String getMasterprogNameShort() {
        return (String)readProperty(MASTERPROG_NAME_SHORT_PROPERTY);
    }

    public void setProgActive(Integer progActive) {
        writeProperty(PROG_ACTIVE_PROPERTY, progActive);
    }
    public Integer getProgActive() {
        return (Integer)readProperty(PROG_ACTIVE_PROPERTY);
    }

    public void setProgDesc(String progDesc) {
        writeProperty(PROG_DESC_PROPERTY, progDesc);
    }
    public String getProgDesc() {
        return (String)readProperty(PROG_DESC_PROPERTY);
    }

    public void setProgId(Integer progId) {
        writeProperty(PROG_ID_PROPERTY, progId);
    }
    public Integer getProgId() {
        return (Integer)readProperty(PROG_ID_PROPERTY);
    }

    public void setProgName(String progName) {
        writeProperty(PROG_NAME_PROPERTY, progName);
    }
    public String getProgName() {
        return (String)readProperty(PROG_NAME_PROPERTY);
    }

    public void setProgNameShort(String progNameShort) {
        writeProperty(PROG_NAME_SHORT_PROPERTY, progNameShort);
    }
    public String getProgNameShort() {
        return (String)readProperty(PROG_NAME_SHORT_PROPERTY);
    }

    public void setPtfFamilyDescription(String ptfFamilyDescription) {
        writeProperty(PTF_FAMILY_DESCRIPTION_PROPERTY, ptfFamilyDescription);
    }
    public String getPtfFamilyDescription() {
        return (String)readProperty(PTF_FAMILY_DESCRIPTION_PROPERTY);
    }

    public void setPtfFamilyId(Integer ptfFamilyId) {
        writeProperty(PTF_FAMILY_ID_PROPERTY, ptfFamilyId);
    }
    public Integer getPtfFamilyId() {
        return (Integer)readProperty(PTF_FAMILY_ID_PROPERTY);
    }

    public void setPtfFamilyName(String ptfFamilyName) {
        writeProperty(PTF_FAMILY_NAME_PROPERTY, ptfFamilyName);
    }
    public String getPtfFamilyName() {
        return (String)readProperty(PTF_FAMILY_NAME_PROPERTY);
    }

    public void setPtfFamilyNameShort(String ptfFamilyNameShort) {
        writeProperty(PTF_FAMILY_NAME_SHORT_PROPERTY, ptfFamilyNameShort);
    }
    public String getPtfFamilyNameShort() {
        return (String)readProperty(PTF_FAMILY_NAME_SHORT_PROPERTY);
    }

    public void setPtfId(Integer ptfId) {
        writeProperty(PTF_ID_PROPERTY, ptfId);
    }
    public Integer getPtfId() {
        return (Integer)readProperty(PTF_ID_PROPERTY);
    }

    public void setPtfModelDescription(String ptfModelDescription) {
        writeProperty(PTF_MODEL_DESCRIPTION_PROPERTY, ptfModelDescription);
    }
    public String getPtfModelDescription() {
        return (String)readProperty(PTF_MODEL_DESCRIPTION_PROPERTY);
    }

    public void setPtfModelId(Integer ptfModelId) {
        writeProperty(PTF_MODEL_ID_PROPERTY, ptfModelId);
    }
    public Integer getPtfModelId() {
        return (Integer)readProperty(PTF_MODEL_ID_PROPERTY);
    }

    public void setPtfModelName(String ptfModelName) {
        writeProperty(PTF_MODEL_NAME_PROPERTY, ptfModelName);
    }
    public String getPtfModelName() {
        return (String)readProperty(PTF_MODEL_NAME_PROPERTY);
    }

    public void setPtfModelNameShort(String ptfModelNameShort) {
        writeProperty(PTF_MODEL_NAME_SHORT_PROPERTY, ptfModelNameShort);
    }
    public String getPtfModelNameShort() {
        return (String)readProperty(PTF_MODEL_NAME_SHORT_PROPERTY);
    }

    public void setPtfStatus(String ptfStatus) {
        writeProperty(PTF_STATUS_PROPERTY, ptfStatus);
    }
    public String getPtfStatus() {
        return (String)readProperty(PTF_STATUS_PROPERTY);
    }

    public void setPtfStatusId(Integer ptfStatusId) {
        writeProperty(PTF_STATUS_ID_PROPERTY, ptfStatusId);
    }
    public Integer getPtfStatusId() {
        return (Integer)readProperty(PTF_STATUS_ID_PROPERTY);
    }

    public void setPtfTypeDescription(String ptfTypeDescription) {
        writeProperty(PTF_TYPE_DESCRIPTION_PROPERTY, ptfTypeDescription);
    }
    public String getPtfTypeDescription() {
        return (String)readProperty(PTF_TYPE_DESCRIPTION_PROPERTY);
    }

    public void setPtfTypeId(Integer ptfTypeId) {
        writeProperty(PTF_TYPE_ID_PROPERTY, ptfTypeId);
    }
    public Integer getPtfTypeId() {
        return (Integer)readProperty(PTF_TYPE_ID_PROPERTY);
    }

    public void setPtfTypeName(String ptfTypeName) {
        writeProperty(PTF_TYPE_NAME_PROPERTY, ptfTypeName);
    }
    public String getPtfTypeName() {
        return (String)readProperty(PTF_TYPE_NAME_PROPERTY);
    }

    public void setPtfTypeNameShort(String ptfTypeNameShort) {
        writeProperty(PTF_TYPE_NAME_SHORT_PROPERTY, ptfTypeNameShort);
    }
    public String getPtfTypeNameShort() {
        return (String)readProperty(PTF_TYPE_NAME_SHORT_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

    public void setWigosRef(String wigosRef) {
        writeProperty(WIGOS_REF_PROPERTY, wigosRef);
    }
    public String getWigosRef() {
        return (String)readProperty(WIGOS_REF_PROPERTY);
    }

}