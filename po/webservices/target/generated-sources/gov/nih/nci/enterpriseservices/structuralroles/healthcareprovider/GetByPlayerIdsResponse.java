
package gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.HealthCareProvider;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareProvider" maxOccurs="unbounded"/>
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
    "healthCareProvider"
})
@XmlRootElement(name = "GetByPlayerIdsResponse")
public class GetByPlayerIdsResponse {

    @XmlElement(name = "HealthCareProvider", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<HealthCareProvider> healthCareProvider;

    /**
     * Gets the value of the healthCareProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCareProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCareProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCareProvider }
     * 
     * 
     */
    public List<HealthCareProvider> getHealthCareProvider() {
        if (healthCareProvider == null) {
            healthCareProvider = new ArrayList<HealthCareProvider>();
        }
        return this.healthCareProvider;
    }

    public GetByPlayerIdsResponse withHealthCareProvider(HealthCareProvider... values) {
        if (values!= null) {
            for (HealthCareProvider value: values) {
                getHealthCareProvider().add(value);
            }
        }
        return this;
    }

    public GetByPlayerIdsResponse withHealthCareProvider(Collection<HealthCareProvider> values) {
        if (values!= null) {
            getHealthCareProvider().addAll(values);
        }
        return this;
    }

}
