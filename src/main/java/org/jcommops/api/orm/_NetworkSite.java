package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _NetworkSite was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NetworkSite extends CayenneDataObject {

    public static final String TO_NETWORK_PROPERTY = "toNetwork";
    public static final String TO_SITE_PROPERTY = "toSite";

    public static final String NETWORK_ID_PK_COLUMN = "NETWORK_ID";
    public static final String SITE_ID_PK_COLUMN = "SITE_ID";

    public void setToNetwork(Network toNetwork) {
        setToOneTarget(TO_NETWORK_PROPERTY, toNetwork, true);
    }

    public Network getToNetwork() {
        return (Network)readProperty(TO_NETWORK_PROPERTY);
    }


    public void setToSite(Site toSite) {
        setToOneTarget(TO_SITE_PROPERTY, toSite, true);
    }

    public Site getToSite() {
        return (Site)readProperty(TO_SITE_PROPERTY);
    }


}