
package gov.nih.nci.enterpriseservices.structuralroles.clinicalresearchstaff;

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
 *         &lt;element name="clinicalResearchStaff">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}ClinicalResearchStaff"/>
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
    "clinicalResearchStaff"
})
@XmlRootElement(name = "ValidateRequest")
public class ValidateRequest {

    @XmlElement(required = true)
    protected ValidateRequest.ClinicalResearchStaff clinicalResearchStaff;

    /**
     * Gets the value of the clinicalResearchStaff property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateRequest.ClinicalResearchStaff }
     *     
     */
    public ValidateRequest.ClinicalResearchStaff getClinicalResearchStaff() {
        return clinicalResearchStaff;
    }

    /**
     * Sets the value of the clinicalResearchStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateRequest.ClinicalResearchStaff }
     *     
     */
    public void setClinicalResearchStaff(ValidateRequest.ClinicalResearchStaff value) {
        this.clinicalResearchStaff = value;
    }

    public ValidateRequest withClinicalResearchStaff(ValidateRequest.ClinicalResearchStaff value) {
        setClinicalResearchStaff(value);
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}ClinicalResearchStaff"/>
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
        "clinicalResearchStaff"
    })
    public static class ClinicalResearchStaff {

        @XmlElement(name = "ClinicalResearchStaff", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.ClinicalResearchStaff clinicalResearchStaff;

        /**
         * Gets the value of the clinicalResearchStaff property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.ClinicalResearchStaff }
         *     
         */
        public gov.nih.nci.coppa.po.ClinicalResearchStaff getClinicalResearchStaff() {
            return clinicalResearchStaff;
        }

        /**
         * Sets the value of the clinicalResearchStaff property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.ClinicalResearchStaff }
         *     
         */
        public void setClinicalResearchStaff(gov.nih.nci.coppa.po.ClinicalResearchStaff value) {
            this.clinicalResearchStaff = value;
        }

        public ValidateRequest.ClinicalResearchStaff withClinicalResearchStaff(gov.nih.nci.coppa.po.ClinicalResearchStaff value) {
            setClinicalResearchStaff(value);
            return this;
        }

    }

}
