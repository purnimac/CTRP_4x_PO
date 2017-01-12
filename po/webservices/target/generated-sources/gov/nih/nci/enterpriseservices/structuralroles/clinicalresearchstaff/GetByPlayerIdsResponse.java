
package gov.nih.nci.enterpriseservices.structuralroles.clinicalresearchstaff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.ClinicalResearchStaff;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}ClinicalResearchStaff" maxOccurs="unbounded"/>
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
    "clinicalResearchStaff"
})
@XmlRootElement(name = "GetByPlayerIdsResponse")
public class GetByPlayerIdsResponse {

    @XmlElement(name = "ClinicalResearchStaff", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<ClinicalResearchStaff> clinicalResearchStaff;

    /**
     * Gets the value of the clinicalResearchStaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalResearchStaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalResearchStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClinicalResearchStaff }
     * 
     * 
     */
    public List<ClinicalResearchStaff> getClinicalResearchStaff() {
        if (clinicalResearchStaff == null) {
            clinicalResearchStaff = new ArrayList<ClinicalResearchStaff>();
        }
        return this.clinicalResearchStaff;
    }

    public GetByPlayerIdsResponse withClinicalResearchStaff(ClinicalResearchStaff... values) {
        if (values!= null) {
            for (ClinicalResearchStaff value: values) {
                getClinicalResearchStaff().add(value);
            }
        }
        return this;
    }

    public GetByPlayerIdsResponse withClinicalResearchStaff(Collection<ClinicalResearchStaff> values) {
        if (values!= null) {
            getClinicalResearchStaff().addAll(values);
        }
        return this;
    }

}
