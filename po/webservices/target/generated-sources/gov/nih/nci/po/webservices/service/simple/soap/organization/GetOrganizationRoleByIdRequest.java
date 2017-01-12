
package gov.nih.nci.po.webservices.service.simple.soap.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="roleType" type="{http://soap.simple.service.webservices.po.nci.nih.gov/organization/}roleType"/>
 *         &lt;element name="organizationRoleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "roleType",
    "organizationRoleID"
})
@XmlRootElement(name = "getOrganizationRoleByIdRequest")
public class GetOrganizationRoleByIdRequest {

    @XmlElement(required = true)
    protected RoleType roleType;
    protected long organizationRoleID;

    /**
     * Gets the value of the roleType property.
     * 
     * @return
     *     possible object is
     *     {@link RoleType }
     *     
     */
    public RoleType getRoleType() {
        return roleType;
    }

    /**
     * Sets the value of the roleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setRoleType(RoleType value) {
        this.roleType = value;
    }

    /**
     * Gets the value of the organizationRoleID property.
     * 
     */
    public long getOrganizationRoleID() {
        return organizationRoleID;
    }

    /**
     * Sets the value of the organizationRoleID property.
     * 
     */
    public void setOrganizationRoleID(long value) {
        this.organizationRoleID = value;
    }

}
