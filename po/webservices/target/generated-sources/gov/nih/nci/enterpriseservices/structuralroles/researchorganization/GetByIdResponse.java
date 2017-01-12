
package gov.nih.nci.enterpriseservices.structuralroles.researchorganization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.ResearchOrganization;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}ResearchOrganization"/>
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
    "researchOrganization"
})
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "ResearchOrganization", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected ResearchOrganization researchOrganization;

    /**
     * Gets the value of the researchOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchOrganization }
     *     
     */
    public ResearchOrganization getResearchOrganization() {
        return researchOrganization;
    }

    /**
     * Sets the value of the researchOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchOrganization }
     *     
     */
    public void setResearchOrganization(ResearchOrganization value) {
        this.researchOrganization = value;
    }

    public GetByIdResponse withResearchOrganization(ResearchOrganization value) {
        setResearchOrganization(value);
        return this;
    }

}
