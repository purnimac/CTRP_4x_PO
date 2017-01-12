
package gov.nih.nci.enterpriseservices.structuralroles.identifiedorganization;

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
 *         &lt;element name="id">
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
@XmlRootElement(name = "GetByIdRequest")
public class GetByIdRequest {

    @XmlElement(required = true)
    protected GetByIdRequest.Id id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GetByIdRequest.Id }
     *     
     */
    public GetByIdRequest.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetByIdRequest.Id }
     *     
     */
    public void setId(GetByIdRequest.Id value) {
        this.id = value;
    }

    public GetByIdRequest withId(GetByIdRequest.Id value) {
        setId(value);
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
    public static class Id {

        @XmlElement(name = "Id", namespace = "http://iso21090.nci.nih.gov", required = true)
        protected gov.nih.nci.iso21090.extensions.Id id;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link gov.nih.nci.iso21090.extensions.Id }
         *     
         */
        public gov.nih.nci.iso21090.extensions.Id getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link gov.nih.nci.iso21090.extensions.Id }
         *     
         */
        public void setId(gov.nih.nci.iso21090.extensions.Id value) {
            this.id = value;
        }

        public GetByIdRequest.Id withId(gov.nih.nci.iso21090.extensions.Id value) {
            setId(value);
            return this;
        }

    }

}
