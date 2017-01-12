
package gov.nih.nci.enterpriseservices.structuralroles.researchorganization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.iso21090.extensions.Cd;
import gov.nih.nci.iso21090.extensions.Id;


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
 *         &lt;element name="targetId">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://iso21090.nci.nih.gov}Id"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statusCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://iso21090.nci.nih.gov}Cd"/>
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
    "targetId",
    "statusCode"
})
@XmlRootElement(name = "UpdateStatusRequest")
public class UpdateStatusRequest {

    @XmlElement(required = true)
    protected UpdateStatusRequest.TargetId targetId;
    @XmlElement(required = true)
    protected UpdateStatusRequest.StatusCode statusCode;

    /**
     * Gets the value of the targetId property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatusRequest.TargetId }
     *     
     */
    public UpdateStatusRequest.TargetId getTargetId() {
        return targetId;
    }

    /**
     * Sets the value of the targetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatusRequest.TargetId }
     *     
     */
    public void setTargetId(UpdateStatusRequest.TargetId value) {
        this.targetId = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatusRequest.StatusCode }
     *     
     */
    public UpdateStatusRequest.StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatusRequest.StatusCode }
     *     
     */
    public void setStatusCode(UpdateStatusRequest.StatusCode value) {
        this.statusCode = value;
    }

    public UpdateStatusRequest withTargetId(UpdateStatusRequest.TargetId value) {
        setTargetId(value);
        return this;
    }

    public UpdateStatusRequest withStatusCode(UpdateStatusRequest.StatusCode value) {
        setStatusCode(value);
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
     *         &lt;element ref="{http://iso21090.nci.nih.gov}Cd"/>
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
        "cd"
    })
    public static class StatusCode {

        @XmlElement(name = "Cd", namespace = "http://iso21090.nci.nih.gov", required = true)
        protected Cd cd;

        /**
         * Gets the value of the cd property.
         * 
         * @return
         *     possible object is
         *     {@link Cd }
         *     
         */
        public Cd getCd() {
            return cd;
        }

        /**
         * Sets the value of the cd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cd }
         *     
         */
        public void setCd(Cd value) {
            this.cd = value;
        }

        public UpdateStatusRequest.StatusCode withCd(Cd value) {
            setCd(value);
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
     *         &lt;element ref="{http://iso21090.nci.nih.gov}Id"/>
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
        "id"
    })
    public static class TargetId {

        @XmlElement(name = "Id", namespace = "http://iso21090.nci.nih.gov", required = true)
        protected Id id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link Id }
         *     
         */
        public Id getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Id }
         *     
         */
        public void setId(Id value) {
            this.id = value;
        }

        public UpdateStatusRequest.TargetId withId(Id value) {
            setId(value);
            return this;
        }

    }

}
