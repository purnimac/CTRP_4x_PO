
package gov.nih.nci.po.webservices.service.simple.soap.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.EntityStatus;


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
 *         &lt;element name="roleType" type="{http://soap.simple.service.webservices.po.nci.nih.gov/person/}roleType"/>
 *         &lt;element name="personRoleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{gov.nih.nci.po.webservices.types}EntityStatus"/>
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
    "personRoleID",
    "status"
})
@XmlRootElement(name = "changePersonRoleStatusRequest")
public class ChangePersonRoleStatusRequest {

    @XmlElement(required = true)
    protected RoleType roleType;
    protected long personRoleID;
    @XmlElement(required = true)
    protected EntityStatus status;

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
     * Gets the value of the personRoleID property.
     * 
     */
    public long getPersonRoleID() {
        return personRoleID;
    }

    /**
     * Sets the value of the personRoleID property.
     * 
     */
    public void setPersonRoleID(long value) {
        this.personRoleID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatus }
     *     
     */
    public EntityStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatus }
     *     
     */
    public void setStatus(EntityStatus value) {
        this.status = value;
    }

}
