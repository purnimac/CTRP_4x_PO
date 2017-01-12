
package gov.nih.nci.enterpriseservices.structuralroles.researchorganization;

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
 *         &lt;element name="researchOrganization">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}ResearchOrganization"/>
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
    "researchOrganization"
})
@XmlRootElement(name = "CreateRequest")
public class CreateRequest {

    @XmlElement(required = true)
    protected CreateRequest.ResearchOrganization researchOrganization;

    /**
     * Gets the value of the researchOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRequest.ResearchOrganization }
     *     
     */
    public CreateRequest.ResearchOrganization getResearchOrganization() {
        return researchOrganization;
    }

    /**
     * Sets the value of the researchOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRequest.ResearchOrganization }
     *     
     */
    public void setResearchOrganization(CreateRequest.ResearchOrganization value) {
        this.researchOrganization = value;
    }

    public CreateRequest withResearchOrganization(CreateRequest.ResearchOrganization value) {
        setResearchOrganization(value);
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}ResearchOrganization"/>
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
        "researchOrganization"
    })
    public static class ResearchOrganization {

        @XmlElement(name = "ResearchOrganization", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.ResearchOrganization researchOrganization;

        /**
         * Gets the value of the researchOrganization property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.ResearchOrganization }
         *     
         */
        public gov.nih.nci.coppa.po.ResearchOrganization getResearchOrganization() {
            return researchOrganization;
        }

        /**
         * Sets the value of the researchOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.ResearchOrganization }
         *     
         */
        public void setResearchOrganization(gov.nih.nci.coppa.po.ResearchOrganization value) {
            this.researchOrganization = value;
        }

        public CreateRequest.ResearchOrganization withResearchOrganization(gov.nih.nci.coppa.po.ResearchOrganization value) {
            setResearchOrganization(value);
            return this;
        }

    }

}
