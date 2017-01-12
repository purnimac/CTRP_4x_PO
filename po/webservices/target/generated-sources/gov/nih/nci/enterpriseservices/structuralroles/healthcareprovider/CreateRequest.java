
package gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider;

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
 *         &lt;element name="healthCareProvider">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareProvider"/>
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
    "healthCareProvider"
})
@XmlRootElement(name = "CreateRequest")
public class CreateRequest {

    @XmlElement(required = true)
    protected CreateRequest.HealthCareProvider healthCareProvider;

    /**
     * Gets the value of the healthCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRequest.HealthCareProvider }
     *     
     */
    public CreateRequest.HealthCareProvider getHealthCareProvider() {
        return healthCareProvider;
    }

    /**
     * Sets the value of the healthCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRequest.HealthCareProvider }
     *     
     */
    public void setHealthCareProvider(CreateRequest.HealthCareProvider value) {
        this.healthCareProvider = value;
    }

    public CreateRequest withHealthCareProvider(CreateRequest.HealthCareProvider value) {
        setHealthCareProvider(value);
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareProvider"/>
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
        "healthCareProvider"
    })
    public static class HealthCareProvider {

        @XmlElement(name = "HealthCareProvider", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.HealthCareProvider healthCareProvider;

        /**
         * Gets the value of the healthCareProvider property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.HealthCareProvider }
         *     
         */
        public gov.nih.nci.coppa.po.HealthCareProvider getHealthCareProvider() {
            return healthCareProvider;
        }

        /**
         * Sets the value of the healthCareProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.HealthCareProvider }
         *     
         */
        public void setHealthCareProvider(gov.nih.nci.coppa.po.HealthCareProvider value) {
            this.healthCareProvider = value;
        }

        public CreateRequest.HealthCareProvider withHealthCareProvider(gov.nih.nci.coppa.po.HealthCareProvider value) {
            setHealthCareProvider(value);
            return this;
        }

    }

}
