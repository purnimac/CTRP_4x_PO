
package gov.nih.nci.po.webservices.service.simple.soap.person;

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
 *         &lt;element name="roleType" type="{http://soap.simple.service.webservices.po.nci.nih.gov/person/}roleType"/>
 *         &lt;element name="personRoleID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "personRoleID"
})
@XmlRootElement(name = "getPersonRoleByIdRequest")
public class GetPersonRoleByIdRequest {

    @XmlElement(required = true)
    protected RoleType roleType;
    protected long personRoleID;

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

}
