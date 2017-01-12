
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Oversight Committee role
 * 
 * <p>Java class for OversightCommittee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OversightCommittee">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}OrganizationRole">
 *       &lt;sequence>
 *         &lt;element name="type" type="{gov.nih.nci.po.webservices.types}OversightCommitteeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OversightCommittee", propOrder = {
    "type"
})
public class OversightCommittee
    extends OrganizationRole
{

    @XmlElement(required = true)
    protected OversightCommitteeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OversightCommitteeType }
     *     
     */
    public OversightCommitteeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversightCommitteeType }
     *     
     */
    public void setType(OversightCommitteeType value) {
        this.type = value;
    }

}
