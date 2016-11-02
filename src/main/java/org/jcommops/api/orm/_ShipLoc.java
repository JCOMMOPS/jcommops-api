package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ShipLoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipLoc extends CayenneDataObject {

    public static final String SHAPE_PROPERTY = "shape";
    public static final String TO_SHIP_PROPERTY = "toShip";

    public static final String ID_PK_COLUMN = "ID";

    public void setShape($importUtils.formatJavaType(${attr.Type}) shape) {
        writeProperty(SHAPE_PROPERTY, shape);
    }
    public $importUtils.formatJavaType(${attr.Type}) getShape() {
        return ($importUtils.formatJavaType(${attr.Type}))readProperty(SHAPE_PROPERTY);
    }

    public void setToShip(Ship toShip) {
        setToOneTarget(TO_SHIP_PROPERTY, toShip, true);
    }

    public Ship getToShip() {
        return (Ship)readProperty(TO_SHIP_PROPERTY);
    }


}