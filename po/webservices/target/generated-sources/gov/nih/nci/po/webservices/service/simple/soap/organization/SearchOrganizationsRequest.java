
package gov.nih.nci.po.webservices.service.simple.soap.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.OrganizationSearchCriteria;


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
 *         &lt;element name="organizationSearchCriteria" type="{gov.nih.nci.po.webservices.types}OrganizationSearchCriteria"/>
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
    "organizationSearchCriteria"
})
@XmlRootElement(name = "searchOrganizationsRequest")
public class SearchOrganizationsRequest {

    @XmlElement(required = true)
    protected OrganizationSearchCriteria organizationSearchCriteria;

    /**
     * Gets the value of the organizationSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSearchCriteria }
     *     
     */
    public OrganizationSearchCriteria getOrganizationSearchCriteria() {
        return organizationSearchCriteria;
    }

    /**
     * Sets the value of the organizationSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSearchCriteria }
     *     
     */
    public void setOrganizationSearchCriteria(OrganizationSearchCriteria value) {
        this.organizationSearchCriteria = value;
    }

}
