
package gov.nih.nci.po.webservices.service.simple.soap.organization;

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
 *         &lt;element name="ctepID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ctepID"
})
@XmlRootElement(name = "getOrganizationRolesByCtepIdRequest")
public class GetOrganizationRolesByCtepIdRequest {

    @XmlElement(required = true)
    protected String ctepID;

    /**
     * Gets the value of the ctepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtepID() {
        return ctepID;
    }

    /**
     * Sets the value of the ctepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtepID(String value) {
        this.ctepID = value;
    }

}
