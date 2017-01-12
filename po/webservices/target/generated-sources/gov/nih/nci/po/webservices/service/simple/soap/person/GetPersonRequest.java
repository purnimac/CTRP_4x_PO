
package gov.nih.nci.po.webservices.service.simple.soap.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="personID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "personID"
})
@XmlRootElement(name = "getPersonRequest")
public class GetPersonRequest {

    protected long personID;

    /**
     * Gets the value of the personID property.
     * 
     */
    public long getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     */
    public void setPersonID(long value) {
        this.personID = value;
    }

}
