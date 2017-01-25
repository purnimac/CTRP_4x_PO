
package gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee;

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
 *         &lt;element name="oversightCommittee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}OversightCommittee"/>
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
    "oversightCommittee"
})
@XmlRootElement(name = "ValidateRequest")
public class ValidateRequest {

    @XmlElement(required = true)
    protected ValidateRequest.OversightCommittee oversightCommittee;

    /**
     * Gets the value of the oversightCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateRequest.OversightCommittee }
     *     
     */
    public ValidateRequest.OversightCommittee getOversightCommittee() {
        return oversightCommittee;
    }

    /**
     * Sets the value of the oversightCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateRequest.OversightCommittee }
     *     
     */
    public void setOversightCommittee(ValidateRequest.OversightCommittee value) {
        this.oversightCommittee = value;
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}OversightCommittee"/>
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
        "oversightCommittee"
    })
    public static class OversightCommittee {

        @XmlElement(name = "OversightCommittee", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.OversightCommittee oversightCommittee;

        /**
         * Gets the value of the oversightCommittee property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.OversightCommittee }
         *     
         */
        public gov.nih.nci.coppa.po.OversightCommittee getOversightCommittee() {
            return oversightCommittee;
        }

        /**
         * Sets the value of the oversightCommittee property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.OversightCommittee }
         *     
         */
        public void setOversightCommittee(gov.nih.nci.coppa.po.OversightCommittee value) {
            this.oversightCommittee = value;
        }

    }

}