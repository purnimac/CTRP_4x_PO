
package gov.nih.nci.po.webservices.service.simple.soap.family;

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
 *         &lt;element name="familyMemberId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "familyMemberId"
})
@XmlRootElement(name = "getFamilyMemberRequest")
public class GetFamilyMemberRequest {

    protected long familyMemberId;

    /**
     * Gets the value of the familyMemberId property.
     * 
     */
    public long getFamilyMemberId() {
        return familyMemberId;
    }

    /**
     * Sets the value of the familyMemberId property.
     * 
     */
    public void setFamilyMemberId(long value) {
        this.familyMemberId = value;
    }

}
