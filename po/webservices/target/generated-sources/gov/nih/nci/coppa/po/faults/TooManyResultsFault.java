
package gov.nih.nci.coppa.po.faults;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for TooManyResultsFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TooManyResultsFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://faults.po.coppa.nci.nih.gov}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TooManyResultsFault", propOrder = {
    "maxResults"
})
public class TooManyResultsFault
    extends BaseFaultType
{

    protected int maxResults;

    /**
     * Gets the value of the maxResults property.
     * 
     */
    public int getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     */
    public void setMaxResults(int value) {
        this.maxResults = value;
    }

    public TooManyResultsFault withMaxResults(int value) {
        setMaxResults(value);
        return this;
    }

    @Override
    public TooManyResultsFault withTimestamp(XMLGregorianCalendar value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public TooManyResultsFault withOriginator(EndpointReferenceType value) {
        setOriginator(value);
        return this;
    }

    @Override
    public TooManyResultsFault withErrorCode(BaseFaultType.ErrorCode value) {
        setErrorCode(value);
        return this;
    }

    @Override
    public TooManyResultsFault withDescription(BaseFaultType.Description... values) {
        if (values!= null) {
            for (BaseFaultType.Description value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public TooManyResultsFault withDescription(Collection<BaseFaultType.Description> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    @Override
    public TooManyResultsFault withFaultCause(BaseFaultType... values) {
        if (values!= null) {
            for (BaseFaultType value: values) {
                getFaultCause().add(value);
            }
        }
        return this;
    }

    @Override
    public TooManyResultsFault withFaultCause(Collection<BaseFaultType> values) {
        if (values!= null) {
            getFaultCause().addAll(values);
        }
        return this;
    }

}
