
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
    "healthCareFacility",
    "limitOffset"
})
@XmlRootElement(name = "QueryRequest")
public class QueryRequest {

    @XmlElement(required = true)
    protected QueryRequest.HealthCareFacility healthCareFacility;
    @XmlElement(required = true)
    protected QueryRequest.LimitOffset limitOffset;

    /**
     * Gets the value of the healthCareFacility property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest.HealthCareFacility }
     *     
     */
    public QueryRequest.HealthCareFacility getHealthCareFacility() {
        return healthCareFacility;
    }

    /**
     * Sets the value of the healthCareFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest.HealthCareFacility }
     *     
     */
    public void setHealthCareFacility(QueryRequest.HealthCareFacility value) {
        this.healthCareFacility = value;
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

    public QueryRequest withHealthCareFacility(QueryRequest.HealthCareFacility value) {
        setHealthCareFacility(value);
        return this;
    }

    public QueryRequest withLimitOffset(QueryRequest.LimitOffset value) {
        setLimitOffset(value);
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

        public QueryRequest.HealthCareFacility withHealthCareFacility(gov.nih.nci.coppa.po.HealthCareFacility value) {
            setHealthCareFacility(value);
            return this;
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

        public QueryRequest.LimitOffset withLimitOffset(gov.nih.nci.coppa.common.LimitOffset value) {
            setLimitOffset(value);
            return this;
        }

    }

}
