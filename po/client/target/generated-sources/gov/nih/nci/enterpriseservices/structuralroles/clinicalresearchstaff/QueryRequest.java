
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
 *         &lt;element name="limitOffset">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://common.coppa.nci.nih.gov}LimitOffset"/>
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
    "clinicalResearchStaff",
    "limitOffset"
})
@XmlRootElement(name = "QueryRequest")
public class QueryRequest {

    @XmlElement(required = true)
    protected QueryRequest.ClinicalResearchStaff clinicalResearchStaff;
    @XmlElement(required = true)
    protected QueryRequest.LimitOffset limitOffset;

    /**
     * Gets the value of the clinicalResearchStaff property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest.ClinicalResearchStaff }
     *     
     */
    public QueryRequest.ClinicalResearchStaff getClinicalResearchStaff() {
        return clinicalResearchStaff;
    }

    /**
     * Sets the value of the clinicalResearchStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest.ClinicalResearchStaff }
     *     
     */
    public void setClinicalResearchStaff(QueryRequest.ClinicalResearchStaff value) {
        this.clinicalResearchStaff = value;
    }

    /**
     * Gets the value of the limitOffset property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest.LimitOffset }
     *     
     */
    public QueryRequest.LimitOffset getLimitOffset() {
        return limitOffset;
    }

    /**
     * Sets the value of the limitOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest.LimitOffset }
     *     
     */
    public void setLimitOffset(QueryRequest.LimitOffset value) {
        this.limitOffset = value;
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
     *         &lt;element ref="{http://common.coppa.nci.nih.gov}LimitOffset"/>
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
        "limitOffset"
    })
    public static class LimitOffset {

        @XmlElement(name = "LimitOffset", namespace = "http://common.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.common.LimitOffset limitOffset;

        /**
         * Gets the value of the limitOffset property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.common.LimitOffset }
         *     
         */
        public gov.nih.nci.coppa.common.LimitOffset getLimitOffset() {
            return limitOffset;
        }

        /**
         * Sets the value of the limitOffset property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.common.LimitOffset }
         *     
         */
        public void setLimitOffset(gov.nih.nci.coppa.common.LimitOffset value) {
            this.limitOffset = value;
        }

    }

}
