package org.oceanops.api.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ShipLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipLoc extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<LocalDateTime> LOC_DATE = Property.create("locDate", LocalDateTime.class);
    public static final Property<Integer> LOC_QUALITY = Property.create("locQuality", Integer.class);
    public static final Property<Integer> LOC_SYSTEM_ID = Property.create("locSystemId", Integer.class);
    public static final Property<byte[]> SHAPE = Property.create("shape", byte[].class);
    public static final Property<byte[]> SHAPE_IMG = Property.create("shapeImg", byte[].class);
    public static final Property<Ship> SHIP = Property.create("ship", Ship.class);

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLocDate(LocalDateTime locDate) {
        writeProperty("locDate", locDate);
    }
    public LocalDateTime getLocDate() {
        return (LocalDateTime)readProperty("locDate");
    }

    public void setLocQuality(int locQuality) {
        writeProperty("locQuality", locQuality);
    }
    public int getLocQuality() {
        Object value = readProperty("locQuality");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLocSystemId(int locSystemId) {
        writeProperty("locSystemId", locSystemId);
    }
    public int getLocSystemId() {
        Object value = readProperty("locSystemId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setShape(byte[] shape) {
        writeProperty("shape", shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty("shape");
    }

    public void setShapeImg(byte[] shapeImg) {
        writeProperty("shapeImg", shapeImg);
    }
    public byte[] getShapeImg() {
        return (byte[])readProperty("shapeImg");
    }

    public void setShip(Ship ship) {
        setToOneTarget("ship", ship, true);
    }

    public Ship getShip() {
        return (Ship)readProperty("ship");
    }


}