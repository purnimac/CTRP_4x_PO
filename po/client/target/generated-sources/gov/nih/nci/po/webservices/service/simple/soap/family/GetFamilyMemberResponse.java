
package gov.nih.nci.po.webservices.service.simple.soap.family;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.FamilyMember;


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
 *         &lt;element name="familyMember" type="{gov.nih.nci.po.webservices.types}FamilyMember" minOccurs="0"/>
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
    "familyMember"
})
@XmlRootElement(name = "getFamilyMemberResponse")
public class GetFamilyMemberResponse {

    protected FamilyMember familyMember;

    /**
     * Gets the value of the familyMember property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyMember }
     *     
     */
    public FamilyMember getFamilyMember() {
        return familyMember;
    }

    /**
     * Sets the value of the familyMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyMember }
     *     
     */
    public void setFamilyMember(FamilyMember value) {
        this.familyMember = value;
    }

}
