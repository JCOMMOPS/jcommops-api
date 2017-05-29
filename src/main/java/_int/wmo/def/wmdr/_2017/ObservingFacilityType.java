//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.14 at 09:14:09 AM CEST 
//


package _int.wmo.def.wmdr._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.ReferenceType;


/**
 * <p>Java class for ObservingFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservingFacilityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}AbstractEnvironmentalMonitoringFacilityType">
 *       &lt;sequence>
 *         &lt;element name="wmoRegion" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="territoryName" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="programAffiliation" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="reportingStatus" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="belongsToSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facilityType" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="altitudeOrDepth" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="localTopography" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="relativeElevation" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="surfaceCover" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="surfaceCoverClassification" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="topographicContext" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="climateZone" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="surfaceRoughness" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="facilityLog" type="{http://def.wmo.int/wmdr/2017}FacilityLogPropertyType" minOccurs="0"/>
 *         &lt;element name="hostedEquipment" type="{http://def.wmo.int/wmdr/2017}EquipmentPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservingFacilityType", propOrder = {
    "wmoRegion",
    "territoryName",
    "programAffiliation",
    "reportingStatus",
    "belongsToSet",
    "facilityType",
    "altitudeOrDepth",
    "localTopography",
    "relativeElevation",
    "surfaceCover",
    "surfaceCoverClassification",
    "topographicContext",
    "climateZone",
    "surfaceRoughness",
    "facilityLog",
    "hostedEquipment"
})
public class ObservingFacilityType
    extends AbstractEnvironmentalMonitoringFacilityType
{

    @XmlElement(required = true)
    protected ReferenceType wmoRegion;
    @XmlElement(required = true)
    protected ReferenceType territoryName;
    @XmlElement(required = true)
    protected List<ReferenceType> programAffiliation;
    @XmlElement(required = true)
    protected ReferenceType reportingStatus;
    @XmlElement(required = true)
    protected String belongsToSet;
    protected ReferenceType facilityType;
    protected ReferenceType altitudeOrDepth;
    protected ReferenceType localTopography;
    protected ReferenceType relativeElevation;
    protected ReferenceType surfaceCover;
    protected ReferenceType surfaceCoverClassification;
    protected ReferenceType topographicContext;
    protected ReferenceType climateZone;
    protected ReferenceType surfaceRoughness;
    protected FacilityLogPropertyType facilityLog;
    protected List<EquipmentPropertyType> hostedEquipment;

    /**
     * Gets the value of the wmoRegion property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getWmoRegion() {
        return wmoRegion;
    }

    /**
     * Sets the value of the wmoRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setWmoRegion(ReferenceType value) {
        this.wmoRegion = value;
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTerritoryName(ReferenceType value) {
        this.territoryName = value;
    }

    /**
     * Gets the value of the programAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getProgramAffiliation() {
        if (programAffiliation == null) {
            programAffiliation = new ArrayList<ReferenceType>();
        }
        return this.programAffiliation;
    }

    /**
     * Gets the value of the reportingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getReportingStatus() {
        return reportingStatus;
    }

    /**
     * Sets the value of the reportingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setReportingStatus(ReferenceType value) {
        this.reportingStatus = value;
    }

    /**
     * Gets the value of the belongsToSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelongsToSet() {
        return belongsToSet;
    }

    /**
     * Sets the value of the belongsToSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelongsToSet(String value) {
        this.belongsToSet = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setFacilityType(ReferenceType value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the altitudeOrDepth property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAltitudeOrDepth() {
        return altitudeOrDepth;
    }

    /**
     * Sets the value of the altitudeOrDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAltitudeOrDepth(ReferenceType value) {
        this.altitudeOrDepth = value;
    }

    /**
     * Gets the value of the localTopography property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocalTopography() {
        return localTopography;
    }

    /**
     * Sets the value of the localTopography property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocalTopography(ReferenceType value) {
        this.localTopography = value;
    }

    /**
     * Gets the value of the relativeElevation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRelativeElevation() {
        return relativeElevation;
    }

    /**
     * Sets the value of the relativeElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRelativeElevation(ReferenceType value) {
        this.relativeElevation = value;
    }

    /**
     * Gets the value of the surfaceCover property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSurfaceCover() {
        return surfaceCover;
    }

    /**
     * Sets the value of the surfaceCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSurfaceCover(ReferenceType value) {
        this.surfaceCover = value;
    }

    /**
     * Gets the value of the surfaceCoverClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSurfaceCoverClassification() {
        return surfaceCoverClassification;
    }

    /**
     * Sets the value of the surfaceCoverClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSurfaceCoverClassification(ReferenceType value) {
        this.surfaceCoverClassification = value;
    }

    /**
     * Gets the value of the topographicContext property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTopographicContext() {
        return topographicContext;
    }

    /**
     * Sets the value of the topographicContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTopographicContext(ReferenceType value) {
        this.topographicContext = value;
    }

    /**
     * Gets the value of the climateZone property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClimateZone() {
        return climateZone;
    }

    /**
     * Sets the value of the climateZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClimateZone(ReferenceType value) {
        this.climateZone = value;
    }

    /**
     * Gets the value of the surfaceRoughness property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getSurfaceRoughness() {
        return surfaceRoughness;
    }

    /**
     * Sets the value of the surfaceRoughness property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setSurfaceRoughness(ReferenceType value) {
        this.surfaceRoughness = value;
    }

    /**
     * Gets the value of the facilityLog property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLogPropertyType }
     *     
     */
    public FacilityLogPropertyType getFacilityLog() {
        return facilityLog;
    }

    /**
     * Sets the value of the facilityLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLogPropertyType }
     *     
     */
    public void setFacilityLog(FacilityLogPropertyType value) {
        this.facilityLog = value;
    }

    /**
     * Gets the value of the hostedEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostedEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostedEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentPropertyType }
     * 
     * 
     */
    public List<EquipmentPropertyType> getHostedEquipment() {
        if (hostedEquipment == null) {
            hostedEquipment = new ArrayList<EquipmentPropertyType>();
        }
        return this.hostedEquipment;
    }

	@Override
	public Object createNewInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
