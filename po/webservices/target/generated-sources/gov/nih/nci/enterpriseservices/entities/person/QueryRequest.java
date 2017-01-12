
package gov.nih.nci.enterpriseservices.entities.person;

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
 *         &lt;element name="person">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://po.coppa.nci.nih.gov}Person"/>
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
    "person",
    "limitOffset"
})
@XmlRootElement(name = "QueryRequest")
public class QueryRequest {

    @XmlElement(required = true)
    protected QueryRequest.Person person;
    @XmlElement(required = true)
    protected QueryRequest.LimitOffset limitOffset;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest.Person }
     *     
     */
    public QueryRequest.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest.Person }
     *     
     */
    public void setPerson(QueryRequest.Person value) {
        this.person = value;
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

    public QueryRequest withPerson(QueryRequest.Person value) {
        setPerson(value);
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
     *         &lt;element ref="{http://po.coppa.nci.nih.gov}Person"/>
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
        "person"
    })
    public static class Person {

        @XmlElement(name = "Person", namespace = "http://po.coppa.nci.nih.gov", required = true)
        protected gov.nih.nci.coppa.po.Person person;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.coppa.po.Person }
         *     
         */
        public gov.nih.nci.coppa.po.Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.coppa.po.Person }
         *     
         */
        public void setPerson(gov.nih.nci.coppa.po.Person value) {
            this.person = value;
        }

        public QueryRequest.Person withPerson(gov.nih.nci.coppa.po.Person value) {
            setPerson(value);
            return this;
        }

    }

}
