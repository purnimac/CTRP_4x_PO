
package gov.nih.nci.po.webservices.service.simple.soap.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.PersonSearchCriteria;


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
 *         &lt;element name="personSearchCriteria" type="{gov.nih.nci.po.webservices.types}PersonSearchCriteria"/>
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
    "personSearchCriteria"
})
@XmlRootElement(name = "searchPersonsRequest")
public class SearchPersonsRequest {

    @XmlElement(required = true)
    protected PersonSearchCriteria personSearchCriteria;

    /**
     * Gets the value of the personSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSearchCriteria }
     *     
     */
    public PersonSearchCriteria getPersonSearchCriteria() {
        return personSearchCriteria;
    }

    /**
     * Sets the value of the personSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSearchCriteria }
     *     
     */
    public void setPersonSearchCriteria(PersonSearchCriteria value) {
        this.personSearchCriteria = value;
    }

}
