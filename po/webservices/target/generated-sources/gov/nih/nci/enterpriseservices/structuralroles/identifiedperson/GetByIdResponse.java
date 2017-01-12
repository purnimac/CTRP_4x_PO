
package gov.nih.nci.enterpriseservices.structuralroles.identifiedperson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.IdentifiedPerson;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedPerson"/>
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
    "identifiedPerson"
})
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "IdentifiedPerson", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected IdentifiedPerson identifiedPerson;

    /**
     * Gets the value of the identifiedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedPerson }
     *     
     */
    public IdentifiedPerson getIdentifiedPerson() {
        return identifiedPerson;
    }

    /**
     * Sets the value of the identifiedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedPerson }
     *     
     */
    public void setIdentifiedPerson(IdentifiedPerson value) {
        this.identifiedPerson = value;
    }

    public GetByIdResponse withIdentifiedPerson(IdentifiedPerson value) {
        setIdentifiedPerson(value);
        return this;
    }

}
