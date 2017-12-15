package org.jcommops.api.orm;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _VariableVariableFamily was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VariableVariableFamily extends CayenneDataObject {

    public static final String VARIABLE_FAMILY_ID_PROPERTY = "variableFamilyId";
    public static final String VARIABLE_ID_PROPERTY = "variableId";
    public static final String VARIABLE_PROPERTY = "variable";
    public static final String VARIABLE_FAMILY_PROPERTY = "variableFamily";

    public static final String VARIABLE_FAMILY_ID_PK_COLUMN = "VARIABLE_FAMILY_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public void setVariableFamilyId(Integer variableFamilyId) {
        writeProperty(VARIABLE_FAMILY_ID_PROPERTY, variableFamilyId);
    }
    public Integer getVariableFamilyId() {
        return (Integer)readProperty(VARIABLE_FAMILY_ID_PROPERTY);
    }

    public void setVariableId(Integer variableId) {
        writeProperty(VARIABLE_ID_PROPERTY, variableId);
    }
    public Integer getVariableId() {
        return (Integer)readProperty(VARIABLE_ID_PROPERTY);
    }

    public void setVariable(Variable variable) {
        setToOneTarget(VARIABLE_PROPERTY, variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty(VARIABLE_PROPERTY);
    }


    public void setVariableFamily(VariableFamily variableFamily) {
        setToOneTarget(VARIABLE_FAMILY_PROPERTY, variableFamily, true);
    }

    public VariableFamily getVariableFamily() {
        return (VariableFamily)readProperty(VARIABLE_FAMILY_PROPERTY);
    }


}