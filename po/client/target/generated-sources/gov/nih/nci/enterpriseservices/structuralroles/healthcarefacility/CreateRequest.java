
package gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility;

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
 *         &lt;element name="healthCareFacility">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareFacility"/>
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
    "healthCareFacility"
})
@XmlRootElement(name = "CreateRequest")
public class CreateRequest {

    @XmlElement(required = true)
    protected CreateRequest.HealthCareFacility healthCareFacility;

    /**
     * Gets the value of the healthCareFacility property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRequest.HealthCareFacility }
     *     
     */
    public CreateRequest.HealthCareFacility getHealthCareFacility() {
        return healthCareFacility;
    }

    /**
     * Sets the value of the healthCareFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRequest.HealthCareFacility }
     *     
     */
    public void setHealthCareFacility(CreateRequest.HealthCareFacility value) {
        this.healthCareFacility = value;
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareFacility"/>
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
        "healthCareFacility"
    })
    public static class HealthCareFacility {

        @XmlElement(name = "HealthCareFacility", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.HealthCareFacility healthCareFacility;

        /**
         * Gets the value of the healthCareFacility property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.HealthCareFacility }
         *     
         */
        public gov.nih.nci.coppa.po.HealthCareFacility getHealthCareFacility() {
            return healthCareFacility;
        }

        /**
         * Sets the value of the healthCareFacility property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.HealthCareFacility }
         *     
         */
        public void setHealthCareFacility(gov.nih.nci.coppa.po.HealthCareFacility value) {
            this.healthCareFacility = value;
        }

    }

}
