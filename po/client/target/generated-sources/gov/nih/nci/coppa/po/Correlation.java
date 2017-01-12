
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.DSETII;


/**
 * <p>Java class for Correlation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Correlation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{uri:iso.org:21090}DSET_II"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Correlation", propOrder = {
    "identifier"
})
@XmlSeeAlso({
    Patient.class,
    IdentifiedOrganization.class,
    HealthCareProvider.class,
    HealthCareFacility.class,
    OversightCommittee.class,
    ClinicalResearchStaff.class,
    IdentifiedPerson.class,
    OrganizationalContact.class,
    ResearchOrganization.class
})
public abstract class Correlation {

    @XmlElement(required = true)
    protected DSETII identifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link DSETII }
     *     
     */
    public DSETII getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSETII }
     *     
     */
    public void setIdentifier(DSETII value) {
        this.identifier = value;
    }

}
