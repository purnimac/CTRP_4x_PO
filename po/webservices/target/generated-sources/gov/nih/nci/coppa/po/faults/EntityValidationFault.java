
package gov.nih.nci.coppa.po.faults;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for EntityValidationFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityValidationFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://faults.po.coppa.nci.nih.gov}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="errors" type="{http://faults.po.coppa.nci.nih.gov}StringMapType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityValidationFault", propOrder = {
    "errors"
})
public class EntityValidationFault
    extends BaseFaultType
{

    @XmlElement(required = true)
    protected StringMapType errors;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link StringMapType }
     *     
     */
    public StringMapType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMapType }
     *     
     */
    public void setErrors(StringMapType value) {
        this.errors = value;
    }

    public EntityValidationFault withErrors(StringMapType value) {
        setErrors(value);
        return this;
    }

    @Override
    public EntityValidationFault withTimestamp(XMLGregorianCalendar value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public EntityValidationFault withOriginator(EndpointReferenceType value) {
        setOriginator(value);
        return this;
    }

    @Override
    public EntityValidationFault withErrorCode(BaseFaultType.ErrorCode value) {
        setErrorCode(value);
        return this;
    }

    @Override
    public EntityValidationFault withDescription(BaseFaultType.Description... values) {
        if (values!= null) {
            for (BaseFaultType.Description value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public EntityValidationFault withDescription(Collection<BaseFaultType.Description> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    @Override
    public EntityValidationFault withFaultCause(BaseFaultType... values) {
        if (values!= null) {
            for (BaseFaultType value: values) {
                getFaultCause().add(value);
            }
        }
        return this;
    }

    @Override
    public EntityValidationFault withFaultCause(Collection<BaseFaultType> values) {
        if (values!= null) {
            getFaultCause().addAll(values);
        }
        return this;
    }

}
