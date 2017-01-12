
package gov.nih.nci.enterpriseservices.structuralroles.identifiedorganization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.IdentifiedOrganization;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedOrganization" maxOccurs="unbounded"/>
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
    "identifiedOrganization"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(name = "IdentifiedOrganization", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<IdentifiedOrganization> identifiedOrganization;

    /**
     * Gets the value of the identifiedOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiedOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedOrganization }
     * 
     * 
     */
    public List<IdentifiedOrganization> getIdentifiedOrganization() {
        if (identifiedOrganization == null) {
            identifiedOrganization = new ArrayList<IdentifiedOrganization>();
        }
        return this.identifiedOrganization;
    }

    public QueryResponse withIdentifiedOrganization(IdentifiedOrganization... values) {
        if (values!= null) {
            for (IdentifiedOrganization value: values) {
                getIdentifiedOrganization().add(value);
            }
        }
        return this;
    }

    public QueryResponse withIdentifiedOrganization(Collection<IdentifiedOrganization> values) {
        if (values!= null) {
            getIdentifiedOrganization().addAll(values);
        }
        return this;
    }

}
