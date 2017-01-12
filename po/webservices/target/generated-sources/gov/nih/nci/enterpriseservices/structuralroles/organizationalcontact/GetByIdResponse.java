
package gov.nih.nci.enterpriseservices.structuralroles.organizationalcontact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.OrganizationalContact;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OrganizationalContact"/>
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
    "organizationalContact"
})
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "OrganizationalContact", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected OrganizationalContact organizationalContact;

    /**
     * Gets the value of the organizationalContact property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationalContact }
     *     
     */
    public OrganizationalContact getOrganizationalContact() {
        return organizationalContact;
    }

    /**
     * Sets the value of the organizationalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationalContact }
     *     
     */
    public void setOrganizationalContact(OrganizationalContact value) {
        this.organizationalContact = value;
    }

    public GetByIdResponse withOrganizationalContact(OrganizationalContact value) {
        setOrganizationalContact(value);
        return this;
    }

}
