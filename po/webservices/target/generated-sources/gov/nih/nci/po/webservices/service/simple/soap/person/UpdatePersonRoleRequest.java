
package gov.nih.nci.po.webservices.service.simple.soap.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.PersonRole;


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
 *         &lt;element name="personRole" type="{gov.nih.nci.po.webservices.types}PersonRole"/>
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
    "personRole"
})
@XmlRootElement(name = "updatePersonRoleRequest")
public class UpdatePersonRoleRequest {

    @XmlElement(required = true)
    protected PersonRole personRole;

    /**
     * Gets the value of the personRole property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRole }
     *     
     */
    public PersonRole getPersonRole() {
        return personRole;
    }

    /**
     * Sets the value of the personRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRole }
     *     
     */
    public void setPersonRole(PersonRole value) {
        this.personRole = value;
    }

}
