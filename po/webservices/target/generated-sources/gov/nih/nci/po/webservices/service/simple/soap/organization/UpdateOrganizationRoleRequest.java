
package gov.nih.nci.po.webservices.service.simple.soap.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.OrganizationRole;


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
 *         &lt;element name="organizationRole" type="{gov.nih.nci.po.webservices.types}OrganizationRole"/>
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
    "organizationRole"
})
@XmlRootElement(name = "updateOrganizationRoleRequest")
public class UpdateOrganizationRoleRequest {

    @XmlElement(required = true)
    protected OrganizationRole organizationRole;

    /**
     * Gets the value of the organizationRole property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRole }
     *     
     */
    public OrganizationRole getOrganizationRole() {
        return organizationRole;
    }

    /**
     * Sets the value of the organizationRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRole }
     *     
     */
    public void setOrganizationRole(OrganizationRole value) {
        this.organizationRole = value;
    }

}
