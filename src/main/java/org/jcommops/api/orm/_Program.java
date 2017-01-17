package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Program was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Program extends CayenneDataObject {

    public static final String ACTIVE_PROPERTY = "active";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String CRUISE_PROGRAM_ARRAY_PROPERTY = "cruiseProgramArray";
    public static final String IMAGE_ARRAY_PROPERTY = "imageArray";
    public static final String LINE_PROGRAM_ARRAY_PROPERTY = "lineProgramArray";
    public static final String TO_AGENCIES_PROPERTY = "toAgencies";
    public static final String PROGRAM_CONTACT_ARRAY_PROPERTY = "programContactArray";
    public static final String PTF_ARRAY_PROPERTY = "ptfArray";
    public static final String TO_COUNTRY_PROPERTY = "toCountry";
    public static final String TO_MASTER_PROG_PROPERTY = "toMasterProg";
    public static final String WEBLINK_ARRAY_PROPERTY = "weblinkArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setActive(Integer active) {
        writeProperty(ACTIVE_PROPERTY, active);
    }
    public Integer getActive() {
        return (Integer)readProperty(ACTIVE_PROPERTY);
    }

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToCruiseProgramArray(CruiseProgram obj) {
        addToManyTarget(CRUISE_PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromCruiseProgramArray(CruiseProgram obj) {
        removeToManyTarget(CRUISE_PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CruiseProgram> getCruiseProgramArray() {
        return (List<CruiseProgram>)readProperty(CRUISE_PROGRAM_ARRAY_PROPERTY);
    }


    public void addToImageArray(Image obj) {
        addToManyTarget(IMAGE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromImageArray(Image obj) {
        removeToManyTarget(IMAGE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Image> getImageArray() {
        return (List<Image>)readProperty(IMAGE_ARRAY_PROPERTY);
    }


    public void addToLineProgramArray(LineProgram obj) {
        addToManyTarget(LINE_PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromLineProgramArray(LineProgram obj) {
        removeToManyTarget(LINE_PROGRAM_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<LineProgram> getLineProgramArray() {
        return (List<LineProgram>)readProperty(LINE_PROGRAM_ARRAY_PROPERTY);
    }


    public void addToToAgencies(Agency obj) {
        addToManyTarget(TO_AGENCIES_PROPERTY, obj, true);
    }
    public void removeFromToAgencies(Agency obj) {
        removeToManyTarget(TO_AGENCIES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Agency> getToAgencies() {
        return (List<Agency>)readProperty(TO_AGENCIES_PROPERTY);
    }


    public void addToProgramContactArray(ProgramContact obj) {
        addToManyTarget(PROGRAM_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromProgramContactArray(ProgramContact obj) {
        removeToManyTarget(PROGRAM_CONTACT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ProgramContact> getProgramContactArray() {
        return (List<ProgramContact>)readProperty(PROGRAM_CONTACT_ARRAY_PROPERTY);
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


    public void setToCountry(Country toCountry) {
        setToOneTarget(TO_COUNTRY_PROPERTY, toCountry, true);
    }

    public Country getToCountry() {
        return (Country)readProperty(TO_COUNTRY_PROPERTY);
    }


    public void setToMasterProg(MasterProg toMasterProg) {
        setToOneTarget(TO_MASTER_PROG_PROPERTY, toMasterProg, true);
    }

    public MasterProg getToMasterProg() {
        return (MasterProg)readProperty(TO_MASTER_PROG_PROPERTY);
    }


    public void addToWeblinkArray(Weblink obj) {
        addToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromWeblinkArray(Weblink obj) {
        removeToManyTarget(WEBLINK_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Weblink> getWeblinkArray() {
        return (List<Weblink>)readProperty(WEBLINK_ARRAY_PROPERTY);
    }


}
