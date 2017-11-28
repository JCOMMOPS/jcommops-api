package org.jcommops.api.orm;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Indicator was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Indicator extends CayenneDataObject {

    public static final String BASIN_ID_PROPERTY = "basinId";
    public static final String CORE_PROPERTY = "core";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EXPLANATION_PROPERTY = "explanation";
    public static final String ID_PROPERTY = "id";
    public static final String LEGEND_MAX_PROPERTY = "legendMax";
    public static final String LEGEND_MIN_PROPERTY = "legendMin";
    public static final String NAME_PROPERTY = "name";
    public static final String PERCENTAGE_PROPERTY = "percentage";
    public static final String RANK_PROPERTY = "rank";
    public static final String TARGET_TEXT_PROPERTY = "targetText";
    public static final String TARGET_VALUE_PROPERTY = "targetValue";
    public static final String INDICATOR_CATEGORY_PROPERTY = "indicatorCategory";
    public static final String MASTER_PROG_PROPERTY = "masterProg";
    public static final String NETWORK_PROPERTY = "network";

    public static final String ID_PK_COLUMN = "ID";

    public void setBasinId(Integer basinId) {
        writeProperty(BASIN_ID_PROPERTY, basinId);
    }
    public Integer getBasinId() {
        return (Integer)readProperty(BASIN_ID_PROPERTY);
    }

    public void setCore(Integer core) {
        writeProperty(CORE_PROPERTY, core);
    }
    public Integer getCore() {
        return (Integer)readProperty(CORE_PROPERTY);
    }

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setExplanation(String explanation) {
        writeProperty(EXPLANATION_PROPERTY, explanation);
    }
    public String getExplanation() {
        return (String)readProperty(EXPLANATION_PROPERTY);
    }

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setLegendMax(BigDecimal legendMax) {
        writeProperty(LEGEND_MAX_PROPERTY, legendMax);
    }
    public BigDecimal getLegendMax() {
        return (BigDecimal)readProperty(LEGEND_MAX_PROPERTY);
    }

    public void setLegendMin(BigDecimal legendMin) {
        writeProperty(LEGEND_MIN_PROPERTY, legendMin);
    }
    public BigDecimal getLegendMin() {
        return (BigDecimal)readProperty(LEGEND_MIN_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setPercentage(Integer percentage) {
        writeProperty(PERCENTAGE_PROPERTY, percentage);
    }
    public Integer getPercentage() {
        return (Integer)readProperty(PERCENTAGE_PROPERTY);
    }

    public void setRank(Integer rank) {
        writeProperty(RANK_PROPERTY, rank);
    }
    public Integer getRank() {
        return (Integer)readProperty(RANK_PROPERTY);
    }

    public void setTargetText(String targetText) {
        writeProperty(TARGET_TEXT_PROPERTY, targetText);
    }
    public String getTargetText() {
        return (String)readProperty(TARGET_TEXT_PROPERTY);
    }

    public void setTargetValue(BigDecimal targetValue) {
        writeProperty(TARGET_VALUE_PROPERTY, targetValue);
    }
    public BigDecimal getTargetValue() {
        return (BigDecimal)readProperty(TARGET_VALUE_PROPERTY);
    }

    public void setIndicatorCategory(IndicatorCategory indicatorCategory) {
        setToOneTarget(INDICATOR_CATEGORY_PROPERTY, indicatorCategory, true);
    }

    public IndicatorCategory getIndicatorCategory() {
        return (IndicatorCategory)readProperty(INDICATOR_CATEGORY_PROPERTY);
    }


    public void setMasterProg(MasterProg masterProg) {
        setToOneTarget(MASTER_PROG_PROPERTY, masterProg, true);
    }

    public MasterProg getMasterProg() {
        return (MasterProg)readProperty(MASTER_PROG_PROPERTY);
    }


    public void setNetwork(Network network) {
        setToOneTarget(NETWORK_PROPERTY, network, true);
    }

    public Network getNetwork() {
        return (Network)readProperty(NETWORK_PROPERTY);
    }


}
