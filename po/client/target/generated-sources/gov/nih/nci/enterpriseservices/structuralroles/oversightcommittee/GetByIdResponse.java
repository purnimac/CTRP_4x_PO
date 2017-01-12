
package gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.OversightCommittee;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OversightCommittee"/>
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
    "oversightCommittee"
})
@XmlRootElement(name = "GetByIdResponse")
public class GetByIdResponse {

    @XmlElement(name = "OversightCommittee", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected OversightCommittee oversightCommittee;

    /**
     * Gets the value of the oversightCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link OversightCommittee }
     *     
     */
    public OversightCommittee getOversightCommittee() {
        return oversightCommittee;
    }

    /**
     * Sets the value of the oversightCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversightCommittee }
     *     
     */
    public void setOversightCommittee(OversightCommittee value) {
        this.oversightCommittee = value;
    }

}
