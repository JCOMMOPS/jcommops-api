package org.jcommops.api.orm;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VShip was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VShip extends CayenneDataObject {

    public static final String AUTONOMY_PROPERTY = "autonomy";
    public static final String BREADTH_PROPERTY = "breadth";
    public static final String BRIDGE_PROPERTY = "bridge";
    public static final String BUOY_CAPACITY_PROPERTY = "buoyCapacity";
    public static final String CALL_SIGN_PROPERTY = "callSign";
    public static final String COMMISSIONED_DATE_PROPERTY = "commissionedDate";
    public static final String COUNTRY_PROPERTY = "country";
    public static final String COUNTRY_ISO2_PROPERTY = "countryIso2";
    public static final String DECOMMISSIONED_DATE_PROPERTY = "decommissionedDate";
    public static final String DRAUGHT_PROPERTY = "draught";
    public static final String FLOAT_CAPACITY_PROPERTY = "floatCapacity";
    public static final String FREEBOARD_PROPERTY = "freeboard";
    public static final String HEIGHT_PROPERTY = "height";
    public static final String HOME_PORT_PROPERTY = "homePort";
    public static final String ID_PROPERTY = "id";
    public static final String IMO_PROPERTY = "imo";
    public static final String LAST_UPDATE_PROPERTY = "lastUpdate";
    public static final String LENGTH_PROPERTY = "length";
    public static final String NAME_PROPERTY = "name";
    public static final String PASSENGER_CAPACITY_PROPERTY = "passengerCapacity";
    public static final String PREVIOUS_ID_PROPERTY = "previousId";
    public static final String REF_PROPERTY = "ref";
    public static final String SHIP_STATUS_PROPERTY = "shipStatus";
    public static final String SHIP_TYPE_PROPERTY = "shipType";
    public static final String SPEED_PROPERTY = "speed";
    public static final String TRACKING_SYSTEM_PROPERTY = "trackingSystem";
    public static final String WEBLINK_PROPERTY = "weblink";


    public void setAutonomy(Integer autonomy) {
        writeProperty(AUTONOMY_PROPERTY, autonomy);
    }
    public Integer getAutonomy() {
        return (Integer)readProperty(AUTONOMY_PROPERTY);
    }

    public void setBreadth(Integer breadth) {
        writeProperty(BREADTH_PROPERTY, breadth);
    }
    public Integer getBreadth() {
        return (Integer)readProperty(BREADTH_PROPERTY);
    }

    public void setBridge(Integer bridge) {
        writeProperty(BRIDGE_PROPERTY, bridge);
    }
    public Integer getBridge() {
        return (Integer)readProperty(BRIDGE_PROPERTY);
    }

    public void setBuoyCapacity(Integer buoyCapacity) {
        writeProperty(BUOY_CAPACITY_PROPERTY, buoyCapacity);
    }
    public Integer getBuoyCapacity() {
        return (Integer)readProperty(BUOY_CAPACITY_PROPERTY);
    }

    public void setCallSign(String callSign) {
        writeProperty(CALL_SIGN_PROPERTY, callSign);
    }
    public String getCallSign() {
        return (String)readProperty(CALL_SIGN_PROPERTY);
    }

    public void setCommissionedDate(Date commissionedDate) {
        writeProperty(COMMISSIONED_DATE_PROPERTY, commissionedDate);
    }
    public Date getCommissionedDate() {
        return (Date)readProperty(COMMISSIONED_DATE_PROPERTY);
    }

    public void setCountry(String country) {
        writeProperty(COUNTRY_PROPERTY, country);
    }
    public String getCountry() {
        return (String)readProperty(COUNTRY_PROPERTY);
    }

    public void setCountryIso2(String countryIso2) {
        writeProperty(COUNTRY_ISO2_PROPERTY, countryIso2);
    }
    public String getCountryIso2() {
        return (String)readProperty(COUNTRY_ISO2_PROPERTY);
    }

    public void setDecommissionedDate(Date decommissionedDate) {
        writeProperty(DECOMMISSIONED_DATE_PROPERTY, decommissionedDate);
    }
    public Date getDecommissionedDate() {
        return (Date)readProperty(DECOMMISSIONED_DATE_PROPERTY);
    }

    public void setDraught(Integer draught) {
        writeProperty(DRAUGHT_PROPERTY, draught);
    }
    public Integer getDraught() {
        return (Integer)readProperty(DRAUGHT_PROPERTY);
    }

    public void setFloatCapacity(Integer floatCapacity) {
        writeProperty(FLOAT_CAPACITY_PROPERTY, floatCapacity);
    }
    public Integer getFloatCapacity() {
        return (Integer)readProperty(FLOAT_CAPACITY_PROPERTY);
    }

    public void setFreeboard(Integer freeboard) {
        writeProperty(FREEBOARD_PROPERTY, freeboard);
    }
    public Integer getFreeboard() {
        return (Integer)readProperty(FREEBOARD_PROPERTY);
    }

    public void setHeight(Integer height) {
        writeProperty(HEIGHT_PROPERTY, height);
    }
    public Integer getHeight() {
        return (Integer)readProperty(HEIGHT_PROPERTY);
    }

    public void setHomePort(String homePort) {
        writeProperty(HOME_PORT_PROPERTY, homePort);
    }
    public String getHomePort() {
        return (String)readProperty(HOME_PORT_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setImo(String imo) {
        writeProperty(IMO_PROPERTY, imo);
    }
    public String getImo() {
        return (String)readProperty(IMO_PROPERTY);
    }

    public void setLastUpdate(Date lastUpdate) {
        writeProperty(LAST_UPDATE_PROPERTY, lastUpdate);
    }
    public Date getLastUpdate() {
        return (Date)readProperty(LAST_UPDATE_PROPERTY);
    }

    public void setLength(Integer length) {
        writeProperty(LENGTH_PROPERTY, length);
    }
    public Integer getLength() {
        return (Integer)readProperty(LENGTH_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        writeProperty(PASSENGER_CAPACITY_PROPERTY, passengerCapacity);
    }
    public Integer getPassengerCapacity() {
        return (Integer)readProperty(PASSENGER_CAPACITY_PROPERTY);
    }

    public void setPreviousId(Integer previousId) {
        writeProperty(PREVIOUS_ID_PROPERTY, previousId);
    }
    public Integer getPreviousId() {
        return (Integer)readProperty(PREVIOUS_ID_PROPERTY);
    }

    public void setRef(String ref) {
        writeProperty(REF_PROPERTY, ref);
    }
    public String getRef() {
        return (String)readProperty(REF_PROPERTY);
    }

    public void setShipStatus(String shipStatus) {
        writeProperty(SHIP_STATUS_PROPERTY, shipStatus);
    }
    public String getShipStatus() {
        return (String)readProperty(SHIP_STATUS_PROPERTY);
    }

    public void setShipType(String shipType) {
        writeProperty(SHIP_TYPE_PROPERTY, shipType);
    }
    public String getShipType() {
        return (String)readProperty(SHIP_TYPE_PROPERTY);
    }

    public void setSpeed(Integer speed) {
        writeProperty(SPEED_PROPERTY, speed);
    }
    public Integer getSpeed() {
        return (Integer)readProperty(SPEED_PROPERTY);
    }

    public void setTrackingSystem(String trackingSystem) {
        writeProperty(TRACKING_SYSTEM_PROPERTY, trackingSystem);
    }
    public String getTrackingSystem() {
        return (String)readProperty(TRACKING_SYSTEM_PROPERTY);
    }

    public void setWeblink(String weblink) {
        writeProperty(WEBLINK_PROPERTY, weblink);
    }
    public String getWeblink() {
        return (String)readProperty(WEBLINK_PROPERTY);
    }

}