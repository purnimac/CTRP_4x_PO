
package gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.HealthCareProvider;


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
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "HealthCareProvider", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected HealthCareProvider healthCareProvider;

    /**
     * Gets the value of the healthCareProvider property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCareProvider }
     *     
     */
    public HealthCareProvider getHealthCareProvider() {
        return healthCareProvider;
    }

    /**
     * Sets the value of the healthCareProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCareProvider }
     *     
     */
    public void setHealthCareProvider(HealthCareProvider value) {
        this.healthCareProvider = value;
    }

}
