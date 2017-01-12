
package gov.nih.nci.enterpriseservices.structuralroles.identifiedperson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.IdentifiedPerson;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedPerson" maxOccurs="unbounded"/>
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
    "identifiedPerson"
})
@XmlRootElement(name = "GetByIdsResponse")
public class GetByIdsResponse {

    @XmlElement(name = "IdentifiedPerson", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<IdentifiedPerson> identifiedPerson;

    /**
     * Gets the value of the identifiedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedPerson }
     * 
     * 
     */
    public List<IdentifiedPerson> getIdentifiedPerson() {
        if (identifiedPerson == null) {
            identifiedPerson = new ArrayList<IdentifiedPerson>();
        }
        return this.identifiedPerson;
    }

    public GetByIdsResponse withIdentifiedPerson(IdentifiedPerson... values) {
        if (values!= null) {
            for (IdentifiedPerson value: values) {
                getIdentifiedPerson().add(value);
            }
        }
        return this;
    }

    public GetByIdsResponse withIdentifiedPerson(Collection<IdentifiedPerson> values) {
        if (values!= null) {
            getIdentifiedPerson().addAll(values);
        }
        return this;
    }

}
