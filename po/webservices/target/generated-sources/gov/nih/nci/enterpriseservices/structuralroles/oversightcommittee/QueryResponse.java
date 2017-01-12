
package gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.OversightCommittee;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OversightCommittee" maxOccurs="unbounded"/>
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
    "oversightCommittee"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(name = "OversightCommittee", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<OversightCommittee> oversightCommittee;

    /**
     * Gets the value of the oversightCommittee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oversightCommittee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOversightCommittee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OversightCommittee }
     * 
     * 
     */
    public List<OversightCommittee> getOversightCommittee() {
        if (oversightCommittee == null) {
            oversightCommittee = new ArrayList<OversightCommittee>();
        }
        return this.oversightCommittee;
    }

    public QueryResponse withOversightCommittee(OversightCommittee... values) {
        if (values!= null) {
            for (OversightCommittee value: values) {
                getOversightCommittee().add(value);
            }
        }
        return this;
    }

    public QueryResponse withOversightCommittee(Collection<OversightCommittee> values) {
        if (values!= null) {
            getOversightCommittee().addAll(values);
        }
        return this;
    }

}
