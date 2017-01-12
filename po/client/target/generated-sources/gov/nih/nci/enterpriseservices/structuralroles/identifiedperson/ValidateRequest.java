
package gov.nih.nci.enterpriseservices.structuralroles.identifiedperson;

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
 *         &lt;element name="identifiedPerson">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedPerson"/>
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
    "identifiedPerson"
})
@XmlRootElement(name = "ValidateRequest")
public class ValidateRequest {

    @XmlElement(required = true)
    protected ValidateRequest.IdentifiedPerson identifiedPerson;

    /**
     * Gets the value of the identifiedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateRequest.IdentifiedPerson }
     *     
     */
    public ValidateRequest.IdentifiedPerson getIdentifiedPerson() {
        return identifiedPerson;
    }

    /**
     * Sets the value of the identifiedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateRequest.IdentifiedPerson }
     *     
     */
    public void setIdentifiedPerson(ValidateRequest.IdentifiedPerson value) {
        this.identifiedPerson = value;
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedPerson"/>
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
        "identifiedPerson"
    })
    public static class IdentifiedPerson {

        @XmlElement(name = "IdentifiedPerson", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.IdentifiedPerson identifiedPerson;

        /**
         * Gets the value of the identifiedPerson property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.IdentifiedPerson }
         *     
         */
        public gov.nih.nci.coppa.po.IdentifiedPerson getIdentifiedPerson() {
            return identifiedPerson;
        }

        /**
         * Sets the value of the identifiedPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.IdentifiedPerson }
         *     
         */
        public void setIdentifiedPerson(gov.nih.nci.coppa.po.IdentifiedPerson value) {
            this.identifiedPerson = value;
        }

    }

}
