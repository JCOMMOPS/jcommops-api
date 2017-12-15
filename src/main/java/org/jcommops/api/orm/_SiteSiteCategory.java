package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _SiteSiteCategory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SiteSiteCategory extends CayenneDataObject {

    public static final String SITE_CATEGORY_ID_PROPERTY = "siteCategoryId";
    public static final String SITE_ID_PROPERTY = "siteId";

    public static final String SITE_CATEGORY_ID_PK_COLUMN = "SITE_CATEGORY_ID";
    public static final String SITE_ID_PK_COLUMN = "SITE_ID";

    public void setSiteCategoryId(Integer siteCategoryId) {
        writeProperty(SITE_CATEGORY_ID_PROPERTY, siteCategoryId);
    }
    public Integer getSiteCategoryId() {
        return (Integer)readProperty(SITE_CATEGORY_ID_PROPERTY);
    }

    public void setSiteId(Integer siteId) {
        writeProperty(SITE_ID_PROPERTY, siteId);
    }
    public Integer getSiteId() {
        return (Integer)readProperty(SITE_ID_PROPERTY);
    }

}