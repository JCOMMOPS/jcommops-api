package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _PtfDeployment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfDeployment extends CayenneDataObject {

    public static final String CRUISE_NAME_PROPERTY = "cruiseName";
    public static final String CTD_PROPERTY = "ctd";
    public static final String CTD_REF_PROPERTY = "ctdRef";
    public static final String CTDO2_PROPERTY = "ctdo2";
    public static final String DENSITY_PROPERTY = "density";
    public static final String DEPL_DATE_PROPERTY = "deplDate";
    public static final String DEPL_HEIGHT_PROPERTY = "deplHeight";
    public static final String DEPL_SPEED_PROPERTY = "deplSpeed";
    public static final String LABEL_PROPERTY = "label";
    public static final String LAT_PROPERTY = "lat";
    public static final String LON_PROPERTY = "lon";
    public static final String SCORE_PROPERTY = "score";
    public static final String SHAPE_PROPERTY = "shape";
    public static final String SHIP_NAME_PROPERTY = "shipName";
    public static final String WIND_SPEED_PROPERTY = "windSpeed";
    public static final String PTF_ARRAY_PROPERTY = "ptfArray";
    public static final String TO_BUFRCODEFLAG_PROPERTY = "toBufrcodeflag";
    public static final String TO_BUFRCODEFLAG1_PROPERTY = "toBufrcodeflag1";
    public static final String TO_CONTACT_PROPERTY = "toContact";
    public static final String TO_COUNTRY_PROPERTY = "toCountry";
    public static final String TO_CRUISE_PROPERTY = "toCruise";
    public static final String TO_DEPL_METHOD_PROPERTY = "toDeplMethod";
    public static final String TO_DEPL_TYPE_PROPERTY = "toDeplType";
    public static final String TO_PACKAGE_TYPE_PROPERTY = "toPackageType";
    public static final String TO_SHIP_PROPERTY = "toShip";

    public static final String ID_PK_COLUMN = "ID";

    public void setCruiseName(String cruiseName) {
        writeProperty(CRUISE_NAME_PROPERTY, cruiseName);
    }
    public String getCruiseName() {
        return (String)readProperty(CRUISE_NAME_PROPERTY);
    }

    public void setCtd(Integer ctd) {
        writeProperty(CTD_PROPERTY, ctd);
    }
    public Integer getCtd() {
        return (Integer)readProperty(CTD_PROPERTY);
    }

    public void setCtdRef(String ctdRef) {
        writeProperty(CTD_REF_PROPERTY, ctdRef);
    }
    public String getCtdRef() {
        return (String)readProperty(CTD_REF_PROPERTY);
    }

    public void setCtdo2(Integer ctdo2) {
        writeProperty(CTDO2_PROPERTY, ctdo2);
    }
    public Integer getCtdo2() {
        return (Integer)readProperty(CTDO2_PROPERTY);
    }

    public void setDensity(BigDecimal density) {
        writeProperty(DENSITY_PROPERTY, density);
    }
    public BigDecimal getDensity() {
        return (BigDecimal)readProperty(DENSITY_PROPERTY);
    }

    public void setDeplDate(Date deplDate) {
        writeProperty(DEPL_DATE_PROPERTY, deplDate);
    }
    public Date getDeplDate() {
        return (Date)readProperty(DEPL_DATE_PROPERTY);
    }

    public void setDeplHeight(BigDecimal deplHeight) {
        writeProperty(DEPL_HEIGHT_PROPERTY, deplHeight);
    }
    public BigDecimal getDeplHeight() {
        return (BigDecimal)readProperty(DEPL_HEIGHT_PROPERTY);
    }

    public void setDeplSpeed(BigDecimal deplSpeed) {
        writeProperty(DEPL_SPEED_PROPERTY, deplSpeed);
    }
    public BigDecimal getDeplSpeed() {
        return (BigDecimal)readProperty(DEPL_SPEED_PROPERTY);
    }

    public void setLabel(Integer label) {
        writeProperty(LABEL_PROPERTY, label);
    }
    public Integer getLabel() {
        return (Integer)readProperty(LABEL_PROPERTY);
    }

    public void setLat(BigDecimal lat) {
        writeProperty(LAT_PROPERTY, lat);
    }
    public BigDecimal getLat() {
        return (BigDecimal)readProperty(LAT_PROPERTY);
    }

    public void setLon(BigDecimal lon) {
        writeProperty(LON_PROPERTY, lon);
    }
    public BigDecimal getLon() {
        return (BigDecimal)readProperty(LON_PROPERTY);
    }

    public void setScore(BigDecimal score) {
        writeProperty(SCORE_PROPERTY, score);
    }
    public BigDecimal getScore() {
        return (BigDecimal)readProperty(SCORE_PROPERTY);
    }

    /**public void setShape($importUtils.formatJavaType(${attr.Type}) shape) {
        writeProperty(SHAPE_PROPERTY, shape);
    }
    public $importUtils.formatJavaType(${attr.Type}) getShape() {
        return ($importUtils.formatJavaType(${attr.Type}))readProperty(SHAPE_PROPERTY);
    }**/

    public void setShipName(String shipName) {
        writeProperty(SHIP_NAME_PROPERTY, shipName);
    }
    public String getShipName() {
        return (String)readProperty(SHIP_NAME_PROPERTY);
    }

    public void setWindSpeed(Integer windSpeed) {
        writeProperty(WIND_SPEED_PROPERTY, windSpeed);
    }
    public Integer getWindSpeed() {
        return (Integer)readProperty(WIND_SPEED_PROPERTY);
    }

    public void addToPtfArray(Ptf obj) {
        addToManyTarget(PTF_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfArray(Ptf obj) {
        removeToManyTarget(PTF_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfArray() {
        return (List<Ptf>)readProperty(PTF_ARRAY_PROPERTY);
    }


    public void setToBufrcodeflag(Bufrcodeflag toBufrcodeflag) {
        setToOneTarget(TO_BUFRCODEFLAG_PROPERTY, toBufrcodeflag, true);
    }

    public Bufrcodeflag getToBufrcodeflag() {
        return (Bufrcodeflag)readProperty(TO_BUFRCODEFLAG_PROPERTY);
    }


    public void setToBufrcodeflag1(Bufrcodeflag toBufrcodeflag1) {
        setToOneTarget(TO_BUFRCODEFLAG1_PROPERTY, toBufrcodeflag1, true);
    }

    public Bufrcodeflag getToBufrcodeflag1() {
        return (Bufrcodeflag)readProperty(TO_BUFRCODEFLAG1_PROPERTY);
    }


    public void setToContact(Contact toContact) {
        setToOneTarget(TO_CONTACT_PROPERTY, toContact, true);
    }

    public Contact getToContact() {
        return (Contact)readProperty(TO_CONTACT_PROPERTY);
    }


    public void setToCountry(Country toCountry) {
        setToOneTarget(TO_COUNTRY_PROPERTY, toCountry, true);
    }

    public Country getToCountry() {
        return (Country)readProperty(TO_COUNTRY_PROPERTY);
    }


    public void setToCruise(Cruise toCruise) {
        setToOneTarget(TO_CRUISE_PROPERTY, toCruise, true);
    }

    public Cruise getToCruise() {
        return (Cruise)readProperty(TO_CRUISE_PROPERTY);
    }


    public void setToDeplMethod(DeplMethod toDeplMethod) {
        setToOneTarget(TO_DEPL_METHOD_PROPERTY, toDeplMethod, true);
    }

    public DeplMethod getToDeplMethod() {
        return (DeplMethod)readProperty(TO_DEPL_METHOD_PROPERTY);
    }


    public void setToDeplType(DeplType toDeplType) {
        setToOneTarget(TO_DEPL_TYPE_PROPERTY, toDeplType, true);
    }

    public DeplType getToDeplType() {
        return (DeplType)readProperty(TO_DEPL_TYPE_PROPERTY);
    }


    public void setToPackageType(PackageType toPackageType) {
        setToOneTarget(TO_PACKAGE_TYPE_PROPERTY, toPackageType, true);
    }

    public PackageType getToPackageType() {
        return (PackageType)readProperty(TO_PACKAGE_TYPE_PROPERTY);
    }


    public void setToShip(Ship toShip) {
        setToOneTarget(TO_SHIP_PROPERTY, toShip, true);
    }

    public Ship getToShip() {
        return (Ship)readProperty(TO_SHIP_PROPERTY);
    }


}