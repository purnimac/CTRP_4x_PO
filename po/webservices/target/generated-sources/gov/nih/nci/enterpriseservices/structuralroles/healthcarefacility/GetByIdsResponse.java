
package gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.HealthCareFacility;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareFacility" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "healthCareFacility"
})
@XmlRootElement(name = "GetByIdsResponse")
public class GetByIdsResponse {

    @XmlElement(name = "HealthCareFacility", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<HealthCareFacility> healthCareFacility;

    /**
     * Gets the value of the healthCareFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCareFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCareFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCareFacility }
     * 
     * 
     */
    public List<HealthCareFacility> getHealthCareFacility() {
        if (healthCareFacility == null) {
            healthCareFacility = new ArrayList<HealthCareFacility>();
        }
        return this.healthCareFacility;
    }

    public GetByIdsResponse withHealthCareFacility(HealthCareFacility... values) {
        if (values!= null) {
            for (HealthCareFacility value: values) {
                getHealthCareFacility().add(value);
            }
        }
        return this;
    }

    public GetByIdsResponse withHealthCareFacility(Collection<HealthCareFacility> values) {
        if (values!= null) {
            getHealthCareFacility().addAll(values);
        }
        return this;
    }

}
