//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.14 at 09:14:09 AM CEST 
//


package _int.wmo.def.wmdr._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.ReferenceType;


/**
 * <p>Java class for EventReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://def.wmo.int/wmdr/2017}LogEntryType">
 *       &lt;sequence>
 *         &lt;element name="typeOfEvent" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventReportType", propOrder = {
    "typeOfEvent"
})
public class EventReportType
    extends LogEntryType
{

    @XmlElement(required = true)
    protected ReferenceType typeOfEvent;

    /**
     * Gets the value of the typeOfEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTypeOfEvent() {
        return typeOfEvent;
    }

    /**
     * Sets the value of the typeOfEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTypeOfEvent(ReferenceType value) {
        this.typeOfEvent = value;
    }

}