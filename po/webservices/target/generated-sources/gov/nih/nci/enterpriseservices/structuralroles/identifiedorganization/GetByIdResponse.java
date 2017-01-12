
package gov.nih.nci.enterpriseservices.structuralroles.identifiedorganization;

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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedOrganization"/>
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
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "IdentifiedOrganization", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected IdentifiedOrganization identifiedOrganization;

    /**
     * Gets the value of the identifiedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedOrganization }
     *     
     */
    public IdentifiedOrganization getIdentifiedOrganization() {
        return identifiedOrganization;
    }

    /**
     * Sets the value of the identifiedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedOrganization }
     *     
     */
    public void setIdentifiedOrganization(IdentifiedOrganization value) {
        this.identifiedOrganization = value;
    }

    public GetByIdResponse withIdentifiedOrganization(IdentifiedOrganization value) {
        setIdentifiedOrganization(value);
        return this;
    }

}
