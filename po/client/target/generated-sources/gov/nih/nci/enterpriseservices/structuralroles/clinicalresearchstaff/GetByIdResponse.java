
package gov.nih.nci.enterpriseservices.structuralroles.clinicalresearchstaff;

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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}ClinicalResearchStaff"/>
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
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "ClinicalResearchStaff", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected ClinicalResearchStaff clinicalResearchStaff;

    /**
     * Gets the value of the clinicalResearchStaff property.
     * 
     * @return
     *     possible object is
     *     {@link ClinicalResearchStaff }
     *     
     */
    public ClinicalResearchStaff getClinicalResearchStaff() {
        return clinicalResearchStaff;
    }

    /**
     * Sets the value of the clinicalResearchStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClinicalResearchStaff }
     *     
     */
    public void setClinicalResearchStaff(ClinicalResearchStaff value) {
        this.clinicalResearchStaff = value;
    }

}
