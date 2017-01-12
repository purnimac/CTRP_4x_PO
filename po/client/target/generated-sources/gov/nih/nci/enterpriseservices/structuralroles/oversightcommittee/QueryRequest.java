
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
    "oversightCommittee",
    "limitOffset"
})
@XmlRootElement(name = "QueryRequest")
public class QueryRequest {

    @XmlElement(required = true)
    protected QueryRequest.OversightCommittee oversightCommittee;
    @XmlElement(required = true)
    protected QueryRequest.LimitOffset limitOffset;

    /**
     * Gets the value of the oversightCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest.OversightCommittee }
     *     
     */
    public QueryRequest.OversightCommittee getOversightCommittee() {
        return oversightCommittee;
    }

    /**
     * Sets the value of the oversightCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest.OversightCommittee }
     *     
     */
    public void setOversightCommittee(QueryRequest.OversightCommittee value) {
        this.oversightCommittee = value;
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
