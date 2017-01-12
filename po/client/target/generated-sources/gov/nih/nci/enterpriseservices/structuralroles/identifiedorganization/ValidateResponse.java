
package gov.nih.nci.enterpriseservices.structuralroles.identifiedorganization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.StringMap;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}StringMap"/>
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
    "stringMap"
})
@XmlRootElement(name = "ValidateResponse")
public class ValidateResponse {

    @XmlElement(name = "StringMap", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected StringMap stringMap;

    /**
     * Gets the value of the stringMap property.
     * 
     * @return
     *     possible object is
     *     {@link StringMap }
     *     
     */
    public StringMap getStringMap() {
        return stringMap;
    }

    /**
     * Sets the value of the stringMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMap }
     *     
     */
    public void setStringMap(StringMap value) {
        this.stringMap = value;
    }

}
