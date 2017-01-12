
package gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 *                   &lt;element ref="{http://iso21090.nci.nih.gov}Id" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "GetByIdsRequest")
public class GetByIdsRequest {

    @XmlElement(required = true)
    protected GetByIdsRequest.Id id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GetByIdsRequest.Id }
     *     
     */
    public GetByIdsRequest.Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetByIdsRequest.Id }
     *     
     */
    public void setId(GetByIdsRequest.Id value) {
        this.id = value;
    }

    public GetByIdsRequest withId(GetByIdsRequest.Id value) {
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
     *         &lt;element ref="{http://iso21090.nci.nih.gov}Id" maxOccurs="unbounded"/>
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
        protected List<gov.nih.nci.iso21090.extensions.Id> id;

        /**
         * Gets the value of the id property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the id property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link gov.nih.nci.iso21090.extensions.Id }
         * 
         * 
         */
        public List<gov.nih.nci.iso21090.extensions.Id> getId() {
            if (id == null) {
                id = new ArrayList<gov.nih.nci.iso21090.extensions.Id>();
            }
            return this.id;
        }

        public GetByIdsRequest.Id withId(gov.nih.nci.iso21090.extensions.Id... values) {
            if (values!= null) {
                for (gov.nih.nci.iso21090.extensions.Id value: values) {
                    getId().add(value);
                }
            }
            return this;
        }

        public GetByIdsRequest.Id withId(Collection<gov.nih.nci.iso21090.extensions.Id> values) {
            if (values!= null) {
                getId().addAll(values);
            }
            return this;
        }

    }

}
