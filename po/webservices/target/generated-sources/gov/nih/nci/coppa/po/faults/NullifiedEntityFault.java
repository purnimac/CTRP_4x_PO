
package gov.nih.nci.coppa.po.faults;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.xmlsoap.schemas.ws._2004._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for NullifiedEntityFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullifiedEntityFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://faults.po.coppa.nci.nih.gov}NullifiedDataFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullifiedEntityFault")
public class NullifiedEntityFault
    extends NullifiedDataFault
{


    @Override
    public NullifiedEntityFault withNullifiedEntries(SimpleIIMapType value) {
        setNullifiedEntries(value);
        return this;
    }

    @Override
    public NullifiedEntityFault withTimestamp(XMLGregorianCalendar value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public NullifiedEntityFault withOriginator(EndpointReferenceType value) {
        setOriginator(value);
        return this;
    }

    @Override
    public NullifiedEntityFault withErrorCode(BaseFaultType.ErrorCode value) {
        setErrorCode(value);
        return this;
    }

    @Override
    public NullifiedEntityFault withDescription(BaseFaultType.Description... values) {
        if (values!= null) {
            for (BaseFaultType.Description value: values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    @Override
    public NullifiedEntityFault withDescription(Collection<BaseFaultType.Description> values) {
        if (values!= null) {
            getDescription().addAll(values);
        }
        return this;
    }

    @Override
    public NullifiedEntityFault withFaultCause(BaseFaultType... values) {
        if (values!= null) {
            for (BaseFaultType value: values) {
                getFaultCause().add(value);
            }
        }
        return this;
    }

    @Override
    public NullifiedEntityFault withFaultCause(Collection<BaseFaultType> values) {
        if (values!= null) {
            getFaultCause().addAll(values);
        }
        return this;
    }

}
