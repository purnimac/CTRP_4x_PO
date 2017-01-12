
package gov.nih.nci.enterpriseservices.structuralroles.organizationalcontact;

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
 *         &lt;element name="organizationalContact">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}OrganizationalContact"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "ValidateRequest")
public class ValidateRequest {

    @XmlElement(required = true)
    protected ValidateRequest.OrganizationalContact organizationalContact;

    /**
     * Gets the value of the organizationalContact property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateRequest.OrganizationalContact }
     *     
     */
    public ValidateRequest.OrganizationalContact getOrganizationalContact() {
        return organizationalContact;
    }

    /**
     * Sets the value of the organizationalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateRequest.OrganizationalContact }
     *     
     */
    public void setOrganizationalContact(ValidateRequest.OrganizationalContact value) {
        this.organizationalContact = value;
    }

    public ValidateRequest withOrganizationalContact(ValidateRequest.OrganizationalContact value) {
        setOrganizationalContact(value);
        return this;
    }


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
    public static class OrganizationalContact {

        @XmlElement(name = "OrganizationalContact", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.OrganizationalContact organizationalContact;

        /**
         * Gets the value of the organizationalContact property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.OrganizationalContact }
         *     
         */
        public gov.nih.nci.coppa.po.OrganizationalContact getOrganizationalContact() {
            return organizationalContact;
        }

        /**
         * Sets the value of the organizationalContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.OrganizationalContact }
         *     
         */
        public void setOrganizationalContact(gov.nih.nci.coppa.po.OrganizationalContact value) {
            this.organizationalContact = value;
        }

        public ValidateRequest.OrganizationalContact withOrganizationalContact(gov.nih.nci.coppa.po.OrganizationalContact value) {
            setOrganizationalContact(value);
            return this;
        }

    }

}
