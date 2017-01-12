
package gov.nih.nci.enterpriseservices.structuralroles.identifiedorganization;

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
 *         &lt;element name="identifiedOrganization">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedOrganization"/>
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
    "identifiedOrganization"
})
@XmlRootElement(name = "ValidateRequest")
public class ValidateRequest {

    @XmlElement(required = true)
    protected ValidateRequest.IdentifiedOrganization identifiedOrganization;

    /**
     * Gets the value of the identifiedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateRequest.IdentifiedOrganization }
     *     
     */
    public ValidateRequest.IdentifiedOrganization getIdentifiedOrganization() {
        return identifiedOrganization;
    }

    /**
     * Sets the value of the identifiedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateRequest.IdentifiedOrganization }
     *     
     */
    public void setIdentifiedOrganization(ValidateRequest.IdentifiedOrganization value) {
        this.identifiedOrganization = value;
    }

    public ValidateRequest withIdentifiedOrganization(ValidateRequest.IdentifiedOrganization value) {
        setIdentifiedOrganization(value);
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
    public static class IdentifiedOrganization {

        @XmlElement(name = "IdentifiedOrganization", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.IdentifiedOrganization identifiedOrganization;

        /**
         * Gets the value of the identifiedOrganization property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.IdentifiedOrganization }
         *     
         */
        public gov.nih.nci.coppa.po.IdentifiedOrganization getIdentifiedOrganization() {
            return identifiedOrganization;
        }

        /**
         * Sets the value of the identifiedOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.IdentifiedOrganization }
         *     
         */
        public void setIdentifiedOrganization(gov.nih.nci.coppa.po.IdentifiedOrganization value) {
            this.identifiedOrganization = value;
        }

        public ValidateRequest.IdentifiedOrganization withIdentifiedOrganization(gov.nih.nci.coppa.po.IdentifiedOrganization value) {
            setIdentifiedOrganization(value);
            return this;
        }

    }

}
