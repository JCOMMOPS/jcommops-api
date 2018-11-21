
package _int.wmo.def.wmdr._2017;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.wmo.def.wmdr._2017 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbstractEnvironmentalMonitoringFacility_QNAME = new QName("http://def.wmo.int/wmdr/2017", "AbstractEnvironmentalMonitoringFacility");
    private final static QName _ControlCheckReport_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ControlCheckReport");
    private final static QName _LogEntry_QNAME = new QName("http://def.wmo.int/wmdr/2017", "LogEntry");
    private final static QName _DataGeneration_QNAME = new QName("http://def.wmo.int/wmdr/2017", "DataGeneration");
    private final static QName _Deployment_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Deployment");
    private final static QName _Equipment_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Equipment");
    private final static QName _EventReport_QNAME = new QName("http://def.wmo.int/wmdr/2017", "EventReport");
    private final static QName _FacilityLog_QNAME = new QName("http://def.wmo.int/wmdr/2017", "FacilityLog");
    private final static QName _Log_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Log");
    private final static QName _FacilitySet_QNAME = new QName("http://def.wmo.int/wmdr/2017", "FacilitySet");
    private final static QName _Frequencies_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Frequencies");
    private final static QName _Header_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Header");
    private final static QName _InstrumentOperatingStatus_QNAME = new QName("http://def.wmo.int/wmdr/2017", "InstrumentOperatingStatus");
    private final static QName _MaintenanceReport_QNAME = new QName("http://def.wmo.int/wmdr/2017", "MaintenanceReport");
    private final static QName _ObservingCapability_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ObservingCapability");
    private final static QName _ObservingFacility_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ObservingFacility");
    private final static QName _Process_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Process");
    private final static QName _Processing_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Processing");
    private final static QName _ProgramAffiliation_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ProgramAffiliation");
    private final static QName _Reporting_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Reporting");
    private final static QName _ResultSet_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ResultSet");
    private final static QName _Sampling_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Sampling");
    private final static QName _Schedule_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Schedule");
    private final static QName _Attribution_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Attribution");
    private final static QName _ClimateZone_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ClimateZone");
    private final static QName _DataPolicy_QNAME = new QName("http://def.wmo.int/wmdr/2017", "DataPolicy");
    private final static QName _Description_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Description");
    private final static QName _GeospatialLocation_QNAME = new QName("http://def.wmo.int/wmdr/2017", "GeospatialLocation");
    private final static QName _ReportingStatus_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ReportingStatus");
    private final static QName _ResponsibleParty_QNAME = new QName("http://def.wmo.int/wmdr/2017", "ResponsibleParty");
    private final static QName _SurfaceCover_QNAME = new QName("http://def.wmo.int/wmdr/2017", "SurfaceCover");
    private final static QName _SurfaceRoughness_QNAME = new QName("http://def.wmo.int/wmdr/2017", "SurfaceRoughness");
    private final static QName _Territory_QNAME = new QName("http://def.wmo.int/wmdr/2017", "Territory");
    private final static QName _TopographyBathymetry_QNAME = new QName("http://def.wmo.int/wmdr/2017", "TopographyBathymetry");
    private final static QName _WIGOSMetadataRecord_QNAME = new QName("http://def.wmo.int/wmdr/2017", "WIGOSMetadataRecord");
    private final static QName _EquipmentLog_QNAME = new QName("http://def.wmo.int/wmdr/2017", "EquipmentLog");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.wmo.def.wmdr._2017
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType }
     * 
     */
    public WIGOSMetadataRecordType createWIGOSMetadataRecordType() {
        return new WIGOSMetadataRecordType();
    }

    /**
     * Create an instance of {@link ResponsiblePartyType }
     * 
     */
    public ResponsiblePartyType createResponsiblePartyType() {
        return new ResponsiblePartyType();
    }

    /**
     * Create an instance of {@link DataPolicyType }
     * 
     */
    public DataPolicyType createDataPolicyType() {
        return new DataPolicyType();
    }

    /**
     * Create an instance of {@link AttributionType }
     * 
     */
    public AttributionType createAttributionType() {
        return new AttributionType();
    }

    /**
     * Create an instance of {@link ResultSetType }
     * 
     */
    public ResultSetType createResultSetType() {
        return new ResultSetType();
    }

    /**
     * Create an instance of {@link ReportingType }
     * 
     */
    public ReportingType createReportingType() {
        return new ReportingType();
    }

    /**
     * Create an instance of {@link ProgramAffiliationType }
     * 
     */
    public ProgramAffiliationType createProgramAffiliationType() {
        return new ProgramAffiliationType();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link ObservingFacilityType }
     * 
     */
    public ObservingFacilityType createObservingFacilityType() {
        return new ObservingFacilityType();
    }

    /**
     * Create an instance of {@link MaintenanceReportType }
     * 
     */
    public MaintenanceReportType createMaintenanceReportType() {
        return new MaintenanceReportType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link DeploymentType }
     * 
     */
    public DeploymentType createDeploymentType() {
        return new DeploymentType();
    }

    /**
     * Create an instance of {@link ControlCheckReportType }
     * 
     */
    public ControlCheckReportType createControlCheckReportType() {
        return new ControlCheckReportType();
    }

    /**
     * Create an instance of {@link DataGenerationType }
     * 
     */
    public DataGenerationType createDataGenerationType() {
        return new DataGenerationType();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link EventReportType }
     * 
     */
    public EventReportType createEventReportType() {
        return new EventReportType();
    }

    /**
     * Create an instance of {@link FacilityLogType }
     * 
     */
    public FacilityLogType createFacilityLogType() {
        return new FacilityLogType();
    }

    /**
     * Create an instance of {@link FacilitySetType }
     * 
     */
    public FacilitySetType createFacilitySetType() {
        return new FacilitySetType();
    }

    /**
     * Create an instance of {@link FrequenciesType }
     * 
     */
    public FrequenciesType createFrequenciesType() {
        return new FrequenciesType();
    }

    /**
     * Create an instance of {@link InstrumentOperatingStatusType }
     * 
     */
    public InstrumentOperatingStatusType createInstrumentOperatingStatusType() {
        return new InstrumentOperatingStatusType();
    }

    /**
     * Create an instance of {@link ObservingCapabilityType }
     * 
     */
    public ObservingCapabilityType createObservingCapabilityType() {
        return new ObservingCapabilityType();
    }

    /**
     * Create an instance of {@link ProcessingType }
     * 
     */
    public ProcessingType createProcessingType() {
        return new ProcessingType();
    }

    /**
     * Create an instance of {@link SamplingType }
     * 
     */
    public SamplingType createSamplingType() {
        return new SamplingType();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link ClimateZoneType }
     * 
     */
    public ClimateZoneType createClimateZoneType() {
        return new ClimateZoneType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link GeospatialLocationType }
     * 
     */
    public GeospatialLocationType createGeospatialLocationType() {
        return new GeospatialLocationType();
    }

    /**
     * Create an instance of {@link ReportingStatusType }
     * 
     */
    public ReportingStatusType createReportingStatusType() {
        return new ReportingStatusType();
    }

    /**
     * Create an instance of {@link SurfaceCoverType }
     * 
     */
    public SurfaceCoverType createSurfaceCoverType() {
        return new SurfaceCoverType();
    }

    /**
     * Create an instance of {@link SurfaceRoughnessType }
     * 
     */
    public SurfaceRoughnessType createSurfaceRoughnessType() {
        return new SurfaceRoughnessType();
    }

    /**
     * Create an instance of {@link TerritoryType }
     * 
     */
    public TerritoryType createTerritoryType() {
        return new TerritoryType();
    }

    /**
     * Create an instance of {@link TopographyBathymetryType }
     * 
     */
    public TopographyBathymetryType createTopographyBathymetryType() {
        return new TopographyBathymetryType();
    }

    /**
     * Create an instance of {@link EquipmentLogType }
     * 
     */
    public EquipmentLogType createEquipmentLogType() {
        return new EquipmentLogType();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityPropertyType }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityPropertyType createAbstractEnvironmentalMonitoringFacilityPropertyType() {
        return new AbstractEnvironmentalMonitoringFacilityPropertyType();
    }

    /**
     * Create an instance of {@link ControlCheckReportPropertyType }
     * 
     */
    public ControlCheckReportPropertyType createControlCheckReportPropertyType() {
        return new ControlCheckReportPropertyType();
    }

    /**
     * Create an instance of {@link DataGenerationPropertyType }
     * 
     */
    public DataGenerationPropertyType createDataGenerationPropertyType() {
        return new DataGenerationPropertyType();
    }

    /**
     * Create an instance of {@link DeploymentPropertyType }
     * 
     */
    public DeploymentPropertyType createDeploymentPropertyType() {
        return new DeploymentPropertyType();
    }

    /**
     * Create an instance of {@link EquipmentPropertyType }
     * 
     */
    public EquipmentPropertyType createEquipmentPropertyType() {
        return new EquipmentPropertyType();
    }

    /**
     * Create an instance of {@link EventReportPropertyType }
     * 
     */
    public EventReportPropertyType createEventReportPropertyType() {
        return new EventReportPropertyType();
    }

    /**
     * Create an instance of {@link FacilityLogPropertyType }
     * 
     */
    public FacilityLogPropertyType createFacilityLogPropertyType() {
        return new FacilityLogPropertyType();
    }

    /**
     * Create an instance of {@link FacilitySetPropertyType }
     * 
     */
    public FacilitySetPropertyType createFacilitySetPropertyType() {
        return new FacilitySetPropertyType();
    }

    /**
     * Create an instance of {@link FrequenciesPropertyType }
     * 
     */
    public FrequenciesPropertyType createFrequenciesPropertyType() {
        return new FrequenciesPropertyType();
    }

    /**
     * Create an instance of {@link HeaderPropertyType }
     * 
     */
    public HeaderPropertyType createHeaderPropertyType() {
        return new HeaderPropertyType();
    }

    /**
     * Create an instance of {@link InstrumentOperatingStatusPropertyType }
     * 
     */
    public InstrumentOperatingStatusPropertyType createInstrumentOperatingStatusPropertyType() {
        return new InstrumentOperatingStatusPropertyType();
    }

    /**
     * Create an instance of {@link LogEntryPropertyType }
     * 
     */
    public LogEntryPropertyType createLogEntryPropertyType() {
        return new LogEntryPropertyType();
    }

    /**
     * Create an instance of {@link MaintenanceReportPropertyType }
     * 
     */
    public MaintenanceReportPropertyType createMaintenanceReportPropertyType() {
        return new MaintenanceReportPropertyType();
    }

    /**
     * Create an instance of {@link ObservingCapabilityPropertyType }
     * 
     */
    public ObservingCapabilityPropertyType createObservingCapabilityPropertyType() {
        return new ObservingCapabilityPropertyType();
    }

    /**
     * Create an instance of {@link ObservingFacilityPropertyType }
     * 
     */
    public ObservingFacilityPropertyType createObservingFacilityPropertyType() {
        return new ObservingFacilityPropertyType();
    }

    /**
     * Create an instance of {@link ProcessPropertyType }
     * 
     */
    public ProcessPropertyType createProcessPropertyType() {
        return new ProcessPropertyType();
    }

    /**
     * Create an instance of {@link ProcessingPropertyType }
     * 
     */
    public ProcessingPropertyType createProcessingPropertyType() {
        return new ProcessingPropertyType();
    }

    /**
     * Create an instance of {@link ProgramAffiliationPropertyType }
     * 
     */
    public ProgramAffiliationPropertyType createProgramAffiliationPropertyType() {
        return new ProgramAffiliationPropertyType();
    }

    /**
     * Create an instance of {@link ReportingPropertyType }
     * 
     */
    public ReportingPropertyType createReportingPropertyType() {
        return new ReportingPropertyType();
    }

    /**
     * Create an instance of {@link ResultSetPropertyType }
     * 
     */
    public ResultSetPropertyType createResultSetPropertyType() {
        return new ResultSetPropertyType();
    }

    /**
     * Create an instance of {@link SamplingPropertyType }
     * 
     */
    public SamplingPropertyType createSamplingPropertyType() {
        return new SamplingPropertyType();
    }

    /**
     * Create an instance of {@link SchedulePropertyType }
     * 
     */
    public SchedulePropertyType createSchedulePropertyType() {
        return new SchedulePropertyType();
    }

    /**
     * Create an instance of {@link AttributionPropertyType }
     * 
     */
    public AttributionPropertyType createAttributionPropertyType() {
        return new AttributionPropertyType();
    }

    /**
     * Create an instance of {@link ClimateZonePropertyType }
     * 
     */
    public ClimateZonePropertyType createClimateZonePropertyType() {
        return new ClimateZonePropertyType();
    }

    /**
     * Create an instance of {@link DataPolicyPropertyType }
     * 
     */
    public DataPolicyPropertyType createDataPolicyPropertyType() {
        return new DataPolicyPropertyType();
    }

    /**
     * Create an instance of {@link DescriptionPropertyType }
     * 
     */
    public DescriptionPropertyType createDescriptionPropertyType() {
        return new DescriptionPropertyType();
    }

    /**
     * Create an instance of {@link GeospatialLocationPropertyType }
     * 
     */
    public GeospatialLocationPropertyType createGeospatialLocationPropertyType() {
        return new GeospatialLocationPropertyType();
    }

    /**
     * Create an instance of {@link ReportingStatusPropertyType }
     * 
     */
    public ReportingStatusPropertyType createReportingStatusPropertyType() {
        return new ReportingStatusPropertyType();
    }

    /**
     * Create an instance of {@link ResponsiblePartyPropertyType }
     * 
     */
    public ResponsiblePartyPropertyType createResponsiblePartyPropertyType() {
        return new ResponsiblePartyPropertyType();
    }

    /**
     * Create an instance of {@link SurfaceCoverPropertyType }
     * 
     */
    public SurfaceCoverPropertyType createSurfaceCoverPropertyType() {
        return new SurfaceCoverPropertyType();
    }

    /**
     * Create an instance of {@link SurfaceRoughnessPropertyType }
     * 
     */
    public SurfaceRoughnessPropertyType createSurfaceRoughnessPropertyType() {
        return new SurfaceRoughnessPropertyType();
    }

    /**
     * Create an instance of {@link TerritoryPropertyType }
     * 
     */
    public TerritoryPropertyType createTerritoryPropertyType() {
        return new TerritoryPropertyType();
    }

    /**
     * Create an instance of {@link TopographyBathymetryPropertyType }
     * 
     */
    public TopographyBathymetryPropertyType createTopographyBathymetryPropertyType() {
        return new TopographyBathymetryPropertyType();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordPropertyType }
     * 
     */
    public WIGOSMetadataRecordPropertyType createWIGOSMetadataRecordPropertyType() {
        return new WIGOSMetadataRecordPropertyType();
    }

    /**
     * Create an instance of {@link LogPropertyType }
     * 
     */
    public LogPropertyType createLogPropertyType() {
        return new LogPropertyType();
    }

    /**
     * Create an instance of {@link EquipmentLogPropertyType }
     * 
     */
    public EquipmentLogPropertyType createEquipmentLogPropertyType() {
        return new EquipmentLogPropertyType();
    }

    /**
     * Create an instance of {@link LogType.LogEntry }
     * 
     */
    public LogType.LogEntry createLogTypeLogEntry() {
        return new LogType.LogEntry();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.HeaderInformation }
     * 
     */
    public WIGOSMetadataRecordType.HeaderInformation createWIGOSMetadataRecordTypeHeaderInformation() {
        return new WIGOSMetadataRecordType.HeaderInformation();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.FacilitySet }
     * 
     */
    public WIGOSMetadataRecordType.FacilitySet createWIGOSMetadataRecordTypeFacilitySet() {
        return new WIGOSMetadataRecordType.FacilitySet();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.Facility }
     * 
     */
    public WIGOSMetadataRecordType.Facility createWIGOSMetadataRecordTypeFacility() {
        return new WIGOSMetadataRecordType.Facility();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.Observation }
     * 
     */
    public WIGOSMetadataRecordType.Observation createWIGOSMetadataRecordTypeObservation() {
        return new WIGOSMetadataRecordType.Observation();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.Deployment }
     * 
     */
    public WIGOSMetadataRecordType.Deployment createWIGOSMetadataRecordTypeDeployment() {
        return new WIGOSMetadataRecordType.Deployment();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.Equipment }
     * 
     */
    public WIGOSMetadataRecordType.Equipment createWIGOSMetadataRecordTypeEquipment() {
        return new WIGOSMetadataRecordType.Equipment();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.FacilityLog }
     * 
     */
    public WIGOSMetadataRecordType.FacilityLog createWIGOSMetadataRecordTypeFacilityLog() {
        return new WIGOSMetadataRecordType.FacilityLog();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.EquipmentLog }
     * 
     */
    public WIGOSMetadataRecordType.EquipmentLog createWIGOSMetadataRecordTypeEquipmentLog() {
        return new WIGOSMetadataRecordType.EquipmentLog();
    }

    /**
     * Create an instance of {@link WIGOSMetadataRecordType.Extension }
     * 
     */
    public WIGOSMetadataRecordType.Extension createWIGOSMetadataRecordTypeExtension() {
        return new WIGOSMetadataRecordType.Extension();
    }

    /**
     * Create an instance of {@link ResponsiblePartyType.ResponsibleParty }
     * 
     */
    public ResponsiblePartyType.ResponsibleParty createResponsiblePartyTypeResponsibleParty() {
        return new ResponsiblePartyType.ResponsibleParty();
    }

    /**
     * Create an instance of {@link DataPolicyType.Attribution }
     * 
     */
    public DataPolicyType.Attribution createDataPolicyTypeAttribution() {
        return new DataPolicyType.Attribution();
    }

    /**
     * Create an instance of {@link AttributionType.Originator }
     * 
     */
    public AttributionType.Originator createAttributionTypeOriginator() {
        return new AttributionType.Originator();
    }

    /**
     * Create an instance of {@link AttributionType.OriginatorURL }
     * 
     */
    public AttributionType.OriginatorURL createAttributionTypeOriginatorURL() {
        return new AttributionType.OriginatorURL();
    }

    /**
     * Create an instance of {@link AttributionType.Source }
     * 
     */
    public AttributionType.Source createAttributionTypeSource() {
        return new AttributionType.Source();
    }

    /**
     * Create an instance of {@link ResultSetType.DistributionInfo }
     * 
     */
    public ResultSetType.DistributionInfo createResultSetTypeDistributionInfo() {
        return new ResultSetType.DistributionInfo();
    }

    /**
     * Create an instance of {@link ReportingType.ReferenceDatum }
     * 
     */
    public ReportingType.ReferenceDatum createReportingTypeReferenceDatum() {
        return new ReportingType.ReferenceDatum();
    }

    /**
     * Create an instance of {@link ReportingType.DataPolicy }
     * 
     */
    public ReportingType.DataPolicy createReportingTypeDataPolicy() {
        return new ReportingType.DataPolicy();
    }

    /**
     * Create an instance of {@link ProgramAffiliationType.ReportingStatus }
     * 
     */
    public ProgramAffiliationType.ReportingStatus createProgramAffiliationTypeReportingStatus() {
        return new ProgramAffiliationType.ReportingStatus();
    }

    /**
     * Create an instance of {@link ProcessType.Extension }
     * 
     */
    public ProcessType.Extension createProcessTypeExtension() {
        return new ProcessType.Extension();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty createAbstractEnvironmentalMonitoringFacilityTypeResponsibleParty() {
        return new AbstractEnvironmentalMonitoringFacilityType.ResponsibleParty();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation createAbstractEnvironmentalMonitoringFacilityTypeGeospatialLocation() {
        return new AbstractEnvironmentalMonitoringFacilityType.GeospatialLocation();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityType.OnlineResource }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityType.OnlineResource createAbstractEnvironmentalMonitoringFacilityTypeOnlineResource() {
        return new AbstractEnvironmentalMonitoringFacilityType.OnlineResource();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityType.Description }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityType.Description createAbstractEnvironmentalMonitoringFacilityTypeDescription() {
        return new AbstractEnvironmentalMonitoringFacilityType.Description();
    }

    /**
     * Create an instance of {@link AbstractEnvironmentalMonitoringFacilityType.Extension }
     * 
     */
    public AbstractEnvironmentalMonitoringFacilityType.Extension createAbstractEnvironmentalMonitoringFacilityTypeExtension() {
        return new AbstractEnvironmentalMonitoringFacilityType.Extension();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.Territory }
     * 
     */
    public ObservingFacilityType.Territory createObservingFacilityTypeTerritory() {
        return new ObservingFacilityType.Territory();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.ProgramAffiliation }
     * 
     */
    public ObservingFacilityType.ProgramAffiliation createObservingFacilityTypeProgramAffiliation() {
        return new ObservingFacilityType.ProgramAffiliation();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.ClimateZone }
     * 
     */
    public ObservingFacilityType.ClimateZone createObservingFacilityTypeClimateZone() {
        return new ObservingFacilityType.ClimateZone();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.SurfaceCover }
     * 
     */
    public ObservingFacilityType.SurfaceCover createObservingFacilityTypeSurfaceCover() {
        return new ObservingFacilityType.SurfaceCover();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.SurfaceRoughness }
     * 
     */
    public ObservingFacilityType.SurfaceRoughness createObservingFacilityTypeSurfaceRoughness() {
        return new ObservingFacilityType.SurfaceRoughness();
    }

    /**
     * Create an instance of {@link ObservingFacilityType.TopographyBathymetry }
     * 
     */
    public ObservingFacilityType.TopographyBathymetry createObservingFacilityTypeTopographyBathymetry() {
        return new ObservingFacilityType.TopographyBathymetry();
    }

    /**
     * Create an instance of {@link MaintenanceReportType.MaintenanceParty }
     * 
     */
    public MaintenanceReportType.MaintenanceParty createMaintenanceReportTypeMaintenanceParty() {
        return new MaintenanceReportType.MaintenanceParty();
    }

    /**
     * Create an instance of {@link HeaderType.RecordOwner }
     * 
     */
    public HeaderType.RecordOwner createHeaderTypeRecordOwner() {
        return new HeaderType.RecordOwner();
    }

    /**
     * Create an instance of {@link DeploymentType.InstrumentOperatingStatus }
     * 
     */
    public DeploymentType.InstrumentOperatingStatus createDeploymentTypeInstrumentOperatingStatus() {
        return new DeploymentType.InstrumentOperatingStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractEnvironmentalMonitoringFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "AbstractEnvironmentalMonitoringFacility", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractEnvironmentalMonitoringFacilityType> createAbstractEnvironmentalMonitoringFacility(AbstractEnvironmentalMonitoringFacilityType value) {
        return new JAXBElement<AbstractEnvironmentalMonitoringFacilityType>(_AbstractEnvironmentalMonitoringFacility_QNAME, AbstractEnvironmentalMonitoringFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ControlCheckReport", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "LogEntry")
    public JAXBElement<ControlCheckReportType> createControlCheckReport(ControlCheckReportType value) {
        return new JAXBElement<ControlCheckReportType>(_ControlCheckReport_QNAME, ControlCheckReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "LogEntry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<LogEntryType> createLogEntry(LogEntryType value) {
        return new JAXBElement<LogEntryType>(_LogEntry_QNAME, LogEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataGenerationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "DataGeneration", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<DataGenerationType> createDataGeneration(DataGenerationType value) {
        return new JAXBElement<DataGenerationType>(_DataGeneration_QNAME, DataGenerationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeploymentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Deployment", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<DeploymentType> createDeployment(DeploymentType value) {
        return new JAXBElement<DeploymentType>(_Deployment_QNAME, DeploymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EquipmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Equipment", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "AbstractEnvironmentalMonitoringFacility")
    public JAXBElement<EquipmentType> createEquipment(EquipmentType value) {
        return new JAXBElement<EquipmentType>(_Equipment_QNAME, EquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "EventReport", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "LogEntry")
    public JAXBElement<EventReportType> createEventReport(EventReportType value) {
        return new JAXBElement<EventReportType>(_EventReport_QNAME, EventReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityLogType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "FacilityLog", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "Log")
    public JAXBElement<FacilityLogType> createFacilityLog(FacilityLogType value) {
        return new JAXBElement<FacilityLogType>(_FacilityLog_QNAME, FacilityLogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Log", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<LogType> createLog(LogType value) {
        return new JAXBElement<LogType>(_Log_QNAME, LogType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilitySetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "FacilitySet", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<FacilitySetType> createFacilitySet(FacilitySetType value) {
        return new JAXBElement<FacilitySetType>(_FacilitySet_QNAME, FacilitySetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FrequenciesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Frequencies", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<FrequenciesType> createFrequencies(FrequenciesType value) {
        return new JAXBElement<FrequenciesType>(_Frequencies_QNAME, FrequenciesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Header", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstrumentOperatingStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "InstrumentOperatingStatus", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<InstrumentOperatingStatusType> createInstrumentOperatingStatus(InstrumentOperatingStatusType value) {
        return new JAXBElement<InstrumentOperatingStatusType>(_InstrumentOperatingStatus_QNAME, InstrumentOperatingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "MaintenanceReport", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "LogEntry")
    public JAXBElement<MaintenanceReportType> createMaintenanceReport(MaintenanceReportType value) {
        return new JAXBElement<MaintenanceReportType>(_MaintenanceReport_QNAME, MaintenanceReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObservingCapabilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ObservingCapability", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<ObservingCapabilityType> createObservingCapability(ObservingCapabilityType value) {
        return new JAXBElement<ObservingCapabilityType>(_ObservingCapability_QNAME, ObservingCapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObservingFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ObservingFacility", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "AbstractEnvironmentalMonitoringFacility")
    public JAXBElement<ObservingFacilityType> createObservingFacility(ObservingFacilityType value) {
        return new JAXBElement<ObservingFacilityType>(_ObservingFacility_QNAME, ObservingFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Process", substitutionHeadNamespace = "http://def.wmo.int/metce/2013", substitutionHeadName = "Process")
    public JAXBElement<ProcessType> createProcess(ProcessType value) {
        return new JAXBElement<ProcessType>(_Process_QNAME, ProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Processing", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ProcessingType> createProcessing(ProcessingType value) {
        return new JAXBElement<ProcessingType>(_Processing_QNAME, ProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramAffiliationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ProgramAffiliation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ProgramAffiliationType> createProgramAffiliation(ProgramAffiliationType value) {
        return new JAXBElement<ProgramAffiliationType>(_ProgramAffiliation_QNAME, ProgramAffiliationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Reporting", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ReportingType> createReporting(ReportingType value) {
        return new JAXBElement<ReportingType>(_Reporting_QNAME, ReportingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ResultSet", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ResultSetType> createResultSet(ResultSetType value) {
        return new JAXBElement<ResultSetType>(_ResultSet_QNAME, ResultSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SamplingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Sampling", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<SamplingType> createSampling(SamplingType value) {
        return new JAXBElement<SamplingType>(_Sampling_QNAME, SamplingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Schedule", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ScheduleType> createSchedule(ScheduleType value) {
        return new JAXBElement<ScheduleType>(_Schedule_QNAME, ScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Attribution", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AttributionType> createAttribution(AttributionType value) {
        return new JAXBElement<AttributionType>(_Attribution_QNAME, AttributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClimateZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ClimateZone", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ClimateZoneType> createClimateZone(ClimateZoneType value) {
        return new JAXBElement<ClimateZoneType>(_ClimateZone_QNAME, ClimateZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataPolicyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "DataPolicy", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<DataPolicyType> createDataPolicy(DataPolicyType value) {
        return new JAXBElement<DataPolicyType>(_DataPolicy_QNAME, DataPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Description", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeospatialLocationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "GeospatialLocation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<GeospatialLocationType> createGeospatialLocation(GeospatialLocationType value) {
        return new JAXBElement<GeospatialLocationType>(_GeospatialLocation_QNAME, GeospatialLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportingStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ReportingStatus", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ReportingStatusType> createReportingStatus(ReportingStatusType value) {
        return new JAXBElement<ReportingStatusType>(_ReportingStatus_QNAME, ReportingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponsiblePartyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "ResponsibleParty", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ResponsiblePartyType> createResponsibleParty(ResponsiblePartyType value) {
        return new JAXBElement<ResponsiblePartyType>(_ResponsibleParty_QNAME, ResponsiblePartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SurfaceCoverType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "SurfaceCover", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<SurfaceCoverType> createSurfaceCover(SurfaceCoverType value) {
        return new JAXBElement<SurfaceCoverType>(_SurfaceCover_QNAME, SurfaceCoverType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SurfaceRoughnessType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "SurfaceRoughness", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<SurfaceRoughnessType> createSurfaceRoughness(SurfaceRoughnessType value) {
        return new JAXBElement<SurfaceRoughnessType>(_SurfaceRoughness_QNAME, SurfaceRoughnessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TerritoryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "Territory", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<TerritoryType> createTerritory(TerritoryType value) {
        return new JAXBElement<TerritoryType>(_Territory_QNAME, TerritoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopographyBathymetryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "TopographyBathymetry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<TopographyBathymetryType> createTopographyBathymetry(TopographyBathymetryType value) {
        return new JAXBElement<TopographyBathymetryType>(_TopographyBathymetry_QNAME, TopographyBathymetryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WIGOSMetadataRecordType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "WIGOSMetadataRecord", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<WIGOSMetadataRecordType> createWIGOSMetadataRecord(WIGOSMetadataRecordType value) {
        return new JAXBElement<WIGOSMetadataRecordType>(_WIGOSMetadataRecord_QNAME, WIGOSMetadataRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EquipmentLogType }{@code >}
     */
    @XmlElementDecl(namespace = "http://def.wmo.int/wmdr/2017", name = "EquipmentLog", substitutionHeadNamespace = "http://def.wmo.int/wmdr/2017", substitutionHeadName = "Log")
    public JAXBElement<EquipmentLogType> createEquipmentLog(EquipmentLogType value) {
        return new JAXBElement<EquipmentLogType>(_EquipmentLog_QNAME, EquipmentLogType.class, null, value);
    }

}
