
package _int.wmo.def.wmdr._2017;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for LogEntryPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogEntryPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://def.wmo.int/wmdr/2017}LogEntry"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogEntryPropertyType", propOrder = {
    "logEntry"
})
public class LogEntryPropertyType implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "LogEntry", namespace = "http://def.wmo.int/wmdr/2017", type = JAXBElement.class)
    protected JAXBElement<? extends LogEntryType> logEntry;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the logEntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
     *     
     */
    public JAXBElement<? extends LogEntryType> getLogEntry() {
        return logEntry;
    }

    /**
     * Sets the value of the logEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ControlCheckReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaintenanceReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventReportType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LogEntryType }{@code >}
     *     
     */
    public void setLogEntry(JAXBElement<? extends LogEntryType> value) {
        this.logEntry = value;
    }

    public boolean isSetLogEntry() {
        return (this.logEntry!= null);
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            JAXBElement<? extends LogEntryType> theLogEntry;
            theLogEntry = this.getLogEntry();
            strategy.appendField(locator, this, "logEntry", buffer, theLogEntry, this.isSetLogEntry());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            strategy.appendField(locator, this, "owns", buffer, theOwns, this.isSetOwns());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LogEntryPropertyType that = ((LogEntryPropertyType) object);
        {
            JAXBElement<? extends LogEntryType> lhsLogEntry;
            lhsLogEntry = this.getLogEntry();
            JAXBElement<? extends LogEntryType> rhsLogEntry;
            rhsLogEntry = that.getLogEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logEntry", lhsLogEntry), LocatorUtils.property(thatLocator, "logEntry", rhsLogEntry), lhsLogEntry, rhsLogEntry, this.isSetLogEntry(), that.isSetLogEntry())) {
                return false;
            }
        }
        {
            boolean lhsOwns;
            lhsOwns = (this.isSetOwns()?this.isOwns():false);
            boolean rhsOwns;
            rhsOwns = (that.isSetOwns()?that.isOwns():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owns", lhsOwns), LocatorUtils.property(thatLocator, "owns", rhsOwns), lhsOwns, rhsOwns, this.isSetOwns(), that.isSetOwns())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            JAXBElement<? extends LogEntryType> theLogEntry;
            theLogEntry = this.getLogEntry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logEntry", theLogEntry), currentHashCode, theLogEntry, this.isSetLogEntry());
        }
        {
            boolean theOwns;
            theOwns = (this.isSetOwns()?this.isOwns():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owns", theOwns), currentHashCode, theOwns, this.isSetOwns());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LogEntryPropertyType) {
            final LogEntryPropertyType copy = ((LogEntryPropertyType) draftCopy);
            {
                Boolean logEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetLogEntry());
                if (logEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<? extends LogEntryType> sourceLogEntry;
                    sourceLogEntry = this.getLogEntry();
                    @SuppressWarnings("unchecked")
                    JAXBElement<? extends LogEntryType> copyLogEntry = ((JAXBElement<? extends LogEntryType> ) strategy.copy(LocatorUtils.property(locator, "logEntry", sourceLogEntry), sourceLogEntry, this.isSetLogEntry()));
                    copy.setLogEntry(copyLogEntry);
                } else {
                    if (logEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.logEntry = null;
                    }
                }
            }
            {
                Boolean ownsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOwns());
                if (ownsShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceOwns;
                    sourceOwns = (this.isSetOwns()?this.isOwns():false);
                    boolean copyOwns = strategy.copy(LocatorUtils.property(locator, "owns", sourceOwns), sourceOwns, this.isSetOwns());
                    copy.setOwns(copyOwns);
                } else {
                    if (ownsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOwns();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LogEntryPropertyType();
    }

}
