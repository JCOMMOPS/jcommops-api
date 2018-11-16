package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _LineSurvey was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LineSurvey extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String LINE_ID_PK_COLUMN = "LINE_ID";
    public static final String SURVEY_ID_PK_COLUMN = "SURVEY_ID";

    public static final Property<Integer> LINE_ID = Property.create("lineId", Integer.class);
    public static final Property<Integer> SURVEY_ID = Property.create("surveyId", Integer.class);
    public static final Property<Line> LINE = Property.create("line", Line.class);
    public static final Property<LinePerformance> LINE_PERFORMANCE = Property.create("linePerformance", LinePerformance.class);
    public static final Property<LineStatus> LINE_STATUS = Property.create("lineStatus", LineStatus.class);
    public static final Property<LineType> LINE_TYPE = Property.create("lineType", LineType.class);
    public static final Property<Survey> SURVEY = Property.create("survey", Survey.class);

    public void setLineId(int lineId) {
        writeProperty("lineId", lineId);
    }
    public int getLineId() {
        Object value = readProperty("lineId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setSurveyId(int surveyId) {
        writeProperty("surveyId", surveyId);
    }
    public int getSurveyId() {
        Object value = readProperty("surveyId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
    }


    public void setLinePerformance(LinePerformance linePerformance) {
        setToOneTarget("linePerformance", linePerformance, true);
    }

    public LinePerformance getLinePerformance() {
        return (LinePerformance)readProperty("linePerformance");
    }


    public void setLineStatus(LineStatus lineStatus) {
        setToOneTarget("lineStatus", lineStatus, true);
    }

    public LineStatus getLineStatus() {
        return (LineStatus)readProperty("lineStatus");
    }


    public void setLineType(LineType lineType) {
        setToOneTarget("lineType", lineType, true);
    }

    public LineType getLineType() {
        return (LineType)readProperty("lineType");
    }


    public void setSurvey(Survey survey) {
        setToOneTarget("survey", survey, true);
    }

    public Survey getSurvey() {
        return (Survey)readProperty("survey");
    }


}
