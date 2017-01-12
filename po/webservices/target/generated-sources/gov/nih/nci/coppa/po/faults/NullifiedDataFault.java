
package gov.nih.nci.coppa.po.faults;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for NullifiedDataFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullifiedDataFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://faults.po.coppa.nci.nih.gov}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="nullifiedEntries" type="{http://faults.po.coppa.nci.nih.gov}SimpleIIMapType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullifiedDataFault", propOrder = {
    "nullifiedEntries"
})
@XmlSeeAlso({
    NullifiedEntityFault.class,
    NullifiedRoleFault.class
})
public abstract class NullifiedDataFault
    extends BaseFaultType
{

    @XmlElement(required = true)
    protected SimpleIIMapType nullifiedEntries;

    /**
     * Gets the value of the nullifiedEntries property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIIMapType }
     *     
     */
    public SimpleIIMapType getNullifiedEntries() {
        return nullifiedEntries;
    }

    /**
     * Sets the value of the nullifiedEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIIMapType }
     *     
     */
    public void setNullifiedEntries(SimpleIIMapType value) {
        this.nullifiedEntries = value;
    }

    public NullifiedDataFault withNullifiedEntries(SimpleIIMapType value) {
        setNullifiedEntries(value);
        return this;
    }

    @Override
    public NullifiedDataFault withTimestamp(XMLGregorianCalendar value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public NullifiedDataFault withOriginator(EndpointReferenceType value) {
        setOriginator(value);
        return this;
    }

    @Override
    public NullifiedDataFault withErrorCode(BaseFaultType.ErrorCode value) {
        setErrorCode(value);
        return this;
    }

    @Override
    public NullifiedDataFault withDescription(BaseFaultType.Description... values) {
        if (values!= null) {
            for (BaseFaultType.Description value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public NullifiedDataFault withDescription(Collection<BaseFaultType.Description> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    @Override
    public NullifiedDataFault withFaultCause(BaseFaultType... values) {
        if (values!= null) {
            for (BaseFaultType value: values) {
                getFaultCause().add(value);
            }
        }
        return this;
    }

    @Override
    public NullifiedDataFault withFaultCause(Collection<BaseFaultType> values) {
        if (values!= null) {
            getFaultCause().addAll(values);
        }
        return this;
    }

}
